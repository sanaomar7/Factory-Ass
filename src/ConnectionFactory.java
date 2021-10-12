public class ConnectionFactory implements IConnectionFactory{

    public static final int Ftp = 1 ;
    public static final int Ssh = 2 ;
    public static final int Scp = 3 ;
    public static final int Telnet= 4 ;
    @Override
    public IConnection GetConnection(int ProtocolCode) {

        switch (ProtocolCode){
            case Ftp :
                return new FTP() ;
            case  Ssh:
                return new SSH() ;
            case Scp:
                return new SCP() ;
            case Telnet:
                return new TELNET() ;
            default:
                return null ;
        }
    }


}
