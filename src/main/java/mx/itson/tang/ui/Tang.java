/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mx.itson.tang.ui;


import java.util.Scanner;

/**
 * Contiene métodos para remplazar, limpiar, separar y contar la cantidad de números por lada de la cadena de texto ingresada.
 * @author Jesus Alan Espericueta Ramos
 */
public class Tang {

    public static void main(String[] args) {
        
        //Leemos la entrada a la consola
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese la cadena de números:");
        String oracion = entrada.nextLine();
        
        //Limpiamos la cadena de texto
        String nuevaOracion = oracion.replace("(", "").replace(")", "").replace("-", "").replace(" ", "");
        
        //Separamos la cadena
        String[] numeros = nuevaOracion.split(",");
    
        //Creamos las variables a contar
        int tijuana = 0;
        int hermosillo = 0;
        int guaymas = 0;
        int codigodesconocido = 0;
     
        //Condicinal con el método startsWith usando el operador ++ para incrementar el valor de la variable
        for (String numero : numeros){
            if (numero.startsWith("664")){
                tijuana++;
            } else if (numero.startsWith("662")){
                hermosillo++;
            } else if (numero.startsWith("622")){
                guaymas++;
            } else {
                codigodesconocido++;
                    
            }
        }
        //Imprimimos los resultados concatenando las variables
        System.out.println("Hay "+ tijuana + " números de Tijuana" );
        System.out.println("Hay "+ hermosillo + " números de Hermosillo");
        System.out.println("Hay "+ guaymas + " números de Guaymas");
        System.out.println("Hay "+ codigodesconocido + " números desconocidos");
        
                }  
          }
        
        
        
        
 