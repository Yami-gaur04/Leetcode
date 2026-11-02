class Solution {
    public boolean isHappy(int n) {
        int first = n;
        int second = n;

        do {
            first = sum(first);
            second = sum(sum(second));
        } while (first != second);

        return first == 1;
    }

    public int sum(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }

        return sum;
    }
}