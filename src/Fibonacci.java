/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carmen_Lucia3
 */
public class Fibonacci {
    
         
    public static void main(String[] args) {
        FibonacciThread f1 = new FibonacciThread(20);
        FibonacciThread f2 = new FibonacciThread(50);
        Thread f3  = new Thread (new FibonacciThreadRunnable(100));
        
        f1.start();
        f2.start();
        f3.start();
    }
    
}

class FibonacciThread extends Thread {
    int fibonacci1 = 1;
    int fibonacci2 =1;
    int n;
    
    public FibonacciThread(int n){
       this.n = n;
    }
    
    @Override
    public void run(){
        for(int i=1;i<=n;i++){
            System.out.print(fibonacci1 + " ");
            fibonacci2 = fibonacci1 + fibonacci2;
            fibonacci1 = fibonacci2 - fibonacci1;
        }
    }
}

class FibonacciThreadRunnable implements Runnable{
    int fibonacci1 = 1;
    int fibonacci2 =1;
    int n;
    
    public FibonacciThreadRunnable(int n){
       this.n = n;
    }
    
    @Override
    public void run(){
        for(int i=1;i<=n;i++){
            System.out.print(fibonacci1 + " ");
            fibonacci2 = fibonacci1 + fibonacci2;
            fibonacci1 = fibonacci2 - fibonacci1;
        }
    }
}
