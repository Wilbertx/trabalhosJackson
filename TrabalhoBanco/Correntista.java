package TrabalhoBanco;

public class Correntista extends Pessoa {
    
    private String dataInicio;


    public Correntista(
     String nome,
     String cpf,
     String dtnasc,
     String dataInicio

    ){
        super(nome, cpf, dtnasc);
        this.dataInicio = dataInicio;

    }
    public void setdataInicio(String datainicio) {
        this.dataInicio = datainicio;
    
    }

    public String getdataInicio() {
        return this.dataInicio;
    }

    @Override
    public String toString() {
        return "\n\tPaciente "
            + "\n\nNome = " + this.getNome()
            + "\nCpf = " + this.getCpf()
            + "\nDtnasc = " + this.getDtnasc()
            + "\n\nData Inicio = " + this.getdataInicio();      
    }


}
