public class Runner {

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public boolean love6(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        }
        if (a + b == 6) {
            return true;
        }
        if (a - b == 6 || b - a == 6) {
            return true;
        }
        return false;
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode == true) {
            if (n > 1 && n < 10) {
                return false;
            }
            return true;
        }
        if (n >= 1 && n <= 10) {
            return true;
        }
        return false;
    }

    public boolean old35(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return false;
        }
        if (n % 3 == 0) {
            return true;
        }
        if (n % 5 == 0) {
            return true;
        }
        return false;
    }

    public int[] swapEnds(int[] nums) {
        int x = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = x;
        return nums;
    }

    public boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0]) {
            return true;
        }
        if (a[a.length - 1] == b[b.length - 1]) {
            return true;
        }
        return false;
    }

    public boolean or35(int n) {
        if (n % 3 == 0 || n % 5 == 0) {
            return true;
        }
        return false;
    }

    public boolean in1020(int a, int b) {
        if (a >= 10 && a <= 20) {
            return true;
        }
        if (b >= 10 && b <= 20) {
            return true;
        }
        return false;
    }

    public int sum2(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        return nums[0] + nums[1];
    }

    public String repeatFront(String str, int n) {
        String front = "";
        for(int i = n; i > 0; i--) {
            front += str.substring(0, i);
        }
        return front;
    }
}