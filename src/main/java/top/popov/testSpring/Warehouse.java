package top.popov.testSpring;

public class Warehouse {
    private Fridge section;
    private String sectionName;
    private float capacity;

    //Player
    public Warehouse() {
    }

    public Warehouse(Fridge sec) {
        this.section = sec;
    }

    public String getSectionName() {
        return sectionName;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setSectionName(String name) {
        this.sectionName = name;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public void setFridge(Fridge sec) {
        this.section = sec;
    }

    public void getSection() {
        System.out.println(section.showSectionContent());
    }
}
