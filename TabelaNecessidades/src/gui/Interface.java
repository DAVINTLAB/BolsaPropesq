package gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.io.File;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.Window;
import pesquisas.*;

public class Interface extends Application {
	private boolean flag = false;

	@Override
	public void start(Stage primaryStage)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Selecione o arquivo base editado");
		File file = fileChooser.showOpenDialog(primaryStage);

		if (file == null) {
			System.exit(0);
		}

		String path = file.getAbsolutePath();
 
	

		System.setProperty("file.encoding", "UTF-8");
		Field charset = Charset.class.getDeclaredField("defaultCharset");
		charset.setAccessible(true);
		charset.set(null, null);

		double ScreenWidth = Screen.getPrimary().getBounds().getWidth() * 0.95;
		double ScreenHeight = Screen.getPrimary().getBounds().getHeight() * 0.90;

		primaryStage.setTitle("Seleção de temas");
		GridPane grid = new GridPane();
		ScrollPane scroll = new ScrollPane(grid);
		scroll.setMaxSize(ScreenWidth, ScreenHeight);
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(5);
		grid.setVgap(20);
		grid.setPadding(new Insets((ScreenHeight - 666.0)/1.2, (ScreenWidth - 947)/2 , 0 , (ScreenWidth - 947)/2 )); // nao pronto

		grid.setMaxHeight(ScreenHeight); // nao pronto
		grid.setMaxWidth(ScreenWidth); // nao pronto

		EstruturaGeral estGeral = new EstruturaGeral();

		estGeral.generate(path);
		Text scenetitle = new Text("Escolha a escola: ");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);

		Text scenetitle2 = new Text("Temas Atuais: ");
		scenetitle2.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle2, 0, 5, 2, 1);
		scenetitle2.setVisible(false);

		Text scenetitle3 = new Text("Temas Futuros: ");
		scenetitle3.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle3, 0, 5, 2, 1);
		scenetitle3.setVisible(false);

		ComboBox<String> estruturas = new ComboBox<>();
		estruturas.getItems().addAll(estGeral.nomeEstruturas());

		ComboBox<String> temasAtuais = new ComboBox<>();
		temasAtuais.maxWidth(grid.getMaxWidth());
		ComboBox<String> temasFuturos = new ComboBox<>();

		TextArea textArea = new TextArea();
		textArea.setWrapText(true);
		textArea.setEditable(false);
		textArea.setMaxHeight(250.0);
		textArea.setMaxWidth(900.0);
		textArea.setVisible(false);
		textArea.setMinWidth(900.0);
		textArea.setMinHeight(250.0);

		grid.add(temasAtuais, 0, 6);
		grid.add(estruturas, 0, 1);
		grid.add(temasFuturos, 0, 6);
		grid.add(textArea, 0, 8);
		temasAtuais.setVisible(false);
		temasFuturos.setVisible(false);
		temasFuturos.getSelectionModel().selectFirst();
		temasAtuais.getSelectionModel().selectFirst();

		final ToggleGroup opcaoTemas = new ToggleGroup();
		RadioButton atuaisRadioButton = new RadioButton("Temas Atuais");
		RadioButton futurosRadioButton = new RadioButton("Temas Futuros");

		atuaisRadioButton.setToggleGroup(opcaoTemas);
		futurosRadioButton.setToggleGroup(opcaoTemas);
		grid.add(atuaisRadioButton, 0, 2);
		grid.add(futurosRadioButton, 0, 3);
		atuaisRadioButton.setVisible(false);
		futurosRadioButton.setVisible(false);

		estruturas.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				flag = true;
				temasAtuais.getItems().clear();
				temasFuturos.getItems().clear();
				flag = false;
				temasAtuais.getItems().addAll(estGeral.listarTemasAtuais(estruturas.getValue()));
				temasFuturos.getItems().addAll(estGeral.listarTemasFuturos(estruturas.getValue()));
				estGeral.generate(path);
				temasFuturos.setVisible(false);
				temasAtuais.setVisible(false);
				textArea.setVisible(false);
				scenetitle2.setVisible(false);
				scenetitle3.setVisible(false);

				atuaisRadioButton.setSelected(false);
				futurosRadioButton.setSelected(false);
				atuaisRadioButton.setVisible(true);
				futurosRadioButton.setVisible(true);

			}
		});

		atuaisRadioButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				temasAtuais.getItems();
				temasFuturos.setVisible(false);
				scenetitle3.setVisible(false);
				textArea.setVisible(false);
				temasAtuais.setVisible(true);
				scenetitle2.setVisible(true);

			}
		});

		futurosRadioButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				temasFuturos.getItems();
				temasAtuais.setVisible(false);
				scenetitle2.setVisible(false);
				textArea.setVisible(false);
				temasFuturos.setVisible(true);
				scenetitle3.setVisible(true);

			}
		});

		temasAtuais.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				if (flag == false) {
					estGeral.generate(path);
					textArea.setText(estGeral.temasAtuaisProfessores(temasAtuais.getValue(), estruturas.getValue()));
					textArea.setVisible(true);
				}

			}
		});

		temasFuturos.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				if (flag == false) {
					estGeral.generate(path);
					textArea.setText(estGeral.temasFuturosProfessores(temasFuturos.getValue(), estruturas.getValue()));

					textArea.setVisible(true);
				}
			}
		});
		Scene scene = new Scene(scroll, ScreenWidth, ScreenHeight);

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
