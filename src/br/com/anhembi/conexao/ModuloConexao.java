package br.com.anhembi.conexao;

import java.sql.*;
import java.sql.Connection;

public class ModuloConexao {

    public static Connection conector() {
        Connection conexao = null;

        String driver = "com.mysql.cj.jdbc.Driver";

        String url = "jdbc:mysql://localhost:3306/oficinabd?characterEncoding=utf-8";
        String user = "dba";
        String password = "infox@1234";

        try
        {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e)
        {
            return null;
        }
    }
}
