package top.popov.testSpring;

public class Meat implements Fridge{
    @Override
    public String showSectionContent() {
        return "This section content different kinds of meat";
    }
}
