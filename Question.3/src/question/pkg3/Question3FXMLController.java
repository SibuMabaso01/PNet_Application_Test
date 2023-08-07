package question.pkg3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class Question3FXMLController{

    @FXML
    private Button btnApply;

    @FXML
    private ComboBox<String> cbxYears;

    @FXML
    private TextField edtName;

    @FXML
    private TextField edtPosition;

    @FXML
    private ImageView image;
    
    String name, position, years;
    
    public void initialize(){
        cbxYears.getItems().add("1-5");
        cbxYears.getItems().add("6-10");
        cbxYears.getItems().add("11-20");
        
    }

    @FXML
    void btnApplyPressed(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        Alert alert1 = new Alert(Alert.AlertType.ERROR);
        
        years = (String)cbxYears.getValue();
        name = (String)edtName.getText();
        position = (String)edtPosition.getText();
        
        
        if((name.isEmpty()) || (position.isEmpty())){
           alert1.setTitle("Error");
           
           alert1.setHeaderText("One or more fields are empty");
           alert1.showAndWait();
       } else{
            alert.setTitle("Application Sent");
             
            alert.setHeaderText("Application Details\n"
                   + "Applicant Name: " + name
                   + "\nPosition Applied: " + position
                   + "\nYears of Experience: "  + years);
            alert.showAndWait();
                   
       }
    }

}
