public class Pessoa {

    private String nome;
    private String cpf;
    private String dtnasc;
    protected String carteira;

    public Pessoa( 
        String nome,
        String cpf,
        String dtnasc,
        String carteira
    ) {
        this.nome = nome;
        this.cpf = Cpf;
        this.dtnasc = dtnasc;
        this.carteira = carteira;
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

    public String getCarteira() {
        return this.ladoDois;
    }

    public void setDtnasc(double dtnasc) {
        this.dtnasc = dtnasc;
    }

    public void setladoDois(double carteira) {
        this.carteira = carteira;
    }
}
