package com.bilibili.mediastreaming.audio.output;

import J81.u;
import UR0.D;
import ZS0.I1;
import ZS0.L1;
import ZS0.M1;
import androidx.annotation.Keep;
import androidx.appcompat.widget.C3259x;
import androidx.compose.runtime.MutableState;
import androidx.core.app.NotificationCompat;
import com.bilibili.ad.reward.test.K;
import com.bilibili.bplus.followinglist.opus.manager.v;
import com.bilibili.live.streaming.BiliLivePushLoader;
import com.bilibili.mediastreaming.audio.track.Y;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.mall.videodetail.vd.united.page.intro.module.staffs.Staff;
import com.mall.videodetail.vd.united.page.intro.module.staffs.StaffsPanelComponent;
import com.mall.videodetail.vd.united.page.intro.module.staffs.StaffsService;
import d3.C6781b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kntr.base.log.KLog_androidKt;
import kntr.common.photonic.aphro.core.a;
import kntr.common.photonic.aphro.core.g;
import kntr.srcs.app.splash.page.view.button.LottieButtonKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import nh0.InterfaceC8094b;
import oh0.InterfaceC8217a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u1.C8707a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/output/BiliAudioOutput.class */
public class BiliAudioOutput implements q, InterfaceC8094b {

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    private static final String TAG = "BiliAudioOutput";
    private final com.bilibili.mediastreaming.audio.b $$delegate_0;
    private boolean doGetAudioLevel;
    private long handle;
    private boolean isChildReleaseCoroutine;

    @Nullable
    private final String logTag;

    @Nullable
    private InterfaceC8217a mAudioLevelCallback;

    @NotNull
    private com.bilibili.mediastreaming.audio.croutine.d mAudioOutputCoroutine;

    @NotNull
    private Map<String, Y> mMixAudioTracks;

    @NotNull
    private final String name;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/output/BiliAudioOutput$a.class */
    public static final class a {
    }

