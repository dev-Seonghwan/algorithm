class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        
        int n = numer1 * denom2 + numer2 * denom1;
        int d = denom1 * denom2;
        
        for (int i = d; i > 1; i--) {
            if (n % i == 0 && d % i == 0 ) {
                n /= i;
                d /= i;
            }
        }


        int[] answer = {n,d};
        
        return answer;
    }
}