package com.company;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        String s = "Гаделия";
        Calendar d = Calendar.getInstance();
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,2023);
        c.set(Calendar.MONTH,Calendar.MARCH);
        c.set(Calendar.DAY_OF_MONTH,3);
        c.set(Calendar.HOUR,17);
        c.set(Calendar.MINUTE,15);
        c.set(Calendar.SECOND,0);
        
        System.out.format("Студент: %s\n",s);
        System.out.format("Получил: %s\n",c.getTime());
        System.out.format("Показал: %s\n",d.getTime());
    }
}
