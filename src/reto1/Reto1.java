
package reto1;

import java.util.Scanner;

public class Reto1 {

    ////Reto Final terminado y subido
    public static void main(String[] args) {
       
        Scanner consola=new Scanner(System.in);
        
        int N, tipo;
        long numero;
        double saldo, valor_interes=0,total_interes=0,total_saldo=0;
        String fecha;
       
        System.out.println("Cantidiad Usuarios");
        N=consola.nextInt();
        for(int i=0;i<N;i++){
                System.out.println("Numero de Cuenta");
                numero=consola.nextLong();
                System.out.println("Fecha con formato “aaaa/mm/dd” (Año/Mes/Día): ");
                fecha=consola.next();
                consola.nextLine();
               
                System.out.println("Tipo de cuenta (1: AhorroDiario, 2: CuentaJoven, 3: Tradicional):");
                tipo=consola.nextInt();
                
                
                System.out.println("Saldo de la Cuenta");
                saldo=consola.nextDouble();
                
                    switch(tipo){
                        case 1:
                            valor_interes=0.015*saldo;
                            break;
                        case 2 :
                            valor_interes=0.017*saldo;
                            break;
                        case 3:
                            valor_interes=0.016*saldo;
                            break;    
                       
                    }
                
                saldo+=valor_interes;
                total_interes+=valor_interes;
                total_saldo+=saldo;
                System.out.println("Numero Cuenta:  "+numero);
                System.out.println("Valor Interes:  "+valor_interes);
                System.out.println("Saldo + Interes:  "+saldo);
            
        }
        System.out.println("Valor Total Interes: "+total_interes);
        System.out.println("Valor Total Saldo: "+total_saldo);
    }
    
}
