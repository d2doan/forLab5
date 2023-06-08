import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;

public class LocationerTests{

	@Test
	public void outOFBounds(){
		String res = Locationer.whereYouAre(5.0, 5.0);
		assertEquals("You seem to be lost, out of bounds...", res);
	}

	@Test
	public void somewhereBetween(){
		String res = Locationer.whereYouAre(0.5, 0.5);
		assertEquals("You're in A (pickle)!", res);
	}

	@Test
	public void atOrigin(){
		String res = Locationer.whereYouAre(0.0, 0.0);
		assertEquals("You're on a border!", res);
	}

	@Test 
	public void onABorder(){
		String res = Locationer.whereYouAre(0.0, 2.0);
		assertEquals("You're on a border!", res);
	}

}
