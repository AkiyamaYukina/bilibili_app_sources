package com.bilibili.mediastreaming.flashpoint;

import androidx.annotation.Keep;
import com.bilibili.mediastreaming.flashpoint.IBiliFlashpointLoggerObserver;
import com.bilibili.mediastreaming.flashpoint.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/BiliCallbackJavaFlashpoint.class */
public class BiliCallbackJavaFlashpoint implements i, h.a {

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    private static final String TAG = "BiliCallbackJavaFlashpoint";
    private final g $$delegate_0;
    private long handle;
    private final boolean mixAudioVideo;

    @NotNull
    private final String protocolType;

    @Nullable
    private final String tag;

    @Nullable
    private String uri;
    private final boolean withFileHeader;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/BiliCallbackJavaFlashpoint$a.class */
    public static final class a {
    }

    public BiliCallbackJavaFlashpoint(@NotNull String str, boolean z6, boolean z7, @Nullable String str2) {
        this.$$delegate_0 = new g(str2 == null ? TAG : str2);
        this.protocolType = str;
        this.withFileHeader = z6;
        this.mixAudioVideo = z7;
        this.tag = str2;
    }

    public /* synthetic */ BiliCallbackJavaFlashpoint(String str, boolean z6, boolean z7, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z6, z7, (i7 & 8) != 0 ? null : str2);
    }

    @Keep
    private final native long nativeCreate(BiliCallbackJavaFlashpoint biliCallbackJavaFlashpoint, String str, boolean z6, boolean z7);

    @Keep
    private final native void nativeDestroy(long j7);

    @Override // com.bilibili.mediastreaming.flashpoint.h.a
    public long create(@NotNull String str) {
        long j7 = this.handle;
        if (j7 != 0) {
            return j7;
        }
        this.uri = str;
        long jNativeCreate = nativeCreate(this, this.protocolType, this.withFileHeader, this.mixAudioVideo);
        this.handle = jNativeCreate;
        logInfo(androidx.core.content.c.b(jNativeCreate, "create, uri:", str, ", handle:"), null, null, null);
        return this.handle;
    }

    public void destroy() {
        logInfo(com.bilibili.app.comm.bh.x5.b.a("destroy, handle is zero?:", this.handle == 0), null, null, null);
        long j7 = this.handle;
        if (j7 == 0) {
            return;
        }
        nativeDestroy(j7);
        this.handle = 0L;
    }

    public final long getHandle() {
        return this.handle;
    }

    public final boolean getMixAudioVideo() {
        return this.mixAudioVideo;
    }

    @NotNull
    public final String getProtocolType() {
        return this.protocolType;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    public final boolean getWithFileHeader() {
        return this.withFileHeader;
    }

    public void logDebug(@NotNull Function0<String> function0, @Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        this.$$delegate_0.getClass();
    }

    @Override // com.bilibili.mediastreaming.flashpoint.i
    public void logError(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.$$delegate_0.logError(str, str2, str3, th);
    }

    @Override // com.bilibili.mediastreaming.flashpoint.i
    public void logInfo(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.$$delegate_0.logInfo(str, str2, str3, th);
    }

    public void logVerbose(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        g gVar = this.$$delegate_0;
        if (str3 == null) {
            String str4 = gVar.f66026a;
            str3 = str4;
            if (str2 != null) {
                str3 = B0.a.a(str4, ":", str2);
            }
        } else {
            gVar.getClass();
        }
        f.a(IBiliFlashpointLoggerObserver.Severity.LS_VERBOSE, str3, str, th);
    }

    @Override // com.bilibili.mediastreaming.flashpoint.i
    public void logWarning(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.$$delegate_0.logWarning(str, str2, str3, th);
    }

    @Keep
    public boolean onConnect() {
        return false;
    }

    @Keep
    public boolean onDisConnect() {
        return false;
    }

    @Keep
    public boolean onIsConnected() {
        return false;
    }

    @Keep
    public boolean onNativeStartDeliver() {
        return false;
    }

    @Keep
    public void onNativeStopDeliver() {
    }

    @Keep
    public boolean onSendPacket(int i7, @NotNull byte[] bArr) {
        return false;
    }

    public final void setHandle(long j7) {
        this.handle = j7;
    }

    public final void setUri(@Nullable String str) {
        this.uri = str;
    }
}
