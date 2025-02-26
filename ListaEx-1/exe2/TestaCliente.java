package exe2;
public class TestaCliente {
    public static void main(String[] args) {

        Cliente fulano = new Cliente(99999, 7777, "Fulano", 1000.0f);
        System.out.println(fulano.dadosCliente());
        fulano.realizarDeposito(500);
        fulano.realizarSaque(300);

        Cliente beltrano = new Cliente(88888, 5555, "Beltrano", 1500.0f);
        System.out.println(beltrano.dadosCliente());
        beltrano.realizarDeposito(1000);
        beltrano.realizarSaque(500);
    }
}
