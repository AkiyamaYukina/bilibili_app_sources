package com.bilibili.lib.v8;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/JNIObjectReference.class */
final class JNIObjectReference extends PhantomReference<JNIObject> {
    private static final String TAG = "V8-Reference";
    private static ReferencePool referencePool = new ReferencePool(0);
    private boolean cleanup;
    private long nativeHandle;
    public JNIObjectReference next;
    public JNIObjectReference prev;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/JNIObjectReference$ReferencePool.class */
    public static class ReferencePool {
        JNIObjectReference head;
        int length;

        private ReferencePool() {
            this.length = 0;
        }

        public /* synthetic */ ReferencePool(int i7) {
            this();
        }

        public void add(JNIObjectReference jNIObjectReference) {
            synchronized (this) {
                jNIObjectReference.prev = null;
                JNIObjectReference jNIObjectReference2 = this.head;
                jNIObjectReference.next = jNIObjectReference2;
                if (jNIObjectReference2 != null) {
                    jNIObjectReference2.prev = jNIObjectReference;
                }
                this.head = jNIObjectReference;
                this.length++;
            }
        }

        public void remove(JNIObjectReference jNIObjectReference) {
            synchronized (this) {
                JNIObjectReference jNIObjectReference2 = jNIObjectReference.next;
                JNIObjectReference jNIObjectReference3 = jNIObjectReference.prev;
                jNIObjectReference.next = null;
                jNIObjectReference.prev = null;
                if (jNIObjectReference3 != null) {
                    jNIObjectReference3.next = jNIObjectReference2;
                } else {
                    this.head = jNIObjectReference2;
                }
                if (jNIObjectReference2 != null) {
                    jNIObjectReference2.prev = jNIObjectReference3;
                }
                this.length--;
            }
        }
    }

    public JNIObjectReference(JNIObject jNIObject, long j7, ReferenceQueue<JNIObject> referenceQueue) {
        super(jNIObject, referenceQueue);
        this.nativeHandle = j7;
        referencePool.add(this);
    }

    private static native boolean disposeNative(long j7);

    public boolean cleanup() {
        synchronized (JNIObjectReference.class) {
            try {
                if (this.cleanup) {
                    return true;
                }
                if (!disposeNative(this.nativeHandle)) {
                    return false;
                }
                referencePool.remove(this);
                clear();
                int i7 = referencePool.length;
                this.cleanup = true;
                return true;
            } finally {
            }
        }
    }
}
