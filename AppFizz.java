public class AppFizz {
  public static class Fizzbuzz {
    public String play(Integer number) {
      //Integer otherNumber = number - 50;

      if (this.isDivisibleBy(15, number)) {
        return "FizzBuzz";
      } else if (this.isDivisibleBy(5, number)) {
        return "Buzz";
      } else if (this.isDivisibleBy(3, number)) {
        //underscore not needed
        return "Fizz";
      } else {
        return Integer.toString(number);
        //convert to string
      }
    }

    public boolean isDivisibleBy(Integer divisor, Integer number) {
      //number should be integer
      return number % divisor == 0;
    }
  }

  public static void main(String[] args) {
    Fizzbuzz Fizz = new Fizzbuzz();

    for (int i = 1 ; i < 100 ; i ++) {
      
      System.out.println(Fizz.play(i));
    }
  }
}
