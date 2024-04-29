package Leetcode;
// In zoo consist of two types of an animals with different number of legs. the zoo managment wants to find out how many types of animals are their with each categoty.
// a)N represents the total number of animals 
// b)L represents the total number of legs

import java.util.Scanner;

// find out the number of animals of each category
// 
public class animal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the NNO of Animals:");
        int N=sc.nextInt();
        System.out.println("Enter the total number of legs:");
        int L=sc.nextInt();

        int result = calculatAnimal(N, L);
        System.out.println("Number of animals with 2 legs: " + result);

        sc.close();
    }

    public static int calculatAnimal(int N, int L){
       int y=((L-2*N)/2);
       int x=N-y;
        
        System.out.println("x= "+x+" y="+y);
        return x;
    }
}
