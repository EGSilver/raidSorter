public class Classes {
    private String name;

    public Classes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "name='" + name + '\'' +
                '}';
    }
}
