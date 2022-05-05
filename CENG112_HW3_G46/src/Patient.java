import java.time.LocalDate;
import java.time.LocalTime;

public class Patient implements Comparable<Patient> {

    private String name_surname;
    private int age;
    private String gender;
    private String pregnancy;
    private String disability;
    private LocalDate date;
    private LocalTime time;

    public Patient(String name_surname, int age, String gender, String pregnancy, String disability, LocalDate date,
                   LocalTime time){
        this.name_surname = name_surname;
        this.age = age;
        this.gender = gender;
        this.pregnancy = pregnancy;
        this.disability = disability;
        this.date = date;
        this.time = time;
    }

    public void setName_surname(String name_surname) {
        this.name_surname = name_surname;
    }

    public String getName_surname() {
        return name_surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setPregnancy(String pregnancy) {
        this.pregnancy = pregnancy;
    }

    public String getPregnancy() {
        return pregnancy;
    }

    public void setDisability(String disability) {
        this.disability = disability;
    }

    public String getDisability() {
        return disability;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public int compareTo(Patient o) {
        if (date.compareTo(o.date) == 0){
            return (time.compareTo(o.time));
        }
        else{
            return (date.compareTo(o.date));
        }
    }

    @Override
    public String toString() {
        return "Name and Surname: " + name_surname + ", " +
                "Age: " + age + ", " +
                "Gender: " + gender + ", " +
                "Pregnancy: " + pregnancy + ", " +
                "Disability: " + disability + ", " +
                "Date: " + date + ", " +
                "Time: " + time;
    }

}
