package com.bilibili.rpc.ignet;

import com.bilibili.lib.ighttp.IgnetLibLoader;
import com.bilibili.lib.ighttp.IgnetLog;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/rpc/ignet/RpcEngine.class */
public class RpcEngine {
    private static final String IGNET_GRPC_ANNOTATION_ID = "ignet_grpc_annotation_id";
    private static RpcEngine mEngine;
    private long _nativePtr;
    private ProxyFinishCallback mProxyFinishCallback = null;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/rpc/ignet/RpcEngine$FinishCallback.class */
    public interface FinishCallback {
        void onRpcFinished(FinishInfo finishInfo);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/rpc/ignet/RpcEngine$FinishInfo.class */
    public static class FinishInfo {
        public String mAddr;
        public String mAddrs;
        public Collection<Object> mAnnotation;
        public long mAnnotationId;
        public long mCallEndMs;
        public long mCallStartMs;
        public long mConnectEndMs;
        public long mConnectStartMs;
        public boolean mConnectionReuse;
        public long mDnsEndMs;
        public String mDnsProvider;
        public long mDnsStartMs;
        public int mDowngrade;
        public String mErrorMsg;
        public String mErrorRecords;
        public int mGrpcStatus;
        public String mHostInfo;
        public int mHttpCode;
        public HashMap<String, byte[]> mHttpHeaders;
        public String mMethod;
        public String mProxyedAddr;
        public long mRecvSize;
        public String mRequestTraceId;

