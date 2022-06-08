/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avalicao_juliana;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class Banco_dados {
    
    List<Professor>ListaProfessor=new ArrayList<>();
    List<Aluno>ListaAluno=new ArrayList<>();
    
    public void buscarProfessor(){
        for(Professor p:ListaProfessor){
            System.out.println("O "+p.getNome().toString()+" Professor esta na turma: "+p.getTurma().toString());
        }
        
       
    }
    
     public void buscarAluno(){
            for( Aluno a:ListaAluno){
                System.out.println("O Aluno "+a.getNome().toString()+"da turma: "+ a.getProfessor().getTurma().toString()+ "Com o professor "+a.getProfessor().getNome().toString());
            }
        }
        
          public void CadastrarProfessor(String nome, String turma){
              Professor p = new Professor(nome, turma);
          this.ListaProfessor.add(p);
    
          }       
          public void CadastrarAluno(String nome, Professor professor){
              Aluno a = new Aluno(nome, professor);
           this.ListaAluno.add(a);
           
          }
         public void ValidarTurma(String turma, String Aluno){
             for(Professor p:ListaProfessor){
                 if(turma.equals(p.getTurma().toString())){
                     this.CadastrarAluno(Aluno, p);
                     System.out.println("Deu certo!");
                 }
             }
             
         }
         
}