    /* JADX INFO: renamed from: com.bilibili.mediastreaming.audio.output.BiliAudioOutput$doGetAudioLevel$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/output/BiliAudioOutput$doGetAudioLevel$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final long $callbackMs;
        int label;
        final BiliAudioOutput this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BiliAudioOutput biliAudioOutput, long j7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = biliAudioOutput;
            this.$callbackMs = j7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$callbackMs, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 != 0 && i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            while (this.this$0.doGetAudioLevel) {
                this.this$0.getLRLevelFullRange();
                long j7 = this.$callbackMs;
                this.label = 1;
                if (DelayKt.delay(j7, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.mediastreaming.audio.output.BiliAudioOutput$onAudioLevel$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/output/BiliAudioOutput$onAudioLevel$1.class */
    public static final class C53831 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final double $left;
        final double $right;
        int label;
        final BiliAudioOutput this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C53831(BiliAudioOutput biliAudioOutput, double d7, double d8, Continuation<? super C53831> continuation) {
            super(2, continuation);
            this.this$0 = biliAudioOutput;
            this.$left = d7;
            this.$right = d8;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C53831(this.this$0, this.$left, this.$right, continuation);
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
            InterfaceC8217a interfaceC8217a = this.this$0.mAudioLevelCallback;
            if (interfaceC8217a != null) {
                interfaceC8217a.onAudioLevel(this.$left, this.$right);
            }
            return Unit.INSTANCE;
        }
    }

    public BiliAudioOutput(@NotNull String str, @Nullable String str2) {
        this.$$delegate_0 = new com.bilibili.mediastreaming.audio.b(str2 == null ? str : str2);
        this.name = str;
        this.logTag = str2;
        this.mAudioOutputCoroutine = new com.bilibili.mediastreaming.audio.croutine.d(str2 == null ? TAG : str2);
        this.mMixAudioTracks = new LinkedHashMap();
        BiliLivePushLoader.INSTANCE.load();
    }

    public /* synthetic */ BiliAudioOutput(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? null : str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean addMixTrack$lambda$18(BiliAudioOutput biliAudioOutput, Y y6) {
        boolean zNativeAddMixTrackName = biliAudioOutput.nativeAddMixTrackName(biliAudioOutput.handle, y6.getTrackHandleName());
        InterfaceC8094b.b(biliAudioOutput, K.a("addMixTrack: trackName:", y6.getTrackHandleName(), ", result:", zNativeAddMixTrackName), null, 14);
        if (zNativeAddMixTrackName) {
            biliAudioOutput.mMixAudioTracks.put(y6.getTrackHandleName(), y6);
        } else {
            InterfaceC8094b.a(biliAudioOutput, C6781b.a(biliAudioOutput.name, ", mix track:", y6.getTrackHandleName(), ", fail!"), TAG, null, 10);
        }
        return Boolean.valueOf(zNativeAddMixTrackName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearCacheDirectBufferAddress$lambda$5(BiliAudioOutput biliAudioOutput) {
        InterfaceC8094b.b(biliAudioOutput, "clearCacheDirectBufferAddress, handle is zero?" + (biliAudioOutput.handle == 0), null, 14);
        biliAudioOutput.nativeClearCacheDirectBufferAddress(biliAudioOutput.handle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearCacheStream$lambda$3(BiliAudioOutput biliAudioOutput) {
        InterfaceC8094b.b(biliAudioOutput, "clearCacheStream, handle is zero?" + (biliAudioOutput.handle == 0), null, 14);
        biliAudioOutput.nativeClearCacheStream(biliAudioOutput.handle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean clearMixTracks$lambda$21(BiliAudioOutput biliAudioOutput) {
        boolean zNativeClearMixTrackNames = biliAudioOutput.nativeClearMixTrackNames(biliAudioOutput.handle);
        InterfaceC8094b.b(biliAudioOutput, "clearMixTracks... result:" + zNativeClearMixTrackNames, null, 14);
        if (zNativeClearMixTrackNames) {
            biliAudioOutput.mMixAudioTracks.clear();
        } else {
            InterfaceC8094b.a(biliAudioOutput, G.p.a(biliAudioOutput.name, ", clearMixTracks fail!"), TAG, null, 10);
        }
        return Boolean.valueOf(zNativeClearMixTrackNames);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean containsTrack$lambda$19(BiliAudioOutput biliAudioOutput, Y y6) {
        InterfaceC8094b.b(biliAudioOutput, "containsTrack: trackName:" + y6.getTrackHandleName(), null, 14);
        return Boolean.valueOf(biliAudioOutput.mMixAudioTracks.containsKey(y6.getTrackHandleName()));
    }

    private final void doGetAudioLevel(long j7) {
        com.bilibili.mediastreaming.audio.croutine.d.h(this.mAudioOutputCoroutine, new AnonymousClass1(this, j7, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit enableDebug$lambda$0(BiliAudioOutput biliAudioOutput) {
        biliAudioOutput.innerEnableDebug();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getLRLevelFullRange() {
        com.bilibili.mediastreaming.audio.croutine.d.e(this.mAudioOutputCoroutine, new com.bilibili.biligame.ui.benefit.g(this, 3));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getLRLevelFullRange$lambda$17(BiliAudioOutput biliAudioOutput) {
        long j7 = biliAudioOutput.handle;
        if (j7 == 0) {
            return Unit.INSTANCE;
        }
        biliAudioOutput.nativeGetLRLevelFullRange(j7);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float getLeftVolume$lambda$15(BiliAudioOutput biliAudioOutput) {
        float fNativeGetLeftVolume = biliAudioOutput.nativeGetLeftVolume(biliAudioOutput.handle);
        InterfaceC8094b.b(biliAudioOutput, "getLeftVolume, handle is zero?:" + (biliAudioOutput.handle == 0) + ", ret:" + fNativeGetLeftVolume, TAG, 10);
        return Float.valueOf(fNativeGetLeftVolume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getMixTrackList$lambda$23(BiliAudioOutput biliAudioOutput) {
        ArrayList arrayList = new ArrayList();
        if (biliAudioOutput.handle != 0) {
            Iterator<Map.Entry<String, Y>> it = biliAudioOutput.mMixAudioTracks.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
        }
        return CollectionsKt.toList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float getRightVolume$lambda$16(BiliAudioOutput biliAudioOutput) {
        float fNativeGetRightVolume = biliAudioOutput.nativeGetRightVolume(biliAudioOutput.handle);
        InterfaceC8094b.b(biliAudioOutput, "getRightVolume, handle is zero?:" + (biliAudioOutput.handle == 0) + ", ret:" + fNativeGetRightVolume, TAG, 10);
        return Float.valueOf(fNativeGetRightVolume);
    }

    private final void innerEnableDebug() {
        InterfaceC8094b.b(this, "innerEnableDebug.... handle == 0L?:" + (this.handle == 0), null, 14);
        nativeEnableDebug(this.handle);
    }

    private final void innerRelease() {
        InterfaceC8094b.b(this, "release, handle is zero?: " + (this.handle == 0), TAG, 10);
        unRegisterAudioLevelCallback();
        nativeRelease(this.handle);
        this.handle = 0L;
    }

    @Keep
    private final native boolean nativeAddMixTrackName(long j7, String str);

    @Keep
    private final native long nativeBufferRemainingFrames(long j7);

    @Keep
    private final native void nativeCacheDirectBufferAddress(long j7, ByteBuffer byteBuffer);

    @Keep
    private final native void nativeClearCacheDirectBufferAddress(long j7);

    @Keep
    private final native void nativeClearCacheStream(long j7);

    @Keep
    private final native boolean nativeClearMixTrackNames(long j7);

    @Keep
    private final native void nativeEnableDebug(long j7);

    @Keep
    private final native boolean nativeGetLRLevelFullRange(long j7);

    @Keep
    private final native float nativeGetLeftVolume(long j7);

    @Keep
    private final native ArrayList<String> nativeGetMixTrackNameList(long j7);

    @Keep
    private final native float nativeGetRightVolume(long j7);

    @Keep
    private final native long nativeInit(String str, BiliAudioOutput biliAudioOutput, boolean z6, boolean z7);

    @Keep
    private final native void nativeRelease(long j7);

    @Keep
    private final native boolean nativeRemoveMixTrackName(long j7, String str);

    @Keep
    private final native long nativeRequestAudioData(long j7, long j8);

    @Keep
    private final native int nativeSetLeftVolume(long j7, float f7);

    @Keep
    private final native void nativeSetReceiving(long j7, boolean z6);

    @Keep
    private final native int nativeSetRightVolume(long j7, float f7);

    @Keep
    private final native boolean nativeSetTargetStreamConfig(long j7, long j8, int i7);

    @Keep
    private final native void nativeUpdateQueueCacheBufferMs(long j7, int i7);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerAudioLevelCallback$lambda$1(BiliAudioOutput biliAudioOutput, InterfaceC8217a interfaceC8217a, long j7) {
        if (biliAudioOutput.mAudioLevelCallback != null || biliAudioOutput.doGetAudioLevel) {
            return Unit.INSTANCE;
        }
        biliAudioOutput.mAudioLevelCallback = interfaceC8217a;
        biliAudioOutput.doGetAudioLevel = true;
        biliAudioOutput.doGetAudioLevel(j7);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit release$lambda$24(BiliAudioOutput biliAudioOutput) {
        biliAudioOutput.innerRelease();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long remainingCacheFrames$lambda$8(BiliAudioOutput biliAudioOutput) {
        return Long.valueOf(biliAudioOutput.nativeBufferRemainingFrames(biliAudioOutput.handle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean removeMixTrack$lambda$20(BiliAudioOutput biliAudioOutput, Y y6) {
        boolean zNativeRemoveMixTrackName = biliAudioOutput.nativeRemoveMixTrackName(biliAudioOutput.handle, y6.getTrackHandleName());
        InterfaceC8094b.b(biliAudioOutput, K.a("removeMixTrack: trackName:", y6.getTrackHandleName(), ", result:", zNativeRemoveMixTrackName), null, 14);
        if (zNativeRemoveMixTrackName) {
            biliAudioOutput.mMixAudioTracks.remove(y6.getTrackHandleName());
        } else {
            InterfaceC8094b.a(biliAudioOutput, C6781b.a(biliAudioOutput.name, ", remove track:", y6.getTrackHandleName(), ", fail!"), TAG, null, 10);
        }
        return Boolean.valueOf(zNativeRemoveMixTrackName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long requestAudioData$lambda$7(BiliAudioOutput biliAudioOutput, long j7) {
        return Long.valueOf(biliAudioOutput.nativeRequestAudioData(biliAudioOutput.handle, j7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runOnAudioCoroutineInvoke$lambda$25(BiliAudioOutput biliAudioOutput, Ref.ObjectRef objectRef, Function0 function0) {
        if (biliAudioOutput.handle != 0) {
            objectRef.element = function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runOnAudioWorkCoroutineInvoke$lambda$26(Ref.ObjectRef objectRef, Function0 function0) {
        objectRef.element = function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCacheDirectBufferAddress$lambda$4(BiliAudioOutput biliAudioOutput, ByteBuffer byteBuffer) {
        boolean z6 = biliAudioOutput.handle == 0;
        InterfaceC8094b.b(biliAudioOutput, "setCacheDirectBufferAddress, handle is zero?" + z6 + ", byteBuffer cap:" + byteBuffer.capacity(), null, 14);
        biliAudioOutput.nativeCacheDirectBufferAddress(biliAudioOutput.handle, byteBuffer);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer setLeftVolume$lambda$13(float f7, BiliAudioOutput biliAudioOutput) {
        int iNativeSetLeftVolume;
        if (f7 < 0.0f || f7 > 1.0f) {
            InterfaceC8094b.a(biliAudioOutput, G0.g.a(f7, "volume must [0.0f, 1.0f]. not is:"), TAG, null, 10);
            iNativeSetLeftVolume = -1;
        } else {
            InterfaceC8094b.b(biliAudioOutput, "setLeftVolume, handle is zero?:" + (biliAudioOutput.handle == 0) + ", volume:" + f7, TAG, 10);
            iNativeSetLeftVolume = biliAudioOutput.nativeSetLeftVolume(biliAudioOutput.handle, f7);
        }
        return Integer.valueOf(iNativeSetLeftVolume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setReceiving$lambda$10(BiliAudioOutput biliAudioOutput, boolean z6) {
        InterfaceC8094b.b(biliAudioOutput, com.bilibili.app.comm.bh.x5.a.a("setReceiving, handle is zero:", ", receiving:", biliAudioOutput.handle == 0, z6), TAG, 10);
        biliAudioOutput.nativeSetReceiving(biliAudioOutput.handle, z6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer setRightVolume$lambda$14(float f7, BiliAudioOutput biliAudioOutput) {
        int iNativeSetRightVolume;
        if (f7 < 0.0f || f7 > 1.0f) {
            InterfaceC8094b.a(biliAudioOutput, G0.g.a(f7, "volume must [0.0f, 1.0f]. not is:"), TAG, null, 10);
            iNativeSetRightVolume = -1;
        } else {
            InterfaceC8094b.b(biliAudioOutput, "setRightVolume, handle is zero?:" + (biliAudioOutput.handle == 0) + ", volume:" + f7, TAG, 10);
            iNativeSetRightVolume = biliAudioOutput.nativeSetRightVolume(biliAudioOutput.handle, f7);
        }
        return Integer.valueOf(iNativeSetRightVolume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean setTargetStreamConfig$lambda$9(BiliAudioOutput biliAudioOutput, long j7, int i7) {
        InterfaceC8094b.b(biliAudioOutput, C8707a.a(i7, ", targetChannels:", z4.e.a(j7, "setTargetStreamConfig, handle is zero:", ", targetSampleRate:", biliAudioOutput.handle == 0)), TAG, 10);
        return Boolean.valueOf(biliAudioOutput.nativeSetTargetStreamConfig(biliAudioOutput.handle, j7, i7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean setVolume$lambda$11(BiliAudioOutput biliAudioOutput, int i7, int i8) {
        int leftVolume = biliAudioOutput.setLeftVolume(i7);
        int rightVolume = biliAudioOutput.setRightVolume(i8);
        InterfaceC8094b.b(biliAudioOutput, G.f.a(leftVolume, rightVolume, "setVolume, left result:", ", right result:"), TAG, 10);
        return Boolean.valueOf(leftVolume == 0 && rightVolume == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean setVolume$lambda$12(BiliAudioOutput biliAudioOutput, float f7, float f8) {
        int leftVolume = biliAudioOutput.setLeftVolume(f7);
        int rightVolume = biliAudioOutput.setRightVolume(f8);
        InterfaceC8094b.b(biliAudioOutput, G.f.a(leftVolume, rightVolume, "setVolume, left result:", ", right result:"), TAG, 10);
        return Boolean.valueOf(leftVolume == 0 && rightVolume == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unRegisterAudioLevelCallback$lambda$2(BiliAudioOutput biliAudioOutput) {
        biliAudioOutput.doGetAudioLevel = false;
        biliAudioOutput.mAudioLevelCallback = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateQueueCacheBufferMs$lambda$6(BiliAudioOutput biliAudioOutput, int i7) {
        InterfaceC8094b.b(biliAudioOutput, "updateQueueCacheBufferMs, handle is zero?" + (biliAudioOutput.handle == 0) + ", updateCacheBufferMs:" + i7, null, 14);
        biliAudioOutput.nativeUpdateQueueCacheBufferMs(biliAudioOutput.handle, i7);
        return Unit.INSTANCE;
    }

    public boolean addMixTrack(@NotNull final Y y6) {
        final int i7 = 0;
        Boolean bool = (Boolean) runOnAudioCoroutineInvoke("addMixTrack", new Function0(i7, this, y6) { // from class: com.bilibili.mediastreaming.audio.output.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f65739a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f65740b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f65741c;

            {
                this.f65739a = i7;
                this.f65740b = this;
                this.f65741c = y6;
            }

            public final Object invoke() {
                switch (this.f65739a) {
                    case 0:
                        return BiliAudioOutput.addMixTrack$lambda$18((BiliAudioOutput) this.f65740b, (Y) this.f65741c);
                    default:
                        KLog_androidKt.getKLog().i("[Splash]LottieButton", androidx.compose.ui.input.pointer.k.a(((u) this.f65740b).a, "Button ", " clicked"));
                        ((Function0) this.f65741c).invoke();
                        return Unit.INSTANCE;
                }
            }
        });
        return bool != null ? bool.booleanValue() : false;
    }

    public final void clearCacheDirectBufferAddress() {
        runOnAudioCoroutineInvoke("clearCacheDirectBufferAddress", new L1(this, 2));
    }

    public final void clearCacheStream() {
        runOnAudioCoroutineInvoke("clearCacheStream", new com.bilibili.biligame.widget.dialog.p(this, 2));
    }

    public boolean clearMixTracks() {
        Boolean bool = (Boolean) runOnAudioCoroutineInvoke("clearMixTracks", new LA.c(this, 1));
        return bool != null ? bool.booleanValue() : false;
    }

    public boolean containsTrack(@NotNull final Y y6) {
        final int i7 = 0;
        Boolean bool = (Boolean) runOnAudioCoroutineInvoke("containsTrack", new Function0(i7, this, y6) { // from class: com.bilibili.mediastreaming.audio.output.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f65745a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f65746b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f65747c;

            {
                this.f65745a = i7;
                this.f65746b = this;
                this.f65747c = y6;
            }

            public final Object invoke() {
                switch (this.f65745a) {
                    case 0:
                        break;
                    case 1:
                        ((Function1) this.f65746b).invoke(new a.a(!((g.a) this.f65747c).f));
                        break;
                    default:
                        LottieButtonKt.c((u) this.f65746b, (MutableState) this.f65747c, "lottie_load_failed");
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        return bool != null ? bool.booleanValue() : false;
    }

    public void enableDebug() {
        com.bilibili.mediastreaming.audio.croutine.d.e(this.mAudioOutputCoroutine, new com.bilibili.biligame.widget.dialog.a(this, 1));
    }

    public final long getHandle() {
        return this.handle;
    }

    public float getLeftVolume() {
        Float f7 = (Float) runOnAudioCoroutineInvoke("getLeftVolume", new com.bilibili.biligame.ui.benefit.i(this, 2));
        return f7 != null ? f7.floatValue() : 0.0f;
    }

    @Nullable
    public final String getLogTag() {
        return this.logTag;
    }

    @NotNull
    public final com.bilibili.mediastreaming.audio.croutine.d getMAudioOutputCoroutine() {
        return this.mAudioOutputCoroutine;
    }

    @NotNull
    public List<Y> getMixTrackList() {
        List<Y> list = (List) runOnAudioCoroutineInvoke("getMixTrackList", new M1(this, 2));
        List<Y> list2 = list;
        if (list == null) {
            list2 = CollectionsKt.toList(new ArrayList());
        }
        return list2;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Override // com.bilibili.mediastreaming.audio.output.q
    public long getOutputHandle() {
        return this.handle;
    }

    @Override // com.bilibili.mediastreaming.audio.output.q
    @NotNull
    public String getOutputHandleName() {
        return this.name;
    }

    public float getRightVolume() {
        Float f7 = (Float) runOnAudioCoroutineInvoke("getRightVolume", new I1(this, 4));
        return f7 != null ? f7.floatValue() : 0.0f;
    }

    public final void initHandle(boolean z6, boolean z7) {
        InterfaceC8094b.b(this, com.bilibili.app.comm.bh.x5.a.a("isF32:", ", handle is zero?:", z6, this.handle == 0), TAG, 10);
        long j7 = this.handle;
        if (j7 != 0) {
            nativeRelease(j7);
            this.handle = 0L;
        }
        this.handle = nativeInit(this.name, this, z6, z7);
    }

    public final boolean isChildReleaseCoroutine() {
        return this.isChildReleaseCoroutine;
    }

    public void logDebug(@NotNull Function0<String> function0, @Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        this.$$delegate_0.d(function0, str, str2, th);
    }

    @Override // nh0.InterfaceC8094b
    public void logError(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.$$delegate_0.logError(str, str2, str3, th);
    }

    @Override // nh0.InterfaceC8094b
    public void logInfo(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.$$delegate_0.logInfo(str, str2, str3, th);
    }

    public void logVerbose(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.$$delegate_0.e(str, str2, str3, th);
    }

    @Override // nh0.InterfaceC8094b
    public void logWarning(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.$$delegate_0.logWarning(str, str2, str3, th);
    }

    @Keep
    public void onAudioData(@NotNull byte[] bArr, int i7, int i8, long j7) {
    }

    @Keep
    public void onAudioDataNotify(int i7, long j7, int i8, int i9) {
    }

    @Keep
    public void onAudioDataRemaining(int i7, long j7, int i8, int i9) {
    }

    @Keep
    public final void onAudioLevel(double d7, double d8) {
        com.bilibili.mediastreaming.audio.croutine.d.i(this.mAudioOutputCoroutine, new C53831(this, d7, d8, null));
    }

    @Keep
    public void onAudioLoopTime(int i7) {
    }

    public void registerAudioLevelCallback(@NotNull final InterfaceC8217a interfaceC8217a, final long j7) {
        InterfaceC8094b.b(this, "registerAudioLevelCallback", TAG, 10);
        com.bilibili.mediastreaming.audio.croutine.d.e(this.mAudioOutputCoroutine, new Function0(this, interfaceC8217a, j7) { // from class: com.bilibili.mediastreaming.audio.output.m

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliAudioOutput f65761a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final InterfaceC8217a f65762b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f65763c;

            {
                this.f65761a = this;
                this.f65762b = interfaceC8217a;
                this.f65763c = j7;
            }

            public final Object invoke() {
                return BiliAudioOutput.registerAudioLevelCallback$lambda$1(this.f65761a, this.f65762b, this.f65763c);
            }
        });
    }

    public void release() {
        runOnAudioCoroutineInvoke("release", new com.bilibili.bplus.im.pblink.n(this, 1));
        if (this.isChildReleaseCoroutine) {
            return;
        }
        InterfaceC8094b.b(this, "because isChildReleaseCoroutine is false so, BiliAudioOutput mAudioOutputCoroutine.release() ", null, 14);
        this.mAudioOutputCoroutine.d();
    }

    public final long remainingCacheFrames() {
        Long l7 = (Long) runOnAudioCoroutineInvoke("remainingCacheFrames", new LA0.c(this, 3));
        return l7 != null ? l7.longValue() : 0L;
    }

    public boolean removeMixTrack(@NotNull final Y y6) {
        final int i7 = 0;
        Boolean bool = (Boolean) runOnAudioCoroutineInvoke("removeMixTrack", new Function0(i7, this, y6) { // from class: com.bilibili.mediastreaming.audio.output.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f65736a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f65737b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f65738c;

            {
                this.f65736a = i7;
                this.f65737b = this;
                this.f65738c = y6;
            }

            public final Object invoke() {
                Object obj = this.f65738c;
                Object obj2 = this.f65737b;
                switch (this.f65736a) {
                    case 0:
                        return BiliAudioOutput.removeMixTrack$lambda$20((BiliAudioOutput) obj2, (Y) obj);
                    default:
                        StaffsService.b bVar = ((StaffsPanelComponent) obj2).b;
                        Staff staff = (Staff) obj;
                        StaffsService staffsService = bVar.a;
                        ArrayList arrayList = staffsService.u;
                        long j7 = staff.a;
                        if (!arrayList.contains(Long.valueOf(j7))) {
                            staffsService.u.add(Long.valueOf(j7));
                            String strC = D.c(staff.c(), false);
                            HashMap map = new HashMap();
                            com.mall.videodetail.vd.united.page.report.e eVar = staffsService.m;
                            map.putAll(eVar.a((Map) null));
                            map.put("spmid", "mall.player-video-detail.joint-submission.0");
                            map.put(NotificationCompat.CATEGORY_STATUS, strC);
                            map.put(EditCustomizeSticker.TAG_MID, String.valueOf(j7));
                            D.e(map);
                            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                            mapCreateMapBuilder.put("page_area", "2");
                            Unit unit = Unit.INSTANCE;
                            eVar.f("mall.player-video-detail.up-joint-submission.head.show", MapsKt.build(mapCreateMapBuilder));
                        }
                        return Unit.INSTANCE;
                }
            }
        });
        return bool != null ? bool.booleanValue() : false;
    }

    public final long requestAudioData(final long j7) {
        Long l7 = (Long) runOnAudioCoroutineInvoke("requestAudioData", new Function0(this, j7) { // from class: com.bilibili.mediastreaming.audio.output.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliAudioOutput f65753a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f65754b;

            {
                this.f65753a = this;
                this.f65754b = j7;
            }

            public final Object invoke() {
                return BiliAudioOutput.requestAudioData$lambda$7(this.f65753a, this.f65754b);
            }
        });
        return l7 != null ? l7.longValue() : 0L;
    }

    @Nullable
    public final <T> T runOnAudioCoroutineInvoke(@NotNull String str, @NotNull final Function0<? extends T> function0) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        this.mAudioOutputCoroutine.f(str, new Function0(this, objectRef, function0) { // from class: com.bilibili.mediastreaming.audio.output.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliAudioOutput f65750a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Ref.ObjectRef f65751b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Function0 f65752c;

            {
                this.f65750a = this;
                this.f65751b = objectRef;
                this.f65752c = function0;
            }

            public final Object invoke() {
                return BiliAudioOutput.runOnAudioCoroutineInvoke$lambda$25(this.f65750a, this.f65751b, this.f65752c);
            }
        });
        return (T) objectRef.element;
    }

    @Nullable
    public final <T> T runOnAudioWorkCoroutineInvoke(@NotNull String str, @NotNull Function0<? extends T> function0) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        com.bilibili.mediastreaming.audio.croutine.d dVar = this.mAudioOutputCoroutine;
        v vVar = new v(1, objectRef, function0);
        CoroutineScope coroutineScope = dVar.h;
        if (coroutineScope != null) {
        }
        return (T) objectRef.element;
    }

    public final void setCacheDirectBufferAddress(@NotNull ByteBuffer byteBuffer) {
        runOnAudioCoroutineInvoke("setCacheDirectBufferAddress", new LA.b(1, this, byteBuffer));
    }

    public final void setChildReleaseCoroutine(boolean z6) {
        this.isChildReleaseCoroutine = z6;
    }

    public final void setHandle(long j7) {
        this.handle = j7;
    }

    public int setLeftVolume(final float f7) {
        Integer num = (Integer) runOnAudioCoroutineInvoke("setLeftVolume", new Function0(f7, this) { // from class: com.bilibili.mediastreaming.audio.output.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final float f65759a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliAudioOutput f65760b;

            {
                this.f65759a = f7;
                this.f65760b = this;
            }

            public final Object invoke() {
                return BiliAudioOutput.setLeftVolume$lambda$13(this.f65759a, this.f65760b);
            }
        });
        return num != null ? num.intValue() : -1;
    }

    public int setLeftVolume(int i7) {
        if (i7 >= 0 && i7 <= 100) {
            return setLeftVolume(i7 / 100.0f);
        }
        InterfaceC8094b.a(this, C3259x.a(i7, "volume must [0, 100] not is:"), TAG, null, 10);
        return -1;
    }

    public final void setMAudioOutputCoroutine(@NotNull com.bilibili.mediastreaming.audio.croutine.d dVar) {
        this.mAudioOutputCoroutine = dVar;
    }

    public final void setReceiving(final boolean z6) {
        runOnAudioCoroutineInvoke("setReceiving", new Function0(this, z6) { // from class: com.bilibili.mediastreaming.audio.output.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliAudioOutput f65748a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f65749b;

            {
                this.f65748a = this;
                this.f65749b = z6;
            }

            public final Object invoke() {
                return BiliAudioOutput.setReceiving$lambda$10(this.f65748a, this.f65749b);
            }
        });
    }

    public int setRightVolume(final float f7) {
        Integer num = (Integer) runOnAudioCoroutineInvoke("setRightVolume", new Function0(f7, this) { // from class: com.bilibili.mediastreaming.audio.output.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final float f65757a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliAudioOutput f65758b;

            {
                this.f65757a = f7;
                this.f65758b = this;
            }

            public final Object invoke() {
                return BiliAudioOutput.setRightVolume$lambda$14(this.f65757a, this.f65758b);
            }
        });
        return num != null ? num.intValue() : -1;
    }

    public int setRightVolume(int i7) {
        if (i7 >= 0 && i7 <= 100) {
            return setRightVolume(i7 / 100.0f);
        }
        InterfaceC8094b.a(this, C3259x.a(i7, "volume must [0, 100] not is:"), TAG, null, 10);
        return -1;
    }

    public final boolean setTargetStreamConfig(final long j7, final int i7) {
        Boolean bool = (Boolean) runOnAudioCoroutineInvoke("setTargetStreamConfig", new Function0(this, j7, i7) { // from class: com.bilibili.mediastreaming.audio.output.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliAudioOutput f65733a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f65734b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f65735c;

            {
                this.f65733a = this;
                this.f65734b = j7;
                this.f65735c = i7;
            }

            public final Object invoke() {
                return BiliAudioOutput.setTargetStreamConfig$lambda$9(this.f65733a, this.f65734b, this.f65735c);
            }
        });
        return bool != null ? bool.booleanValue() : false;
    }

    public boolean setVolume(float f7) {
        if (f7 >= 0.0f && f7 <= 1.0f) {
            return setVolume(f7, f7);
        }
        InterfaceC8094b.a(this, G0.g.a(f7, "volume must [0.0f, 1.0f]. not is:"), TAG, null, 10);
        return false;
    }

    public boolean setVolume(final float f7, final float f8) {
        Boolean bool = (Boolean) runOnAudioCoroutineInvoke("setVolume", new Function0(this, f7, f8) { // from class: com.bilibili.mediastreaming.audio.output.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliAudioOutput f65730a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final float f65731b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final float f65732c;

            {
                this.f65730a = this;
                this.f65731b = f7;
                this.f65732c = f8;
            }

            public final Object invoke() {
                return BiliAudioOutput.setVolume$lambda$12(this.f65730a, this.f65731b, this.f65732c);
            }
        });
        return bool != null ? bool.booleanValue() : false;
    }

    public boolean setVolume(int i7) {
        if (i7 >= 0 && i7 <= 100) {
            return setVolume(i7, i7);
        }
        InterfaceC8094b.a(this, C3259x.a(i7, "volume must [0, 100] not is:"), TAG, null, 10);
        return false;
    }

    public boolean setVolume(final int i7, final int i8) {
        Boolean bool = (Boolean) runOnAudioCoroutineInvoke("setVolume", new Function0(this, i7, i8) { // from class: com.bilibili.mediastreaming.audio.output.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliAudioOutput f65742a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f65743b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f65744c;

            {
                this.f65742a = this;
                this.f65743b = i7;
                this.f65744c = i8;
            }

            public final Object invoke() {
                return BiliAudioOutput.setVolume$lambda$11(this.f65742a, this.f65743b, this.f65744c);
            }
        });
        return bool != null ? bool.booleanValue() : false;
    }

    public void unRegisterAudioLevelCallback() {
        InterfaceC8094b.b(this, "unRegisterAudioLevelCallback", TAG, 10);
        com.bilibili.mediastreaming.audio.croutine.d.e(this.mAudioOutputCoroutine, new Tq.k(this, 5));
    }

    public final void updateQueueCacheBufferMs(final int i7) {
        runOnAudioCoroutineInvoke("updateQueueCacheBufferMs", new Function0(this, i7) { // from class: com.bilibili.mediastreaming.audio.output.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliAudioOutput f65755a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f65756b;

            {
                this.f65755a = this;
                this.f65756b = i7;
            }

            public final Object invoke() {
                return BiliAudioOutput.updateQueueCacheBufferMs$lambda$6(this.f65755a, this.f65756b);
            }
        });
    }
}
