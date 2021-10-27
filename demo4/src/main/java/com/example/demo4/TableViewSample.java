package com.example.demo4;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TableViewSample extends Application {
    Stage window;
    TableView<Product> table;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("Table View");

        TableColumn<Product, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Product, Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        TableColumn<Product, String> qualityColumn = new TableColumn<>("Quality");
        qualityColumn.setMinWidth(100);
        qualityColumn.setCellValueFactory(new PropertyValueFactory<>("quality"));

        table = new TableView<>();
        table.setItems(getProducts());
        table.getColumns().addAll(nameColumn, priceColumn, qualityColumn);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table);

        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();
    }
    public ObservableList<Product>getProducts(){
        ObservableList<Product>products = FXCollections.observableArrayList();
        products.add(new Product("Laptop", 500 , 700));
        products.add(new Product("charger", 2500 , 7));
        products.add(new Product("mouse", 400 , 20));
        products.add(new Product("Keyboard", 900 , 15));
        products.add(new Product("RAM", 8000 , 10));
        products.add(new Product("Battery", 4000 , 2));
        products.add(new Product("Screen in", 10000 , 1));
        return products;

    }
}
