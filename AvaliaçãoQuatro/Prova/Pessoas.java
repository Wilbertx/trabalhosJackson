import java.util.Objects;
import java.sql.Date;

public class Pessoas {

   private String id;
   private String nome;
   private String cpf;
   private Date dataNascimento;

    protected Pessoas(
        String id,
        String nome,
        String cpf,
        Date dataNascimento
    ) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    protected Pessoas(
        String nome,
        String cpf,
        Date dataNascimento
    ) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

        public Date getDataNascimento() {
        return this.dataNascimento;
    }

    @Override
        public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pessoas)) {
            return false;
        }
        Pessoas cpf = (Pessoas) o;
        return Objects.equals(this.getCpf(), cpf.getCpf());
    }

    @Override
    public String toString() {
        return "{" +
            " Id ='" + getId() + "'" +
            ", Nome ='" + getNome() + "'" +
            ", Cpf ='" + getCpf() + "'" +
            ", Data de Nascimento ='" + getDataNascimento() + "'" +
            "}";
    }

}
