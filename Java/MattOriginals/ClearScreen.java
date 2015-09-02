public class ClearScreen
{
    private static int linesSkipped = 100;

    public static void clear()
    {
        for(int ii = 0; ii < linesSkipped; ii++)
            System.out.println();
    }

    public static void clear(int customLinesSkipped)
    {
        for(int ii = 0; ii < customLinesSkipped; ii++)
            System.out.println();
    }
}
