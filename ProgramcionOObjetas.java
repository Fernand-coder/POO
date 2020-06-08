/*
 Realizar un algoritmmo que me permita ingresar por teclado informacion sobre
Progrmacion Orientada a Objetos
 */
package programcionoobjetas;

/**
 *
 * @author Fernando Padilla
 */
import java.util.Scanner;
public class ProgramcionOObjetas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in);
        System.out.println("Programacion Orientada Objetos");
        System.out.println("Ingerese nombre del Sistema");
        String tema=objeto.nextLine();
        
        System.out.println("Modulo 1: ");
        String mod1=objeto.nextLine();
   
        System.out.println("Modulo 2: ");
        String mod2=objeto.nextLine();
        
        System.out.println("////////////////////////////////////////");
        System.out.println("          Requerimientos");
        System.out.println("Ingrese Requerimientos Funcionales "+mod1);
        String req1=objeto.nextLine();
        String req2=objeto.nextLine();
        String req3=objeto.nextLine();
        String req4=objeto.nextLine();
       
        System.out.println("Ingrese Requerimientos No Funcionales "+mod1);
        String req5=objeto.nextLine();
        String req6=objeto.nextLine();
        String req7=objeto.nextLine();
        String req8=objeto.nextLine();
        
        System.out.println("Ingrese Requerimientos Funcionales "+mod2);
        String req21=objeto.nextLine();
        String req22=objeto.nextLine();
        String req23=objeto.nextLine();
        String req24=objeto.nextLine();
       
        System.out.println("Ingrese Requerimientos No Funcionales "+mod1);
        String req25=objeto.nextLine();
        String req26=objeto.nextLine();
        String req27=objeto.nextLine();
        String req28=objeto.nextLine();
        
        System.out.println("////////////////////////////////////////");
        System.out.println("           Diseño Orientado a objetos");
        
        System.out.println("Ingrese Atributos: "+mod1);
        System.out.println("-"+req1);
        System.out.println("-"+req2);
        System.out.println("-"+req3);
        System.out.println("-"+req4);
        System.out.println("Servicios: "+mod1);
        String s1=objeto.nextLine();
        String s2=objeto.nextLine();
        String s3=objeto.nextLine();
        String s4=objeto.nextLine();
        
        System.out.println("Ingrese Atributos: "+mod2);
        System.out.println("-"+req21);
        System.out.println("-"+req22);
        System.out.println("-"+req23);
        System.out.println("-"+req24);
        
        System.out.println("Servicios: "+mod2);
        String s21=objeto.nextLine();
        String s22=objeto.nextLine();
        String s23=objeto.nextLine();
        String s24=objeto.nextLine();
        
        System.out.println("////////////////////////////////////////");
        System.out.println("           Abstraccion");
        System.out.println("Clase de objeto "+mod1);
        String co=objeto.nextLine();
        
        System.out.println("Clase de objeto "+mod2);
        String co2=objeto.nextLine();
        
        System.out.println("////////////////////////////////////////");
        System.out.println("          Encapsulamineto");
        System.out.println("1. Sistema: ");
        System.out.println(tema);
        System.out.println("2.Modulos");
        System.out.println(mod1);
        System.out.println(mod2);
        System.out.println("3.Clase de objetos: ");
        System.out.println(co);
        System.out.println(co2);
        System.out.println("4.Servicios: ");
        System.out.println(mod1+":");
        System.out.println(s1+", "+s2+","+s3+", "+s4);
        System.out.println(mod2+":");
        System.out.println(s21+", "+s22+","+s23+", "+s24);
        System.out.println("5.Atributos: ");
        System.out.println(mod1+":");
        System.out.println(req1+", "+req2+","+req3+", "+req4);
        System.out.println(mod2+": ");
        System.out.println(req21+", "+req22+","+req23+", "+req24);
        
        System.out.println("////////////////////////////////////////");
        System.out.println("          Modularidad");
        System.out.println("Modulo Principal:");
        String mop=objeto.nextLine();
        System.out.println("Modulo Fisico");
        System.out.println("Objeto: "+mod1);
        System.out.println("Clase de Objeto: ");
        System.out.println(co);
        System.out.println("Objeto: "+mod2);
        System.out.println("Clase de Objeto: ");
        System.out.println(co2);
        
    }
    
}
