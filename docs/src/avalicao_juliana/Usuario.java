/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avalicao_juliana;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Usuario {

    Scanner sc = new Scanner(System.in);
    private String senha1, senha2;
    private String login = "Professor";
    private String senha = "1234";
    int erroSeguido = 0;
    List senhaAnterior = new ArrayList();
    int position = 0;
    Apresentacao ap = new Apresentacao();

    public boolean validarSenha(String senha, String login) {
        if (this.senha.equals(senha) && this.login.equals(login)) {
            return true;
        } else {
            erroSeguido += 1;
            return false;
        }

    }

    public void chamadaCadastroSenhaNova(boolean validar) {
        if (validar == true) {
            System.out.println("----------");
            System.out.println("Correto ");
            ap.TextGeral();
            String novaSenha = sc.nextLine();
            cadastroSenha(this.login, senha);
        } else if (erroSeguido == 3) {
            System.out.print("Digite uma nova senha: ");
            String senhaNova = sc.nextLine();
            cadastroSenha(this.login, senhaNova);
        }
    }

    public void cadastroSenha(String login, String senha) {
        this.login = login;
        this.senha = senha;
        senhaAnterior.add(senha);
        System.out.println("Nova senha cadastrada");
        erroSeguido = 0;
    }

}
