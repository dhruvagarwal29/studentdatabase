package studentdatabaseapp;

import java.util.Scanner;

public class student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;
   //Constructor: prompt user to enter user's name and year
    public student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student's first name:");
        this.firstName = in.nextLine();


        System.out.println("Enter Student's last name:");
        this.lastName = in.nextLine();

        System.out.println("1- For Freshman \n2 - For Sophomore \n3 - For Junior \n4- For Senior\n Enter Student's class level");
        this.gradeYear = in.nextInt();
        setstudentId();

      //  System.out.println(firstName +" " + lastName +" "+ gradeYear+ " "+ studentID);

    }

   // generate student id
    private void setstudentId(){
        // grade year + id 
        id++;

        this.studentID =  gradeYear + "" + id;  // "" is used to make this whole thing a string which is done by adding empty string to int values 
    }

   //Enroll in courses
    public void setCourses(){
        //get inside a loop , user hits 0
        while(1 !=0 ){
            
        
                System.out.print("Enter course to enroll (Q to quit)");
                Scanner in = new Scanner(System.in);
                String course = in.nextLine();
                if (!course.equals("Q")){
                    courses = courses + "\n"+ course;
                    tuitionBalance = tuitionBalance + costOfCourse;
                }
                else{
                    break;
                }
            }    
          //  System.out.println(" Enrolled In : "+ courses);



    }

   //view balance
    public void viewBalance(){
        System.out.println(" Your balance is: $" + tuitionBalance);
    }

   //pay tution 
    public void payTuition(){
        //Show and pay balance 
      //  viewBalance();
        System.out.println("Enter the amount of payment");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();

        tuitionBalance = tuitionBalance - payment;
        System.out.println( " Thank your the payment of:  $ " + payment);
       // viewBalance();
    }


   //show status 
   public String display(){
    return "NAME:- " + firstName +" "+ lastName +
            "\nGRADE:- " + gradeYear+ 
            "\n STUDENT ID:- " + studentID+
            "\nCOURSES ENROLLED:- "+courses+
            "\nBALANCE:- "+ tuitionBalance;



   }
}

