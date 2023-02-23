package org.orest.tsiatsiak;

public class Lab2ConsoleApplication {

    public static void main(String[] args) {
        String text =
                """
                        National Forestry University of Ukraine, Institute of Woodworking,
                        Computer Technology and Design, IST-21, 126 Information systems and technologies
                        """;
        // Task 1
        char[] characterArray = {'N', 'a', 't', 'i', 'o', 'n', 'a', 'l', ' ', 'F', 'o', 'r', 'e', 's', 't', 'r', 'y',
                ' ', 'U', 'n', 'i', 'v', 'e', 'r', 's', 'i', 't', 'y', ' ', 'o', 'f', ' ', 'U', 'k', 'r', 'a', 'i',
                'n', 'e', ',', ' ', 'I', 'n', 's', 't', 'i', 't', 'u', 't', 'e', ' ', 'o', 'f', ' ', 'W', 'o', 'o',
                'd', 'w', 'o', 'r', 'k', 'i', 'n', 'g', ',', ' ', 'C', 'o', 'm', 'p', 'u', 't', 'e', 'r', ' ', 'T',
                'e', 'c', 'h', 'n', 'o', 'l', 'o', 'g', 'y', ' ', 'a', 'n', 'd', ' ', 'D', 'e', 's', 'i', 'g', 'n',
                ',', ' ', 'I', 'S', 'T', '-', '2', '1', ',', ' ', '1', '2', '6', ' ', 'I', 'n', 'f', 'o', 'r', 'm',
                'a', 't', 'i', 'o', 'n', ' ', 's', 'y', 's', 't', 'e', 'm', 's', ' ', 'a', 'n', 'd', ' ', 't', 'e',
                'c', 'h', 'n', 'o', 'l', 'o', 'g', 'i', 'e', 's'};
        // Task 2
        String string1 = new String(characterArray).substring(0, characterArray.length - 42);
        System.out.println("Task 2: " + string1);
        // Task 3
        String string2 = new StringBuilder(string1).reverse().toString();
        System.out.println("Task 3: " + string2);
        // Task 4
        String string3 = string1.toUpperCase();
        System.out.println("Task 4: " + string3.equalsIgnoreCase(string1));
        // Task 5
        System.out.println("Task 5: " + string1.split(", ")[2]);
        // Task 6
        String string4 = string1 + string3;
        System.out.println("Task 6: " + string4);
        // Task 7
        System.out.println("Task 7: Index of first found 't' :" + string1.indexOf("t"));
        System.out.println("Task 7: Index of last found 'e' :" + string1.lastIndexOf("e"));
        // Task 8
        StringBuffer stringBuffer = new StringBuffer("Tsiatsiak Orest Volodumurovuch, 18.10.2004");
        System.out.println("Task 8: " + stringBuffer);
        // Task 9
        System.out.println("Task 9: " + stringBuffer.delete(stringBuffer.length() - 10, stringBuffer.length() - 4));
        // Task 10
        String placeOfBirth = ", Lviv, Ukraine";
        System.out.println("Task 10: " + stringBuffer.append(placeOfBirth));
        // Task 11
        System.out.println("Task 11: " + stringBuffer.insert(stringBuffer.length() - placeOfBirth.length(), ", Male"));
        // Task 12
        System.out.println("Task 12: characters length: " + stringBuffer.length());
        System.out.println("Task 12: bytes length: " + stringBuffer.toString().getBytes().length);
        // Task 13
        System.out.println("Task 13: " + stringBuffer.delete(stringBuffer.length() - 27, stringBuffer.length()));
        System.out.println("Task 14: " + stringBuffer.reverse());
    }

    private static void printStringConvertedToCharArraySyntax(String string) {
        System.out.print("{'" + string.charAt(0) + "'");
        for (int i = 1; i < string.length(); i++) {
            System.out.print(", '" + string.charAt(i) + "'");
        }
        System.out.print("}");
    }

}
