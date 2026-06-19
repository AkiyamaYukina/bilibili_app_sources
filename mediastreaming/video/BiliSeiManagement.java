package com.bilibili.mediastreaming.video;

import com.bilibili.mediastreaming.enums.BiliVideoCodec;
import com.bilibili.mediastreaming.flashpoint.g;
import com.bilibili.mediastreaming.flashpoint.i;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/video/BiliSeiManagement.class */
public final class BiliSeiManagement implements AutoCloseable, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f66031a = new g("BiliSeiManagement");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f66032b = nativeCreate();

    private final native void nativeAppendData(long j7, String str, byte[] bArr);

    private final native long nativeCreate();

    private final native void nativeDestroy(long j7);

    private final native void nativeDisable(long j7);

    private final native void nativeEnable(long j7);

    private final native byte[][] nativeGetSeiData(long j7, long j8, boolean z6, int i7);

    @Override // java.lang.AutoCloseable
    public final void close() {
        long j7 = this.f66032b;
        if (j7 == 0) {
            return;
        }
        nativeDisable(j7);
        nativeDestroy(this.f66032b);
        this.f66032b = 0L;
    }

    public final void d(@NotNull String str, @NotNull byte[] bArr) {
        long j7 = this.f66032b;
        if (j7 == 0) {
            return;
        }
        nativeAppendData(j7, str, bArr);
    }

    public final void e() {
        long j7 = this.f66032b;
        if (j7 == 0) {
            return;
        }
        nativeDisable(j7);
    }

    public final void f() {
        long j7 = this.f66032b;
        if (j7 == 0) {
            return;
        }
        nativeEnable(j7);
    }

    @Nullable
    public final List<BiliSeiBuffer> g(@NotNull BiliVideoCodec biliVideoCodec) {
        ArrayList arrayList;
        if (this.f66032b == 0) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            byte[][] bArrNativeGetSeiData = nativeGetSeiData(this.f66032b, 0L, true, biliVideoCodec.ordinal());
            if (bArrNativeGetSeiData != null) {
                for (byte[] bArr : bArrNativeGetSeiData) {
                    BiliSeiBuffer biliSeiBuffer = new BiliSeiBuffer();
                    biliSeiBuffer.buffer = bArr;
                    arrayList2.add(biliSeiBuffer);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    @Override // com.bilibili.mediastreaming.flashpoint.i
    public final void logError(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.f66031a.logError(str, str2, str3, th);
    }

    @Override // com.bilibili.mediastreaming.flashpoint.i
    public final void logInfo(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.f66031a.logInfo(str, str2, str3, th);
    }

    @Override // com.bilibili.mediastreaming.flashpoint.i
    public final void logWarning(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.f66031a.logWarning(str, str2, str3, th);
    }
}
