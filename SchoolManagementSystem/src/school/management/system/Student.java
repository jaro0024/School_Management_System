package school.management.system;


/**
 * Created by Daniela Jaros on 05/18/18.
 *
 * This class is responsible for keeping track of students
 */

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /** Constructor to create a new student by initializing.
     * Fees for every student is $30,000.
     * Fees paid initially is 0.
     * @param id id for student: unique.
     * @param name name for the student.
     * @param grade grade of the student.
     */

    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Not going to alter student's name or student id.

    /**
     * Used to update the student's grade.
     * @param grade new grade of the student
     */

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Keep adding the fees to the feesPaid field.
     * Add the fees to the fees paid.
     * The school is going to receive the funds.
     * @param fees the fees that the student pays.
     */

    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     * @return id of student.
     */

    public int getId() {
        return id;
    }

    /**
     * @return name of the student.
     */

    public String getName() {
        return name;
    }

    /**
     * @return grade of the student.
     */

    public int getGrade() {
        return grade;
    }

    /**
     * @return fees paid by the student.
     */

    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     * @return total fees paid by the student.
     */

    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * @return the remaining fees.
     */

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: " + name +
                " and Total fees paid so far: $" + feesPaid;
    }
}

