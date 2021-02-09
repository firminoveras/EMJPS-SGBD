package com.firmino;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sql extends Thread {

    private final String mQuery;
    private static Connection conexaoBD;
    private onPostExecuteListener mPostExecuteListener = (rs, fb) -> {
    };

    public Sql(String query) {
        this.mQuery = query;
    }

    @Override
    public void run() {
        ResultSet resultadoSQL = null;
        String feedback = "";
        try {
            if (conexaoBD != null) {
                while (true) {
                    if (conexaoBD.isClosed()) {
                        break;
                    }
                }
            }
            conexaoBD = DriverManager.getConnection("jdbc:postgresql://motty.db.elephantsql.com:5432/popbjumd", "popbjumd", SqlConfig.key);
            resultadoSQL = conexaoBD.createStatement().executeQuery(mQuery);
        } catch (SQLException e) {
            if (!e.getLocalizedMessage().contains("Nenhum resultado foi retornado pela consulta")) {
                feedback = e.getLocalizedMessage();
            }
        } finally {
            try {
                if (conexaoBD != null) {
                    conexaoBD.close();
                }
            } catch (SQLException throwables) {
                feedback += " AND " + throwables.getMessage();
            }
        }
        mPostExecuteListener.onQueryConcluida(resultadoSQL, feedback);
    }

    public Sql setOnPostExecuteListener(onPostExecuteListener postExecuteListener) {
        this.mPostExecuteListener = postExecuteListener;
        return this;
    }

    public interface onPostExecuteListener {

        void onQueryConcluida(ResultSet rs, String feedback);
    }
}
