import jdk.jshell.EvalException;
import jdk.jshell.spi.ExecutionControl;

import javax.crypto.ExemptionMechanismException;
import javax.xml.catalog.CatalogException;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws Exception {

        dz1and4();
        dz2();
        maina();
    }

    public static void dz1and4() {

        Scanner in = new Scanner(System.in);
        System.out.print("ввод дробного числа: ");
        float num = 0;
        boolean flag = true;

        try {

            num = in.nextFloat();
            flag = true;

        } catch (NullPointerException e) {

            flag = false;
            System.out.print("Ошибка пустая строка! \n ");

        } catch (Exception e) {

            flag = false;
            System.out.print("Ошибка видите привильно! \n ");

        } finally {

            if (flag == true) {

                System.out.printf("Your number: " + num);
                in.close();

            } else {

                dz1and4();

            }
        }
    }

    public static void dz2() {
        // int d;
        double[] intArray = new double[10];
        try {
            int d = 0; //  d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

    public static void maina() throws Exception {
        // версия 1
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;// IndexOutOfBoundsException
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex /*Exception ex*/) {
            System.out.println("Что-то пошло не так...");
        }/*finally {
            Нк указано finally
        }*/


        // версия 2
        int a = 90;
        int b = 3;
        System.out.println(a / b);
        printSum(23, 234);
        int[] abc = {1, 2};
        if (abc.length >= 3) {
            abc[3] = 9;// IndexOutOfBoundsException
            System.out.println("Что-то пошло не так...");
        } else {
            System.out.println("Массив выходит за пределы своего размера!");
        }

    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }
}
