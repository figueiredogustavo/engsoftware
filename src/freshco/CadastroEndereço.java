package freshco;

import java.util.Scanner;

public class CadastroEndereço {
    int cep;
    String rua;
    int numero;
    String complemento;
    String cidade;
    String estado;
    Scanner leitura = new Scanner(System.in);

    public CadastroEndereço(int cep, String rua, int numero, String complemento, String cidade, String estado) {
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Scanner getLeitura() {
        return leitura;
    }

    public void setLeitura(Scanner leitura) {
        this.leitura = leitura;
    }
    
    public void editarEndereço(){
        System.out.println("Digite o CEP");
        cep = leitura.nextInt();
        System.out.println("Digite a Rua");
        rua = leitura.nextLine();
        System.out.println("Digite o numero da Casa");
        numero = leitura.nextInt();
        System.out.println("Digite o Complemento");
        complemento = leitura.nextLine();
        System.out.println("Digite a Cidade");
        cidade = leitura.nextLine();
        System.out.println("Digite o Estado");
        estado = leitura.nextLine();
    }
}
