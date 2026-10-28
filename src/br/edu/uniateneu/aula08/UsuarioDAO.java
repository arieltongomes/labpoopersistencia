package br.edu.uniateneu.aula08;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    // 1. CREATE (Salvar Usuário)
    public void salvar(Usuario usuario) {
        String sql = "INSERT INTO usuario (nome, login, senha) VALUES (?, ?, ?)";

        try (Connection conn = ConexaoFactory.obterConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getLogin());
            stmt.setString(3, usuario.getSenha());
            stmt.executeUpdate();
            
            System.out.println("Usuário salvo com sucesso!");

        } catch (Exception e) {
            System.err.println("Erro ao salvar usuário: " + e.getMessage());
        }
    }

    // 2. READ (Listar todos os Usuários)
    public List<Usuario> listarTodos() {
        String sql = "SELECT * FROM usuario";
        List<Usuario> usuarios = new ArrayList<>();

        try (Connection conn = ConexaoFactory.obterConexao();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Usuario usuario = new Usuario(
                        rs.getInt("id"),
                        rs.getString("login"),
                        rs.getString("senha"),
                        rs.getString("nome")
                        
                        

                );
                usuarios.add(usuario);
            }

        } catch (Exception e) {
            System.err.println("Erro ao listar usuários: " + e.getMessage());
        }
        return usuarios;
    }

    // 3. UPDATE (Atualizar Usuário)
    public void atualizar(Usuario usuario) {
        String sql = "UPDATE usuario SET nome = ?, login = ?, senha = ? WHERE id = ?";

        try (Connection conn = ConexaoFactory.obterConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getLogin());
            stmt.setString(3, usuario.getSenha());
            stmt.setInt(4, usuario.getId());
            stmt.executeUpdate();

            System.out.println("Usuário atualizado com sucesso!");

        } catch (Exception e) {
            System.err.println("Erro ao atualizar usuário: " + e.getMessage());
        }
    }

    // 4. DELETE (Excluir Usuário)
    public void deletar(int id) {
        String sql = "DELETE FROM usuario WHERE id = ?";

        try (Connection conn = ConexaoFactory.obterConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

            System.out.println("Usuário deletado com sucesso!");

        } catch (Exception e) {
            System.err.println("Erro ao deletar usuário: " + e.getMessage());
        }
    }
    public Usuario buscarUsuarioPorId(int id) {
        String sql = "SELECT * FROM usuario WHERE id = ?";
        Usuario usuario = null;

        try (Connection conn = ConexaoFactory.obterConexao();
        		PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, id);
        		ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
               usuario = new Usuario(
                    rs.getInt("id"),
                    rs.getString("login"),
                    rs.getString("nome"),
                    rs.getString("senha")
                    
                );
               
            }

        } catch (Exception e) {
            System.err.println("Erro ao listar usuários: " + e.getMessage());
        }
        return usuario;
    }
}

