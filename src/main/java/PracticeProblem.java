public class PracticeProblem { 

    public static void main(String args[]) {
        // Test the function
        System.out.println(towerOfHanoi(3));  // 7
        System.out.println(towerOfHanoi(4));  // 15  
        System.out.println(towerOfHanoi(5));  // 31
        System.out.println(towerOfHanoi(2));  // -1
        System.out.println(towerOfHanoi(1));  // -1
        System.out.println(towerOfHanoi(0));  // -1
    }
    
    public static int towerOfHanoi(int num) {
        // Return -1 if input is less than 3 (as specified)
        if (num < 3) {
            return -1;
        }
        
        // Use the direct mathematical formula to avoid stack overflow
        return (1 << num) - 1;  // This is 2^n - 1 using bit shifting
    }
}
