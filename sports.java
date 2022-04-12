import java.util.*;
//public class sports {
    class sportsDet{
        String nameOfFavSportsPerson;
        String nameOfSportPlayedByThePlayer;
        String genderOfThePlayer;
        int ageOfThePlayer;

        
        void getDetail(String getName , String getSport , String getGender , int getAge){
            nameOfFavSportsPerson = getName;
            nameOfSportPlayedByThePlayer = getSport;
            genderOfThePlayer = getGender;
            ageOfThePlayer = getAge;
        }

        void showDet(sportsDet s){
            System.out.println("Player "+s.nameOfFavSportsPerson+" plays "+s.nameOfSportPlayedByThePlayer+" is a "+s.genderOfThePlayer+" and is "+s.ageOfThePlayer+" years old");
        }
    }
    class sports{
        public static void main(String[] args) {
            sportsDet s1 = new sportsDet();
            sportsDet s2 = new sportsDet();
            sportsDet s3 = new sportsDet();
            
            s1.getDetail("UpamanyuGhosh", "Swimming", "Male", 14 );
            s1.getDetail("ArghyaDasChattopadhya", "Cricket", "Male", 14 );
            s1.getDetail("AdityaMondal", "Football", "Female", 14 );

           s1.showDet(s1);
           s2.showDet(s2);
           s2.showDet(s3);
        }
    }

