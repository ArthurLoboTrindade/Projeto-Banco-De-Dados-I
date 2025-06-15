package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	private static final String banco="postgres";//ALTERE O "postgres" para o banco de dados desejado
    private static final String URL = "jdbc:postgresql://localhost:5432/"+banco; 
    private static final String USER = "postgres"; //USER PADRÃO DO BANCO OU ALTERE
    private static final String PASSWORD = "postgres"; //SENHA PADRÃO DO BANCO OU ALTERE



	public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}