public class MyApp {
  public static void main(String[] args) {
    String signal = "yellow";

    switch(signal) {
      case "red":
        System.out.println("stop!");
        break;
      case "blue":
      case "green":
        System.out.println("go!!!!!");
        break;
      case "yellow":
        System.out.println("cautaion!!");
        break;
    }
  } 
}