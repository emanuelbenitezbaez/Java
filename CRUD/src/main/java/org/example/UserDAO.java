package org.example;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    public void createUser(String name, String email) {
        String query = "INSERT INTO users (name, email) VALUES (?, ?)";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
             statement.setString(1, name);
             statement.setString(2, email);
             statement.executeUpdate();
        }
        catch (SQLException e) { e.printStackTrace();
        }
    }

    public void readUsers() { String query = "SELECT * FROM users"; try (Connection connection = DatabaseConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery()) {
        while (resultSet.next()) {
            System.out.println("ID: " + resultSet.getInt("id")); System.out.println("Name: " + resultSet.getString("name"));
            System.out.println("Email: " + resultSet.getString("email")); } } catch (SQLException e) { e.printStackTrace();
    }
    }

    public void updateUser(int id, String name, String email) {
        String query = "UPDATE users SET name = ?, email = ? WHERE id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, name); statement.setString(2, email);
            statement.setInt(3, id); statement.executeUpdate();
        }
        catch (SQLException e) { e.printStackTrace();
        }
    }

    public void deleteUser(int id) { String query = "DELETE FROM users WHERE id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) { statement.setInt(1, id);
            statement.executeUpdate();
        }
        catch (SQLException e) { e.printStackTrace();
        }
    }


}
