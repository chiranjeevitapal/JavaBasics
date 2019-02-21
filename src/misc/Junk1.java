package misc;

public class Junk1 extends JunkPa {
    //public abstract void myJunk();
    public static void myFunk(){
        System.out.println("I am a child funk");
    }

}

class JunkPa implements Cloneable{
    public JunkPa(){
        System.out.println("I got triggered");
    }
    public void myJunk(){
        System.out.println("I am a parent Junk");
    }

    public static void myFunk(){
        System.out.println("I am a parent funk");
    }

    public JunkPa clone() throws CloneNotSupportedException {
        return (JunkPa)super.clone();
    }
}
