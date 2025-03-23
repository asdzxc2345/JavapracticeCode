import java.util.Scanner;
class Student{
    private String name;
    private int marks;
    
    public Student(String name, int marks){
        
        this.name=name;
        this.marks=marks;
        
    }
    public String getGrade(){
        if(marks >= 90){
            return "A";
        }else if(marks >=80 && marks<90){
            return "B";
        }else if(marks >=70 && marks<80){
            return "C";
        }else if(marks >60 && marks<70){
            return "D";
        }else{
            return "F";
        }
    }
    //public String getName(){
      //  return name;
    
    
    
    public static void main(String[] args){
        
        Scanner scanner= new Scanner();
        System.out.println("Enter student name:");
        String name=scanner.nextLine();
        
        System.out.println("Enter marks:");
        int marks=scanner.nextInt();
        
        Student student=new Student(name, marks);
        
        System.out.println("Student name:" +student.name);
        System.out.println("Grade:"+student.getGrade());
         
        scanner.close();
    }
        
    
}
