/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inahov;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class InahoV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0;
        for (int i=0;i<n;i++) {
            sum+=sc.nextLong();
        }
        System.out.println(sum);
    }
}
