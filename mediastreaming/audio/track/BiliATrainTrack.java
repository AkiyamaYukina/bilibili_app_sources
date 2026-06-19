package com.bilibili.mediastreaming.audio.track;

import androidx.annotation.Keep;
import androidx.compose.runtime.MutableState;
import com.bilibili.mediastreaming.audio.starlight.BiliAudioMixer;
import com.bilibili.studio.comm.report.editor.bean.EditorAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import nh0.InterfaceC8094b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/BiliATrainTrack.class */
public final class BiliATrainTrack implements InterfaceC8094b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f65782b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.mediastreaming.audio.b f65781a = new com.bilibili.mediastreaming.audio.b("BiliATrainTrack");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.mediastreaming.audio.croutine.d f65783c = new com.bilibili.mediastreaming.audio.croutine.d("BiliATrainTrack");

    public BiliATrainTrack(@NotNull BiliAudioMixer biliAudioMixer, long j7, int i7) {
        long j8 = biliAudioMixer.f65773b;
        if (j8 != 0) {
            this.f65782b = nativeInit(j8, j7, i7);
        }
        long j9 = this.f65782b;
        long j10 = biliAudioMixer.f65773b;
        StringBuilder sbA = androidx.compose.runtime.snapshots.z.a(j9, "aTrainTrackHandle:", ", mixerHandle:");
        sbA.append(j10);
        J1.z.a(j7, ", sampleRate:", ", channels:", sbA);
        sbA.append(i7);
        InterfaceC8094b.b(this, sbA.toString(), null, 14);
    }

    public static Unit d(BiliATrainTrack biliATrainTrack, Ref.IntRef intRef) {
        Unit unit;
        InterfaceC8094b.b(biliATrainTrack, J1.M.a("aTrainTrackHandle is zero?:", ",start", biliATrainTrack.f65782b == 0), null, 14);
        long j7 = biliATrainTrack.f65782b;
        if (j7 == 0) {
            unit = Unit.INSTANCE;
        } else {
            intRef.element = biliATrainTrack.nativeStart(j7);
            unit = Unit.INSTANCE;
        }
        return unit;
    }

    public static Unit e(BiliATrainTrack biliATrainTrack, Ref.IntRef intRef) {
        Unit unit;
        InterfaceC8094b.b(biliATrainTrack, J1.M.a("aTrainTrackHandle is zero?:", ",stop", biliATrainTrack.f65782b == 0), null, 14);
        long j7 = biliATrainTrack.f65782b;
        if (j7 == 0) {
            unit = Unit.INSTANCE;
        } else {
            intRef.element = biliATrainTrack.nativeStop(j7);
            unit = Unit.INSTANCE;
        }
        return unit;
    }

    public static Unit f(BiliATrainTrack biliATrainTrack) {
        Unit unit;
        InterfaceC8094b.b(biliATrainTrack, J1.M.a("aTrainTrackHandle is zero?:", ",release", biliATrainTrack.f65782b == 0), null, 14);
        long j7 = biliATrainTrack.f65782b;
        if (j7 == 0) {
            unit = Unit.INSTANCE;
        } else {
            biliATrainTrack.nativeRelease(j7);
            biliATrainTrack.f65782b = 0L;
            unit = Unit.INSTANCE;
        }
        return unit;
    }

    public static Unit g(BiliATrainTrack biliATrainTrack, int i7, Ref.IntRef intRef) {
        Unit unit;
        InterfaceC8094b.b(biliATrainTrack, "aTrainTrackHandle is zero?:" + (biliATrainTrack.f65782b == 0) + ", intervalTimeMs:" + i7, null, 14);
        long j7 = biliATrainTrack.f65782b;
        if (j7 == 0) {
            unit = Unit.INSTANCE;
        } else {
            intRef.element = biliATrainTrack.nativeSetLoopIntervalTimeMs(j7, i7);
            unit = Unit.INSTANCE;
        }
        return unit;
    }

    @Keep
    private final native long nativeInit(long j7, long j8, int i7);

    @Keep
    private final native void nativeRelease(long j7);

    @Keep
    private final native int nativeSetLoopIntervalTimeMs(long j7, int i7);

    @Keep
    private final native int nativeStart(long j7);

    @Keep
    private final native int nativeStop(long j7);

    public final int h() {
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        final int i7 = 0;
        this.f65783c.f(EditorAction.ACTION_STOP, new Function0(i7, this, intRef) { // from class: com.bilibili.mediastreaming.audio.track.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f65881a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f65882b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f65883c;

            {
                this.f65881a = i7;
                this.f65882b = this;
                this.f65883c = intRef;
            }

            public final Object invoke() {
                switch (this.f65881a) {
                    case 0:
                        return BiliATrainTrack.e((BiliATrainTrack) this.f65882b, (Ref.IntRef) this.f65883c);
                    default:
                        ((Function1) this.f65882b).invoke(((MutableState) this.f65883c).getValue());
                        return Unit.INSTANCE;
                }
            }
        });
        return intRef.element;
    }

    @Override // nh0.InterfaceC8094b
    public final void logError(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.f65781a.logError(str, str2, str3, th);
    }

    @Override // nh0.InterfaceC8094b
    public final void logInfo(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.f65781a.logInfo(str, str2, str3, th);
    }

    @Override // nh0.InterfaceC8094b
    public final void logWarning(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.f65781a.logWarning(str, str2, str3, th);
    }
}
