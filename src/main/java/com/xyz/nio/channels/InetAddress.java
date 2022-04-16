package com.xyz.nio.channels;

import java.io.Serializable;

public class InetAddress implements Serializable {
    public String ip;
    public int port;

    public InetAddress(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    public InetAddress(int port) {
        this.ip = "0.0.0.0";
        this.port = port;
    }

    @Override
    public String toString() {
        return "InetAddress{" +
                "ip='" + ip + '\'' +
                ", port=" + port +
                '}';
    }
}
