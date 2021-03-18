package freshco;

import java.util.Scanner;

public class CadastroFormaPagamento {
    String nomeTitula;
    int numeroCartao;
    Data validade;
    int codSeguranca;
    Scanner leitura = new Scanner(System.in);

    public CadastroFormaPagamento(String nomeTitula, int numeroCartao, Data validade, int codSeguranca) {
        this.nomeTitula = nomeTitula;
        this.numeroCartao = numeroCartao;
        this.validade = validade;
        this.codSeguranca = codSeguranca;
    }
    

    public String getNomeTitula() {
        return nomeTitula;
    }

    public void setNomeTitula(String nomeTitula) {
        this.nomeTitula = nomeTitula;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public Data getValidade() {
        return validade;
    }

    public void setValidade(Data validade) {
        this.validade = validade;
    }

    public int getCodSeguranca() {
        return codSeguranca;
    }

    public void setCodSeguranca(int codSeguranca) {
        this.codSeguranca = codSeguranca;
    }
    
    public void editarFormaPagamento(){
        System.out.println("Editar Nome do Titular");
        nomeTitula = leitura.nextLine();;
        System.out.println("Editar numero do cartão");
        numeroCartao = leitura.nextInt();
        System.out.println("Editar Validade");
        validade.adicionarData(leitura.nextInt(),leitura.nextInt(),leitura.nextInt());
        System.out.println("Editar Codigo de segurança");
        codSeguranca = leitura.nextInt();  
    }
}
