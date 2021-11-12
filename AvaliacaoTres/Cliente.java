package AvaliacaoTres;

import java.util.Objects;
import java.util.ArrayList;

    public class Cliente extends Pessoas{
    
    private String telefone;

    private ArrayList<Receita> receitas = new ArrayList<>();

    public Cliente(String id, String nome, String cpf, String dataNascimento, String telefone){
    super(id, nome, cpf, dataNascimento);
    this.telefone = telefone;
    
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setCliente(Receita receita) {
        this.receitas.add(receita);
    }

    public ArrayList<Receita> getReceita() {
        return this.receitas;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cliente)) {
            return false;
        }
        Cliente cliente = (Cliente) o;
        return Objects.equals(this.getCpf(), cliente.getCpf());
    }

    @Override
    public String toString() {
        return "{" +
            " Id ='" + getId() + "'" +
            ", Nome ='" + getNome() + "'" +
            ", Cpf ='" + getCpf() + "'" +
            ", Data de Nascimento ='" + getDataNascimento() + "'" +
            ", Telefone ='" + getTelefone() + "'" +
            "}";
    }

    public void adicionarReceita(Receita receitas) {
        this.receitas.add(receitas);
        receitas.adicionarCliente(this);
    }

}