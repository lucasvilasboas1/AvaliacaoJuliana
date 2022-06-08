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
public class Professor {
    
    private String nome;
    private String turma;
    
    public Professor(String nome, String turma){
        this.nome=nome;
        this.turma=turma;
    }

    Banco_dados bda = new Banco_dados();
    
  
            
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + ", turma=" + turma + '}';
    }
   
    
   
}
