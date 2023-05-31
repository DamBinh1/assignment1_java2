package assigmennt1_java2;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class CreateController{
    public TextField txtName;
    public TextField txtRoom;
    public TextField txtKey;

    public void backToList(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }

    public void submit(ActionEvent actionEvent) {
        try {
            String name = txtName.getText();
            String room = txtRoom.getText();
            String key = txtKey.getText();
            for (Class s: HomeController.listClasses){
                if(s.getName().equals(name))
                    throw new Exception("Tên lớp đã tồn tại");
                if(s.getRoom().equals(room))
                    throw new Exception("Phòng này đã được dùng");
            }
            Class cl = new Class(name,room,key);
            HomeController.listClasses.add(cl);
            backToList(null);
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }
}

