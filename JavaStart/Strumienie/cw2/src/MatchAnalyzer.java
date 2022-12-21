import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatchAnalyzer {
    public static void main(String[] args) {

        System.out.println("Wszystkie mecze:");
        Stream<MatchResult> results = createStream();
        printAllMatches(results);
        System.out.println("--------------");

        System.out.println("Wszytskie spotkania Polski:");
        results = createStream();
        getResultsWithTeam(results, "Polska").forEach(System.out::println);

        System.out.println("----------------");
        results = createStream();
        System.out.println("Liczba drużyn biorących udział w turnieju: " + counterUniqueTeams(results));

        System.out.println("----------");
        results = createStream();
        System.out.println("Lączna liczba bramek: " + numbersOfGoals(results));

    }

    private static int numbersOfGoals(Stream<MatchResult> results) {
        return results.mapToInt(MatchResult::getGoalsSum)
                .sum();
    }

    private static long counterUniqueTeams(Stream<MatchResult> results) {
        return results.map(MatchResult::getTeamNames)
                .flatMap(Arrays::stream)
                .distinct()
                .count();
    }

    private static List<MatchResult> getResultsWithTeam(Stream<MatchResult> results, String team) {
        return results.filter(matchResult -> matchResult.containsTeam(team))
                .collect(Collectors.toList());
    }

    private static void printAllMatches(Stream<MatchResult> results) {
        results.sorted(Comparator.comparing(MatchResult::getGoalDef).reversed())
                .forEach(System.out::println);
}
    private static Stream<MatchResult> createStream() {
        return Stream.of(
                new MatchResult("Polska", "Irlandia", 2, 0),
                new MatchResult("Brazylia", "Francja", 0, 3),
                new MatchResult("Włochy", "Polska", 2, 1),
                new MatchResult("Brazylia", "Argentyna", 2, 2),
                new MatchResult("Anglia", "Niemcy", 1, 2),
                new MatchResult("Anglia", "Francja", 3, 0),
                new MatchResult("Polska", "Portugalia", 1, 0),
                new MatchResult("Brazylia", "Niemcy", 3, 3)
        );
    }
}
