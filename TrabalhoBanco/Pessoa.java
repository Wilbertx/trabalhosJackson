package TrabalhoBanco;

public class Pessoa {

    private String nome;
    private String cpf;
    private String dtnasc;

    public Pessoa( 
        String nome,
        String cpf,
        String dtnasc
    ) {
        this.nome = nome;
        this.cpf = cpf;
        this.dtnasc = dtnasc;

    }

    public void setDtnasc(String dtnasc) {
        this.dtnasc = dtnasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getDtnasc() {
        return this.dtnasc;
    }

}

