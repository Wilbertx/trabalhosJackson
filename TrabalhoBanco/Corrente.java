package TrabalhoBanco;

public class Corrente extends Conta{

    private String historico;

    public Corrente(

        String agencia,
        String conta,
        double saldo,
        double saida,
        double entrada,
        String historico

    )   {
        super(agencia, conta, saldo, entrada, saida);
        this.historico = historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getHistorico() {
        return this.historico;
    }


    @Override
    public String toString() {
        return "\n\tPaciente "
            + "\n\nNome = " + this.getAgencia()
            + "\nCpf = " + this.getConta()
            + "\nDtnasc = " + this.getSaida()
            + "\n\nCarteira = " + this.getEntrada()
            + "\n\nHistorico = " + this.getHistorico();
    }

    
}
