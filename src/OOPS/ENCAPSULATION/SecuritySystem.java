package OOPS.ENCAPSULATION;

public class SecuritySystem {

   static class UserSecurity {
        private String password;

        public UserSecurity(String initialPassword) {
            this.password = initialPassword;
        }

        public void changePassword(String oldPass, String newPass) {

            if (!this.password.equals(oldPass)) {
                System.out.println(" Error: old password is wrong!");
                return;
            }

            if (newPass == null || newPass.isEmpty()) {
                System.out.println(" Error: Naya password is not valid !");
                return;
            }

            if (oldPass.equals(newPass)) {
                System.out.println(" Error: Naya password can't be like old password!");
                return;
            }

            this.password = newPass;
            System.out.println(" Success: Password changed!");
        }

        public boolean isPasswordCorrect(String input) {
            return this.password.equals(input);
        }
    }

    //public class SecuritySystem {
        public static void main(String[] args) {

            UserSecurity user = new UserSecurity("Sid@123");

            System.out.println("--- Password System Test ---");

            System.out.print("Test 1 (Wrong Old Pass): ");
            user.changePassword("Wrong123", "NewPass789");

            System.out.print("Test 2 (Correct Details): ");
            user.changePassword("Sid@123", "Alpha@2026");

            System.out.println("\n--- Final Verification ---");
            if (user.isPasswordCorrect("Alpha@2026")) {
                System.out.println("Status: Login Successful!");
            } else {
                System.out.println("Status: Login Failed!");
            }
        }
    }
