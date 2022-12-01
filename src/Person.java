public class Person {
    private int yearOfBirth;
    public String name;
    private String town;
    public String jobTitle;



    public Person(int yearOfBirth, String name, String town, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;

        // Домашнее задание 3
        // Задача 1
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name==null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town==null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTitle==null) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
        }
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public void setTown(String town) {
        this.town = town;
        if (town==null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }
}


