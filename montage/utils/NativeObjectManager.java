package com.bilibili.montage.utils;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/utils/NativeObjectManager.class */
public class NativeObjectManager {
    private final ReferenceQueue<Object> mReferenceQueue;
    private final ConcurrentHashMap<NativeObjectWrapper, Boolean> mReferences;
    private final Thread mThread;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/utils/NativeObjectManager$Holder.class */
    public static class Holder {
        static final NativeObjectManager instance = new NativeObjectManager();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/utils/NativeObjectManager$NativeObjectWrapper.class */
    public static class NativeObjectWrapper extends PhantomReference<Object> {
        private final Method mDestroyMethod;
        private final long mNativeRef;

        public NativeObjectWrapper(Object obj, Class<?> cls, long j7, ReferenceQueue<? super Object> referenceQueue) throws NoSuchMethodException {
            super(obj, referenceQueue);
            this.mNativeRef = j7;
            this.mDestroyMethod = cls.getMethod("nativeDestroy", Long.TYPE);
        }

        public void cleanup() throws Exception {
            this.mDestroyMethod.invoke(null, Long.valueOf(this.mNativeRef));
        }

        public String getClassName() {
            return this.mDestroyMethod.getDeclaringClass().getName();
        }
    }

    private NativeObjectManager() {
        this.mReferenceQueue = new ReferenceQueue<>();
        this.mReferences = new ConcurrentHashMap<>();
        Thread thread = new Thread(this, "NativeObjectManager") { // from class: com.bilibili.montage.utils.NativeObjectManager.1
            final NativeObjectManager this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (true) {
                    try {
                        Reference referenceRemove = this.this$0.mReferenceQueue.remove();
                        if (referenceRemove == null) {
                            return;
                        }
                        NativeObjectWrapper nativeObjectWrapper = (NativeObjectWrapper) referenceRemove;
                        if (((Boolean) this.this$0.mReferences.remove(nativeObjectWrapper)).booleanValue()) {
                            try {
                                nativeObjectWrapper.cleanup();
                            } catch (Exception e7) {
                                System.out.println("Exception in native cleanup: " + e7.getCause());
                            }
                        }
                    } catch (InterruptedException e8) {
                        return;
                    }
                }
            }
        };
        this.mThread = thread;
        thread.setPriority(4);
        thread.start();
    }

    public static void register(Object obj, long j7) {
        register(obj, obj.getClass(), j7);
    }

    public static void register(Object obj, Class<?> cls, long j7) {
        try {
            NativeObjectManager nativeObjectManager = Holder.instance;
            nativeObjectManager.mReferences.put(new NativeObjectWrapper(obj, cls, j7, nativeObjectManager.mReferenceQueue), Boolean.TRUE);
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException("failed to register object of type " + obj.getClass().getName() + " no static method nativeDestroy() found");
        }
    }

    public static void stop() {
        Holder.instance.mThread.interrupt();
    }
}
