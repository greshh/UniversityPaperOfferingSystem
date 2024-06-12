public class Lecturer extends School {
    private int id;
    private String firstName;
    private String lastName;
    private School school;
    private PaperOffering campus;
    private PaperOffering[] paperOffering = new PaperOffering[4];
    private Paper[] paper = new Paper[4];
    private int paperCount = 0;

    public Lecturer(int id, String firstName, String lastName, String nameSchool, PaperOffering campus) {
        super(nameSchool);
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.campus = campus;
    }

    public int getID() { return id; }
    public PaperOffering getCampus() { return campus; }
    public int getpaperCount() { return paperCount; }
    public School getSchool() { return school; }

    public void setPaper(Paper paper, PaperOffering paperOffering) {
        this.paper[paperCount] = paper;
        this.paperOffering[paperCount] = paperOffering;
        paperCount++;
    }

    public String displayPaper(int index) {
        String output = "Paper Offering -  " + paper[index].getnumber() + "   " + paperOffering[index].getName()
                + "   Lecturer: " + toString();
        return output;
    }

    public String toString() { return (firstName + " " + lastName); }
}
