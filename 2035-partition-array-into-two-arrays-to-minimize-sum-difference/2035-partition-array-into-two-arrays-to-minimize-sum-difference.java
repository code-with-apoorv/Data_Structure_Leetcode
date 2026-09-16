import java.util.*;

class Solution {
    public int minimumDifference(int[] nums) {

        int n = nums.length;
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int half = n / 2;

        List<Integer>[] left = new ArrayList[half + 1];
        List<Integer>[] right = new ArrayList[half + 1];

        for (int i = 0; i <= half; i++) {
            left[i] = new ArrayList<>();
            right[i] = new ArrayList<>();
        }

        int leftSize = 1 << half;
        int rightSize = 1 << (n - half);

        for (int mask = 0; mask < leftSize; mask++) {

            int sum = 0;
            int count = 0;

            for (int i = 0; i < half; i++) {

                if ((mask & (1 << i)) != 0) {
                    sum += nums[i];
                    count++;
                }
            }

            left[count].add(sum);
        }

        for (int mask = 0; mask < rightSize; mask++) {

            int sum = 0;
            int count = 0;

            for (int i = 0; i < n - half; i++) {

                if ((mask & (1 << i)) != 0) {
                    sum += nums[half + i];
                    count++;
                }
            }

            right[count].add(sum);
        }

        for (int i = 0; i <= half; i++) {
            Collections.sort(right[i]);
        }

        int answer = Integer.MAX_VALUE;

        for (int count = 0; count <= half; count++) {

            int otherCount = half - count;

            for (int sumLeft : left[count]) {

                int target = totalSum / 2 - sumLeft;

                List<Integer> list = right[otherCount];

                int index = Collections.binarySearch(list, target);

                if (index < 0) {
                    index = -index - 1;
                }

                if (index < list.size()) {
                    int sum1 = sumLeft + list.get(index);
                    int sum2 = totalSum - sum1;

                    answer = Math.min(
                        answer,
                        Math.abs(sum1 - sum2)
                    );
                }

                if (index > 0) {
                    int sum1 = sumLeft + list.get(index - 1);
                    int sum2 = totalSum - sum1;

                    answer = Math.min(
                        answer,
                        Math.abs(sum1 - sum2)
                    );
                }
            }
        }

        return answer;
    }
}