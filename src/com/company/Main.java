package com.company;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static int number1, number2;
    static char operation;
    static int result;

    public static void main(String[] args) {

            System.out.println("Введите выражение 2+2 или два римских числа от I до X: V+V + Enter ");
            String userInput = scanner.nextLine();
            char[] underchar = new char[10];
            for (int i = 0; i < userInput.length(); i++) {
                underchar[i] = userInput.charAt(i);
                if (underchar[i] == '+') {
                    operation = '+';
                } else if (underchar[i] == '-') {
                    operation = '-';
                } else if (underchar[i] == '*') {
                    operation = '*';
                } else if (underchar[i] == '/') {
                    operation = '/';
                }
            }
        try{
        }catch (NumberFormatException e) {
            System.out.println(" ");

        }

            String undercharString = String.valueOf(underchar);
            String[] blacks = undercharString.split("[+-/*]");
            String stable00 = blacks[0];
            String stable01 = blacks[1];
            String string03 = stable01.trim();

            number1 = romanToNumber(stable00);
            number2 = romanToNumber(string03);
            if (number1 < 0 && number2 < 0) {

                result = 0;

            } else {
                result = calculated(number1, number2, operation);
                System.out.println("---Результат для римских цифр----");
                String resultRoman = convertNumToRoman(result);
                System.out.println(stable00 + " " + operation + " " + string03 + " = " + resultRoman);
            }
            try {
                number1 = Integer.parseInt(stable00);
                number2 = Integer.parseInt(string03);
            }catch (NumberFormatException e){
                System.out.println(" ");
            }

            result = calculated(number1, number2, operation);
            System.out.println("--Результат для простых цифр----");
            System.out.println(number1 + " " + operation + " " + number2 + " = " + result);
        }
        static String convertNumToRoman ( int numRim){
            String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV"
                    , "XVI", "XVII","XVIII","XIX","XX","XXI","XXII","XXIII","XXIV","XXV","XXVI"};
            final String s = roman[numRim];
            return s;
        }


        static int romanToNumber (String roman){

            if (roman.equals("I")) {
                return 1;
            } else if (roman.equals("II")) {
                return 2;
            } else if (roman.equals("III")) {
                return 3;
            } else if (roman.equals("IV")) {
                return 4;
            } else if (roman.equals("V")) {
                return 5;
            } else if (roman.equals("VI")) {
                return 6;
            } else if (roman.equals("VII")) {
                return 7;
            } else if (roman.equals("VIII")) {
                return 8;
            } else if (roman.equals("IX")) {
                return 9;
            } else if (roman.equals("X")) {
                return 10;
            }
            return -1;
        }
        public static int calculated ( int num1, int num2, char op){
            int result = 0;
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Не верный знак операции");
            }

            return result;
        }
    }
