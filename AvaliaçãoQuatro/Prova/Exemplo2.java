import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import java.util.Scanner;

public class Funcionario {
    
    private int id;
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String matricula;

    public Funcionario(int id, String nome, String cpf, Date dataNascimento, String matricula) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
    }

    public Funcionario(String nome, String cpf, Date dataNascimento, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Funcionario id(int id) {
        setId(id);
        return this;
    }

    public Funcionario nome(String nome) {
        setNome(nome);
        return this;
    }

    public Funcionario cpf(String cpf) {
        setCpf(cpf);
        return this;
    }

    public Funcionario dataNascimento(Date dataNascimento) {
        setDataNascimento(dataNascimento);
        return this;
    }

    public Funcionario matricula(String matricula) {
        setMatricula(matricula);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Funcionario)) {
            return false;
        }
        Funcionario funcionario = (Funcionario) o;
        return id == funcionario.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cpf, dataNascimento, matricula);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", dataNascimento='" + getDataNascimento() + "'" +
            ", matricula='" + getMatricula() + "'" +
            "}";
    }

    public static Funcionario GetInfoFuncionario(){

        Scanner scanner = new Scanner (System.in);

        String nome = scanner.nextLine();
        String cpf = scanner.nextLine();
        Date dataNascimento = Date.valueOf(scanner.nextLine());
        String matricula = scanner.nextLine();
        scanner.close();

        return new Funcionario(nome, cpf, dataNascimento, matricula);

    } //-------------------------------------------------------------------INSERT------------------------------------------------------------------------

    public static void InserirStatement(Funcionario funcionario) {
        final String url = "jdbc:mysql://localhost:3306/javabanco?useTimezone=true&serverTimezone=UTC";
        final String user = "root";
        final String password = "";
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            Statement statement = con.createStatement();
            statement.execute("INSERT INTO funcionarios (nome, cpf, dataNascimento, matricula) VALUES ('" +
                funcionario.getNome()+ "', '"+
                funcionario.getCpf()+"', '"+
                funcionario.getDataNascimento()+"','"+
                funcionario.getMatricula()+"')");
            con.close();
        } catch (SQLException e) {
            System.out.println("Erro SQL: " + e.getMessage());
        }
    } //-------------------------------------------------------------------INSERT------------------------------------------------------------------------
    
    public static void InserirPreparedStatement(Funcionario funcionario) {
        final String url = "jdbc:mysql://localhost:3306/javabanco?useTimezone=true&serverTimezone=UTC";
        final String user = "root";
        final String password = "";
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement prepStatement = con.prepareStatement(
                "INSERT INTO funcionarios (nome, cpf, dataNascimento, matricula) VALUES (?,?,?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS
            );
            prepStatement.setString(1, funcionario.getNome());
            prepStatement.setString(2, funcionario.getCpf());
            prepStatement.setDate(3, funcionario.getDataNascimento());
            prepStatement.setString(4, funcionario.getMatricula());
            
            if(prepStatement.executeUpdate() > 0){
                ResultSet resultado = prepStatement.getGeneratedKeys();

                if(resultado.next()){
                    int id = resultado.getInt(1);
                }
            }

            con.close();
        } catch (SQLException e) {
            System.out.println("Erro SQL: " + e.getMessage());
        }
    } //-------------------------------------------------------------------SELECT------------------------------------------------------------------------

    public static void SelectStatement() {
        final String url = "jdbc:mysql://localhost:3306/javabanco?useTimezone=true&serverTimezone=UTC";
        final String user = "root";
        final String password = "";
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            Statement statement = con.createStatement();
            statement.execute("SELECT * FROM funcionarios");
    
            con.close();
        } catch (SQLException e) {
            System.out.println("Erro SQL: " + e.getMessage());
        }
    } //-------------------------------------------------------------------SELECT------------------------------------------------------------------------
    
    public static void SelectPreparedStatement() {
        final String url = "jdbc:mysql://localhost:3306/javabanco?useTimezone=true&serverTimezone=UTC";
        final String user = "root";
        final String password = "";
        try{
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement prepStatement = con.prepareStatement(
                "SELECT * FROM funcionarios",
                PreparedStatement.RETURN_GENERATED_KEYS
            );
    
            ResultSet resultado = prepStatement.executeQuery();

            while(resultado.next()){
                Funcionario funcionario = new Funcionario(
                    resultado.getInt("id"), 
                    resultado.getString("nome"), 
                    resultado.getString("cpf"), 
                    resultado.getDate("dataNascimento"), 
                    resultado.getString("matricula")
                );
                
                System.out.println(funcionario);

            }

            con.close();
        } catch (SQLException e) {
    
        System.out.println("Erro SQL: " + e.getMessage());
        }
    }

    
}
