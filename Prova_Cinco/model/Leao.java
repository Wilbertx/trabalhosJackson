package model;

import java.sql.Date;

public class Leao extends Animal {
    private Date data;
    private String detalhes;
    private String descricao;
    private int visitantes;
    Alimentacao alimentacao;
    Jaula jaula;

    public Leao (int id, String nome, int alimentacao, int visitantes, int jaula_id, String descricao) {
        super(id, nome);
    }

    public Leao (int id, String nome, int visitantes, Alimentacao alimentacao, Jaula jaula) {
        super(id, nome);
        this.alimentacao = new Alimentacao(id, data, detalhes);
        this.jaula = new Jaula(id, descricao);
    }

    public void setVisitantes(int visitantes) {
        this.visitantes = visitantes;
    }

    public int getVisitantes() {
        return visitantes;
    }

    public void setAlimentacao(Alimentacao alimentacao) {
        this.alimentacao = alimentacao;
    }

    public Alimentacao getAlimentacao() {
        return alimentacao;
    }

    public void setJaula(Jaula jaula) {
        this.jaula = jaula;
    }

    public Jaula getJaula() {
        return jaula;
    }

    @Override
    public String toString() {
        return "Leao [ID=" + getId() + ", nome=" + getNome() + ", alimentação=" + getAlimentacao() + ", visitantes=" + getVisitantes() + "]";
    }
}