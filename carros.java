
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Bienvenido");

        Autos auto1=new Autos("Jeep","Kia","rojo",2021);
        Autos auto2=new Autos("Automovil","Chevrolet","Blanco",2019);
        System.out.println("Valores originales");
        auto1.imprimirDatos();
        auto2.imprimirDatos();
        System.out.println("Suma de los años: ");
        System.out.println(auto1.getAnio()+ auto2.getAnio());

        auto1.setAnio(2000);
        auto1.setAnio(2005);
        auto1.setMarca("Nissan");
        auto2.setMarca("Nissan");

        System.out.println("Valores nuevo");
        auto1.imprimirDatos();
        auto2.imprimirDatos();
    }
}
