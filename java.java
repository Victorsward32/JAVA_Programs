import java.util.*;

public class java {
    
    public static void main(String[] args) {
        int n=5;

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if ((i+j)==(n+1)) {

                    System.out.print(i);
                    
                }
                else{
                    System.out.print(0);
                }
                
            }
            System.out.println();
            
        }
        System.out.println();

for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n; j++) {
        if ((i + j) == (n + 1)) {
            System.out.print(n - i+1);
        } else {
            System.out.print(0);
        }
    }
    System.out.println();
}

System.out.println();
for (int i = 1; i <=n; i++) {
    for (int j = 1; j <=n; j++) {
        if(i==j){
            System.out.print(i);
        }
        else{
            System.out.print(0);
        }
    }
    System.out.println();
}
System.out.println();

for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
        if (i==j) {
            System.out.print(n-i+1);
            
        } else {
            System.out.print(0);
            
        }
        

    }
    System.out.println();
}


for (int i = 1; i <=n; i++) {
    
    for (int j = 1; j <=i; j++) {
        System.out.print(" * ");
        
    }
    System.out.println();
}
System.out.println();
for (int i = 1; i <=n; i++) {
    
    for (int j = n; j >=i; j--) {
        System.out.print(" * ");
        
    }
    System.out.println();
}

System.out.println();

for (int i = 1; i <=n; i++) {

    for(int s=n-1;s>=i;s--){
        System.out.print(" ");
    }

    for (int j = 1; j <=i ; j++) {
        System.out.print("*");
        
    }
    System.out.println();
    
}

for (int i = 1; i <= n; i++) {
    for (int s = 2; s <=i; s++) {
        System.out.print(" ");
        
    }

    for (int j = n; j >=i; j--) {
        System.out.print("*");
    }
    System.out.println();
    
}
             
    }
}
