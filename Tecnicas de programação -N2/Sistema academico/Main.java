import modelo.Aluno;
import modelo.Professor;
import sistema.Secretaria;

public class Main {

    public static void main(String[] args) {

        // Criando objetos
        Aluno aluno = new Aluno("João", "123456789", "Ciência da Computação", 3);
        Professor professor = new Professor("Maria", "987654321", "Técnicas de Programação", "Mestre");
        Secretaria secretaria = new Secretaria();

        // Login
        System.out.println("=== LOGIN ===");
        aluno.login();
        professor.login();
        System.out.println();

        // Mostrar dados
        System.out.println("=== DADOS ===");
        aluno.mostrarDados();
        System.out.println();
        professor.mostrarDados();
        System.out.println();

        // Métodos específicos
        System.out.println("=== ATIVIDADES ===");
        aluno.estudar();
        professor.ministrarAula();
        System.out.println();

        // Cadastro na Secretaria
        System.out.println("=== CADASTRO ===");
        secretaria.cadastrarPessoa(aluno);
        secretaria.cadastrarPessoa(professor);
        System.out.println();

        // Listagem
        System.out.println("=== LISTAGEM DE PESSOAS CADASTRADAS ===");
        secretaria.listarPessoas();
    }
}
