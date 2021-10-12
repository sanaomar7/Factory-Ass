public interface IConnectionFactory {

    IConnection GetConnection(int ProtocolCode) ;
}
