package com.example.l1q4;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

import java.io.IOException;

public class SalesPieChart extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        ObservableList<PieChart.Data> piedata = FXCollections.observableArrayList(
                new PieChart.Data("Jan 2016", 2500),
                new PieChart.Data("Feb 2016", 1600),
                new PieChart.Data("Mac 2016", 2000),
                new PieChart.Data("Apr 2016", 2700),
                new PieChart.Data("May 2016", 3200),
                new PieChart.Data("Jun 2016", 800)

        );
        // Create piechart and assign data
        PieChart pchart = new PieChart(piedata);

        //set properties
        pchart.setTitle("Sales of Products in 2016");
        Group root = new Group(pchart);
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Pie Chart");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}