
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Bienvenido");

        Autos auto1=new Autos("Jeep","Kia","rojo",2021);
        Autos auto2=new Autos("Automovil","Chevrolet","Blanco",2019);
        auto1.imprimirDatos();
        auto2.imprimirDatos();
        System.out.println("suma de los años: ");
        System.out.println(auto1.getAnio()+auto2.getAnio());
        auto1.setAnio(2000);
        auto2.setAnio(2005);
        auto1.setAnio("Nissan");
        auto2.setAnio("Reanult");
        System.out.println("Valores nuevos");
        auto1.imprimirDatos();
        auto2.imprimir
    }
}
