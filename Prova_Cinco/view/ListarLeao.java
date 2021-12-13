package view;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import model.Conexao;

public class ListarLeao extends JFrame {

    JButton fechar;
    JTextArea textArea1 = new JTextArea(10,30);
    JTextField id = new JTextField();

    public ListarLeao() {

        fechar = new JButton("Fechar");
        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        pane.add(textArea1);
        pane.add(fechar);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(360,320);
        this.setVisible(true);
        fechar.setBounds(10,60,100,22);
        fechar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buttonConfirmaActionPerformed(e);
            }
        });
    }
    
    public void buttonConfirmaActionPerformed(ActionEvent e){
        int ret = JOptionPane.showConfirmDialog(
            this, 
            "Deseja Fechar?",
            "Fechar",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );
        
        if(ret == JOptionPane.OK_OPTION){
            try{
                Connection con = Conexao.getConnection();
                Conexao.selectLeao(
                    con,
                    Integer.parseInt(id.getText())
                );
                con.close();
            } catch (Exception err) {
                JOptionPane.showMessageDialog(
                    this,
                    "Erro ao listar Leões: " + err.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE
                );
            }
            this.dispose();
        }
    }

    public static void main(String[] args){
        ListarLeao janela = new ListarLeao();
    }
}