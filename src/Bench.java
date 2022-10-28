public class Bench {
    private Roles role;

    public Bench(Roles role) {
        this.role = role;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Bench{" +
                "role=" + role +
                '}';
    }
}
