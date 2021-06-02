import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_ {
    public static void main(String[] args) {
    
        List<String> cameras = new ArrayList<>();

        Collections.addAll(cameras, "Canon","GoPro","Nikon","Olympus","Fujifilm");
        System.out.println(cameras);        // [Canon, GoPro, Nikon, Olympus, Fujifilm]

        Collections.rotate(cameras,-1);     // [GoPro, Nikon, Olympus, Fujifilm, Canon]
        Collections.shuffle(cameras);       // [Olympus, Fujifilm, Nikon, GoPro, Canon]
        Collections.reverse(cameras);       // [Fujifilm, Olympus, Nikon, GoPro, Canon]
        Collections.sort(cameras);          // [Canon, Fujifilm, GoPro, Nikon, Olympus]

        System.out.println(Collections.max(cameras));               // Olympus
        System.out.println(Collections.min(cameras));               // Canon
        System.out.println(Collections.frequency(cameras,"Canon")); // 1
    }
}
