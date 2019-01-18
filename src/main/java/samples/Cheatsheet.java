package samples; // The package that this file is a part of

import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class will serve as an introduction to java and a reference in case you get stuck.
 */
public class Cheatsheet { // This defines a class.

  private static final Logger LOG = LoggerFactory.getLogger(Cheatsheet.class);

  /**
   * Main function where we will show all the different parts of java.
   */
  public static void main(String[] args) {
    /*
     Welcome to Java! Java is a statically typed programming language (that means you have to set
     your types manually) that is very common in the world.
    */

    // Learn about some basic operations
    basicOperations();

    // Learn about api types
    dataTypes();

    // Control structures
    controlStructures();

  }

  /**
   * This includes things such as variables, assignments, and basic math.
   */
  private static void basicOperations() {

    // A basic print statement
    LOG.info("Hello world!");

    // Lets do some math, store it, and print the result
    Integer answer = (5 + 5) / 2 * 5;
    LOG.info(answer.toString());

    // The modulus function
    int remainder = 5 % 2;

    // You can also work with variables
    int myApples = 5;
    int yourApples = 10;
    Integer ourApples = myApples + yourApples;
    LOG.info(ourApples.toString());

  }

  /**
   * This talks about all the varieties of api types.
   */
  private static void dataTypes() {
    // The main api types are as follows:

    // String
    String name = "Mike";

    // int
    int age = 3;

    // double
    double fruits = 13.0;

    // boolean
    boolean isMale = true;

    /*
    You can also do casting to convert api types to one another
     */
    double myAge = 3.0;
    double yourAge = 5.3;
    int ageSum = (int) (myAge + yourAge);

  }

  /**
   * Everything to know about control structures such as if statements and loops.
   */
  private static void controlStructures() {
    int age = new Random().nextInt();

    // Here is an example of if / else if / else statements
    if (age == 21) {
      LOG.info("You can drink!");
    } else if (age >= 18) {
      LOG.info("You can smoke!");
    } else {
      LOG.info("Go home buddy!");
    }

  }

}
