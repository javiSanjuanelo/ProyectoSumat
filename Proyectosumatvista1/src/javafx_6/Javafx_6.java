package javafx_6;

import java.io.InputStream;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * 
 * @author Javier Sanjuanelo
 */

public class Javafx_6 extends Application {

  @Override
  public void start(Stage primaryStage) {

    // Organizamos los nodos hijos de la izquierda
    VBox containerLeft = new VBox();
    

    // Agregamos el titulo del contenedor
    Label labelTitle1 = new Label("SumaT");
    labelTitle1.setFont(new Font(38));

    // Creamos otro contenedor  de tipo vertical Box del lado izquierdo para colocar los campos
    VBox containerLogin = new VBox();

    //
    Label labelUser = new Label("User");
    labelUser.setFont(new Font(20));
    Label labelPassword = new Label("Password");
    labelPassword.setFont(new Font(20));

    TextField textUser = new TextField();
    textUser.setFont(new Font(18));
    textUser.setPromptText("Ingrese su usuario");
    textUser.setPrefWidth(341);
    textUser.setPrefHeight(44);

    PasswordField textPass = new PasswordField();
    textPass.setFont(new Font(18));
    textPass.setPromptText("Ingrese su contraseña");
    textPass.setPrefWidth(320);
    textPass.setPrefHeight(44);

    Button btnlogin = new Button("Entrar");
    btnlogin.setFont(new Font(18));
    btnlogin.setPrefWidth(380);
    btnlogin.setPrefHeight(42);
    btnlogin.setMaxWidth(Double.MAX_VALUE);
    btnlogin.setCursor(Cursor.HAND);

    // Se agregan los nodos o componentes al contenedor del login
    containerLogin.getChildren().addAll( labelUser, textUser, labelPassword, textPass, btnlogin);
    containerLeft.setAlignment(Pos.TOP_LEFT);

    // Se le dan los margenes 
    VBox.setMargin(labelUser, new Insets(10, 0, 0, 0));
    VBox.setMargin(labelPassword, new Insets(10, 0, 0, 0));
    VBox.setMargin(btnlogin, new Insets(20, 0, 0, 0));

    containerLeft.getChildren().addAll(labelTitle1, containerLogin);
    containerLeft.setPrefWidth(422);
    containerLeft.setAlignment(Pos.CENTER);
    VBox.setMargin(containerLogin, new Insets(0, 30, 0, 30));

    
    
    
    // CONTAINER DE LA DERECHA
    VBox containerRight = new VBox();
    
    //Agregamos los nodos de la derecha
    ImageView imgLogo;

    //Se agrega la imagen al lado izquierdo
    InputStream inputStream;
    inputStream = getClass().getResourceAsStream("/Img/bee.png");
    Image image = new Image(inputStream);

    imgLogo = new ImageView(image);
    containerRight.getChildren().add(imgLogo);

    containerRight.setPrefWidth(422);
    containerRight.setAlignment(Pos.CENTER);
    containerRight.setBackground(new Background(new BackgroundFill(Color.web("#7570D4"), CornerRadii.EMPTY, Insets.EMPTY)));

    // Con el setHgrow definimos la accion del cambio de dimension de pantalla para redimensionar su tamaño con always se redimensiona siempre
    
    HBox root = new HBox();
    root.getChildren().addAll(containerLeft, containerRight);
    HBox.setHgrow(containerLeft, Priority.ALWAYS);
    HBox.setHgrow(containerRight, Priority.ALWAYS);

    Scene scene = new Scene(root, 854, 503);

    primaryStage.setTitle("SUMAT");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

}