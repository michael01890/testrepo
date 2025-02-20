public class VulnerableApp {

    // Hardcoded credentials (Security Issue)
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password123";

    public static void main(String[] args) {
        String unusedVariable = "This is never usedd";

        // SQL Injection vulnerability
        String userInput = "'; DROP TABLE users; --";
        String query = "SELECT * FROM users WHERE username = '" + userInput + "'";

        // Unchecked execution of system commands (Potential RCE)
        try {
            Runtime.getRuntime().exec("rm -rf /"); // Dangerous!
        } catch (Exception e) {
            // Swallowing exceptions without logging
        }

        // Insecure hash function usage
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            md.update("password".getBytes());
            byte[] digest = md.digest();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Query: " + query); // Debugging statement leaking SQL query
    }
}

