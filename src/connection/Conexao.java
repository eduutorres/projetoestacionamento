/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

/**
 *
 * @author Eduardo
 */
import java.sql.*;
import javax.swing.*;

public class Conexao {
    final private String DRIVER = "com.mysql.jdbc.Driver";
    final private String URL = "jdbc:mysql://localhost:3306/estacionamento";
    final private String USER = "root";
    final private String PASS = "";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    
    public boolean conecta(){
        boolean result = true;
        try{
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, USER, PASS);
//            JOptionPane.showMessageDialog(null, "Conexao ok");
            
        }catch(ClassNotFoundException Fonte){
            JOptionPane.showMessageDialog(null, "Driver não localizado");
            result = false;
        }catch(SQLException Fonte){
            JOptionPane.showMessageDialog(null, "Deu erro na Conexao");
            result = false;
        }
        return result;
    }
    public void desconecta(){
        boolean result = true;
        try {
            conexao.close();
            JOptionPane.showMessageDialog(null, "Conexao fechada");           
        } catch (SQLException fech) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexao com o banco de dados"+ fech);           
            result = false;
        }
    }
    public void executaSQL(String sql){
        try {
            statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null,"Não foi possivel executar o comando sql"+ sqlex + "O comando passado foi"+ sql);
        }
    }
}
