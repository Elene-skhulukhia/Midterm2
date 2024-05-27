public class Tester {
    public static void main(String[] args) {
        // Create instances of Material
        Material material1 = new Material("Bricks", 100);
        Material material2 = new Material("Cement", 50);

        // Test Material methods
        System.out.println("Material 1: " + material1);
        System.out.println("Material 2: " + material2);

        // Create instance of ConstructionCompany
        ConstructionCompany company = new ConstructionCompany();

        // Add materials to company
        company.addMaterial(material1);
        company.addMaterial(material2);

        // Test ConstructionCompany methods
        System.out.println("Materials in company:");
        for (Material material : company.getMaterials()) {
            System.out.println(material);
        }

        // Save state to file
        company.saveState();
        System.out.println("State saved to file.");

        // Clear materials from company
        company.getMaterials().clear();
        System.out.println("Materials cleared from company.");

        // Restore state from file
        company.restoreState();
        System.out.println("State restored from file.");

        // Display materials after restoring state
        System.out.println("Materials after restoring state:");
        for (Material material : company.getMaterials()) {
            System.out.println(material);
        }
    }
}
