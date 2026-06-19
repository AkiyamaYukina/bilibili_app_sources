package com.bilibili.live.streaming;

import XM.a;
import android.app.Activity;
import android.content.Context;
import android.media.projection.MediaProjection;
import android.opengl.GLES31;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.appcompat.widget.C3259x;
import androidx.compose.animation.C3353d;
import androidx.compose.foundation.text.selection.C3751q;
import androidx.compose.foundation.text.selection.D0;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.bililive.usblivekit.pccon.status.PushStatus;
import com.bilibili.bililive.usblivekit.pccon.status.USBStatus;
import com.bilibili.live.streaming.callback.ILivePushEventCallback;
import com.bilibili.live.streaming.callback.VideoRenderedCallback;
import com.bilibili.live.streaming.encoder.BiliPushAVCodecUtils;
import com.bilibili.live.streaming.encoder.IEncoderStateCallback;
import com.bilibili.live.streaming.encoder.PushEncoderSink;
import com.bilibili.live.streaming.encoder.VideoEncodeState;
import com.bilibili.live.streaming.encoder.VideoEncoderFactory;
import com.bilibili.live.streaming.encoder.audio.BiliAudioEncoderOutput;
import com.bilibili.live.streaming.encoder.video.IVideoEncoder;
import com.bilibili.live.streaming.filter.FilterBase;
import com.bilibili.live.streaming.filter.IVideoSource;
import com.bilibili.live.streaming.gl.BEGLContext;
import com.bilibili.live.streaming.gl.BEGLSurface;
import com.bilibili.live.streaming.gl.BGLDrawer;
import com.bilibili.live.streaming.gl.BGLException;
import com.bilibili.live.streaming.gl.BGLFramebuffer;
import com.bilibili.live.streaming.gl.BGLTexture;
import com.bilibili.live.streaming.gl.BGLUtil;
import com.bilibili.live.streaming.gl.OpenGLConfig;
import com.bilibili.live.streaming.gl.Shaders;
import com.bilibili.live.streaming.log.LivePusherLog;
import com.bilibili.live.streaming.push.BiliConnectStatsExt;
import com.bilibili.live.streaming.push.BiliNetStatsExt;
import com.bilibili.live.streaming.push.BiliOutStreamFlashpoint;
import com.bilibili.live.streaming.push.BiliProtocolExt;
import com.bilibili.live.streaming.push.BiliPushProtocolType;
import com.bilibili.live.streaming.push.BiliUSBFlashpoint;
import com.bilibili.live.streaming.push.IBiliBizDefaultListener;
import com.bilibili.live.streaming.push.IBiliBizUSBListener;
import com.bilibili.live.streaming.sources.SceneSource;
import com.bilibili.live.streaming.utils.ExtMethodsKt;
import com.bilibili.mediastreaming.data.BiliProtocol;
import com.bilibili.mediastreaming.data.BiliPushReportMessage;
import com.bilibili.mediastreaming.data.BiliReportEvent;
import com.bilibili.mediastreaming.data.BiliSocketStatus;
import com.bilibili.mediastreaming.data.BiliSrtNetStats;
import com.bilibili.mediastreaming.data.BiliStatus;
import com.bilibili.mediastreaming.data.BiliTCPNetStats;
import com.bilibili.mediastreaming.enums.BiliAudioCodec;
import com.bilibili.mediastreaming.enums.BiliFlashpointErrorType;
import com.bilibili.mediastreaming.enums.BiliFlashpointPacketType;
import com.bilibili.mediastreaming.enums.BiliVideoCodec;
import com.bilibili.mediastreaming.enums.ConnectedStatusCode;
import com.bilibili.mediastreaming.enums.ConnectingStatusCode;
import com.bilibili.mediastreaming.enums.DisConnectStatusCode;
import com.bilibili.mediastreaming.enums.ErrorCode;
import com.bilibili.mediastreaming.enums.FirstPacketStatusCode;
import com.bilibili.mediastreaming.enums.SendPacketStatusCode;
import com.bilibili.mediastreaming.enums.StartStatusCode;
import com.bilibili.mediastreaming.enums.StoppedStatusCode;
import com.bilibili.mediastreaming.enums.StoppingStatusCode;
import com.bilibili.mediastreaming.flashpoint.BiliCallbackJavaFlashpoint;
import com.bilibili.mediastreaming.flashpoint.BiliDispatchManagementFlaspoint;
import com.bilibili.mediastreaming.flashpoint.h;
import com.bilibili.mediastreaming.video.IBiliSeiInKeyFrameInterface;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import kntr.app.mall.product.details.page.vm.PageViewModel;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/LivePush.class */
public final class LivePush implements IEncoderStateCallback, com.bilibili.mediastreaming.flashpoint.j, IBiliBizUSBListener {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "LivePush";

    @NotNull
    private static final String TAG_USB = "LivePush-USB";

    @NotNull
    private final Context activityContext;

    @Nullable
    private AudioSessionV2 audioSessionV2;

    @NotNull
    private final AVContext avContext;

    @NotNull
    private final HashMap<String, Object> cameraHolder;
    private int connectStatsIntervalS;

    @NotNull
    private CoroutineScope defaultBizCoroutineScope;
    private int dumpReportIntervalMinute;

    @Nullable
    private Integer encodeRenderTaskId;

    @NotNull
    private final EncoderManager encoderManager;

    @NotNull
    private final ConcurrentLinkedDeque<BiliCallbackJavaFlashpoint> flashPointList;

    @NotNull
    private String flashpointConfig;

    @NotNull
    private final Handler handler;
    private boolean isEnableWriteSei;
    private volatile long lastRenderPtsUs;

    @Nullable
    private Integer legacyRenderCallbackTaskId;

    @Nullable
    private volatile BiliAudioEncoderOutput mAudioEncoderV2;

    @Nullable
    private IBiliBizDefaultListener mBizDefaultListener;

    @Nullable
    private IBiliBizUSBListener mBizUsbListener;

    @Nullable
    private IEncoderStateCallback mEncoderStateCallback;

    @NotNull
    private final BiliDispatchManagementFlaspoint mFlashpointManagement;

    @Nullable
    private BiliOutStreamFlashpoint.OutStreamInterface mOutStreamInterface;

    @NotNull
    private final PushEncoderSink mPushSink;

    @Nullable
    private volatile IVideoEncoder mVideoEncoder;

    @Nullable
    private final MediaProjection mediaProjection;
    private int netLayerIntervalMs;

    @NotNull
    private final ConcurrentHashMap<String, Boolean> outStreams;

    @NotNull
    private final RenderPipeLine pipeLine;

    @NotNull
    private final PushManager pushManager;

    @Nullable
    private final SDKConfig sdkConfig;

    @Nullable
    private IBiliSeiInKeyFrameInterface seiInKeyFrameObserver;

    @NotNull
    private final ConcurrentHashMap<Integer, VideoFrameCallbackResource> videoFrameCallbackMap;

    @NotNull
    private final HashMap<Integer, VideoSession> videoSessionMap;

    @Nullable
    private Handler workHandler;

    @Nullable
    private HandlerThread workHandlerThread;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/LivePush$Builder.class */
    public static final class Builder {

        @NotNull
        private final Context appCtx;
        private boolean isEnableAudioSessionV2;
        private boolean isEnableWriteSei;

        @Nullable
        private IBiliBizDefaultListener mBizDefaultListener;

        @Nullable
        private IBiliBizUSBListener mBizUsbListener;

        @Nullable
        private String mDefaultFlashpointConfig;

        @Nullable
        private SDKConfig mSDKConfig;

        @Nullable
        private MediaProjection mediaProjection;

        @Nullable
        private IBiliSeiInKeyFrameInterface seiInKeyFrameObserver;

        @NotNull
        private HashMap<String, Object> cameraHolder = new HashMap<>();
        private int netLayerIntervalMs = -1;
        private int connectStatsIntervalS = -1;
        private int dumpReportIntervalMinute = -1;

        @NotNull
        private final EncoderManager mEncoderManager = new EncoderManager();

        public Builder(@NotNull Context context) {
            this.appCtx = context;
        }

        public static /* synthetic */ Builder enableWriteSei$default(Builder builder, IBiliSeiInKeyFrameInterface iBiliSeiInKeyFrameInterface, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                iBiliSeiInKeyFrameInterface = null;
            }
            return builder.enableWriteSei(iBiliSeiInKeyFrameInterface);
        }

        @NotNull
        public final LivePush build() {
            BiliLivePushLoader.INSTANCE.load();
            Context context = this.appCtx;
            MediaProjection mediaProjection = this.mediaProjection;
            HashMap<String, Object> map = this.cameraHolder;
            EncoderManager encoderManager = this.mEncoderManager;
            int i7 = this.netLayerIntervalMs;
            int i8 = this.connectStatsIntervalS;
            int i9 = this.dumpReportIntervalMinute;
            String str = this.mDefaultFlashpointConfig;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            return new LivePush(context, mediaProjection, map, encoderManager, i7, i8, i9, str2, this.mSDKConfig, this.isEnableWriteSei, this.seiInKeyFrameObserver, this.mBizUsbListener, this.mBizDefaultListener, null);
        }

        @NotNull
        public final Builder enableAudioSessionV2() {
            this.isEnableAudioSessionV2 = true;
            return this;
        }

        @NotNull
        public final Builder enableConnectStats(int i7) {
            this.connectStatsIntervalS = i7;
            return this;
        }

        @NotNull
        public final Builder enableDumpReport(int i7) {
            this.dumpReportIntervalMinute = i7;
            return this;
        }

        @NotNull
        public final Builder enableNativeLogger() {
            BiliLivePushLoader.INSTANCE.load();
            LivePusherLog.INSTANCE.enableNativeLogger();
            return this;
        }

        @NotNull
        public final Builder enableNetLayerMonitor(int i7) {
            this.netLayerIntervalMs = i7;
            return this;
        }

        @NotNull
        public final Builder enableWriteSei(@Nullable IBiliSeiInKeyFrameInterface iBiliSeiInKeyFrameInterface) {
            this.isEnableWriteSei = true;
            this.seiInKeyFrameObserver = iBiliSeiInKeyFrameInterface;
            return this;
        }

        @NotNull
        public final Context getAppCtx() {
            return this.appCtx;
        }

        @NotNull
        public final Builder registerBizDefaultPushListener(@NotNull IBiliBizDefaultListener iBiliBizDefaultListener) {
            this.mBizDefaultListener = iBiliBizDefaultListener;
            return this;
        }

        @NotNull
        public final Builder registerBizUSBPushListener(@NotNull IBiliBizUSBListener iBiliBizUSBListener) {
            this.mBizUsbListener = iBiliBizUSBListener;
            return this;
        }

        @NotNull
        public final Builder setAudioBitrate(int i7) {
            this.mEncoderManager.setAudioBitrate(i7);
            return this;
        }

        @NotNull
        public final Builder setCameraHolder(@NotNull HashMap<String, Object> map) {
            this.cameraHolder = map;
            return this;
        }

        @NotNull
        public final Builder setDefaultFlashpointConfig(@NotNull String str) {
            this.mDefaultFlashpointConfig = str;
            return this;
        }

        @NotNull
        public final Builder setEncoderRenderMode(@NotNull BEGLSurface.RenderMode renderMode) {
            this.mEncoderManager.setRenderMode(renderMode);
            return this;
        }

        @NotNull
        public final Builder setMediaProjection(@NotNull MediaProjection mediaProjection) {
            this.mediaProjection = mediaProjection;
            return this;
        }

        @NotNull
        public final Builder setSDKConfig(@Nullable String str) {
            SDKConfig sDKConfig = null;
            if (str != null) {
                if (StringsKt.isBlank(str)) {
                    sDKConfig = null;
                } else {
                    try {
                        sDKConfig = (SDKConfig) new Gson().fromJson(str, SDKConfig.class);
                    } catch (Exception e7) {
                        a.a.a.e(LivePush.TAG, C4496a.a("SDKConfig parse error, msg:", e7.getMessage()), e7);
                        sDKConfig = null;
                    }
                }
            }
            this.mSDKConfig = sDKConfig;
            return this;
        }

        @NotNull
        public final Builder setVideoBitRate(int i7) {
            this.mEncoderManager.setVideoBitRate(i7);
            return this;
        }

        @NotNull
        public final Builder setVideoFrameRate(int i7) {
            this.mEncoderManager.setVideoFrameRate(i7);
            return this;
        }

        @NotNull
        public final Builder setVideoIFrameInterval(int i7) {
            this.mEncoderManager.setVideoIFrameInterval(i7);
            return this;
        }

        @NotNull
        public final Builder setVideoResolution(int i7) {
            this.mEncoderManager.setVideoResolution(i7);
            return this;
        }

        @NotNull
        public final Builder setVideoResolution(int i7, int i8) {
            this.mEncoderManager.setVideoResolution(i7, i8);
            return this;
        }

        @NotNull
        public final Builder switchAVCPush() {
            this.mEncoderManager.useAVCEncoder();
            return this;
        }

        @NotNull
        public final Builder switchHEVCPush() {
            EncoderManager.useHEVCEncoder$default(this.mEncoderManager, false, 1, null);
            return this;
        }

        @NotNull
        public final Builder switchOnlyVoicePush() {
            this.mEncoderManager.useOnlyVoicePush();
            return this;
        }

