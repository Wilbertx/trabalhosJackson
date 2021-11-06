package TrabalhoBanco;

public class Investimento extends Conta{

    private String carteira;

    public Investimento(

        String agencia,
        String conta,
        double saldo,
        double saida,
        double entrada,
        String carteira

    )   {
        super(agencia, conta, saldo, saida, entrada);
        this.carteira = carteira;
    }

    public void setCarteira(String carteira) {
        this.carteira = carteira;
    }

    public String getCarteira() {
        return this.carteira;
    }
}
