
public class Factory {
    public static void main (String[] args) {
        Furniture oneFurniture = new Furniture("chair");
        Plywood oneMaterial = new Plywood();
        Furniture twoFurniture = new Furniture("Table");
        Glass twoMaterial = new Glass();

        System.out.printf("\nThe %s %s %s, and it %s.", oneMaterial, oneFurniture, oneMaterial.isBlunt(), oneMaterial.isFire());
        System.out.printf("\nThwacking the %s...", oneFurniture);
        oneMaterial.setBlunt();
        System.out.printf("\nThe %s %s %s, and it %s", oneMaterial, oneFurniture, oneMaterial.isBlunt(), oneMaterial.isFire());
        System.out.printf("\nSetting fire to the %s....", oneFurniture);
        oneMaterial.setFire();
        System.out.printf("\nThe %s %s %s, and it %s", oneMaterial, oneFurniture, oneMaterial.isBlunt(), oneMaterial.isFire());
        System.out.printf("\n\nThe %s %s %s, and it %s.", twoMaterial, twoFurniture, twoMaterial.isBlunt(), twoMaterial.isFire());
        System.out.printf("\nThwacking the %s...", twoFurniture);
        twoMaterial.setBlunt();
        System.out.printf("\nThe %s %s %s, and it %s", twoMaterial, twoFurniture, twoMaterial.isBlunt(), twoMaterial.isFire());
        System.out.printf("\nSetting fire to the %s....", twoFurniture);
        twoMaterial.setFire();
        System.out.printf("\nThe %s %s %s, and it %s", twoMaterial, twoFurniture, twoMaterial.isBlunt(), twoMaterial.isFire());
    }
}
