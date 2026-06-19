package com.bilibili.lib.v8;

import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/JNIObject.class */
public abstract class JNIObject {
    private static final Thread finalizingThread;
    private static ReferenceQueue<JNIObject> referenceQueue = new ReferenceQueue<>();
    private long nativeHandle;
    private JNIObjectReference reference;

    static {
        Thread thread = new Thread(new JNIObjectFinalizerRunnable(referenceQueue));
        finalizingThread = thread;
        thread.setName("BLV8FinalizingDaemon");
        thread.start();
    }

    public JNIObject() {
        initNative(getClass().getCanonicalName());
        initAutomaticDisposure();
    }

    public JNIObject(boolean z6) {
        if (z6) {
            return;
        }
        initNative(getClass().getCanonicalName());
        initAutomaticDisposure();
    }

    private native void initNative(String str);

    public static void registerClass(Class<? extends JNIObject> cls) {
        Class<? super Object> cls2;
        if (Modifier.isAbstract(cls.getModifiers())) {
            throw new RuntimeException("Abstract classes can not be registered");
        }
        Class<? super Object> superclass = cls.getSuperclass();
        while (true) {
            cls2 = superclass;
            if (cls2 == JNIObject.class || !Modifier.isAbstract(cls2.getModifiers())) {
                break;
            } else {
                superclass = cls2.getSuperclass();
            }
        }
        registerClass(cls.getCanonicalName(), cls2.getCanonicalName());
    }

    private static native void registerClass(String str, String str2);

    public void dispose() throws RuntimeException {
        if (this.nativeHandle == 0) {
            throw new RuntimeException("Object must not be disposed twice");
        }
        if (!this.reference.cleanup()) {
            throw new RuntimeException("Object is strongly referenced from native side and must not be disposed manually");
        }
        this.nativeHandle = 0L;
        this.reference = null;
    }

    public void initAutomaticDisposure() {
        this.reference = new JNIObjectReference(this, this.nativeHandle, referenceQueue);
    }

    public boolean isDisposed() {
        return this.nativeHandle == 0;
    }
}
