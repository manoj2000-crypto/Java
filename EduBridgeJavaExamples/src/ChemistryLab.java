public class ChemistryLab {
    public static void main(String[] args) {
        minMaxTime("16:1@:40");
    }

    static void minMaxTime(String inputTime) {
        char[] timeArray = inputTime.toCharArray();

        int hour, min, sec;
        hour = parseTimeComponent(timeArray, 0, 2);
        min = parseTimeComponent(timeArray, 3, 2);
        sec = parseTimeComponent(timeArray, 6, 2);

        char blank = timeArray[4];

        int minPossible = findMinPossible(hour, min, sec);
        int maxPossible = findMaxPossible(hour, min, sec);

        System.out.println("MIN " + formatTime(minPossible));
        System.out.println("MAX " + formatTime(maxPossible));
    }

    static int parseTimeComponent(char[] timeArray, int startIndex, int length) {
        StringBuilder component = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = timeArray[startIndex + i];
            if (c != '@') {
                component.append(c);
            }
        }
        return Integer.parseInt(component.toString());
    }

    static int findMinPossible(int hour, int min, int sec) {
        int minPossible = Integer.MAX_VALUE;

        for (int i = 0; i <= 9; i++) {
            int newMin = min * 10 + i;
            if (newMin < 60) {
                minPossible = Math.min(minPossible, buildTime(hour, newMin, sec));
            }
        }

        return minPossible;
    }

    static int findMaxPossible(int hour, int min, int sec) {
        int maxPossible = Integer.MIN_VALUE;

        for (int i = 9; i >= 0; i--) {
            int newMin = min * 10 + i;
            if (newMin < 60) {
                maxPossible = Math.max(maxPossible, buildTime(hour, newMin, sec));
            }
        }

        return maxPossible;
    }

    static int buildTime(int hour, int min, int sec) {
        return hour * 10000 + min * 100 + sec;
    }

    static String formatTime(int time) {
        int hour = time / 10000;
        int min = (time % 10000) / 100;
        int sec = time % 100;

        return String.format("%02d:%02d:%02d", hour, min, sec);
    }
}
