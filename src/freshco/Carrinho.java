package freshco;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrinho {
    String cuponsValidos;
    ArrayList<Produtos> p = new ArrayList();
    Scanner leitura = new Scanner(System.in);

    public Carrinho() {
        this.cuponsValidos = "Descosnto 10%";
    }
    
    public void adicionarCarrinho(){
        Produtos produto = new Produtos();
        p.add(produto);
    }
    
    public void removerCarrinho(){
        Produtos produtor = new Produtos();
        p.remove(produtor);
    }
    
    public void listarProduto(){
        //Necessita Banco de dados
    }
    
    public void compartilharCarrinho(){
        //Necessita Servidor e interface
    }
    
    public void finalizarPedido(){
        //Necessita Servidor e interface
    }
    
    public void salvarCarrinho(){
        //Necessita Banco de Dados
    }
    
    public void aplicarCupom(){
        System.out.println("Digite o id");
        int i = leitura.nextInt();
        Produtos desconto = p.get(i);
        int d = desconto.getValor();
        //Necessita Banco de Dados
    }

    public void acompanharPedido(){
        //Necessita Servidor e interface
    }
    
    public void chat(){
        //Necessita Servidor e interface
    }
    
}
