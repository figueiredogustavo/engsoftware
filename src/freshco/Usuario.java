package freshco;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {

    String nomeCompleto;
    int CPF;
    Data dataNascimento;
    String email;
    String senha;
    Scanner leitura = new Scanner(System.in);
    ArrayList<Carrinho> pedidos = new ArrayList();

    public Usuario(String email, String senha) {
        this.nomeCompleto = null;
        this.CPF = 0;
        this.dataNascimento = null;
        this.email = email;
        this.senha = senha;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void editarCadastro() {
        System.out.println("Editar Nome");
        nomeCompleto = leitura.nextLine();;
        System.out.println("Editar Cpf");
        CPF = leitura.nextInt();
        System.out.println("Editar Data");
        dataNascimento.adicionarData(leitura.nextInt(), leitura.nextInt(), leitura.nextInt());
        System.out.println("Editar Email");
        email = leitura.nextLine();
    }

    public void editarSenha() {
        System.out.println("Digite a nova senha");
        senha = leitura.nextLine();
    }

    public int sairConta() {
        return 0;
    }

    public void cadastrarEndereco() {
        System.out.println("Digite o CEP");
        int cep = leitura.nextInt();
        System.out.println("Digite a Rua");
        String rua = leitura.nextLine();
        System.out.println("Digite o numero da Casa");
        int numero = leitura.nextInt();
        System.out.println("Digite o Complemento");
        String complemento = leitura.nextLine();
        System.out.println("Digite a Cidade");
        String cidade = leitura.nextLine();
        System.out.println("Digite o Estado");
        String estado = leitura.nextLine();
        CadastroEndereço endereco = new CadastroEndereço(cep, rua, numero, complemento, cidade, estado);
    }

    public void cadastrarFormaPagamento() {
        System.out.println("Digite o nome Titular");
        String nomeTitula = leitura.nextLine();
        System.out.println("Digite o numero do Cartao");
        int numeroCartao = leitura.nextInt();
        System.out.println("Digite a Validade");
        Data validade = new Data(leitura.nextInt(),leitura.nextInt(),leitura.nextInt());
        System.out.println("Digite o Codigo de Seguranca");
        int codSeguranca = leitura.nextInt();
        CadastroFormaPagamento pagamento = new CadastroFormaPagamento(nomeTitula , numeroCartao, validade, codSeguranca);
    }
}
