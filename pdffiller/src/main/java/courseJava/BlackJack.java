package courseJava;

import java.util.*;

/**
 * Created by ANS on 19/10/15.
 */


public class BlackJack  {

    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();
        Scanner userInput = new Scanner( System.in );
        String inputTextUser;
        List<Card> koloda = new ArrayList<>();

        koloda.add(new Card(2,"pika"));
        koloda.add(new Card(2,"cherva"));
        koloda.add(new Card(2,"kresta"));
        koloda.add(new Card(2,"bybna"));
        koloda.add(new Card(3,"pika"));
        koloda.add(new Card(3,"cherva"));
        koloda.add(new Card(3,"kresta"));
        koloda.add(new Card(3,"bybna"));
        koloda.add(new Card(4,"pika"));
        koloda.add(new Card(4,"cherva"));
        koloda.add(new Card(4,"kresta"));
        koloda.add(new Card(4,"bybna"));
        koloda.add(new Card(5,"pika"));
        koloda.add(new Card(5,"cherva"));
        koloda.add(new Card(5,"kresta"));
        koloda.add(new Card(5,"bybna"));
        koloda.add(new Card(6,"pika"));
        koloda.add(new Card(6,"cherva"));
        koloda.add(new Card(6,"kresta"));
        koloda.add(new Card(6,"bybna"));
        koloda.add(new Card(7,"pika"));
        koloda.add(new Card(7,"cherva"));
        koloda.add(new Card(7,"kresta"));
        koloda.add(new Card(7,"bybna"));
        koloda.add(new Card(8,"pika"));
        koloda.add(new Card(8,"cherva"));
        koloda.add(new Card(8,"kresta"));
        koloda.add(new Card(8,"bybna"));
        koloda.add(new Card(9,"pika"));
        koloda.add(new Card(9,"cherva"));
        koloda.add(new Card(9,"kresta"));
        koloda.add(new Card(9,"bybna"));
        koloda.add(new Card(10,"10-ka pika"));
        koloda.add(new Card(10,"10-ka cherva"));
        koloda.add(new Card(10,"10-ka kresta"));
        koloda.add(new Card(10,"10-ka bybna"));
        koloda.add(new Card(10,"Korol pika"));
        koloda.add(new Card(10,"Korol cherva"));
        koloda.add(new Card(10,"Korol kresta"));
        koloda.add(new Card(10,"Korol bybna"));
        koloda.add(new Card(10,"Valet pika"));
        koloda.add(new Card(10,"Valet cherva"));
        koloda.add(new Card(10,"Valet kresta"));
        koloda.add(new Card(10,"Valet bybna"));
        koloda.add(new Card(10,"Dama pika"));
        koloda.add(new Card(10,"Dama cherva"));
        koloda.add(new Card(10,"Dama kresta"));
        koloda.add(new Card(10,"Dama bybna"));
        koloda.add(new Card(11,"Tyz pika"));
        koloda.add(new Card(11,"Tyz cherva"));
        koloda.add(new Card(11,"Tyz kresta"));
        koloda.add(new Card(11,"Tyz bybna"));



        int onHand ;
        int onHandBot1 ;
        int onHand2 = 0;
        int onHandBot2 = 0;

        System.out.println(" *** Сдать карту ? *** ");
        inputTextUser = userInput.next();
        System.out.println("\n");


        while (inputTextUser.equals("да")) {


            int randIndex = random.nextInt(koloda.size());
            Card rand = koloda.get(randIndex) ;

            onHand = onHand2 + rand.value;
            koloda.remove(randIndex);

            System.out.println("Сдано: " + rand.value + " " + "("+rand.lear +")"+   "\n" + "Сумма: "+   onHand +"\n" );



            if (onHand > 21) {
                System.out.println("\n" + " *** Перебор ***" + "\n");
                break;
            }

            if (onHand == 21) {
                Thread.sleep(1000);
               // System.out.println("!!! Вы выиграли !!!" + "\n");
                break;
            }

                else
                onHand2 = onHand;

                System.out.println( " Еще карту ?  " + "\n");
                inputTextUser = userInput.next();
                System.out.println("\n");

            }

        int iAm = onHand2;



        while (onHandBot2 != 21) {

                    int randIndex = random.nextInt(koloda.size());
                Card randBot = koloda.get(randIndex) ;

                onHandBot1 = onHandBot2 + randBot.value;
                koloda.remove(randIndex);

                System.out.println("Сдано BANK: " + randBot.value + " " + "("+randBot.lear +")"+   "\n" + "Сумма у BANK : "+   onHandBot1 +"\n" );
                    Thread.sleep(2000);


                if (onHandBot1 > 21) {
                    System.out.println("\n" + " *** У BANK перебор ***");
                    break;
                }

                if (onHandBot1 == 21) {
                    Thread.sleep(2000);
                   System.out.println(" !!! BANK Выиграл !!!");
                    break;
                }

                 else

                onHandBot2 = onHandBot1;


                if  (onHandBot2 < iAm){
                    System.out.println("BANK берет еще карту" + "\n");
                    Thread.sleep(3000);
                }

                    if (onHandBot2 > iAm ){
                        System.out.println("***  Bank выиграл  ***");
                        break;
                    }

                if (onHandBot2 == iAm){
                    System.out.println("***  НИЧЬЯ  ***");
                    break;
                 }

                }
            }
        }





