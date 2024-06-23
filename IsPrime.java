import java.util.Scanner;

public class IsPrime {

    public static boolean isPrime(int n) {
      if (n <= 1) {
        return false;
      }
  
      for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
          return false;
        }
      }
  
      // If no divisors found, n is prime
      return true;
    }
  
    public static void main(String[] args) {
      Scanner s = new Scanner (System.in);
      System.out.print("Enter a number: ");
      int num = s.nextInt();
  
      if (isPrime(num)) {
        System.out.println(num + " is a prime number");
      } else {
        System.out.println(num + " is not a prime number");
      }
    }
  }
  