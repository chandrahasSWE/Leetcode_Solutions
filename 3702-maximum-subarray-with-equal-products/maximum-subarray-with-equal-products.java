class Solution {

    public int maxLength(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {

            long product = 1;
            long lcm = 1;
            long gcd = 0;

            for (int j = i; j < n; j++) {

                product *= nums[j];

                if (gcd == 0) {
                    gcd = nums[j];
                } else {
                    gcd = gcd((int) gcd, nums[j]);
                }

                lcm = lcm(lcm, nums[j]);

                if (product == gcd * lcm) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    private long lcm(long a, long b) {
        return (a / gcd((int) a, (int) b)) * b;
    }
}