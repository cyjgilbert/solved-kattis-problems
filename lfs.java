import java.util.*;
import java.util.Scanner;

public class lfs{

public static void main(String[] args){

Scanner j = new Scanner(System.in);

int noOfInputs = j.nextInt();

for(int i = 0; i < noOfInputs; i++){

int input = j.nextInt();
for(int m = input; m > 1; m--){

int k = 1;
k = k * m;

System.out.println((k % 10));


}

}



}





}