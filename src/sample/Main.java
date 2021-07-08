package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    double fact(double n) {
        if (n == 0) { return 1; }
        return n * fact(n - 1); }

               double x;
               double y;
               char n;
               double res;

            @Override
            public void start(Stage primaryStage) throws Exception{
                TextField text =new TextField();
                text.setStyle("-fx-font-weight: bold");
                BorderPane p1 = new BorderPane();
                GridPane p = new GridPane();
                p1.setTop(text);
                p1.setCenter(p);
                Scene s=new Scene(p1,450,200);
                primaryStage.setScene(s);
                primaryStage.setTitle("Simple Calculator");


                Button b1 =new Button("1");
                Button b2 =new Button("2");
                Button b3 =new Button("3");
                Button b4 =new Button("4");
                Button b5 =new Button("5");
                Button b6 =new Button("6");
                Button b7 =new Button("7");
                Button b8 =new Button("8");
                Button b9 =new Button("9");
                Button b0 =new Button("0");
                Button bdot =new Button(".");
                Button bequal =new Button("=");
                Button bplus =new Button("+");
                Button bminus =new Button("-");
                Button bdiv =new Button("/");
                Button bprod =new Button("*");
                Button bpi =new Button("π");
                Button bsqrt =new Button("√");
                Button bpow =new Button("x^2");
                Button bfact =new Button("n!");
                Button bsin =new Button("sin");
                Button bcos =new Button("cos");
                Button btan =new Button("tan");
                Button bclr =new Button("CLR");

                b0.setStyle("-fx-font-weight: bold ; -fx-background-color: #f2e6ff; -fx-text-fill: #000000;-fx-border-color: #e6ccff; -fx-border-width: 2px;");
                b1.setStyle("-fx-font-weight: bold ; -fx-background-color: #f2e6ff; -fx-text-fill: #000000;-fx-border-color: #e6ccff; -fx-border-width: 2px;");
                b2.setStyle("-fx-font-weight: bold ; -fx-background-color: #f2e6ff; -fx-text-fill: #000000;-fx-border-color: #e6ccff; -fx-border-width: 2px;");
                b3.setStyle("-fx-font-weight: bold ; -fx-background-color: #f2e6ff; -fx-text-fill: #000000;-fx-border-color: #e6ccff; -fx-border-width: 2px;");
                b4.setStyle("-fx-font-weight: bold ; -fx-background-color: #f2e6ff; -fx-text-fill: #000000;-fx-border-color: #e6ccff; -fx-border-width: 2px;");
                b5.setStyle("-fx-font-weight: bold ; -fx-background-color: #f2e6ff; -fx-text-fill: #000000;-fx-border-color: #e6ccff; -fx-border-width: 2px;");
                b6.setStyle("-fx-font-weight: bold ; -fx-background-color: #f2e6ff; -fx-text-fill: #000000;-fx-border-color: #e6ccff; -fx-border-width: 2px;");
                b7.setStyle("-fx-font-weight: bold ; -fx-background-color: #f2e6ff; -fx-text-fill: #000000;-fx-border-color: #e6ccff; -fx-border-width: 2px;");
                b8.setStyle("-fx-font-weight: bold ; -fx-background-color: #f2e6ff; -fx-text-fill: #000000;-fx-border-color: #e6ccff; -fx-border-width: 2px;");
                b9.setStyle("-fx-font-weight: bold ; -fx-background-color: #f2e6ff; -fx-text-fill: #000000;-fx-border-color: #e6ccff; -fx-border-width: 2px;");
                bsin.setStyle("-fx-font-weight: bold ; -fx-background-color: #e6f7ff; -fx-text-fill: #000000;-fx-border-color: #cceeff; -fx-border-width: 2px;");
                bcos.setStyle("-fx-font-weight: bold ; -fx-background-color: #e6f7ff; -fx-text-fill: #000000;-fx-border-color: #cceeff; -fx-border-width: 2px;");
                btan.setStyle("-fx-font-weight: bold ; -fx-background-color: #e6f7ff; -fx-text-fill: #000000;-fx-border-color: #cceeff; -fx-border-width: 2px;");
                bdot.setStyle("-fx-font-weight: bold ; -fx-background-color: #e6f7ff; -fx-text-fill: #000000;-fx-border-color: #cceeff; -fx-border-width: 2px;");
                bequal.setStyle("-fx-font-weight: bold ; -fx-background-color: #e6f7ff; -fx-text-fill: #000000;-fx-border-color: #cceeff; -fx-border-width: 2px;");
                bminus.setStyle("-fx-font-weight: bold ; -fx-background-color: #e6f7ff; -fx-text-fill: #000000;-fx-border-color: #cceeff; -fx-border-width: 2px;");
                bplus.setStyle("-fx-font-weight: bold ; -fx-background-color: #e6f7ff; -fx-text-fill: #000000;-fx-border-color: #cceeff; -fx-border-width: 2px;");
                bdiv.setStyle("-fx-font-weight: bold ; -fx-background-color: #e6f7ff; -fx-text-fill: #000000;-fx-border-color: #cceeff; -fx-border-width: 2px;");
                bprod.setStyle("-fx-font-weight: bold ; -fx-background-color: #e6f7ff; -fx-text-fill: #000000;-fx-border-color: #cceeff; -fx-border-width: 2px;");
                bfact.setStyle("-fx-font-weight: bold ; -fx-background-color: #e6f7ff; -fx-text-fill: #000000;-fx-border-color: #cceeff; -fx-border-width: 2px;");
                bpow.setStyle("-fx-font-weight: bold ; -fx-background-color: #e6f7ff; -fx-text-fill: #000000;-fx-border-color: #cceeff; -fx-border-width: 2px;");
                bsqrt.setStyle("-fx-font-weight: bold ; -fx-background-color: #e6f7ff; -fx-text-fill: #000000;-fx-border-color: #cceeff; -fx-border-width: 2px;");
                bclr.setStyle("-fx-font-weight: bold ; -fx-background-color: #e6f7ff; -fx-text-fill: #000000;-fx-border-color: #cceeff; -fx-border-width: 2px;");
                bpi.setStyle("-fx-font-weight: bold ; -fx-background-color: #e6f7ff; -fx-text-fill: #000000;-fx-border-color: #cceeff; -fx-border-width: 2px;");

                b1.setPrefSize(75, 50);
                b2.setPrefSize(75, 50);
                b3.setPrefSize(75, 50);
                b4.setPrefSize(75, 50);
                b5.setPrefSize(75, 50);
                b6.setPrefSize(75, 50);
                b7.setPrefSize(75, 50);
                b8.setPrefSize(75, 50);
                b9.setPrefSize(75, 50);
                b0.setPrefSize(75, 50);
                bplus.setPrefSize(75, 50);
                bminus.setPrefSize(75, 50);
                bdiv.setPrefSize(75, 50);
                bprod.setPrefSize(75, 50);
                bequal.setPrefSize(75, 50);
                bdot.setPrefSize(75, 50);
                bsin.setPrefSize(75, 50);
                bcos.setPrefSize(75, 50);
                btan.setPrefSize(75, 50);
                bfact.setPrefSize(75, 50);
                bclr.setPrefSize(75, 50);
                bpow.setPrefSize(75, 50);
                bsqrt.setPrefSize(75, 50);
                bpi.setPrefSize(75, 50);

                p.addColumn(0,bsin);
                p.addColumn(1,bpi);
                p.addColumn(2,b7);
                p.addColumn(3,b8);
                p.addColumn(4,b9);
                p.addColumn(5,bdiv);
                p.addColumn(0,bcos);
                p.addColumn(1,bsqrt);
                p.addColumn(2,b4);
                p.addColumn(3,b5);
                p.addColumn(4,b6);
                p.addColumn(5,bprod);
                p.addColumn(0,btan);
                p.addColumn(1,bpow);
                p.addColumn(2,b1);
                p.addColumn(3,b2);
                p.addColumn(4,b3);
                p.addColumn(5,bminus);
                p.addColumn(0,bclr);
                p.addColumn(1,bfact);
                p.addColumn(2,bdot);
                p.addColumn(3,b0);
                p.addColumn(4,bequal);
                p.addColumn(5,bplus);

                p.setHgap(4);
                p.setVgap(4);


                                         // *** Action *** \\

                b1.setOnAction(e -> {String str = text.getText() + "1";text.setText(str);});
                b2.setOnAction(e -> {String str = text.getText() + "2";text.setText(str);});
                b3.setOnAction(e -> {String str = text.getText() + "3";text.setText(str);});
                b4.setOnAction(e -> {String str = text.getText() + "4";text.setText(str);});
                b5.setOnAction(e -> {String str = text.getText() + "5";text.setText(str);});
                b6.setOnAction(e -> {String str = text.getText() + "6";text.setText(str);});
                b7.setOnAction(e -> {String str = text.getText() + "7";text.setText(str);});
                b8.setOnAction(e -> {String str = text.getText() + "8";text.setText(str);});
                b9.setOnAction(e -> {String str = text.getText() + "9";text.setText(str);});
                b0.setOnAction(e -> {String str = text.getText() + "0";text.setText(str);});
                bdot.setOnAction(e->{String str = text.getText() + ".";text.setText(str); bdot.setDisable(true);});
                bpi.setOnAction(e-> { text.setText(String.valueOf(Math.PI)); });
                bclr.setOnAction(e->{text.setText("");});

                bplus.setOnAction(e -> { x= Double.parseDouble(text.getText());  n='+';  text.setText(""); bdot.setDisable(false);});
                bminus.setOnAction(e-> { x= Double.parseDouble(text.getText());  n='-';  text.setText(""); bdot.setDisable(false);});
                bprod.setOnAction(e -> { x= Double.parseDouble(text.getText());  n='*';  text.setText(""); bdot.setDisable(false);});
                bdiv.setOnAction(e  -> { x= Double.parseDouble(text.getText());  n='/';  text.setText(""); bdot.setDisable(false);});

                bsin.setOnAction(e-> { x = Double.parseDouble(text.getText());x = Math.sin(Math.toRadians(x));
                                       text.setText(String.valueOf(x));});
                bcos.setOnAction(e-> { x = Double.parseDouble(text.getText());x = Math.cos(Math.toRadians(x));
                                       text.setText(String.valueOf(x));});
                btan.setOnAction(e-> { x = Double.parseDouble(text.getText());x = Math.tan(Math.toRadians(x));
                                       text.setText(String.valueOf(x));});
                bsqrt.setOnAction(e-> { x = Double.parseDouble(text.getText());x = Math.sqrt(x);
                                       text.setText(String.valueOf(x));});
                bpow.setOnAction(e-> { x = Double.parseDouble(text.getText());x = Math.pow(x,2);
                                       text.setText(String.valueOf(x));});
                bfact.setOnAction(e-> { x = Double.parseDouble(text.getText());x = fact(x);
                                       text.setText(String.valueOf(x));});



                bequal.setOnAction(e -> { y = Double.parseDouble(text.getText());

                if (n =='+') { res=x + y; }
                else if (n =='-') { res=x - y; }
                else if (n =='*') { res=x * y; }
                else if (n =='/') { res=x / y; }

                text.setText(String.valueOf(res)); });


                primaryStage.setResizable(false);
                primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
