package academy.devonline.java.basic.section01_setup.section04_setup;

import java.util.Scanner;

public class TernaryOperatyr {
    public static void main(String[] args) {
        var a = new Scanner(System.in).nextInt();
        String result;
        if (a == 5){
            result = "true";
        }else {
            result = "false";
        }
        System.out.println(result);
        System.out.println(a == 5 ? "true":"false");
    }
}
