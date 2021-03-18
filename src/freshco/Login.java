package freshco;

import java.util.Scanner;

public class Login {

    String email;
    String senha;
    String lixo;
    int i = 0;
    Scanner leitura = new Scanner(System.in);

    public void cadastroUsuario() {
        while (i == 0) {
            System.out.println("Digite seu usuario");
            email = leitura.nextLine();
            System.out.println("Digite sua senha");
            senha = leitura.nextLine();
            System.out.println("Confirmar senha");
            if (senha == leitura.nextLine()) {
                System.out.println("Conta Valida");
                i = 1;
                Usuario atual = new Usuario(email, senha);
            } else {
                System.out.println("As senhas sao diferentes");
            }
        }
    }
    
    public void fazerLogin(){
        //Necessita Banco de Dados e sevidor
    }
    
    public void chat(){
        //Necessita servidor e interface
    }
    
    public void fazerLogayt(){
        //Necessita servidor e interface
    }
    
    public void RecuperarSenha(){
        //Necessita Banco de Dados e sevidor
    }
}