        @Nonnull
        public String toString() {
            return "mHostInfo:" + this.mHostInfo + " mMethod:" + this.mMethod + " mRequestTraceId:" + this.mRequestTraceId + " mHttpCode:" + this.mHttpCode + " mGrpcStatus:" + this.mGrpcStatus + " mRecvSize:" + this.mRecvSize + " mCallStartMs:" + this.mCallStartMs + " mDnsStartMs:" + this.mDnsStartMs + " mDnsEndMs:" + this.mDnsEndMs + " mConnectStartMs:" + this.mConnectStartMs + " mConnectEndMs:" + this.mConnectEndMs + " mCallEndMs:" + this.mCallEndMs + " mAddr:" + this.mAddr + " mProxyedAddr:" + this.mProxyedAddr + " mAddrs:" + this.mAddrs + " mConnectionReuse:" + this.mConnectionReuse + " mHttpHeaders:" + this.mHttpHeaders + " mErrorMsg:" + this.mErrorMsg + " mDowngrade:" + this.mDowngrade + " mDnsProvider:" + this.mDnsProvider + " mAnnotationId:" + this.mAnnotationId + " mErrorRecords:" + this.mErrorRecords;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/rpc/ignet/RpcEngine$ProxyFinishCallback.class */
    public class ProxyFinishCallback implements FinishCallback {
        private FinishCallback mCallback;
        final RpcEngine this$0;
        HashMap<Long, Collection<Object>> mAnnotations = new HashMap<>();
        long mAnnotationId = 0;

        public ProxyFinishCallback(RpcEngine rpcEngine, FinishCallback finishCallback) {
            this.this$0 = rpcEngine;
            this.mCallback = finishCallback;
        }

        public long addAnnotation(Collection<Object> collection) {
            long j7;
            synchronized (this) {
                j7 = this.mAnnotationId + 1;
                this.mAnnotationId = j7;
                this.mAnnotations.put(Long.valueOf(j7), collection);
            }
            return j7;
        }

        @Override // com.bilibili.rpc.ignet.RpcEngine.FinishCallback
        public void onRpcFinished(FinishInfo finishInfo) {
            synchronized (this) {
                finishInfo.mAnnotation = this.mAnnotations.get(Long.valueOf(finishInfo.mAnnotationId));
                this.mAnnotations.remove(Long.valueOf(finishInfo.mAnnotationId));
            }
            FinishCallback finishCallback = this.mCallback;
            if (finishCallback != null) {
                finishCallback.onRpcFinished(finishInfo);
            }
        }
    }

    static {
        IgnetLibLoader.getInstance().loadLibrariesOnce();
        mEngine = null;
    }

    private RpcEngine(HashMap<String, String> map) {
        this._nativePtr = 0L;
        IgnetLog.info("RpcEngine()");
        this._nativePtr = native_init(map);
    }

    public static RpcEngine getInstance() {
        RpcEngine rpcEngine;
        synchronized (RpcEngine.class) {
            try {
                if (mEngine == null) {
                    mEngine = new RpcEngine(new HashMap());
                }
                rpcEngine = mEngine;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rpcEngine;
    }

    public static RpcEngine getInstance(HashMap<String, String> map) {
        RpcEngine rpcEngine;
        synchronized (RpcEngine.class) {
            try {
                if (mEngine == null) {
                    HashMap<String, String> map2 = map;
                    if (map == null) {
                        map2 = new HashMap<>();
                    }
                    mEngine = new RpcEngine(map2);
                }
                rpcEngine = mEngine;
            } finally {
            }
        }
        return rpcEngine;
    }

    private native boolean native_async_bidi_streaming_call(long j7, String str, Map<String, String> map, RpcStreamProvider rpcStreamProvider, RpcStreamObserver rpcStreamObserver);

    private native boolean native_async_unary_call(long j7, String str, Map<String, String> map, byte[] bArr, int i7, RpcStreamObserver rpcStreamObserver, Map<String, String> map2);

    private native long native_create_rpc(String str, int i7, String str2, String str3);

    private native long native_init(Map<String, String> map);

    private native boolean native_release_rpc(long j7);

    private native void native_set_finish_callback(FinishCallback finishCallback);

    public boolean asyncBidiStreamCall(long j7, String str, Map<String, String> map, RpcStreamProvider rpcStreamProvider, RpcStreamObserver rpcStreamObserver, Collection<Object> collection) {
        Map<String, String> map2;
        synchronized (this) {
            ProxyFinishCallback proxyFinishCallback = this.mProxyFinishCallback;
            map2 = map;
            if (proxyFinishCallback != null) {
                map2 = map;
                if (collection != null) {
                    long jAddAnnotation = proxyFinishCallback.addAnnotation(collection);
                    Map<String, String> map3 = map;
                    if (map == null) {
                        map3 = new HashMap<>();
                    }
                    map3.put(IGNET_GRPC_ANNOTATION_ID, String.valueOf(jAddAnnotation));
                    map2 = map3;
                }
            }
        }
        return native_async_bidi_streaming_call(j7, str, map2, rpcStreamProvider, rpcStreamObserver);
    }

    public boolean asyncUnaryCall(long j7, String str, Map<String, String> map, byte[] bArr, int i7, RpcStreamObserver rpcStreamObserver, Map<String, String> map2, Collection<Object> collection) {
        synchronized (this) {
            ProxyFinishCallback proxyFinishCallback = this.mProxyFinishCallback;
            if (proxyFinishCallback != null && collection != null) {
                long jAddAnnotation = proxyFinishCallback.addAnnotation(collection);
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put(IGNET_GRPC_ANNOTATION_ID, String.valueOf(jAddAnnotation));
            }
        }
        return native_async_unary_call(j7, str, map, bArr, i7, rpcStreamObserver, map2);
    }

    public long createRpc(String str, int i7, String str2) {
        return native_create_rpc(str, i7, str2, "");
    }

    public long createRpc(String str, int i7, String str2, String str3) {
        return native_create_rpc(str, i7, str2, str3);
    }

    public FinishCallback getFinishCallback() {
        ProxyFinishCallback proxyFinishCallback;
        synchronized (this) {
            proxyFinishCallback = this.mProxyFinishCallback;
        }
        return proxyFinishCallback;
    }

    public boolean releaseRpc(long j7) {
        return native_release_rpc(j7);
    }

    public void setFinishCallback(FinishCallback finishCallback) {
        synchronized (this) {
            ProxyFinishCallback proxyFinishCallback = new ProxyFinishCallback(this, finishCallback);
            this.mProxyFinishCallback = proxyFinishCallback;
            native_set_finish_callback(proxyFinishCallback);
        }
    }
}
