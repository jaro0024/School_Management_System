package school.management.system;


/**
 * Created by Daniela Jaros on 05/18/18.
 * <p>
 * This is responsible for keeping track
 * of teacher's name, is and salary.
 */

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Constructor creates a new Teacher object.
     *
     * @param id     id for the teacher.
     * @param name   name of the teacher.
     * @param salary salary of the teacher.
     */

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     * @return the id.
     */

    public int getId() {
        return id;
    }

    /**
     * @return name of the teacher.
     */

    public String getName() {
        return name;
    }

    /**
     * @return the salary of the teacher.
     */

    public int getSalary() {
        return salary;
    }

    /**
     * Set the salary.
     *
     * @param salary
     */

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Adds to salaryEarned
     * Removes from the total money earned by school.
     *
     * @param salary
     */

    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher's name: " + name +
                " and Salary received: $" + salaryEarned;
    }
}

