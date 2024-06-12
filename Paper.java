public class Paper extends School {
    private int number;
    private String name;
    private int assignments; // in %
    private int tests; // in %, tests = 0 means no tests for paper
    private int exam; // in %, exam = 0 means no exam for paper
    private Major[] major = new Major[5];
    private Lecturer[] lecturer = new Lecturer[3]; // 0 (Distance), 1 (Auckland), 2 (PN)
    private School school;
    private int majorCount;
    
    public Paper(int number, String name, String nameSchool, boolean[] in_major, Major[] major, int assignments, int tests, int exam) {
        super(nameSchool);
        this.number = number;
        this.name = name;
        this.assignments = assignments;
        this.tests = tests;
        this.exam = exam;
        majorCount = 0;
        if (in_major[0]) {
            this.major[majorCount] = major[0];
            majorCount++;
        }
        if (in_major[1]) {
            this.major[majorCount] = major[1];
            majorCount++;
        }
        if (in_major[2]) {
            this.major[majorCount] = major[2];
            majorCount++;
        }
        if (in_major[3]) {
            this.major[majorCount] = major[3];
            majorCount++;
        }
        if (in_major[4]) {
            this.major[majorCount] = major[4];
            majorCount++;
        }
    }

    public int getnumber() { return number; }
    public String getName() { return name; }
    public School getSchool() { return school; }
    public int getAssignments() { return assignments; }
    public int getTests() { return tests; }
    public int getExam() { return exam; }
    public Lecturer getLecturer(int index) { return lecturer[index]; }
    public String getMajor() {
        String output = "";
        for (int j = 0; j < majorCount; j++) {
            output += (major[j].getName() + " ");
        }
        return output;
    }
    
    public void setLecturer(int index, Lecturer lecturer) {
        this.lecturer[index] = lecturer;
    }

    public String displayLecturer(int index) { return lecturer[index].toString(); }

    public boolean searchMajor(Major major) {
        for (int j = 0; j < majorCount; j++) {
            if (this.major[j] == major) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String output = "Paper -  " + number + " " + name;
        return output;
    }
}

