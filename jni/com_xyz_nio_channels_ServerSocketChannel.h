/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_xyz_nio_channels_ServerSocketChannel */

#ifndef _Included_com_xyz_nio_channels_ServerSocketChannel
#define _Included_com_xyz_nio_channels_ServerSocketChannel
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_xyz_nio_channels_ServerSocketChannel
 * Method:    open
 * Signature: ()Lcom/xyz/nio/channels/ServerSocketChannel;
 */
JNIEXPORT jobject JNICALL Java_com_xyz_nio_channels_ServerSocketChannel_open
  (JNIEnv *, jclass);

/*
 * Class:     com_xyz_nio_channels_ServerSocketChannel
 * Method:    bind
 * Signature: (Lcom/xyz/nio/channels/InetAddress;)Lcom/xyz/nio/channels/ServerSocketChannel;
 */
JNIEXPORT jobject JNICALL Java_com_xyz_nio_channels_ServerSocketChannel_bind
  (JNIEnv *, jobject, jobject);

/*
 * Class:     com_xyz_nio_channels_ServerSocketChannel
 * Method:    configureBlocking
 * Signature: (Z)Lcom/xyz/nio/channels/ServerSocketChannel;
 */
JNIEXPORT jobject JNICALL Java_com_xyz_nio_channels_ServerSocketChannel_configureBlocking
  (JNIEnv *, jobject, jboolean);

/*
 * Class:     com_xyz_nio_channels_ServerSocketChannel
 * Method:    accept
 * Signature: ()Lcom/xyz/nio/channels/SocketChannel;
 */
JNIEXPORT jobject JNICALL Java_com_xyz_nio_channels_ServerSocketChannel_accept
  (JNIEnv *, jobject);

/*
 * Class:     com_xyz_nio_channels_ServerSocketChannel
 * Method:    register0
 * Signature: (Lcom/xyz/nio/channels/Selector;I)Lcom/xyz/nio/channels/SelectionKey;
 */
JNIEXPORT jobject JNICALL Java_com_xyz_nio_channels_ServerSocketChannel_register0
  (JNIEnv *, jobject, jobject, jint);

#ifdef __cplusplus
}
#endif
#endif