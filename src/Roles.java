public class Roles {
    private String name;
    private String pclass;
    private String spec;

    private String type;

    public Roles(String name, String pclass, String spec, String type) {
        this.name = name;
        this.pclass = pclass;
        this.spec = spec;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPclass() {
        return pclass;
    }

    public void setPclass(String pclass) {
        this.pclass = pclass;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "name='" + name + '\'' +
                ", pclass='" + pclass + '\'' +
                ", spec='" + spec + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
