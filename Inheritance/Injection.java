class Student
 {
     private Heart h;
     public Student(Heart h)
     {
         this.h=h;
     }
     public void setH(Heart h)
     {
         this.h=h;
     }
     public void call()
     {
         h.heartBeatr();
     }
 }
 class Heart
 {
     public void heartBeatr()
     {
         System.out.println("Heart is important");
     }
 }


public class Injection 
{
    public static void main(String[] args) 
    {
        Heart h=new Heart();
        Student s=new Student(h);
        s.call();
 
        
    }
    
}