import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {
    @Test
    void multiplesInstanceias(){
        Reproductor r1 = Reproductor.getInstancia();
        Reproductor r2 = Reproductor.getInstancia();
        assertSame(r1,r2);
    }

}