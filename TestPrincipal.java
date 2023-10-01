/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import animales.Perro;
import figuras.Circulo;
import figuras.Punto;
import figuras.Rectangulo;
import figuras.Triangulo;
import otros.Automovil;
import otros.Celular;
import otros.Mesa;
import otros.Pelota;
import personas.Empleado;
import personas.Estudiante;
/**
 *
 * @author Joaquin
 */
public class TestPrincipal {
    public static void main(String[] args) {
        
        //Circulo 
        
        Punto punto1 = new Punto(7, 3);
            
            Circulo circulo1 = new Circulo(4, "rojo", punto1);
            
            double area = circulo1.getArea();
        System.out.println("Área del círculo: " + area);
            
            double perimetro = circulo1.getPerimetro();
            System.out.println("Perimetro del círculo: " + perimetro);
            
             //Punto
        
        Punto punto2 = new Punto(2, 4);
        
        System.out.println ("La coordenada X es: " + punto2.getCoordenadaX());
        
        System.out.println ("La coordenada Y es: " + punto2.getCoordenadaY());
        
        //Rectangulo
        
        Rectangulo rectangulo1 = new Rectangulo(1.0f, 1.0f);
        
        double area2 = rectangulo1.getArea();

        System.out.println("El área del rectángulo es: " + area2);
        
        //Triangulo
        
         Triangulo triangulo1 = new Triangulo(punto1, punto2, punto2);
         
         double perimetro1 = triangulo1.getPerimetro();
         System.out.println ("El perimetro del triangulo es: " + perimetro1);
         
         String tipo = triangulo1.getTipo();
         System.out.println ("El triangulo es de tipo: " + tipo) ;
   
        
        //Automovil
         Automovil auto1 = new Automovil("C8J-368", "Hyundai", "Sonata", "negro", "auto");
        
        System.out.println ("La marca del automovil es: " + auto1.getMarca());
        System.out.println ("El modelo del automovil es: " + auto1.getModelo());
        
        //celular
        
        Celular celular1 = new Celular(961728550, "Samsung", "blanco", "S20", "prepago");
        
        System.out.println ("El modelo del celular es: " + celular1.getModelo());
        System.out.println ("La marca del celular es: " + celular1.getMarca());
        
        //Mesa
        
         Mesa mesa1 =new Mesa(8.0f, 12.0f, "marrón", "madera", "rectangular");
        
        System.out.println ("El material de la mesa es: " + mesa1.getMaterial());
        System.out.println ( "La forma de la mesa es: " + mesa1.getForma());
        
        //Pelota
        
        Pelota pelota1 = new Pelota(4.0f, "negro");
        
        System.out.println ("El tamaño de la pelota es: " + pelota1.getTamaño());
        
        //Empleado
        
         Empleado empleado1 = new Empleado(2121231, "Joaquín", "Jara", 1200);
        
        System.out.println("El salario es: " + empleado1.getSalary());

        int Meses = 12;
                double SalarioAnual = empleado1.getSalary() * Meses ;
                System.out.println("El salario anual es: " + SalarioAnual);
                
        //Estudiante
        Estudiante estudiante1 = new Estudiante("Joaquín", "Jara", 20, 2121231, "Programación orientada a objetos I", 16.0f);
        
        System.out.println ("La calificación del estudiante es: " + estudiante1.getCalificación());
        System.out.println ("El curso del estudiante es: " + estudiante1.getCurso());
        
        //Perro
        Perro perro1 = new Perro("Honey", "Shih Tzu", "blanco y marron", 7);
        
        System.out.println ("La raza del perro es: " + perro1.getRaza());
        
        System.out.println("La edad del perro es: " + perro1.getEdad());

    }
}

