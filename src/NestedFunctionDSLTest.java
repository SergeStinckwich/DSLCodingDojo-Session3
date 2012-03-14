import junit.framework.Assert;
import org.junit.Test;

public class NestedFunctionDSLTest {
    /* DSL final
       computer(
          processor(
	  cores(2),
	  speed(2500),
	  i386
	  ),
	  disk(
	     size(150)
	     ),
	  disk(
	     size(75),
	     speed(7200),
	     SATA
	     )
	  );
    */

@Test
public final void testTruth() {
	Assert.assertEquals(true, true);
	}
@Test
    public final void testComputerWithoutDevicesAndProcessor() {
    Assert.assertEquals(ComputerBuilder.script1().getProcessor(), null);
}
}