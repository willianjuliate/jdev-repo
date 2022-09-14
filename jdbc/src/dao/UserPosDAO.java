package dao;

import conexao_jdbc.SingleConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.BeanUserFone;
import model.Telefone;
import model.Userposjava;

/**
 *
 * @author willian
 */
public class UserPosDAO {

    private final Connection connection;

    public UserPosDAO() {
        connection = SingleConnection.getConnection();
    }

    public void salvar(Userposjava u) {
        try {
            String sql = "insert into userposjava (nome, email) values (?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, u.getNome()); // NOME
            ps.setString(2, u.getEmail()); // EMAIL
            ps.execute();
            connection.commit();
        } catch (SQLException err) {
            try {
                connection.rollback();
            } catch (SQLException e) {
                err.printStackTrace();
            }
            err.printStackTrace();
            System.out.println("Err: " + err.getMessage());
        }
    }

    public List<Userposjava> listar() {
        List<Userposjava> list = new ArrayList<>();
        String sql = "select * from userposjava";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Userposjava userposjava = new Userposjava();
                userposjava.setId(rs.getLong("id"));
                userposjava.setNome(rs.getString("nome"));
                userposjava.setEmail(rs.getString("email"));

                list.add(userposjava);
            }

        } catch (SQLException err) {
            System.err.println(err.getMessage());
        }

        return list;
    }

    public Userposjava listar(Long id) {
        Userposjava u = new Userposjava();
        String sql = "select * from userposjava where id = " + id;

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                u.setId(rs.getLong("id"));
                u.setNome(rs.getString("nome"));
                u.setEmail(rs.getString("email"));
            }

        } catch (SQLException err) {
            System.err.println(err.getMessage());
        }

        return u;
    }

    public void updateData(Userposjava u, String dados) {
        try {
            String sql = String.format("update userposjava set %s = ? where id = %d", dados, u.getId());
            PreparedStatement pstmt = connection.prepareStatement(sql);

            switch (dados) {
                case "nome" ->
                    pstmt.setString(1, u.getNome());
                case "email" ->
                    pstmt.setString(1, u.getEmail());
                default ->
                    System.err.println("Query error!");
            }
            pstmt.execute();
            connection.commit();

        } catch (SQLException err) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                System.err.println(err.getMessage());
            }

            System.err.println(err.getMessage());
        }
    }

    public void deletar(Long id) {
        String sql = "delete from userposjava where id = " + id;
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.execute();
            connection.commit();
        } catch (SQLException ex) {
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                System.err.println(ex1.getMessage());
            }
            System.err.println(ex.getMessage());
        }
    }

    public void salvarTelefone(Telefone telefone) {
        try {
            String sql = " INSERT INTO public.telefoneuser (numero, tipo, usuariopessoa) VALUES(?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, telefone.getNumero());
            statement.setString(2, telefone.getTipo());
            statement.setLong(3, telefone.getUsuario());
            statement.execute();
            connection.commit();
        } 
        catch (SQLException err) {
            try {                
                connection.rollback();                
            } 
            catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
            System.err.println(err.getMessage());
        }
    }
    
    public List<BeanUserFone> listaUserFone(Long idUser) {
        List<BeanUserFone> bensFones = new ArrayList<>();
        String sql = " select numero, nome, email from telefoneuser as fone "
                + " inner join userposjava as userp "
                + " on fone.usuariopessoa = userp.id "
                + " where userp.id = "+idUser;
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();  
            
            while(rs.next()) {
                BeanUserFone bf = new BeanUserFone();
                bf.setEmail(rs.getString("email"));
                bf.setNome(rs.getString("nome"));
                bf.setNumero(rs.getString("numero"));
                
                bensFones.add(bf);
            }
            
            
        } 
        catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        
        return bensFones;
    }
}
