package exe3;
public class Produto {
    public int id, qtd;
    public String descricao;
    public float preco;
    public Produto(){
        this.id = 0;
        this.qtd = 0;
        this.descricao = "Sem descrição";
        this.preco = 0.0f;
    }
    public Produto(int id, int qtd, String descricao, float preco) {
        this.id = id;
        this.qtd = qtd;
        this.descricao = descricao;
        this.preco = preco;
    }

    public void comprar(int x){

    }
}
