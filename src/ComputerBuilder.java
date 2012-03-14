public class ComputerBuilder

{

    public static Computer script1()
    {
	/* DSL */
	computer();
	/* DSL end*/
	return new Computer(null,null);
    }

    public static Disk scriptDiskSize150()
    {
	return disk(size(150));
    }

    public static Disk scriptDiskFullDescription()
    {
	return disk(
		    size(75),
		    speed(7200),
		    Disk.Interface.SATA
		    );
    }
    public static Disk disk(int size)
    {
	return new Disk(size, 0, null);
    }
    public static Disk disk(int size, int speed, Disk.Interface iface)
    {
	return new Disk(size, speed, iface);
    }
    public static Disk scriptDiskSize250()
    {
	return disk(size(250));
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