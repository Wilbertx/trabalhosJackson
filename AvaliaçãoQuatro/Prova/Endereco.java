import java.util.Objects;

public class Endereco {

    private String idendereco;
    private String cep;
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    protected Estabelecimento estabelecimento;

    public Endereco(String idendereco, String cep, String rua, int numero, String bairro, String cidade, Estabelecimento estabelecimento) {
        this.idendereco = idendereco;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public void setIdendereco(String idendereco) {
        this.idendereco = idendereco;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public String getIdendereco() {
        return this.idendereco;
    }

    public String getCep() {
        return this.cep;
    }

    public String getRua() {
        return this.rua;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getCidade() {
        return this.cidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Endereco)) {
            return false;
        }
        Endereco endereco = (Endereco) o;
        return Objects.equals(this.getIdendereco(), endereco.getIdendereco());
    }

    @Override
    public String toString() {
        return "{" +
            " Cep ='" + getCep() + "'" +
            ", Rua ='" + getRua() + "'" +
            ", Numero ='" + getNumero() + "'" +
            ", Bairro ='" + getBairro() + "'" +
            ", Cidade ='" + getCidade() + "'" +
            "}";
    }

}
