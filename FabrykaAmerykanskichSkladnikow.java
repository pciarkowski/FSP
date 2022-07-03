package designpatterns.factory.abstractfactory.fabrykaskladnikowpizzy;

public class FabrykaAmerykanskichSkladnikow extends FabrykaSkladnikowPizzy{
    @Override
    public Ciasto utworzCiasto() {
        return new CiastoAmerykanskie();
    }

    @Override
    public Sos utworzSos() {
        return new SosAmerykanski();
    }

    @Override
    public Ser utworzSer() {
        return new SerAmerykanski();
    }
}
