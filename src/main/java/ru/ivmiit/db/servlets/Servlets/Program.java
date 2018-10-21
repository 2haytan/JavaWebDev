package ru.ivmiit.db.servlets.Servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) throws Exception{
        String dbUser = "postgres";
        String dbPassword = "26bn93mco";
        String connectionUrl = "jdbc:postgresql://localhost:5432/fix_users";

        Connection connection = DriverManager.getConnection(connectionUrl,dbUser,dbPassword); // возвращает объект, который является подключением к БД
        /**
         * DriverManager - сервис для управления драйверами JDBC. Он сканирует загруженные классы и по ним ищет нужный драйвер
         */
        /**
         * Connection - подключение к БД, проедоставляет объект для доступа к БД. Автоматически сохраняет изменения в БД.
         */
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM fix_user"); // просто указатель

        while(resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
    }
}
