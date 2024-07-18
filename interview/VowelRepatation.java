package interview;

import java.util.Scanner;

class VowelRepatation{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int str_len=sc.nextInt();
        String str;
        for(int i=0;i<str_len;i++){
            str=sc.next();
        }
        System.out.print(str);
    }
}