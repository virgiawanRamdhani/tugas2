
package ATM;

import java.util.Scanner;

public class transaksi {
    
    void login (nasabah C){
        Scanner sc = new Scanner(System.in);
        int i=0;
        
        String S;
        do{
            i++;
            System.out.println("password");S=sc.next();
        }while((!S.equals(C.pass))&&(i<3));
        
        if (S.equals(c.pass))
            return true;
        else 
            return false;
        
    }  
    
    
    int Menu(){
        int pil=0;
              Scanner sc = new Scanner (System.in);
        
            System.out.println("Selamat datang di ATMku");
            System.out.println("1. cek saldo");
            System.out.println("2. deposito");
            System.out.println("3. penarikan");
            System.out.println("0. keluar");
            System.out.println("pilih transaksi: "); pil=sc.nextInt();
            
          return pil;  
    }
    
    void CekSaldo(nasabah C){
        System.out.println("cek saldo");
        C.TampilNasabah();
    }
    
    void Deposit(nasabah C){
        Scanner sc= new Scanner (System.in);
        System.out.println("Deposit");
          System.out.print("jumlah yang akan disimpan: ");double X=sc.nextDouble();
          C.saldo=C.saldo+X;
          C.TampilNasabah();     
    }
    
    void Penarikan (nasabah C){
        System.out.println("Penarikan");
    }
    
    void prosesMenu(nasabah C){
        int P = Menu();
        
        switch (P){
            case 1: CekSaldo(C);break;
            case 2: Deposit(C);break;
            case 3: Penarikan(C);break;
            case 0: System.exit(0);
            default:
             System.out.println("pilihan menu salah");
        }
}
     public static void main(String[] args) {
          nasabah N= new nasabah ();
          transaksi T= new transaksi();
          
          Scanner sc=new Scanner(System.in);
          N.BacaNasabah();
          N.TampilNasabah();
          int KT=0;
          if ( 0T.login(N)){
              while (KT==0){
                  T.prosesMenu(N);
                  System.out.println("Transaksi login? ((Y=0 T=1");KT=sc.nextInt();
              }
          }else
              System.out.println("Login gagal"); 
       }
}

