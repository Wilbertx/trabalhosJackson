public class Consulta extends Pessoa {
 
    private String data;
    private String atendimento;
    protected String registro;

    public Consulta( 
        String nome,
        String cpf,
        String dtnasc,
        String atendimento,
        String data,
        String registro
    ) {
        super(nome, cpf, dtnasc, carteira);
        this.atendimento = atendimento;
        this.data = data;
        this.registro = registro;
    }
 
    public void setAtendimento(String atendimento) {
        this.atendimento = atendimento;
    }
    
    public void setData(String data) {
        this.data = data;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getAtendimento() {
        return this.atendimento;
    }
    
    public String getData() {
        return this.data;
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
            + "\nEstado = " + this.getEstado()
            + "\nCrm = " + this.getCrm()
    }
}