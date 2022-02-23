package inheritance;

public class Student {
    String firstName;
    String lastName;
    int group;
    double average_mark;

    Student() {

    }

    Student(String firstName, String lastName, int group, double average_mark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.average_mark = average_mark;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void setGroup(int group) {
        this.group = group;
    }

    void setAverage_mark(double average_mark) {
        this.average_mark = average_mark;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    int getGroup() {
        return group;
    }

    double getAverage_mark() {
        return average_mark;
    }

    int getScholarship() {
        if (this.average_mark == 10) {
            return 100;
        } else {
            return 80;
        }
    }
}
