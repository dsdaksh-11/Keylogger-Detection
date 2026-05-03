class ScannerEngine {
    static String[] keywords = {
        "keylogger", "keystroke", "hook",
        "listener", "capture", "hidden", "inject"
    };

    public static int scanLine(String line) {
        int score = 0;
        line = line.toLowerCase();

        for (String word : keywords) {
            if (line.contains(word)) {
                score += 2;
            }
        }

        if (line.contains("hidden") || line.contains("background")) {
            score += 3;
        }

        return score;
    }
}