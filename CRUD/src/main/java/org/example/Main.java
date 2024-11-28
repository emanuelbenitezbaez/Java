package org.example;

public class Main {
    public static void main(String[] args) {

        UserDAO userDAO = new UserDAO(); // Crear un nuevo usuario//
        userDAO.createUser("John Doe", "john.doe@example.com");
        // Agregar dos usuarios más
        userDAO.createUser("Alice Smith", "alice.smith@example.com");
        userDAO.createUser("Bob Johnson", "bob.johnson@example.com");

        // Leer todos los usuarios
        userDAO.readUsers();

        // Actualizar un usuario
        userDAO.updateUser(1, "Jane Doe", "jane.doe@example.com");

        // Eliminar un usuario
      //  userDAO.deleteUser(1);


        // Leer todos los usuarios nuevamente
        userDAO.readUsers();


    }
}