class Solution {
    public int twoCitySchedCost(int[][] costs) {
int len = costs.length;

    // Largest difference btwn A and B will be in front, Most negative number at the back.
    Arrays.sort(costs, (a, b) -> Integer.compare(a[0] - a[1], b[0] - b[1]));

    // For 1st half of costs, sum+=A;
    // For 2nd half of costs, sum+=B;
    int sum = 0;
    for (int i=0; i<len; i++){
        if (i<len/2)
            sum += costs[i][0];
        else
            sum += costs[i][1];
    }
    return sum;
}
}