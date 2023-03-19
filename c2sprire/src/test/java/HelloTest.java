import org.example.Main;
import java.io.IOException;
import org.junit.jupiter.api.Test;

public class HelloTest {
    @Test
    public void testSayHello() throws Exception {
        Main.main(new String[]{"es_ln"});
        Main.main(new String[]{"en_ln"});
    }
}
