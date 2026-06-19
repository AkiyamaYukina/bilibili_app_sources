package com.bilibili.rtsp_jni;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/rtsp_jni/ImpRtspDevicePusher.class */
public class ImpRtspDevicePusher {
    static {
        Pattern.compile("^rtsps?://([^/:]+)(?::(\\d+))*/([^/]+)/?([^*]*)$");
        System.loadLibrary("impeller_media");
    }

    public ImpRtspDevicePusher() {
        _nativeInit();
    }

    private native void _nativeAddAudioTrack(int i7, int i8, int i9);

    private native void _nativeAddVideoTrack(boolean z6, int i7, int i8, int i9);

    private native void _nativeInit();

    private native void _nativeRelease();

    private native void _nativeSetPushInfo(String str, String str2, String str3, String str4, String str5);

    private native void _nativeStart();

    private native void _nativeStop();

    private native void _nativeWriteAudio(byte[] bArr, long j7, byte[] bArr2);

    private native void _nativeWriteVideo(byte[] bArr, long j7, long j8);
}
