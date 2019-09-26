/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM;

import java.util.Scanner;

public class nasabah {
    
    int kode;
    String nama;
    double saldo;
    
    void BacaNasabah(){
        
        Scanner sc = new Scanner (System.in);
                 System.out.println("kode: ");kode=sc.nextInt();
                 System.out.println("nama: ");nama=sc.next();
                
                 System.out.println("saldo= ");saldo=sc.nextDouble();
    }
    void TampilNasabah() {
        System.out.println("Nasabah: "+kode+","+nama+","+saldo);

    }
      public static void main(String[] args) {
          nasabah N=new nasabah ();
          
          N.BacaNasabah();
          N.TampilNasabah();
        
      
           
       }
       
           
        }

