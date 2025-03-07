public class Aluno {
    private String nomeAluno;
    private double nota;
    private String matricula;

    public Aluno(String nomeAluno, String matricula, int nota) {
        this.nomeAluno = nomeAluno;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public double getNota() {
        return nota;
    }

    public String getMatricula() {
        return matricula;
    }

    public String dadosAluno() {
        return nomeAluno + " " + nota + " " + matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nomeAluno='" + nomeAluno + '\'' +
                ", nota=" + nota +
                ", matricula=" + matricula +
                '}';
    }
}
