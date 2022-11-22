package top.teterin.testSpring;

public class Meat implements Fridge{
    @Override
    public String showSectionContent() {
        return "This section content different kinds of meat";
    }
}
