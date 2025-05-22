package exe1;

public class Aluno {
    public int numeroAluno, idade;
    public String nome;
    public float p1, p2;

    // Construtor
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2){
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    // Metodo para calcular a nota final
    public float notaFinal (){
        return (p1 + p2) / 2;
    }

    // Metodo para pegar os dados dos alunos
    public String dadosAluno (){
        return "Numero: " + numeroAluno + ", nome: " + nome + ", idade: " + idade;
    }

    // Metodo para ver se o aluno passou ou nao
    public boolean passou (){
        return notaFinal() >= 6;
    }
}
