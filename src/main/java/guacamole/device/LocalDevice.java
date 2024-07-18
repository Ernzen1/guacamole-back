package guacamole.device;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalDevice extends Device{

    public LocalDevice(String name) {
        super(name);
    }

    @Override
     void setIp(InetAddress ip) throws UnknownHostException {
        this.ip = InetAddress.getLocalHost();
    }
}
