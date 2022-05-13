package com.bananamokka.Lesson1.HW;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;


public class L1HW {
    public static void main(String[] args) throws IOException {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
    }

    public static void task1() throws IOException {
        System.out.println("task1");
        double weightOnEarth, weightOnMoon;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter your weight: ");
        weightOnEarth = Double.parseDouble(bufferedReader.readLine());
        weightOnMoon = weightOnEarth * 0.16;
        System.out.println("Your weight on Moon is " + weightOnMoon);
    }

    public static void task2() {
        System.out.println("task2");
        double[] newArray = new double[10];
        newArray[1] = 228;
        newArray[4] = 69;
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray[i] * 1.10;
            System.out.println(newArray[i]);
        }
    }

    public static void task3() throws IOException {
        System.out.println("task3");
        String number;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter your number: ");
        number = (bufferedReader.readLine());
        StringBuffer buffer = new StringBuffer(number);
        System.out.println(buffer.reverse());
        if (Objects.equals(number, String.valueOf(buffer))) {
            System.out.println("Your number is palindrome");
        } else System.out.println("Your number isn't palindrome");
    }

    public static void task4() {
        System.out.println("task4");
        int[] HundredArray = new int[100];
        for (int i = 0; i < HundredArray.length; i++) {
            HundredArray[i] = i + 1;
            if (HundredArray[i] % 2 == 0) {
                System.out.println(HundredArray[i]);
            }
        }
    }

    public static void task5() {
        System.out.println("task5");
        int[] FifteenArray = new int[15];
        for (int i = 0; i < FifteenArray.length; i++) {
            FifteenArray[i] = i + 1;
            if (FifteenArray[i] % 2 != 0) {
                System.out.println(FifteenArray[i]);
            }
        }
    }
    public static void task6() {
        System.out.println("task6");
        int[] HunArray = new int[101];
        for (int i = 2; i < HunArray.length; i = i + 2) {
            HunArray[i] = i;
            System.out.println(HunArray[i]);
        }
    }
    public static void task7() {
        System.out.println("task7");
        int[] TwoHunArray = new int[200];
        int sum = 0;
        for (int i = 19; i < TwoHunArray.length; i++) {
            TwoHunArray[i] = i + 1;
            sum += TwoHunArray[i];
        }
        System.out.println(sum);
    }
    public static void task8() {
        System.out.println("task8");
        for (int i = 1; i < 13; i++) {
            i = i;
            String m;
            if (i == 1) {
                m = "January";
                System.out.println(m);
            }
            else if (i == 2) {
                m = "February";
                System.out.println(m);
            }
            else if (i == 3) {
                m = "March";
                System.out.println(m);
            }
            else if (i == 4) {
                m = "April";
                System.out.println(m);
            }
            else if (i == 5) {
                m = "May";
                System.out.println(m);
            }
            else if (i == 6) {
                m = "June";
                System.out.println(m);
            }
            else if (i == 7) {
                m = "July";
                System.out.println(m);
            }
            else if (i == 8) {
                m = "August";
                System.out.println(m);
            }
            else if (i == 9) {
                m = "September";
                System.out.println(m);
            }
            else if (i == 10) {
                m = "October";
                System.out.println(m);
            }
            else if (i == 11) {
                m = "November";
                System.out.println(m);
            }
            else if (i == 12) {
                m = "December";
                System.out.println(m);
            }
        }
    }


    public static void task9() {
        System.out.println("task9");
        int firstNum = 3, secondNum = 5, buf;
        buf = firstNum;
        firstNum = secondNum;
        secondNum = buf;
        System.out.println(firstNum + " " + secondNum);
    }
    public static void task10() {
        System.out.println("task10");
        int firstnum = 3, secondnum = 5, sum;
        sum = firstnum + secondnum;
        System.out.println(sum);
    }
    public static void task11() {
        System.out.println("task11");
        int firstnum = 3, secondnum = 5, thirdnum = 9, maxnum;
        if (firstnum > secondnum & firstnum > thirdnum) {
            maxnum = firstnum;
        }
            else if (secondnum > firstnum & secondnum > thirdnum) {
            maxnum = secondnum;
        }
            else maxnum = thirdnum;
        System.out.println(maxnum);
    }
    public static void task12() {
        System.out.println("task12");
        boolean v1 = true, v2 = false;
        if (v1 == true) {
            System.out.println("True");
        }
        else System.out.println("False");
        if (v2 == true) {
            System.out.println("True");
        }
        else System.out.println("False");
    }
    public static void task13() {
        System.out.println("task13");
        String v1 = "Soft " , v2 = "kitty", v3;
        v3 = v1 + v2;
        System.out.println(v3);
    }
    public static void task14() {
        System.out.println("task14");
        int v1 = 5, v2 = 9;
        if (v1 > v2) {
            v1 = v1 + 3;
        }
        else v2 = v2 + 8;
        System.out.println(v1 + " " + v2);
    }
    public static void task15() {
        System.out.println("task15");
        int [] Array = new int[100];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = i + 1;
            System.out.println(Array[i]);
        }
        int i = 0;
        while (i < Array.length) {
            Array[i] = i + 1;
            System.out.println(Array[i]);
            i++;
        }
        int j = 0;
    do {
            Array[j] = j + 1;
            System.out.println(Array[j]);
            j++;
        }
        while (j < Array.length);
    }
    public static void task16() throws IOException {
        System.out.println("task16");
        int min, max, step;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter min: ");
        min = Integer.parseInt(bufferedReader.readLine());
        System.out.print("Please enter max: ");
        max = Integer.parseInt(bufferedReader.readLine());
        System.out.print("Please enter step: ");
        step = Integer.parseInt(bufferedReader.readLine());
        int [] Array = new int[max];
        for (int i = min - step; i < max; i = i + step) {
            Array[i] = i + step;
            System.out.print(Array[i] + " ");
        }
        System.out.println(" ");
    }
    public static void task17() {
        System.out.println("task17");
        double maxelement = 0;
        double[] Array = new double[]{2, 6, 9, 1};
        for (int i = 0; i < Array.length; i++) {
            if (maxelement <= Array[i]) {
                maxelement = Array[i];
            }
        }
        for (int i = 0; i < Array.length; i++) {
            Array[i] = (Array[i] / maxelement);
            System.out.println(Array[i]);
        }
    }
    public static void task18() throws IOException {
        System.out.println("task18");
        double byn, usd, course;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter sum in BYN: ");
        byn = Double.parseDouble(bufferedReader.readLine());
        course = 2.68;
        usd = byn / course;
        System.out.print("Sum in USD is ");
        System.out.printf("%.2f %n", usd);
    }
}
