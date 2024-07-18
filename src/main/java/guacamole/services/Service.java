package guacamole.services;

import guacamole.device.Device;
import guacamole.device.StandardDevice;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class Service {
    private List <Device> devices = new ArrayList<>();

    Device instDevice(String name){
        return new StandardDevice(name);
    }
    void addDevice(Device device) {
        devices.add(device);
    }}


