public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        
        double sum = 0;
        int counter= 0;
        for(int row = 0; row <mat.length; row++){
            for(int col = 0; col < mat[row].length; col++){
                sum = sum + mat[row][col];
                counter++;
            }
        }

        return sum / counter;
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        
        double middle = mat.length / 2;
        for (int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length;j++){
                if (mat.length % 2 == 1) {
                    return mat[middle];
                } 
                else {
                    return (mat[middle - 1] + mat[middle]) / 2.0;
                }
            }
        }
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
    
    int num = 0;
    int[] y = new int[100];
    int mode = -1;
    int largest = 0;
    
    for (int row = 0; row < mat.length; row++) {
        for (int col = 0; col < mat[row].length; col++) {
            num = (int) mat[row][col];
            y[num]++;
        }
    }

    for (int i = 0; i < 100; i++) {
        if (y[i] > largest) {
            largest = y[i];
            mode = i;
        }
        
    }
    return mode;
    }


    public static void main(String[] args) {
        double[][] arr= {{1,3,5},{8,3,5},{2,4,6},{6,9,1},{3,7,1}};
        System.out.print(mean(arr));
        System.out.print(median(arr));
        System.out.print(mode(arr));
    }
}
