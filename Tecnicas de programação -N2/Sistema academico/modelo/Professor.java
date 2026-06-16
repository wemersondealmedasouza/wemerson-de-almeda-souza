package modelo;

public class Professor extends Pessoa implements Autenticavel {

    private String disciplina;
    private String titulacao;

    public Professor(String nome, String cpf, String disciplina, String titulacao) {
        super(nome, cpf);
        this.disciplina = disciplina;
        this.titulacao = titulacao;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public void mostrarDados() {
        System.out.println("=== PROFESSOR ===");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Titulação: " + titulacao);
    }

    @Override
    public void login() {
        System.out.println("Professor " + getNome() + " acessou o sistema acadêmico.");
    }

    public void ministrarAula() {
        System.out.println(getNome() + " está ministrando uma aula.");
    }
}
