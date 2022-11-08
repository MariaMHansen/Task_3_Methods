import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

class MethodsPracticeTest {
    MethodsPracticeTest() {
    }
    // Step 1 Test
    @DisplayName("checks if passwordLengthChecker method returns true/false for long/short passwords")
    @Test
    void passwordLengthCheckerTest() {
        // Feedback in case the long password fails
        if(MethodsPractice.passwordLengthChecker("12345678")==false){
            fail(   "\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " Looks like your method returns false for \n" +
                    "          8 character long passwords.\n"+
                    "          Did you make a condition i>8?\n"+
                    "          If so try i>=8\n"+
                    "          If you need some examples of if statement syntax try: \n"+
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          chapter 3.3 if Statements\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Feedback in case the short password returns true
        if(MethodsPractice.passwordLengthChecker("12345678")==false){
            fail(   "\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 1:\n" +
                    " Your method returns true for passwords under \n" +
                    "          8 characters long. You can check if you used the sign correctly?\n"+
                    "          Your condition should be i>=8\n"+
                    "          If so try i>=8\n"+
                    "          If you need some examples of if statement syntax try: \n"+
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          chapter 3.3 if Statements\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        Assertions.assertEquals(true, MethodsPractice.passwordLengthChecker("12345678"));
        Assertions.assertEquals(false, MethodsPractice.passwordLengthChecker("12345"));
    }
    // Step 2 Test
    @DisplayName("checks if stringToCharArrayTest method returns letters in password")
    @Test
    void stringToCharArrayTest() {
        char [] expected = new char[]{'t', 'e', 's', 't', 's', 't', 'r', 'i', 'n', 'g'};
        Assertions.assertArrayEquals(expected, MethodsPractice.stringToCharArray("teststring"));
    }
    // Step 3 Test
    @DisplayName("checks if passwordContainsUpperCase method returns true/false correctly")
    @Test
    void passwordContainsUpperCaseTest() {
        // Feedback in case the upper case letter password fails
        if(MethodsPractice.passwordContainsUpperCase("Test")==false){
            fail(   "\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 3:\n" +
                    " Looks like your method returns false for \n" +
                    "          passwords that do contain upper case letters .\n"+
                    "          Try to use the method Character.isUpperCase(letter)\n"+
                    "          If you need some examples of using upper case check: \n"+
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          Table 4.6 Methods in the Character Class\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Feedback in case the lower case password returns true
        if(MethodsPractice.passwordContainsUpperCase("test")==true){
            fail(   "\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 3:\n" +
                    " Looks like your method returns true for \n" +
                    "          passwords that do contain only lower case letters .\n"+
                    "          Try to use the method Character.isUpperCase(letter)\n"+
                    "          If you need some examples of using upper case check: \n"+
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          Table 4.6 Methods in the Character Class\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // Feedback if method only checks if the first letter is upper case
        if(MethodsPractice.passwordContainsUpperCase("teSt")==false){
            fail(   "\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 3:\n" +
                    " The method needs to check all letters not only the first one \n" +
                    "          Try testing your method with inputs that have upper\n"+
                    "          case letters in the middle. Try using a for each loop \n"+
                    "          to iterate through the character array of letters. \n"+
                    "          To see an example of a for each loop see: \n"+
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          7.2.7 Foreach Loops\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        Assertions.assertEquals(false, MethodsPractice.passwordContainsUpperCase("teststring"));
        Assertions.assertEquals(true, MethodsPractice.passwordContainsUpperCase("tesTstring"));
    }

    // Step 4 Test
    @DisplayName("checks if passwordContainsSymbolChecker method returns true/false correctly")
    @Test
    void passwordContainsSymbolCheckerTest() {
        // if method fails to identify that password contains symbols
        if(MethodsPractice.passwordContainsSymbolChecker("Pa%%word123",new char[]{'+','%','-'})==false){
            fail(   "\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 4:\n" +
                    " The method failed to identify that password contains special symbols '$','%','&'\n" +
                    "          Try using nested for each loops to check if each\n"+
                    "          letter from password letters char[] \n"+
                    "          matches a symbol from the symbols char array \n"+
                    "          To do this you can use nested loops: \n"+
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          5.9 Nested Loops\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // if method fails to identify that password does not contain symbols
        if(MethodsPractice.passwordContainsSymbolChecker("Password123",new char[]{'+','%','-'})==true){
            fail(   "\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 4:\n" +
                    " The method failed to identify that password does not contain special symbols '+','%','-'\n" +
                    "          Try using nested for each loops to check if each\n"+
                    "          letter from password letters char[] \n"+
                    "          matches a symbol from the symbols char array \n"+
                    "          To do this you can use nested loops: \n"+
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          5.9 Nested Loops\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        Assertions.assertEquals(true, MethodsPractice.passwordContainsSymbolChecker("Pa%%word123",new char[]{'+','%','-'}));
        Assertions.assertEquals(false, MethodsPractice.passwordContainsSymbolChecker("Password123",new char[]{'+','%','-'}));
    }

    // Step 5 Test
    @DisplayName("checks if passwordStrengthEvaluator method returns weak/medium/strong correctly")
    @Test
    void passwordStrengthEvaluatorTest() {
        // checks if return Strings are upper case
        if(MethodsPractice.passwordStrengthEvaluator("123").equals("Weak")||MethodsPractice.passwordStrengthEvaluator("pa%%word123").equals("Medium")){
            fail(   "\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 4:\n" +
                    " The solution is almost correct!\n" +
                    "          Please check your return types\n"+
                    "          they must be lower case\n"+
                    "          weak, medium, strong \n"+
                    "-------------------------------------------------------------------------\n"
            );
        }
        // if method fails to identify that password contains
        if(MethodsPractice.passwordStrengthEvaluator("pa%%word123").equals("weak")){
            fail(   "\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 4:\n" +
                    " The method failed to identify that password contains a special symbol\n" +
                    "          If your passwordContainsSymbolChecker from step 4\n"+
                    "          works correctly, the placement of return statements could be the problem.\n"+
                    "          Try moving your return medium statement \n"+
                    "          inside the passwordContainsSymbolChecker(password,symbols)\n"+
                    "          condition code block \n"+
                    "          You can read more about code blocks in: \n"+
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          1.7 A Simple Java Program inside blocks section\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        // if method fails to identify that password contains
        if(MethodsPractice.passwordStrengthEvaluator("Pa%%word123").equals("medium")){
            fail(   "\n" +
                    "-------------------------------------------------------------------------\n" +
                    "AUTO-FEEDBACK:\n" +
                    "Step 4:\n" +
                    " The method failed to identify that password contains a special symbol\n" +
                    "          If your passwordContainsUpperCase from step 3\n"+
                    "          works correctly, the placement of return statements could be the problem.\n"+
                    "          Try moving your return medium statement \n"+
                    "          inside the passwordContainsUpperCase(password,symbols)\n"+
                    "          condition code block \n"+
                    "          You can read more about code blocks in: \n"+
                    "          \"Introduction to Java Programming and Data Structures book\"\n" +
                    "          1.7 A Simple Java Program inside blocks section\n" +
                    "-------------------------------------------------------------------------\n"
            );
        }
        Assertions.assertEquals("weak", MethodsPractice.passwordStrengthEvaluator("1234"));
        Assertions.assertEquals("medium", MethodsPractice.passwordStrengthEvaluator("pa%%word123"));
        Assertions.assertEquals("strong", MethodsPractice.passwordStrengthEvaluator("Pa%%word123"));
    }
}