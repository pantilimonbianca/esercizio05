public class Testing {
    public static void main(String[] args) {

        Student studente=new Student("Bianca", "Pantilimon",98763,2023);
        Professor professore= new Professor("Claudia", "Rossi", 34262, "java");
        Assistant assistente=new Assistant("Gino", "Verdi",64837,true);

        studente.goToCollege();
        professore.goToCollege();
        assistente.goToCollege();

        studente.studyAtHome();
        professore.teachToOtherPeople();
        assistente.studyAtHome();
        assistente.teachToOtherPeople();


    }
}
