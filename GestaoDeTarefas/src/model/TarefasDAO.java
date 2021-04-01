package model;

import java.sql.PreparedStatement;

import connection.ConexaoBanco;

public class TarefasDAO {
	
	private ConexaoBanco conexao = new ConexaoBanco();
	
	// Insert para cadastrar tarefa
	public void cadastrarTarefa(TarefaModel tarefaModel) {
		try {
			java.sql.Date dataConvertida = java.sql.Date.valueOf(tarefaModel.getDataPrevistaConclusao());
			String sql1 = "INSERT INTO gestaotarefas.tarefas (tituloTarefa, descricaoTarefa, dataPrevistaConclusao, "
					+ "situacaoTarefa) VALUES (?, ?, ?, ?)";
			PreparedStatement pstmt = conexao.conectar().prepareStatement(sql1);
			pstmt.setString(1, tarefaModel.getTituloTarefa());
			pstmt.setString(2, tarefaModel.getDescricaoTarefa());
			pstmt.setDate(3, dataConvertida);
			pstmt.setString(4, tarefaModel.getSituacaoTarefa());
			pstmt.execute();
			
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
	}

}
