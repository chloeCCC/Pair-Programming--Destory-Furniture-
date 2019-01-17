public class Furniture {

    private String furnitureType;

    public Furniture() {
    }

    public Furniture(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    public String getFurnitureType() {
        return this.furnitureType;
    }

    public String toString() {
        return furnitureType ;
    }
}
