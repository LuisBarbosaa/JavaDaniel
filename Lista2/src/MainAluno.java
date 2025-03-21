import exe2.Aluno;

public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(123456, 20, "Carlos Silva", 8.5f, 7.0f);
        aluno1.exibeAluno();

        System.out.println(aluno1.exibeAluno());
        System.out.println("Nota Final Calculada: " + aluno1.notaFinal());
    }
}
