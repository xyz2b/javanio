package com.xyz.nio.channels;

public class ServerSocketChannel implements Channel {
    public int serverSocketFd;

    public SelectionKey register(Selector selector, int ops) {
        selector.setServerSocketChannel(this);
        return register0(selector, ops);
    }

    public native static ServerSocketChannel open();

    public native ServerSocketChannel bind(InetAddress local);

    public native ServerSocketChannel configureBlocking(boolean block);

    public native SocketChannel accept();

    public native SelectionKey register0(Selector selector, int ops);
}
