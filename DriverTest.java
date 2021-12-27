import java.util.Scanner;

public class DriverTest{
     public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter your answers below.\n");
    char[] answers = new char[10];
      for(int i = 0; i < answers.length; i++)
      {
        char input;
            do{
            System.out.print(i + 1 + ". ");
                  // get character and make it upper case

                  input = Character.toUpperCase(keyboard.next().charAt(0));
            }
            while(input < 'A' || input >'D');
            // store answer
            answers[i] = input;
      }
      // print output here

      DriverExam driver = new DriverExam(answers) {};

      System.out.println();

      System.out.println("You "+(DriverExam.passed(answers, answers, 0)?"passed" : "did not pass") + ".\n");
      System.out.println("Correct: " + DriverExam.totalCorrect(answers, answers));
      System.out.println("Incorrect: " + DriverExam.totalIncorrect(answers, answers));
      System.out.println("Questions missed: " + DriverExam.questionMissed(answers, answers));
       
  }
}