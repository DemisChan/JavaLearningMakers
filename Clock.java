import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalTime;

class Clock {
  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();

    DateTimeFormatter formatter_t = DateTimeFormatter.ofPattern("HH:mm");
    DateTimeFormatter formatter_d = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    String text_t =time.format(formatter_t);
    String text_d =date.format(formatter_d);

    System.out.printf("The current time is %s \n", text_t);
    System.out.printf("The current date is %s \n", text_d);
  }  
}
