//public class Furniture {
//
//    protected String furnitureType;
//    protected String materialType;
//
//    public Furniture() {
//    }
//
//    public Furniture(String furnitureType, String materialType) {
//        this.furnitureType = furnitureType;
//        this.materialType = materialType;
//    }
//
//    public String getFurnitureType() {
//        return this.furnitureType;
//    }
//
//    public String getMaterialType() {
//        return this.materialType;
//    }
//
//    public String FurnitureBlunt(String type) {
//        if(type.equalsIgnoreCase("glass")) {
//            //return Glass.isBlunt();
//            return "";
//        }
//        return "";
//    }
//
//    public String toString() {
//        return furnitureType + " " + materialType;
//    }
//}
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
