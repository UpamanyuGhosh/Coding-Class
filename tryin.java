import java.util.*;
    // suppose u are teacher.....exam finished....make report card..........class student.....student name.....class....percenatge.....pass or fail....
// of student marks less than 40 then fail....if more than 40 then pass
       class tryin{
        String studentName ;
        int studentClass;
        int studentTotalMarks ;
          int studentTotalPercentage;
           void getObj(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Student Name");
            studentName = sc.nextLine();
            System.out.println("Enter Student Class");
            studentClass = sc.nextInt();
          System.out.println("Enter Student Total Marks");
          studentTotalMarks = sc.nextInt();
          System.out.println("Enter Student Total Percentage");
          studentTotalPercentage = sc.nextInt();
           }
           void setObj(){
            
        System.out.println("REPORT CARD FOR "+studentName);
        System.out.println("CLASS OF "+studentName+" IS "+studentClass);
        System.out.println("PERCENTAGE OF "+studentName+" IS "+studentTotalPercentage+"%");
        if (studentTotalMarks <= 40){
            
            System.out.println(studentName+" HAS FAILED THE EXAM AS HE HAS SCORED "+studentTotalMarks);
        } else{
            System.out.println(studentName+" HAS PASSED THE EXAMAS HE HAS SCORED "+studentTotalMarks);
       
        }
           }
           public static void main(String[] args) {
        tryin s1 = new tryin();
        tryin s2 = new tryin();
        tryin s3 = new tryin();
        tryin s4 = new tryin();
        tryin s5 = new tryin();
            
        s1.getObj();
        s2.getObj();
        s3.getObj();
        s4.getObj();
        s5.getObj();

        s1.setObj();
        s2.setObj();
        s3.setObj();
        s4.setObj();
        s5.setObj();
    }
       }