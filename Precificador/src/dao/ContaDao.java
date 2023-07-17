package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import conexoes.Conection;
import modelo.Conta;

public class ContaDao {
    private Connection conexao;
    private PreparedStatement stmt;
    private ResultSet rs;
    private ArrayList<Conta> lista;












    public void addConta(Conta conta) {
        String sql = "INSERT INTO conta (nomeConta, preco) VALUES (?, ?);";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, conta.getNomeConta());
            stmt.setDouble(2,conta.getPreco());
            stmt.execute();
            stmt.close();

        } catch (SQLException exception) {
            
            JOptionPane.showMessageDialog(null, exception);
        }finally{

            try{


                // Verifica se o Statement está fechado se não tiver ele o fecha
                if(stmt!=null){
                    stmt.close();
                }


                // Verifica se a conexão foi fechada se não tiver sido fecha a conexão
                if(conexao!=null){
                    conexao.close();
                }


            }catch(SQLException e){
                    e.printStackTrace();
            }
        }
    }
       
    
















    public ArrayList<Conta> getContas() {
        String sql = "SELECT * FROM conta";
        try {
            this.conexao = new Conection().getConnection();


            stmt = conexao.prepareStatement(sql);

            rs = stmt.executeQuery();

            while (rs.next()) {
                Conta objConta = new Conta();
                objConta.setId(rs.getInt("id"));
                objConta.setNomeConta(rs.getString("nomeConta"));
                objConta.setPreco(rs.getDouble("preco"));
                
                
            }
            
        } catch (SQLException exception) {
            // TODO: handle exception
            throw new RuntimeException(exception);
        }finally{

            try{


                // Verifica se o Statement está fechado se não tiver ele o fecha
                if(stmt!=null){
                    stmt.close();
                }


                // Verifica se a conexão foi fechada se não tiver sido fecha a conexão
                if(conexao!=null){
                    conexao.close();
                }


            }catch(SQLException e){
                    e.printStackTrace();
            }
        }

        return this.lista;
    }
  























    public void dellConta(Conta conta) {



        // Cria a string que sera executado no banco de dados
        String sql= "DELETE FROM conta WHERE id = ?";


        // Conecta com o banco de dados
        conexao = new Conection().getConnection();
        try {


            // Prepara o Statement que vai ser executada
            stmt = conexao.prepareStatement(sql);


            // Informa que aonde está o ponto de interrogação é para substituir pelo id
            stmt.setInt(1, conta.getId());


            // Executa e fecha o Statement
            stmt.execute();
            stmt.close();
            

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{

            try{


                // Verifica se o Statement está fechado se não tiver ele o fecha
                if(stmt!=null){
                    stmt.close();
                }


                // Verifica se a conexão foi fechada se não tiver sido fecha a conexão
                if(conexao!=null){
                    conexao.close();
                }


            }catch(SQLException e){
                    e.printStackTrace();
            }
        }
        
    }


    public void updateConta(Conta conta) {
        String sql = "update conta set" +
                "`nomeConta` = ?,\n" +
                "`preco` = ?\n" +
        "WHERE `id` = ?;\n";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, conta.getNomeConta());
            stmt.setDouble(2, conta.getPreco());
            stmt.setInt(3, conta.getId());
            stmt.execute();
            stmt.close();

         } catch (SQLException exception) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "Inválido. Tente novamente.");
        }finally{

            try{


                // Verifica se o Statement está fechado se não tiver ele o fecha
                if(stmt!=null){
                    stmt.close();
                }


                // Verifica se a conexão foi fechada se não tiver sido fecha a conexão
                if(conexao!=null){
                    conexao.close();
                }


            }catch(SQLException e){
                    e.printStackTrace();
            }
        }
    }

}
