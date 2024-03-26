import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void testeClass(){
        int var = new Scanner(System.in).nextInt();

        teste teste = new teste(var);

        teste.imprimeTeste();
    }

    public static void alunoTeste(){
        Aluno[] Alunos = new Aluno[]{
                new Aluno("Teste1", 123),
                new Aluno("Teste2", 321)
        };

        for (int i = 0; i < Alunos.length; i++)
            System.out.println(Alunos[i].getMatricula() + ", " + Alunos[i].getCPF());
    }

    public static void main(String[] args) throws IOException, IOException {
        alunoTeste();
    }
}