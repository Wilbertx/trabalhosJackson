import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Cliente extends Pessoas {

    private String telefone;

    private ArrayList<Receita> receitas = new ArrayList<>();

    private final static String url = "jdbc:mysql://localhost:3306/javabanco?useTimezone=true&serverTimezone=UTC";
    private final static String user = "root";
    private final static String password = "";

    public Cliente(String id, String nome, String cpf, Date dataNascimento, String telefone) {
        super(id, nome, cpf, dataNascimento);
        this.telefone = telefone;
    }

    public Cliente(String nome, String cpf, Date dataNascimento, String telefone) {
        super(nome, cpf, dataNascimento);
        this.telefone = telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return this.telefone;
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
        if (!(o instanceof Cliente)) {
            return false;
        }
        Cliente cliente = (Cliente) o;
        return Objects.equals(this.getCpf(), cliente.getCpf());
    }

    @Override
    public String toString() {
        return "{" +
                " Id ='" + getId() + "'" +
                ", Nome ='" + getNome() + "'" +
                ", Cpf ='" + getCpf() + "'" +
                ", Data de Nascimento ='" + getDataNascimento() + "'" +
                ", Telefone ='" + getTelefone() + "'" +
                "}";
    }

    public void adicionarReceita(Receita receitas) {
        this.receitas.add(receitas);
        receitas.adicionarCliente(this);
    }

    public static void printClientes(
            ArrayList<Cliente> clientes) {
        try {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Cliente> getClienteS(Scanner scanner) throws Exception {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM clientes;");
            ArrayList<Cliente> clientes = new ArrayList<>();
            while (rs.next()) {
                clientes.add(
                        new Cliente(
                                rs.getString("id"),
                                rs.getString("nome"),
                                rs.getString("cpf"),
                                rs.getDate("dataNascimento"),
                                rs.getString("telefone")));
            }
            con.close();
            return clientes;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static Cliente getClienteInsert(Scanner scanner) {
        System.out.println("Informe o nome do cliente");
        String nome = scanner.next();
        System.out.println("Informe o CPF do cliente");
        String cpf = scanner.next();
        System.out.println("Informe a Data de Nascimento do cliente");
        String dataNascimento = scanner.next();
        System.out.println("Informe a telefone do cliente");
        String telefone = scanner.next();

        return new Cliente(
                nome,
                cpf,
                Date.valueOf(dataNascimento),
                telefone);
    }

    public static void insertClienteS(Cliente cliente) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            boolean sql = stm.execute("INSERT INTO clientes "
                    + "(nome, cpf, dataNascimento, telefone) VALUES "
                    + "('" + cliente.getNome() + "', '" + cliente.getCpf() + "', '" + cliente.getDataNascimento()
                    + "', '" + cliente.getTelefone() + "')");
            if (!sql) {
                System.out.println("Falha na execução");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Cliente getClienteUpdate(Scanner scanner) throws Exception {
        try {
            Cliente cliente = Cliente.getCliente(scanner);
            System.out.println("Informe o nome do cliente");
            String nome = scanner.next();
            if (nome.length() > 0) {
                cliente.setNome(nome);
            }
            System.out.println("Informe o CPF do cliente");
            String cpf = scanner.next();
            if (cpf.length() > 0) {
                cliente.setCpf(cpf);
            }
            System.out.println("Informe a Data de Nascimento do cliente");
            String dataNascimento = scanner.nextLine();
            if (dataNascimento.length() > 0) {
                cliente.setDataNascimento(Date.valueOf(dataNascimento));
            }
            System.out.println("Informe o telefone do cliente");
            String telefone = scanner.next();
            if (telefone.length() > 0) {
                cliente.setTelefone(telefone);
            }
            return cliente;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static void updateClienteS(Cliente cliente) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            boolean sql = stm.execute("UPDATE clientes SET "
                    + " nome = '" + cliente.getNome() + "'"
                    + ", cpf = '" + cliente.getCpf() + "'"
                    + ", dataNascimento = '" + cliente.getDataNascimento() + "'"
                    + ", telefone = '" + cliente.getTelefone() + "'"
                    + " WHERE id = " + cliente.getId());
            if (!sql) {
                System.out.println("Falha na execução");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Cliente getCliente(Scanner scanner) throws Exception {
        try {
            System.out.println("Informe o ID de exclusão: ");
            String id = scanner.next();
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM clientes WHERE id = " + id);

            if (!rs.next()) {
                throw new Exception("Id inválido");
            }
            return new Cliente(
                    rs.getString("id"),
                    rs.getString("nome"),
                    rs.getString("cpf"),
                    rs.getDate("dataNascimento"),
                    rs.getString("telefone"));

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    public static void deleteClienteS(Cliente cliente) {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stm = con.createStatement();
            boolean sql = stm.execute("DELETE FROM clientes "
                    + " WHERE id = " + cliente.getId());
            if (!sql) {
                System.out.println("Falha na execução");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
