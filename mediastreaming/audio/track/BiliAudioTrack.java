package com.bilibili.mediastreaming.audio.track;

import androidx.annotation.Keep;
import androidx.appcompat.widget.C3259x;
import com.bilibili.live.streaming.BiliLivePushLoader;
import com.bilibili.mediastreaming.audio.IBiliAudioLoggerObserver;
import java.nio.ByteBuffer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import nh0.InterfaceC8094b;
import oh0.InterfaceC8217a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/BiliAudioTrack.class */
public class BiliAudioTrack implements Y, InterfaceC8094b {

    @NotNull
    public static final a Companion = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.mediastreaming.audio.b f65805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f65806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f65807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f65808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public com.bilibili.mediastreaming.audio.croutine.d f65809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f65810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f65811g;

    @Nullable
    public InterfaceC8217a h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/BiliAudioTrack$a.class */
    public static final class a {
    }

    /* JADX INFO: renamed from: com.bilibili.mediastreaming.audio.track.BiliAudioTrack$onAudioLevel$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/BiliAudioTrack$onAudioLevel$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final double $left;
        final double $right;
        int label;
        final BiliAudioTrack this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BiliAudioTrack biliAudioTrack, double d7, double d8, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = biliAudioTrack;
            this.$left = d7;
            this.$right = d8;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$left, this.$right, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC8217a interfaceC8217a = this.this$0.h;
            if (interfaceC8217a != null) {
                interfaceC8217a.onAudioLevel(this.$left, this.$right);
            }
            return Unit.INSTANCE;
        }
    }

    public BiliAudioTrack(@NotNull String str, boolean z6, @Nullable String str2) {
        this.f65805a = new com.bilibili.mediastreaming.audio.b(str2 == null ? str : str2);
        this.f65806b = str;
        this.f65807c = str2;
        this.f65809e = new com.bilibili.mediastreaming.audio.croutine.d(str2 == null ? "BiliAudioTrack" : str2);
        com.bilibili.mediastreaming.audio.a.a(IBiliAudioLoggerObserver.Severity.LS_INFO, "BiliAudioTrack", str + ", isNeedInit:" + z6 + " ctr----", null);
        BiliLivePushLoader.INSTANCE.load();
        if (z6) {
            InterfaceC8094b.b(this, "initHandle, handle is zero?:" + (this.f65808d == 0), "BiliAudioTrack", 10);
            long j7 = this.f65808d;
            if (j7 != 0) {
                nativeRelease(j7);
                this.f65808d = 0L;
            }
            this.f65808d = nativeInit(str, this);
        }
    }

    public /* synthetic */ BiliAudioTrack(String str, boolean z6, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? true : z6, (i7 & 4) != 0 ? null : str2);
    }

    public static Integer d(BiliAudioTrack biliAudioTrack, boolean z6) {
        int iNativeSetPause = biliAudioTrack.nativeSetPause(biliAudioTrack.f65808d, z6);
        InterfaceC8094b.b(biliAudioTrack, "setPause, handle is zero?:" + (biliAudioTrack.f65808d == 0) + ", ret:" + iNativeSetPause, "BiliAudioTrack", 10);
        return Integer.valueOf(iNativeSetPause);
    }

    public static Unit e(BiliAudioTrack biliAudioTrack) {
        InterfaceC8094b.b(biliAudioTrack, "release handle is zero?:" + (biliAudioTrack.f65808d == 0), "BiliAudioTrack", 10);
        biliAudioTrack.nativeStopCallback(biliAudioTrack.f65808d);
        biliAudioTrack.unRegisterAudioLevelCallback();
        biliAudioTrack.nativeRelease(biliAudioTrack.f65808d);
        biliAudioTrack.f65808d = 0L;
        return Unit.INSTANCE;
    }

    public static Boolean f(BiliAudioTrack biliAudioTrack) {
        boolean zNativeIsPause = biliAudioTrack.nativeIsPause(biliAudioTrack.f65808d);
        InterfaceC8094b.b(biliAudioTrack, com.bilibili.app.comm.bh.x5.a.a("isPause, handle is zero?:", ", ret:", biliAudioTrack.f65808d == 0, zNativeIsPause), "BiliAudioTrack", 10);
        return Boolean.valueOf(zNativeIsPause);
    }

    public static Float g(BiliAudioTrack biliAudioTrack) {
        float fNativeGetRightVolume = biliAudioTrack.nativeGetRightVolume(biliAudioTrack.f65808d);
        InterfaceC8094b.b(biliAudioTrack, "getRightVolume, handle is zero?:" + (biliAudioTrack.f65808d == 0) + ", ret:" + fNativeGetRightVolume, "BiliAudioTrack", 10);
        return Float.valueOf(fNativeGetRightVolume);
    }

    public static Integer h(BiliAudioTrack biliAudioTrack, ByteBuffer byteBuffer) {
        return Integer.valueOf(biliAudioTrack.nativeSetByteBuffer(biliAudioTrack.f65808d, byteBuffer));
    }

    public static Unit i(BiliAudioTrack biliAudioTrack, long j7) {
        biliAudioTrack.nativeSendAudioEndOfStream(biliAudioTrack.f65808d, j7);
        return Unit.INSTANCE;
    }

    public static Integer j(float f7, BiliAudioTrack biliAudioTrack) {
        int iNativeSetRightVolume;
        if (f7 < 0.0f || f7 > 1.0f) {
            InterfaceC8094b.a(biliAudioTrack, G0.g.a(f7, "volume must [0.0f, 1.0f]. not is:"), "BiliAudioTrack", null, 10);
            iNativeSetRightVolume = -1;
        } else {
            InterfaceC8094b.b(biliAudioTrack, "setRightVolume, handle is zero?:" + (biliAudioTrack.f65808d == 0) + ", volume:" + f7, "BiliAudioTrack", 10);
            iNativeSetRightVolume = biliAudioTrack.nativeSetRightVolume(biliAudioTrack.f65808d, f7);
        }
        return Integer.valueOf(iNativeSetRightVolume);
    }

    public static Integer k(BiliAudioTrack biliAudioTrack, byte[] bArr, int i7, int i8, int i9, long j7) {
        return Integer.valueOf(biliAudioTrack.nativeSendAudioS16(biliAudioTrack.f65808d, bArr, i7, i8, i9, j7));
    }

    public static Unit l(BiliAudioTrack biliAudioTrack) {
        InterfaceC8094b.b(biliAudioTrack, "stopCallback, handle is zero?:" + (biliAudioTrack.f65808d == 0), "BiliAudioTrack", 10);
        biliAudioTrack.nativeStopCallback(biliAudioTrack.f65808d);
        return Unit.INSTANCE;
    }

    public static Integer m(BiliAudioTrack biliAudioTrack, int i7, int i8, int i9, int i10, long j7) {
        return Integer.valueOf(biliAudioTrack.nativeSendLenF32(biliAudioTrack.f65808d, i7, i8, i9, i10, j7));
    }

    public static Unit n(BiliAudioTrack biliAudioTrack) {
        biliAudioTrack.nativeGetLRLevelFullRange(biliAudioTrack.f65808d);
        return Unit.INSTANCE;
    }

    @Keep
    private final native void nativeClearCache(long j7);

    @Keep
    private final native void nativeEnableDebug(long j7);

    @Keep
    private final native boolean nativeGetLRLevelFullRange(long j7);

    @Keep
    private final native float nativeGetLeftVolume(long j7);

    @Keep
    private final native float nativeGetRightVolume(long j7);

    @Keep
    private final native long nativeGetTrackRemainingFrames(long j7);

    @Keep
    private final native long nativeInit(String str, BiliAudioTrack biliAudioTrack);

    @Keep
    private final native boolean nativeIsPause(long j7);

    @Keep
    private final native void nativeRelease(long j7);

    @Keep
    private final native boolean nativeReset(long j7);

    @Keep
    private final native void nativeSendAudioEndOfStream(long j7, long j8);

    @Keep
    private final native int nativeSendAudioF32(long j7, byte[] bArr, int i7, int i8, int i9, long j8);

    @Keep
    private final native int nativeSendAudioS16(long j7, byte[] bArr, int i7, int i8, int i9, long j8);

    @Keep
    private final native int nativeSendLenF32(long j7, int i7, int i8, int i9, int i10, long j8);

    @Keep
    private final native int nativeSendLenS16(long j7, int i7, int i8, int i9, int i10, long j8);

    @Keep
    private final native int nativeSetByteBuffer(long j7, ByteBuffer byteBuffer);

    @Keep
    private final native int nativeSetLeftVolume(long j7, float f7);

    @Keep
    private final native int nativeSetPause(long j7, boolean z6);

    @Keep
    private final native boolean nativeSetPrepareDataDelayMs(long j7, int i7);

    @Keep
    private final native int nativeSetRightVolume(long j7, float f7);

    @Keep
    private final native void nativeStartCallback(long j7);

    @Keep
    private final native void nativeStopCallback(long j7);

    public static Unit o(BiliAudioTrack biliAudioTrack) {
        InterfaceC8094b.b(biliAudioTrack, "clearCache, handle is zero?:" + (biliAudioTrack.f65808d == 0), "BiliAudioTrack", 10);
        biliAudioTrack.nativeClearCache(biliAudioTrack.f65808d);
        return Unit.INSTANCE;
    }

    public static Integer p(BiliAudioTrack biliAudioTrack, byte[] bArr, int i7, int i8, int i9, long j7) {
        return Integer.valueOf(biliAudioTrack.nativeSendAudioF32(biliAudioTrack.f65808d, bArr, i7, i8, i9, j7));
    }

    public static Boolean q(BiliAudioTrack biliAudioTrack) {
        InterfaceC8094b.b(biliAudioTrack, com.bilibili.ad.reward.test.K.a("name:", biliAudioTrack.f65806b, ", reset, handle is zero?:", biliAudioTrack.f65808d == 0), "BiliAudioTrack", 10);
        return Boolean.valueOf(biliAudioTrack.nativeReset(biliAudioTrack.f65808d));
    }

    public static Unit r(BiliAudioTrack biliAudioTrack) {
        biliAudioTrack.nativeEnableDebug(biliAudioTrack.f65808d);
        return Unit.INSTANCE;
    }

    public static Boolean s(BiliAudioTrack biliAudioTrack, int i7) {
        InterfaceC8094b.b(biliAudioTrack, "setPrepareDataDelayMs, handle is zero?:" + (biliAudioTrack.f65808d == 0) + ", delayMs:" + i7, "BiliAudioTrack", 10);
        return Boolean.valueOf(biliAudioTrack.nativeSetPrepareDataDelayMs(biliAudioTrack.f65808d, i7));
    }

    public static Integer t(BiliAudioTrack biliAudioTrack, int i7, int i8, int i9, int i10, long j7) {
        return Integer.valueOf(biliAudioTrack.nativeSendLenS16(biliAudioTrack.f65808d, i7, i8, i9, i10, j7));
    }

    public static Float u(BiliAudioTrack biliAudioTrack) {
        float fNativeGetLeftVolume = biliAudioTrack.nativeGetLeftVolume(biliAudioTrack.f65808d);
        InterfaceC8094b.b(biliAudioTrack, "getLeftVolume, handle is zero?:" + (biliAudioTrack.f65808d == 0) + ", ret:" + fNativeGetLeftVolume, "BiliAudioTrack", 10);
        return Float.valueOf(fNativeGetLeftVolume);
    }

    public static Long v(BiliAudioTrack biliAudioTrack) {
        long jNativeGetTrackRemainingFrames = biliAudioTrack.nativeGetTrackRemainingFrames(biliAudioTrack.f65808d);
        InterfaceC8094b.b(biliAudioTrack, "getTrackRemainingFrames, handle is zero?:" + (biliAudioTrack.f65808d == 0) + ", ret:" + jNativeGetTrackRemainingFrames, "BiliAudioTrack", 10);
        return Long.valueOf(jNativeGetTrackRemainingFrames);
    }

    public static Unit w(BiliAudioTrack biliAudioTrack) {
        InterfaceC8094b.b(biliAudioTrack, "startCallback, handle is zero?:" + (biliAudioTrack.f65808d == 0), "BiliAudioTrack", 10);
        biliAudioTrack.nativeStartCallback(biliAudioTrack.f65808d);
        return Unit.INSTANCE;
    }

    public static Integer x(float f7, BiliAudioTrack biliAudioTrack) {
        int iNativeSetLeftVolume;
        if (f7 < 0.0f || f7 > 1.0f) {
            InterfaceC8094b.a(biliAudioTrack, G0.g.a(f7, "volume must [0.0f, 1.0f]. not is:"), "BiliAudioTrack", null, 10);
            iNativeSetLeftVolume = -1;
        } else {
            InterfaceC8094b.b(biliAudioTrack, "setLeftVolume, handle is zero?:" + (biliAudioTrack.f65808d == 0) + ", volume:" + f7, "BiliAudioTrack", 10);
            iNativeSetLeftVolume = biliAudioTrack.nativeSetLeftVolume(biliAudioTrack.f65808d, f7);
        }
        return Integer.valueOf(iNativeSetLeftVolume);
    }

    public final void clearCache() {
        com.bilibili.mediastreaming.audio.croutine.d.e(this.f65809e, new com.bilibili.gripper.d(this, 2));
    }

    public void enableDebug() {
        com.bilibili.mediastreaming.audio.croutine.d.e(this.f65809e, new com.bilibili.lib.fasthybrid.packages.a(this, 1));
    }

    public final long getAudioTrackHandle() {
        return this.f65808d;
    }

    public final long getHandle() {
        return this.f65808d;
    }

    public float getLeftVolume() {
        Float f7 = (Float) runOnAudioNativeCoroutineInvoke("getLeftVolume", new Ut0.d(this, 2));
        return f7 != null ? f7.floatValue() : 0.0f;
    }

    @Nullable
    public final String getLogTag() {
        return this.f65807c;
    }

    @NotNull
    public final com.bilibili.mediastreaming.audio.croutine.d getMAudioTrackCoroutine() {
        return this.f65809e;
    }

    @NotNull
    public final String getName() {
        return this.f65806b;
    }

    public float getRightVolume() {
        Float f7 = (Float) runOnAudioNativeCoroutineInvoke("getRightVolume", new com.bilibili.biligame.widget.user.dialog.h(this, 2));
        return f7 != null ? f7.floatValue() : 0.0f;
    }

    @Override // com.bilibili.mediastreaming.audio.track.Y
    @NotNull
    public String getTrackHandleName() {
        return this.f65806b;
    }

    @Override // com.bilibili.mediastreaming.audio.track.Y
    public long getTrackHandlePtr() {
        return this.f65808d;
    }

    public long getTrackRemainingFrames() {
        Long l7 = (Long) runOnAudioNativeCoroutineInvoke("getTrackRemainingFrames", new Ty0.a(this, 3));
        return l7 != null ? l7.longValue() : 0L;
    }

    public final boolean isChildReleaseCoroutine() {
        return this.f65811g;
    }

    public boolean isPause() {
        Boolean bool = (Boolean) runOnAudioNativeCoroutineInvoke("isPause", new com.bilibili.bililive.room.ui.roomv3.tab.interaction.u(this, 2));
        return bool != null ? bool.booleanValue() : false;
    }

    public void logDebug(@NotNull Function0<String> function0, @Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        this.f65805a.d(function0, str, str2, th);
    }

    @Override // nh0.InterfaceC8094b
    public void logError(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.f65805a.logError(str, str2, str3, th);
    }

    @Override // nh0.InterfaceC8094b
    public void logInfo(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.f65805a.logInfo(str, str2, str3, th);
    }

    public void logVerbose(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.f65805a.e(str, str2, str3, th);
    }

    @Override // nh0.InterfaceC8094b
    public void logWarning(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.f65805a.logWarning(str, str2, str3, th);
    }

    @Keep
    public final void onAudioLevel(double d7, double d8) {
        com.bilibili.mediastreaming.audio.croutine.d.i(this.f65809e, new AnonymousClass1(this, d7, d8, null));
    }

    @Keep
    public void onAudioStartSpending() {
    }

    @Keep
    public void onAudioTotalConsumeFrames(long j7) {
    }

    @Keep
    public void onAudioTotalDropFrames(long j7) {
    }

    @Keep
    public void onAudioTotalProduceFrames(long j7) {
    }

    @Keep
    public void onBufferConsumeEnd() {
    }

    public void registerAudioLevelCallback(@NotNull final InterfaceC8217a interfaceC8217a, final long j7) {
        InterfaceC8094b.b(this, "registerAudioLevelCallback,callback:" + interfaceC8217a + ", callbackMs:" + j7, "BiliAudioTrack", 10);
        com.bilibili.mediastreaming.audio.croutine.d.e(this.f65809e, new Function0(this, interfaceC8217a, j7) { // from class: com.bilibili.mediastreaming.audio.track.L

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliAudioTrack f65840a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final InterfaceC8217a f65841b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f65842c;

            {
                this.f65840a = this;
                this.f65841b = interfaceC8217a;
                this.f65842c = j7;
            }

            public final Object invoke() {
                Unit unit;
                BiliAudioTrack biliAudioTrack = this.f65840a;
                if (biliAudioTrack.h != null || biliAudioTrack.f65810f) {
                    unit = Unit.INSTANCE;
                } else {
                    biliAudioTrack.h = this.f65841b;
                    biliAudioTrack.f65810f = true;
                    com.bilibili.mediastreaming.audio.croutine.d.h(biliAudioTrack.f65809e, new BiliAudioTrack$doGetAudioLevel$1(biliAudioTrack, this.f65842c, null));
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        });
    }

    public void release() {
        runOnAudioNativeCoroutineInvoke("release", new com.bilibili.lib.fasthybrid.packages.b(this, 1));
        if (this.f65811g) {
            return;
        }
        InterfaceC8094b.b(this, "because isChildReleaseCoroutine is false so, BiliAudioTrack mAudioTrackCoroutine.release() ", null, 14);
        this.f65809e.d();
    }

    public boolean reset() {
        Boolean bool = (Boolean) runOnAudioNativeCoroutineInvoke("reset", new P(this, 0));
        return bool != null ? bool.booleanValue() : false;
    }

    @Nullable
    public final <T> T runOnAudioNativeCoroutineInvoke(@NotNull String str, @NotNull final Function0<? extends T> function0) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        this.f65809e.f(str, new Function0(this, objectRef, function0) { // from class: com.bilibili.mediastreaming.audio.track.M

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliAudioTrack f65843a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Ref.ObjectRef f65844b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Function0 f65845c;

            {
                this.f65843a = this;
                this.f65844b = objectRef;
                this.f65845c = function0;
            }

            public final Object invoke() {
                if (this.f65843a.f65808d != 0) {
                    this.f65844b.element = this.f65845c.invoke();
                }
                return Unit.INSTANCE;
            }
        });
        return (T) objectRef.element;
    }

    @Nullable
    public final <T> T runOnAudioWorkCoroutineInvoke(@NotNull String str, @NotNull Function0<? extends T> function0) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        com.bilibili.mediastreaming.audio.croutine.d dVar = this.f65809e;
        com.bilibili.biligame.widget.user.dialog.c cVar = new com.bilibili.biligame.widget.user.dialog.c(1, objectRef, function0);
        CoroutineScope coroutineScope = dVar.h;
        if (coroutineScope != null) {
        }
        return (T) objectRef.element;
    }

    public final void sendAudioEndStream(final long j7) {
    }

    public final int sendAudioF32(@NotNull final byte[] bArr, final int i7, final int i8, final int i9, final long j7) {
        Integer num = (Integer) runOnAudioNativeCoroutineInvoke("sendAudioF32", new Function0(this, bArr, i7, i8, i9, j7) { // from class: com.bilibili.mediastreaming.audio.track.K

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliAudioTrack f65834a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final byte[] f65835b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f65836c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f65837d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final int f65838e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final long f65839f;

            {
                this.f65834a = this;
                this.f65835b = bArr;
                this.f65836c = i7;
                this.f65837d = i8;
                this.f65838e = i9;
                this.f65839f = j7;
            }

            public final Object invoke() {
                return BiliAudioTrack.p(this.f65834a, this.f65835b, this.f65836c, this.f65837d, this.f65838e, this.f65839f);
            }
        });
        return num != null ? num.intValue() : -1;
    }

    public final int sendAudioLenF32(final int i7, final int i8, final int i9, final int i10, final long j7) {
        Integer num = (Integer) runOnAudioNativeCoroutineInvoke("sendAudioLenS32", new Function0(this, i7, i8, i9, i10, j7) { // from class: com.bilibili.mediastreaming.audio.track.W

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliAudioTrack f65871a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f65872b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f65873c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f65874d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final int f65875e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final long f65876f;

            {
                this.f65871a = this;
                this.f65872b = i7;
                this.f65873c = i8;
                this.f65874d = i9;
                this.f65875e = i10;
                this.f65876f = j7;
            }

            public final Object invoke() {
                return BiliAudioTrack.m(this.f65871a, this.f65872b, this.f65873c, this.f65874d, this.f65875e, this.f65876f);
            }
        });
        return num != null ? num.intValue() : -1;
    }

    public final int sendAudioLenS16(final int i7, final int i8, final int i9, final int i10, final long j7) {
        Integer num = (Integer) runOnAudioNativeCoroutineInvoke("sendAudioLenS16", new Function0(this, i7, i8, i9, i10, j7) { // from class: com.bilibili.mediastreaming.audio.track.S

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliAudioTrack f65859a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f65860b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f65861c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f65862d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final int f65863e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final long f65864f;

            {
                this.f65859a = this;
                this.f65860b = i7;
                this.f65861c = i8;
                this.f65862d = i9;
                this.f65863e = i10;
                this.f65864f = j7;
            }

            public final Object invoke() {
                return BiliAudioTrack.t(this.f65859a, this.f65860b, this.f65861c, this.f65862d, this.f65863e, this.f65864f);
            }
        });
        return num != null ? num.intValue() : -1;
    }

    public final int sendAudioS16(@NotNull final byte[] bArr, final int i7, final int i8, final int i9, final long j7) {
        Integer num = (Integer) runOnAudioNativeCoroutineInvoke("sendAudioS16", new Function0(this, bArr, i7, i8, i9, j7) { // from class: com.bilibili.mediastreaming.audio.track.O

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliAudioTrack f65849a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final byte[] f65850b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f65851c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f65852d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final int f65853e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final long f65854f;

            {
                this.f65849a = this;
                this.f65850b = bArr;
                this.f65851c = i7;
                this.f65852d = i8;
                this.f65853e = i9;
                this.f65854f = j7;
            }

            public final Object invoke() {
                return BiliAudioTrack.k(this.f65849a, this.f65850b, this.f65851c, this.f65852d, this.f65853e, this.f65854f);
            }
        });
        return num != null ? num.intValue() : -1;
    }

    public final int setAudioByteBuffer(@NotNull ByteBuffer byteBuffer) {
        Integer num = (Integer) runOnAudioNativeCoroutineInvoke("setAudioByteBuffer", new bC.k(1, this, byteBuffer));
        return num != null ? num.intValue() : -1;
    }

    public final void setChildReleaseCoroutine(boolean z6) {
        this.f65811g = z6;
    }

    public final void setHandle(long j7) {
        this.f65808d = j7;
    }

    public int setLeftVolume(final float f7) {
        Integer num = (Integer) runOnAudioNativeCoroutineInvoke("setLeftVolume", new Function0(f7, this) { // from class: com.bilibili.mediastreaming.audio.track.T

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final float f65865a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliAudioTrack f65866b;

            {
                this.f65865a = f7;
                this.f65866b = this;
            }

            public final Object invoke() {
                return BiliAudioTrack.x(this.f65865a, this.f65866b);
            }
        });
        return num != null ? num.intValue() : -1;
    }

    public int setLeftVolume(int i7) {
        if (i7 >= 0 && i7 <= 100) {
            return setLeftVolume(i7 / 100.0f);
        }
        InterfaceC8094b.a(this, C3259x.a(i7, "volume must [0, 100] not is:"), "BiliAudioTrack", null, 10);
        return -1;
    }

    public final void setMAudioTrackCoroutine(@NotNull com.bilibili.mediastreaming.audio.croutine.d dVar) {
        this.f65809e = dVar;
    }

    public int setPause(final boolean z6) {
        Integer num = (Integer) runOnAudioNativeCoroutineInvoke("setPause", new Function0(this, z6) { // from class: com.bilibili.mediastreaming.audio.track.Q

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliAudioTrack f65857a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f65858b;

            {
                this.f65857a = this;
                this.f65858b = z6;
            }

            public final Object invoke() {
                return BiliAudioTrack.d(this.f65857a, this.f65858b);
            }
        });
        return num != null ? num.intValue() : -1;
    }

    public boolean setPrepareDataDelayMs(final int i7) {
        Boolean bool = (Boolean) runOnAudioNativeCoroutineInvoke("setPrepareDataDelayMs", new Function0(this, i7) { // from class: com.bilibili.mediastreaming.audio.track.X

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliAudioTrack f65877a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f65878b;

            {
                this.f65877a = this;
                this.f65878b = i7;
            }

            public final Object invoke() {
                return BiliAudioTrack.s(this.f65877a, this.f65878b);
            }
        });
        return bool != null ? bool.booleanValue() : false;
    }

    public int setRightVolume(final float f7) {
        Integer num = (Integer) runOnAudioNativeCoroutineInvoke("setRightVolume", new Function0(f7, this) { // from class: com.bilibili.mediastreaming.audio.track.U

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final float f65867a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliAudioTrack f65868b;

            {
                this.f65867a = f7;
                this.f65868b = this;
            }

            public final Object invoke() {
                return BiliAudioTrack.j(this.f65867a, this.f65868b);
            }
        });
        return num != null ? num.intValue() : -1;
    }

    public int setRightVolume(int i7) {
        if (i7 >= 0 && i7 <= 100) {
            return setRightVolume(i7 / 100.0f);
        }
        InterfaceC8094b.a(this, C3259x.a(i7, "volume must [0, 100] not is:"), "BiliAudioTrack", null, 10);
        return -1;
    }

    public boolean setVolume(float f7) {
        if (f7 >= 0.0f && f7 <= 1.0f) {
            return setVolume(f7, f7);
        }
        InterfaceC8094b.a(this, G0.g.a(f7, "volume must [0.0f, 1.0f]. not is:"), "BiliAudioTrack", null, 10);
        return false;
    }

    public boolean setVolume(final float f7, final float f8) {
        Boolean bool = (Boolean) runOnAudioNativeCoroutineInvoke("setVolume", new Function0(this, f7, f8) { // from class: com.bilibili.mediastreaming.audio.track.N

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliAudioTrack f65846a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final float f65847b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final float f65848c;

            {
                this.f65846a = this;
                this.f65847b = f7;
                this.f65848c = f8;
            }

            public final Object invoke() {
                float f9 = this.f65847b;
                BiliAudioTrack biliAudioTrack = this.f65846a;
                int leftVolume = biliAudioTrack.setLeftVolume(f9);
                int rightVolume = biliAudioTrack.setRightVolume(this.f65848c);
                InterfaceC8094b.b(biliAudioTrack, G.f.a(leftVolume, rightVolume, "setVolume, left result:", ", right result:"), "BiliAudioTrack", 10);
                return Boolean.valueOf(leftVolume == 0 && rightVolume == 0);
            }
        });
        return bool != null ? bool.booleanValue() : false;
    }

    public boolean setVolume(int i7) {
        if (i7 >= 0 && i7 <= 100) {
            return setVolume(i7, i7);
        }
        InterfaceC8094b.a(this, C3259x.a(i7, "volume must [0, 100] not is:"), "BiliAudioTrack", null, 10);
        return false;
    }

    public boolean setVolume(int i7, int i8) {
        int leftVolume = setLeftVolume(i7);
        int rightVolume = setRightVolume(i8);
        InterfaceC8094b.b(this, G.f.a(leftVolume, rightVolume, "setVolume, left result:", ", right result:"), "BiliAudioTrack", 10);
        return leftVolume == 0 && rightVolume == 0;
    }

    public final void startCallback() {
        runOnAudioNativeCoroutineInvoke("startCallback", new com.bilibili.bililive.room.roomplayer.workers.d(this, 3));
    }

    public final void stopCallback() {
        runOnAudioNativeCoroutineInvoke("stopCallback", new Ty0.c(this, 2));
    }

    public void unRegisterAudioLevelCallback() {
        InterfaceC8094b.b(this, "unRegisterAudioLevelCallback", "BiliAudioTrack", 10);
        com.bilibili.mediastreaming.audio.croutine.d.e(this.f65809e, new com.bilibili.biligame.ui.discover2.act.c(this, 3));
    }
}
