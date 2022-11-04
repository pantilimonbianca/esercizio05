public class Student extends CollegePerson implements ILearningPerson {

    public int academicYear;

    public Student(String name, String surname, int collegeID, int academicYear){
        super(name,surname,collegeID);
        this.academicYear=academicYear;
    }

    @Override
    public void studyAtHome() {
        System.out.println("Lo studente studia a casa ");

    }

}
