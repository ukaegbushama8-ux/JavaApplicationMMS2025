public class Multi_Dimensional_Array{
    public static void main(String[] args){

        int[][] numbers = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        
        for(int row = 0; row < 3; row++){
            for(int col = 0; col< 5; col++){
                System.out.printf(" %d%n ",numbers[row][col]);
            }
        }
        System.out.println("Using enhanced for loop: " );
        for(int[] row : numbers){
            for(int col : row){
                System.out.printf(" %d%n ",col);
            }
        }
    }
}