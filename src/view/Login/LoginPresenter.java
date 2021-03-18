package view.Login;

import com.company.Game;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

public class LoginPresenter {
    private final Game model;
    private final LoginView view;

    public LoginPresenter(Game model, LoginView view){
        this.model = model;
        this.view = view;
    }

//    private void addEventHandlers(){
//        view.getLoginButton().setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                try {
//                    model.login(view.getUsernameTextField().getText(), view.getPasswordTextField().getText());
//
//                    GameView gameView = new GameView();
//                    GamePresenter gamePresenter = new GamePresenter(model, gameView);
//                    view.getScene().setRoot(gameView);
//                    gameView.getScene().getWindow().sizeToScene();
//
//
//                } catch (Exception exception) {
//                    exception.printStackTrace();
//                    showAlert(Alert.AlertType.ERROR, exception.getMessage(), exception.getMessage());
//                }
//            }
//        });
//    }

}
