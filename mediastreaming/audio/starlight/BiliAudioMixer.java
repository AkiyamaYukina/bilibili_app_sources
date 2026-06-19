package com.bilibili.mediastreaming.audio.starlight;

import G.f;
import androidx.annotation.Keep;
import com.bilibili.live.streaming.BiliLivePushLoader;
import com.bilibili.mediastreaming.audio.b;
import com.bilibili.mediastreaming.audio.output.q;
import com.bilibili.mediastreaming.audio.track.Y;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import nh0.InterfaceC8094b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/starlight/BiliAudioMixer.class */
public final class BiliAudioMixer implements InterfaceC8094b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f65773b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f65772a = new b("BiliAudioMixer");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<String, q> f65774c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, Y> f65775d = new LinkedHashMap();

    public BiliAudioMixer() {
        InterfaceC8094b.b(this, "BiliAudioMixer init!", null, 14);
        BiliLivePushLoader.INSTANCE.load();
        long j7 = this.f65773b;
        if (j7 != 0) {
            nativeRelease(j7);
        }
        this.f65773b = 0L;
        this.f65773b = nativeInit();
    }

    public static Integer d(BiliAudioMixer biliAudioMixer) {
        int iNativeClearAudioTracks = biliAudioMixer.nativeClearAudioTracks(biliAudioMixer.f65773b);
        ((LinkedHashMap) biliAudioMixer.f65775d).clear();
        InterfaceC8094b.b(biliAudioMixer, "clearInputAudioTracks, ret:" + iNativeClearAudioTracks, null, 14);
        return Integer.valueOf(iNativeClearAudioTracks);
    }

    public static Unit e(BiliAudioMixer biliAudioMixer) {
        InterfaceC8094b.b(biliAudioMixer, "release, mixerHandle is zero?:" + (biliAudioMixer.f65773b == 0), null, 14);
        biliAudioMixer.nativeRelease(biliAudioMixer.f65773b);
        biliAudioMixer.f65773b = 0L;
        if (!biliAudioMixer.f65774c.isEmpty()) {
            InterfaceC8094b.a(biliAudioMixer, "audioOutputs no release....", null, null, 14);
        }
        if (!biliAudioMixer.f65775d.isEmpty()) {
            InterfaceC8094b.a(biliAudioMixer, "audioTracks no release....", null, null, 14);
        }
        InterfaceC8094b.b(biliAudioMixer, f.a(biliAudioMixer.f65774c.size(), biliAudioMixer.f65775d.size(), "audioOutputs size:", ", audioTracks size:"), null, 14);
        return Unit.INSTANCE;
    }

    public static Integer f(BiliAudioMixer biliAudioMixer) {
        int iNativeClearOutputSinks = biliAudioMixer.nativeClearOutputSinks(biliAudioMixer.f65773b);
        ((LinkedHashMap) biliAudioMixer.f65774c).clear();
        InterfaceC8094b.b(biliAudioMixer, "clearOutputAudioSinks, ret:" + iNativeClearOutputSinks, null, 14);
        return Integer.valueOf(iNativeClearOutputSinks);
    }

    public static Unit g(BiliAudioMixer biliAudioMixer, String str) {
        InterfaceC8094b.b(biliAudioMixer, "setDebugCacheDirPath:" + str, null, 14);
        biliAudioMixer.nativeSetDebugCacheDirPath(biliAudioMixer.f65773b, str);
        return Unit.INSTANCE;
    }

    @Keep
    private final native int nativeAddAudioTrack(long j7, long j8);

    @Keep
    private final native int nativeAddOutputSink(long j7, long j8);

    @Keep
    private final native int nativeClearAudioTracks(long j7);

    @Keep
    private final native int nativeClearOutputSinks(long j7);

    @Keep
    private final native long nativeInit();

    @Keep
    private final native void nativeRelease(long j7);

    @Keep
    private final native int nativeRemoveAudioTrack(long j7, String str);

    @Keep
    private final native int nativeRemoveOutputSink(long j7, String str);

    @Keep
    private final native void nativeSetDebugCacheDirPath(long j7, String str);

    public final int h(@NotNull Y y6) {
        int iNativeAddAudioTrack;
        Integer numValueOf;
        if (y6.getTrackHandleName().length() == 0 || y6.getTrackHandlePtr() == 0) {
            InterfaceC8094b.a(this, "inputTrack name is empty.... or inputTrack handle is zero!!!", null, null, 14);
            return -1;
        }
        if (this.f65773b == 0) {
            numValueOf = null;
        } else {
            if (this.f65775d.containsKey(y6.getTrackHandleName())) {
                InterfaceC8094b.a(this, "in audioTracks already trackName:" + y6.getTrackHandleName() + ", obj:" + y6, null, null, 14);
                iNativeAddAudioTrack = -1;
            } else {
                InterfaceC8094b.b(this, "addInputAudioTrack, inputTrack:" + y6.getTrackHandleName() + ", obj:" + y6, null, 14);
                this.f65775d.put(y6.getTrackHandleName(), y6);
                iNativeAddAudioTrack = nativeAddAudioTrack(this.f65773b, y6.getTrackHandlePtr());
            }
            numValueOf = Integer.valueOf(iNativeAddAudioTrack);
        }
        return numValueOf != null ? numValueOf.intValue() : 0;
    }

    public final int i(@NotNull q qVar) {
        int iNativeAddOutputSink;
        Integer numValueOf;
        if (qVar.getOutputHandleName().length() == 0 || qVar.getOutputHandle() == 0) {
            InterfaceC8094b.a(this, "outputSink name is empty.... or outputSink handle is zero!!!", null, null, 14);
            return -1;
        }
        if (this.f65773b == 0) {
            numValueOf = null;
        } else {
            if (this.f65774c.containsKey(qVar.getOutputHandleName())) {
                InterfaceC8094b.a(this, "in audioOutputs already outputName:" + qVar.getOutputHandleName() + ", obj:" + qVar, null, null, 14);
                iNativeAddOutputSink = -1;
            } else {
                InterfaceC8094b.b(this, "addOutputAudioSink outputSink name:" + qVar.getOutputHandleName() + ", obj:" + qVar, null, 14);
                this.f65774c.put(qVar.getOutputHandleName(), qVar);
                iNativeAddOutputSink = nativeAddOutputSink(this.f65773b, qVar.getOutputHandle());
            }
            numValueOf = Integer.valueOf(iNativeAddOutputSink);
        }
        return numValueOf != null ? numValueOf.intValue() : 0;
    }

    public final int j(@NotNull Y y6) {
        Integer numValueOf;
        int i7 = -1;
        if (y6.getTrackHandleName().length() == 0 || y6.getTrackHandlePtr() == 0) {
            InterfaceC8094b.a(this, "inputTrack name is empty.... or inputTrack handle is zero!!!", null, null, 14);
            return -1;
        }
        if (this.f65773b == 0) {
            numValueOf = null;
        } else {
            if (this.f65775d.containsKey(y6.getTrackHandleName())) {
                InterfaceC8094b.b(this, "removeInputAudioTrack, inputTrack:" + y6.getTrackHandleName() + ", obj:" + y6, null, 14);
                int iNativeRemoveAudioTrack = nativeRemoveAudioTrack(this.f65773b, y6.getTrackHandleName());
                i7 = iNativeRemoveAudioTrack;
                if (iNativeRemoveAudioTrack == 0) {
                    this.f65775d.remove(y6.getTrackHandleName());
                    i7 = iNativeRemoveAudioTrack;
                }
            }
            numValueOf = Integer.valueOf(i7);
        }
        return numValueOf != null ? numValueOf.intValue() : 0;
    }

    public final int k(@NotNull q qVar) {
        int i7;
        Integer numValueOf;
        if (qVar.getOutputHandleName().length() == 0 || qVar.getOutputHandle() == 0) {
            InterfaceC8094b.a(this, "outputSink name is empty.... or outputSink handle is zero!!!", null, null, 14);
            return -1;
        }
        if (this.f65773b == 0) {
            numValueOf = null;
        } else {
            if (this.f65774c.containsKey(qVar.getOutputHandleName())) {
                int iNativeRemoveOutputSink = nativeRemoveOutputSink(this.f65773b, qVar.getOutputHandleName());
                InterfaceC8094b.b(this, "removeOutputAudioSink outputSink name:" + qVar.getOutputHandleName() + ", obj:" + qVar + ", result:" + iNativeRemoveOutputSink, null, 14);
                i7 = iNativeRemoveOutputSink;
                if (iNativeRemoveOutputSink == 0) {
                    this.f65774c.remove(qVar.getOutputHandleName());
                    i7 = iNativeRemoveOutputSink;
                }
            } else {
                i7 = -1;
            }
            numValueOf = Integer.valueOf(i7);
        }
        int iIntValue = -1;
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        }
        return iIntValue;
    }

    @Override // nh0.InterfaceC8094b
    public final void logError(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.f65772a.logError(str, str2, str3, th);
    }

    @Override // nh0.InterfaceC8094b
    public final void logInfo(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.f65772a.logInfo(str, str2, str3, th);
    }

    @Override // nh0.InterfaceC8094b
    public final void logWarning(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.f65772a.logWarning(str, str2, str3, th);
    }
}
