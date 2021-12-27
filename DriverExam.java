import java.util.Scanner;
public class DriverExam {
    int nCorrect;
        int nIncorrect;
    public DriverExam(char[] answers) {
		}

	public static void main(String[] args){
        
        Scanner keyboard=new Scanner(System.in);

        String[] answers={"B","D", "A", "A", "C", "A", "B", "A", "C", "D"};
        String[] studentns=new String[10];
    }

        public static boolean passed(char[] exam, char[] answers, double passing)
        {
            if(totalCorrect(exam, answers)>5);
            return true;
            }

        public static int totalCorrect(char[] exam, char[] answers)
        {
            int nCorrect = 0;
                for (int i = 0; i < exam.length; i++)
                if (exam[i] == answers[i])
                nCorrect++;
                return nCorrect;
                }
        public static int totalIncorrect(char[] exam, char[] answers)
        {
            int nIncorrect = 0;
            for (int i = 0; i < exam.length; i++)
                if (exam[i] != answers[i])
                nIncorrect++;
                return nIncorrect;
                }
        static int[] questionMissed(char[] exam, char[] answers)
        {
            int[] missedQuestions = new int[totalIncorrect(exam, answers)];
            int count=0;
            for (int i = 0; i < exam.length; i++)
                if (exam[i] != answers[i])
                missedQuestions[count++] = (i+1);
                return missedQuestions;
                }

            
        
    
    }
    

