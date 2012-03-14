public class ComputerBuilder

{

    public static Computer script1()
    {
	/* DSL */
	computer();
	/* DSL end*/
	return new Computer(null,null);
    }

    public static void computer()
    {
	
    }

    public static int cores(int nbr)
    {
	return nbr;
    }
}