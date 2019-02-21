package misc;

public class JunkMain {
    public static void main(String args[]) throws CloneNotSupportedException{
        JunkPa son = new Junk1();
        System.out.println(son.hashCode());
        JunkPa sonClone = (JunkPa)son.clone();
        System.out.println(sonClone.hashCode());
    }
}
