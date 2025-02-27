package exe3;
public class Produto {

    public int id, qtd;
    public String descricao;
    public float preco;

    public Produto(){
        this.descricao = "Sem descrição";
    }

    public Produto(int id, int qtd, String descricao, float preco) {
        this.id = id;
        this.qtd = qtd;
        this.descricao = descricao;
        this.preco = preco;
    }

    public void comprar(int x){
        this.qtd += x;
    }

    public void vender(int x){
        if (x <= this.qtd){
            this.qtd -= x;
        } else {
            System.out.println("Estoque insuficiente");
        }
    }

    public void subir(float x){
        this.preco += x;
    }

    public void descer(float x){
        if (this.preco > 0 && this.preco - x >= 0){
            this.preco -= x;
        } else {
            System.out.println("Não foi possivel diminuir o preço do pruduto");
        }
    }

    public void mostra(){
        System.out.println("ID: " + id + "\nQuantidade: " + qtd + "\nDescrição: " + descricao + "\nPreço: " + preco);
    }
}
