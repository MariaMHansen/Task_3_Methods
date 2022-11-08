import java.util.Arrays;

public class MethodsPractice {
    /*
       Welcome to assignment three,
       Where you will practice with using arrays and methods.
       You have already tried making methods in previous tasks,
       where each step was a small program performing one function.
       Methods are commonly used in programming,
       because they allow to reuse small chunks of functionality
       to build programs avoiding duplicated code.

       ------------------------------------------------------------
       Checking Passwords with Arrays
       -------------------------------------------------------------
       An array is a data structure commonly used to store multiple values in a single variable,
       instead of declaring separate variables for each one of them.
       For example all vowels in the English alphabet can be stored in this character array:
       char[] vowels = {a, e, i, o, u};
       This is very convenient for writing programs where some statement needs to be checked
       for each item in a row.

       In this exercise, you will practice using arrays for going through a password letter by letter
       and checking which characters they contain to make a password strength evaluator.
       Scroll down to STEP 1:
       */


    /**
     * This is the Main method,
     * Uncomment the lines of code for each method you implement
     * to test your solution
     * Experiment with entering your own attributes
     */
    public static void main(String[] args) {
        System.out.println("Step 1: passwordLengthChecker: " + passwordLengthChecker("Password123"));
        System.out.println("Step 2: stringToCharArray: " + Arrays.toString(stringToCharArray("Password123")));
        System.out.println("Step 3: passwordContainsUpperCase: " + passwordContainsUpperCase("Password123"));
        System.out.println("Step 4: passwordContainsSymbolChecker: " + passwordContainsSymbolChecker("Pa$$word123",new char[]{'$','%','&'}));
        System.out.println("Step 5: passfordStrengthEvaluator: " + passwordStrengthEvaluator("BaCdGzWZ$"));
    }

    /**
     *  STEP 1:
     *     In many situations it might be necessary to count the amount of symbols in a string,
     *     for example to check if a password consists of 8 or more letters,
     *     which is a common security requirement for many login systems.
     *     Make a method that takes a String an input,
     *     checks how many letters it contains,
     *     and returns true if the number is more or equal to 8.
     *     Example: Using "password123" as input would return true
     *     (We assume that the input is always valid)
     * @param password String to count letters in
     * @return  true if there are 8 or more letters, false if less
     * Points: 2
     * New skills: String length
     * Difficulty: 1
     */

    public static boolean passwordLengthChecker(String password){
        if(password.length()>=8){return true;}
        return false;
    }

    /**
     *  STEP 2:
     *     Another useful method for programming with Strings,
     *     is being able to go through a word letter by letter, to check something.
     *     Make a method that converts a String to an array of characters.
     *     We will need this for future steps.
     *     Example: Using "hello" as input would return "[h, e, l, l, o]"
     * @param str String to be converted
     * @return  char [] consisting of letters from the word used as input
     * Points: 2
     * New skills: String toCharArray()
     * Difficulty: 2
     */
    public static char[] stringToCharArray(String str){
        char[] chars = str.toCharArray();
        return chars;
    }

    /**
     *  STEP 3:
     *     Using uppercase letters makes passwords stronger.
     *     Make a method that checks a password letter by letter,
     *     and returns true if it contains upper case letters.
     *     Example: Using "Password123" as input would return true, because it contains P
     *     Tip! To print out an array to your console try: System.out.println(Arrays.toString(chars));
     * @param password String to be checked for spaces
     * @return  true if there are upper case letters in the input String, false if there are none
     * Points: 3
     * New skills: Iterating an array
     * Difficulty: 3
     */
    public static boolean passwordContainsUpperCase(String password){
        char [] letters = stringToCharArray(password);
         for(char letter:letters){
                 if (Character.isUpperCase(letter)){
                      return true;
                  }
        }
        return false;
    }

    /**
     *  STEP 4:
     *     Password strength increases if it contains special symbols,
     *     such as %,&,£,$ etc.
     *     Make a method that checks if a password contains any symbol
     *     form an array of characters, which is also provided as input.
     *     Example: Using ("Pa$$word123",new char[]{'$','%','&'}) as input would return true
     *     Tip! Remember the nested loop exercise from the previous assignment
     * @param password String to be checked for spaces
     * @param symbols char array of special symbols to be checked
     * @return  true if there is one of the symbols in the password, false if there are none
     * Points: 3
     * New skills: comparing two arrays
     * Difficulty: 4
     */
    // check if it has an array of symbols ...
    // hello againgit
   public static boolean passwordContainsSymbolChecker(String password, char[] symbols){
       char[] letters = stringToCharArray(password);
       for (char letter: letters) {
          for(char symbol: symbols){
              if(letter==symbol){
                  return true;
              }
          }
       }
        return false;
   }

    /**
     *  STEP 5:
     *     Finally, all the methods are ready to create the password StrengthEvaluator!
     *     Make a method that checks password strength after using the following rules,
     *     "weak" - Password length is under 8 characters
     *     "medium" - Password length is over 8 characters, and it contains special symbols
     *     "strong" - Password length is over 8 characters, and it contains special symbols and upper case letters
     *     Reusing the methods you have created in steps 1, 3 and 4 will help you a lot in this step.
     *     Example: Using "BaCdGzWZ$" as input would return the String strong
     *     Tip! Place the return statements correctly to get the right result
     * @param password String to be checked for spaces
     * @return  true if there are spaces in the input String, false if there are none
     * Points: 2
     * New skills: building methods with methods, conditions for return statements
     * Difficulty: 4
     */

    public static String passwordStrengthEvaluator(String password){
        char[] symbols ={'$','%','&','£'};
         if(passwordLengthChecker(password)){
             if(passwordContainsSymbolChecker(password,symbols)){
                 if(passwordContainsUpperCase(password)){
                     return "strong";
                 }
                 return "medium";
             }
         }
        return "weak";
    }






    ////////////OLD CODE/////////////////////

    // Write a public static function `sayHello` that returns "hello world!"
    public static String sayHello(){
        // Add Your Code Here ...
        return "hello world!";
    }
}