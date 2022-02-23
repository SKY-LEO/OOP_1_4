package inheritance;

public class Aspirant extends Student {
    String scientific_work;

    Aspirant() {

    }

    Aspirant(String firstName, String lastName, int group, double average_mark, String scientific_work) {
        super(firstName, lastName, group, average_mark);
        this.scientific_work = scientific_work;
    }

    void setScientific_work(String scientific_work) {
        this.scientific_work = scientific_work;
    }

    String getScientific_work() {
        return scientific_work;
    }

    @Override
    int getScholarship() {
        if (this.average_mark == 10) {
            return 200;
        } else {
            return 180;
        }
    }
}
