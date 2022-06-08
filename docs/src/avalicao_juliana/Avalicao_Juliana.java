/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avalicao_juliana;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Avalicao_Juliana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        Usuario usuario = new Usuario();
        Apresentacao apre = new Apresentacao();
        Professor p1 = new Professor("Lucas", "3 ano");
        Banco_dados bda = new Banco_dados();
        bda.CadastrarProfessor("Thiago", "3 ano");
        bda.ValidarTurma("3 ano", "Ana");
        bda.buscarAluno();
        boolean Status = false; 
        Professor p2 = new Professor("Thiago", "3 ano");
        Professor p3 = new Professor("Flavia", "3 ano");
        Professor p4 = new Professor("Brenda", "3 ano");
        Professor p5 = new Professor("Luana", "3 ano");
        Professor p6 = new Professor("Lainy", "3 ano");
        Banco_dados dba = new Banco_dados();
        dba.CadastrarProfessor(p1);
        dba.CadastrarProfessor(p2);
        dba.CadastrarProfessor(p3);
        dba.CadastrarProfessor(p4);
        dba.CadastrarProfessor(p5);
        dba.CadastrarProfessor(p6);
        dba.buscarProfessor();
        Aluno a1 = new Aluno("Felisberto",p1);
        Aluno a2 = new Aluno("Ana",p2);
        Aluno a3 = new Aluno("Maria",p3);
        Aluno a4 = new Aluno("Mariana",p4);
        Aluno a5 = new Aluno("Eloa",p4);
        Aluno a6 = new Aluno("Eloisa",p3);
        dba.ListaAluno.add(a1);
        dba.ListaAluno.add(a2);
        dba.ListaAluno.add(a3);
        dba.ListaAluno.add(a4);
        dba.ListaAluno.add(a5);
        dba.ListaAluno.add(a6);
        dba.buscarAluno();
        Apresentacao ap = new Apresentacao();

       String login;
       String senha;

        while (Status == false) {
            System.out.println("Digite sua usuario");
            login = sc.nextLine();
            System.out.println("Digite sua senha");
            senha = sc.nextLine();
            usuario.chamadaCadastroSenhaNova(usuario.validarSenha(senha, login));

            System.out.println("Errou uma vez: " + usuario.erroSeguido);
   
        }
        
        
    }
        
}    

