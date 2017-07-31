import java.io.Closeable;

/**
 * Created by robelyemane on 31/07/2017.
 */
class MyLaptop implements AutoCloseable, Closeable, MyCloseable
{

    public int open()
    {
        /* some code */
        return 0;
    }

    public void charge()
    {
        /* some code */
    }

    public int close()
    {
        /* some code */
        return 1;
    }

}
