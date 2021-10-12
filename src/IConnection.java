import java.util.jar.Attributes;

public interface IConnection {
    String Name = null;

    String getInstance()  ;

    /// and any methode you need to add
    default void pre(){
        System.out.println();
    }

}
