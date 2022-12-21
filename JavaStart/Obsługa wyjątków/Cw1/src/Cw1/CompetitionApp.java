package Cw1;

public class CompetitionApp {
    public static void main(String[] args) {

        try {
            CompetitionController competitionController = new CompetitionController();
            competitionController.run();
        }catch (AgeViolationException  | DuplicateException  | MaxCompetitorsException e){
            System.out.println(e.getMessage());
        }
    }
}