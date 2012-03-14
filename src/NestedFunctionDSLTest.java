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
    @Test
	public final void testCores() {
	Assert.assertEquals(ComputerBuilder.cores(2),2);
    
    }

    @Test
	public final void testSpeed() {
	Assert.assertEquals(ComputerBuilder.speed(2),2);
    
    }
    @Test
	public final void testSize() {
	Assert.assertEquals(ComputerBuilder.size(2),2);
    }
    @Test
	public final void testDiskSize150() {
	Assert.assertEquals(ComputerBuilder.scriptDiskSize150().getSize(), 150);
	    
    }
}