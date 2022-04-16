package com.xyz.nio;

import com.xyz.nio.channels.ServerSocketChannel;
import com.xyz.nio.channels.SocketChannel;
import com.xyz.nio.channels.Selector;
import com.xyz.nio.channels.SelectionKey;
import com.xyz.nio.channels.InetAddress;


import java.util.Iterator;

public class Nio {
    private static int PORT = 8999;

    public static void main(String[] args) {
        System.loadLibrary("jni");
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.bind(new InetAddress(PORT));

        Selector selector = Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        System.out.println("server started");

        for(;;) {
            System.out.println("wait event");
            int events = selector.select();

            if (events == 0) {
                continue;
            }

            Iterator<SelectionKey> keys = selector.selectedKeys().iterator();

            while (keys.hasNext()) {
                SelectionKey key = keys.next();
                keys.remove();

                if (key.readyOps() == SelectionKey.OP_ACCEPT) {
                    ServerSocketChannel server = (ServerSocketChannel) key.channel();
                    SocketChannel client = server.accept();
                    System.out.println(client.address.ip + ":" + client.address.port);
                    System.out.println(client.socketFd);
                    client.configureBlocking(false);
                    client.register(key.selector(), SelectionKey.OP_READ);
                } else if (key.readyOps() == SelectionKey.OP_READ) {
                    SocketChannel client = (SocketChannel) key.channel();
                    System.out.println(client.address.ip + ":" + client.address.port);
                    System.out.println(client.socketFd);
                    byte buff[] = new byte[1024];
                    long byteReads = client.read(buff);
                    if (byteReads == 0) {
                        System.out.println(client.address.ip + ":" + client.address.port + " client quit");
                        continue;
                    }
                    System.out.println(new String(buff));

                } else if (key.readyOps() == SelectionKey.OP_WRITE) {

                }
            }
        }
    }
}
