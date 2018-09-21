import java.util.Scanner;

import java.util.*;

public class TestMachine {

    public static int price;

    public static void main (String[] args) {



        TestMachine.price = 1000;
        TestMachine.price+= 2000;
        TestMachine.price++;

        TestMachine c1 = new TestMachine();
        TestMachine c3 = new TestMachine();

        c1.price++;
        c1.price++;
        c3.price++;

        System.out.println(TestMachine.price);
        System.out.println(c1.price);










//        Scanner sc = new Scanner(System.in);
//
//        Machine[] M = new Machine[10];
//        M[0] = new Printer();
//        M[1] = new Printer();
//        M[2] = new Printer();
//        M[3] = new Smartphone();
//        M[4] = new Smartphone();
//        M[5] = new Smartphone();
//        M[6] = new Smartphone();
//        M[7] = new Scan();
//        M[8] = new Scan();
//        M[9] = new Scan();
//
//        M[0].setName("Printer A");
//        M[0].setWeight(30);
//        M[0].setPrice(100);
//        M[0].setDescriptions("Black");
//
//        M[1].setName("Printer B");
//        M[1].setWeight(60);
//        M[1].setPrice(10);
//        M[1].setDescriptions("White");
//
//        M[2].setName("Printer C");
//        M[2].setWeight(0);
//        M[2].setPrice(1000);
//        M[2].setDescriptions("Grey");
//
//        M[3].setName("Smartphone A");
//        M[3].setWeight(.40);
//        M[3].setPrice(300);
//        M[3].setDescriptions("Blue");
//
//        M[4].setName("Smartphone B");
//        M[4].setWeight(.6);
//        M[4].setPrice(1000);
//        M[4].setDescriptions("Green");
//
//        M[5].setName("Smartphone C");
//        M[5].setWeight(.1);
//        M[5].setPrice(100);
//        M[5].setDescriptions("Red");
//
//        M[6].setName("Smartphone D");
//        M[6].setWeight(.26);
//        M[6].setPrice(220);
//        M[6].setDescriptions("Orange");
//
//        M[7].setName("Scanner A");
//        M[7].setWeight(10);
//        M[7].setPrice(100);
//        M[7].setDescriptions("White");
//
//        M[8].setName("Scanner B");
//        M[8].setWeight(30);
//        M[8].setPrice(40);
//        M[8].setDescriptions("Grey");
//
//        M[9].setName("Scanner C");
//        M[9].setWeight(2);
//        M[9].setPrice(500);
//        M[9].setDescriptions("Black");
//
//        for(int i = 0; i < 10; i++){
//            System.out.println("Machine: " + (i+1));
//            System.out.println("Name: " + M[i].getName());
//            System.out.println("Description: " + M[i].getDescription());
//            System.out.println("Price: " + M[i].getPrice());
//            System.out.println("Weight: " + M[i]. getWeight());
//            System.out.println();
//        }
    }
}







//
//                System.out.println(sm1.getName());
//                System.out.println(sm1.getPrice());
//                System.out.println(sm1.getWeight());
//                System.out.println(sm1.getDescription());