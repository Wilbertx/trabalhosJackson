package AvaliacaoTres;

import java.util.Objects;
import java.util.ArrayList;

public class Chef extends Pessoas {

    private String id;
    private String especialidade;

    private ArrayList<Receita> receitas = new ArrayList<>();

    public Chef(String id, String nome, String cpf, String dataNascimento, String especialidade) {
        super(id, nome, cpf, dataNascimento);
        this.especialidade = especialidade;
        this.id = id;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public String getId() {
        return this.id;
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
        if (!(o instanceof Chef)) {
            return false;
        }
        Chef cpf = (Chef) o;
        return Objects.equals(this.getCpf(), cpf.getCpf());
    }

    @Override
    public String toString() {
        return "{" +
            " Id ='" + getId() + "'" +
            ", Nome ='" + getNome() + "'" +
            ", Cpf ='" + getCpf() + "'" +
            ", Data de Nascimento ='" + getDataNascimento() + "'" +
            ", Especialidade ='" + getEspecialidade() + "'" +
            "}";
    }

    public void adicionarReceita(Receita receita) {
        this.receitas.add(receita);
    }

    public void adicionarReceita(
    
        String idReceita,
        String nome,
        String etapas,
        int numEtapas,
        double valor
    ){
        Receita receita = new Receita(idReceita, nome, etapas, numEtapas, valor);
        this.receitas.add(receita);
    }  
}


    

