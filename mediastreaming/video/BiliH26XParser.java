package com.bilibili.mediastreaming.video;

import com.bilibili.app.comm.bh.x5.b;
import com.bilibili.mediastreaming.enums.BiliVideoCodec;
import com.bilibili.mediastreaming.flashpoint.g;
import com.bilibili.mediastreaming.flashpoint.i;
import com.bilibili.mediastreaming.packet.BiliVideoEncoderPacket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/video/BiliH26XParser.class */
public final class BiliH26XParser implements AutoCloseable, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f66027a = new g("BiliH26XParser");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f66028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f66029c;

    public BiliH26XParser(@NotNull BiliVideoCodec biliVideoCodec, double d7, int i7, @NotNull String str) {
        this.f66028b = str;
        logInfo("init, videoCodec:" + biliVideoCodec + ", outputVideoFrameRate:" + d7 + ", bFrameDelayFrames:" + i7 + ", codecName:" + str, null, null, null);
        this.f66029c = nativeCreate(biliVideoCodec.ordinal(), d7, i7, str);
    }

    private final native long nativeCreate(int i7, double d7, int i8, String str);

    private final native void nativeDestroy(long j7);

    private final native BiliVideoEncoderPacket[] nativeFeedPacketData(long j7, BiliSeiBuffer[] biliSeiBufferArr, byte[] bArr, boolean z6, long j8);

    private final native BiliVideoEncoderPacket[] nativeFlushBuffer(long j7);

    private final native BiliVideoEncoderPacket[] nativeReset(long j7, int i7, double d7, int i8, String str);

    @Override // java.lang.AutoCloseable
    public final void close() {
        logInfo(b.a("destroy, parserHandle is zero:", this.f66029c == 0), null, null, null);
        long j7 = this.f66029c;
        if (j7 == 0) {
            return;
        }
        nativeDestroy(j7);
        this.f66029c = 0L;
    }

    @Nullable
    public final BiliVideoEncoderPacket[] d(@Nullable BiliSeiBuffer[] biliSeiBufferArr, @NotNull byte[] bArr, boolean z6, long j7) {
        long j8 = this.f66029c;
        if (j8 == 0) {
            return null;
        }
        return nativeFeedPacketData(j8, biliSeiBufferArr, bArr, z6, j7);
    }

    @Nullable
    public final BiliVideoEncoderPacket[] e(@NotNull BiliVideoCodec biliVideoCodec, double d7, int i7, @NotNull String str) {
        long j7 = this.f66029c;
        if (j7 == 0) {
            return null;
        }
        return nativeReset(j7, biliVideoCodec.ordinal(), d7, i7, str);
    }

    @Override // com.bilibili.mediastreaming.flashpoint.i
    public final void logError(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.f66027a.logError(str, str2, str3, th);
    }

    @Override // com.bilibili.mediastreaming.flashpoint.i
    public final void logInfo(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.f66027a.logInfo(str, str2, str3, th);
    }

    @Override // com.bilibili.mediastreaming.flashpoint.i
    public final void logWarning(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.f66027a.logWarning(str, str2, str3, th);
    }
}
