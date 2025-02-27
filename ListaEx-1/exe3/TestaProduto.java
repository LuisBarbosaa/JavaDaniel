package exe3;

public class TestaProduto {
    public static void main(String[] args) {
        Produto prod1 = new Produto(10, 12, "Camiseta", 12.90f);
        Produto prod2 = new Produto();

        prod1.comprar(5);
        prod1.vender(2);
        prod1.subir(3);
        prod1.descer(1);
        prod1.mostra();

        prod2.comprar(3);
        prod2.vender(4);
        prod2.subir(4);
        prod2.descer(1);
        prod2.mostra();
    }
}
