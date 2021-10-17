import java.util.*;

class Quizs{

    Scanner sc = new Scanner(System.in);
    
    String[][] Question = new String[5][5];
    String[] Answer = new String[5];
    int[] inputAnswer = new int[5];

    int no = 0;

    int marks;
    
    Quizs()
    {


        Question[0][0] = "Who invented Java language?";
        Question[0][1] = "Dennis Ritchie";
        Question[0][2] = "James Gosling";
        Question[0][3] = "Larry Page";
        Question[0][4] = "Serge Page";

        Question[1][0] = "What is the file name extension of a Java source program?";
        Question[1][1] = ".j";
        Question[1][2] = ".ja";
        Question[1][3] = ".java";
        Question[1][4] = ".jax";

        Question[2][0] = "What is the output of Compilation of Java Program?";
        Question[2][1] = ".class file";
        Question[2][2] = ".cla file";
        Question[2][3] = ".jc file";
        Question[2][4] = ".javax file";

        Question[3][0] = "What does JVM stands for?";
        Question[3][1] = "Java Variable Machine";
        Question[3][2] = "Java Virtual Machine";
        Question[3][3] = "Java Virtual Mechanism";
        Question[3][4] = "None of the above";

        Question[4][0] = "Every statement in Java language should end with a?";
        Question[4][1] = "Dot or Period";
        Question[4][2] = "Comma";
        Question[4][3] = "Semicolon";
        Question[4][4] = "Colon";

        Answer[0] = "James Gosling";
        Answer[1] = ".java";
        Answer[2] = ".class file";
        Answer[3] = "Java Virtual Machine";
        Answer[4] = "Semicolon";

    }

    public void Start(){
     
        for(int i = 0 ; i < 5 ; i++)
        {
            ClearScreen();
            System.out.println("________   ____ ___._____________");
            System.out.println("\\_____  \\ |    |   \\   \\____    /");
            System.out.println(" /  / \\  \\|    |   /   | /     / ");
            System.out.println("/   \\_/.  \\    |  /|   |/     /_ ");
            System.out.println("\\_____\\ \\_/______/ |___/_______ \\");
            System.out.println("       \\__>                    \\/");
            System.out.println("\n");
            System.out.println("Q" + (i+1) + ". " + Question[i][0]);
            for(int j = 1 ; j < 5 ; j++)
            {
                System.out.println("< " + (j) + " > " + Question[i][j]);
            }
            System.out.print(" : ");
            inputAnswer[no] = sc.nextInt();
            no++;
        }
        MarkCounting();
    }

    public void MarkCounting(){

        for(int i = 0 ; i < 5 ; i++)
        {
            if(Answer[i] == Question[i][inputAnswer[i]])
            {
                // System.out.println("EQUAL");
                marks += 10;
            }
            else
            {
                // System.out.println("NOT EQUAL");
            }
        }

        Score();
    }

    public void Score(){

        ClearScreen();

        System.out.println("________   ____ ___._____________");
        System.out.println("\\_____  \\ |    |   \\   \\____    /");
        System.out.println(" /  / \\  \\|    |   /   | /     / ");
        System.out.println("/   \\_/.  \\    |  /|   |/     /_ ");
        System.out.println("\\_____\\ \\_/______/ |___/_______ \\");
        System.out.println("       \\__>                    \\/");

        System.out.println("\n!!!CONGRATULATION !!!");

        System.out.println("\nYOU HAVE SCORE : " + marks + " / 50");

        System.out.println("\nPRESS ANY NUMBER TO BACK : ");
        no = sc.nextInt();
        marks = 0;
    }

    public void Delay()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public void ClearScreen()  
    {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 
}

public class QuizApp{
    public static void main(String[] args){

        Quizs quiz = new Quizs();

        Scanner sc = new Scanner(System.in);

        int ch;

            do
            { 
                quiz.ClearScreen();
                System.out.println("________   ____ ___._____________");
                System.out.println("\\_____  \\ |    |   \\   \\____    /");
                System.out.println(" /  / \\  \\|    |   /   | /     / ");
                System.out.println("/   \\_/.  \\    |  /|   |/     /_ ");
                System.out.println("\\_____\\ \\_/______/ |___/_______ \\");
                System.out.println("       \\__>                    \\/");
    
                System.out.println("\n\t< 1 > START QUIZ : ");
                System.out.println("\n\t< 2 > EXIT : ");
                System.out.print("\n\tENTER YOUR CHOICE : ");
                
                ch = sc.nextInt();
    
                switch(ch)
                {
                    case 1:
                        quiz.Start();
                    break;
                    case 2:
                        System.out.println("\n\tEXITING :");
                    break;
                    default:
                        System.out.println("\n\tINVALID CHOICE :");
                    break;
                }
                quiz.Delay();
            }while(ch<2||ch>2);
        sc.close();        
    }
}