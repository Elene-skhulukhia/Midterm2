public class Material {
    private String name;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Material{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public Material(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;

    }
}