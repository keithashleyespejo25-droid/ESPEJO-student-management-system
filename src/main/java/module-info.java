module espejo.student_management_system {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires io.github.cdimascio.dotenv.java;

    opens espejo.student_management_system.controller to javafx.fxml;
    opens espejo.student_management_system.model to javafx.base;
    exports espejo.student_management_system.app;
}
