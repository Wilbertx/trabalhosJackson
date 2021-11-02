public class Medico extends Pessoa {
 
    private String crm;
    protected String carteira;
    private String estado;

    public Medico( 
        String nome,
        String cpf,
        String dtnasc,
        String carteira,
        String crm,
        String estado
    ) {
        super(nome, cpf, dtnasc, carteira);
        this.crm = crm;
        this.estado = estado;
    }
 
    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCrm() {
        return this.crm;
    }
    
    public String getEstado() {
        return this.estado;
    }

    @Override
    public String toString() {
        return "\n\tPaciente "
            + "\n\nNome = " + this.getNome()
            + "\nCpf = " + this.getCpf()
            + "\nDtnasc = " + this.getDtnasc();
            + "\n\nCarteira = " + this.getCarteira()
            + "\nEstado = " + this.getEstado()
            + "\nCrm = " + this.getCrm()
    }
}