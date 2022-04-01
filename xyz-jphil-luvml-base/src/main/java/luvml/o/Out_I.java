package luvml.o;

/**
 *
 * @author Ivan Velikanova
 */
public interface Out_I {
    Out_I __(String s);
    Out_I _c(char c);
    Out_I _i(int i);
    Out_I _d(double d);
    Out_I _z(boolean b);
    /**
     * inserts newline
     * @return this
     */
    Out_I nL();
    
    Out_I child();
    Out_I parent();
    Parameters parameters();
    
    Out_I _b(byte b);
    Out_I ba(byte[]b);
}
