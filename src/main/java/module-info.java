module ec.edu.espol.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;

    opens ec.edu.espol.tictactoe to javafx.fxml;
    exports ec.edu.espol.tictactoe;
}
