package org.example;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.h2.tools.Server;

public class Application {

    public static void main(String[] args) throws Exception {
        startDatabase();

        boolean benne = false;
        User teszt1 = new User();
        teszt1.setVnev("Teszt");
        teszt1.setKnev("Elekné");
        teszt1.setUsername("tesztelek2");
        teszt1.setEmail("teszt@elek.hu");
        teszt1.setCreditCardNumber("0000 1111 2222 3333");
        teszt1.setPassword("12345");
        teszt1.setGender(GenderType.NO);
        teszt1.setSzem(SzemSzin.Zöld);
        teszt1.setHajszin(Hajszin.Barna);
        teszt1.setDatum("2001.03.25");
        teszt1.setNyereseg(1000);
        teszt1.setVeszteseg(100);

        try (JpaCasinoDAO userDAO = new JpaCasinoDAO();) {
            for (var user : userDAO.getUser()) {
                if (user.getUsername().equals(teszt1.getUsername())) {
                    System.out.println("HIBA! Ez a felhasználónév már szerepel!");
                    benne = true;
                    break;
                }
            }
            if (!benne){
                userDAO.saveUser(teszt1);
            }
        }


        System.out.println("Open your browser and navigate to http://localhost:8082/");
        System.out.println("JDBC URL: jdbc:h2:file:~/my_database");
        System.out.println("User Name: sa");
        System.out.println("Password: ");

    }

    private static void startDatabase() throws SQLException {
        new Server().runTool("-tcp", "-web", "-ifNotExists");
    }
}
