package OOPS.ACCESS_MODIFIERS;

public class Ex1 {

    public String publicVar = "I am Public";

    private String privateVar = "I am Private";

    protected String protectedVar = "I am Protected";

    String defaultVar = "I am Default";

    public void showVariables() {

        System.out.println(publicVar);
        System.out.println(privateVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
    }

    public static void main(String[] args) {
        Ex1 obj = new Ex1();
        obj.showVariables();
    }
}