class Solution {
    public int solution(int a, int b, int c) {
        int[] dice = {a, b, c};
        int sum = 0;
        int squareSum = 0;
        int cubeSum = 0;
        
        for (int n : dice) {
            sum += n;
            squareSum += n * n;
            cubeSum += n * n * n;
        }
        
        if (a == b && b == c) {
            return sum * squareSum * cubeSum;
        } else if (a == b || b == c || c == a) {
            return sum * squareSum;
        } else {
            return sum;
        }

    }
}