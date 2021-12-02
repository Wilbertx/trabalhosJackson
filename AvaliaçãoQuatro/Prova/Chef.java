import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Chef extends Pessoas {

    private String especialidade;

    private ArrayList<Receita> receitas = new ArrayList<>();

    private final static String url = "jdbc:mysql://localhost:3306/javabanco?useTimezone=true&serverTimezone=UTC";
    private final static String user = "root";
    private final static String password = "";

    public Chef(String id, String nome, String cpf, Date dataNascimento, String especialidade) {
        super(id, nome, cpf, dataNascimento);
        this.especialidade = especialidade;
    }

    public Chef(String nome, String cpf, Date dataNascimento, String especialidade) {
        super(nome, cpf, dataNascimento);
        this.especialidade = especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setCliente(Receita receita) {
        this.receitas.add(receita);
    }

    public ArrayList<Receita> getReceita() {
        return this.receitas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Chef)) {
            return false;
        }
        Chef cpf = (Chef) o;
        return Objects.equals(this.getCpf(), cpf.getCpf());
    }

    @Override
    public String toString() {
        return "{" +
                " Id ='" + getId() + "'" +
                ", Nome ='" + getNome() + "'" +
                ", Cpf ='" + getCpf() + "'" +
                ", Data de Nascimento ='" + getDataNascimento() + "'" +
                ", Especialidade ='" + getEspecialidade() + "'" +
                "}";
    }

    public void adicionarReceita(Receita receita) {
        this.receitas.add(receita);
    }

    public void adicionarReceita(

            String idReceita,
            String nome,
            String etapas,
            int numEtapas,
            double valor) {
        Receita receita = new Receita(idReceita, nome, etapas, numEtapas, valor);
        this.receitas.add(receita);
    }

    public static void printChef(
            ArrayList<Chef> chefs) {
        try {
            for (Chef chef : chefs) {
                System.out.println(chef);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Chef> getChefSelect() throws Exception {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM chefs;");
            ArrayList<Chef> chefs = new ArrayList<>();
            while (rs.next()) {
                chefs.add(
                        new Chef(
                                rs.getString("id"),
                                rs.getString("nome"),
                                rs.getString("cpf"),
                                rs.getDate("dataNascimento"),
                                rs.getString("especialidade")));
            }
            con.close();
            return chefs;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static Chef getChefInsert(Scanner scanner) {
        System.out.println("Informe o nome do chef");
        String nome = scanner.next();
        System.out.println("Informe o CPF do chef");
        String cpf = scanner.next();
        System.out.println("Informe a Data de Nascimento do chef");
        String dataNascimento = scanner.next();
        System.out.println("Informe a especialidade do chef");
        String especialidade = scanner.next();

        return new Chef(
                nome,
                cpf,
                Date.valueOf(dataNascimento),
                especialidade);
    }

    public static void insertChefS(Chef chef) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            boolean sql = stm.execute("INSERT INTO chefs "
                    + "(nome, cpf, dataNascimento, especialidade) VALUES "
                    + "('" + chef.getNome() + "', '" + chef.getCpf() + "', '" + chef.getDataNascimento() + "', '"
                    + chef.getEspecialidade() + "')");
            if (!sql) {
                System.out.println("Falha na execução");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Chef getChefUpdate(Scanner scanner) throws Exception {
        try {
            Chef chef = Chef.getChef(scanner);
            System.out.println("Informe o nome do chef");
            String nome = scanner.next();
            if (nome.length() > 0) {
                chef.setNome(nome);
            }
            System.out.println("Informe o CPF do chef");
            String cpf = scanner.next();
            if (cpf.length() > 0) {
                chef.setCpf(cpf);
            }
            System.out.println("Informe a Data de Nascimento do chef");
            String dataNascimento = scanner.next();
            if (dataNascimento.length() > 0) {
                chef.setDataNascimento(Date.valueOf(dataNascimento));
            }
            System.out.println("Informe o Especialidade do chef");
            String especialidade = scanner.next();
            if (especialidade.length() > 0) {
                chef.setEspecialidade(especialidade);
            }
            return chef;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static void updateChefS(Chef chef) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            boolean sql = stm.execute("UPDATE chefs SET "
                    + " nome = '" + chef.getNome() + "'"
                    + ", cpf = '" + chef.getCpf() + "'"
                    + ", dataNascimento = '" + chef.getDataNascimento() + "'"
                    + ", especialidade = '" + chef.getEspecialidade() + "'"
                    + " WHERE id = " + chef.getId());
            if (!sql) {
                System.out.println("Falha na execução");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Chef getChef(Scanner scanner) throws Exception {
        try {
            System.out.println("Informe o ID: ");
            String id = scanner.next();
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM chefs WHERE id = " + id);

            if (!rs.next()) {
                throw new Exception("Id inválido");
            }
            return new Chef(
                    rs.getString("id"),
                    rs.getString("nome"),
                    rs.getString("cpf"),
                    rs.getDate("dataNascimento"),
                    rs.getString("especialidade"));

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    public static void deleteChefS(Chef chef) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            boolean sql = stm.execute("DELETE FROM chefs "
                    + " WHERE id = " + chef.getId());
            if (!sql) {
                System.out.println("Falha na execução");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
