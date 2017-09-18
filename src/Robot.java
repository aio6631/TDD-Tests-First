import org.junit.Before;
import org.junit.Test;

public class Robot {

    int posX = 0;
    int posY = 0;
    int pace = 0;
    String name = "Harry";

    public static setPace(int speed){
        //0 = no movement
        //1 = walking
        //2 = skipping
        //3 = jumping
        //4 = running
        this.pace = speed;
    }

    public static setName(String name){
        this.name = name;
    }

    public static goTo (int x, int y){
        this.posX = x;
        this.posY = y;
    }

    @Before
    public void setUp(){
        Robot t = new Robot();
        t.setName("Peter");
    }
    @Test
    public void testPosition(){
        if (t.posX < 0 || t.posY < 0 ){

        }
    }
}


