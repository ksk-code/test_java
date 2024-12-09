package test09;

public class cytech09 {

	public static void main(String[] args) {
String[] subjects = {"国語", "数学", "理科", "社会"};
        
        int[][] scores = {
            {85, 90, 78, 88}, // 学生1
            {76, 82, 91, 85}, // 学生2
            {89, 94, 87, 92}, // 学生3
            {65, 70, 72, 68}, // 学生4
            {95, 88, 90, 93}  // 学生5
        };
        
        for (int i = 0; i < scores.length; i++) { 
            System.out.println("学生" + (i + 1) + ":");
            for (int j = 0; j < scores[i].length; j++) { 
                System.out.println("  " + subjects[j] + ": " + scores[i][j]);
            }
        }

	}

}
