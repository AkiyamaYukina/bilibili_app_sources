package com.bilibili.rtsp_jni;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/rtsp_jni/RtspClient.class */
public class RtspClient {
    static {
        System.loadLibrary("impeller_media");
        native_init();
    }

    public static native void native_init();

    public native void connect();

    public native void disconnect();

    public native int getCacheSize();

    public native long getDroppedAudioFrames();

    public native long getDroppedVideoFrames();

    public native String getHost();

    public native String getPath();

    public native int getPort();

    public native long getSentAudioFrames();

    public native long getSentVideoFrames();

    public native boolean isStreaming();

    public native void native_release();

    public native void native_setup();

    public native void reConnect(long j7);

    public native void resetDroppedAudioFrames();

    public native void resetDroppedVideoFrames();

    public native void resetSentAudioFrames();

    public native void resetSentVideoFrames();

    public native void resizeCache(int i7);

    public native void sendAudio(byte[] bArr, double d7);

    public native void sendVideo(byte[] bArr, double d7, boolean z6);

    public native void setIsStereo(boolean z6);

    public native void setLogs(boolean z6);

    public native void setOnlyAudio(boolean z6);

    public native void setReTries(int i7);

    public native void setSPSandPPS(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native void setSampleRate(int i7);

    public native void setUrl(String str);

    public native boolean shouldRetry(String str);

    public native void useTCP(boolean z6);
}
