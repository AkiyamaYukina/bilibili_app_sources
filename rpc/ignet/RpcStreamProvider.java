package com.bilibili.rpc.ignet;

import com.bilibili.lib.ighttp.IgnetLibLoader;
import com.bilibili.lib.ighttp.IgnetLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/rpc/ignet/RpcStreamProvider.class */
public class RpcStreamProvider {
    private long _nativePtr;

    static {
        IgnetLibLoader.getInstance().loadLibrariesOnce();
    }

    public RpcStreamProvider() {
        this._nativePtr = 0L;
        IgnetLog.debug("RpcStreamProvider()");
        this._nativePtr = native_init();
    }

    private native boolean native_async_send(byte[] bArr, int i7);

    private native long native_init();

    private native boolean native_release();

    public boolean asyncSend(byte[] bArr, int i7) {
        synchronized (this) {
            if (this._nativePtr == 0) {
                IgnetLog.warning("RpcStreamProvider asyncSend failed, because native released");
                return false;
            }
            return native_async_send(bArr, i7);
        }
    }

    public boolean release() {
        synchronized (this) {
            if (this._nativePtr == 0) {
                return false;
            }
            boolean zNative_release = native_release();
            this._nativePtr = 0L;
            return zNative_release;
        }
    }
}
