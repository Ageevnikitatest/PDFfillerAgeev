package com.company.Lessons;

/**
 * Created by Никита on 02/04/15.
 */
public class Zadanie_4 {

    public String name;
    public static String Material = "Бумага";   // переменные класса , поля класса
    public static  int Vysota = 10;
    public  int procentZapolnennost;



    public Zadanie_4(String name) {            // конструктор класса
         this.name = name;
    }


    public void  Nalit (int n) {
        procentZapolnennost = n + procentZapolnennost;  // metod

    }

    public int procentZapolnennost() {                  // metod

        return procentZapolnennost;

    }

    public int Vilit() {
        int v =  procentZapolnennost;

        procentZapolnennost = 0;                      // metod
        return v ;
    }




    public static void main(String[] args) {                // объект

        Zadanie_4 stakan1 = new Zadanie_4("Supper");             //Стакан 1
        Zadanie_4 stakan2 = new Zadanie_4("Bigger");          // Стакан 2

        String name1 = "Имя 1го стакана : ";
        String name2 = "Имя 2го стакана : ";
        String material = "Материал стаканов : ";
        String visota = "Высота стаканов: ";
        String  zap1  = "Стакан 1 заполнен на : ";
        String  zap2  = "Стакан 2 заполнен на : ";
        String Pzap1 = "После наполнения 1й стакан заполнен на : ";
        String Pzap2 = "После наполнения 2й стакан заполнен на : ";
        String vil1 = "После выливания 1й стакан  заполнен на : ";
        String vil2 = "После выливания 2й стакан  заполнен на : ";


        System.out.println(name1 + stakan1.name);
        System.out.println(name2 + stakan2.name + "\n");
        System.out.println(material + Zadanie_4.Material);                         //Выводы
        System.out.println(visota + Zadanie_4.Vysota + " см" + "\n");
        System.out.println( zap1+ stakan1.procentZapolnennost() + " %");
        System.out.println( zap2+ stakan2.procentZapolnennost() + " %" + "\n");

        stakan1.Nalit(30);             // Налили
        stakan2.Nalit(15);

        System.out.println(Pzap1 + stakan1.procentZapolnennost()+ " %" );                   //Выводы
        System.out.println(Pzap2 + stakan2.procentZapolnennost()+ " %" + "\n");

        stakan1.Vilit();
        stakan2.Vilit();                //Вылили

        System.out.println("Вылили" + "\n");
        System.out.println( vil1 + stakan1.procentZapolnennost + " %");                   // Вывод
        System.out.println( vil2 + stakan2.procentZapolnennost + " %" + "\n");






    }




}