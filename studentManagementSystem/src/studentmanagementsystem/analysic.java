package studentmanagementsystem;

import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class analysic
{
    @FXML
    public Label analysic_10 = new Label();

    @FXML
    public Label analysic_9 = new Label();

    @FXML
    public Label analysic_8 = new Label();

    private Connection connect;
    private PreparedStatement prepare;

    private ResultSet result;

    public void analysicDisplayTotal10() {


        String sql = "SELECT COUNT(id) FROM student_grade WHERE first_sem = 10.0 OR second_sem= 10.0 ";

        connect = database.connectDb();

        int countEnrolled = 0;

        try {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            if (result.next()) {
                countEnrolled = result.getInt("COUNT(id)");
            }

            analysic_10.setText(String.valueOf(countEnrolled));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void analysicDisplayTotal9() {

        String sql = "SELECT COUNT(id) FROM student_grade WHERE first_sem = 9.0 OR second_sem=9.0";

        connect = database.connectDb();

        try {
            int countFemale = 0;

            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            if (result.next()) {
                countFemale = result.getInt("COUNT(id)");
            }

            analysic_9.setText(String.valueOf(countFemale));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void analysicDisplayTotal8() {


        String sql = "SELECT COUNT(id) FROM student_grade WHERE first_sem = 8.0 OR second_sem= 8.0";

        connect = database.connectDb();

        try {
            int countMale = 0;

            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            if (result.next()) {
                countMale = result.getInt("COUNT(id)");
            }
            analysic_8.setText(String.valueOf(countMale));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


