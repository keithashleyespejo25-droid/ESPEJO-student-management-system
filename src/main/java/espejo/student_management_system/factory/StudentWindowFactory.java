package espejo.student_management_system.factory;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public final class StudentWindowFactory {
    private StudentWindowFactory() {
    }

    public static Scene createScene() throws IOException {
        FXMLLoader loader = new FXMLLoader(StudentWindowFactory.class.getResource("/espejo/student_management_system/student-view.fxml"));
        return new Scene(loader.load());
    }
}
