package main.util;

import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;

public class ShowAlert {

	public void validacaoAlert() {
		Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle("Aten��o");
		alert.setHeaderText(null);
		alert.setContentText("Preencha todos os campos!");
		alert.showAndWait();
	}
	
	public boolean confirmationAlert() {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Excluir");
		alert.setHeaderText("Confirma��o de Exclus�o");
		alert.setContentText("Voc� tem certeza que deseja excluir:");
		
		Optional<ButtonType> result = alert.showAndWait();
		ButtonType button = result.orElse(ButtonType.CANCEL);

		if (button == ButtonType.OK) {
		    return true;
		} 
		
		return false;
	}
	
	public void sucessoAlert(String message) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Sucesso");
		alert.setHeaderText(null);
		alert.setContentText(message);
		alert.showAndWait();
	}
	
	public void mensagemAlert() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Logout");
		alert.setHeaderText(null);
		alert.setContentText("O sistema ser� encerrado!");
		alert.showAndWait();
	}
	
	public void erroAlert() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Erro");
		alert.setHeaderText(null);
		alert.setContentText("Cliente n�o existe!");
		alert.showAndWait();
	}
	
}
