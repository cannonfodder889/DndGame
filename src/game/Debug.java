package game;

public class Debug {
    public static boolean isDebugMode = false;

    public static void log(String msg){
        if(isDebugMode){
            System.out.println("[DEBUG] " + msg);
        }
    }
}
