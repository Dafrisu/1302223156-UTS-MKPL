package lib;

import java.util.LinkedList;
import java.util.List;

public class Child {
    private List<String> childNames;
    private List<String> childIdNumbers;

    public Child(List<String> childNames, List<String> childIdNumbers) {
        childNames = new LinkedList<String>();
        childIdNumbers = new LinkedList<String>();
    }

    public List<String> getChildNames() {
        return childNames;
    }

    public List<String> getChildIdNumbers() {
        return childIdNumbers;
    }

    public void addChild(String childName, String childIdNumber) {
        childNames.add(childName);
        childIdNumbers.add(childIdNumber);
    }
}
