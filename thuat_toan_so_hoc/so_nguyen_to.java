package edu.poly.thuat_toan_so_hoc;

public class so_nguyen_to {
    
    boolean isPrime(int n) {
        if(n < 2){
           return false;
        }
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
       return true;
    }
}

