package exe2;
public class Cliente {

    public int numeroConta, numeroAgencia;
    public String nome;
    public float saldo;

    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo){
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void realizarDeposito (float valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Deposito de " + valor + " realizado. Saldo atual: " + saldo);
        } else {
            System.out.println("Valor invalido para deposito");
        }
    }

    public void realizarSaque (float valor){
        if(valor > 0 && saldo >= valor){
            saldo -= valor;
            System.out.println("Saque de " + valor + " realidado. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor invalido");
        }
    }

    public String dadosCliente (){
        return "Nome: " + nome + " Conta: " + numeroConta + " Agencia: " + numeroAgencia + " Saldo: " + saldo;
    }
}
