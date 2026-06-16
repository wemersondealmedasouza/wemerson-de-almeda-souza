package modelo;

public class Aluno extends Pessoa implements Autenticavel {

    private String curso;
    private int periodo;

    public Aluno(String nome, String cpf, String curso, int periodo) {
        super(nome, cpf);
        this.curso = curso;
        this.periodo = periodo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    @Override
    public void mostrarDados() {
        System.out.println("=== ALUNO ===");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Curso: " + curso);
        System.out.println("Período: " + periodo);
    }

    @Override
    public void login() {
        System.out.println("Aluno " + getNome() + " acessou o sistema acadêmico.");
    }

    public void estudar() {
        System.out.println(getNome() + " está estudando.");
    }
}
