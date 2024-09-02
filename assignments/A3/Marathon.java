class Marathon {
    public static int findfatest(int[] times) {
        // return fastest guy index
        int fastestIndex = 0;
        int currfatestTime = times[0];
        for (int i = 0; i < times.length; i++) {
            if (times[i] < currfatestTime) {
                fastestIndex = i;
                currfatestTime = times[i];
            }
        }
        return fastestIndex;
    }

    public static int findsecfatest(int[] times, int fatestIndex) {
        int currdiff = Math.abs(times[0] - times[fatestIndex]);
        int secondfatestIndex = 0;
        // already had fatest index, find one time with lowest difference with them
        for (int i = 0; i < times.length; i++) {
            if (i == fatestIndex) {
                continue;
            }
            if (Math.abs(times[i] - times[fatestIndex]) < currdiff) {
                secondfatestIndex = i;
            }
        }
        return secondfatestIndex;
    }

    public static void main(String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };

        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }

        int fastestIndex = findfatest(times);
        int secondfatestIndex = findsecfatest(times, fastestIndex);

        System.out.println("fastest name: " + names[fastestIndex] + "fastest time: " + times[fastestIndex]);
        System.out.println(
                "sec fastest name: " + names[secondfatestIndex] + "sec fastest time: " + times[secondfatestIndex]);

    }
}