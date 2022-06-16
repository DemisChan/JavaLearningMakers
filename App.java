// import java.util.ArrayList;

// public class App {
//   public static void main(String[] args) {
    
//     ArrayList<String> names = new ArrayList<String>();

//     names.add("Kyle");
//     names.add("Sophie");
//     names.add("Graeme");

//     String nameToFind = "Lisa";

//     App app = new App();
//     boolean result = app.isInArray(names, nameToFind);

//     if (result) {
//       System.out.println("The name is in the array. Yay!");
//     } else {
//       System.out.println("The name couldn't be found in the array — sorry...");
//     }
//   }

//   public boolean isInArray(ArrayList<String> names, String nameToFind) {
//     for (String name : names) {
//       if (name == nameToFind) {
//         return true;
//       }
//     }

//     return false;
//   }
// }

// import java.util.Random;

// public class App {
//   public static void main(String[] args) {
//     int minimum = -100;
//     int maximum = 100;
//     Random rand = new Random();
//     int randomNum = minimum + rand.nextInt((maximum - minimum) + 1);

//     App app = new App();
//     String sign = app.getNumberSign(randomNum);

//     System.out.printf("The sign of the number %d is: %s\n", randomNum, sign);
//   }

//   public String getNumberSign(int number) {
//     if (number < 0) {
//       return "negative";
//     } else if (number > 0) {
//       return "positive";
//     } else {
//       return "zero";
//     }
//   }
// }

