public class Raids {
    private String name;
    private int max_raiders;

    public Raids(String name, int max_raiders) {
        this.name = name;
        this.max_raiders = max_raiders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMax_raiders() {
        return max_raiders;
    }

    public void setMax_raiders(int max_raiders) {
        this.max_raiders = max_raiders;
    }

    @Override
    public String toString() {
        return "Raids{" +
                "name='" + name + '\'' +
                ", max_raiders=" + max_raiders +
                '}';
    }
}
