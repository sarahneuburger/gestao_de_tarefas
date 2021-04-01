package controller;


import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;

import model.TarefaModel;
import model.TarefasDAO;

public class TarefasController {
	
	// M�todo para cadastrar tarefa
	public void cadastrarTarefa (String tituloTarefa, String descricaoTarefa, LocalDate dataPrevista, 
			String situacaoTarefa) throws SQLException, ParseException {
		TarefaModel tarefaModel = new TarefaModel();
		tarefaModel.setTituloTarefa(tituloTarefa);
		tarefaModel.setDescricaoTarefa(descricaoTarefa);
		tarefaModel.setDataPrevistaConclusao(dataPrevista);
		tarefaModel.setSituacaoTarefa(situacaoTarefa);
		new TarefasDAO().cadastrarTarefa(tarefaModel);;
	}

}
