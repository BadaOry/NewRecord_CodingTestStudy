package p1;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int correct = 0;
        int zero = 0;
        int[] rank = {6,6,5,4,3,2,1};
        
        for(int i=0;i<lottos.length;i++){
            for(int j=0;j<win_nums.length;j++){
                if(lottos[i]==0){
                    zero++;
                    break;
                }
                if(lottos[i]==win_nums[j]){
                    correct++;
                    break;
                }
            }
        }
        
        answer[0]=rank[zero+correct];
        answer[1]=rank[correct];
        
        return answer;
    }
}