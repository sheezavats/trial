import java.util.*;
//interface 1
interface quiz
{
  //abstract methods
   public void addQuiz();
   public int uploadResults();
}
//interface 2
interface prize
{
    //final static variable
    int eligible_score=3;
    public void check_eligibility();
}

//Concrete Class - implements both the interfaces
class Maths_Quiz_Level1 implements quiz,prize
{
    //instance variable
    int[] ans=new int[3];
    
    //Implementation of abstract method:addQuiz()
    public void addQuiz()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Answer the following Quiz-Level 1");
        for(int i=0;i<3;)
        {
        System.out.println("What is 10+20?");
        ans[i++]=s.nextInt();
        System.out.println("What is 20 % 100 ?");
        ans[i++]=s.nextInt();
        System.out.println("What is 10 - 5 ?");
        ans[i++]=s.nextInt();
        }
    }
    
    //Implementation of abstract method:uploadResults()
    public int uploadResults()
    {
        int score=0;
        int correct_ans[]={30,20,5};
        for(int i=0;i<3;i++)
        {
            if(correct_ans[i]==ans[i])
            score+=1;
        }
        return score;
    }
    
    //Implementation of abstract method:check_eligibility()
    public void check_eligibility()
    {
        if(uploadResults()== eligible_score)
        {
            System.out.println("Your Level 1 Score : "+uploadResults()+ " and you are qualified for next level ");
        }
        else
        {
            System.out.println("Your Level 1 Score : "+uploadResults()+ " and you are not qualified for next level");
            System.exit(0);
        }
    }
}
//Concrete Class 2 - implements both the interfaces
class Maths_Quiz_Level2 implements quiz,prize
{
    int[] ans=new int[3];
     //Implementation of abstract method:addQuiz()
    public void addQuiz()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("\nAnswer the following Quiz-Level 2");
        for(int i=0;i<3;)
        {
        System.out.println("What is the square of 25?");
        ans[i++]=s.nextInt();
        System.out.println("How many years are there in a decade ?");
        ans[i++]=s.nextInt();
        System.out.println("If David's age is 27 in 2023 ,then what is his age in 2015?");
        ans[i++]=s.nextInt();
        }
    }
    
    //Implementation of abstract method:uploadResults()
    public int uploadResults()
    {
        int score=0;
        int correct_ans[]={625,10,19};
        for(int i=0;i<3;i++)
        {
            if(correct_ans[i]==ans[i])
            score+=1;
        }
        return score;
    }
    
    //Implementation of abstract method:check_eligibility()
    public void check_eligibility()
    {
        if(uploadResults()== eligible_score)
        {
            System.out.println("Your Level 2 Score : "+uploadResults()+ " and you are eligible for prize ");
        }
        else
        {
            System.out.println("Your Level 2 Score : "+uploadResults()+ " and you are not eligible for prize ");
        }
    }
    
}
//Driver Class
public class User 
{
    public static void main(String args[])
    {
        
      //creating class instance
      Maths_Quiz_Level1 mq1=new Maths_Quiz_Level1();
      Maths_Quiz_Level2 mq2=new Maths_Quiz_Level2();
      
      //method call for level 1 using class instance
      mq1.addQuiz();
      mq1.check_eligibility();
      
     //method call for level 2 using class instance
      mq2.addQuiz();
      mq2.check_eligibility();
    }
}
