package designpatterns.factory.abstractfactory.fabrykaskladnikowpizzy;

public class FSPApp {

    public static void main(String[] args) {
        FabrykaSkladnikowPizzy fabryka = new FabrykaWloskichSkladnikow();
        Ciasto ciastoWloskie = fabryka.utworzCiasto();
        Sos sosWloski = fabryka.utworzSos();
        Ser serWloski = fabryka.utworzSer();
        System.out.printf("Wyprodukowane składniki: " +ciastoWloskie.getClass().getSimpleName()
                + ", " +sosWloski.getClass().getSimpleName()
                + ", " +serWloski.getClass().getSimpleName());

        FabrykaSkladnikowPizzy fabryka1 = new FabrykaAmerykanskichSkladnikow();
        Ciasto ciastoAmerykanskie = fabryka.utworzCiasto();
        Sos sosAmerykanski = fabryka.utworzSos();
        Ser serAmerykanski = fabryka.utworzSer();
        System.out.println("Wyprodukowane składniki: " +ciastoAmerykanskie.getClass().getSimpleName()
                + ", " +sosAmerykanski.getClass().getSimpleName()
                + ", " +serAmerykanski.getClass().getSimpleName());


    }
}
