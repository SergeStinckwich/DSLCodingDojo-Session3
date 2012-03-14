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
    public static int speed(int nbr)
    {
	return nbr;
    }
    public static int size(int nbr)
    {
	return nbr;
    }

}