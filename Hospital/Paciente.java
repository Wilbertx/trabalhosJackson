public class Paciente extends Pessoa {
 
    private int registro;
    protected String carteira;

    public Paciente( 
        String nome,
        String cpf,
        String dtnasc,
        String carteira,
        int registro
    ) {
        super(nome, cpf, dtnasc);
        this.carteira = carteira;
        this.registro = registro;
    }
 
    public void setCarteira(String carteira) {
        this.carteira = carteira;
    }
    
    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getCarteira() {
        return this.carteira;
    }
    
    public String getRegistro() {
        return this.registro;
    }

    @Override
    public String toString() {
        return "\n\tPaciente "
            + "\n\nNome = " + this.getNome()
            + "\nCpf = " + this.getCpf()
            + "\nDtnasc = " + this.getDtnasc();
            + "\n\nCarteira = " + this.getCarteira()
            + "\nRegistro = " + this.getRegistro()
    }
}