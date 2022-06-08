/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avalicao_juliana;
/**
 *
 * @author lucas
 */
public class Aluno {
    
    private String nome;
    private Professor professor;
    
    public Aluno(String nome, Professor professor){
        this.nome=nome;
        this.professor=professor;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", professor=" + professor + '}';
    }

    
   
    }

  

    
    
    
    
}

