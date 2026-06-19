package com.bilibili.rpc.ignet;

import com.bilibili.lib.ighttp.IgnetLibLoader;
import com.bilibili.lib.ighttp.IgnetLog;
import java.util.HashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/rpc/ignet/RpcStreamObserver.class */
public class RpcStreamObserver {
    private long _nativePtr;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/rpc/ignet/RpcStreamObserver$Callback.class */
    public interface Callback {
        void onComplete();

        void onError(int i7, String str);

        void onHeaderReceived(HashMap<String, byte[]> map);

        void onNext(byte[] bArr, int i7);

        void onTrailingHeaderReceived(HashMap<String, byte[]> map);
    }

    static {
        IgnetLibLoader.getInstance().loadLibrariesOnce();
    }

    public RpcStreamObserver() {
        this._nativePtr = 0L;
        IgnetLog.debug("RpcStreamObserver()");
        this._nativePtr = native_init();
    }

    private native long native_init();

    private native boolean native_release();

    private native void native_set_callback(Callback callback);

    public boolean release() {
        if (this._nativePtr == 0) {
            return false;
        }
        return native_release();
    }

    public void setCallback(Callback callback) {
        native_set_callback(callback);
    }
}
