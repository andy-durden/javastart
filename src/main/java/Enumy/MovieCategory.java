package Enumy;

public enum MovieCategory {


    SCI_FI("Science fiction") {
        @Override
        boolean isCool() {
            return false;
        }
    },
    ROMANTYCZNY("Film romantyczny"){
        @Override
        boolean isCool() {
            return true;
        }
    },
    SERIAL("Serial telewizyjny"){
        @Override
        boolean isCool() {
            return false;
        }
    },
    DOKUMENT("Film dokumentalny"){
        @Override
        boolean isCool() {
            return false;
        }
    },
    HORROR("Horror"){
        @Override
        boolean isCool() {
            return true;
        }
    };
    private String displayName;

    MovieCategory(String displayname) {
        this.displayName = displayname;
    }

    abstract boolean isCool();

    //  public String getDisplayName() {
    //    return displayName;
    //}

   @Override
    public String toString() {
        return displayName;
    }
}
