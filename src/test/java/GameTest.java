import org.junit.*;
import static org.junit.Assert.*;

public class GameTest {

  @Test
  public void newGame_instantiateCorrectly(){
    Game testGame = new Game();
    assertEquals(true, testGame instanceof Game);
  }

  @Test
  public void isEmpty_returnsIfStringNotPresent_false() {
    Game testGame = new Game();
    assertEquals(false, testGame.isEmpty());
  }
}
