public class Main{
    public static void main(String[] args) {
        // Create handlers
        SupportHandler level1 = new Level1Support();
        SupportHandler level2 = new Level2Support();
        SupportHandler level3 = new Level3Support();

        // Build the chain
        level1.setNextHandler(level2);
        level2.setNextHandler(level3);

        // Test the chain with different issues
        System.out.println("=== Test Case 1: Password Reset ===");
        level1.handleRequest("Password reset request", 1);

        System.out.println("\n=== Test Case 2: Application Bug ===");
        level1.handleRequest("Application bug report", 2);

        System.out.println("\n=== Test Case 3: System Failure ===");
        level1.handleRequest("Critical system failure", 3);

        System.out.println("\n=== Test Case 4: Unknown Issue ===");
        level1.handleRequest("Unknown issue", 4);
    }
}
