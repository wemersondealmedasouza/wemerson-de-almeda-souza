package sistema;

import modelo.Pessoa;
import java.util.ArrayList;

public class Secretaria {

    private ArrayList<Pessoa> pessoas;

    public Secretaria() {
        this.pessoas = new ArrayList<>();
    }

    public void cadastrarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
        System.out.println("Pessoa cadastrada com sucesso.");
    }

    public void listarPessoas() {
        for (Pessoa pessoa : pessoas) {
            pessoa.mostrarDados();
            System.out.println();
        }
    }
}
