package exe4;

public class TestaRio {
    public static void main(String[] args){
        Rio r1 = new Rio("Amazonas", 5.0f, true);
        Rio r2 = new Rio();

        r1.chover(1.5f);
        r1.ensolarar(2.0f);
        r1.limpar();
        r1.mostra();

        r2.chover(10.0f);
        r2.ensolarar(5.0f);
        r2.sujar();
        r2.mostra();
    }
}
