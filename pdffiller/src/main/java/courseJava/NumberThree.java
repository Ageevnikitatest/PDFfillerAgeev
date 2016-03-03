package courseJava;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANS on 29/02/16.
 */


public class NumberThree {

    public static void main(String[] args) {

    List<Integer> list1 = new ArrayList();
    List<Integer> list2 = new ArrayList();
    List<Integer> numbers = new ArrayList<>();
    int a = 0;
    int array[] = {2, 4, 6, 8, 10, 22, 34, 40, -5, 12, 14, 46, 46, 54, 38, 92};
 


        for (int i = 0; i < array.length; i++) {

            numbers.add(array[i]);
        }
        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {   //вытягивает из листа поочередно все значения


            if (numbers.get(Integer.valueOf(i)) > 0) {            // берем значения которые больше 0 (положительные)
                list1.add(numbers.get(Integer.valueOf(i)));

            }

            else{
                a=i;
                for (  ; i < numbers.size(); i++){
                    list2.add(numbers.get(Integer.valueOf(i)));
                }

                break;
            }
        }

        numbers.remove(a);
        list2.remove(0);

        System.out.println(list1);
        System.out.println(list2);


        }
    }





