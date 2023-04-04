import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) throws SQLException {

        final String user = "postgres";
        final String password = "123RaMoS174RUS321";
        final String url = "jdbc:postgresql://localhost:5432/skypro";

        try (final Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM employee WHERE ID = (?)")) {
            statement.setInt(1, 2);
            final ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String name = "Имя " + resultSet.getString("имя");
                String lastname = "Семья " + resultSet.getString("фамилия");
                String gender = "Пол " + resultSet.getString(4);
                int age = resultSet.getInt(5);

                System.out.println(name);
                System.out.println(lastname);
                System.out.println(gender);
                System.out.println("Возраст " + age);
            }
        }
    }
}





