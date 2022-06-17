import java.util.Scanner;
public class test {

    public static void main(String[] args) {
        
        speed("honda", 400, 120);



}
    public static void speed(String v_type, float distance_M, float time_S) {
        float v_speed = distance_M / time_S;
        System.out.println("Vehicle Type: " + v_type + "\n" + "Vehicle Speed: " + v_speed);
//Speed of truck that travelled 400m in 2m
        if( (distance_M == 400) && (time_S <= 120) ) //in 2 minutes means that they would have made that distnace between 0 to 2 minutes, thus i added less than
            System.out.println("The vehicle that traveled 400m in 2 minutes: " + v_type + " at a speed of " + v_speed + "m.");
    }
    }
