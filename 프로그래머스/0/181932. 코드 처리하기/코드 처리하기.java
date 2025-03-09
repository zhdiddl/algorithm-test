class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        
        String[] array = code.split("");
        int mode = 0;
        for (int i = 0; i < array.length; i++) {
            if (mode == 0) {
                if ("1".equals(array[i])) {
                    mode = 1;
                    continue;
                }
                
                if ((i % 2) == 0) {
                    answer.append(array[i]);
                }
            } else if (mode == 1) {
                if ("1".equals(array[i])) {
                    mode = 0;
                    continue;
                }
                
                if ((i % 2) != 0) {
                    answer.append(array[i]);
                }
            }
        }
        
        if (answer.length() == 0) {
            return "EMPTY";
        }
        return answer.toString();
    }
}