package css;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Classe que implementa un login mitjançant JavaFX.
 * Fa us de CSSs
 * @author sergi grau
 * @version 1.0 8/02/2014
 */

public class LoginCSS extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Login");
        GridPane graella = new GridPane();
        graella.setAlignment(Pos.CENTER);
        graella.setHgap(10);
        graella.setVgap(10);
        graella.setPadding(new Insets(25, 25, 25, 25));

        Text titolEscena = new Text("Login");
        graella.add(titolEscena, 0, 0, 2, 1);

        Label etiquetaUsuari = new Label("Usuari:");
        graella.add(etiquetaUsuari, 0, 1);

        TextField campTextUsuari = new TextField();
        graella.add(campTextUsuari, 1, 1);

        Label etiquetaPassword = new Label("Password:");
        graella.add(etiquetaPassword, 0, 2);

        PasswordField campPassword = new PasswordField();
        graella.add(campPassword, 1, 2);

        Button btn = new Button("Validacio");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        graella.add(hbBtn, 1, 4);

        final Text textMissatge = new Text();
        graella.add(textMissatge, 1, 6);
        textMissatge.setId("missatge");

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                textMissatge.setText("En procés...");
            }
        });


        Scene escena = new Scene(graella, 300, 275);
        stage.setScene(escena);
        escena.getStylesheets().add(Login.class.getResource("estils.css").toExternalForm());
        stage.show();
    }
}
