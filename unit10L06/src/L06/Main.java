package L06;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();

        System.out.println(now);

        java.sql.Date date = new java.sql.Date(476789);
        System.out.println(date);
    }
}