import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // argument for Q3
        int num1 = 10;
        int num2 = 5;
        int num3 = 8;
        int result = compareNumbers(num1, num2, num3);
        System.out.println("The greatest number is: " + result);

        // argument for Q4
        int num14 = 5;
        int num24 = 10;
        int num34 = 7;
        double[] result4 = addSumAndAverage(num14, num24, num34);
        System.out.println("The sum is: " + result4[0]);
        System.out.println("The average is: " + result4[1]);

        // argument for Q5
        double num15 = 10;
        double num25 = 5;
        double result5 = calculator(num15, num25);
        System.out.println("The result is: " + result5);

        // argument for Q6
        int[] array = {2, 4, 6, 2, 8, 4, 9, 1, 6};
        printUniqueNumbers(array);

        // argument for Q7
        String str = "Hello World";
        int count = countVowels(str);
        System.out.println("The number of vowels in the string is: " + count);


        //        1 - Create a function that prints :
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter what you want to print. :");
        String print = scanner.nextLine();
        System.out.println(" You have been written :" + " " + print);

    }

        //  2 - Create a function that takes 2 Strings then Return the 2 strings combined:
    public static String concatenateStrings(String str1, String str2) {
        str1 = "Hello, ";
        str2 = "world!";
        String result = concatenateStrings(str1, str2);
        System.out.println(result);
        return str1 + str2;
    }

        /* 3- Create a function that takes 3 numbers  and .
        Inside the function compare between the 3 numbers and Return the greatest number */
    public static int compareNumbers(int num1, int num2, int num3) {
        if (num1 > num2) {
            if (num1 > num3) {
                return num1;
            } else {
                return num3;
            }
        } else {
            if (num2 > num3) {
                return num2;
            } else {
                return num3;
            }
        }
    }

    // 4- Create a function that takes 3 numbers 2.Return their sum and average :
    public static double[] addSumAndAverage(int num14, int num24, int num34) {
        double sum = num14 + num24 + num34;
        double average = sum / 3;
        return new double[]{sum, average};
    }

    /* 5- Create a function called calculator that takes 2 numbers
        and Let the user select the operation then.Return the numbers after doing the procedure*/
    public static double calculator(double num15, double num25) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select an operation (+, -, *, /): ");
        String operation = scanner.nextLine();

        double result5 = 0;

        switch (operation) {
            case "+":
                result5 = num15 + num25;
                break;
            case "-":
                result5 = num15 - num25;
                break;
            case "*":
                result5 = num15 * num25;
                break;
            case "/":
                result5 = num15 / num25;
                break;
            default:
                System.out.println("Invalid operation!");
                break;
        }

        return result5;
    }

    // 6- Create a function that takes an array and Print the unique numbers use loops and conditional statement
    public static void printUniqueNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(array[i] + " ");
            }
        }
    }

    
    //7-Create a function that takes a String and counts all the vowels in a String using loop and conditional statement
    public static int countVowels (String str){
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}

