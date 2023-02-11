public class Homework1 {

    public static void main(String[]args) {
        int a = 333;

    // 16 - 10 переводим с систем
    System.out.println(333 / 16);  //20
     System.out.println(333 % 16);         //13
     System.out.println();
     System.out.println(20 / 16);   //1
     System.out.println(20 % 16);          //4
     System.out.println();
     System.out.println(1 / 16);   //0
     System.out.println(1 % 16);          //1
    System.out.println();

    int a16 = 0x14D; // 16 система
    System.out.println("Result 333 (10 -> 16) = " + a16);







        int b = 637;

        // 10 - 16 переводим с систем
        System.out.println(637 / 16);  //39
        System.out.println(637 % 16);         //13
        System.out.println();
        System.out.println(39 / 16);   //2
        System.out.println(39 % 16);          //7
        System.out.println();
        System.out.println(2 / 16);   //0
        System.out.println(2 % 16);          //2
        System.out.println();

        int b10 = 0x27D; // 16 система
        System.out.println("Result 637 (16 -> 10) = " + b10);
        System.out.println("Result 637 (10 -> 16) = " + b10);





        int c = 637;

        // 10 - 2 переводим с систем
        System.out.println(637 / 2);  //318
        System.out.println(637 % 2);         //1
        System.out.println();
        System.out.println(318 / 2);   //159
        System.out.println(318 % 2);          //0
        System.out.println();
        System.out.println(159 / 2);   //79
        System.out.println(159 % 2);          //1
        System.out.println();
        System.out.println(79 / 2);  //39
        System.out.println(79 % 2);         //1
        System.out.println();
        System.out.println(39 / 2);   //19
        System.out.println(39 % 2);          //1
        System.out.println();
        System.out.println(19 / 2);   //9
        System.out.println(19 % 2);          //1
        System.out.println();
        System.out.println(9 / 2);   //4
        System.out.println(9 % 2);          //1
        System.out.println();
        System.out.println(4 / 2);   //2
        System.out.println(4 % 2);          //0
        System.out.println();
        System.out.println(2 / 2);   //1
        System.out.println(2 % 2);          //0
        System.out.println();
        System.out.println(1 / 2);   //0
        System.out.println(1 % 2);          //1
        System.out.println();

        int c10 = 1011111001; // 2 система
        System.out.println("Result 637 (10 -> 2) = " + c10);
        System.out.println("Result 637 (2 -> 10) = " + c10);




        int d = 637;

        // 10 - 3 переводим с систем
        System.out.println(637 / 3);  //212
        System.out.println(637 % 3);         //1
        System.out.println();
        System.out.println(212 / 3);   //70
        System.out.println(212 % 3);          //2
        System.out.println();
        System.out.println(70 / 3);   //23
        System.out.println(70 % 3);          //1
        System.out.println();
        System.out.println(23 / 3);   //7
        System.out.println(23 % 3);          //2
        System.out.println();
        System.out.println(7 / 3);   //2
        System.out.println(7 % 3);          //1
        System.out.println();
        System.out.println(2 / 3);   //0
        System.out.println(2 % 3);          //2
        System.out.println();

        int d10 = 212121; // 3 система
        System.out.println("Result 637 (10 -> 3) = " + d10);
        System.out.println("Result 637 (3 -> 10) = " + d10);




        int f10 = 11100111;
        System.out.println(f10);
        System.out.println(1 * Math.pow(2, 7) + 1 * Math.pow(2, 6) + 1 * Math.pow(2, 5) + 0 * Math.pow(2, 4) + 0 * Math.pow(2, 3) + 1 * Math.pow(2, 2) + 1 * Math.pow(2, 1) + 1 * Math.pow(2, 0));


        int v10 = 200345;
        System.out.println(v10);
        System.out.println(2 * Math.pow(2, 5) + 0 * Math.pow(2, 4) + 0 * Math.pow(2, 3) + 3 * Math.pow(2, 2) + 4 * Math.pow(2, 1) + 5 * Math.pow(2, 0));

        }

}