        @NotNull
        public final Builder switchTestSpeedPush() {
            this.mEncoderManager.useTestSpeedPush();
            return this;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/LivePush$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/LivePush$VideoFrameCallbackResource.class */
    public static final class VideoFrameCallbackResource {

        @Nullable
        private BGLFramebuffer outFrameBuffer;

        @NotNull
        private final BGLTexture outTexture;

        @Nullable
        private BGLFramebuffer renderFrameBuffer;

        @NotNull
        private final BEGLSurface.RenderMode renderMode;

        @NotNull
        private final BGLTexture renderTexture;

        public VideoFrameCallbackResource(@NotNull BGLTexture bGLTexture, @NotNull BGLTexture bGLTexture2, @NotNull BEGLSurface.RenderMode renderMode, @Nullable BGLFramebuffer bGLFramebuffer, @Nullable BGLFramebuffer bGLFramebuffer2) {
            this.renderTexture = bGLTexture;
            this.outTexture = bGLTexture2;
            this.renderMode = renderMode;
            this.renderFrameBuffer = bGLFramebuffer;
            this.outFrameBuffer = bGLFramebuffer2;
        }

        public /* synthetic */ VideoFrameCallbackResource(BGLTexture bGLTexture, BGLTexture bGLTexture2, BEGLSurface.RenderMode renderMode, BGLFramebuffer bGLFramebuffer, BGLFramebuffer bGLFramebuffer2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(bGLTexture, bGLTexture2, renderMode, (i7 & 8) != 0 ? null : bGLFramebuffer, (i7 & 16) != 0 ? null : bGLFramebuffer2);
        }

        public static /* synthetic */ VideoFrameCallbackResource copy$default(VideoFrameCallbackResource videoFrameCallbackResource, BGLTexture bGLTexture, BGLTexture bGLTexture2, BEGLSurface.RenderMode renderMode, BGLFramebuffer bGLFramebuffer, BGLFramebuffer bGLFramebuffer2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                bGLTexture = videoFrameCallbackResource.renderTexture;
            }
            if ((i7 & 2) != 0) {
                bGLTexture2 = videoFrameCallbackResource.outTexture;
            }
            if ((i7 & 4) != 0) {
                renderMode = videoFrameCallbackResource.renderMode;
            }
            if ((i7 & 8) != 0) {
                bGLFramebuffer = videoFrameCallbackResource.renderFrameBuffer;
            }
            if ((i7 & 16) != 0) {
                bGLFramebuffer2 = videoFrameCallbackResource.outFrameBuffer;
            }
            return videoFrameCallbackResource.copy(bGLTexture, bGLTexture2, renderMode, bGLFramebuffer, bGLFramebuffer2);
        }

        @NotNull
        public final BGLTexture component1() {
            return this.renderTexture;
        }

        @NotNull
        public final BGLTexture component2() {
            return this.outTexture;
        }

        @NotNull
        public final BEGLSurface.RenderMode component3() {
            return this.renderMode;
        }

        @Nullable
        public final BGLFramebuffer component4() {
            return this.renderFrameBuffer;
        }

        @Nullable
        public final BGLFramebuffer component5() {
            return this.outFrameBuffer;
        }

        @NotNull
        public final VideoFrameCallbackResource copy(@NotNull BGLTexture bGLTexture, @NotNull BGLTexture bGLTexture2, @NotNull BEGLSurface.RenderMode renderMode, @Nullable BGLFramebuffer bGLFramebuffer, @Nullable BGLFramebuffer bGLFramebuffer2) {
            return new VideoFrameCallbackResource(bGLTexture, bGLTexture2, renderMode, bGLFramebuffer, bGLFramebuffer2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoFrameCallbackResource)) {
                return false;
            }
            VideoFrameCallbackResource videoFrameCallbackResource = (VideoFrameCallbackResource) obj;
            return Intrinsics.areEqual(this.renderTexture, videoFrameCallbackResource.renderTexture) && Intrinsics.areEqual(this.outTexture, videoFrameCallbackResource.outTexture) && this.renderMode == videoFrameCallbackResource.renderMode && Intrinsics.areEqual(this.renderFrameBuffer, videoFrameCallbackResource.renderFrameBuffer) && Intrinsics.areEqual(this.outFrameBuffer, videoFrameCallbackResource.outFrameBuffer);
        }

        @Nullable
        public final BGLFramebuffer getOutFrameBuffer() {
            return this.outFrameBuffer;
        }

        @NotNull
        public final BGLTexture getOutTexture() {
            return this.outTexture;
        }

        @Nullable
        public final BGLFramebuffer getRenderFrameBuffer() {
            return this.renderFrameBuffer;
        }

        @NotNull
        public final BEGLSurface.RenderMode getRenderMode() {
            return this.renderMode;
        }

        @NotNull
        public final BGLTexture getRenderTexture() {
            return this.renderTexture;
        }

        public int hashCode() {
            int iHashCode = this.renderTexture.hashCode();
            int iHashCode2 = this.outTexture.hashCode();
            int iHashCode3 = this.renderMode.hashCode();
            BGLFramebuffer bGLFramebuffer = this.renderFrameBuffer;
            int iHashCode4 = 0;
            int iHashCode5 = bGLFramebuffer == null ? 0 : bGLFramebuffer.hashCode();
            BGLFramebuffer bGLFramebuffer2 = this.outFrameBuffer;
            if (bGLFramebuffer2 != null) {
                iHashCode4 = bGLFramebuffer2.hashCode();
            }
            return ((((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31) + iHashCode5) * 31) + iHashCode4;
        }

        public final void setOutFrameBuffer(@Nullable BGLFramebuffer bGLFramebuffer) {
            this.outFrameBuffer = bGLFramebuffer;
        }

        public final void setRenderFrameBuffer(@Nullable BGLFramebuffer bGLFramebuffer) {
            this.renderFrameBuffer = bGLFramebuffer;
        }

        @NotNull
        public String toString() {
            return "VideoFrameCallbackResource(renderTexture=" + this.renderTexture + ", outTexture=" + this.outTexture + ", renderMode=" + this.renderMode + ", renderFrameBuffer=" + this.renderFrameBuffer + ", outFrameBuffer=" + this.outFrameBuffer + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/LivePush$WhenMappings.class */
    public static final /* synthetic */ class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BEGLSurface.RenderMode.values().length];
            try {
                iArr[BEGLSurface.RenderMode.HDR2SDR_SRGB.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BEGLSurface.RenderMode.HDR_HLG.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[BEGLSurface.RenderMode.HDR_PQ.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.live.streaming.LivePush$runOnDefaultBizCoroutine$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/LivePush$runOnDefaultBizCoroutine$1.class */
    public static final class C53561 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Function0<Unit> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C53561(Function0<Unit> function0, Continuation<? super C53561> continuation) {
            super(2, continuation);
            this.$block = function0;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C53561(this.$block, continuation);
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
            this.$block.invoke();
            return Unit.INSTANCE;
        }
    }

    static {
        a.a.a = new XM.a() { // from class: com.bilibili.live.streaming.LivePush.Companion.1
            public void d(String str, String str2, Throwable th) {
                LivePusherLog.d("LivePush-USB-" + str, str2, th);
            }

            public void e(String str, String str2, Throwable th) {
                LivePusherLog.e("LivePush-USB-" + str, str2, th);
            }

            public void i(String str, String str2, Throwable th) {
                LivePusherLog.i("LivePush-USB-" + str, str2, th);
            }

            public void v(String str, String str2, Throwable th) {
                LivePusherLog.v("LivePush-USB-" + str, str2, th);
            }

            public void w(String str, String str2, Throwable th) {
                LivePusherLog.w("LivePush-USB-" + str, str2, th);
            }
        };
    }

    private LivePush(Context context, MediaProjection mediaProjection, HashMap<String, Object> map, EncoderManager encoderManager, int i7, int i8, int i9, String str, SDKConfig sDKConfig, boolean z6, IBiliSeiInKeyFrameInterface iBiliSeiInKeyFrameInterface, IBiliBizUSBListener iBiliBizUSBListener, IBiliBizDefaultListener iBiliBizDefaultListener) throws BGLException, SecurityException, UnsatisfiedLinkError, NullPointerException {
        this.activityContext = context;
        this.mediaProjection = mediaProjection;
        this.cameraHolder = map;
        this.encoderManager = encoderManager;
        this.netLayerIntervalMs = i7;
        this.connectStatsIntervalS = i8;
        this.dumpReportIntervalMinute = i9;
        this.flashpointConfig = str;
        this.sdkConfig = sDKConfig;
        this.isEnableWriteSei = z6;
        this.seiInKeyFrameObserver = iBiliSeiInKeyFrameInterface;
        this.mBizUsbListener = iBiliBizUSBListener;
        this.mBizDefaultListener = iBiliBizDefaultListener;
        AVContext aVContext = new AVContext(context, encoderManager.getEncoderConfig$BiliLivePushStreaming_release(), mediaProjection, map);
        this.avContext = aVContext;
        Handler handler = new Handler();
        this.handler = handler;
        RenderPipeLine renderPipeLine = new RenderPipeLine(handler, encoderManager);
        this.pipeLine = renderPipeLine;
        BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint = new BiliDispatchManagementFlaspoint(this.flashpointConfig);
        this.mFlashpointManagement = biliDispatchManagementFlaspoint;
        this.outStreams = new ConcurrentHashMap<>();
        this.flashPointList = new ConcurrentLinkedDeque<>();
        PushEncoderSink pushEncoderSink = new PushEncoderSink(biliDispatchManagementFlaspoint);
        if (this.isEnableWriteSei) {
            pushEncoderSink.enableSeiWrite();
        }
        pushEncoderSink.setSeiInKeyFrameInterface(this.seiInKeyFrameObserver);
        this.mPushSink = pushEncoderSink;
        this.videoFrameCallbackMap = new ConcurrentHashMap<>();
        this.defaultBizCoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getDefault().limitedParallelism(1)));
        this.videoSessionMap = new HashMap<>();
        this.pushManager = new PushManager(aVContext, renderPipeLine);
        this.lastRenderPtsUs = -1L;
        LivePusherLog.i$default(TAG, "------------AndroidLivePush Version:20260604-004------------", null, 4, null);
        if (!(context instanceof Activity)) {
            throw new BGLException(BGLException.ID.FAIL_INIT, "activityContext is not an activity context!");
        }
        HandlerThread handlerThread = new HandlerThread("LivePushWork");
        this.workHandlerThread = handlerThread;
        handlerThread.start();
        this.workHandler = new Handler(handlerThread.getLooper());
        initializeOpenGLEnv();
        initializeAudioPipeline();
        initializeFlashpointManagement();
    }

    public /* synthetic */ LivePush(Context context, MediaProjection mediaProjection, HashMap map, EncoderManager encoderManager, int i7, int i8, int i9, String str, SDKConfig sDKConfig, boolean z6, IBiliSeiInKeyFrameInterface iBiliSeiInKeyFrameInterface, IBiliBizUSBListener iBiliBizUSBListener, IBiliBizDefaultListener iBiliBizDefaultListener, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, mediaProjection, map, encoderManager, i7, i8, i9, str, sDKConfig, z6, iBiliSeiInKeyFrameInterface, iBiliBizUSBListener, iBiliBizDefaultListener);
    }

