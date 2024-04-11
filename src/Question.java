import java.util.List;

public class Question {
    private final String question;
    private final List<String> allAnswers;
    private final List<String> correctAnswers;

    public Question(String question, List<String> allAnswers, List<String> correctAnswers) {
        this.question = question;
        this.allAnswers = allAnswers;
        this.correctAnswers = correctAnswers;
    }
    public String getQuestion() {
        return question;
    }
    public List<String> getAllAnswers() {
        return allAnswers;
    }
    public List<String> getCorrectAnswers() {
        return correctAnswers;
    }
}
