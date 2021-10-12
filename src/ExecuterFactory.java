import java.sql.Connection;
import java.util.Scanner;

public class ExecuterFactory {

    public static void main(String[] args) {

        String ProtocolCode;
        String Pnum;

        IConnectionFactory IconnectionFactory = new ConnectionFactory();

        IConnection Conn = new IConnection() {
            @Override
            public String getInstance() {
                return null;
            }
        } ;
        Conn = IconnectionFactory.GetConnection(ConnectionFactory.Ftp);
        Conn.getInstance();




        //IConnection connection = connectionFactory.GetConnection(ProtocolCode) ;


    }

}
