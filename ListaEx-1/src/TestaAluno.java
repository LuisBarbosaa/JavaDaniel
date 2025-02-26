package src;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(101, "João", 20, 7.5f, 6.0f);

        // Exibindo os dados do aluno
        System.out.println(aluno1.dadosAluno());

        // Exibe a nota final do aluno
        System.out.println("Nota final: " + aluno1.notaFinal());

        // verifica se o aluno passou
        if(aluno1.passou()){
            System.out.println("Aluno passou!");
        } else {
            System.out.println("Aluno não passou!");
        }
    }
}
