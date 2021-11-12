package AvaliacaoTres;

import java.util.Objects;
import java.util.ArrayList;

public class Padaria extends Estabelecimento{

    private String horario;

    private ArrayList<Receita> receitas = new ArrayList<>();

    public Padaria(String id, String nome, String dataAbertura, String idEndereco, String cep, String rua, int numero, String bairro, String cidade, String horario){
        
        super(id, nome, dataAbertura, idEndereco, cep, rua, numero, bairro, cidade);
        this.horario = horario;
    }

    public void setHorario(String horario) {
            this.horario = horario;
    }
    
    public String getHorario() {
            return this.horario;
    }

    public void setReceita(Receita receita) {
        this.receitas.add(receita);
    }

    public ArrayList<Receita> getReceita() {
        return this.receitas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Padaria)) {
            return false;
        }
        Padaria padaria = (Padaria) o;
        return Objects.equals(this.getId(), padaria.getId());
    }

    @Override
    public String toString() {
        return "{" +
            " Id ='" + getId() + "'" +
            ", Nome ='" + getNome() + "'" +
            ", Data de Abertura ='" + getdataAbertura() + "'" +
            ", Endereço ='" + getEndereco() + "'" +
            ", Horario ='" + getHorario() + "'" +
            "}";
    }

    public void adicionarReceita(Receita receitas) {
        this.receitas.add(receitas);
        receitas.adicionarPadaria(this);
    }
    
}
