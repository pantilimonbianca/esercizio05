public class Assistant extends CollegePerson implements ITeachingPerson, ILearningPerson{

    public boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int collegeID, boolean isGoingToBeAPhD){
        super(name,surname,collegeID);
        this.isGoingToBeAPhD=isGoingToBeAPhD;
    }


    @Override
    public void studyAtHome() {
        System.out.println("L'assistente studia a casa");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("L'assistente insegna agli studenti");

    }
}
