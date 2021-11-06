package TrabalhoBanco;

public class Gerente extends Pessoa {
 
    private String cargo;
 
    public Gerente(
        String nome,
        String cpf,
        String dtnasc,
        String cargo
    ) {
        super(nome, cpf, dtnasc);
        this.cargo = cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getCargo() {
        return this.cargo;
    }
    @Override
    public String toString() {
        return "\n\tGerente "
            + "\n\nNome: " + this.getNome()
            + "\nCPF: " + this.getCpf()
            + "\nData de Nascimento: " + this.getDtnasc()
            + "\n Cargo: " + this.getCargo();
    }
}