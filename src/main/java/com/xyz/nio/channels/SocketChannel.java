package com.xyz.nio.channels;

public class SocketChannel implements Channel {
    public int socketFd;
    public InetAddress address;
    public Selector selector;

    public SocketChannel(int socketFd, InetAddress address) {
        this.socketFd = socketFd;
        this.address = address;
    }

    public InetAddress getRemoteAddress() {
        return address;
    }

    public SelectionKey register(Selector selector, int ops) {
        this.selector = selector;
        return register0(selector, ops);
    }

    public native SocketChannel configureBlocking(boolean block);

    public int read(byte[] buff) {
        return read0(buff);
    }

    public native SelectionKey register0(Selector selector, int ops);

    public native int read0(byte[] buff);
}
