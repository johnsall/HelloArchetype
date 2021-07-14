import com.amido.App;

import static org.junit.Assert.*;

public class AppTest {

    @org.junit.Test
    public void getHello() {
        App app = new App();
        String name = "Archetype";
        assert(app.getHello(name).equals("hello " + name));
    }
}