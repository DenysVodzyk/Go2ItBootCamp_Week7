package Task7_3_Week4Atm;

import java.time.LocalDate;

public class Software {
    private int version;
    private LocalDate date;
    private String personThatDidUpdate;

    public Software() {
        this.version = 1;
        this.date = date.minusYears(2);
        this.personThatDidUpdate = "Initial Support";
    }

    public Software(int version, String personThatDidUpdate) {
        this.version = version;
        this.date = LocalDate.now();
        this.personThatDidUpdate = personThatDidUpdate;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPersonThatDidUpdate() {
        return personThatDidUpdate;
    }

    public void setPersonThatDidUpdate(String personThatDidUpdate) {
        this.personThatDidUpdate = personThatDidUpdate;
    }

}

