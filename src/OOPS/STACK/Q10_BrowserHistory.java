package OOPS.STACK;
import java.util.Stack;

public class Q10_BrowserHistory {

        private Stack<String> backStack;
        private Stack<String> forwardStack;
        private String currentUrl;

        public Q10_BrowserHistory(String homepage) {
            backStack = new Stack<>();
            forwardStack = new Stack<>();
            currentUrl = homepage;
            System.out.println("Homepage: " + currentUrl);
        }

        public void visitPage(String url) {
            backStack.push(currentUrl);
            currentUrl = url;
            forwardStack.clear(); // Important: Forward history is reset on new visit
            System.out.println(" Visiting: " + currentUrl);
        }

        public void back() {
            if (backStack.isEmpty()) {
                System.out.println(" No history to go back to.");
                return;
            }
            forwardStack.push(currentUrl);
            currentUrl = backStack.pop();
            System.out.println("Back to: " + currentUrl);
        }

        public void forward() {
            if (forwardStack.isEmpty()) {
                System.out.println(" No forward history.");
                return;
            }
            backStack.push(currentUrl);
            currentUrl = forwardStack.pop();
            System.out.println(" Forward to: " + currentUrl);
        }

        public String currentPage() {
            return currentUrl;
        }

        public static void main(String[] args) {
            Q10_BrowserHistory browser = new Q10_BrowserHistory("google.com");

            browser.visitPage("youtube.com");
            browser.visitPage("github.com");

            browser.back();    // youtube.com
            browser.back();    // google.com
            browser.forward(); // youtube.com

            browser.visitPage("stackoverflow.com"); // Clears forward stack
            browser.forward(); // Should show error/no history

            System.out.println("\n📍 Final Location: " + browser.currentPage());
        }
    }