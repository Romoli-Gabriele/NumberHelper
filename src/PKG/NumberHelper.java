/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PKG;

/**
 *
 * @author gabbo
 */
public class NumberHelper {
    private int number;

    public NumberHelper(int n) {
        number = n;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isEven() {
       if(number%2 == 0){
       return true;
       }
       return false;
       // ritorna true se number numero pari, altrimenti ritorna false
    }

    public boolean isOdd() {
        if(number%2 == 0){
       return false;
       }
       return true;
        // ritorna true se number è un numero dispari, altrimenti ritorna false
    }
    
    public int sum(int n){
        return n+number;
        // ritorna la somma tra number e n
    }
// ritorna true se number è un numero primo, altrimenti ritorna false
    public boolean isPrime() {
        if (number<2)   //il primo numero primo è il 2, quindi se abbiamo unnumero minore a 2 allora non sarà primo
      return false;
    if (number<=3)  //se il numero in questione è minore o uguale a 3 allora a questo punto si tratta del 2 o del 3, entrambi primi
      return true;
    if (number%2==0)  //se dividendo per 2 il numero si ha resto uguale a zero allora è un numero pari (maggiore a 2) quindi primo
      return false;
    for (int i=3;i<number;i=i+2){      /* si fa un ciclo partendo con i che da 3 assume i numeri dispari minori al numero da esaminare n, non serve controllare con i numeri pari perchè n non è pari  */
      if ( number%i==0)   // se n dovesse essere divisibile per un qualche i allora non è primo
        return false;   
    }
    return true;    //se si è giunti fin qui allora il numero n è primo
  }

        
    
// ritorna true se number è divisibile per il parametro n, altrimenti ritorna false
    public boolean isDivisibleBy(int n) {
        if(number%n == 0){
        return true;
}
return false;
    }
    
}
