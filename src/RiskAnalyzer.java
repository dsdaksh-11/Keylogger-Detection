class RiskAnalyzer {
    public static String getRiskLevel(int score) {
        if (score <= 2) return "SAFE";
        else if (score <= 5) return "SUSPICIOUS";
        else return "HIGH RISK";
    }
}