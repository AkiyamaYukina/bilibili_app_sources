package com.bilibili.lib.v8;

import C60.p;
import Xi1.o;
import android.app.Application;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.bplus.im.conversation.n0;
import com.bilibili.lib.miniprogram.extension.js.camera.CameraAble;
import com.bilibili.lib.miniprogram.extension.js.camera.CameraBinder;
import com.bilibili.lib.miniprogram.extension.js.cameracontext.CameraContext;
import com.bilibili.lib.miniprogram.extension.js.cameracontext.CameraContextBinder;
import com.bilibili.lib.miniprogram.extension.js.imagesolution.ImageSolutionAble;
import com.bilibili.lib.miniprogram.extension.js.imagesolution.ImageSolutionBinder;
import com.bilibili.lib.miniprogram.extension.js.videodecoder.VideoDecoderAble;
import com.bilibili.lib.miniprogram.extension.js.videodecoder.VideoDecoderBinder;
import com.bilibili.lib.v8.JNIV8Function;
import com.bilibili.lib.v8.V8Engine;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import jf0.C7671a;
import jf0.C7672b;
import jf0.C7673c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/V8Engine.class */
public class V8Engine extends JNIObject implements Handler.Callback, CameraContextBinder, CameraBinder, ImageSolutionBinder, VideoDecoderBinder, InspectorBackend {
    private static final int DELAY_CLEANUP = 10000;
    private static final int MSG_CLEANUP = 1;
    private static final int MSG_LOAD = 3;
    private static final int MSG_QUIT = 2;
    private static final int MSG_READY = 5;
    private static final String TAG = "V8-Engine";
    private static List<OOMHandler> handlers = new CopyOnWriteArrayList();
    public static boolean mDebug = false;
    public CameraBinder cameraBinder;
    public CameraContextBinder cameraContextBinder;
    private V8Inspector debuggerV8Inspector;
    public ImageSolutionBinder imageSolutionBinder;
    private Application mContext;
    private JSThreadExecutor mDefaultJSThreadExecutor;
    private Map<String, Object> mExtObjs;
    private V8EngineHandlerThread mJSThread;
    private JSThreadExecutor mJSThreadExecutor;
    private Handler mJSThreadHandler;
    private boolean mPaused;
    private boolean mReady;
    private String mStoragePath;
    private V8Timeout mTimeoutRunningTo;
    private RealDebuggerCallBack realDebuggerCallBack;
    private V8Inspector v8Inspector;
    public VideoDecoderBinder videoDecoderBinder;
    private CopyOnWriteArrayList<V8EngineStatusListener> mStatusListeners = null;
    private final ArrayList<Runnable> mNextTickQueue = new ArrayList<>();
    private boolean mJobQueueActive = false;
    private final SparseArray<V8Timeout> mTimeouts = new SparseArray<>(50);
    private final SparseArray<V8Timeout> mTimeoutsToAddAfterPause = new SparseArray<>();
    private final HashSet<V8Timeout> mTimeoutsToGC = new HashSet<>();
    private int mLastTimeoutId = 1;
    private AtomicBoolean shutdown = new AtomicBoolean(false);
    private final Runnable mQueueWaitRunnable = new ZI.i(this, 1);
    private RequestHandler requestHandler = null;
    private MessageHandler messageHandler = null;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/V8Engine$CallBack.class */
    public interface CallBack {
        void onCallBack(@NonNull String str, JsCallBack jsCallBack);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/V8Engine$ExecuteType.class */
    public enum ExecuteType {
        TIME_OUT,
        RUN_SCRIPT,
        NEX_TIP,
        REQUEST_ANIMATION,
        STATUS_CHANGE_NOTIFY
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/V8Engine$JSThreadExecutor.class */
    public interface JSThreadExecutor {
        void executeOnJSThread(Runnable runnable, ExecuteType executeType);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/V8Engine$JsCallBack.class */
    public interface JsCallBack {
        void onJsCallBack(String str);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/V8Engine$MessageHandler.class */
    public interface MessageHandler {
        byte[] onNativeMessage(long j7, String str, byte[] bArr, int i7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/V8Engine$OOMHandler.class */
    public interface OOMHandler {
        void onOOM(String str, boolean z6);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/V8Engine$RealDebuggerCallBack.class */
    public interface RealDebuggerCallBack {
        void closeRealDebuggerCallBack();

        void updatePackageInfo(String str);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/V8Engine$RequestHandler.class */
    public interface RequestHandler {
        boolean onRequest(long j7, String str, byte[] bArr, int i7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/V8Engine$V8EngineHandlerThread.class */
    public static class V8EngineHandlerThread extends HandlerThread {
        private ErrorListener listener;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/V8Engine$V8EngineHandlerThread$ErrorListener.class */
        public interface ErrorListener {
            void onRuntimeException(Throwable th);

            void onV8Exception(V8Exception v8Exception);
        }

        public V8EngineHandlerThread(String str, ErrorListener errorListener) {
            super(str);
            this.listener = errorListener;
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                super.run();
            } catch (V8Exception e7) {
                if (this.listener != null) {
                    this.listener.onV8Exception(e7);
                }
            } catch (Throwable th) {
                Log.e(V8Engine.TAG, th.getMessage(), th);
                if (this.listener != null) {
                    this.listener.onRuntimeException(th);
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/V8Engine$V8EngineStatusListener.class */
    public interface V8EngineStatusListener {
        void onReady();

        void onShutdown();

        void onUncaughtV8Exception(V8Exception v8Exception);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/V8Engine$V8Timeout.class */
    public class V8Timeout implements Runnable {
        protected volatile boolean canceled;
        private volatile boolean dead;
        private final int id;
        public final long jsCbPtr;
        final boolean recurring;
        final V8Engine this$0;
        public final long thisObjPtr;
        final long timeout;

        public V8Timeout(V8Engine v8Engine, long j7, long j8, long j9, boolean z6, int i7) {
            this.this$0 = v8Engine;
            this.jsCbPtr = j7;
            this.thisObjPtr = j8;
            this.timeout = j9;
            this.recurring = z6;
            this.id = i7;
        }

        public void clear() {
            synchronized (this.this$0.mTimeouts) {
                this.this$0.mTimeouts.remove(this.id);
                boolean z6 = V8Engine.mDebug;
                this.this$0.mTimeoutsToGC.add(this);
            }
        }

        public boolean clearIfDead() {
            synchronized (this.this$0.mTimeouts) {
                if (!this.dead) {
                    return false;
                }
                if (!this.canceled) {
                    this.this$0.mTimeoutsToGC.add(this);
                    if (!this.this$0.mJSThreadHandler.hasMessages(1)) {
                        this.this$0.mJSThreadHandler.sendMessageDelayed(this.this$0.mJSThreadHandler.obtainMessage(1), 10000L);
                    }
                    this.canceled = true;
                }
                return true;
            }
        }

        public boolean isRecurring() {
            return this.recurring;
        }

        public void recurring() {
            this.this$0.mJSThreadHandler.postDelayed(this, this.timeout);
            boolean z6 = V8Engine.mDebug;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.this$0.setCurrentTimeout(this);
            if (clearIfDead()) {
                return;
            }
            boolean z6 = V8Engine.mDebug;
            this.this$0.timeoutCallback(this, false, true);
            if (clearIfDead() || isRecurring()) {
                return;
            }
            clear();
        }

        public void setAsDead() {
            this.dead = true;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/V8Engine$ValueCallback.class */
    public interface ValueCallback {
        void onReceiveValue(Object obj);
    }

    public V8Engine(Application application, boolean z6, String str, boolean z7, Locale locale, String str2, int i7) throws Exception {
        if (application == null) {
            throw new RuntimeException("Application is null");
        }
        this.mContext = application;
        Resources resources = application.getResources();
        if (resources == null) {
            throw new RuntimeException("No resources available");
        }
        float f7 = resources.getDisplayMetrics().density;
        if (!TextUtils.isEmpty(str) && new File(str).isDirectory()) {
            this.mStoragePath = str;
        } else if (TextUtils.isEmpty(str)) {
            File externalCacheDir = application.getExternalCacheDir();
            this.mStoragePath = (externalCacheDir == null ? application.getCacheDir() : externalCacheDir).toString();
        }
        Locale locale2 = locale == null ? Locale.getDefault() : locale;
        StringBuilder sb = new StringBuilder(locale2.getLanguage());
        if (!TextUtils.isEmpty(locale2.getCountry())) {
            sb.append("_");
            sb.append(locale2.getCountry());
        }
        try {
            initV8Engine(application, z6, sb.toString(), locale2.getLanguage(), TimeZone.getDefault().getID(), f7, z7, i7 <= 0 ? (int) ((Runtime.getRuntime().maxMemory() / 1024) / 1024) : i7, str2, mDebug);
            V8EngineHandlerThread v8EngineHandlerThread = new V8EngineHandlerThread("BLV8JavaScriptContext", new V8EngineHandlerThread.ErrorListener(this) { // from class: com.bilibili.lib.v8.V8Engine.1
                final V8Engine this$0;

                {
                    this.this$0 = this;
                }

                @Override // com.bilibili.lib.v8.V8Engine.V8EngineHandlerThread.ErrorListener
                public void onRuntimeException(Throwable th) {
                    this.this$0.shutdown();
                }

                @Override // com.bilibili.lib.v8.V8Engine.V8EngineHandlerThread.ErrorListener
                public void onV8Exception(V8Exception v8Exception) {
                    this.this$0.notifyV8Error(v8Exception);
                    this.this$0.shutdown();
                }
            });
            this.mJSThread = v8EngineHandlerThread;
            v8EngineHandlerThread.start();
            Handler handler = new Handler(this.mJSThread.getLooper(), this);
            this.mJSThreadHandler = handler;
            handler.sendMessageAtFrontOfQueue(handler.obtainMessage(5));
            Handler handler2 = this.mJSThreadHandler;
            handler2.sendMessageDelayed(handler2.obtainMessage(1), 10000L);
            this.mDefaultJSThreadExecutor = new p(this);
        } catch (Exception e7) {
            e7.printStackTrace();
            throw e7;
        }
    }

    public static byte[] ASYNC_MESSAGE(long j7) {
        com.google.flatbuffers.smallapp.a aVar = new com.google.flatbuffers.smallapp.a(1);
        aVar.p(6);
        aVar.c(0, j7);
        aVar.b(2, 2);
        aVar.k(aVar.i());
        return aVar.o();
    }

    public static byte[] ERROR_MESSAGE(long j7, String str) {
        com.google.flatbuffers.smallapp.a aVar = new com.google.flatbuffers.smallapp.a(1);
        int iG = aVar.g(str);
        aVar.p(6);
        aVar.c(0, j7);
        aVar.b(2, 0);
        aVar.e(3, iG);
        aVar.k(aVar.i());
        return aVar.o();
    }

    public static byte[] SYNC_FEATURE_MESSAGE(long j7, boolean z6, boolean z7) {
        com.google.flatbuffers.smallapp.a aVar = new com.google.flatbuffers.smallapp.a(1);
        int iG = aVar.g("value");
        byte b7 = z6 ? (byte) 1 : (byte) 0;
        aVar.q(1, 1, 1);
        ByteBuffer byteBuffer = aVar.a;
        int i7 = aVar.b - 1;
        aVar.b = i7;
        byteBuffer.position(i7);
        aVar.a.put(new byte[]{b7});
        int iJ = aVar.j();
        int iG2 = aVar.g("isDebug");
        byte b8 = z7 ? (byte) 1 : (byte) 0;
        aVar.q(1, 1, 1);
        ByteBuffer byteBuffer2 = aVar.a;
        int i8 = aVar.b - 1;
        aVar.b = i8;
        byteBuffer2.position(i8);
        aVar.a.put(new byte[]{b8});
        int iJ2 = aVar.j();
        aVar.p(3);
        aVar.b(2, 1);
        aVar.e(1, iJ);
        aVar.e(0, iG);
        int i9 = aVar.i();
        aVar.n(i9);
        aVar.p(3);
        aVar.b(2, 1);
        aVar.e(1, iJ2);
        aVar.e(0, iG2);
        int i10 = aVar.i();
        aVar.n(i10);
        int iH = aVar.h(new int[]{i9, i10});
        aVar.p(6);
        aVar.c(0, j7);
        aVar.b(2, 1);
        aVar.e(5, iH);
        aVar.k(aVar.i());
        return aVar.o();
    }

    public static byte[] SYNC_MESSAGE(long j7) {
        com.google.flatbuffers.smallapp.a aVar = new com.google.flatbuffers.smallapp.a(1);
        aVar.p(6);
        aVar.c(0, j7);
        aVar.b(2, 1);
        aVar.k(aVar.i());
        return aVar.o();
    }

    public static byte[] SYNC_PERMISSION_MESSAGE(long j7, boolean z6) {
        com.google.flatbuffers.smallapp.a aVar = new com.google.flatbuffers.smallapp.a(1);
        int iG = aVar.g(z6 ? "1" : "0");
        aVar.p(6);
        aVar.c(0, j7);
        aVar.b(2, 1);
        aVar.e(3, iG);
        aVar.k(aVar.i());
        return aVar.o();
    }

    private native String dumpHeap(String str);

    private boolean enqueueAndStartProcessing(@Nullable Runnable runnable) {
        boolean z6;
        synchronized (this.mNextTickQueue) {
            z6 = (this.mPaused || this.mJobQueueActive || (runnable == null && this.mNextTickQueue.isEmpty())) ? false : true;
            if (runnable != null) {
                this.mNextTickQueue.add(runnable);
            }
        }
        if (z6) {
            this.mJSThreadHandler.postAtFrontOfQueue(this.mQueueWaitRunnable);
        }
        return z6;
    }

    private native JNIV8Function getConstructor(String str);

    private void initPreConfig() {
        com.google.flatbuffers.smallapp.a aVar = new com.google.flatbuffers.smallapp.a();
        int iH = aVar.h(new int[]{C7673c.g(aVar, aVar.g("storagePath"), aVar.g(this.mStoragePath))});
        aVar.p(6);
        aVar.e(4, iH);
        aVar.k(aVar.i());
        initPreConfig(aVar.o());
    }

    private void initV8Engine(Application application, boolean z6, String str, String str2, String str3, float f7, boolean z7, int i7, String str4, boolean z8) throws Exception {
        initializeNativeV8Engine(application.getAssets(), str, str2, str3, f7, z7, str4, i7, z6, z8);
        JNIV8GenericObject jNIV8GenericObjectCreate = JNIV8GenericObject.Create(this);
        jNIV8GenericObjectCreate.setV8Field("isOnline", JNIV8Function.Create(this, new JNIV8Function.Handler(this) { // from class: com.bilibili.lib.v8.V8Engine.3
            final V8Engine this$0;

            {
                this.this$0 = this;
            }

            @Override // com.bilibili.lib.v8.JNIV8Function.Handler
            public Object Callback(Object obj, Object[] objArr) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.this$0.mContext.getSystemService("connectivity");
                if (connectivityManager == null) {
                    return Boolean.FALSE;
                }
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                return Boolean.valueOf(activeNetworkInfo != null && activeNetworkInfo.isAvailable());
            }
        }));
        jNIV8GenericObjectCreate.setV8Field("performanceNow", JNIV8Function.Create(this, new JNIV8Function.Handler(this) { // from class: com.bilibili.lib.v8.V8Engine.4
            final V8Engine this$0;

            {
                this.this$0 = this;
            }

            @Override // com.bilibili.lib.v8.JNIV8Function.Handler
            public Object Callback(Object obj, Object[] objArr) {
                return Long.valueOf(SystemClock.uptimeMillis());
            }
        }));
        getGlobalObject().setV8Field("bl_ext", jNIV8GenericObjectCreate);
    }

    private native void initialize(AssetManager assetManager, String str, String str2, String str3, float f7, String str4, boolean z6, boolean z7, String str5, int i7);

    private void initializeNativeV8Engine(AssetManager assetManager, String str, String str2, String str3, float f7, boolean z6, String str4, int i7, boolean z7, boolean z8) {
        initPreConfig();
        String str5 = z6 ? "tablet" : "phone";
        if (TextUtils.isEmpty(str4)) {
            str4 = "";
        }
        initialize(assetManager, str, str2, str3, f7, str5, z8, z7, str4, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enqueueOnNextTick$9(JNIV8Function jNIV8Function) {
        try {
            jNIV8Function.callAsV8Function(new Object[0]);
        } catch (V8Exception e7) {
            notifyV8Error(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        ArrayList arrayList;
        while (true) {
            synchronized (this.mNextTickQueue) {
                this.mJobQueueActive = true;
                if (this.mNextTickQueue.isEmpty() || this.mPaused) {
                    break;
                }
            }
            synchronized (this.mNextTickQueue) {
                arrayList = new ArrayList(this.mNextTickQueue);
                this.mNextTickQueue.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                runOnJSThreadInternal((Runnable) it.next(), ExecuteType.NEX_TIP, null);
            }
        }
        this.mJobQueueActive = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(Runnable runnable, ExecuteType executeType) {
        if (Thread.currentThread() == this.mJSThread) {
            runnable.run();
        } else {
            this.mJSThreadHandler.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$require$8(String str, ValueCallback valueCallback) {
        try {
            e = nativeRequire(str);
        } catch (V8Exception e7) {
            e = e7;
            notifyV8Error(e);
        }
        if (valueCallback != null) {
            valueCallback.onReceiveValue(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$requireSync$7(List list, CountDownLatch countDownLatch, Object obj) {
        try {
            list.add(obj);
        } catch (NullPointerException e7) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runNativeJsFunction$6(String str, String str2, Object[] objArr, ValueCallback valueCallback) {
        try {
            e = nativeCallJsFunction(str, str2, objArr);
        } catch (V8Exception e7) {
            e = e7;
            notifyV8Error(e);
        }
        if (valueCallback != null) {
            valueCallback.onReceiveValue(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runOnJSThreadInternal$12(Runnable runnable, ValueCallback valueCallback) {
        try {
            runnable.run();
            e = null;
        } catch (V8Exception e7) {
            e = e7;
            notifyV8Error(e);
        }
        if (valueCallback != null) {
            valueCallback.onReceiveValue(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runScript$5(String str, String str2, ValueCallback valueCallback) {
        try {
            e = nativeRunScript(str, str2);
        } catch (V8Exception e7) {
            e = e7;
            notifyV8Error(e);
        }
        if (valueCallback != null) {
            valueCallback.onReceiveValue(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$runScriptSync$4(List list, CountDownLatch countDownLatch, Object obj) {
        try {
            list.add(obj);
        } catch (NullPointerException e7) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$timeoutCallback$11(V8Timeout v8Timeout, boolean z6, boolean z7) {
        try {
            nativeTimeoutCB(v8Timeout.jsCbPtr, v8Timeout.thisObjPtr, z6, z7);
        } catch (V8Exception e7) {
            notifyV8Error(e7);
        }
        if (z6 || v8Timeout.clearIfDead() || !v8Timeout.isRecurring()) {
            return;
        }
        v8Timeout.recurring();
    }

    private native long lock();

    private native Object nativeCallJsFunction(String str, String str2, Object[] objArr);

    private native Object nativeRequire(String str);

    private native Object nativeRequire2(String str);

    private native Object nativeRunScript(String str, String str2);

    private native void nativeSetDebug(boolean z6);

    private native void nativeTimeoutCB(long j7, long j8, boolean z6, boolean z7);

    @Keep
    private byte[] onNativeMessage(long j7, String str, byte[] bArr, int i7) {
        MessageHandler messageHandler = this.messageHandler;
        byte[] bArrOnNativeMessage = messageHandler != null ? messageHandler.onNativeMessage(j7, str, bArr, i7) : null;
        byte[] bArrERROR_MESSAGE = bArrOnNativeMessage;
        if (bArrOnNativeMessage == null) {
            bArrERROR_MESSAGE = ERROR_MESSAGE(j7, "unknown error");
        }
        return bArrERROR_MESSAGE;
    }

    private static void onOOMError(String str, boolean z6) {
        Iterator<OOMHandler> it = handlers.iterator();
        while (it.hasNext()) {
            it.next().onOOM(str, z6);
        }
    }

    @Keep
    private boolean onRequest(long j7, String str, byte[] bArr, int i7) {
        RequestHandler requestHandler = this.requestHandler;
        if (requestHandler != null) {
            return requestHandler.onRequest(j7, str, bArr, i7);
        }
        return false;
    }

    private native Object parseJSON(String str);

    public static void registerOOMHandler(OOMHandler oOMHandler) {
        handlers.add(oOMHandler);
    }

    private void runOnJSThreadInternal(final Runnable runnable, ExecuteType executeType, final ValueCallback valueCallback) {
        JSThreadExecutor jSThreadExecutor = this.mJSThreadExecutor;
        JSThreadExecutor jSThreadExecutor2 = jSThreadExecutor;
        if (jSThreadExecutor == null) {
            jSThreadExecutor2 = this.mDefaultJSThreadExecutor;
        }
        jSThreadExecutor2.executeOnJSThread(new Runnable(this, runnable, valueCallback) { // from class: com.bilibili.lib.v8.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final V8Engine f65041a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Runnable f65042b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final V8Engine.ValueCallback f65043c;

            {
                this.f65041a = this;
                this.f65042b = runnable;
                this.f65043c = valueCallback;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f65041a.lambda$runOnJSThreadInternal$12(this.f65042b, this.f65043c);
            }
        }, executeType);
    }

    private native void unlock(long j7);

    public static void unregisterOOMHandler(OOMHandler oOMHandler) {
        handlers.remove(oOMHandler);
    }

    public void addStatusListener(final V8EngineStatusListener v8EngineStatusListener) {
        synchronized (this) {
            if (this.shutdown.get()) {
                v8EngineStatusListener.onShutdown();
                return;
            }
            if (this.mReady) {
                runOnJSThreadInternal(new Runnable(v8EngineStatusListener) { // from class: com.bilibili.lib.v8.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final V8Engine.V8EngineStatusListener f65027a;

                    {
                        this.f65027a = v8EngineStatusListener;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f65027a.onReady();
                    }
                }, ExecuteType.STATUS_CHANGE_NOTIFY, null);
            }
            if (this.mStatusListeners == null) {
                this.mStatusListeners = new CopyOnWriteArrayList<>();
            }
            synchronized (this.mStatusListeners) {
                this.mStatusListeners.add(v8EngineStatusListener);
            }
        }
    }

    public void cleanup() {
        V8Timeout[] v8TimeoutArr;
        synchronized (this.mTimeouts) {
            v8TimeoutArr = (V8Timeout[]) this.mTimeoutsToGC.toArray(new V8Timeout[this.mTimeoutsToGC.size()]);
            this.mTimeoutsToGC.clear();
        }
        try {
            for (V8Timeout v8Timeout : v8TimeoutArr) {
                timeoutCallback(v8Timeout, true, false);
            }
        } catch (Exception e7) {
            Log.e(TAG, "Couldn't clear timeoutsGC", e7);
        }
    }

    public void closeRealDebugger() {
        RealDebuggerCallBack realDebuggerCallBack = this.realDebuggerCallBack;
        if (realDebuggerCallBack != null) {
            realDebuggerCallBack.closeRealDebuggerCallBack();
        }
    }

    public void configRealDebugger(String str, String str2, String str3, RealDebuggerCallBack realDebuggerCallBack) {
        try {
            if (this.shutdown.get()) {
                return;
            }
            this.realDebuggerCallBack = realDebuggerCallBack;
            if (this.debuggerV8Inspector != null) {
                return;
            }
            try {
                V8Inspector v8Inspector = new V8Inspector(this, this.mContext, "", str);
                this.debuggerV8Inspector = v8Inspector;
                v8Inspector.initRemoteV8Inspector(str2, str3, null);
            } catch (Exception e7) {
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public void configV8Inspector(String str, String str2) {
        try {
            if (this.v8Inspector != null) {
                return;
            }
            Application application = this.mContext;
            String str3 = str2;
            if (str2 == null) {
                str3 = "";
            }
            V8Inspector v8Inspector = new V8Inspector(this, application, str3, str);
            this.v8Inspector = v8Inspector;
            v8Inspector.start();
            this.v8Inspector.waitForDebugger(false);
        } catch (IOException e7) {
            e7.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: connect, reason: merged with bridge method [inline-methods] */
    public native void lambda$connectInspector$13(Object obj);

    @Override // com.bilibili.lib.v8.InspectorBackend
    public void connectInspector(final Object obj) {
        runOnJSThread(new Runnable(this, obj) { // from class: com.bilibili.lib.v8.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final V8Engine f65035a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f65036b;

            {
                this.f65035a = this;
                this.f65036b = obj;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f65035a.lambda$connectInspector$13(this.f65036b);
            }
        }, null);
    }

    @NonNull
    public CameraAble createCamera(double d7, double d8, double d9, double d10, @NonNull String str, @NonNull String str2, @NonNull String str3, long j7) {
        CameraBinder cameraBinder = this.cameraBinder;
        if (cameraBinder == null) {
            return null;
        }
        return cameraBinder.createCamera(d7, d8, d9, d10, str, str2, str3, j7);
    }

    @NonNull
    public CameraContext createContext(@NonNull String str, @NonNull String str2) {
        CameraContextBinder cameraContextBinder = this.cameraContextBinder;
        if (cameraContextBinder == null) {
            return null;
        }
        return cameraContextBinder.createContext(str, str2);
    }

    public ImageSolutionAble createImageSolution(int i7, @NonNull String[] strArr, long j7) {
        ImageSolutionBinder imageSolutionBinder = this.imageSolutionBinder;
        if (imageSolutionBinder == null) {
            return null;
        }
        return imageSolutionBinder.createImageSolution(i7, strArr, j7);
    }

    public V8Timeout createTimeout(long j7, long j8, long j9, boolean z6, int i7) {
        return new V8Timeout(this, j7, j8, j9, z6, i7);
    }

    @NonNull
    public VideoDecoderAble createVideoDecoder() {
        VideoDecoderBinder videoDecoderBinder = this.videoDecoderBinder;
        if (videoDecoderBinder == null) {
            return null;
        }
        return videoDecoderBinder.createVideoDecoder();
    }

    public void debug(boolean z6) {
        mDebug = z6;
        nativeSetDebug(z6);
    }

    public native void disconnect();

    @Override // com.bilibili.lib.v8.InspectorBackend
    public void disconnectInspector() {
        runOnJSThread(new Runnable(this) { // from class: com.bilibili.lib.v8.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final V8Engine f65037a;

            {
                this.f65037a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f65037a.disconnect();
            }
        }, null);
    }

    @Override // com.bilibili.lib.v8.InspectorBackend
    public void dispatchInspectorMessage(String str) {
        runOnJSThread(new com.bilibili.ad.web.b(1, this, str), null);
    }

    /* JADX INFO: renamed from: dispatchMessage, reason: merged with bridge method [inline-methods] */
    public native void lambda$dispatchInspectorMessage$14(String str);

    public String dumpV8Heap() {
        String strDumpHeap;
        if (this.shutdown.get()) {
            return null;
        }
        synchronized (this) {
            strDumpHeap = dumpHeap(this.mStoragePath);
        }
        return strDumpHeap;
    }

    @Keep
    public boolean enqueueOnNextTick(final JNIV8Function jNIV8Function) {
        return enqueueOnNextTick(new Runnable(this, jNIV8Function) { // from class: com.bilibili.lib.v8.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final V8Engine f65044a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final JNIV8Function f65045b;

            {
                this.f65044a = this;
                this.f65045b = jNIV8Function;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f65044a.lambda$enqueueOnNextTick$9(this.f65045b);
            }
        });
    }

    public boolean enqueueOnNextTick(Runnable runnable) {
        if (this.shutdown.get()) {
            return false;
        }
        return enqueueAndStartProcessing(runnable);
    }

    public JNIV8Function getConstructor(Class<? extends JNIV8Object> cls) {
        if (this.shutdown.get()) {
            return null;
        }
        return getConstructor(cls.getCanonicalName());
    }

    public Application getContext() {
        return this.mContext;
    }

    public Object getExternalObject(String str) {
        Map<String, Object> map;
        if (TextUtils.isEmpty(str) || (map = this.mExtObjs) == null) {
            return null;
        }
        return map.get(str);
    }

    public native JNIV8GenericObject getGlobalObject();

    public Handler getJSThreadHandler() {
        return this.mJSThreadHandler;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 1) {
            cleanup();
            Handler handler = this.mJSThreadHandler;
            handler.sendMessageDelayed(handler.obtainMessage(1), 10000L);
            return true;
        }
        if (i7 == 2) {
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                return true;
            }
            looperMyLooper.quit();
            return true;
        }
        if (i7 == 3) {
            return true;
        }
        if (i7 != 5) {
            return false;
        }
        this.mReady = true;
        CopyOnWriteArrayList<V8EngineStatusListener> copyOnWriteArrayList = this.mStatusListeners;
        if (copyOnWriteArrayList == null) {
            return true;
        }
        synchronized (copyOnWriteArrayList) {
            Iterator<V8EngineStatusListener> it = this.mStatusListeners.iterator();
            while (it.hasNext()) {
                runOnJSThreadInternal(new Runnable(this, it.next()) { // from class: com.bilibili.lib.v8.V8Engine.2
                    final V8Engine this$0;
                    final V8EngineStatusListener val$h;

                    {
                        this.this$0 = this;
                        this.val$h = v8EngineStatusListener;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        this.val$h.onReady();
                    }
                }, ExecuteType.STATUS_CHANGE_NOTIFY, null);
            }
        }
        return true;
    }

    public void handlerResponse(long j7, String str, byte[] bArr, int i7) {
        try {
            onResponse(j7, str, bArr, i7);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public native void init();

    public void initPreConfig(byte[] bArr) {
        if (bArr != null) {
            try {
                nativeInitPreConfig(bArr, bArr.length);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public native void injectJsConsole();

    public boolean isPaused() {
        return this.mPaused;
    }

    public boolean isReady() {
        return this.mReady;
    }

    public void logMessage(byte[] bArr) {
        C7672b c7672bK = C7672b.k(ByteBuffer.wrap(bArr));
        Log.e("==message==", "===========java message===========");
        Log.e("==message==", "\nid:" + c7672bK.l());
        StringBuilder sb = new StringBuilder("\ncmd:");
        int iA = c7672bK.a(6);
        sb.append(iA != 0 ? c7672bK.c(iA + ((cN0.a) c7672bK).a) : null);
        Log.e("==message==", sb.toString());
        StringBuilder sb2 = new StringBuilder("\nmessageCode:");
        int iA2 = c7672bK.a(8);
        sb2.append(iA2 != 0 ? ((cN0.a) c7672bK).b.getInt(iA2 + ((cN0.a) c7672bK).a) : 0);
        Log.e("==message==", sb2.toString());
        StringBuilder sb3 = new StringBuilder("\nmessageInfo:");
        int iA3 = c7672bK.a(10);
        sb3.append(iA3 != 0 ? c7672bK.c(iA3 + ((cN0.a) c7672bK).a) : null);
        Log.e("==message==", sb3.toString());
        int i7 = 0;
        while (true) {
            int iA4 = c7672bK.a(12);
            if (i7 >= (iA4 != 0 ? c7672bK.e(iA4) : 0)) {
                break;
            }
            StringBuilder sb4 = new StringBuilder("\nkey:");
            C7673c c7673cI = c7672bK.i(i7);
            int iA5 = c7673cI.a(4);
            sb4.append(iA5 != 0 ? c7673cI.c(iA5 + ((cN0.a) c7673cI).a) : null);
            sb4.append(" value:");
            sb4.append(c7672bK.i(i7).h());
            Log.e("==message==", sb4.toString());
            i7++;
        }
        int i8 = 0;
        while (true) {
            int iA6 = c7672bK.a(14);
            if (i8 >= (iA6 != 0 ? c7672bK.e(iA6) : 0)) {
                return;
            }
            C7671a c7671aG = c7672bK.g(i8);
            StringBuilder sb5 = new StringBuilder("\nkey:");
            C7671a c7671aG2 = c7672bK.g(i8);
            int iA7 = c7671aG2.a(4);
            sb5.append(iA7 != 0 ? c7671aG2.c(iA7 + ((cN0.a) c7671aG2).a) : null);
            sb5.append(" value:");
            sb5.append(c7671aG);
            sb5.append(" len:");
            sb5.append(c7672bK.g(i8).g());
            Log.e("==message==", sb5.toString());
            StringBuilder sb6 = new StringBuilder("===========binary len: ");
            int iA8 = c7671aG.a(6);
            sb6.append(iA8 != 0 ? c7671aG.e(iA8) : 0);
            sb6.append("===========");
            Log.e("==message==", sb6.toString());
            ByteBuffer byteBufferH = c7671aG.h();
            int iG = c7671aG.g();
            byte[] bArr2 = new byte[iG];
            byteBufferH.get(bArr2);
            StringBuffer stringBuffer = new StringBuffer();
            for (int i9 = 0; i9 < iG; i9++) {
                stringBuffer.append(String.format("0X%04x ", Byte.valueOf(bArr2[i9])));
            }
            Log.e("==message==", stringBuffer.toString());
            i8++;
        }
    }

    public native void nativeInitPreConfig(byte[] bArr, int i7);

    public native void nativeInspectorMainContext();

    public native void nativeInspectorOpenDataContext();

    public native void nativeLoopPumpMessage();

    public native void nativeMessage(long j7, String str, byte[] bArr, int i7);

    public native Object nativeRequireOnCurrentContext(String str);

    public native Object nativeRunScriptOnCurrentContext(String str, String str2);

    public native void nativeSetBlackScreenConfig(int i7);

    public native void nativeSetSocketWhiteList(String str);

    public void notifyV8Error(V8Exception v8Exception) {
        Log.e(TAG, v8Exception.getMessage(), v8Exception);
        CopyOnWriteArrayList<V8EngineStatusListener> copyOnWriteArrayList = this.mStatusListeners;
        if (copyOnWriteArrayList != null) {
            synchronized (copyOnWriteArrayList) {
                Iterator<V8EngineStatusListener> it = this.mStatusListeners.iterator();
                while (it.hasNext()) {
                    it.next().onUncaughtV8Exception(v8Exception);
                }
            }
        }
    }

    public native void onResponse(long j7, String str, byte[] bArr, int i7);

    public native void openDataContextCreated();

    public void pause() {
        Handler handler;
        this.mPaused = true;
        Handler handler2 = this.mJSThreadHandler;
        if (handler2 != null) {
            handler2.removeMessages(1);
        }
        Runnable runnable = this.mQueueWaitRunnable;
        if (runnable == null || (handler = this.mJSThreadHandler) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    public void registerV8Class(Class<? extends JNIV8Object> cls) {
        Class<? super Object> cls2;
        if (this.shutdown.get()) {
            return;
        }
        if (Modifier.isAbstract(cls.getModifiers())) {
            throw new RuntimeException("Abstract classes can not be registered");
        }
        Class<? super Object> superclass = cls.getSuperclass();
        while (true) {
            cls2 = superclass;
            if (cls2 == JNIV8Object.class || !Modifier.isAbstract(cls2.getModifiers())) {
                break;
            } else {
                superclass = cls2.getSuperclass();
            }
        }
        JNIV8Object.registerV8Class(cls.getCanonicalName(), cls2.getCanonicalName());
        getConstructor(cls);
    }

    public void removeStatusListener(V8EngineStatusListener v8EngineStatusListener) {
        synchronized (this) {
            CopyOnWriteArrayList<V8EngineStatusListener> copyOnWriteArrayList = this.mStatusListeners;
            if (copyOnWriteArrayList == null) {
                return;
            }
            synchronized (copyOnWriteArrayList) {
                this.mStatusListeners.remove(v8EngineStatusListener);
            }
        }
    }

    public void removeTimeout(int i7) {
        synchronized (this.mTimeouts) {
            V8Timeout v8Timeout = this.mTimeouts.get(i7);
            if (v8Timeout != null) {
                v8Timeout.setAsDead();
                this.mJSThreadHandler.removeCallbacks(v8Timeout, null);
                this.mTimeoutsToAddAfterPause.remove(i7);
                this.mTimeouts.remove(i7);
                if (this.mTimeoutRunningTo != v8Timeout) {
                    this.mTimeoutsToGC.add(v8Timeout);
                }
                if (!this.mJSThreadHandler.hasMessages(1)) {
                    Handler handler = this.mJSThreadHandler;
                    handler.sendMessageDelayed(handler.obtainMessage(1), 10000L);
                }
            } else {
                Log.i(TAG, "Couldn't remove timeout (clearTimeout) " + i7);
            }
        }
    }

    public void require(final String str, @Nullable final ValueCallback valueCallback) {
        if (!this.shutdown.get()) {
            runOnJSThreadInternal(new Runnable(this, str, valueCallback) { // from class: com.bilibili.lib.v8.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final V8Engine f65038a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f65039b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final V8Engine.ValueCallback f65040c;

                {
                    this.f65038a = this;
                    this.f65039b = str;
                    this.f65040c = valueCallback;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f65038a.lambda$require$8(this.f65039b, this.f65040c);
                }
            }, ExecuteType.RUN_SCRIPT, null);
        } else if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    public Object requireSync(String str) {
        if (this.shutdown.get()) {
            return null;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final ArrayList arrayList = new ArrayList(1);
        require(str, new ValueCallback(arrayList, countDownLatch) { // from class: com.bilibili.lib.v8.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f65028a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CountDownLatch f65029b;

            {
                this.f65028a = arrayList;
                this.f65029b = countDownLatch;
            }

            @Override // com.bilibili.lib.v8.V8Engine.ValueCallback
            public final void onReceiveValue(Object obj) {
                V8Engine.lambda$requireSync$7(this.f65028a, this.f65029b, obj);
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e7) {
            e7.printStackTrace();
        }
        return arrayList.isEmpty() ? null : arrayList.get(0);
    }

    public void runLocked(Runnable runnable) {
        long jLock = lock();
        try {
            runnable.run();
        } finally {
            unlock(jLock);
        }
    }

    public void runNativeJsFunction(@NonNull final String str, @NonNull final String str2, final Object[] objArr, @Nullable final ValueCallback valueCallback) {
        if (!this.shutdown.get()) {
            runOnJSThreadInternal(new Runnable(this, str, str2, objArr, valueCallback) { // from class: com.bilibili.lib.v8.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final V8Engine f65030a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f65031b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f65032c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Object[] f65033d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final V8Engine.ValueCallback f65034e;

                {
                    this.f65030a = this;
                    this.f65031b = str;
                    this.f65032c = str2;
                    this.f65033d = objArr;
                    this.f65034e = valueCallback;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f65030a.lambda$runNativeJsFunction$6(this.f65031b, this.f65032c, this.f65033d, this.f65034e);
                }
            }, ExecuteType.RUN_SCRIPT, null);
        } else if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    public void runOnJSThread(Runnable runnable, @Nullable ValueCallback valueCallback) {
        if (!this.shutdown.get()) {
            runOnJSThreadInternal(runnable, ExecuteType.RUN_SCRIPT, valueCallback);
        } else if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    public void runOnJSThreadSync(Runnable runnable) {
        if (this.shutdown.get()) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        runOnJSThreadInternal(runnable, ExecuteType.RUN_SCRIPT, new n0(countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e7) {
            e7.printStackTrace();
        }
    }

    public void runScript(String str, String str2, @Nullable ValueCallback valueCallback) {
        if (!this.shutdown.get()) {
            runOnJSThreadInternal(new o(this, str, str2, valueCallback, 1), ExecuteType.RUN_SCRIPT, null);
        } else if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    public void runScriptOnCurrentThread(String str, String str2, @Nullable ValueCallback valueCallback) {
        if (this.shutdown.get()) {
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
        } else {
            try {
                e = nativeRunScript(str, str2);
            } catch (V8Exception e7) {
                e = e7;
                notifyV8Error(e);
            }
            if (valueCallback != null) {
                valueCallback.onReceiveValue(e);
            }
        }
    }

    public Object runScriptSync(String str, String str2) {
        if (this.shutdown.get()) {
            return null;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final ArrayList arrayList = new ArrayList(1);
        runScript(str, str2, new ValueCallback(arrayList, countDownLatch) { // from class: com.bilibili.lib.v8.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f65050a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CountDownLatch f65051b;

            {
                this.f65050a = arrayList;
                this.f65051b = countDownLatch;
            }

            @Override // com.bilibili.lib.v8.V8Engine.ValueCallback
            public final void onReceiveValue(Object obj) {
                V8Engine.lambda$runScriptSync$4(this.f65050a, this.f65051b, obj);
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e7) {
            e7.printStackTrace();
        }
        return arrayList.isEmpty() ? null : arrayList.get(0);
    }

    public native void scheduleBreak();

    @Override // com.bilibili.lib.v8.InspectorBackend
    public void scheduleInspectorBreak() {
        runOnJSThread(new Gf1.f(this, 1), null);
    }

    public void sendMessage(long j7, String str, byte[] bArr) {
        byte[] bArrERROR_MESSAGE = bArr;
        if (bArr == null) {
            try {
                bArrERROR_MESSAGE = ERROR_MESSAGE(j7, "unknown error");
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        nativeMessage(j7, str, bArrERROR_MESSAGE, bArrERROR_MESSAGE.length);
    }

    public void setCurrentTimeout(V8Timeout v8Timeout) {
        this.mTimeoutRunningTo = v8Timeout;
    }

    public void setExternalObject(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        if (this.mExtObjs == null) {
            this.mExtObjs = new HashMap();
        }
        this.mExtObjs.put(str, obj);
    }

    public void setHandler(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void setJSThreadExecutor(JSThreadExecutor jSThreadExecutor) {
        this.mJSThreadExecutor = jSThreadExecutor;
    }

    public void setMessageHandler(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    public void setSocketWhiteList(String str) {
        try {
            nativeSetSocketWhiteList(str);
        } catch (UnsatisfiedLinkError e7) {
            e7.printStackTrace();
        } catch (Error e8) {
            e8.printStackTrace();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public int setTimeout(long j7, long j8, long j9, boolean z6) {
        int i7;
        if (this.shutdown.get()) {
            return -1;
        }
        synchronized (this.mTimeouts) {
            i7 = this.mLastTimeoutId;
            this.mLastTimeoutId = i7 + 1;
            V8Timeout v8TimeoutCreateTimeout = createTimeout(j7, j8, j9, z6, i7);
            if (this.mPaused) {
                this.mTimeoutsToAddAfterPause.append(i7, v8TimeoutCreateTimeout);
            } else {
                this.mTimeouts.append(i7, v8TimeoutCreateTimeout);
                this.mJSThreadHandler.postDelayed(v8TimeoutCreateTimeout, j9);
                if (mDebug) {
                    Objects.toString(v8TimeoutCreateTimeout);
                }
            }
        }
        return i7;
    }

    public void shutdown() {
        synchronized (this) {
            if (this.shutdown.compareAndSet(false, true)) {
                runOnJSThreadInternal(new Qx.c(this, 2), ExecuteType.STATUS_CHANGE_NOTIFY, null);
            }
        }
    }

    /* JADX INFO: renamed from: shutdownInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$shutdown$2() {
        try {
            synchronized (this.mTimeouts) {
                for (int i7 = 0; i7 < this.mTimeoutsToAddAfterPause.size(); i7++) {
                    this.mJSThreadHandler.removeCallbacks(this.mTimeoutsToAddAfterPause.valueAt(i7));
                }
                this.mTimeoutsToAddAfterPause.clear();
                for (int i8 = 0; i8 < this.mTimeouts.size(); i8++) {
                    this.mJSThreadHandler.removeCallbacks(this.mTimeouts.valueAt(i8));
                }
                this.mTimeouts.clear();
                this.mTimeoutsToGC.clear();
            }
            V8Inspector v8Inspector = this.v8Inspector;
            if (v8Inspector != null) {
                v8Inspector.stop();
            }
            V8Inspector v8Inspector2 = this.debuggerV8Inspector;
            if (v8Inspector2 != null) {
                v8Inspector2.stopRealDebuggerConnection();
                this.debuggerV8Inspector = null;
            }
            JNIV8GenericObject globalObject = getGlobalObject();
            for (String str : globalObject.getV8Keys()) {
                globalObject.setV8Field(str, null);
            }
            for (String str2 : globalObject.getV8OwnKeys()) {
                globalObject.setV8Field(str2, null);
            }
            dispose();
        } catch (Exception e7) {
            Log.e(TAG, e7.getMessage(), e7);
        }
        CopyOnWriteArrayList<V8EngineStatusListener> copyOnWriteArrayList = this.mStatusListeners;
        if (copyOnWriteArrayList != null) {
            synchronized (copyOnWriteArrayList) {
                Iterator<V8EngineStatusListener> it = this.mStatusListeners.iterator();
                while (it.hasNext()) {
                    it.next().onShutdown();
                }
                this.mStatusListeners.clear();
            }
        }
        this.mJSThreadHandler.sendEmptyMessage(2);
    }

    public void timeoutCallback(final V8Timeout v8Timeout, final boolean z6, final boolean z7) {
        runOnJSThreadInternal(new Runnable(this, v8Timeout, z6, z7) { // from class: com.bilibili.lib.v8.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final V8Engine f65046a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final V8Engine.V8Timeout f65047b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f65048c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final boolean f65049d;

            {
                this.f65046a = this;
                this.f65047b = v8Timeout;
                this.f65048c = z6;
                this.f65049d = z7;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f65046a.lambda$timeoutCallback$11(this.f65047b, this.f65048c, this.f65049d);
            }
        }, ExecuteType.TIME_OUT, null);
    }

    public void unpause() {
        if (this.mPaused) {
            this.mPaused = false;
            Handler handler = this.mJSThreadHandler;
            if (handler != null) {
                handler.sendMessageDelayed(handler.obtainMessage(1), 10000L);
            }
            enqueueAndStartProcessing(null);
            synchronized (this.mTimeouts) {
                for (int i7 = 0; i7 < this.mTimeoutsToAddAfterPause.size(); i7++) {
                    V8Timeout v8TimeoutValueAt = this.mTimeoutsToAddAfterPause.valueAt(i7);
                    this.mTimeouts.append(v8TimeoutValueAt.id, v8TimeoutValueAt);
                    this.mJSThreadHandler.postDelayed(v8TimeoutValueAt, v8TimeoutValueAt.timeout);
                    if (mDebug) {
                        v8TimeoutValueAt.toString();
                        int unused = v8TimeoutValueAt.id;
                    }
                }
                this.mTimeoutsToAddAfterPause.clear();
            }
        }
    }

    public void updatePackageInfo(String str) {
        RealDebuggerCallBack realDebuggerCallBack = this.realDebuggerCallBack;
        if (realDebuggerCallBack != null) {
            realDebuggerCallBack.updatePackageInfo(str);
        }
    }
}
