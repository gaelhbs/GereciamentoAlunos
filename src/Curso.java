import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Curso {
    private String nomeCurso;
    List<Aluno> alunos = new ArrayList<Aluno>();
    private Scanner scanner = new Scanner(System.in);

    public Curso(String nomeCurso, List<Aluno> alunos) {
        this.nomeCurso = nomeCurso;
        this.alunos = alunos;
    }

    public void adicionarAluno() {
        System.out.println("Adicione um aluno");
        String nomeAluno = scanner.nextLine();
        System.out.println("Digite a matricula do aluno:");
        String matricula = scanner.nextLine();
        System.out.println("Digite a nota do aluno:");
        int nota = scanner.nextInt();
        scanner.nextLine();


        Aluno aluno = new Aluno(nomeAluno,matricula,nota);
        alunos.add(aluno);
        System.out.println("Aluno " + nomeAluno + " adicionado!");
    }

    public void listarAlunos() {
        if (alunos.isEmpty()){
            System.out.println("Nenhum aluno cadastrado");
        }
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public  void buscarAlunoPorMatricula() {
        System.out.println("Digite a matricula do aluno que deseja buscar:");
        int matricula = scanner.nextInt();

        if (alunos.isEmpty()){
            System.out.println("Nenhum aluno cadastrado");
        }
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)){
                System.out.println(aluno.toString());
            }
        }
    }


}

