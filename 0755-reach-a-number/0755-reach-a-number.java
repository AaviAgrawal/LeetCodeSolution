class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int sum = 0,steps = 0;
        while(target > sum || (sum - target)%2 != 0){
            steps++;
            sum += steps;
        }
        return steps;
    }
}