package ee.taltech.theme1.part2.celestialbodies;

public class Sun {

    private String name = "Sun";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sun{" +
                "name='" + name + '\'' +
                '}';
    }
}
