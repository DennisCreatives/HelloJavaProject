public class StudentRecord {
    // Instance Variables
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;

    // static/class variable(s)
    private static int studentCount;

    /**
     * changes the name of the student (Mutator method)
     * @param temp
     */

    public void setName(String temp) {
        name = temp;
    }

    /**
     * Returns the name of the student (Accessor method)
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setAge(int Age) {
        age = Age;
    }

    public int getAge(){
        return age;
    }

    public void setAddress(String Address){
        address = Address;
    }

    public String getAddress() {
        return address;
    }

    public void setEnglishGrade(double EnglishGrade) {
        englishGrade = EnglishGrade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public void setMathGrade(double MathGrade) {
        mathGrade = MathGrade;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setScienceGrade(double ScienceGrade) {
        scienceGrade = ScienceGrade;
    }

    public double getScienceGrade() {
        return scienceGrade;
    }

    /**
     * computes the average of the english, math and science grades
     * Accessor Method
     */
    public double getAverage() {
        double result = 0;
        result = (mathGrade + englishGrade + scienceGrade) / 3;
        return result;
    }

    /**
     * returns the number of instances of studentRecords
     * accessor method
     */
    public static int getStudentCount() {
        return studentCount;
    }

    public void print(String temp){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }

    public void print(double eGrade, double mGrade, double sGrade){
        System.out.println("Name: " + name);
        System.out.println("Math Grade: " + mGrade);
        System.out.println("English Grade: " + eGrade);
        System.out.println("Science Grade: " + sGrade);
    }

}
