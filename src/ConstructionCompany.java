import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConstructionCompany {
    private List<Material> materials;

    // Constructor
    public ConstructionCompany() {
        this.materials = new ArrayList<>();
    }

    public void addMaterial(Material material) {
        materials.add(material);
    }

    public void removeMaterial(Material material) {
        materials.remove(material);
    }

    public void saveState() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("state.csv"))) {
            for (Material material : materials) {
                writer.println(material.getName() + "," + material.getQuantity());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void restoreState() {
        materials.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader("state.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0];
                int quantity = Integer.parseInt(data[1]);
                materials.add(new Material(name, quantity));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Material> getMaterials() {
        return materials;
    }
}