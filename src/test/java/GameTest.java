import org.junit.*;
import static org.junit.Assert.*;

public class GameTest {

  @Test
  public void newGame_instantiateCorrectly(){
    Game testGame = new Game();
    assertEquals(true, testGame instanceof Game);
  }

  @Test
  public void getWord_returnsWord_String(){
    Game testGame = new Game();
    String expectedStringOutput =
    assertEquals("hi", testGame.getWord());
  }


}
