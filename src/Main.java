import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Bienvenido a la Calculadora de Area, Perimetro y Volumen de Figuras Geometricas");
        Scanner captura = new Scanner(System.in);
        boolean logico = true;
        float lado = 0.0f;
        float area = 0.0f;
        float radio = 0.0f;
        float perimetro = 0.0f;
        float base = 0.0f;
        float altura = 0.0f;
        float baseMayor = 0.0f;
        float baseMenor = 0.0f;
        float ladoB = 0.0f;
        float pi = 3.12f;
        float longitud = 0.0f;
        float volumen = 0.0f;
        float valor = 1.33f;
        float valor2 = 0.33f;
        float raizDeDos = 1.414f;
        float arista = 0.0f;
        int opcion1;
        int opcion2, opcion3;


        while (logico) {
            System.out.println("Que quieres hacer el dia de hoy, elija una opcion en numero");
            System.out.println("1)Calcular el àrea y perimetro de figuras geometricas");
            System.out.println("2)Calcular el volumen de figuras geometricas");
            System.out.println("3)Salir");
            opcion1 = captura.nextInt();

            if (opcion1 == 1) {
                System.out.println("¿A que figura le quieres sacar el area y perimetro? Elije la opcion en numero (Oprima 8 si desea salir): ");
                System.out.println("1)Cuadrado, 2)Circulo, 3)Rectangulo, 4)Trapecio");
                System.out.println("5)Triangulo Equilatero, 6)Triangulo Isosceles, 7)Triangulo Escaleno");
                opcion2 = captura.nextInt();
                if (opcion2 == 1) {
                    System.out.println("Excelente, vamos a calcular un cuadrado");
                    System.out.println("Escribe el lado de tu cuadrado en cm");
                    lado = captura.nextFloat();
                    area = lado * lado;
                    perimetro = lado * 4;
                    System.out.println("El area del cuadrado es: " + area + "Cm2");
                    System.out.println("El perimetro del cuadrado es: " + perimetro + "Cm");

                } else if (opcion2 == 2) {
                    System.out.println("Excelente, vamos a calcular un circulo");
                    System.out.println("Escribe el radio del circulo en cm");
                    radio = captura.nextFloat();
                    area = pi * (radio * radio);
                    perimetro = 2 * pi * radio;
                    System.out.println("El Area del circulo es: " + area + "Cm2");
                    System.out.println("El perimetro del circulo es: " + perimetro + "Cm");
                } else if (opcion2 == 3) {
                    System.out.println("Excelente, vamos a calcular un rectangulo");
                    System.out.println("Escribe la base del rectangulo en cm");
                    base = captura.nextFloat();
                    System.out.println("Escribe la altura del rectangulo en cm");
                    altura = captura.nextFloat();
                    area = base * altura;
                    perimetro = (base * 2) + (altura * 2);
                    System.out.println("El Area del rectangulo es: " + area + "Cm2");
                    System.out.println("El perimetro del rectangulo es: " + perimetro + "Cm");

                } else if (opcion2 == 4) {
                    System.out.println("Excelente, vamos a calcular un trapecio ");
                    System.out.println("Escribe la base Mayor en cm");
                    baseMayor = captura.nextFloat();
                    System.out.println("Escribe la base Menor en cm");
                    baseMenor = captura.nextFloat();
                    System.out.println("Escribe el lado A del trapecio en cm (puede ser cualquiera de los dos lados)");
                    lado = captura.nextFloat();
                    System.out.println("Escribre el lado B del trapecio en cm (el lado que falta)");
                    ladoB = captura.nextFloat();
                    System.out.println("Escribe la altura del trapecio en Cm");
                    altura = captura.nextFloat();
                    area = ((baseMayor + baseMenor) * altura) / 2;
                    perimetro = (baseMayor + baseMenor + lado + ladoB);
                    System.out.println("El Area del trapecio es: " + area + "Cm2");
                    System.out.println("El Perimetro del trapecio es de: " + perimetro + "Cm");

                } else if (opcion2 == 5) {
                    System.out.println("Excelente, vamos a calcular un triangulo equilatero");
                    System.out.println("Escribe la base del triangulo en Cm");
                    base = captura.nextFloat();
                    System.out.println("Escribe la altura del triangulo en Cm");
                    altura = captura.nextFloat();
                    area = (base * altura) / 2;
                    perimetro = base * 3;
                    System.out.println("El Area del triangulo es: " + area + "Cm2");
                    System.out.println("El Perimetro del triangulo es: " + perimetro + "Cm");

                } else if (opcion2 == 6) {
                    System.out.println("Excelente, vamos a calcular un triangulo Isòsceles");
                    System.out.println("Escribe la base del triangulo en Cm");
                    base = captura.nextFloat();
                    System.out.println("Escribe la altura del triangulo en Cm");
                    altura = captura.nextFloat();
                    System.out.println("Escribe cualquiera de los dos lados en Cm ");
                    lado = captura.nextFloat();
                    area = (base * altura) / 2;
                    perimetro = base + (lado * 2);
                    System.out.println("El Area del triangulo es: " + area + "Cm2");
                    System.out.println("El perimetro es: " + perimetro + "Cm");
                } else if (opcion2 == 7) {
                    System.out.println("Excelente, vamos a calcular un triangulo escaleno");
                    System.out.println("Escribe la base del triangulo en Cm");
                    base = captura.nextFloat();
                    System.out.println("Escribe la altura del triangulo en Cm");
                    altura = captura.nextFloat();
                    System.out.println("Escribe cualquiera de los dos lados en Cm");
                    lado = captura.nextFloat();
                    System.out.println("Escribe el lado que falta en Cm");
                    ladoB = captura.nextFloat();
                    area = (base * altura) / 2;
                    perimetro = (base + lado + ladoB);
                    System.out.println("El Area del triangulo es: " + area + "Cm2");
                    System.out.println("El perimetro es es: " + perimetro + "Cm");

                } else if (opcion2 == 8) {
                    System.out.println("Saliendo....");
                    logico = false;
                } else {
                    System.out.println("Opcion incorrecta vuelve a seleccionar");
                }
            } else if (opcion1 == 2) {
                System.out.println("¿A que figura le quieres sacar el volumen? Elije la opcion en Numero. Oprima 10 para salir");
                System.out.println("1)Cubo");
                System.out.println("2)Cilindro");
                System.out.println("3)Prisma");
                System.out.println("4)Prisma rectangular");
                System.out.println("5)Esfera");
                System.out.println("6)Piramide");
                System.out.println("7)Cono circular");
                System.out.println("8)Tetraedro(Piramide triangular)");
                System.out.println("9)Octaedro");
                opcion3 = captura.nextInt();
                if (opcion3 == 1) {
                    System.out.println("Excelente, vamos a calcular el volumen de un cubo");
                    System.out.println("¿Cual es la longitud en Cm de los lados del cubo?");
                    longitud = captura.nextFloat();
                    volumen = (longitud * longitud * longitud);
                    System.out.println("El volumen del cubo es de: " + volumen + "Cm3");

                } else if (opcion3 == 2) {
                    System.out.println("Excelente, vamos a calcular el volumen de un cilindro");
                    System.out.println("¿Cual es el radio en Cm de la base del cilindro?");
                    radio = captura.nextFloat();
                    System.out.println("¿Cual es la altura en Cm del cilindro?");
                    altura = captura.nextFloat();
                    volumen = pi * (radio * radio) * altura;
                    System.out.println("El volumen del cilindro es de: " + volumen + "Cm3");

                } else if (opcion3 == 3) {
                    System.out.println("Excelente, vamos a calcular el volumen de un Prisma");
                    System.out.println("¿Cual es el àrea en cm2 de la base del prisma?");
                    base = captura.nextFloat();
                    System.out.println("¿Cual es la altura en Cm del prisma?");
                    altura = captura.nextFloat();
                    volumen = base * altura;
                    System.out.println("El volumen del Prisma es de: " + volumen + "Cm3");

                } else if (opcion3 == 4) {
                    System.out.println("Excelente, vamos a calcular el volumen de un Prisma Rectangular");
                    System.out.println("¿Cual es la longitud en Cm de los lados Prisma Rectangular?");
                    longitud = captura.nextFloat();
                    System.out.println("¿Cual es la base en Cm del Prisma Rectangular");
                    base = captura.nextFloat();
                    System.out.println("¿Cual es la altura en Cm del Prisma Rectangular");
                    altura = captura.nextFloat();
                    volumen = longitud * base * altura;
                    System.out.println("El volumen del Prisma Rectangular es de: " + volumen + "Cm3");

                } else if (opcion3 == 5) {
                    System.out.println("Excelente, vamos a calcular el volumen de una Esfera");
                    System.out.println("¿Cual es el radio en Cm de la esfera?");
                    radio = captura.nextFloat();
                    volumen = valor * pi * (radio * radio * radio);
                    System.out.println("El volumen de la esfera es de: " + volumen + "Cm3");

                } else if (opcion3 == 6) {
                    System.out.println("Excelente, vamos a calcular el volumen de una piramide");
                    System.out.println("¿Cual es el àrea de la base en Cm2 de la piramide?");
                    base = captura.nextFloat();
                    System.out.println("¿Cual es la altura en Cm de la piramide?");
                    altura = captura.nextFloat();
                    volumen = valor2 * base * altura;
                    System.out.println("El volumen de la Piramide es de: " + volumen + "Cm3");

                } else if (opcion3 == 7) {
                    System.out.println("Excelente, vamos a calcular el volumen de un Cono circular");
                    System.out.println("¿Cual es el radio en Cm del Cono?");
                    radio = captura.nextFloat();
                    System.out.println("¿Cual es la altura en Cm del Cono?");
                    altura = captura.nextFloat();
                    volumen = valor2 * pi * (radio * radio) * altura;
                    System.out.println("El volumen del Cono Circular es de: " + volumen + "Cm3");

                } else if (opcion3 == 8) {
                    System.out.println("Excelente, vamos a calcular el volumen de un Tetraedro");
                    System.out.println("¿Cual es la longitud del Tetraedro?");
                    longitud = captura.nextFloat();
                    volumen = (longitud * longitud * longitud) / (6 * raizDeDos);
                    System.out.println("El volumen del Tetraedro es de: " + volumen + "Cm3");

                } else if (opcion3 == 9) {
                    System.out.println("Excelente, vamos a calcular el volumen de un octaedro");
                    System.out.println("¿Cual es el valor de la Arista en Cm?");
                    arista = captura.nextFloat();
                    volumen = (raizDeDos / 3) * (arista * arista * arista);
                    System.out.println("El volumen del Octaedro es de: " + volumen + "Cm3");

                } else if (opcion3 == 10) {
                    System.out.println("Saliendo.......");
                    logico = false;

                } else {
                    System.out.println("La opcion elegida es incorrecta, vuelva a intentarlo");
                }
            } else if (opcion1 == 3) {
                System.out.println("Saliendo....");
                logico = false;

            } else {
                System.out.println("La opcion elegida es incorrecta, vuelva a intentarlo");
            }
        }
    }
}