import java.util.Scanner;

abstract class TestQuestion {
    private String questionText;
    private int pointValue;

    public TestQuestion(String questionText, int pointValue) {
        this.questionText = questionText;
        this.pointValue = pointValue;
    }

    public abstract boolean isCorrect(String answer);

    public String getQuestionText() {
        return questionText;
    }

    public int getPointValue() {
        return pointValue;
    }
}

class MultChoice extends TestQuestion {
    private String[] choices;
    private int correctIndex;

    public MultChoice(String questionText, int pointValue, String[] choices, int correctIndex) {
        super(questionText, pointValue);
        this.choices = choices;
        this.correctIndex = correctIndex;
    }

    @Override
    public boolean isCorrect(String answer) {
        int userChoice = Integer.parseInt(answer);
        return userChoice == correctIndex;
    }

    public void displayChoices() {
        for (int i = 0; i < choices.length; i++) {
            System.out.println((i + 1) + ". " + choices[i]);
        }
    }
}

public class WriteTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of multiple-choice questions
        System.out.print("Enter the number of multiple-choice questions: ");
        int numQuestions = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an array to store the questions
        TestQuestion[] questions = new TestQuestion[numQuestions];

        // Input details for each question
        for (int i = 0; i < numQuestions; i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            System.out.print("Enter the question text: ");
            String questionText = scanner.nextLine();

            System.out.print("Enter the point value: ");
            int pointValue = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter the number of choices: ");
            int numChoices = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            String[] choices = new String[numChoices];
            for (int j = 0; j < numChoices; j++) {
                System.out.print("Enter choice " + (j + 1) + ": ");
                choices[j] = scanner.nextLine();
            }

            System.out.print("Enter the index of the correct choice: ");
            int correctIndex = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Create MultChoice object and store it in the array
            questions[i] = new MultChoice(questionText, pointValue, choices, correctIndex - 1);
        }

        // Display each question and get user's answers
        int totalPoints = 0;
        for (TestQuestion question : questions) {
            System.out.println("\n" + question.getQuestionText());
            if (question instanceof MultChoice) {
                ((MultChoice) question).displayChoices();
            }
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (question.isCorrect(userAnswer)) {
                System.out.println("Correct! You earned " + question.getPointValue() + " points.");
                totalPoints += question.getPointValue();
            } else {
                System.out.println("Incorrect. The correct answer was not selected. No points earned.");
            }
        }

        // Display total points earned
        System.out.println("\nTotal Points Earned: " + totalPoints);

        // Close the scanner
        scanner.close();
    }
}
