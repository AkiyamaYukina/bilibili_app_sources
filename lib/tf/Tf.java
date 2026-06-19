package com.bilibili.lib.tf;

import androidx.annotation.AnyThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bilibili.lib.tf.internal.InternalActivateCallback;
import com.bilibili.lib.tf.internal.InternalDelegate;
import com.bilibili.lib.tf.internal.InternalTfChangeCallback;
import com.bilibili.lib.tf.internal.InternalTrack;
import com.bilibili.lib.tf.sp.MobileServiceConfig;
import com.bilibili.lib.tf.sp.TelecomServiceConfig;
import com.bilibili.lib.tf.sp.UnicomServiceConfig;
import com.bilibili.lib.tf.utils.AutoCloseableLock;
import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/Tf.class */
public class Tf {
    private static final String TAG;

    @NonNull
    private InternalDelegate delegate;
    private final ReadWriteLock mReadWriteLock;

    @GuardedBy("mReadWriteLock")
    private long tfAdapter;

    @NonNull
    private InternalTrack track;

    static {
        TfLibLoader.getInstance().loadLibrariesOnce();
        TAG = "Tf";
    }

    public Tf(TfBuilder tfBuilder) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock(false);
        this.mReadWriteLock = reentrantReadWriteLock;
        this.track = new InternalTrack(tfBuilder.track());
        this.delegate = new InternalDelegate(tfBuilder.delegate());
        AutoCloseableLock autoCloseableLockLock = AutoCloseableLock.lock(reentrantReadWriteLock.writeLock());
        try {
            long jNativeCreateTfAdapter = nativeCreateTfAdapter(this, createNativeTfConfig(tfBuilder), createNativeTrack(this.track, tfBuilder.trackEnabled()), createNativeDelegate(this.delegate));
            this.tfAdapter = jNativeCreateTfAdapter;
            if (jNativeCreateTfAdapter == 0) {
                throw new NullPointerException("Tf Adapter creation failed.");
            }
            if (autoCloseableLockLock != null) {
                autoCloseableLockLock.close();
            }
        } catch (Throwable th) {
            if (autoCloseableLockLock != null) {
                try {
                    autoCloseableLockLock.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @GuardedBy("mReadWriteLock")
    private void checkHaveAdapter() throws IllegalStateException {
        if (!haveNativeAdapter()) {
            throw new IllegalStateException("Tf has been shut down.");
        }
    }

    private static long createNativeDelegate(@NonNull InternalDelegate internalDelegate) {
        return nativeCreateTfDelegate(internalDelegate);
    }

    @VisibleForTesting
    public static long createNativeTfConfig(TfBuilder tfBuilder) {
        long jNativeCreateTfConfig = nativeCreateTfConfig(tfBuilder.enabled(), tfBuilder.debug(), tfBuilder.trackEnabled(), tfBuilder.ignetCAPIEnabled(), tfBuilder.storagePath(), tfBuilder.activateMaxAge());
        UnicomServiceConfig unicomServiceConfigUnicom = tfBuilder.unicom();
        if (unicomServiceConfigUnicom != null) {
            nativeAddUnicomService(jNativeCreateTfConfig, unicomServiceConfigUnicom.activeUrl, unicomServiceConfigUnicom.cardResource, unicomServiceConfigUnicom.packgeResource, unicomServiceConfigUnicom.httpsCdnTransform, unicomServiceConfigUnicom.cdnTransformNewUrlHttps);
        }
        MobileServiceConfig mobileServiceConfigMobile = tfBuilder.mobile();
        if (mobileServiceConfigMobile != null) {
            nativeAddMobileService(jNativeCreateTfConfig, mobileServiceConfigMobile.activeUrl, mobileServiceConfigMobile.cardResource, mobileServiceConfigMobile.packgeResource);
        }
        TelecomServiceConfig telecomServiceConfigTelecom = tfBuilder.telecom();
        if (telecomServiceConfigTelecom != null) {
            nativeAddTelecomService(jNativeCreateTfConfig, telecomServiceConfigTelecom.activeUrl, telecomServiceConfigTelecom.cardResource);
        }
        return jNativeCreateTfConfig;
    }

    private static long createNativeTrack(@NonNull InternalTrack internalTrack, boolean z6) {
        return nativeCreateTfTrack(internalTrack, z6);
    }

    @GuardedBy("mReadWriteLock")
    private boolean haveNativeAdapter() {
        return this.tfAdapter != 0;
    }

    private native void nativeActivate(long j7, TfActivateReq tfActivateReq, InternalActivateCallback internalActivateCallback);

    private static native void nativeAddMobileService(long j7, String str, TfResourceConfig tfResourceConfig, TfResourceConfig tfResourceConfig2);

    private static native void nativeAddTelecomService(long j7, String str, TfResourceConfig tfResourceConfig);

    private native long nativeAddTfChangeCallback(long j7, InternalTfChangeCallback internalTfChangeCallback);

    private static native void nativeAddUnicomService(long j7, String str, TfResourceConfig tfResourceConfig, TfResourceConfig tfResourceConfig2, boolean z6, boolean z7);

    private native void nativeClearActivate(long j7);

    private native void nativeClearCachedActivate(long j7, int i7);

    private static native long nativeCreateTfAdapter(Tf tf, long j7, long j8, long j9);

    private static native long nativeCreateTfConfig(boolean z6, boolean z7, boolean z8, boolean z9, String str, long j7);

    private static native long nativeCreateTfDelegate(InternalDelegate internalDelegate);

    private static native long nativeCreateTfTrack(InternalTrack internalTrack, boolean z6);

    private native void nativeDestroy(long j7);

    private native void nativeEnable(long j7, int i7, boolean z6);

    private native TfActivateStatus nativeGetActivate(long j7);

    private native TfActivateStatus nativeGetCachedActivate(long j7, int i7);

    private native ByteBuffer nativeGetTfRulesConfig(long j7);

    private native boolean nativeIsEnabled(long j7, int i7);

    private native boolean nativeIsTfUrl(long j7, String str);

    private native void nativeOnSyncModels(long j7);

    private native TfQueryResp nativeQuery(long j7, TfQueryReq tfQueryReq);

    private native void nativeRemoveTfChangeCallback(long j7, long j8);

    private native void nativeSetActivate(long j7, TfActivateStatus tfActivateStatus);

    private native void nativeSetTfRulesConfig(long j7, ByteBuffer byteBuffer);

    private native TfTransformResp nativeTransform(long j7, TfTransformReq tfTransformReq);

    @AnyThread
    public void activate(@NonNull TfActivateReq tfActivateReq, @Nullable TfActivateCallback tfActivateCallback) {
        AutoCloseableLock autoCloseableLockLock = AutoCloseableLock.lock(this.mReadWriteLock.readLock());
        try {
            checkHaveAdapter();
            nativeActivate(this.tfAdapter, tfActivateReq, new InternalActivateCallback(tfActivateCallback));
            if (autoCloseableLockLock != null) {
                autoCloseableLockLock.close();
            }
        } catch (Throwable th) {
            if (autoCloseableLockLock != null) {
                try {
                    autoCloseableLockLock.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @AnyThread
    public long addTfChangeCallback(@NonNull TfChangeCallback tfChangeCallback) {
        AutoCloseableLock autoCloseableLockLock = AutoCloseableLock.lock(this.mReadWriteLock.readLock());
        try {
            checkHaveAdapter();
            long jNativeAddTfChangeCallback = nativeAddTfChangeCallback(this.tfAdapter, new InternalTfChangeCallback(tfChangeCallback));
            if (autoCloseableLockLock != null) {
                autoCloseableLockLock.close();
            }
            return jNativeAddTfChangeCallback;
        } catch (Throwable th) {
            if (autoCloseableLockLock != null) {
                try {
                    autoCloseableLockLock.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @AnyThread
    public void clearActivate() {
        AutoCloseableLock autoCloseableLockLock = AutoCloseableLock.lock(this.mReadWriteLock.readLock());
        try {
            checkHaveAdapter();
            nativeClearActivate(this.tfAdapter);
            if (autoCloseableLockLock != null) {
                autoCloseableLockLock.close();
            }
        } catch (Throwable th) {
            if (autoCloseableLockLock != null) {
                try {
                    autoCloseableLockLock.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @AnyThread
    @VisibleForTesting
    public void clearCachedActivate(TfProvider tfProvider) {
        AutoCloseableLock autoCloseableLockLock = AutoCloseableLock.lock(this.mReadWriteLock.readLock());
        try {
            checkHaveAdapter();
            nativeClearCachedActivate(this.tfAdapter, tfProvider.getNumber());
            if (autoCloseableLockLock != null) {
                autoCloseableLockLock.close();
            }
        } catch (Throwable th) {
            if (autoCloseableLockLock != null) {
                try {
                    autoCloseableLockLock.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @AnyThread
    public void enable(@NonNull TfTypeExt tfTypeExt, boolean z6) {
        AutoCloseableLock autoCloseableLockLock = AutoCloseableLock.lock(this.mReadWriteLock.readLock());
        try {
            checkHaveAdapter();
            nativeEnable(this.tfAdapter, tfTypeExt.getNumber(), z6);
            if (autoCloseableLockLock != null) {
                autoCloseableLockLock.close();
            }
        } catch (Throwable th) {
            if (autoCloseableLockLock != null) {
                try {
                    autoCloseableLockLock.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Nullable
    @AnyThread
    public TfActivateStatus getActivate() {
        AutoCloseableLock autoCloseableLockLock = AutoCloseableLock.lock(this.mReadWriteLock.readLock());
        try {
            checkHaveAdapter();
            TfActivateStatus tfActivateStatusNativeGetActivate = nativeGetActivate(this.tfAdapter);
            if (autoCloseableLockLock != null) {
                autoCloseableLockLock.close();
            }
            return tfActivateStatusNativeGetActivate;
        } catch (Throwable th) {
            if (autoCloseableLockLock != null) {
                try {
                    autoCloseableLockLock.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Nullable
    @AnyThread
    @VisibleForTesting
    public TfActivateStatus getCachedActivate(TfProvider tfProvider) {
        AutoCloseableLock autoCloseableLockLock = AutoCloseableLock.lock(this.mReadWriteLock.readLock());
        try {
            checkHaveAdapter();
            TfActivateStatus tfActivateStatusNativeGetCachedActivate = nativeGetCachedActivate(this.tfAdapter, tfProvider.getNumber());
            if (autoCloseableLockLock != null) {
                autoCloseableLockLock.close();
            }
            return tfActivateStatusNativeGetCachedActivate;
        } catch (Throwable th) {
            if (autoCloseableLockLock != null) {
                try {
                    autoCloseableLockLock.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public long getReal() {
        AutoCloseableLock autoCloseableLockLock = AutoCloseableLock.lock(this.mReadWriteLock.readLock());
        try {
            checkHaveAdapter();
            long j7 = this.tfAdapter;
            if (autoCloseableLockLock != null) {
                autoCloseableLockLock.close();
            }
            return j7;
        } catch (Throwable th) {
            if (autoCloseableLockLock != null) {
                try {
                    autoCloseableLockLock.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Nullable
    @AnyThread
    @VisibleForTesting
    public ByteBuffer getTfRulesConfig() {
        AutoCloseableLock autoCloseableLockLock = AutoCloseableLock.lock(this.mReadWriteLock.readLock());
        try {
            checkHaveAdapter();
            ByteBuffer byteBufferNativeGetTfRulesConfig = nativeGetTfRulesConfig(this.tfAdapter);
            if (autoCloseableLockLock != null) {
                autoCloseableLockLock.close();
            }
            return byteBufferNativeGetTfRulesConfig;
        } catch (Throwable th) {
            if (autoCloseableLockLock != null) {
                try {
                    autoCloseableLockLock.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @AnyThread
    public boolean isEnabled(@NonNull TfTypeExt tfTypeExt) {
        AutoCloseableLock autoCloseableLockLock = AutoCloseableLock.lock(this.mReadWriteLock.readLock());
        try {
            checkHaveAdapter();
            boolean zNativeIsEnabled = nativeIsEnabled(this.tfAdapter, tfTypeExt.getNumber());
            if (autoCloseableLockLock != null) {
                autoCloseableLockLock.close();
            }
            return zNativeIsEnabled;
        } catch (Throwable th) {
            if (autoCloseableLockLock != null) {
                try {
                    autoCloseableLockLock.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @AnyThread
    public boolean isTfUrl(@NonNull String str) {
        AutoCloseableLock autoCloseableLockLock = AutoCloseableLock.lock(this.mReadWriteLock.readLock());
        try {
            checkHaveAdapter();
            boolean zNativeIsTfUrl = nativeIsTfUrl(this.tfAdapter, str);
            if (autoCloseableLockLock != null) {
                autoCloseableLockLock.close();
            }
            return zNativeIsTfUrl;
        } catch (Throwable th) {
            if (autoCloseableLockLock != null) {
                try {
                    autoCloseableLockLock.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @AnyThread
    public void onSyncModels() {
        AutoCloseableLock autoCloseableLockLock = AutoCloseableLock.lock(this.mReadWriteLock.readLock());
        try {
            checkHaveAdapter();
            nativeOnSyncModels(this.tfAdapter);
            if (autoCloseableLockLock != null) {
                autoCloseableLockLock.close();
            }
        } catch (Throwable th) {
            if (autoCloseableLockLock != null) {
                try {
                    autoCloseableLockLock.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @NonNull
    @AnyThread
    public TfQueryResp query(@NonNull TfQueryReq tfQueryReq) {
        AutoCloseableLock autoCloseableLockLock = AutoCloseableLock.lock(this.mReadWriteLock.readLock());
        try {
            checkHaveAdapter();
            TfQueryResp tfQueryRespNativeQuery = nativeQuery(this.tfAdapter, tfQueryReq);
            if (autoCloseableLockLock != null) {
                autoCloseableLockLock.close();
            }
            return tfQueryRespNativeQuery;
        } catch (Throwable th) {
            if (autoCloseableLockLock != null) {
                try {
                    autoCloseableLockLock.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @AnyThread
    public void removeTfChangeCallback(long j7) {
        AutoCloseableLock autoCloseableLockLock = AutoCloseableLock.lock(this.mReadWriteLock.readLock());
        try {
            checkHaveAdapter();
            nativeRemoveTfChangeCallback(this.tfAdapter, j7);
            if (autoCloseableLockLock != null) {
                autoCloseableLockLock.close();
            }
        } catch (Throwable th) {
            if (autoCloseableLockLock != null) {
                try {
                    autoCloseableLockLock.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @AnyThread
    public void setActivate(@NonNull TfActivateStatus tfActivateStatus) {
        AutoCloseableLock autoCloseableLockLock = AutoCloseableLock.lock(this.mReadWriteLock.readLock());
        try {
            checkHaveAdapter();
            nativeSetActivate(this.tfAdapter, tfActivateStatus);
            if (autoCloseableLockLock != null) {
                autoCloseableLockLock.close();
            }
        } catch (Throwable th) {
            if (autoCloseableLockLock != null) {
                try {
                    autoCloseableLockLock.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @AnyThread
    public void setTfRulesConfig(@NonNull ByteBuffer byteBuffer) {
        AutoCloseableLock autoCloseableLockLock = AutoCloseableLock.lock(this.mReadWriteLock.readLock());
        try {
            checkHaveAdapter();
            nativeSetTfRulesConfig(this.tfAdapter, byteBuffer);
            if (autoCloseableLockLock != null) {
                autoCloseableLockLock.close();
            }
        } catch (Throwable th) {
            if (autoCloseableLockLock != null) {
                try {
                    autoCloseableLockLock.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void shutdown() {
        AutoCloseableLock autoCloseableLockLock = AutoCloseableLock.lock(this.mReadWriteLock.readLock());
        try {
            checkHaveAdapter();
            if (autoCloseableLockLock != null) {
                autoCloseableLockLock.close();
            }
            autoCloseableLockLock = AutoCloseableLock.lock(this.mReadWriteLock.writeLock());
            try {
                if (!haveNativeAdapter()) {
                    if (autoCloseableLockLock != null) {
                        autoCloseableLockLock.close();
                    }
                } else {
                    nativeDestroy(this.tfAdapter);
                    this.tfAdapter = 0L;
                    if (autoCloseableLockLock != null) {
                        autoCloseableLockLock.close();
                    }
                }
            } finally {
            }
        } finally {
        }
    }

    @NonNull
    @AnyThread
    public TfTransformResp transform(@NonNull TfTransformReq tfTransformReq) {
        AutoCloseableLock autoCloseableLockLock = AutoCloseableLock.lock(this.mReadWriteLock.readLock());
        try {
            checkHaveAdapter();
            TfTransformResp tfTransformRespNativeTransform = nativeTransform(this.tfAdapter, tfTransformReq);
            if (autoCloseableLockLock != null) {
                autoCloseableLockLock.close();
            }
            return tfTransformRespNativeTransform;
        } catch (Throwable th) {
            if (autoCloseableLockLock != null) {
                try {
                    autoCloseableLockLock.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
