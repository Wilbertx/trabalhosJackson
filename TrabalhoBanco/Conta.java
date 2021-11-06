package TrabalhoBanco;

public class Conta {
    String agencia;
    String conta;
    double saida;
    double entrada;
    double saldo;

public Conta(
    String agencia,
    String conta,
    double saldo,
    double saida,
    double entrada
)   {
    this.agencia = agencia;
    this.conta = conta;
    this.saida = saida;
    this.entrada = entrada;
    this.saldo = saldo;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public void setSaida(Double saida) {
        this.saida = saida;
    }

    public void setEntrada(Double entrada) {
        this.entrada = entrada;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public String getConta() {
        return this.conta;
    }

    public Double getSaida() {
        return this.saida;
    }

    public Double getEntrada() {
        return this.entrada;
    }

    public double getSaldo() {
        return this.saldo;
    }


    @Override
    public String toString() {
        return "\n\tPaciente "
            + "\n\nNome = " + this.getAgencia()
            + "\nCpf = " + this.getConta()
            + "\nDtnasc = " + this.getSaida()
            + "\n\nCarteira = " + this.getEntrada();
    }
}




