package com.xyz.nio.channels;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Selector {
    public int epollFd;

    public Selector(int epollFd) {
        this.epollFd = epollFd;
    }

    public ServerSocketChannel serverSocketChannel;

    public Set<SelectionKey> selectedKeys = new HashSet<>();
    public Set<SelectionKey> keys = new HashSet<>();

    // 存放注册到本selector上的socket的fd和SelectionKey的对应关系
    public Map<Integer, SelectionKey> fdToKey = new HashMap<>();

    public native static Selector open();
    public native int select();

    public Set<SelectionKey> selectedKeys() {
        return selectedKeys;
    }

    public void setServerSocketChannel(ServerSocketChannel serverSocketChannel) {
        this.serverSocketChannel = serverSocketChannel;
    }

    public ServerSocketChannel getServerSocketChannel() {
        return serverSocketChannel;
    }
}
