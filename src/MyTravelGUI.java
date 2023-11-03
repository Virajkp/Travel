package application;
//This is where the program is run from with the Main method.
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
/*This class is where the GUI is created based on the sized defined. This class also includes
all of the buttons that displied and what happens when they are pressed.*/ 
public class MyTravelGUI extends Application {
	private TextArea Output;
	private TextField Accept;
	private Button Readfile;
	private Button PrintAD;
	private Button PrintLD;
	private Button PrintTD;
	private Button PrintTC;
	private Button PrintAM;
	private Button PrintLM;
	static MyTravel my = new MyTravel();
	public void start(Stage applicationStage) {
		Scene scene = null;
		GridPane gridPane = null;

		gridPane = new GridPane();
		scene = new Scene(gridPane);

		Accept = new TextField();
		Accept.setPrefColumnCount(15);
		Accept.setEditable(true);
		Accept.setText("Text file name");

		Output = new TextArea();
		Output.setPrefColumnCount(15);
		Output.setEditable(false);

		Readfile = new Button("Read file");
		PrintAD = new Button("Print Air Travel Data");
		PrintLD = new Button("Print Land Travel Data");
		PrintTD = new Button("Print Travel Days");
		PrintTC = new Button("Print Travel Cost");
		PrintAM = new Button("Print Travel Air Mileage");
		PrintLM = new Button("Print Travel Land Mileage");

		gridPane.setPadding(new Insets(10, 10, 10, 10));
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		gridPane.add(Accept, 0, 0);
		gridPane.add(Readfile, 1, 0);
		Readfile.setMaxSize(1000, 100);
		gridPane.add(PrintAD, 0, 1, 2, 1);
		PrintAD.setMaxSize(275, 100);
		gridPane.add(PrintLD, 0, 2, 2, 1);
		PrintLD.setMaxSize(275, 100);
		gridPane.add(PrintTD, 0, 3, 3, 1);
		PrintTD.setMaxSize(256, 100);
		gridPane.add(PrintTC, 0, 4, 4, 1);
		PrintTC.setMaxSize(256, 100);
		gridPane.add(PrintAM, 0, 5, 5, 1);
		PrintAM.setMaxSize(256, 100);
		gridPane.add(PrintLM, 0, 6, 6, 1);
		PrintLM.setMaxSize(256, 100);
		gridPane.add(Output, 2, 0, 6, 7);
		Output.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

		Readfile.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				String userInput;
				userInput = Accept.getText();
				my.init(userInput);
				Output.setText(my.print());

			}
		});
		PrintAD.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				Output.setText(my.PrintAD());
			}
		});
		PrintLD.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Output.setText(my.PrintLD());

			}
		});
		PrintTC.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Output.setText(my.PrintTC());

			}
		});
		PrintTD.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Output.setText(my.PrintTD());

			}
		});
		PrintAM.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Output.setText(my.PrintAM());

			}
		});
		PrintLM.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Output.setText(my.PrintLM());

			}
		});

		applicationStage.setScene(scene);
		applicationStage.setTitle("Viraj Patel");
		applicationStage.show();
	}
//The main method.
	public static void main(String[] args) {
		launch(args);
	}
}
