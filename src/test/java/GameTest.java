import org.junit.*;
import static org.junit.Assert.*;

public class GameTest {

  @Test
  public void newGame_instantiateCorrectly(){
    Game testGame = new Game();
    assertEquals(true, testGame instanceof Game);
  }

}
