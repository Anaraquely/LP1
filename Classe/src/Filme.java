
public class Filme {
    double duração;
    String nome;
    int lançamento;

    public Filme() {
    }

    public void Filme(double duração, String nome, int lançamento) {
        this.duração = duração;
        this.nome = nome;
        this.lançamento = lançamento;
    }

    void ano(int lançamento) {
        if (lançamento <= 1990) {
            System.out.println("Este filme é antigo.");
        } else if (lançamento >= 1991) {
            System.out.println("Este filme é atual");
        }

    }

    void longo(double duração) {
        if (duração >= 190.0) {
            System.out.println("Este filme é longo.");
        } else if (duração <= 189.0) {
            System.out.println("Este filme é curto.");
        }

    }

    void titulo(String nome) {
        if (this.getNome().equals(nome)) {
        }

    }

    void fichaTecnica() {
        System.out.println("Nome do filme: " + this.nome);
        System.out.println("Duração: " + this.duração);
        System.out.println("Ano de lançamento: " + this.lançamento);
    }

    String getNome() {
        return this.nome;
    }
}

