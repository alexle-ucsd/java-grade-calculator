public class GradeCalculator {
    public static String calculateGrade(int score) {
        if (score < 0 || score > 100) return "Invalid";
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        if (score >= 60) return "D";
        return "F";
    }
}
