public class PaperOffering extends School {
    private String name;
    private School school;
    
    public PaperOffering(String name, String nameSchool) {
        super(nameSchool);
        this.name = name;
    }

    public String getName() { return name; }
    public School getSchool() { return school; }
}
