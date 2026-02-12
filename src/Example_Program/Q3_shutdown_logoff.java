package Example_Program;

import java.io.IOException;

public class Q3_shutdown_logoff {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        try {
            run.exec("shutdown /r /t 0");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}