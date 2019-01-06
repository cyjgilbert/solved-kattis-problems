import java.util.*;
import java.util.Scanner;

public class Spavanac{

public static void main(String[] args){

Scanner j = new Scanner (System.in);

int h = j.nextInt();
int m = j.nextInt();

if(h <= 23 && h > 0 && m < 45){

System.out.println((h - 1) + " " + (m+ 15));

}

else if (h <= 23 && h > 0 && (m-45) >= 0 && (m-45) <= 9){

System.out.println(h + " "  + (m- 45));

}

else if (h <= 23 && h > 0 &&  m >= 55 && m < 60){

System.out.println(h + " " + (m - 45));

}



else if(h == 0 && m < 45){

System.out.println(23 + " " + (m+ 15));

}

else if (h == 0 && m >= 45 && (m-45) >= 0 && (m-45) <= 9){

System.out.println(h + " " + (m- 45));

}

else if (h == 0 &&  m >= 55 && m < 60){

System.out.println(h + " " + (m - 45));

}





else {}




}






}