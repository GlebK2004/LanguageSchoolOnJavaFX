module help {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;
    requires com.google.gson;


    exports studentmanagementsystem.Models.TCP;

    exports  studentmanagementsystem.Models.Entities;

    opens studentmanagementsystem.Models.Entities to com.google.gson;
    opens studentmanagementsystem.Models.TCP to com.google.gson;
    opens studentmanagementsystem.Enums to com.google.gson;

    opens studentmanagementsystem;

}