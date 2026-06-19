package com.bilibili.lib.v8;

import android.util.Log;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/JNIObjectFinalizerRunnable.class */
final class JNIObjectFinalizerRunnable implements Runnable {
    private static final String TAG = "V8-Finalizer";
    private ReferenceQueue<JNIObject> referenceQueue;
    private boolean stop = false;

    public JNIObjectFinalizerRunnable(ReferenceQueue<JNIObject> referenceQueue) {
        this.referenceQueue = referenceQueue;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (!this.stop) {
            try {
                if (!((JNIObjectReference) this.referenceQueue.remove()).cleanup()) {
                    Log.e(TAG, "GCd JNIObject failed to free native resources");
                }
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                Log.e(TAG, "The FinalizerRunnable thread has been interrupted. Native resources cannot be freed anymore");
                this.stop = true;
                return;
            }
        }
    }
}
