import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Ready to test your knowledge?\n");
      
      System.out.println("This quiz will have questions about the content that was discussed on all of the pages of this website.");
      System.out.println("There will be 8 multiple choice questions for you to answer, and the correct answer will be given to you");
      System.out.println("after you answer each question.\n");
      System.out.println("Each question has answer choices that can range from \"a\" through \"d\", so you will need to type in the");
      System.out.println("LOWERCASE letter of the answer that you are choosing.");
      
      System.out.println("Type in 1 to begin.");      
      String begin = scan.nextLine();
      
      int rightAns = 0;
      
      System.out.println("\nQuestion 1: You have a higher chance of contracting COVID-19 if you are of a certain race or ethnicity.");
      System.out.println("a) True");
      System.out.println("b) False");
      String choice = scan.nextLine();
      if (choice.equals("b"))
      {
          System.out.println("Correct!");
          rightAns++;
      }
      else
      {
          System.out.println("Incorrect:");
          System.out.println("COVID-19 can affect anyone, regardless of their race or ethnicity.");
      }
      
      System.out.println("\nQuestion 2: COVID-19 is the same as other common coronaviruses, therefore it is called a \"novel\" coronvirus.");
      System.out.println("a) True");
      System.out.println("b) False");
      String choice2 = scan.nextLine();
      if (choice2.equals("b"))
      {
          System.out.println("Correct!");
          rightAns++;
      }
      else
      {
          System.out.println("Incorrect:");
          System.out.println("COVID-19 is NOT the same as the common coronaviruses, and it is called \"novel\" because it has not been");
          System.out.println("previously identified.");
      }
      
      System.out.println("\nQuestion 3: Which of these is NOT a common symptom of COVID-19.");
      System.out.println("a) Vomiting");
      System.out.println("b) Sore Throat");
      System.out.println("c) Cough");
      System.out.println("d) Fever");
      String choice3 = scan.nextLine();
      if (choice3.equals("a"))
      {
          System.out.println("Correct!");
          rightAns++;
      }
      else
      {
          System.out.println("Incorrect:");
          System.out.println("Vomiting is a less common symptom found in COVID-19 patients.");
      }
      
      
      System.out.println("\nQuestion 4: If you are going to use hand sanitizer instead of washing your hands, its alcohol content should");
      System.out.println("be at least: ");
      System.out.println("a) 50%");
      System.out.println("b) 60%");
      System.out.println("c) 70%");
      System.out.println("d) 80%");
      String choice4 = scan.nextLine();
      if (choice4.equals("b"))
      {
          System.out.println("Correct!");
          rightAns++;
      }
      else
      {
          System.out.println("Incorrect:");
          System.out.println("The hand sanitizer you use should contain at least 60% alcohol.");
      }
      
      System.out.println("\nQuestion 5: COVID-19 was first identified in which of these locations?");
      System.out.println("a) Washington, United States");
      System.out.println("b) Rome, Italy");
      System.out.println("c) Marseille, France");
      System.out.println("d) Wuhan, China");
      String choice5 = scan.nextLine();
      if (choice5.equals("d"))
      {
          System.out.println("Correct!");
          rightAns++;
      }
      else
      {
          System.out.println("Incorrect:");
          System.out.println("A likely single, recent emergence of this virus from an animal reservoir COVID-19 was first identified in Wuhan, China.");
      }
      
      System.out.println("\nQuestion 6: When social distancing, you should stay at least ___ feet from other people.");
      System.out.println("a) 5");
      System.out.println("b) 2");
      System.out.println("c) 10");
      System.out.println("d) 6");
      String choice6 = scan.nextLine();
      if (choice6.equals("d"))
      {
          System.out.println("Correct!");
          rightAns++;
      }
      else
      {
          System.out.println("Incorrect:");
          System.out.println("You should stay at least 6 feet (about 2 arms’ length) from other people when social distancing.");
      }
      
      System.out.println("\nQuestion 7: You should immediately seek emergency medical attention when experiencing which of these symptoms?");
      System.out.println("a) Sneezing");
      System.out.println("b) Persistent chest pain/pressure");
      System.out.println("c) Muscle pain");
      System.out.println("d) Diarrhea");
      String choice7 = scan.nextLine();
      if (choice7.equals("b"))
      {
          System.out.println("Correct!");
          rightAns++;
      }
      else
      {
          System.out.println("Incorrect:");
          System.out.println("Persistent chest pain/pressure is one of the symptoms that indicate that you need immediate emergency medical attention.");
      }
      
      System.out.println("\nQuestion 8: COVID-19 can be spread through which of the following methods?");
      System.out.println("a) Wearing a handmade mask");
      System.out.println("b) Not wearing gloves when shopping");
      System.out.println("c) Respiratory droplets");
      System.out.println("d) None of the above");
      String choice8 = scan.nextLine();
      if (choice8.equals("c"))
      {
          System.out.println("Correct!");
          rightAns++;
      }
      else
      {
          System.out.println("Incorrect:");
          System.out.println("COVID-19 is mainly spread through respiratory droplets produced when an infected person coughs, sneezes, or talks.");
      }
      
      System.out.println("\nYou are now done with the quiz! Your score was a " + rightAns + "/8");
      if(rightAns == 8)
      {
          System.out.println("Great Job!!! You got all of the questions right!");
      }
      else
      {
          System.out.println("Continue to look over the information provided in this website so that you can get a 100% next time!");
      }
      
      System.out.println("\nIf you would like to retake this quiz, just click on the green \"run\" button again.");
      
  }
}