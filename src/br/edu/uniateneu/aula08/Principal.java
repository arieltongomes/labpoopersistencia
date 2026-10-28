package br.edu.uniateneu.aula08;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();

//		System.out.println("\n--- Listando Usuário por ID ---");
//		Usuario user = usuarioDAO.buscarUsuarioPorId(2);
//		if (user != null) {
//			System.out.println("ID: " + user.getId() + " | Nome: " + user.getNome() + " | Email: " + user.getLogin());
//		}

//		// --- TESTANDO O CREATE ---
//		System.out.println("--- Inserindo Usuário ---");
//		Usuario novoUsuario = new Usuario("Maria Silva", "maria@email.com", "123456");
//		usuarioDAO.salvar(novoUsuario);

		// --- TESTANDO O READ --- System.out.println("\n--- Listando Usuários ---");
		List<Usuario> lista = usuarioDAO.listarTodos();
		for (Usuario u : lista) {
			System.out.println("ID: " + u.getId() + " | Nome: " + u.getNome() + " | Senha: " + u.getSenha());
		}

		/*
		 * 
		 * 
		 * // --- TESTANDO O READ --- System.out.println("\n--- Listando Usuários ---");
		 * List<Usuario> lista = usuarioDAO.listarTodos(); for (Usuario u : lista) {
		 * System.out.println("ID: " + u.getId() + " | Nome: " + u.getNome() +
		 * " | Email: " + u.getLogin()); }
		 * 
		 * // --- TESTANDO O UPDATE --- if (!lista.isEmpty()) {
		 * System.out.println("\n--- Atualizando Usuário ---"); Usuario
		 * usuarioParaAtualizar = lista.get(0); // Pega o primeiro da lista
		 * usuarioParaAtualizar.setNome("Maria Silva Alterada");
		 * usuarioDAO.atualizar(usuarioParaAtualizar); }
		 * 
		 * // --- TESTANDO O DELETE --- if (!lista.isEmpty()) {
		 * System.out.println("\n--- Deletando Usuário ---"); Usuario usuarioParaDeletar
		 * = lista.get(0); usuarioDAO.deletar(usuarioParaDeletar.getId()); }
		 */ }

}
