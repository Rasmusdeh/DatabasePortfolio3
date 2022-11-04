import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Label lab1=new Label("From port");
        ComboBox<String> combo = new ComboBox<>();
        combo.getItems().add("Jarwarhal Nehru");
        combo.getItems().add("Tanjung Pelepas");
        combo.getItems().add("Dar Es Salaam");
        combo.getItems().add("Mombasa");
        combo.getItems().add("Salalah");
        combo.getItems().add("Zanzibar");
        combo.getItems().add("Jebel Ali Dubai");
        Label lab2=new Label("To port");
        ComboBox<String> combo1 = new ComboBox<>();
        combo1.getItems().add("Jarwarhal Nehru");
        combo1.getItems().add("Tanjung Pelepas");
        combo1.getItems().add("Dar Es Salaam");
        combo1.getItems().add("Mombasa");
        combo1.getItems().add("Salalah");
        combo1.getItems().add("Zanzibar");
        combo1.getItems().add("Jebel Ali Dubai");
        Label lab3=new Label("number of containers");
        TextField fld = new TextField();
        Button srch = new Button("Search");
        TextArea res = new TextArea();



        srch.setOnAction(e ->{

            res.setText("Pressed\n"

                    + combo.getValue()
                    + "\n" + combo1.getValue()
                    + "\n" + fld.getText());
            });




        GridPane pane1 = new GridPane();
        BorderPane root=new BorderPane();
        lab1.setPrefSize(150,30);
        lab2.setPrefSize(150,30);
        lab3.setPrefSize(150,30);
        srch.setStyle(
                "-fx-font: 22 arial; -fx-base: rgb(170,0,0);"+
                        " -fx-text-fill: rgb(255,255,255);");

        res.setStyle( "-fx-font: 16 arial;");
        pane1.add(lab1,1,1);
        pane1.add(combo,1,2);
        pane1.add(lab2,2,1);
        pane1.add(combo1,2,2);
        pane1.add(lab3,3,1);
        pane1.add(fld,3,2);
        root.setTop(pane1);
        root.setCenter(srch);
        root.setBottom(res);
        //VBox root = new VBox(lab1,combo,lab2,combo1,lab3,fld,srch,res);
        //Group root = new Group(); // the root is Group or Pane
        Scene scene = new Scene(root, 500, 500, Color.BLUE);
        stage.setTitle("Containers");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}