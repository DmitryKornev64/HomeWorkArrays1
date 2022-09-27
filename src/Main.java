import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    // ДЗ 1.
        System.out.println("   ДЗ 1.");


        // Задание 1,2.

        System.out.println("   Задание 1,2.");
        int[] box = new int[3];
        box[0] = 1;
        box[1] = 2;
        box[2] = 3;
        int applesBox = box[0];
        int pearsBox = box[1];
        int tomatoesBox = box[2];
        for (int i = 0; i < box.length; i++) {
            System.out.print(box[i]);
                if (i < box.length - 1) {
                    System.out.print(",");
                }
        }
        System.out.println();



        float[] personnel = {1.57f, 7.654f, 9.986f};
        for (int w = 0; w < personnel.length; w++) {
            System.out.print(personnel[w]);
            if (w < personnel.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println();


        int[] garage = new int[5];
        int autotruck = garage[0];
        int racing =  garage[1];
        int motorbike = garage[2];
        int tractor = garage[3];
        int bus =  garage[4];
        garage[0] = 2;
        garage[1] = 3;
        garage[2] = 4;
        garage[3] = 6;
        garage[4] = 1;
        for (int i = 0; i < garage.length; i++) {
            System.out.print(garage[i]);
            if (i < garage.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();



        // Задание 2,3.

        System.out.println("   Задание 2,3.");
        int[] shop = new int[3];
        int applesBox1 = shop[0];
        int pearsBox1 = shop[1];
        int tomatoes1 = shop[2];
        shop[0] = 1;
        shop[1] = 2;
        shop[2] = 3;
        for (int i = shop.length-1; i >= 0 ; i--) {
            System.out.print(shop[i]);
            if (i > shop.length -3) {
                System.out.print(",");
            }
        }
        System.out.println();



        float[] personnel1 = {1.57f, 7.654f, 9.986f};
        for (int i = personnel1.length-1; i >= 0 ; i--) {
            System.out.print(personnel1[i]);
            if (i > personnel1.length-3) {
                System.out.print(",");
            }
        }
        System.out.println();


        int[] parking = new int[5];
        int autotruck1 = parking[0];
        int racing1 =  parking[1];
        int motorbike1 = parking[2];
        int tractor1 = parking[3];
        int bus1 =  parking[4];
        parking[0] = 2;
        parking[1] = 3;
        parking[2] = 4;
        parking[3] = 6;
        parking[4] = 1;
        for (int i = parking.length-1; i >= 0 ; i--) {
            System.out.print(parking[i]);
            if (i > parking.length -5) {
                System.out.print(",");
            }
        }
        System.out.println();


        // Задание 2,4.
        System.out.println("   Задание 2,4");
        int[] boxes = new int[3];
        int apples = boxes[0];
        int pears = boxes[1];
        int tomatoes = boxes[2];
        boxes[0] = 1;
        boxes[1] = 2;
        boxes[2] = 3;
        for (int r = 0; r < boxes.length; r++) {
            if (boxes[r] % 2 != 0) {
                boxes[r] += 1;
            }
        }
        System.out.println(Arrays.toString(boxes));


        int[] camp = new int[5];
        int tents = camp[0];
        int sleepingBags =  camp[1];
        int blankets = camp[2];
        int shovels = camp[3];
        int ration =  camp[4];
        camp[0] = 2;
        camp[1] = 3;
        camp[2] = 4;
        camp[3] = 6;
        camp[4] = 1;
        for (int e = 0; e < garage.length; e++) {
            if (camp[e] % 2!=0) {
                camp[e] +=1 ;
            }
        }
        System.out.println(Arrays.toString(camp));
    }
}