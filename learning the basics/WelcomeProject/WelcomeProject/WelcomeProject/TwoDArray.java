package WelcomeProject;

public class TwoDArray {
    public static void main(String[] args) {

        int[][] marks= new int [4][6];
        System.out.println(marks.length); // print row length
        System.out.println(marks[0].length); // print coulmns length (it can be any number instead 0)
        marks[3][2]= 32;
        marks[2][0]= 40;
        for (int col=0 ; col<marks[1].length ; col++)
        {
            marks[1][col]=10;
        }
        for (int col=0 ; col<marks[1].length ; col++)
        System.out.println(marks[1][col]);


        // int[][] arr= {{2, 1, 3},
        //               {3, 4, 5},
        //               {5, 6, 8} };
        // System.out.println(arr.length);

        
    }
    
}
