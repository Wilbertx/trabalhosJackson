import java.util.Objects;
import java.util.ArrayList;

public class Receita {
    
    private String idReceita;
    private String nome;
    private String etapas;
    private int numEtapas;
    private double valor;

    private ArrayList<Cliente> cliente = new ArrayList<>();
    private ArrayList<Padaria> padaria = new ArrayList<>();
    private ArrayList<Mercados> mercados = new ArrayList<>();

    public Receita(String idReceita, String nome, String etapas, int numEtapas, double valor) {
        this.idReceita = idReceita;
        this.nome = nome;
        this.etapas = etapas;
        this.numEtapas = numEtapas;
        this.valor = valor;
    }

    public void setId(String idReceita) {
        this.idReceita = idReceita;
    }  

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEtapas(String etapas) {
        this.etapas = etapas;
    }

    public void setnumEtapas(int numEtapas) {
        this.numEtapas = numEtapas;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setPadaria(Padaria padaria) {
        this.padaria.add(padaria);
    }

    public void setMercado(Mercados mercados) {
        this.mercados.add(mercados);
    }

    public void setCliente(Cliente cliente) {
        this.cliente.add(cliente);
    }

    public String getidReceita() {
        return this.idReceita;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEtapas() {
        return this.etapas;
    }

    public int getNumEtapas() {
        return this.numEtapas;
    }

    public double getValor() {
        return this.valor;
    }

    public ArrayList<Padaria> getPadaria() {
        return this.padaria;
    }

    public ArrayList<Mercados> getMercados() {
        return this.mercados;
    }

    public ArrayList<Cliente> getCliente() {
        return this.cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Receita)) {
            return false;
        }
        Receita receita = (Receita) o;
        return Objects.equals(this.getidReceita(), receita.getidReceita());
    }

    @Override
    public String toString() {
        return "{" +
            " Id Receita ='" + getidReceita() + "'" +
            ", Nome ='" + getNome() + "'" +
            ", Etapas ='" + getEtapas() + "'" +
            ", Numero de Etapas ='" + getNumEtapas() + "'" +
            ", Valor =' R$ " + getValor() + "'" +
            "}";
    }

    public void adicionarCliente(Cliente cliente) {
        this.cliente.add(cliente);
    }

    public void adicionarMercados(Mercados mercados) {
        this.mercados.add(mercados);
    }

    public void adicionarPadaria(Padaria padaria) {
        this.padaria.add(padaria);
    }

}
