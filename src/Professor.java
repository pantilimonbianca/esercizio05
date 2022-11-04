public class Professor extends CollegePerson implements ITeachingPerson{
    public String teachingSubject;

    public Professor(String name,String surname,int collegeID, String teachingSubject){
        super(name,surname,collegeID);
        this.teachingSubject=teachingSubject;
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("Il professore insegna agli studenti.");
    }
}
