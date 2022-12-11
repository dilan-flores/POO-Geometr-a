import java.util.Scanner; //

public class Geometria_DilanFlores {

    //VARIABLES A UTILIZAR EN TODAS LAS FIGURAS
    double perimetro;
    double area;
    double volumen;
    static final double PI= 3.141592653589;

    public Geometria_DilanFlores(){
        perimetro = 0;
        area = 0;
        volumen = 0;
    }

    Scanner entrada = new Scanner(System.in); // crea objeto "entrada" para ingresar datos
    int menu(){ // menu de opciones
        int op = -1; // recibe la entrada del usuario, inicializada para entrar al bulce
        while(op<0 || op>5){ // rango del bucle
            System.out.println("***** FIGURAS GEOMETRICAS *****");
            System.out.println("    1 Cuadrado");
            System.out.println("    2 Rectángulo");
            System.out.println("    3 Triángulo");
            System.out.println("    4 Circulo");
            System.out.println("    5 Pentagono");
            System.out.println("    0 SALIR");
            System.out.println(">> ");
            op = entrada.nextInt();// Recibe y almacena la entrada del usuario

            if(op<0 || op>5){ // menciona al usuario que el dato ingresado no està en el rango permitido
                System.out.println("Opción no válida");
            }
        }
        return op; // retorna un valor válido
    }

    public void calcularCuadrado(Geometria_DilanFlores datos){ //método para calcular área, perímetro y volumen de cuadrado
        float l;
        System.out.println("***** CADRADO *****");
        System.out.println("Lado: ");
        l = entrada.nextInt();
        datos.setPerimetro(4*l); // Asigna el perímetro del cuadrado
        datos.setArea(l*l); // Asigna el área del cuadrado
        datos.setVolumen(l*l*l); // Asigna el volúmen del cuadrado
    }

    public void calcularRectangulo(Geometria_DilanFlores datos) {
        float b,h,l;
        System.out.println("***** RECTANGULO *****");
        System.out.println("Base: ");
        b = entrada.nextInt();
        System.out.println("Altura: ");
        h = entrada.nextInt();
        System.out.println("Lado: ");
        l = entrada.nextInt();
        datos.setPerimetro(2*b + 2*h); // Asigna el perímetro del rectangulo
        datos.setArea(b*h); // Asigna el área del rectangulo
        datos.setVolumen(b*h*l); // Asigna el volúmen del rectangulo
    }

    public void calcularTriangulo(Geometria_DilanFlores datos) {
        float b,h;
        System.out.println("***** RECTANGULO *****");
        System.out.println("Base: ");
        b = entrada.nextInt();
        System.out.println("Altura: ");
        h = entrada.nextInt();
        datos.setPerimetro(b+b+b); // Asigna el perímetro del triangulo
        datos.setArea((b*h)/2); // Asigna el área del triangulo
        datos.setVolumen(b*h); // Asigna el volúmen del triangulo
    }

    public void calcularCirculo(Geometria_DilanFlores datos) {
        double r;
        System.out.println("***** CIRCULO *****");
        System.out.println("Radio: ");
        r = entrada.nextInt();

        datos.setPerimetro(2*PI*r); // Asigna el perímetro del circulo
        datos.setArea(PI*r*r); // Asigna el área del circulo
        //double vol= (4/3)*PI*r*r*r;
        datos.setVolumen((1.3333333333)*PI*r*r*r); // Asigna el volúmen del circulo
    }

    public void calcularPentagono(Geometria_DilanFlores datos) {
        double l, a;
        System.out.println("***** PENTAGONO *****");
        System.out.println("Lado: ");
        l = entrada.nextInt();
        System.out.println("Apotema:");
        a = entrada.nextInt();

        double peri = 5*l; // perímetro(Utilización del perimetro en algunas ocaciones)
        datos.setPerimetro(peri); // Asigna el perímetro del pentagono
        double area = (peri*a)/2; // area(Utilización del area en algunas ocaciones)
        datos.setArea(area); // Asigna el área del pentagono
        datos.setVolumen(area*l); // Asigna el volúmen del pentagono
    }

    public void imprimir(Geometria_DilanFlores datos){
        System.out.println(" ----------------------------");
        System.out.println("Perímetro: "+ datos.getPerimetro());
        System.out.println("Área: " + datos.getArea());
        System.out.println("Volúmen: " + datos.getVolumen());
        System.out.println(" ----------------------------");
    }

    //SETTER AND GETTER

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }


}
