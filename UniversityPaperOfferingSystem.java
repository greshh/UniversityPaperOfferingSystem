public class UniversityPaperOfferingSystem {
    public static void main(String[] args) {
        // LOADING SCHOOL
        School school = new School("School of Mathematical and Computational Sciences");
        // LOADING MAJORS
        Major[] major = new Major[5];
        major[0] = new Major("CS", school.getName());
        major[1] = new Major("IT", school.getName());
        major[2] = new Major("IS", school.getName());
        major[3] = new Major("SE", school.getName());
        major[4] = new Major("DS", school.getName());
        // LOADING PAPERS & ASSESSMENTS
        Paper[] paper = new Paper[7];
        boolean[] in_major = new boolean[5]; // in order - CS (0), IT (1), IS (2), SE (3), DS (4)
        for (int i = 0; i < in_major.length; i++) {
            in_major[i] = false;
        }
        in_major[1] = true;
        in_major[2] = true;
        paper[0] = new Paper(158100, "Information Technology Principles", school.getName(), in_major, major, 70, 30, 0);
        paper[1] = new Paper(158120, "Web-based IT Fundamentals", school.getName(), in_major, major, 60, 40, 0);
        in_major[0] = true;
        in_major[1] = false;
        in_major[2] = false;
        in_major[3] = true;
        paper[4] = new Paper(159234, "Object-Oriented Programming", school.getName(), in_major, major, 50, 10, 40);
        in_major[0] = false;
        in_major[1] = true;
        in_major[4] = true;
        paper[5] = new Paper(158337, "Database Development", school.getName(), in_major, major, 60, 0, 40);
        in_major[0] = true;
        in_major[1] = false;
        in_major[2] = true;
        paper[3] = new Paper(159201, "Algorithms and Data Structures", school.getName(), in_major, major, 40, 20, 40);
        for (int i = 0; i < in_major.length; i++) {
            in_major[i] = true;
        }
        paper[2] = new Paper(159101, "Applied Programming", school.getName(), in_major, major, 50, 50, 0);
        paper[6] = new Paper(158345, "Professionalism in the Information Sciences", school.getName(), in_major, major, 100, 0, 0);
        // LOADING PAPER OFFERINGS
        PaperOffering[] paperOffering = new PaperOffering[3];
        paperOffering[0] = new PaperOffering("Distance", school.getName());
        paperOffering[1] = new PaperOffering("Auckland", school.getName());
        paperOffering[2] = new PaperOffering("PN      ", school.getName());
        // LOADING LECTURERS
        Lecturer[] lecturer = new Lecturer[10];
        lecturer[0] = new Lecturer(1105236, "Amy", "Sheffield", school.getName(), paperOffering[2]);
        lecturer[1] = new Lecturer(1105236, "Victoria", "Jensen", school.getName(), paperOffering[2]);
        lecturer[2] = new Lecturer(7225669, "James", "Lee", school.getName(), paperOffering[2]);
        lecturer[3] = new Lecturer(1328991, "Colin", "Delmont", school.getName(), paperOffering[2]);
        lecturer[4] = new Lecturer(1562347, "Thomas", "Becker", school.getName(), paperOffering[1]);
        lecturer[5] = new Lecturer(5664789, "Steven", "Hobbs", school.getName(), paperOffering[1]);
        lecturer[6] = new Lecturer(3658947, "Andrew", "Jackson", school.getName(), paperOffering[1]);
        lecturer[7] = new Lecturer(6332698, "Jonathon", "Wood", school.getName(), paperOffering[1]);
        lecturer[8] = new Lecturer(12345678, "Mickey", "Mouse", school.getName(), paperOffering[1]);
        lecturer[9] = new Lecturer(22012395, "Greshka", "Lao", school.getName(), paperOffering[1]);
        // ASSIGNING LECTURERS TO PAPERS
        int temp;
        for (int i = 0; i < paper.length; i++) {
            temp = (int)(Math.random()*10);
            while (lecturer[temp].getpaperCount() >= 4) {
                temp = (int)(Math.random()*10);
            }
            lecturer[temp].setPaper(paper[i], paperOffering[0]);
            paper[i].setLecturer(0, lecturer[temp]);
            for (int j = 1; j < paperOffering.length; j++) {
                temp = (int)(Math.random()*10);
                while ((lecturer[temp].getpaperCount() >= 4) || (lecturer[temp].getCampus() != paperOffering[j])) {
                    temp = (int)(Math.random()*10);
                }
                lecturer[temp].setPaper(paper[i], paperOffering[j]);
                paper[i].setLecturer(j, lecturer[temp]);
            }
        }
        // DISPLAYING INFO
        System.out.println("------------------ Task 1 ------------------");
        System.out.println("School Full Name: " + school.getName());
        System.out.println();
        System.out.println("------------------ Task 2 ------------------");
        System.out.println("All papers details:");
        for (int i = 0; i < paper.length; i++) {
            System.out.println(paper[i].getnumber() + "  " + paper[i].getName() + " (" + paper[i].getMajor() + ")");
        }
        System.out.println();
        System.out.println("------------------ Task 3 ------------------");
        System.out.println("Papers that belong to the Major " + major[0].getName() + ":"); // major[0] = CS
        int paperCount = 0;
        for (int i = 0; i < paper.length; i++) {
            if (paper[i].searchMajor(major[0])) {
                System.out.println(paper[i]);
                paperCount++;
            }
        }
        System.out.println("Total matching papers in specified Major - " + major[0].getName() + " :" + paperCount);
        System.out.println();
        System.out.println("------------------ Task 4 ------------------");
        System.out.println("Papers that have exam:");
        paperCount = 0;
        for (int i = 0; i < paper.length; i++) {
            if (paper[i].getExam() > 0) {
                System.out.println(paper[i]);
                paperCount++;
            }
        }
        System.out.println("Total number of papers that have exam: " + paperCount);
        System.out.println();
        System.out.println("------------------ Task 5 ------------------");
        System.out.println("Papers that their assignments weigh higher than 50.0%:");
        paperCount = 0;
        for (int i = 0; i < paper.length; i++) {
            if (paper[i].getAssignments() > 50) {
                System.out.println(paper[i]);
                paperCount++;
            }
        }
        System.out.println("Total number of papers that have assignments weighted more than 50%: " + paperCount);
        System.out.println();
        System.out.println("------------------ Task 6 ------------------");
        System.out.println("Paper offering details:");
        for (int i = 0; i < paper.length; i++) {
            for (int j = 0; j < paperOffering.length; j++) {
                System.out.println(paper[i].getnumber() + "  " + paperOffering[j].getName() + "    "
                        + paper[i].displayLecturer(j));
            }
        }
        System.out.println();
        System.out.println("------------------ Task 7 ------------------");
        System.out.println("The paper offerings that I teach:");
        for (int i = 0; i < lecturer[9].getpaperCount(); i++) {
            System.out.println(lecturer[9].displayPaper(i));
        }
        System.out.println("I am teaching " + lecturer[9].getpaperCount() + " paper(s)");
        System.out.println();
        System.out.println("------------------ Task 8 ------------------");
        System.out.println("The lecturer of Auckland offering of 159234:");
        System.out.println("Lecturer's Name: " + paper[4].displayLecturer(1)); // paper[4] = 159234, index 1 = Auckland
        System.out.println("This lecturer is teaching " + paper[4].getLecturer(1).getpaperCount() + " paper(s)");
        System.out.println();
    }
}
