public class Major extends School {
    private String name;
    School school;

    public Major(String name, String nameSchool) {
        super(nameSchool);
        this.name = name;
    }

    public String getName() { return name; }
    public School getSchool() { return school; }
}
