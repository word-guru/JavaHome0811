package top.teterin.testSpring;

public class Fruits implements Fridge{
    @Override
    public String showSectionContent() {
        return "This section content different kinds of fruits";
    }
}
