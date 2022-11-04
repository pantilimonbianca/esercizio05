public class CollegePerson {

    public String name;
    public String surname;
    public int collegeID;

    public CollegePerson(String name, String surname, int collegeID){
        this.name=name;
        this.surname=surname;
        this.collegeID=collegeID;

    }

    public void goToCollege(){
        System.out.println("name: " + this.name + "\nsurname: " + this.surname + "\ncollegeID: " + collegeID);

    }
}
