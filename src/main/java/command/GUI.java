package command;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GUI extends Application {

    private Grid grid = new Grid();
    private int gridWidth = grid.getWidth();
    private int gridHeight = grid.getHeight();
    private Rectangle[][] cells = new Rectangle[gridWidth][gridHeight];

    static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // Draw window and grid
        GridPane gridPane = new GridPane();

        for (int y = 0; y < gridHeight; y++) {
            for (int x = 0; x < gridWidth; x++) {
                Rectangle cell = new Rectangle(40, 40);
                cell.setFill(Color.WHITE);
                cell.setStroke(Color.LIGHTGRAY);
                cell.setStrokeWidth(1);
                cells[y][x] = cell;
                gridPane.add(cell, x, y);
            }
        }

        Button codeButton = new Button("Generate Code");
        codeButton.setFocusTraversable(false);
        Command codeCommand = new GenerateCodeCommand(grid);
        codeButton.setOnAction(e -> codeCommand.execute());

        VBox root = new VBox();
        root.getChildren().addAll(gridPane, codeButton);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        refreshGrid();

        // Set up keys
        Command downCommand = new MoveCursorDownCommand(grid);
        Command upCommand = new MoveCursorUpCommand(grid);
        Command leftCommand = new MoveCursorLeftCommand(grid);
        Command rightCommand = new MoveCursorRightCommand(grid);
        Command toggleCommand = new TogglePixelCommand(grid);

        scene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case DOWN -> downCommand.execute();
                case UP -> upCommand.execute();
                case LEFT -> leftCommand.execute();
                case RIGHT -> rightCommand.execute();
                case SPACE -> toggleCommand.execute();
            }
            refreshGrid();
        });
    }

    private void refreshGrid() {
        int[][] g = grid.getGrid();

        for (int y = 0; y < gridHeight; y++) {
            for (int x = 0; x < gridWidth; x++) {
                Rectangle cell = cells[y][x];

                if (g[y][x] == 0) {
                    cell.setFill(Color.WHITE);
                } else {
                    cell.setFill(Color.BLACK);
                }
                if (x == grid.getX() && y == grid.getY()) {
                    cell.setStroke(Color.RED);
                } else {
                    cell.setStroke(Color.LIGHTGRAY);
                }
            }
        }
    }
}
