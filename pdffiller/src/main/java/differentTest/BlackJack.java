package differentTest;

import java.util.*;

/**
 * Created by ANS on 19/10/15.
 */
public class BlackJack {

    public static int main(String[] args) throws InterruptedException {

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







        int naRykah1 ;
        int naRykah1Bot ;
        int naRykah2 =0;
        int naRykah2Bot =0;
        System.out.println(" *** Сдать карту ? *** ");
        inputTextUser = userInput.next();
        System.out.println("\n");


        while (inputTextUser.equals("да")) {


                int randIndex = random.nextInt(koloda.size());
                Card rand = koloda.get(randIndex) ;

                naRykah1 = naRykah2 + rand.value;

                 System.out.println("Сдано: " + rand.value + " " + "("+rand.lear +")"+   "\n" + "Сумма: "+   naRykah1 +"\n" );


            if (naRykah1 > 21) {
                System.out.println("\n" + " *** Перебор ***");
                break;
            }

            if (naRykah1 == 21) {
                Thread.sleep(1000);
                System.out.println(" !!! Вы выиграли !!!");
                break;
            }
                else
                naRykah2 = naRykah1;
                System.out.println( " Еще карту ?  " + "\n");
                inputTextUser = userInput.next();
                System.out.println("\n");


            if (inputTextUser.equals("да")){
                koloda.remove(randIndex);
            }
               // else  break;

            else {
                koloda.remove(randIndex);
                int iAm = naRykah2;



                while (naRykah2Bot != 21) {


                Card randBot = koloda.get(randIndex) ;

                naRykah1Bot = naRykah2Bot + randBot.value;
                koloda.remove(randIndex);

                System.out.println("Сдано BANK: " + randBot.value + " " + "("+randBot.lear +")"+   "\n" + "Сумма у BANK : "+   naRykah1Bot +"\n" );
                    Thread.sleep(2000);


                if (naRykah1Bot > 21) {
                    System.out.println("\n" + " *** У BANK перебор ***");
                    break;
                }

                if (naRykah1Bot == 21) {
                    Thread.sleep(2000);
                    System.out.println(" !!! BANK Выиграл !!!");
                    break;
                }
                else
                    naRykah2Bot = naRykah1Bot;

                if  (naRykah2Bot< iAm){



                    System.out.println("BANK берет еще карту" + "\n");
                    Thread.sleep(3000);


                }
                    if (naRykah2Bot>iAm){
                        System.out.println("***  Bank выиграл  ***");
                        break;
                    }

                if (naRykah2Bot == iAm){
                    System.out.println("***  НИЧЬЯ  ***");
                    break;
                }
                }

                return naRykah2Bot;
            }
        }
                return naRykah2;

    }
    }

