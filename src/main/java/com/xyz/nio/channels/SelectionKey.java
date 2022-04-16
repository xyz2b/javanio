package com.xyz.nio.channels;

public class SelectionKey {
    public static final int OP_ACCEPT = 1 << 4;
    public static final int OP_READ = 1 << 0;
    public static final int OP_WRITE = 1 << 2;

    public Channel channel;

    public int readyOps;

    public int interestOps;

    public Selector selector;

    public SelectionKey(Selector selector, Channel channel, int interestOps) {
        this.selector = selector;
        this.channel = channel;
        this.interestOps = interestOps;
    }

    public Selector selector() {
        return selector;
    }

    public Channel channel() {
        return channel;
    }

    public int readyOps() {
        return readyOps;
    }
}
