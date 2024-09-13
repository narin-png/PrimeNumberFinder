package taskexamples;

import java.util.Scanner;

public class GitHub {
    public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
        int i = 1;
        while (i<n) {
            i++;
            if((i%2==0 && i!=2) ||  (i%3==0 && i!=3)  || i%5==0 && i!=5 || i%7==0  && i!=7 ||  i%11==0 && i!=11 || i%13==0 && i!=13  || i%17==0 && i!=17){
                continue;
            }
            System.out.println(i);
        }



    }
}
