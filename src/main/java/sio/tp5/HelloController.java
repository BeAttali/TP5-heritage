package sio.tp5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {

    @FXML
    private TableColumn tcDescritption;
    @FXML
    private TableColumn tcPrix;
    @FXML
    private TableView tvTP5;

    @Override
    public void initialize() {
        tcDescritption.setCellValueFactory(new PropertyValueFactory<>("description"));
        tcPrix.setCellValueFactory(new PropertyValueFactory<>("prix"));
    }

}
