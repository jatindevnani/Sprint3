package com.Problem2;

public class ExceptionHandling {
    public static void main(String[] args) throws userDefinedCheckedException {
        /*1. Difference between Checked and unchecked Exceptions

        * i) Checked exceptions are checked at compile time by the compiler, and
        *    they will not let the compilation be successful if they're not handled.
        *
        * ii) Unchecked exceptions are not checked at compile time and do not give a
              compile error and are given a free pass by the compiler. They throw an
              exception at the runtime and will terminate the program if they're not handled.

              a) Check java file -> userDefinedCheckedException for example of checked exception
              b) Check java file -> userDefinedUncheckedException for example of checked exception*/

        /*2. Difference between throw and throws

        * i) throw keyword is used to throw an exception explicitly by the user. It can however, throw
        *    one exception only at once.
        *
        * ii) throws keyword is user to declare multiple exceptions that might occur using commas, whichever
        *      exception occurs it will throw that to the caller. (something like multiple catch blocks for different
        *      exceptions.*/

        /*3. Difference between Final and Finally

        *   Final and finally are two completely different keywords that have completely different functionality.

            i) Final keyword is used to freeze state of a variable, function or class. For e.g. when we declare a class
             final will not let any other class inherit from it, similarly declaring a variable final will make sure
             that the value of the variable cannot be changed anymore and is constant. And making a method final will not
             let other method override it

             ii) On the other hand, Finally is used in association with Try and catch. It makes sure that the content
                 inside the finally block will ALWAYS be executed. It will execute even though an error is thrown by try
                 block. The finally block can only be manually stopped from executing if the user manually exit the prgram
                 using

                 System.exit(0);
                 */

    }
}
