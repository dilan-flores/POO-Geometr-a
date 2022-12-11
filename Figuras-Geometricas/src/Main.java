
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Geometria_DilanFlores menu_principal = new Geometria_DilanFlores();

        Geometria_DilanFlores datos = new Geometria_DilanFlores();

        int menu1 = menu_principal.menu();
        while(menu1 !=0){
            switch(menu1){
                case 1:
                    datos.calcularCuadrado(datos);
                    datos.imprimir(datos);
                    break;
                case 2:
                    datos.calcularRectangulo(datos);
                    datos.imprimir(datos);
                    break;
                case 3:
                    datos.calcularTriangulo(datos);
                    datos.imprimir(datos);
                    break;
                case 4:
                    datos.calcularCirculo(datos);
                    datos.imprimir(datos);
                    break;
                case 5:
                    datos.calcularPentagono(datos);
                    datos.imprimir(datos);
                    break;
                default:
                    System.out.println("Usted a salido del sistema");
            }
            menu1 = menu_principal.menu();
        }
    }
}