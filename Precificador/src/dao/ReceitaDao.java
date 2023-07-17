package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import conexoes.Conection;
import modelo.Receita;
import modelo.UnidadeMedida;

public class ReceitaDao {
    
    private Connection conexao;
    private PreparedStatement stmt;
    private ResultSet rs;
    private ArrayList<Receita> lista;












    public void adicionar(Receita receita) {
        String sql = "INSERT INTO receita (nomeReceita, rendimento, unidadeMedidaRendimento) VALUES (?, ?, ?);";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, receita.getNomeReceita());
            stmt.setDouble(2,receita.getRendimento());
            stmt.setString(3,receita.getUnidadeMedidaRedimento().getUnidade());
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
       
    
















    public ArrayList<Receita> getReceitas() {
        String sql = "SELECT * FROM receita";
        try {
            this.conexao = new Conection().getConnection();


            stmt = conexao.prepareStatement(sql);

            rs = stmt.executeQuery();

            while (rs.next()) {
                Receita objReceita = new Receita();
                objReceita.setId(rs.getInt("id"));
                objReceita.setNomeReceita(rs.getString("nomeReceita"));
                objReceita.setRendimento(rs.getDouble("rendimento"));
                if (rs.getString("unidadeMedidaRendimento").equals("g")) {
                    UnidadeMedida unidadeMedida = UnidadeMedida.GRAMAS;
                    objReceita.setUnidadeMedidaRedimento(unidadeMedida);
                    this.lista.add(objReceita);
                } else if  (rs.getString("unidadeMedidaRendimento").equals("unidade")) {
                    UnidadeMedida unidadeMedida = UnidadeMedida.UNIDADE;
                    objReceita.setUnidadeMedidaRedimento(unidadeMedida);
                    this.lista.add(objReceita);
                } else {
                    UnidadeMedida unidadeMedida = UnidadeMedida.MILILITROS;
                    objReceita.setUnidadeMedidaRedimento(unidadeMedida);
                    this.lista.add(objReceita);
                }
                
                
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
  























    public void deletarReceita(Receita receita) {

        
        // Cria uma instâcia temporaria de Aluno_AtividadeDao para deletar todas as tuplas dessa tabela que esse aluno é referenciado
        new Receita_ingredienteDao().dellReceita(receita);


        // Cria a string que sera executado no banco de dados
        String sql= "DELETE FROM receita WHERE id = ?";


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


    public void alterarReceita(Receita receita) {
        String sql = "update receita set" +
                "`nomeReceita` = ?,\n" +
                "`rendimento` = ?\n" +
                "`unidadeMedidaRendimento` = ?\n" +
        "WHERE `id` = ?;\n";
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, receita.getNomeReceita());
            stmt.setDouble(2, receita.getRendimento());
            stmt.setString(3, receita.getUnidadeMedidaRedimento().getUnidade());
            stmt.setInt(4, receita.getId());
            stmt.execute();
            stmt.close();

         } catch (SQLException exception) {
            // TODO: handle exception
            
            JOptionPane.showMessageDialog(null, "Inválido. Tente novamente.");
        }
    }


}
