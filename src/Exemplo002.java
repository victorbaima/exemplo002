/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victor
 */
public class Exemplo002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 5, b = 32, c = 7;
    System.out.printf("A: %d\t B: %d\t C:%d\n",a,b,c);
    b = b - c;
    b /= a;
    System.out.printf("A: %d\t B: %d\t C:%d\n",a,b,c);
    b = a ^ c;
    System.out.printf("A: %d\t B: %d\t C:%d\n",a,b,c);
    b++;
    System.out.printf("A: %d\t B: %d\t C:%d\n",a,b,c);
    }
    
}
