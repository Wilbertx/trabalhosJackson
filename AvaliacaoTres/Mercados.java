package AvaliacaoTres;

import java.util.Objects;
import java.util.ArrayList;

public class Mercados extends Estabelecimento{

   private String promocao;

   private ArrayList<Receita> receitas = new ArrayList<>();

    public Mercados(String id, String nome, String dataAbertura, String idEndereco, String cep, String rua, int numero, String bairro, String cidade, String promocao){
        
        super(id, nome, dataAbertura, idEndereco, cep, rua, numero, bairro, cidade);
        this.promocao = promocao;
    }
    
        public void setPromocao(String promocao) {
            this.promocao = promocao;
    }

        public String getPromocao() {
            return this.promocao;
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
            ", Horario ='" + getPromocao() + "'" +
            "}";
    }

    public void adicionarReceita(Receita receitas) {
        this.receitas.add(receitas);
        receitas.adicionarMercados(this);
    }

}
