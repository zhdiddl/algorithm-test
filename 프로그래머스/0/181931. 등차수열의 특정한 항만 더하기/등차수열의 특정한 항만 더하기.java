class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        int length = included.length;
        int[] array = new int[length];
        
        for (int i = 0; i < length; i++) {
            array[i] = a + (d * i);
        }
        
        for (int j = 0; j < length; j++) {
            if (included[j]) {
                answer += array[j];
            }
        }
        
        return answer;
    }
}