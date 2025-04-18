package lib;

import java.util.List;

public class Family {
    private Spouse spouse;
    private Child child;

    public Family(Spouse spouse, Child child) {
        this.spouse = spouse;
        this.child = child;
    }

    public Spouse getSpouse() {
        return spouse;
    }

    public Child getChild() {
        return child;
    }

    public String getSpouceID() {
        return spouse.getSpouseIdNumber();
    }

    public List<String> getChildID() {
        return child.getChildIdNumbers();
    }
}
