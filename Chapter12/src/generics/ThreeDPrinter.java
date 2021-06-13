package generics;

public class ThreeDPrinter<T extends Material>{

    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "ThreeDPrinter{" +
                "material=" + material +
                '}';
    }

    public void printing() {
        material.doPrinting();
    }
}
