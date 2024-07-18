package guacamole.device;

import java.net.InetAddress;
import java.net.UnknownHostException;

public abstract class Device {

    protected String name;
    protected InetAddress ip;
    protected String subNet;
    private boolean favorite;

    public Device(String name) {
        this.name = name;
    }
    void setName() {
        this.name = name;
    }
    void setIp(InetAddress ip) throws UnknownHostException {
        this.ip = ip;
    }
    void setSubNet(String subNet) {
        this.subNet = subNet;
    }
    String getName() {
        return this.name;
    }
    InetAddress getIp() {
        return this.ip;
    }
    String getSubNet() {
        return this.subNet;
    }
    void setFavoriteStatus(){
        if (!favorite) {
            favorite = true;
        }
    }
}
