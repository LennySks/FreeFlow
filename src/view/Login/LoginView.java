package view.Login;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class LoginView extends GridPane {

    private GridPane grid;
    private Label usernameLabel;
    private TextField usernameTextField;

    private Label passwordLabel;
    private PasswordField passwordTextField;

    private HBox buttonHBox;

    private Button loginButton;
    private Button registerButton;
    private VBox buttonVBox;


    public LoginView() {
        this.initialiseNodes();
        this.layoutNodes();
    }
    private void initialiseNodes() {
        this.usernameTextField = new TextField();
        this.passwordTextField = new PasswordField();
        this.buttonVBox = new VBox(5);
        this.loginButton = new Button("Aanmelden");
        this.registerButton = new Button("Registreren");
    }
    private void layoutNodes() {

        this.setAlignment(Pos.CENTER);
        this.setHgap(10);
        this.setVgap(10);
        this.setPadding(new Insets(50, 50, 50, 50));

        this.add(usernameTextField, 1,1);
        this.add(passwordTextField, 1,2);
        usernameTextField.setPromptText("Gebruikersnaam");

        this.buttonVBox.setAlignment(Pos.BOTTOM_CENTER);
        this.buttonVBox.getChildren().addAll(this.loginButton, this.registerButton);

        this.add(buttonVBox, 1,3);

        this.loginButton.setStyle("-fx-color: #03A9F4;-fx-font-size: 14px;");
        this.registerButton.setStyle("-fx-color: #9E9E9E;-fx-font-size: 14px;");
    }

    Button getLoginButton() {
        return loginButton;
    }
    Button getRegisterButton() {
        return registerButton;
    }
    public TextField getUsernameTextField() {
        return usernameTextField;
    }
    public PasswordField getPasswordTextField() {
        return passwordTextField;
    }
}
