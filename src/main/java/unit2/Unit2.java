package unit2;

public class Unit2 {

    public static void main(String[] args) {
        System.out.println("Test methods here...");
        
        System.out.println(concatenateStrings("Hello", "World"));
        System.out.println(calculateSquareRoot(25));
        System.out.println(toUpperCase("java"));
        System.out.println(findMax(10, 20));
        System.out.println(getStringLength("Programming"));
        System.out.println(roundValue(5.7));
        System.out.println(getSubstring("Computer", 0, 4));
        System.out.println(getAbsoluteValue(-15));
        System.out.println(replaceCharacter("banana", 'a', 'o'));
        System.out.println(powerOf(2, 3));
    }

    public static String concatenateStrings(String str1, String str2) {
        return str1 + " " + str2;
    }

    public static double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static int findMax(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static int getStringLength(String str) {
        return str.length();
    }

    public static int roundValue(double value) {
        return (int) Math.round(value);
    }

    public static String getSubstring(String str, int beginIndex, int endIndex) {
        return str.substring(beginIndex, endIndex);
    }

    public static int getAbsoluteValue(int number) {
        return Math.abs(number);
    }

    public static String replaceCharacter(String str, char oldChar, char newChar) {
        return str.replace(oldChar, newChar);
    }

    public static double powerOf(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}