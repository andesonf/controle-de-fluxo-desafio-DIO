/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafiocontrolefluxo;

import java.util.Scanner;

/**
 *
 * @author felis
 */
public class DesafioControleFluxo {

    public static void main(String[] args) {
      
    Scanner scanner = new Scanner(System.in);
    try{                    
      int primeiroNumero = scanner.nextInt();
      int segundoNumero = scanner.nextInt();        
    
        if(primeiroNumero < segundoNumero){
            System.out.println("primeiro numero: "+primeiroNumero);
            System.out.println("segundo numero: "+segundoNumero);
        }else if(primeiroNumero == segundoNumero){
            System.out.println("os numeros não devem ser iguais");
        }else{
            System.out.println("o primerio numero deve ser menor que o segundo!");
        }       
    }catch(java.util.InputMismatchException ex){
        System.out.println("os numeros devem ser diferentes!");
    }
        
  }
}
