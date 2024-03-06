public class Main {
    // use this class to run StudentRecord class
    public static void main(String[] args) {
        // create three objects for student record class
        StudentRecord dennisRecord = new StudentRecord();
        StudentRecord muznaRecord = new StudentRecord();
        StudentRecord ianRecord = new StudentRecord();

        // set the names of the students
        dennisRecord.setName("Dennis");
        muznaRecord.setName("Muzna");
        ianRecord.setName("Ian");

        // Print the students names
        System.out.println(muznaRecord.getName());
        System.out.println(ianRecord.getName());
        System.out.println(dennisRecord.getName());

        // print number of students
        System.out.println("Count = " + StudentRecord.getStudentCount());

        // set info for student1
        dennisRecord.setAddress("Nairobi");
        dennisRecord.setAge(20);
        dennisRecord.setMathGrade(90);
        dennisRecord.setEnglishGrade(89);
        dennisRecord.setScienceGrade(98);

        // overloaded methods
        dennisRecord.print(dennisRecord.getName());
        dennisRecord.print(dennisRecord.getMathGrade(), dennisRecord.getEnglishGrade(), dennisRecord.getScienceGrade());
    }
}
