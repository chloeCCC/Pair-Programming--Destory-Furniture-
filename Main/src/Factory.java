
public class Factory {
    public static void main (String[] args) {
        Furniture oneFurniture = new Furniture("chair");
        Plywood oneMaterial = new Plywood();
        Furniture twoFurniture = new Furniture("Table");
        Glass twoMaterial = new Glass();

        System.out.printf("\nThe %s %s is not broken, and it is not burnt.", oneMaterial, oneFurniture);
        System.out.printf("\nThwacking the %s...", oneFurniture);
        System.out.printf("\nThe %s %s %s, and it is not burnt", oneMaterial, oneFurniture, oneMaterial.isBlunt());
        System.out.printf("\nSetting fire to the %s....", oneFurniture);
        System.out.printf("\nThe %s %s %s, and it %s", oneMaterial, oneFurniture, oneMaterial.isBlunt(), oneMaterial.isFire());

        System.out.printf("\n\nThe %s %s is not broken, and it is not burnt.", twoMaterial, twoFurniture);
        System.out.printf("\nThwacking the %s...", twoFurniture);
        System.out.printf("\nThe %s %s %s, and it is not burnt", twoMaterial, twoFurniture, twoMaterial.isBlunt());
        System.out.printf("\nSetting fire to the %s....", twoFurniture);
        System.out.printf("\nThe %s %s %s, and it %s", twoMaterial, twoFurniture, twoMaterial.isBlunt(), twoMaterial.isFire());
    }
}
