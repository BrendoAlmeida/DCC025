public class Aluno extends Pessoa{
    private String matricula;

    public Aluno(String matricula, int CPF) {
        super(CPF);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
