
public class EE47AdditionQuiz {
    private static int[] firstNumbers;  
    private static int[] secondNumbers; 
    private static int[] userAnswers;       
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome to the addition quiz!");
        System.out.println();
        createQuiz();
        administerQuiz();
        gradeQuiz();
    }
    
    
    private static void createQuiz() {
        firstNumbers = new int[10];
        secondNumbers = new int[10];
        for ( int i = 0; i < 10; i++ ) {
            firstNumbers[i] = (int)(Math.random() * 50 + 1); 
            secondNumbers[i] = (int)(Math.random() * 50);
        }
    }
    
    private static void administerQuiz() {
        userAnswers = new int[10];
        for (int i = 0; i < 10; i++) {
            int questionNum = i + 1;
            System.out.printf("Question %2d:  What is %2d + %2d  ? ",
                          questionNum, firstNumbers[i], secondNumbers[i]);
            userAnswers[i] = TextIO.getlnInt();
        }
    }

    private static void gradeQuiz() {
        System.out.println();
        System.out.println("Here are the correct answers:");
        int numberCorrect = 0;
        int grade;
        for (int i = 0; i < 10; i++) {
            int questionNum = i + 1;
            int correctAnswer = firstNumbers[i] + secondNumbers[i];
            System.out.printf("   Question %2d:  %2d + %2d  =  %2d.  ",
                questionNum, firstNumbers[i], secondNumbers[i], correctAnswer);
            if ( userAnswers[i] == correctAnswer ) {
                System.out.println("You were CORRECT.");
                numberCorrect++;
            }
            else {
                System.out.println("You said " + userAnswers[i] + ", which is INCORRECT.");
            }
        }
        grade = numberCorrect * 10;
        System.out.println();
        System.out.println("You got " + numberCorrect + " questions correct.");
        System.out.println("Your grade on the quiz is " + grade);
        System.out.println();
    }
}