    private final void callBackVideoFrameResult(VideoRenderedCallback videoRenderedCallback, IVideoSource iVideoSource, VideoFrameCallbackResource videoFrameCallbackResource) {
        BGLDrawer outputTexDrawer;
        boolean z6 = videoFrameCallbackResource.getRenderMode() != BEGLSurface.RenderMode.SDR_SRGB;
        int width = iVideoSource.getWidth();
        int height = iVideoSource.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        try {
            if (videoFrameCallbackResource.getRenderFrameBuffer() == null) {
                videoFrameCallbackResource.setRenderFrameBuffer(videoFrameCallbackResource.getRenderTexture().createFramebuffer(width, height, z6));
            }
            if (videoFrameCallbackResource.getOutFrameBuffer() == null) {
                videoFrameCallbackResource.setOutFrameBuffer(videoFrameCallbackResource.getOutTexture().createFramebuffer(width, height, z6));
            }
            BGLFramebuffer renderFrameBuffer = videoFrameCallbackResource.getRenderFrameBuffer();
            if (renderFrameBuffer != null) {
                renderFrameBuffer.setAsRenderTarget();
            }
            BGLUtil.clear(0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
            iVideoSource.render(1);
            BGLFramebuffer outFrameBuffer = videoFrameCallbackResource.getOutFrameBuffer();
            if (outFrameBuffer != null) {
                outFrameBuffer.setAsRenderTarget();
            }
            BGLUtil.clear(0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
            BEGLSurface.RenderMode renderMode = videoFrameCallbackResource.getRenderMode();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            Shaders.EETF eetf = iArr[renderMode.ordinal()] == 1 ? Shaders.EETF.BT2390 : Shaders.EETF.NO_CONV;
            int i7 = iArr[videoFrameCallbackResource.getRenderMode().ordinal()];
            Shaders.Primaries primaries = (i7 == 2 || i7 == 3) ? Shaders.Primaries.BT2020 : Shaders.Primaries.SRGB;
            int i8 = iArr[videoFrameCallbackResource.getRenderMode().ordinal()];
            Shaders.Transfer transfer = i8 != 2 ? i8 != 3 ? Shaders.Transfer.SRGB : Shaders.Transfer.PQ : Shaders.Transfer.HLG;
            BEGLContext eglContext = this.avContext.getEglContext();
            if (eglContext != null && (outputTexDrawer = eglContext.getOutputTexDrawer(eetf, primaries, transfer)) != null) {
                outputTexDrawer.drawTex(videoFrameCallbackResource.getRenderTexture());
            }
            videoRenderedCallback.onVideoRendered(videoFrameCallbackResource.getOutTexture().getTexName(), width, height);
        } catch (BGLException e7) {
            LivePusherLog.e(TAG, "An exception occurred while LivePush#callBackVideoFrameResult running, error_msg: " + e7.getMessage(), e7);
            if (videoFrameCallbackResource.getRenderTexture().getTexName() == 0 || videoFrameCallbackResource.getOutTexture().getTexName() == 0) {
                BGLFramebuffer renderFrameBuffer2 = videoFrameCallbackResource.getRenderFrameBuffer();
                if (renderFrameBuffer2 != null) {
                    renderFrameBuffer2.destroy();
                }
                BGLFramebuffer outFrameBuffer2 = videoFrameCallbackResource.getOutFrameBuffer();
                if (outFrameBuffer2 != null) {
                    outFrameBuffer2.destroy();
                }
                videoFrameCallbackResource.setRenderFrameBuffer(null);
                videoFrameCallbackResource.setOutFrameBuffer(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit destroy$lambda$42(LivePush livePush) {
        livePush.tryCatchException(new com.bilibili.ad.adview.pegasus.banner.toplive.m(livePush, 2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit destroy$lambda$42$lambda$41(LivePush livePush) throws BGLException {
        BEGLContext eglContext = livePush.avContext.getEglContext();
        if (eglContext != null) {
            eglContext.makeCurrent();
        }
        for (Integer num : CollectionsKt.toList(livePush.videoFrameCallbackMap.keySet())) {
            LivePusherLog.w$default(TAG, com.bilibili.app.comm.rubick.common.g.b(num, "push destroy unregisterVideoFrameCallbackV2 taskId:"), null, 4, null);
            livePush.unregisterVideoFrameCallbackV2(num.intValue());
        }
        livePush.pipeLine.stop();
        livePush.stopPush();
        livePush.pushManager.stopDataStatistics$BiliLivePushStreaming_release();
        BiliAudioEncoderOutput biliAudioEncoderOutput = livePush.mAudioEncoderV2;
        if (biliAudioEncoderOutput != null) {
            AudioSessionV2 audioSessionV2 = livePush.audioSessionV2;
            if (audioSessionV2 != null) {
                audioSessionV2.removeOutputSink(biliAudioEncoderOutput);
            }
            biliAudioEncoderOutput.release();
        }
        livePush.mAudioEncoderV2 = null;
        AudioSessionV2 audioSessionV22 = livePush.audioSessionV2;
        if (audioSessionV22 != null) {
            audioSessionV22.stop();
        }
        AudioSessionV2 audioSessionV23 = livePush.audioSessionV2;
        if (audioSessionV23 != null) {
            audioSessionV23.release();
        }
        livePush.audioSessionV2 = null;
        for (VideoSession videoSession : livePush.videoSessionMap.values()) {
            if (videoSession != null) {
                videoSession.destroy();
            }
        }
        livePush.videoSessionMap.clear();
        livePush.avContext.destroy();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroy$lambda$44(LivePush livePush) {
        HandlerThread handlerThread = livePush.workHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        livePush.workHandlerThread = null;
        livePush.workHandler = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit destroy$lambda$45(LivePush livePush) {
        livePush.mBizDefaultListener = null;
        livePush.mBizUsbListener = null;
        livePush.mEncoderStateCallback = null;
        try {
            CoroutineScopeKt.cancel$default(livePush.defaultBizCoroutineScope, (CancellationException) null, 1, (Object) null);
        } catch (Exception e7) {
            LivePusherLog.w$default(TAG, C4496a.a("defaultBizCoroutineScope cancel error, msg:", e7.getMessage()), null, 4, null);
        }
        return Unit.INSTANCE;
    }

    private final void initConfig() {
        SDKConfig sDKConfig = this.sdkConfig;
        SDKConfig sDKConfig2 = sDKConfig;
        if (sDKConfig == null) {
            sDKConfig2 = new SDKConfig();
        }
        LivePusherLog.i$default(TAG, com.bilibili.app.comm.bh.x5.a.a("initConfig, useFixEncoder:", ", filterProfileLevel:", sDKConfig2.getUseFixEncoder(), sDKConfig2.getFilterProfileLevel()), null, 4, null);
        this.encoderManager.getEncoderConfig$BiliLivePushStreaming_release().setUseFixEncoder(sDKConfig2.getUseFixEncoder());
        this.encoderManager.getEncoderConfig$BiliLivePushStreaming_release().setFilterProfileLevel(sDKConfig2.getFilterProfileLevel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initRenderPipeline$lambda$11(final LivePush livePush, final Ref.LongRef longRef, long j7) {
        livePush.tryCatchException(new Function0(livePush, longRef) { // from class: com.bilibili.live.streaming.r

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LivePush f65371a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Ref.LongRef f65372b;

            {
                this.f65371a = livePush;
                this.f65372b = longRef;
            }

            public final Object invoke() {
                return LivePush.initRenderPipeline$lambda$11$lambda$10(this.f65371a, this.f65372b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initRenderPipeline$lambda$11$lambda$10(LivePush livePush, Ref.LongRef longRef) throws BGLException {
        SceneSource sceneSource;
        BEGLContext eglContext = livePush.avContext.getEglContext();
        if (eglContext != null) {
            eglContext.makeCurrent();
        }
        longRef.element = livePush.avContext.getTimeStampUs();
        Iterator<T> it = livePush.avContext.getCommonSourceMap().values().iterator();
        while (it.hasNext()) {
            VideoUtils.Companion.tick((FilterBase) it.next(), longRef.element);
        }
        for (VideoSession videoSession : livePush.videoSessionMap.values()) {
            if (videoSession != null && (sceneSource = videoSession.getSceneSource()) != null) {
                VideoUtils.Companion.tick(sceneSource, longRef.element);
            }
        }
        livePush.avContext.markTickFinish();
        return Unit.INSTANCE;
    }

    private final void initializeAudioPipeline() {
        AudioSessionV2 audioSessionV2 = new AudioSessionV2(this.encoderManager);
        this.audioSessionV2 = audioSessionV2;
        audioSessionV2.setATrainTrackLoopIntervalTimeMs(200);
        LivePusherLog.i$default(TAG, "init audio encoder v2!", null, 4, null);
        BiliAudioEncoderOutput biliAudioEncoderOutput = this.mAudioEncoderV2;
        if (biliAudioEncoderOutput != null) {
            biliAudioEncoderOutput.release();
        }
        this.mAudioEncoderV2 = null;
        BiliAudioEncoderOutput biliAudioEncoderOutput2 = new BiliAudioEncoderOutput(this.avContext);
        biliAudioEncoderOutput2.init(this.encoderManager.getEncoderConfig$BiliLivePushStreaming_release());
        AudioSessionV2 audioSessionV22 = this.audioSessionV2;
        if (audioSessionV22 != null) {
            audioSessionV22.setAudioOutputEncoder(biliAudioEncoderOutput2);
        }
        this.mAudioEncoderV2 = biliAudioEncoderOutput2;
        LivePusherLog.i$default(TAG, "init audio encoder v2 done!", null, 4, null);
    }

    private final void initializeFlashpointManagement() {
        this.mPushSink.setEncoderStateCallback(this);
        BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint = this.mFlashpointManagement;
        com.bilibili.mediastreaming.flashpoint.h hVar = new com.bilibili.mediastreaming.flashpoint.h(this) { // from class: com.bilibili.live.streaming.LivePush.initializeFlashpointManagement.1
            final LivePush this$0;

            {
                this.this$0 = this;
            }

            @Override // com.bilibili.mediastreaming.flashpoint.h
            public h.a createFlashpoint(String str, String str2) {
                h.a aVar;
                if (StringsKt.equals(str, BiliOutStreamFlashpoint.PROTOCOL_TYPE, true) && str.length() == 3) {
                    BiliOutStreamFlashpoint.OutStreamInterface outStreamInterface = this.this$0.mOutStreamInterface;
                    if (outStreamInterface == null) {
                        return null;
                    }
                    BiliOutStreamFlashpoint biliOutStreamFlashpoint = new BiliOutStreamFlashpoint(outStreamInterface);
                    this.this$0.flashPointList.add(biliOutStreamFlashpoint);
                    aVar = biliOutStreamFlashpoint;
                } else {
                    aVar = null;
                    if (StringsKt.equals(str, BiliUSBFlashpoint.PROTOCOL_TYPE, true)) {
                        aVar = null;
                        if (str.length() == 3) {
                            ConcurrentLinkedDeque concurrentLinkedDeque = this.this$0.flashPointList;
                            if (concurrentLinkedDeque == null || !concurrentLinkedDeque.isEmpty()) {
                                Iterator it = concurrentLinkedDeque.iterator();
                                while (it.hasNext()) {
                                    if (Intrinsics.areEqual(((BiliCallbackJavaFlashpoint) it.next()).getProtocolType(), BiliUSBFlashpoint.PROTOCOL_TYPE)) {
                                        return null;
                                    }
                                }
                            }
                            BiliUSBFlashpoint biliUSBFlashpoint = new BiliUSBFlashpoint(this.this$0.getAvContext().getActivityContext());
                            biliUSBFlashpoint.setBizUSBListener(this.this$0);
                            this.this$0.flashPointList.add(biliUSBFlashpoint);
                            aVar = biliUSBFlashpoint;
                        }
                    }
                }
                return aVar;
            }
        };
        boolean zContainsKey = biliDispatchManagementFlaspoint.f65986g.containsKey("AndroidLivePush");
        biliDispatchManagementFlaspoint.logInfo(com.bilibili.app.comm.bh.x5.b.a("addRegisterFlashpointFactory, containsKey:", zContainsKey), null, null, null);
        if (!zContainsKey) {
            biliDispatchManagementFlaspoint.f65986g.put("AndroidLivePush", hVar);
        }
        BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint2 = this.mFlashpointManagement;
        biliDispatchManagementFlaspoint2.getClass();
        biliDispatchManagementFlaspoint2.logInfo("setFlashpointObserver, observer,obj:" + this, null, null, null);
        biliDispatchManagementFlaspoint2.f65982c = this;
    }

    private final void initializeOpenGLEnv() {
        tryCatchException(new Ex.c(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x018b -> B:35:0x00e7). Please report as a decompilation issue!!! */
    public static final Unit initializeOpenGLEnv$lambda$50(LivePush livePush) throws BGLException {
        boolean zBooleanValue;
        Boolean boolValueOf;
        List groupValues;
        String str;
        Float floatOrNull;
        BEGLContext eglContext = livePush.avContext.getEglContext();
        if (eglContext != null) {
            eglContext.makeCurrent();
        }
        String strGlGetString = GLES31.glGetString(7938);
        try {
            try {
                int[] iArr = new int[1];
                iArr[0] = 1;
                int[] iArr2 = new int[1];
                iArr2[0] = 1;
                GLES31.glGetIntegerv(33307, iArr, 0);
                GLES31.glGetIntegerv(33308, iArr2, 0);
                zBooleanValue = false;
                if ((iArr2[0] * 0.1f) + iArr[0] >= 3.1f) {
                    zBooleanValue = true;
                }
            } catch (Exception e7) {
                zBooleanValue = false;
                if (strGlGetString != null) {
                    MatchResult matchResultFind$default = Regex.find$default(new Regex("(\\d+\\.\\d+)"), strGlGetString, 0, 2, (Object) null);
                    if (matchResultFind$default == null || (groupValues = matchResultFind$default.getGroupValues()) == null || (str = (String) groupValues.get(1)) == null || (floatOrNull = StringsKt.toFloatOrNull(str)) == null) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(floatOrNull.floatValue() >= 3.1f);
                    }
                    zBooleanValue = false;
                    if (boolValueOf != null) {
                        zBooleanValue = boolValueOf.booleanValue();
                    }
                }
            }
        } catch (Exception e8) {
            zBooleanValue = false;
        }
        BAVEnviron bAVEnviron = BAVEnviron.INSTANCE;
        bAVEnviron.setGLES31Supported(zBooleanValue);
        bAVEnviron.setGl_version(strGlGetString);
        LivePusherLog.i$default("BAVEnviron", C4496a.a("glEsVersion:", bAVEnviron.getGl_version()), null, 4, null);
        try {
            bAVEnviron.setGl_renderer(GLES31.glGetString(7937));
            bAVEnviron.setGl_vendor(GLES31.glGetString(7936));
        } catch (Exception e9) {
        }
        livePush.avContext.enableBackgroundThread();
        livePush.avContext.setTimestampBeginPoint();
        livePush.avContext.setRailgunHandler(livePush.handler);
        BEGLContext eglContext2 = livePush.avContext.getEglContext();
        OpenGLConfig supportedOpenGLConfig = eglContext2 != null ? eglContext2.getSupportedOpenGLConfig() : null;
        if (supportedOpenGLConfig != null) {
            BAVEnviron bAVEnviron2 = BAVEnviron.INSTANCE;
            bAVEnviron2.setBt2020PqSupported(supportedOpenGLConfig.isBt2020PqSupported());
            bAVEnviron2.setSMPTE2086MetadataSupported(supportedOpenGLConfig.isSMPTE2086MetadataSupported());
        }
        runOnDefaultBizCoroutine$default(livePush, null, new com.bilibili.lib.fasthybrid.game.engine.core.render.webview.h(livePush, 1), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeOpenGLEnv$lambda$50$lambda$49(LivePush livePush) {
        BiliPushReportMessage biliPushReportMessage = new BiliPushReportMessage();
        LivePusherLog.i$default(TAG, C4496a.a("reportDevice:", new Gson().toJson(biliPushReportMessage)), null, 4, null);
        IBiliBizDefaultListener iBiliBizDefaultListener = livePush.mBizDefaultListener;
        if (iBiliBizDefaultListener != null) {
            iBiliBizDefaultListener.onEvent("live.push.device.tracker", biliPushReportMessage, System.currentTimeMillis());
        }
        return Unit.INSTANCE;
    }

    private final void innerInitEncoder() {
        final String mimeType = this.encoderManager.getEncoderConfig$BiliLivePushStreaming_release().getMimeType();
        String mimeType2 = this.encoderManager.getEncoderConfig$BiliLivePushStreaming_release().getMimeType();
        int iHashCode = mimeType2.hashCode();
        if (iHashCode != -1851077871) {
            if (iHashCode != -1662541442) {
                if (iHashCode == 1331836730 && mimeType2.equals(BiliPushAVCodecUtils.AVC_MIME)) {
                    this.mFlashpointManagement.u(BiliVideoCodec.AVC);
                }
            } else if (mimeType2.equals(BiliPushAVCodecUtils.HEVC_MIME)) {
                this.mFlashpointManagement.u(this.encoderManager.getEncoderConfig$BiliLivePushStreaming_release().getUseBiliHEVC() ? BiliVideoCodec.BILI_HEVC : BiliVideoCodec.HEVC);
            }
        } else if (mimeType2.equals(BiliPushAVCodecUtils.DOLBY_MIME)) {
            this.mFlashpointManagement.u(this.encoderManager.getEncoderConfig$BiliLivePushStreaming_release().getUseBiliHEVC() ? BiliVideoCodec.BILI_HEVC : BiliVideoCodec.HEVC);
        }
        BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint = this.mFlashpointManagement;
        BiliAudioCodec biliAudioCodec = BiliAudioCodec.AAC;
        biliDispatchManagementFlaspoint.f65984e = biliAudioCodec;
        biliDispatchManagementFlaspoint.logInfo("audioCodecType:" + biliAudioCodec, null, null, null);
        final BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint2 = this.mFlashpointManagement;
        final int encoderWidth = this.encoderManager.getEncoderWidth();
        final int encoderHeight = this.encoderManager.getEncoderHeight();
        final int frameRate = this.encoderManager.getFrameRate();
        final int videoBitRate = this.encoderManager.getVideoBitRate();
        final int channelCount = this.encoderManager.getChannelCount();
        final int sampleRateInHz = this.encoderManager.getSampleRateInHz();
        final int audioBitRate = this.encoderManager.getAudioBitRate();
        final String encoderName = BAVEnviron.INSTANCE.getEncoderName();
        biliDispatchManagementFlaspoint2.getClass();
        if (this.mVideoEncoder == null || this.mAudioEncoderV2 == null) {
            VideoEncoderFactory.Companion companion = VideoEncoderFactory.Companion;
            String videoCodecType$BiliLivePushStreaming_release = this.encoderManager.getVideoCodecType$BiliLivePushStreaming_release();
            boolean useFixEncoder = this.encoderManager.getEncoderConfig$BiliLivePushStreaming_release().getUseFixEncoder();
            HandlerThread handlerThread = this.workHandlerThread;
            this.mVideoEncoder = companion.getVideoEncoder(videoCodecType$BiliLivePushStreaming_release, useFixEncoder, handlerThread != null ? handlerThread.getLooper() : null);
            IVideoEncoder iVideoEncoder = this.mVideoEncoder;
            if (iVideoEncoder != null) {
                iVideoEncoder.init(this.avContext, this.encoderManager.getEncoderConfig$BiliLivePushStreaming_release(), this.mPushSink);
            }
            LivePusherLog.i$default(TAG, "audioEncoderV2 registerAudioEncoderCallback, pushSink obj:" + this.mPushSink, null, 4, null);
            BiliAudioEncoderOutput biliAudioEncoderOutput = this.mAudioEncoderV2;
            if (biliAudioEncoderOutput != null) {
                biliAudioEncoderOutput.registerAudioEncoderCallback(this.mPushSink);
            }
            BiliAudioEncoderOutput biliAudioEncoderOutput2 = this.mAudioEncoderV2;
            if (biliAudioEncoderOutput2 != null) {
                biliAudioEncoderOutput2.start();
            }
            BiliAudioEncoderOutput biliAudioEncoderOutput3 = this.mAudioEncoderV2;
            if (biliAudioEncoderOutput3 != null) {
                biliAudioEncoderOutput3.setReceiving(true);
            }
            IVideoEncoder iVideoEncoder2 = this.mVideoEncoder;
            if (iVideoEncoder2 != null) {
                iVideoEncoder2.start();
            }
            this.encodeRenderTaskId = Integer.valueOf(this.pipeLine.getRenderEvent().register(new Ex.b(this, 3)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit innerInitEncoder$lambda$53(LivePush livePush, long j7) {
        Object next;
        livePush.lastRenderPtsUs = livePush.avContext.getTimeStampUs();
        Iterator<T> it = livePush.videoSessionMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            VideoSession videoSession = (VideoSession) next;
            if (videoSession != null ? videoSession.isEncoder() : false) {
                break;
            }
        }
        VideoSession videoSession2 = (VideoSession) next;
        SceneSource sceneSource = null;
        if (videoSession2 != null) {
            sceneSource = videoSession2.getSceneSource();
        }
        IVideoEncoder iVideoEncoder = livePush.mVideoEncoder;
        if (iVideoEncoder != null) {
            IVideoEncoder.feedFrame$default(iVideoEncoder, sceneSource, livePush.lastRenderPtsUs, 0, 4, null);
        }
        return Unit.INSTANCE;
    }

    private final BEGLSurface.RenderMode normalizeVideoFrameCallbackRenderMode(BEGLSurface.RenderMode renderMode) {
        int i7 = WhenMappings.$EnumSwitchMapping$0[renderMode.ordinal()];
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? BEGLSurface.RenderMode.SDR_SRGB : BEGLSurface.RenderMode.HDR_PQ : BEGLSurface.RenderMode.HDR_HLG : BEGLSurface.RenderMode.HDR2SDR_SRGB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAudioEncoderState$lambda$56(LivePush livePush, int i7, String str) {
        BiliPushReportMessage biliPushReportMessage = new BiliPushReportMessage();
        BiliReportEvent biliReportEvent = new BiliReportEvent();
        biliReportEvent.setBlpLogMessage(str);
        biliPushReportMessage.setPushReports(CollectionsKt.mutableListOf(new BiliReportEvent[]{biliReportEvent}));
        IBiliBizDefaultListener iBiliBizDefaultListener = livePush.mBizDefaultListener;
        if (iBiliBizDefaultListener != null) {
            iBiliBizDefaultListener.onEvent("live.push.full.lifecycle.tracker", biliPushReportMessage, System.currentTimeMillis());
        }
        IEncoderStateCallback iEncoderStateCallback = livePush.mEncoderStateCallback;
        if (iEncoderStateCallback != null) {
            iEncoderStateCallback.onAudioEncoderState(i7, str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onConnectStats$lambda$62(String str, LivePush livePush, long j7) {
        if (str.length() == 0) {
            return Unit.INSTANCE;
        }
        List<BiliConnectStatsExt> list = (List) new Gson().fromJson(str, new TypeToken<List<? extends BiliConnectStatsExt>>() { // from class: com.bilibili.live.streaming.LivePush$onConnectStats$1$type$1
        }.getType());
        IVideoEncoder iVideoEncoder = livePush.mVideoEncoder;
        Long lValueOf = iVideoEncoder != null ? Long.valueOf(iVideoEncoder.getVideoInNum()) : null;
        IVideoEncoder iVideoEncoder2 = livePush.mVideoEncoder;
        Long lValueOf2 = iVideoEncoder2 != null ? Long.valueOf(iVideoEncoder2.getVideoOutNum()) : null;
        for (BiliConnectStatsExt biliConnectStatsExt : list) {
            biliConnectStatsExt.setVideoInNum(lValueOf);
            biliConnectStatsExt.setVideoOutNum(lValueOf2);
            biliConnectStatsExt.setProtocolType(BiliPushProtocolType.Companion.fromOrdinal(biliConnectStatsExt.getProtocol()));
        }
        IBiliBizDefaultListener iBiliBizDefaultListener = livePush.mBizDefaultListener;
        if (iBiliBizDefaultListener != null) {
            iBiliBizDefaultListener.onConnectStats(list, j7);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onConnected$lambda$59(LivePush livePush, BiliProtocol biliProtocol, int i7, BiliStatus biliStatus, int i8, long j7) {
        IBiliBizDefaultListener iBiliBizDefaultListener = livePush.mBizDefaultListener;
        if (iBiliBizDefaultListener != null) {
            iBiliBizDefaultListener.onConnected(new BiliProtocolExt(biliProtocol), i7, biliStatus, i8, j7);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onConnectedFirstPacket$lambda$65(LivePush livePush, BiliProtocol biliProtocol, BiliFlashpointPacketType biliFlashpointPacketType, BiliStatus biliStatus, long j7) {
        IBiliBizDefaultListener iBiliBizDefaultListener = livePush.mBizDefaultListener;
        if (iBiliBizDefaultListener != null) {
            iBiliBizDefaultListener.onConnectedFirstPacket(new BiliProtocolExt(biliProtocol), biliFlashpointPacketType, biliStatus, j7);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onConnecting$lambda$58(LivePush livePush, BiliProtocol biliProtocol, BiliStatus biliStatus, long j7) {
        IBiliBizDefaultListener iBiliBizDefaultListener = livePush.mBizDefaultListener;
        if (iBiliBizDefaultListener != null) {
            iBiliBizDefaultListener.onConnecting(new BiliProtocolExt(biliProtocol), biliStatus, j7);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDisconnect$lambda$67(LivePush livePush, BiliProtocol biliProtocol, BiliStatus biliStatus, long j7) {
        IBiliBizDefaultListener iBiliBizDefaultListener = livePush.mBizDefaultListener;
        if (iBiliBizDefaultListener != null) {
            iBiliBizDefaultListener.onDisconnect(new BiliProtocolExt(biliProtocol), biliStatus, j7);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onError$lambda$71(LivePush livePush, BiliProtocol biliProtocol, BiliFlashpointErrorType biliFlashpointErrorType, BiliStatus biliStatus, long j7) {
        IBiliBizDefaultListener iBiliBizDefaultListener = livePush.mBizDefaultListener;
        if (iBiliBizDefaultListener != null) {
            iBiliBizDefaultListener.onError(new BiliProtocolExt(biliProtocol), biliFlashpointErrorType, biliStatus, j7);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEvent$lambda$73(String str, LivePush livePush, String str2, long j7) {
        if (str.length() == 0) {
            return Unit.INSTANCE;
        }
        List<BiliReportEvent> list = (List) new Gson().fromJson(str, new TypeToken<List<? extends BiliReportEvent>>() { // from class: com.bilibili.live.streaming.LivePush$onEvent$1$type$1
        }.getType());
        BiliPushReportMessage biliPushReportMessage = new BiliPushReportMessage();
        biliPushReportMessage.setPushReports(list);
        IBiliBizDefaultListener iBiliBizDefaultListener = livePush.mBizDefaultListener;
        if (iBiliBizDefaultListener != null) {
            iBiliBizDefaultListener.onEvent(str2, biliPushReportMessage, j7);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNetStats$lambda$64(String str, LivePush livePush, long j7) {
        if (str.length() == 0) {
            return Unit.INSTANCE;
        }
        List<BiliNetStatsExt> list = (List) new Gson().fromJson(str, new TypeToken<List<? extends BiliNetStatsExt>>() { // from class: com.bilibili.live.streaming.LivePush$onNetStats$1$type$1
        }.getType());
        for (BiliNetStatsExt biliNetStatsExt : list) {
            biliNetStatsExt.setProtocolType(BiliPushProtocolType.Companion.fromOrdinal(biliNetStatsExt.getProtocol()));
            BiliTCPNetStats tcp = biliNetStatsExt.getTcp();
            if (tcp != null) {
                BiliSocketStatus.a aVar = BiliSocketStatus.Companion;
                BiliTCPNetStats tcp2 = biliNetStatsExt.getTcp();
                Integer numValueOf = tcp2 != null ? Integer.valueOf(tcp2.getSocketStatus()) : null;
                aVar.getClass();
                tcp.setSocketStatusEnum(BiliSocketStatus.a.a(numValueOf));
            }
            BiliSrtNetStats srt = biliNetStatsExt.getSrt();
            if (srt != null) {
                BiliSocketStatus.a aVar2 = BiliSocketStatus.Companion;
                BiliSrtNetStats srt2 = biliNetStatsExt.getSrt();
                Integer numValueOf2 = srt2 != null ? Integer.valueOf(srt2.getSocketStatus()) : null;
                aVar2.getClass();
                srt.setSocketStatusEnum(BiliSocketStatus.a.a(numValueOf2));
            }
        }
        IBiliBizDefaultListener iBiliBizDefaultListener = livePush.mBizDefaultListener;
        if (iBiliBizDefaultListener != null) {
            iBiliBizDefaultListener.onNetStats(list, j7);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSendPacketFail$lambda$66(LivePush livePush, BiliProtocol biliProtocol, BiliFlashpointPacketType biliFlashpointPacketType, BiliStatus biliStatus, long j7) {
        IBiliBizDefaultListener iBiliBizDefaultListener = livePush.mBizDefaultListener;
        if (iBiliBizDefaultListener != null) {
            iBiliBizDefaultListener.onSendPacketFail(new BiliProtocolExt(biliProtocol), biliFlashpointPacketType, biliStatus, j7);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$57(LivePush livePush, BiliProtocol biliProtocol, BiliStatus biliStatus, long j7) {
        IBiliBizDefaultListener iBiliBizDefaultListener = livePush.mBizDefaultListener;
        if (iBiliBizDefaultListener != null) {
            iBiliBizDefaultListener.onStart(new BiliProtocolExt(biliProtocol), biliStatus, j7);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStopped$lambda$70(LivePush livePush, BiliProtocol biliProtocol, BiliStatus biliStatus, long j7) {
        IBiliBizDefaultListener iBiliBizDefaultListener = livePush.mBizDefaultListener;
        if (iBiliBizDefaultListener != null) {
            iBiliBizDefaultListener.onStopped(new BiliProtocolExt(biliProtocol), biliStatus, j7);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStopping$lambda$68(LivePush livePush, BiliProtocol biliProtocol, BiliStatus biliStatus, long j7) {
        IBiliBizDefaultListener iBiliBizDefaultListener = livePush.mBizDefaultListener;
        if (iBiliBizDefaultListener != null) {
            iBiliBizDefaultListener.onStopping(new BiliProtocolExt(biliProtocol), biliStatus, j7);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUSBConnectStatusChange$lambda$78(LivePush livePush, USBStatus uSBStatus) {
        IBiliBizUSBListener iBiliBizUSBListener = livePush.mBizUsbListener;
        if (iBiliBizUSBListener != null) {
            iBiliBizUSBListener.onUSBConnectStatusChange(uSBStatus);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUSBError$lambda$76(LivePush livePush, String str) {
        IBiliBizUSBListener iBiliBizUSBListener = livePush.mBizUsbListener;
        if (iBiliBizUSBListener != null) {
            iBiliBizUSBListener.onUSBError(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUSBPushStatusChange$lambda$77(LivePush livePush, PushStatus pushStatus) {
        IBiliBizUSBListener iBiliBizUSBListener = livePush.mBizUsbListener;
        if (iBiliBizUSBListener != null) {
            iBiliBizUSBListener.onUSBPushStatusChange(pushStatus);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUSBReady$lambda$74(LivePush livePush, byte[] bArr) {
        IBiliBizUSBListener iBiliBizUSBListener = livePush.mBizUsbListener;
        if (iBiliBizUSBListener != null) {
            iBiliBizUSBListener.onUSBReady(bArr);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUSBStop$lambda$75(LivePush livePush) {
        IBiliBizUSBListener iBiliBizUSBListener = livePush.mBizUsbListener;
        if (iBiliBizUSBListener != null) {
            iBiliBizUSBListener.onUSBStop();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onVideoEncoderState$lambda$54(LivePush livePush, VideoEncodeState videoEncodeState, String str) {
        IEncoderStateCallback iEncoderStateCallback = livePush.mEncoderStateCallback;
        if (iEncoderStateCallback != null) {
            iEncoderStateCallback.onVideoEncoderState(videoEncodeState, str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit putVideoSession$lambda$4(LivePush livePush, VideoSession videoSession) {
        VideoSession videoSession2 = livePush.videoSessionMap.get(videoSession.getVideoSessionID());
        if (videoSession2 != null) {
            videoSession2.destroy();
        }
        Integer videoSessionID = videoSession.getVideoSessionID();
        if (videoSessionID != null) {
            livePush.videoSessionMap.put(Integer.valueOf(videoSessionID.intValue()), videoSession);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ int registerExternalMainVideoFrameCallback$default(LivePush livePush, VideoRenderedCallback videoRenderedCallback, BEGLSurface.RenderMode renderMode, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            renderMode = BEGLSurface.RenderMode.SDR_SRGB;
        }
        return livePush.registerExternalMainVideoFrameCallback(videoRenderedCallback, renderMode);
    }

    public static /* synthetic */ void registerMainVideoFrameCallback$default(LivePush livePush, VideoRenderedCallback videoRenderedCallback, String str, BEGLSurface.RenderMode renderMode, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str = null;
        }
        if ((i7 & 4) != 0) {
            renderMode = BEGLSurface.RenderMode.SDR_SRGB;
        }
        livePush.registerMainVideoFrameCallback(videoRenderedCallback, str, renderMode);
    }

    public static /* synthetic */ void registerVideoFrameCallback$default(LivePush livePush, VideoRenderedCallback videoRenderedCallback, int i7, String str, BEGLSurface.RenderMode renderMode, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str = null;
        }
        if ((i8 & 8) != 0) {
            renderMode = BEGLSurface.RenderMode.SDR_SRGB;
        }
        livePush.registerVideoFrameCallback(videoRenderedCallback, i7, str, renderMode);
    }

    public static /* synthetic */ int registerVideoFrameCallbackV2$default(LivePush livePush, VideoRenderedCallback videoRenderedCallback, Integer num, String str, BEGLSurface.RenderMode renderMode, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            num = null;
        }
        if ((i7 & 4) != 0) {
            str = null;
        }
        if ((i7 & 8) != 0) {
            renderMode = BEGLSurface.RenderMode.SDR_SRGB;
        }
        return livePush.registerVideoFrameCallbackV2(videoRenderedCallback, num, str, renderMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit registerVideoFrameCallbackV2$lambda$32(final java.lang.Integer r10, final com.bilibili.live.streaming.LivePush r11, com.bilibili.live.streaming.gl.BEGLSurface.RenderMode r12, kotlin.jvm.internal.Ref.IntRef r13, final com.bilibili.live.streaming.callback.VideoRenderedCallback r14, final java.lang.String r15) throws com.bilibili.live.streaming.gl.BGLException {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.live.streaming.LivePush.registerVideoFrameCallbackV2$lambda$32(java.lang.Integer, com.bilibili.live.streaming.LivePush, com.bilibili.live.streaming.gl.BEGLSurface$RenderMode, kotlin.jvm.internal.Ref$IntRef, com.bilibili.live.streaming.callback.VideoRenderedCallback, java.lang.String):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerVideoFrameCallbackV2$lambda$32$lambda$31(LivePush livePush, Integer num, String str, VideoRenderedCallback videoRenderedCallback, VideoFrameCallbackResource videoFrameCallbackResource, long j7) {
        Object next;
        SceneSource sceneSource;
        livePush.avContext.waitTickFinish();
        if (num != null) {
            VideoSession videoSession = livePush.videoSessionMap.get(num);
            sceneSource = null;
            if (videoSession != null) {
                sceneSource = videoSession.getSceneSource();
            }
        } else {
            Iterator<T> it = livePush.videoSessionMap.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                VideoSession videoSession2 = (VideoSession) next;
                if (videoSession2 != null && videoSession2.isEncoder()) {
                    break;
                }
            }
            VideoSession videoSession3 = (VideoSession) next;
            sceneSource = null;
            if (videoSession3 != null) {
                sceneSource = videoSession3.getSceneSource();
            }
        }
        if (sceneSource == null) {
            return Unit.INSTANCE;
        }
        IVideoSource iVideoSource = sceneSource;
        if (str != null) {
            IVideoSource iVideoSourceFindInnerFilter = sceneSource.findInnerFilter(str);
            iVideoSource = iVideoSourceFindInnerFilter;
            if (iVideoSourceFindInnerFilter == null) {
                return Unit.INSTANCE;
            }
        }
        livePush.callBackVideoFrameResult(videoRenderedCallback, iVideoSource, videoFrameCallbackResource);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeVideoSession$lambda$5(LivePush livePush, int i7) {
        VideoSession videoSession = livePush.videoSessionMap.get(Integer.valueOf(i7));
        if (videoSession != null) {
            videoSession.destroy();
        }
        livePush.videoSessionMap.put(Integer.valueOf(i7), null);
        LivePusherLog.i$default(VideoSession.TAG, "removeVideoSession " + i7, null, 4, null);
        return Unit.INSTANCE;
    }

    private final void requestKeyFrame() {
        IVideoEncoder iVideoEncoder = this.mVideoEncoder;
        if (iVideoEncoder != null) {
            iVideoEncoder.requestKeyFrame();
        }
    }

    public static /* synthetic */ void restartPush$default(LivePush livePush, Integer num, Integer num2, Integer num3, Function2 function2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = null;
        }
        if ((i7 & 2) != 0) {
            num2 = null;
        }
        if ((i7 & 4) != 0) {
            num3 = null;
        }
        livePush.restartPush(num, num2, num3, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit restartPush$lambda$25(LivePush livePush, Function2 function2) {
        IVideoEncoder iVideoEncoder = livePush.mVideoEncoder;
        if (iVideoEncoder != null) {
            iVideoEncoder.restart(function2);
        }
        return Unit.INSTANCE;
    }

    private final void runOnDefaultBizCoroutine(String str, Function0<Unit> function0) {
        BuildersKt.launch$default(this.defaultBizCoroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C53561(function0, null), 3, (Object) null);
    }

    public static /* synthetic */ void runOnDefaultBizCoroutine$default(LivePush livePush, String str, Function0 function0, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        livePush.runOnDefaultBizCoroutine(str, function0);
    }

    public static /* synthetic */ void runPipelineOnce$default(LivePush livePush, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = livePush.avContext.getTimeStampUs();
        }
        livePush.runPipelineOnce(j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setEncoderStateCallback$lambda$2(LivePush livePush, IEncoderStateCallback iEncoderStateCallback) {
        livePush.mEncoderStateCallback = iEncoderStateCallback;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startConnect$lambda$17(LivePush livePush, String str, String str2) {
        BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint = livePush.mFlashpointManagement;
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        biliDispatchManagementFlaspoint.y(str, str3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startConnect$lambda$19(LivePush livePush, String str, String str2) {
        AudioSessionV2 audioSessionV2 = livePush.audioSessionV2;
        if (audioSessionV2 != null) {
            audioSessionV2.start();
        }
        BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint = livePush.mFlashpointManagement;
        int i7 = livePush.netLayerIntervalMs;
        if (i7 > 0) {
            biliDispatchManagementFlaspoint.x(i7);
        }
        int i8 = livePush.connectStatsIntervalS;
        if (i8 > 0) {
            biliDispatchManagementFlaspoint.w(i8);
        }
        int i9 = livePush.dumpReportIntervalMinute;
        if (i9 > 0) {
            biliDispatchManagementFlaspoint.v(i9);
        }
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        biliDispatchManagementFlaspoint.y(str, str3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startEncoder$lambda$60(LivePush livePush) {
        if (livePush.mVideoEncoder == null) {
            livePush.innerInitEncoder();
        } else {
            livePush.requestKeyFrame();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startPush$lambda$13(LivePush livePush, String str, String str2) {
        BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint = livePush.mFlashpointManagement;
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        biliDispatchManagementFlaspoint.y(str, str3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startPush$lambda$15(LivePush livePush, String str, String str2) {
        AudioSessionV2 audioSessionV2 = livePush.audioSessionV2;
        if (audioSessionV2 != null) {
            audioSessionV2.start();
        }
        livePush.innerInitEncoder();
        BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint = livePush.mFlashpointManagement;
        int i7 = livePush.netLayerIntervalMs;
        if (i7 > 0) {
            biliDispatchManagementFlaspoint.x(i7);
        }
        int i8 = livePush.connectStatsIntervalS;
        if (i8 > 0) {
            biliDispatchManagementFlaspoint.w(i8);
        }
        int i9 = livePush.dumpReportIntervalMinute;
        if (i9 > 0) {
            biliDispatchManagementFlaspoint.v(i9);
        }
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        biliDispatchManagementFlaspoint.y(str, str3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit stopPush$lambda$37(LivePush livePush) {
        LivePusherLog.i$default(TAG, "stopPush", null, 4, null);
        BiliAudioEncoderOutput biliAudioEncoderOutput = livePush.mAudioEncoderV2;
        if (biliAudioEncoderOutput != null) {
            biliAudioEncoderOutput.setReceiving(false);
        }
        AudioSessionV2 audioSessionV2 = livePush.audioSessionV2;
        if (audioSessionV2 != null) {
            audioSessionV2.stop();
        }
        Integer num = livePush.encodeRenderTaskId;
        if (num != null) {
            int iIntValue = num.intValue();
            LivePusherLog.i$default(TAG, C3259x.a(iIntValue, "pipeLine renderEvent, unregister:"), null, 4, null);
            livePush.pipeLine.getRenderEvent().unregister(iIntValue);
        }
        livePush.encodeRenderTaskId = null;
        LivePusherLog.i$default(TAG, "stopPush -> mAudioEncoderV2:" + livePush.mAudioEncoderV2, null, 4, null);
        BiliAudioEncoderOutput biliAudioEncoderOutput2 = livePush.mAudioEncoderV2;
        if (biliAudioEncoderOutput2 != null) {
            biliAudioEncoderOutput2.stop();
        }
        PushManager pushManager = livePush.pushManager;
        BiliAudioEncoderOutput biliAudioEncoderOutput3 = livePush.mAudioEncoderV2;
        pushManager.setAudioEncoderDurationS$BiliLivePushStreaming_release(biliAudioEncoderOutput3 != null ? biliAudioEncoderOutput3.getAudioDurationS() : 0.0f);
        LivePusherLog.i$default(TAG, "stopPush -> mVideoEncoder:" + livePush.mVideoEncoder, null, 4, null);
        IVideoEncoder iVideoEncoder = livePush.mVideoEncoder;
        if (iVideoEncoder != null) {
            LivePusherLog.i$default(TAG, "stopPush -> mVideoEncoder:it.stop()", null, 4, null);
            iVideoEncoder.stop();
            LivePusherLog.i$default(TAG, "stopPush -> it.getEncoderGeneratedBytes()", null, 4, null);
            livePush.pushManager.setEncoderGeneratedBytes$BiliLivePushStreaming_release(iVideoEncoder.getEncoderGeneratedBytes());
            LivePusherLog.i$default(TAG, "stopPush -> it.getDropRedundanceBytes()", null, 4, null);
            livePush.pushManager.setDropRedundanceBytes$BiliLivePushStreaming_release(iVideoEncoder.getDropRedundanceBytes());
            LivePusherLog.i$default(TAG, "stopPush -> it.getEncoderAverageFPS()", null, 4, null);
            livePush.pushManager.setVideoEncoderAverageFPS$BiliLivePushStreaming_release(iVideoEncoder.getEncoderAverageFPS());
            LivePusherLog.i$default(TAG, "stopPush -> it.getVideoWorkDurationUs()", null, 4, null);
            livePush.pushManager.setVideoEncoderDurationUs$BiliLivePushStreaming_release(iVideoEncoder.getVideoWorkDurationUs());
            LivePusherLog.i$default(TAG, "encoder destroy", null, 4, null);
            iVideoEncoder.destroy();
        }
        livePush.mVideoEncoder = null;
        LivePusherLog.i$default(TAG, "stopPush done!", null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit swapVideoSessionSource$lambda$6(LivePush livePush, int i7, int i8, Ref.BooleanRef booleanRef) {
        VideoSession videoSession;
        SceneSource sceneSource;
        SceneSource sceneSource2;
        VideoSession videoSession2 = livePush.videoSessionMap.get(Integer.valueOf(i7));
        if (videoSession2 != null && (videoSession = livePush.videoSessionMap.get(Integer.valueOf(i8))) != null && (sceneSource = videoSession2.getSceneSource()) != null && (sceneSource2 = videoSession.getSceneSource()) != null) {
            VideoSession.setSceneSource$default(videoSession2, sceneSource2, false, 2, null);
            VideoSession.setSceneSource$default(videoSession, sceneSource, false, 2, null);
            booleanRef.element = true;
            Integer videoSessionID = videoSession2.getVideoSessionID();
            boolean zIsEncoder = videoSession2.isEncoder();
            Integer videoSessionID2 = videoSession2.getVideoSessionID();
            boolean zIsEncoder2 = videoSession.isEncoder();
            StringBuilder sb = new StringBuilder("swapVideoSessionSource ");
            sb.append(i7);
            sb.append(" ");
            sb.append(videoSessionID);
            sb.append("-");
            C3353d.b(" swap ", " ", i8, zIsEncoder, sb);
            sb.append(videoSessionID2);
            sb.append("-");
            sb.append(zIsEncoder2);
            LivePusherLog.i$default(VideoSession.TAG, sb.toString(), null, 4, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    private final void tryCatchException(Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (Exception e7) {
            LivePusherLog.e$default(TAG, C4496a.a("tryCatchException > ", e7.getMessage()), null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unregisterVideoFrameCallbackV2$lambda$34(LivePush livePush, int i7) {
        livePush.pipeLine.getRenderEvent().unregister(i7);
        VideoFrameCallbackResource videoFrameCallbackResourceRemove = livePush.videoFrameCallbackMap.remove(Integer.valueOf(i7));
        if (videoFrameCallbackResourceRemove != null) {
            BGLFramebuffer renderFrameBuffer = videoFrameCallbackResourceRemove.getRenderFrameBuffer();
            if (renderFrameBuffer != null) {
                renderFrameBuffer.destroy();
            }
            BGLFramebuffer outFrameBuffer = videoFrameCallbackResourceRemove.getOutFrameBuffer();
            if (outFrameBuffer != null) {
                outFrameBuffer.destroy();
            }
            videoFrameCallbackResourceRemove.getRenderTexture().destroy();
            videoFrameCallbackResourceRemove.getOutTexture().destroy();
        }
        return Unit.INSTANCE;
    }

    public final void appendSeiData(@NotNull String str, @NotNull byte[] bArr) {
        this.mPushSink.appendSei(str, bArr);
    }

    public final void changeGetConnectInfoInterval(int i7) {
        this.mFlashpointManagement.n(i7);
    }

    public final void changeGetNetStatsInfo(int i7) {
        this.mFlashpointManagement.o(i7);
    }

    @NotNull
    public final VideoSession createVideoSession() {
        return new VideoSession(this.handler, this.avContext, this.pipeLine);
    }

    public final void destroy() {
        ExtMethodsKt.invoke(this.handler, new com.bilibili.ad.adview.pegasus.banner.toplive.f(this, 1));
        this.mPushSink.destroy();
        BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint = this.mFlashpointManagement;
        synchronized (biliDispatchManagementFlaspoint) {
            biliDispatchManagementFlaspoint.p("destroy", new LR0.c(biliDispatchManagementFlaspoint, 2));
        }
        Iterator<T> it = this.flashPointList.iterator();
        while (it.hasNext()) {
            ((BiliCallbackJavaFlashpoint) it.next()).destroy();
        }
        this.flashPointList.clear();
        Handler handler = this.workHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.workHandler;
        if (handler2 != null) {
            handler2.post(new com.bilibili.biligame.helper.s(this, 2));
        }
        runOnDefaultBizCoroutine$default(this, null, new ZR.a(this, 4), 1, null);
    }

    public final void disableSei() {
        this.mPushSink.disableSeiWrite();
    }

    public final void enableSei() {
        this.mPushSink.enableSeiWrite();
    }

    @Nullable
    public final AudioSessionV2 getAudioSessionV2() {
        return this.audioSessionV2;
    }

    @NotNull
    public final AVContext getAvContext() {
        return this.avContext;
    }

    @Nullable
    public final List<BiliConnectStatsExt> getConnectStats() {
        String strQ = this.mFlashpointManagement.q();
        if (strQ == null || strQ.length() == 0) {
            return null;
        }
        List<BiliConnectStatsExt> list = (List) new Gson().fromJson(strQ, new TypeToken<List<? extends BiliConnectStatsExt>>() { // from class: com.bilibili.live.streaming.LivePush$getConnectStats$type$1
        }.getType());
        IVideoEncoder iVideoEncoder = this.mVideoEncoder;
        Long lValueOf = iVideoEncoder != null ? Long.valueOf(iVideoEncoder.getVideoInNum()) : null;
        IVideoEncoder iVideoEncoder2 = this.mVideoEncoder;
        Long lValueOf2 = iVideoEncoder2 != null ? Long.valueOf(iVideoEncoder2.getVideoOutNum()) : null;
        for (BiliConnectStatsExt biliConnectStatsExt : list) {
            biliConnectStatsExt.setVideoInNum(lValueOf);
            biliConnectStatsExt.setVideoOutNum(lValueOf2);
            biliConnectStatsExt.setProtocolType(BiliPushProtocolType.Companion.fromOrdinal(biliConnectStatsExt.getProtocol()));
        }
        return list;
    }

    @NotNull
    public final EncoderManager getEncoderManager() {
        return this.encoderManager;
    }

    @Nullable
    public final List<BiliNetStatsExt> getNetLayersStats() {
        String strR = this.mFlashpointManagement.r();
        if (strR == null || strR.length() == 0) {
            return null;
        }
        List<BiliNetStatsExt> list = (List) new Gson().fromJson(strR, new TypeToken<List<? extends BiliNetStatsExt>>() { // from class: com.bilibili.live.streaming.LivePush$getNetLayersStats$type$1
        }.getType());
        for (BiliNetStatsExt biliNetStatsExt : list) {
            biliNetStatsExt.setProtocolType(BiliPushProtocolType.Companion.fromOrdinal(biliNetStatsExt.getProtocol()));
            BiliTCPNetStats tcp = biliNetStatsExt.getTcp();
            if (tcp != null) {
                BiliSocketStatus.a aVar = BiliSocketStatus.Companion;
                BiliTCPNetStats tcp2 = biliNetStatsExt.getTcp();
                Integer numValueOf = tcp2 != null ? Integer.valueOf(tcp2.getSocketStatus()) : null;
                aVar.getClass();
                tcp.setSocketStatusEnum(BiliSocketStatus.a.a(numValueOf));
            }
            BiliSrtNetStats srt = biliNetStatsExt.getSrt();
            if (srt != null) {
                BiliSocketStatus.a aVar2 = BiliSocketStatus.Companion;
                BiliSrtNetStats srt2 = biliNetStatsExt.getSrt();
                Integer numValueOf2 = srt2 != null ? Integer.valueOf(srt2.getSocketStatus()) : null;
                aVar2.getClass();
                srt.setSocketStatusEnum(BiliSocketStatus.a.a(numValueOf2));
            }
        }
        return list;
    }

    @NotNull
    public final PushManager getPushManager() {
        return this.pushManager;
    }

    @Nullable
    public final Handler getRenderHandler() {
        return this.handler;
    }

    public final long getStreamTimestampMs() {
        if (this.lastRenderPtsUs < 0) {
            return -1L;
        }
        long j7 = this.lastRenderPtsUs / ((long) 1000);
        LivePusherLog.i$default(TAG, C3751q.a(j7, "getStreamTimestampMs "), null, 4, null);
        return j7;
    }

    @NotNull
    public final String getStreamUUID() {
        return "";
    }

    @Nullable
    public final VideoSession getVideoSession(int i7) {
        return this.videoSessionMap.get(Integer.valueOf(i7));
    }

    public final void initRenderPipeline() {
        if (this.avContext.getEglContext() == null) {
            return;
        }
        this.pushManager.startDataStatistics$BiliLivePushStreaming_release();
        final Ref.LongRef longRef = new Ref.LongRef();
        this.pipeLine.getTickEvent().register(new Function1(this, longRef) { // from class: com.bilibili.live.streaming.z

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LivePush f65447a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Ref.LongRef f65448b;

            {
                this.f65447a = this;
                this.f65448b = longRef;
            }

            public final Object invoke(Object obj) {
                long jLongValue = ((Long) obj).longValue();
                return LivePush.initRenderPipeline$lambda$11(this.f65447a, this.f65448b, jLongValue);
            }
        });
        if (this.encoderManager.getEncoderConfig$BiliLivePushStreaming_release().getFrameRate() <= 0) {
            this.encoderManager.getEncoderConfig$BiliLivePushStreaming_release().setFrameRate(25);
        }
    }

    @Override // com.bilibili.live.streaming.encoder.IEncoderStateCallback
    public int onAudioEncoderState(final int i7, @NotNull final String str) {
        runOnDefaultBizCoroutine$default(this, null, new Function0(this, i7, str) { // from class: com.bilibili.live.streaming.w

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LivePush f65420a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f65421b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f65422c;

            {
                this.f65420a = this;
                this.f65421b = i7;
                this.f65422c = str;
            }

            public final Object invoke() {
                return LivePush.onAudioEncoderState$lambda$56(this.f65420a, this.f65421b, this.f65422c);
            }
        }, 1, null);
        return 0;
    }

    @Override // com.bilibili.mediastreaming.flashpoint.j
    public void onConnectStats(@NotNull final String str, final long j7) {
        runOnDefaultBizCoroutine$default(this, null, new Function0(str, this, j7) { // from class: com.bilibili.live.streaming.u

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f65413a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final LivePush f65414b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f65415c;

            {
                this.f65413a = str;
                this.f65414b = this;
                this.f65415c = j7;
            }

            public final Object invoke() {
                return LivePush.onConnectStats$lambda$62(this.f65413a, this.f65414b, this.f65415c);
            }
        }, 1, null);
    }

    @Override // com.bilibili.mediastreaming.flashpoint.j
    public void onConnected(@NotNull final BiliProtocol biliProtocol, final int i7, @NotNull final BiliStatus<ConnectedStatusCode> biliStatus, final int i8, final long j7) {
        runOnDefaultBizCoroutine$default(this, null, new Function0(this, biliProtocol, i7, biliStatus, i8, j7) { // from class: com.bilibili.live.streaming.x

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LivePush f65436a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliProtocol f65437b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f65438c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final BiliStatus f65439d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final int f65440e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final long f65441f;

            {
                this.f65436a = this;
                this.f65437b = biliProtocol;
                this.f65438c = i7;
                this.f65439d = biliStatus;
                this.f65440e = i8;
                this.f65441f = j7;
            }

            public final Object invoke() {
                return LivePush.onConnected$lambda$59(this.f65436a, this.f65437b, this.f65438c, this.f65439d, this.f65440e, this.f65441f);
            }
        }, 1, null);
    }

    @Override // com.bilibili.mediastreaming.flashpoint.j
    public void onConnectedFirstPacket(@NotNull final BiliProtocol biliProtocol, @NotNull final BiliFlashpointPacketType biliFlashpointPacketType, @NotNull final BiliStatus<FirstPacketStatusCode> biliStatus, final long j7) {
        runOnDefaultBizCoroutine$default(this, null, new Function0(this, biliProtocol, biliFlashpointPacketType, biliStatus, j7) { // from class: com.bilibili.live.streaming.y

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LivePush f65442a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliProtocol f65443b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BiliFlashpointPacketType f65444c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final BiliStatus f65445d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final long f65446e;

            {
                this.f65442a = this;
                this.f65443b = biliProtocol;
                this.f65444c = biliFlashpointPacketType;
                this.f65445d = biliStatus;
                this.f65446e = j7;
            }

            public final Object invoke() {
                return LivePush.onConnectedFirstPacket$lambda$65(this.f65442a, this.f65443b, this.f65444c, this.f65445d, this.f65446e);
            }
        }, 1, null);
    }

    @Override // com.bilibili.mediastreaming.flashpoint.j
    public void onConnecting(@NotNull final BiliProtocol biliProtocol, @NotNull final BiliStatus<ConnectingStatusCode> biliStatus, final long j7) {
        runOnDefaultBizCoroutine$default(this, null, new Function0(this, biliProtocol, biliStatus, j7) { // from class: com.bilibili.live.streaming.t

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LivePush f65409a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliProtocol f65410b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BiliStatus f65411c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final long f65412d;

            {
                this.f65409a = this;
                this.f65410b = biliProtocol;
                this.f65411c = biliStatus;
                this.f65412d = j7;
            }

            public final Object invoke() {
                return LivePush.onConnecting$lambda$58(this.f65409a, this.f65410b, this.f65411c, this.f65412d);
            }
        }, 1, null);
    }

    @Override // com.bilibili.mediastreaming.flashpoint.j
    public void onDisconnect(@NotNull final BiliProtocol biliProtocol, @NotNull final BiliStatus<DisConnectStatusCode> biliStatus, final long j7) {
        runOnDefaultBizCoroutine$default(this, null, new Function0(this, biliProtocol, biliStatus, j7) { // from class: com.bilibili.live.streaming.E

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LivePush f65165a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliProtocol f65166b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BiliStatus f65167c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final long f65168d;

            {
                this.f65165a = this;
                this.f65166b = biliProtocol;
                this.f65167c = biliStatus;
                this.f65168d = j7;
            }

            public final Object invoke() {
                return LivePush.onDisconnect$lambda$67(this.f65165a, this.f65166b, this.f65167c, this.f65168d);
            }
        }, 1, null);
    }

    @Override // com.bilibili.mediastreaming.flashpoint.j
    public void onError(@NotNull final BiliProtocol biliProtocol, @NotNull final BiliFlashpointErrorType biliFlashpointErrorType, @NotNull final BiliStatus<ErrorCode> biliStatus, final long j7) {
        runOnDefaultBizCoroutine$default(this, null, new Function0(this, biliProtocol, biliFlashpointErrorType, biliStatus, j7) { // from class: com.bilibili.live.streaming.m

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LivePush f65355a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliProtocol f65356b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BiliFlashpointErrorType f65357c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final BiliStatus f65358d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final long f65359e;

            {
                this.f65355a = this;
                this.f65356b = biliProtocol;
                this.f65357c = biliFlashpointErrorType;
                this.f65358d = biliStatus;
                this.f65359e = j7;
            }

            public final Object invoke() {
                return LivePush.onError$lambda$71(this.f65355a, this.f65356b, this.f65357c, this.f65358d, this.f65359e);
            }
        }, 1, null);
    }

    @Override // com.bilibili.mediastreaming.flashpoint.j
    public void onEvent(@NotNull final String str, @NotNull final String str2, final long j7) {
        runOnDefaultBizCoroutine$default(this, null, new Function0(str2, this, str, j7) { // from class: com.bilibili.live.streaming.K

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f65189a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final LivePush f65190b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f65191c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final long f65192d;

            {
                this.f65189a = str2;
                this.f65190b = this;
                this.f65191c = str;
                this.f65192d = j7;
            }

            public final Object invoke() {
                return LivePush.onEvent$lambda$73(this.f65189a, this.f65190b, this.f65191c, this.f65192d);
            }
        }, 1, null);
    }

    @Override // com.bilibili.mediastreaming.flashpoint.j
    public void onNetStats(@NotNull final String str, final long j7) {
        runOnDefaultBizCoroutine$default(this, null, new Function0(str, this, j7) { // from class: com.bilibili.live.streaming.I

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f65184a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final LivePush f65185b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f65186c;

            {
                this.f65184a = str;
                this.f65185b = this;
                this.f65186c = j7;
            }

            public final Object invoke() {
                return LivePush.onNetStats$lambda$64(this.f65184a, this.f65185b, this.f65186c);
            }
        }, 1, null);
    }

    @Override // com.bilibili.mediastreaming.flashpoint.j
    public void onSendPacketFail(@NotNull final BiliProtocol biliProtocol, @NotNull final BiliFlashpointPacketType biliFlashpointPacketType, @NotNull final BiliStatus<SendPacketStatusCode> biliStatus, final long j7) {
        runOnDefaultBizCoroutine$default(this, null, new Function0(this, biliProtocol, biliFlashpointPacketType, biliStatus, j7) { // from class: com.bilibili.live.streaming.G

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LivePush f65175a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliProtocol f65176b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BiliFlashpointPacketType f65177c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final BiliStatus f65178d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final long f65179e;

            {
                this.f65175a = this;
                this.f65176b = biliProtocol;
                this.f65177c = biliFlashpointPacketType;
                this.f65178d = biliStatus;
                this.f65179e = j7;
            }

            public final Object invoke() {
                return LivePush.onSendPacketFail$lambda$66(this.f65175a, this.f65176b, this.f65177c, this.f65178d, this.f65179e);
            }
        }, 1, null);
    }

    @Override // com.bilibili.mediastreaming.flashpoint.j
    public void onStart(@NotNull final BiliProtocol biliProtocol, @NotNull final BiliStatus<StartStatusCode> biliStatus, final long j7) {
        runOnDefaultBizCoroutine$default(this, null, new Function0(this, biliProtocol, biliStatus, j7) { // from class: com.bilibili.live.streaming.A

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LivePush f65152a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliProtocol f65153b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BiliStatus f65154c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final long f65155d;

            {
                this.f65152a = this;
                this.f65153b = biliProtocol;
                this.f65154c = biliStatus;
                this.f65155d = j7;
            }

            public final Object invoke() {
                return LivePush.onStart$lambda$57(this.f65152a, this.f65153b, this.f65154c, this.f65155d);
            }
        }, 1, null);
    }

    @Override // com.bilibili.mediastreaming.flashpoint.j
    public void onStopped(@NotNull final BiliProtocol biliProtocol, @NotNull final BiliStatus<StoppedStatusCode> biliStatus, final long j7) {
        Object next;
        int size = this.flashPointList.size();
        String protocol = biliProtocol.getProtocol();
        String uri = biliProtocol.getUri();
        StringBuilder sbB = bilibili.live.app.service.resolver.a.b(size, "flashPointList size:", " protocol:", protocol, " uri:");
        sbB.append(uri);
        LivePusherLog.i$default(TAG, sbB.toString(), null, 4, null);
        this.outStreams.put(biliProtocol.getUri(), Boolean.FALSE);
        Iterator<T> it = this.flashPointList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.areEqual(((BiliCallbackJavaFlashpoint) next).getUri(), biliProtocol.getUri())) {
                    break;
                }
            }
        }
        BiliCallbackJavaFlashpoint biliCallbackJavaFlashpoint = (BiliCallbackJavaFlashpoint) next;
        if (biliCallbackJavaFlashpoint != null) {
            LivePusherLog.i$default(TAG, androidx.fragment.app.z.a("onStopped, remove flashpoint:", biliCallbackJavaFlashpoint.getProtocolType(), " uri:", biliCallbackJavaFlashpoint.getUri()), null, 4, null);
            this.flashPointList.remove(biliCallbackJavaFlashpoint);
        }
        runOnDefaultBizCoroutine$default(this, null, new Function0(this, biliProtocol, biliStatus, j7) { // from class: com.bilibili.live.streaming.q

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LivePush f65367a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliProtocol f65368b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BiliStatus f65369c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final long f65370d;

            {
                this.f65367a = this;
                this.f65368b = biliProtocol;
                this.f65369c = biliStatus;
                this.f65370d = j7;
            }

            public final Object invoke() {
                return LivePush.onStopped$lambda$70(this.f65367a, this.f65368b, this.f65369c, this.f65370d);
            }
        }, 1, null);
    }

    @Override // com.bilibili.mediastreaming.flashpoint.j
    public void onStopping(@NotNull final BiliProtocol biliProtocol, @NotNull final BiliStatus<StoppingStatusCode> biliStatus, final long j7) {
        runOnDefaultBizCoroutine$default(this, null, new Function0(this, biliProtocol, biliStatus, j7) { // from class: com.bilibili.live.streaming.H

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LivePush f65180a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliProtocol f65181b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BiliStatus f65182c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final long f65183d;

            {
                this.f65180a = this;
                this.f65181b = biliProtocol;
                this.f65182c = biliStatus;
                this.f65183d = j7;
            }

            public final Object invoke() {
                return LivePush.onStopping$lambda$68(this.f65180a, this.f65181b, this.f65182c, this.f65183d);
            }
        }, 1, null);
    }

    @Override // com.bilibili.live.streaming.push.IBiliBizUSBListener
    public void onUSBConnectStatusChange(@NotNull USBStatus uSBStatus) {
        runOnDefaultBizCoroutine("onUSBConnectStatusChange", new Eu0.p(1, this, uSBStatus));
    }

    @Override // com.bilibili.live.streaming.push.IBiliBizUSBListener
    public void onUSBError(@NotNull final String str) {
        runOnDefaultBizCoroutine$default(this, null, new Function0(this, str) { // from class: com.bilibili.live.streaming.J

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LivePush f65187a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f65188b;

            {
                this.f65187a = this;
                this.f65188b = str;
            }

            public final Object invoke() {
                return LivePush.onUSBError$lambda$76(this.f65187a, this.f65188b);
            }
        }, 1, null);
    }

    @Override // com.bilibili.live.streaming.push.IBiliBizUSBListener
    public void onUSBPushStatusChange(@NotNull PushStatus pushStatus) {
        runOnDefaultBizCoroutine$default(this, null, new Ml0.c(1, this, pushStatus), 1, null);
    }

    @Override // com.bilibili.live.streaming.push.IBiliBizUSBListener
    public void onUSBReady(@Nullable byte[] bArr) {
        runOnDefaultBizCoroutine$default(this, null, new Ua.l(1, this, bArr), 1, null);
    }

    @Override // com.bilibili.live.streaming.push.IBiliBizUSBListener
    public void onUSBStop() {
        runOnDefaultBizCoroutine$default(this, null, new D0(this, 3), 1, null);
    }

    @Override // com.bilibili.live.streaming.encoder.IEncoderStateCallback
    public void onVideoEncoderState(@NotNull final VideoEncodeState videoEncodeState, @NotNull final String str) {
        runOnDefaultBizCoroutine$default(this, null, new Function0(this, videoEncodeState, str) { // from class: com.bilibili.live.streaming.o

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LivePush f65362a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final VideoEncodeState f65363b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f65364c;

            {
                this.f65362a = this;
                this.f65363b = videoEncodeState;
                this.f65364c = str;
            }

            public final Object invoke() {
                return LivePush.onVideoEncoderState$lambda$54(this.f65362a, this.f65363b, this.f65364c);
            }
        }, 1, null);
    }

    public final void putVideoSession(@NotNull VideoSession videoSession) {
        ExtMethodsKt.invoke(this.handler, new Ew.b(1, this, videoSession));
        Integer videoSessionID = videoSession.getVideoSessionID();
        int iHashCode = videoSession.hashCode();
        boolean zIsEncoder = videoSession.isEncoder();
        SceneSource sceneSource = videoSession.getSceneSource();
        LivePusherLog.i$default(VideoSession.TAG, "putVideoSession " + videoSessionID + " @" + iHashCode + " isEncoder " + zIsEncoder + " " + (sceneSource != null ? sceneSource.toSourceString() : null), null, 4, null);
    }

    @Deprecated(message = "Use registerVideoFrameCallbackV2 instead", replaceWith = @ReplaceWith(expression = "registerVideoFrameCallbackV2(videoRenderedCallback, null, null, renderMode)", imports = {}))
    public final int registerExternalMainVideoFrameCallback(@NotNull VideoRenderedCallback videoRenderedCallback, @NotNull BEGLSurface.RenderMode renderMode) {
        LivePusherLog.i$default(TAG, "registerExternalMainVideoFrameCallback " + videoRenderedCallback + ", renderMode=" + renderMode, null, 4, null);
        return registerVideoFrameCallbackV2(videoRenderedCallback, null, null, renderMode);
    }

    @Deprecated(message = "Use registerVideoFrameCallbackV2 instead", replaceWith = @ReplaceWith(expression = "registerVideoFrameCallbackV2(videoRenderedCallback, null, sourceName, renderMode)", imports = {}))
    public final void registerMainVideoFrameCallback(@NotNull VideoRenderedCallback videoRenderedCallback, @Nullable String str, @NotNull BEGLSurface.RenderMode renderMode) {
        LivePusherLog.i$default(TAG, "registerMainVideoFrameCallback, videoRenderCallback=" + videoRenderedCallback + ", sourceName=" + str + ", renderMode=" + renderMode, null, 4, null);
        Integer num = this.legacyRenderCallbackTaskId;
        if (num != null) {
            unregisterVideoFrameCallbackV2(num.intValue());
        }
        this.legacyRenderCallbackTaskId = Integer.valueOf(registerVideoFrameCallbackV2(videoRenderedCallback, null, str, renderMode));
    }

    @Deprecated(message = "Use registerVideoFrameCallbackV2 instead", replaceWith = @ReplaceWith(expression = "registerVideoFrameCallbackV2(videoRenderedCallback, videoSessionId, sourceName, renderMode)", imports = {}))
    public final void registerVideoFrameCallback(@NotNull VideoRenderedCallback videoRenderedCallback, int i7, @Nullable String str, @NotNull BEGLSurface.RenderMode renderMode) {
        LivePusherLog.i$default(TAG, "registerVideoFrameCallback, videoRenderCallback=" + videoRenderedCallback + ", videoSessionId:" + i7 + ", sourceName=" + str + ", renderMode=" + renderMode, null, 4, null);
        Integer num = this.legacyRenderCallbackTaskId;
        if (num != null) {
            unregisterVideoFrameCallbackV2(num.intValue());
        }
        this.legacyRenderCallbackTaskId = Integer.valueOf(registerVideoFrameCallbackV2(videoRenderedCallback, Integer.valueOf(i7), str, renderMode));
    }

    public final int registerVideoFrameCallbackV2(@NotNull final VideoRenderedCallback videoRenderedCallback, @Nullable final Integer num, @Nullable final String str, @NotNull final BEGLSurface.RenderMode renderMode) {
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        ExtMethodsKt.invoke(this.handler, new Function0(num, this, renderMode, intRef, videoRenderedCallback, str) { // from class: com.bilibili.live.streaming.F

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f65169a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final LivePush f65170b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BEGLSurface.RenderMode f65171c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Ref.IntRef f65172d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final VideoRenderedCallback f65173e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final String f65174f;

            {
                this.f65169a = num;
                this.f65170b = this;
                this.f65171c = renderMode;
                this.f65172d = intRef;
                this.f65173e = videoRenderedCallback;
                this.f65174f = str;
            }

            public final Object invoke() {
                return LivePush.registerVideoFrameCallbackV2$lambda$32(this.f65169a, this.f65170b, this.f65171c, this.f65172d, this.f65173e, this.f65174f);
            }
        });
        return intRef.element;
    }

    public final void removeVideoSession(final int i7) {
        ExtMethodsKt.invoke(this.handler, new Function0(this, i7) { // from class: com.bilibili.live.streaming.p

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LivePush f65365a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f65366b;

            {
                this.f65365a = this;
                this.f65366b = i7;
            }

            public final Object invoke() {
                return LivePush.removeVideoSession$lambda$5(this.f65365a, this.f65366b);
            }
        });
    }

    public final void restartPush(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @NotNull Function2<? super Integer, ? super String, Unit> function2) {
        if (num != null) {
            this.encoderManager.setVideoFrameRate(num.intValue());
        }
        if (num2 != null) {
            this.encoderManager.setVideoResolution(num2.intValue());
        }
        if (num3 != null) {
            this.encoderManager.setVideoBitRate(num3.intValue());
        }
        ExtMethodsKt.invoke(this.handler, new com.bilibili.bplus.followinglist.module.item.playable.i(1, this, function2));
    }

    public final void runPipelineOnce(long j7) {
        this.pipeLine.runPipeLineOnce(j7);
    }

    public final void setAudioSessionV2(@Nullable AudioSessionV2 audioSessionV2) {
        this.audioSessionV2 = audioSessionV2;
    }

    public final void setEncoderStateCallback(@Nullable final IEncoderStateCallback iEncoderStateCallback) {
        final int i7 = 0;
        runOnDefaultBizCoroutine$default(this, null, new Function0(i7, this, iEncoderStateCallback) { // from class: com.bilibili.live.streaming.s

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f65373a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f65374b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f65375c;

            {
                this.f65373a = i7;
                this.f65374b = this;
                this.f65375c = iEncoderStateCallback;
            }

            public final Object invoke() {
                switch (this.f65373a) {
                    case 0:
                        break;
                    case 1:
                        KQ0.e.h(2131839327, MapsKt.plus(MapsKt.mapOf(TuplesKt.to("button_type", "1")), (Map) this.f65374b), 2131839323);
                        ((Function0) this.f65375c).invoke();
                        break;
                    default:
                        PageViewModel pageViewModel = (PageViewModel) this.f65374b;
                        kntr.app.mall.product.details.page.vm.j.c(pageViewModel.t, "mall.mall-detail.upstore.0.click", pageViewModel.s1((String) this.f65375c, (String) null), true, 8);
                        pageViewModel.h1();
                        break;
                }
                return Unit.INSTANCE;
            }
        }, 1, null);
    }

    public final void setEventCallback(@Nullable ILivePushEventCallback iLivePushEventCallback) {
        this.avContext.setLivePushEventCallBack(iLivePushEventCallback);
    }

    public final void setOutStream(@Nullable BiliOutStreamFlashpoint.OutStreamInterface outStreamInterface) {
        this.mOutStreamInterface = outStreamInterface;
    }

    public final void startConnect(@NotNull final String str, @Nullable final String str2) throws BGLException {
        LivePusherLog.i$default(TAG, androidx.fragment.app.z.a("startConnect start url:", str, " ", str2), null, 4, null);
        initConfig();
        ConcurrentHashMap<String, Boolean> concurrentHashMap = this.outStreams;
        if (concurrentHashMap.isEmpty()) {
            ExtMethodsKt.invoke(this.handler, new com.bilibili.lib.fasthybrid.game.engine.core.render.native.A(this, str, str2));
        } else {
            Iterator<Map.Entry<String, Boolean>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().booleanValue()) {
                    ExtMethodsKt.invoke(this.handler, new Function0(this, str, str2) { // from class: com.bilibili.live.streaming.L

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final LivePush f65193a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final String f65194b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final String f65195c;

                        {
                            this.f65193a = this;
                            this.f65194b = str;
                            this.f65195c = str2;
                        }

                        public final Object invoke() {
                            return LivePush.startConnect$lambda$17(this.f65193a, this.f65194b, this.f65195c);
                        }
                    });
                    break;
                }
            }
            ExtMethodsKt.invoke(this.handler, new com.bilibili.lib.fasthybrid.game.engine.core.render.native.A(this, str, str2));
        }
        this.outStreams.put(str, Boolean.TRUE);
    }

    public final void startEncoder() {
        ExtMethodsKt.invoke(this.handler, new C5371n(this, 0));
    }

    @Nullable
    public final Boolean startGetConnectInfo(int i7) {
        this.mFlashpointManagement.w(i7);
        return null;
    }

    @Nullable
    public final Boolean startGetNetStatsInfo(int i7) {
        this.mFlashpointManagement.x(i7);
        return null;
    }

    public final void startPush(@NotNull final String str, @Nullable final String str2) throws BGLException {
        LivePusherLog.i$default(TAG, androidx.fragment.app.z.a("startPush start url:", str, " ", str2), null, 4, null);
        initConfig();
        ConcurrentHashMap<String, Boolean> concurrentHashMap = this.outStreams;
        if (concurrentHashMap.isEmpty()) {
            final int i7 = 0;
            ExtMethodsKt.invoke(this.handler, new Function0(i7, str, str2, this) { // from class: com.bilibili.live.streaming.D

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f65161a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f65162b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f65163c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Object f65164d;

                {
                    this.f65161a = i7;
                    this.f65164d = this;
                    this.f65162b = str;
                    this.f65163c = str2;
                }

                public final Object invoke() {
                    switch (this.f65161a) {
                        case 0:
                            return LivePush.startPush$lambda$15((LivePush) this.f65164d, this.f65162b, this.f65163c);
                        default:
                            PageViewModel pageViewModel = (PageViewModel) this.f65164d;
                            kntr.app.mall.product.details.page.vm.j.c(pageViewModel.t, "mall.mall-detail.upstore.0.click", pageViewModel.s1(this.f65162b, this.f65163c), true, 8);
                            pageViewModel.h1();
                            return Unit.INSTANCE;
                    }
                }
            });
        } else {
            Iterator<Map.Entry<String, Boolean>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().booleanValue()) {
                    ExtMethodsKt.invoke(this.handler, new Function0(this, str, str2) { // from class: com.bilibili.live.streaming.C

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final LivePush f65158a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final String f65159b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final String f65160c;

                        {
                            this.f65158a = this;
                            this.f65159b = str;
                            this.f65160c = str2;
                        }

                        public final Object invoke() {
                            return LivePush.startPush$lambda$13(this.f65158a, this.f65159b, this.f65160c);
                        }
                    });
                    requestKeyFrame();
                    break;
                }
            }
            final int i72 = 0;
            ExtMethodsKt.invoke(this.handler, new Function0(i72, str, str2, this) { // from class: com.bilibili.live.streaming.D

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f65161a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f65162b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f65163c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Object f65164d;

                {
                    this.f65161a = i72;
                    this.f65164d = this;
                    this.f65162b = str;
                    this.f65163c = str2;
                }

                public final Object invoke() {
                    switch (this.f65161a) {
                        case 0:
                            return LivePush.startPush$lambda$15((LivePush) this.f65164d, this.f65162b, this.f65163c);
                        default:
                            PageViewModel pageViewModel = (PageViewModel) this.f65164d;
                            kntr.app.mall.product.details.page.vm.j.c(pageViewModel.t, "mall.mall-detail.upstore.0.click", pageViewModel.s1(this.f65162b, this.f65163c), true, 8);
                            pageViewModel.h1();
                            return Unit.INSTANCE;
                    }
                }
            });
        }
        this.outStreams.put(str, Boolean.TRUE);
    }

    public final void startTick() {
        this.pipeLine.run();
    }

    public final void stopGetConnectInfo() {
        this.mFlashpointManagement.z();
    }

    public final void stopGetNetStatsInfo() {
        this.mFlashpointManagement.A();
    }

    public final void stopPush() {
        ExtMethodsKt.invoke(this.handler, new Ex.a(this, 3));
        this.mFlashpointManagement.B("");
        this.outStreams.clear();
    }

    public final void stopPush(@NotNull String str) {
        this.outStreams.remove(str);
        this.mFlashpointManagement.B(str);
    }

    public final void stopTick() {
        this.pipeLine.stop();
    }

    public final boolean swapVideoSessionSource(final int i7, final int i8) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ExtMethodsKt.invoke(this.handler, new Function0(this, i7, i8, booleanRef) { // from class: com.bilibili.live.streaming.v

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LivePush f65416a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f65417b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f65418c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Ref.BooleanRef f65419d;

            {
                this.f65416a = this;
                this.f65417b = i7;
                this.f65418c = i8;
                this.f65419d = booleanRef;
            }

            public final Object invoke() {
                return LivePush.swapVideoSessionSource$lambda$6(this.f65416a, this.f65417b, this.f65418c, this.f65419d);
            }
        });
        return booleanRef.element;
    }

    @Deprecated(message = "Use unregisterVideoFrameCallbackV2 instead", replaceWith = @ReplaceWith(expression = "unregisterVideoFrameCallbackV2(taskId)", imports = {}))
    public final void unRegisterExternalMainVideoFrameCallBack(int i7) {
        LivePusherLog.i$default(TAG, C3259x.a(i7, "unRegisterExternalMainVideoFrameCallBack taskId="), null, 4, null);
        unregisterVideoFrameCallbackV2(i7);
    }

    @Deprecated(message = "Use unregisterVideoFrameCallbackV2 instead")
    public final void unregisterRenderTaskCallback() {
        LivePusherLog.i$default(TAG, com.bilibili.app.comm.rubick.common.g.b(this.legacyRenderCallbackTaskId, "unregisterRenderTaskCallback!!! legacyRenderCallbackTaskId="), null, 4, null);
        Integer num = this.legacyRenderCallbackTaskId;
        if (num != null) {
            unregisterVideoFrameCallbackV2(num.intValue());
            this.legacyRenderCallbackTaskId = null;
        }
    }

    public final void unregisterVideoFrameCallbackV2(final int i7) {
        if (i7 < 0) {
            LivePusherLog.w$default(TAG, C3259x.a(i7, "unregisterVideoFrameCallbackV2 ignored, invalid taskId="), null, 4, null);
        } else {
            LivePusherLog.i$default(TAG, C3259x.a(i7, "unregisterVideoFrameCallbackV2 taskId="), null, 4, null);
            ExtMethodsKt.invoke(this.handler, new Function0(this, i7) { // from class: com.bilibili.live.streaming.B

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final LivePush f65156a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f65157b;

                {
                    this.f65156a = this;
                    this.f65157b = i7;
                }

                public final Object invoke() {
                    return LivePush.unregisterVideoFrameCallbackV2$lambda$34(this.f65156a, this.f65157b);
                }
            });
        }
    }

    public final void updateVideoBitrate(int i7) {
        LivePusherLog.i$default(TAG, C3259x.a(i7, "updateVideoBitrate:"), null, 4, null);
        IVideoEncoder iVideoEncoder = this.mVideoEncoder;
        if (iVideoEncoder != null) {
            iVideoEncoder.updateBitrate(i7);
        }
    }
}
