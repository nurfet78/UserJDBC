package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Иван", "Иванов", (byte) 32);
        userService.saveUser("Петр", "Петров", (byte) 21);
        userService.saveUser("Михаил", "Сидоров", (byte) 34);
        userService.saveUser("Алиса", "Селезнева", (byte) 22);
        userService.saveUser("Юлия", "Жураковская", (byte) 19);

        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();

        userService.cleanup();
    }
}
