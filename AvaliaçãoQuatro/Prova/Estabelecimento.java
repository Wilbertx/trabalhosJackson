import java.util.Objects;

public class Estabelecimento {
    
   private String id;
   private String nome;
   private String dataAbertura;
   private Endereco endereco;

protected Estabelecimento(String id, String nome, String dataAbertura, String idEndereco, String cep, String rua, int numero, String bairro, String cidade) {
        this.id = id;
        this.nome = nome;
        this.dataAbertura = dataAbertura;
        this.endereco = new Endereco(
            idEndereco,
            cep,
            rua,
            numero,
            bairro,
            cidade,
             this
        );
    }

    public void setId(String id) {
            this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setdataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public String getId() {
        return this.id;
    }
    public String getNome() {
        return this.nome;
    }
    public String getdataAbertura() {
        return this.dataAbertura;
    }
    public Endereco getEndereco() {
        return this.endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Mercados)) {
            return false;
        }
        Mercados mercado = (Mercados) o;
        return Objects.equals(this.getId(), mercado.getId());
    }

    @Override
    public String toString() {
        return "{" +
            " Id ='" + getId() + "'" +
            ", Nome ='" + getNome() + "'" +
            ", Data de Abertura ='" + getdataAbertura() + "'" +
            ", Endereço ='" + getEndereco() + "'" +
            "}";
    }   

}