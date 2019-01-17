public class Material {

    private boolean isBlunt = false;
    private boolean isFire = false;

    public void setBlunt() {
        isBlunt = true;
    }

    public void setFire() {
        isFire = true;
    }

    public String isBlunt() {
        if (isBlunt) {
            return "is broken";
        } else {
            return "is not broken";
        }
    }

    public String isFire() {
        if (isFire) {
            return "is burned";
        } else {
            return "is not burned";
        }
    }

}

//public class Material {
//    private String type;
//    public Material() {
//        this.type = "";
//    }
//
//    public Material(String type) {
//        this.type = type;
//    }
//
//    public boolean isBoken(String materialType) {
//        return true;
//    }
//
//    public boolean isFire(String materialType) {
//        return true;
//    }
//}
