import java.util.*;
import java.util.Scanner;

public class quadrant{

public static void main(String[] args){

Scanner j = new Scanner (System.in);

int xcoord = j.nextInt();
int ycoord = j.nextInt();

if( xcoord > 0 && ycoord > 0){

System.out.println(1);

}
else if( xcoord > 0 && ycoord < 0){

System.out.println(4);
}

else if( xcoord < 0 && ycoord < 0){

System.out.println(3);

}
else if( xcoord < 0 && ycoord > 0){

System.out.println(2);

}



}




}