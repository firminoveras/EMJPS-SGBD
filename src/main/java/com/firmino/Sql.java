package com.firmino;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class Sql extends Thread implements onPostExecuteListener {

    private final String mQuery;
    private static Connection conexaoBD;
    private static String password;

    public static void setPassword(String pw) {
        password = pw;
    }

    public Sql(String query) {
        this.mQuery = query;
    }

    @Override
    public void run() {
        System.out.println("Query: " + mQuery);
        ResultSet resultadoSQL = null;
        try {
            if (conexaoBD != null) {
                while (true) {
                    if (conexaoBD.isClosed()) {
                        break;
                    }
                }
            }
            conexaoBD = DriverManager.getConnection("jdbc:postgresql://motty.db.elephantsql.com:5432/popbjumd", "popbjumd", password);
            resultadoSQL = conexaoBD.createStatement().executeQuery(mQuery);
            onQueryConcluida(resultadoSQL);
        } catch (SQLException e) {
            if (e.getLocalizedMessage().contains("Nenhum resultado foi retornado pela consulta")) {                
                onQueryConcluida(resultadoSQL);
            } else {
                onQueryErro(e.getLocalizedMessage());
            }
            System.out.println("ERRO: " + e.getLocalizedMessage());
        } finally {
            if (conexaoBD != null) {
                try {
                    conexaoBD.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getLocalizedMessage());
                }
            }
        }
    }
}

interface onPostExecuteListener {

    void onQueryConcluida(ResultSet rs);

    void onQueryErro(String feedback);
}
