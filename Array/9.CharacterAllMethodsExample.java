class CharacterAllMethodsExample {
    public static void main(String[] args) {

        char ch1 = 'A';
        char ch2 = 'a';
        char ch3 = '5';
        char ch4 = ' ';
        char ch5 = '@';

     
        // 1. isLetter()
        System.out.println("isLetter('A'): " + Character.isLetter(ch1));

        // 2. isDigit()
        System.out.println("isDigit('5'): " + Character.isDigit(ch3));

        // 3. isLetterOrDigit()
        System.out.println("isLetterOrDigit('@'): " + Character.isLetterOrDigit(ch5));

        // 4. isUpperCase()
        System.out.println("isUpperCase('A'): " + Character.isUpperCase(ch1));

        // 5. isLowerCase()
        System.out.println("isLowerCase('a'): " + Character.isLowerCase(ch2));

        // 6. toUpperCase()
        System.out.println("toUpperCase('a'): " + Character.toUpperCase(ch2));

        // 7. toLowerCase()
        System.out.println("toLowerCase('A'): " + Character.toLowerCase(ch1));

        // 8. isWhitespace()
        System.out.println("isWhitespace(' '): " + Character.isWhitespace(ch4));

        // 9. isSpaceChar()
        System.out.println("isSpaceChar(' '): " + Character.isSpaceChar(ch4));

        // 10. getNumericValue()
        System.out.println("getNumericValue('5'): " + Character.getNumericValue(ch3));

        // 11. compare()
        System.out.println("compare('A','a'): " + Character.compare(ch1, ch2));

        // 12. valueOf()
        Character obj = Character.valueOf(ch1);
        System.out.println("Character object: " + obj);

        // 13. charValue()
        char primitive = obj.charValue();
        System.out.println("Primitive char: " + primitive);
    }
}
