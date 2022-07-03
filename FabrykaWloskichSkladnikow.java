package designpatterns.factory.abstractfactory.fabrykaskladnikowpizzy;

public class FabrykaWloskichSkladnikow extends FabrykaSkladnikowPizzy {
    @Override
    public Ciasto utworzCiasto() {
        return new CiastoWloskie();
    }

    @Override
    public Sos utworzSos() {
        return new SosWloski();
    }

    @Override
    public Ser utworzSer() {
        return new SerWloski();
    }
}
