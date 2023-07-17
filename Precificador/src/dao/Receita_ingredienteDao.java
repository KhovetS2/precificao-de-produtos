package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import conexoes.Conection;
import modelo.Ingrediente;
import modelo.Receita;
import modelo.Receita_ingrediente;

public class Receita_ingredienteDao {
    private Connection conexao;
    private PreparedStatement stmt;
    private ResultSet rs;
    private ArrayList<Receita_ingrediente> lista;





    public void adicionar(Receita_ingrediente receita_ingrediente) {
        String sql = "INSERT INTO receita_ingrediente " +
        "(receita_id, ingrediente_id, quantidadeIngrediente)" +
        " VALUES (?, ?, ?);";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, receita_ingrediente.getReceita_id());
            stmt.setInt(2,receita_ingrediente.getIngrediente_id());
            stmt.setDouble(3,receita_ingrediente.getQuantidadeIngrediente());
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
       
    






    public ArrayList<Receita_ingrediente> getAll(Receita receita) {
        String sql = "SELECT * FROM receita_ingrediente" + 
        " WHERE receita_id = ?";
        try {
            this.conexao = new Conection().getConnection();


            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, receita.getId());

            rs = stmt.executeQuery();

            while (rs.next()) {
                Receita_ingrediente objReceita_ingrediente = new Receita_ingrediente();
                objReceita_ingrediente.setReceita_id(rs.getInt("receita_id"));
                objReceita_ingrediente.setIngrediente_id(rs.getInt("ingrediente_id"));
                objReceita_ingrediente.setQuantidadeIngrediente(rs.getDouble("quantidadeIngrediente"));
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
  



    public ArrayList<Receita_ingrediente> getAll(Ingrediente ingrediente) {
        String sql = "SELECT * FROM receita_ingrediente"+
        " WHERE receita_id = ?";
        try {
            this.conexao = new Conection().getConnection();


            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, ingrediente.getId());

            rs = stmt.executeQuery();

            while (rs.next()) {
                Receita_ingrediente objReceita_ingrediente = new Receita_ingrediente();
                objReceita_ingrediente.setReceita_id(rs.getInt("receita_id"));
                objReceita_ingrediente.setIngrediente_id(rs.getInt("ingrediente_id"));
                objReceita_ingrediente.setQuantidadeIngrediente(rs.getDouble("quantidadeIngrediente"));
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




    public void dell(Receita_ingrediente receita_ingrediente) {

        
        // Cria uma instâcia temporaria de Aluno_AtividadeDao para deletar todas as tuplas dessa tabela que esse aluno é referenciado
        //new Aluno_AtividadeDao().deletarAluno(idAluno);


        // Cria a string que sera executado no banco de dados
        String sql= "DELETE FROM receita_ingrediente"
        +" WHERE receita_id = ?"
        +" AND ingrediente_id = ?";


        // Conecta com o banco de dados
        conexao = new Conection().getConnection();
        try {


            // Prepara o Statement que vai ser executada
            stmt = conexao.prepareStatement(sql);


            // Informa que aonde está o ponto de interrogação é para substituir pelo idAluno
            stmt.setInt(1, receita_ingrediente.getIngrediente_id());
            stmt.setInt(2, receita_ingrediente.getReceita_id());


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

    public void dellReceita(Receita receita) {

        
        // Cria uma instâcia temporaria de Aluno_AtividadeDao para deletar todas as tuplas dessa tabela que esse aluno é referenciado
        //new Aluno_AtividadeDao().deletarAluno(idAluno);


        // Cria a string que sera executado no banco de dados
        String sql= "DELETE FROM receita_ingrediente"
        +" WHERE receita_id = ?";


        // Conecta com o banco de dados
        conexao = new Conection().getConnection();
        try {


            // Prepara o Statement que vai ser executada
            stmt = conexao.prepareStatement(sql);


            // Informa que aonde está o ponto de interrogação é para substituir pelo idAluno
            stmt.setInt(1, receita.getId());


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

    public void dellIngrediente(Ingrediente ingrediente) {

        
        // Cria uma instâcia temporaria de Aluno_AtividadeDao para deletar todas as tuplas dessa tabela que esse aluno é referenciado
        //new Aluno_AtividadeDao().deletarAluno(idAluno);


        // Cria a string que sera executado no banco de dados
        String sql= "DELETE FROM receita_ingrediente"
        +" WHERE ingrediente_id = ?";


        // Conecta com o banco de dados
        conexao = new Conection().getConnection();
        try {


            // Prepara o Statement que vai ser executada
            stmt = conexao.prepareStatement(sql);


            // Informa que aonde está o ponto de interrogação é para substituir pelo idAluno
            stmt.setInt(1, ingrediente.getId());


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



    public void update(Receita_ingrediente receita_ingrediente) {
        String sql = "UPDATE receita_ingrediente SET" +
            "quantidadeIngrediente = ?,\n" +
            "WHERE receita_id = ?\n" +
            "AND ingrediente_id = ?";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setDouble(1, receita_ingrediente.getQuantidadeIngrediente());
            stmt.setInt(2, receita_ingrediente.getReceita_id());
            stmt.setInt(3, receita_ingrediente.getIngrediente_id());
            stmt.execute();
            stmt.close();

         } catch (SQLException exception) {
            // TODO: handle exception
            
            JOptionPane.showMessageDialog(null, "Inválido. Tente novamente.");
        }
    }

}
