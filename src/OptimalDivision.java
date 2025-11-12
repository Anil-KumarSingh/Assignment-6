class OptimalDivision {
    public String optimalDivision(int[] nums) {
        int n = nums.length;

        if (n == 1) return String.valueOf(nums[0]);
        if (n == 2) return nums[0] + "/" + nums[1];

        StringBuilder sb = new StringBuilder();
        sb.append(nums[0]).append("/(").append(nums[1]);

        for (int i = 2; i < n; i++) {
            sb.append("/").append(nums[i]);
        }

        sb.append(")");
        return sb.toString();
    }
        public static void main(String[] args) {
            OptimalDivision sol = new OptimalDivision();

            int[] nums1 = {1000, 100, 10, 2};
            int[] nums2 = {2, 3, 4};
            int[] nums3 = {5};

            System.out.println("Optimal Division for [1000, 100, 10, 2]: " + sol.optimalDivision(nums1));
            System.out.println("Optimal Division for [2, 3, 4]: " + sol.optimalDivision(nums2));
            System.out.println("Optimal Division for [5]: " + sol.optimalDivision(nums3));
        }
    }

