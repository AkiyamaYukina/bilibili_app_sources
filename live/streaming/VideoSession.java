package com.bilibili.live.streaming;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.compose.material.C3943v;
import androidx.media3.exoplayer.C4690e;
import com.bilibili.live.streaming.VideoUtils;
import com.bilibili.live.streaming.filter.FilterBase;
import com.bilibili.live.streaming.filter.IVideoSource;
import com.bilibili.live.streaming.gl.BEGLContext;
import com.bilibili.live.streaming.gl.BEGLCurrentState;
import com.bilibili.live.streaming.gl.BEGLSurface;
import com.bilibili.live.streaming.gl.BGLException;
import com.bilibili.live.streaming.gl.BGLUtil;
import com.bilibili.live.streaming.gl.FilterInterface;
import com.bilibili.live.streaming.log.LivePusherLog;
import com.bilibili.live.streaming.sources.SceneSource;
import com.bilibili.live.streaming.utils.ExtMethodsKt;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/VideoSession.class */
public final class VideoSession {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TAG = "VideoSession";

    @NotNull
    private final AVContext avContext;

    @NotNull
    private final Handler handler;
    private boolean isToEncoder;

    @Nullable
    private BEGLSurface mEglSurface;

    @Nullable
    private Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> mFilter;

    @Nullable
    private String mPreviewSceneName;

    @Nullable
    private FilterBase mPreviewSource;

    @Nullable
    private Surface mSurface;

    @Nullable
    private SurfaceTexture mSurfaceTexture;

    @NotNull
    private final RenderPipeLine pipeLine;

    @Nullable
    private Integer renderTaskId;

    @Nullable
    private SceneSource sceneSource;

    @Nullable
    private SceneSource.Item selectedItem;

    @Nullable
    private Integer videoSessionID;
    private int eglSurfWidth = 1;
    private int eglSurfHeight = 1;

    @NotNull
    private AtomicBoolean isStopRenderTask = new AtomicBoolean(false);
    private int mPreviewFitMode = 2;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/VideoSession$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public VideoSession(@NotNull Handler handler, @NotNull AVContext aVContext, @NotNull RenderPipeLine renderPipeLine) {
        this.handler = handler;
        this.avContext = aVContext;
        this.pipeLine = renderPipeLine;
    }

    private final void applyDrawTexFilter(Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> function4) {
        runHandlerInvoke(new Mo0.v(2, this, function4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit applyDrawTexFilter$lambda$25(VideoSession videoSession, Function4 function4) {
        Object obj = videoSession.mEglSurface;
        if (obj == null) {
            LivePusherLog.w$default(TAG, "applyDrawTexFilter failed. filter:" + function4 + ", eglSurface is null", null, 4, null);
            return Unit.INSTANCE;
        }
        if (obj instanceof FilterInterface) {
            LivePusherLog.i$default(TAG, "applyDrawTexFilter for sessionId:" + videoSession.videoSessionID + ", filter:" + function4 + ", eglSurface:" + obj, null, 4, null);
            ((FilterInterface) obj).setFilter(function4);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void changeRenderTask$default(VideoSession videoSession, SurfaceTexture surfaceTexture, Integer num, Integer num2, int i7, String str, FilterBase filterBase, BEGLSurface.RenderMode renderMode, int i8, Object obj) {
        if ((i8 & 16) != 0) {
            str = null;
        }
        if ((i8 & 32) != 0) {
            filterBase = null;
        }
        if ((i8 & 64) != 0) {
            renderMode = BEGLSurface.RenderMode.SDR_SRGB;
        }
        videoSession.changeRenderTask(surfaceTexture, num, num2, i7, str, filterBase, renderMode);
    }

    public static /* synthetic */ void changeRenderTask$default(VideoSession videoSession, Surface surface, Integer num, Integer num2, int i7, String str, FilterBase filterBase, BEGLSurface.RenderMode renderMode, int i8, Object obj) {
        if ((i8 & 16) != 0) {
            str = null;
        }
        if ((i8 & 32) != 0) {
            filterBase = null;
        }
        if ((i8 & 64) != 0) {
            renderMode = BEGLSurface.RenderMode.SDR_SRGB;
        }
        videoSession.changeRenderTask(surface, num, num2, i7, str, filterBase, renderMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeRenderTask$lambda$15(Integer num, Integer num2, SurfaceTexture surfaceTexture, VideoSession videoSession, int i7, String str, FilterBase filterBase) throws BGLException {
        if (num != null) {
            videoSession.eglSurfWidth = num.intValue();
        }
        if (num2 != null) {
            videoSession.eglSurfHeight = num2.intValue();
        }
        if (surfaceTexture == null) {
            return Unit.INSTANCE;
        }
        BEGLSurface bEGLSurfaceCreateSurface = null;
        LivePusherLog.i$default(TAG, "changeRenderTask for sessionId:" + videoSession.videoSessionID + ", filter:" + videoSession.mFilter, null, 4, null);
        videoSession.destroyRenderTaskSource();
        videoSession.mSurfaceTexture = surfaceTexture;
        BEGLContext eglContext = videoSession.avContext.getEglContext();
        if (eglContext != null) {
            bEGLSurfaceCreateSurface = eglContext.createSurface(surfaceTexture);
        }
        videoSession.mEglSurface = bEGLSurfaceCreateSurface;
        videoSession.applyDrawTexFilter(videoSession.mFilter);
        if (videoSession.mPreviewFitMode != i7) {
            videoSession.mPreviewFitMode = i7;
        }
        if (str != null && !Intrinsics.areEqual(videoSession.mPreviewSceneName, str)) {
            videoSession.mPreviewSceneName = str;
        }
        if (filterBase != null && !Intrinsics.areEqual(videoSession.mPreviewSource, filterBase)) {
            videoSession.mPreviewSource = filterBase;
        }
        videoSession.startPreview();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeRenderTask$lambda$9(Integer num, Integer num2, Surface surface, VideoSession videoSession, BEGLSurface.RenderMode renderMode, int i7, String str, FilterBase filterBase) throws BGLException {
        if (num != null) {
            videoSession.eglSurfWidth = num.intValue();
        }
        if (num2 != null) {
            videoSession.eglSurfHeight = num2.intValue();
        }
        if (surface == null) {
            return Unit.INSTANCE;
        }
        BEGLSurface bEGLSurfaceCreateSurface = null;
        LivePusherLog.i$default(TAG, "changeRenderTask for sessionId:" + videoSession.videoSessionID + ", filter:" + videoSession.mFilter, null, 4, null);
        videoSession.destroyRenderTaskSource();
        videoSession.mSurface = surface;
        BEGLContext eglContext = videoSession.avContext.getEglContext();
        if (eglContext != null) {
            bEGLSurfaceCreateSurface = eglContext.createSurface(surface, renderMode);
        }
        videoSession.mEglSurface = bEGLSurfaceCreateSurface;
        videoSession.applyDrawTexFilter(videoSession.mFilter);
        if (videoSession.mPreviewFitMode != i7) {
            videoSession.mPreviewFitMode = i7;
        }
        if (str != null && !Intrinsics.areEqual(videoSession.mPreviewSceneName, str)) {
            videoSession.mPreviewSceneName = str;
        }
        if (filterBase != null && !Intrinsics.areEqual(videoSession.mPreviewSource, filterBase)) {
            videoSession.mPreviewSource = filterBase;
        }
        videoSession.startPreview();
        return Unit.INSTANCE;
    }

    private final void createEglSurface(final Object obj, final int i7, final int i8, final BEGLSurface.RenderMode renderMode) {
        Integer num = this.videoSessionID;
        StringBuilder sb = new StringBuilder("createEglSurface for sessionId:");
        sb.append(num);
        sb.append(", surface:");
        sb.append(obj);
        sb.append(", width:");
        C4690e.a(i7, i8, ", height:", ", renderMode:", sb);
        sb.append(renderMode);
        LivePusherLog.i$default(TAG, sb.toString(), null, 4, null);
        runHandlerInvoke(new Function0(obj, this, i7, i8, renderMode) { // from class: com.bilibili.live.streaming.X

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f65231a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final VideoSession f65232b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f65233c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f65234d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final BEGLSurface.RenderMode f65235e;

            {
                this.f65231a = obj;
                this.f65232b = this;
                this.f65233c = i7;
                this.f65234d = i8;
                this.f65235e = renderMode;
            }

            public final Object invoke() {
                return VideoSession.createEglSurface$lambda$21(this.f65231a, this.f65232b, this.f65233c, this.f65234d, this.f65235e);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createEglSurface$lambda$21(Object obj, VideoSession videoSession, int i7, int i8, BEGLSurface.RenderMode renderMode) {
        BEGLSurface bEGLSurfaceCreateSurface;
        if (!(obj instanceof SurfaceTexture) && !(obj instanceof Surface)) {
            LivePusherLog.w$default(TAG, "surface must is SurfaceTexture or Surface!!!", null, 4, null);
            return Unit.INSTANCE;
        }
        try {
        } catch (Exception e7) {
            LivePusherLog.e(TAG, "createEglSurface exception, msg:" + e7.getMessage(), e7);
        }
        if ((obj instanceof SurfaceTexture) && Intrinsics.areEqual(videoSession.mSurfaceTexture, obj)) {
            return Unit.INSTANCE;
        }
        if ((obj instanceof Surface) && Intrinsics.areEqual(videoSession.mSurface, obj)) {
            return Unit.INSTANCE;
        }
        videoSession.destroyRenderTaskSource();
        videoSession.eglSurfWidth = i7;
        videoSession.eglSurfHeight = i8;
        if (obj instanceof Surface) {
            videoSession.mSurface = (Surface) obj;
            BEGLContext eglContext = videoSession.avContext.getEglContext();
            bEGLSurfaceCreateSurface = null;
            if (eglContext != null) {
                bEGLSurfaceCreateSurface = eglContext.createSurface((Surface) obj, renderMode);
            }
        } else {
            bEGLSurfaceCreateSurface = null;
            if (obj instanceof SurfaceTexture) {
                videoSession.mSurfaceTexture = (SurfaceTexture) obj;
                BEGLContext eglContext2 = videoSession.avContext.getEglContext();
                bEGLSurfaceCreateSurface = null;
                if (eglContext2 != null) {
                    bEGLSurfaceCreateSurface = eglContext2.createSurface((SurfaceTexture) obj, renderMode);
                }
            }
        }
        videoSession.mEglSurface = bEGLSurfaceCreateSurface;
        videoSession.applyDrawTexFilter(videoSession.mFilter);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void createRenderTask$default(VideoSession videoSession, SurfaceTexture surfaceTexture, Integer num, Integer num2, int i7, String str, FilterBase filterBase, BEGLSurface.RenderMode renderMode, int i8, Object obj) {
        if ((i8 & 16) != 0) {
            str = null;
        }
        if ((i8 & 32) != 0) {
            filterBase = null;
        }
        if ((i8 & 64) != 0) {
            renderMode = BEGLSurface.RenderMode.SDR_SRGB;
        }
        videoSession.createRenderTask(surfaceTexture, num, num2, i7, str, filterBase, renderMode);
    }

    public static /* synthetic */ void createRenderTask$default(VideoSession videoSession, Surface surface, Integer num, Integer num2, int i7, String str, FilterBase filterBase, BEGLSurface.RenderMode renderMode, int i8, Object obj) {
        if ((i8 & 16) != 0) {
            str = null;
        }
        if ((i8 & 32) != 0) {
            filterBase = null;
        }
        if ((i8 & 64) != 0) {
            renderMode = BEGLSurface.RenderMode.SDR_SRGB;
        }
        videoSession.createRenderTask(surface, num, num2, i7, str, filterBase, renderMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createRenderTask$lambda$2(VideoSession videoSession, Surface surface, Integer num, Integer num2, BEGLSurface.RenderMode renderMode, int i7, String str, FilterBase filterBase) {
        if (videoSession.renderTaskId != null) {
            return Unit.INSTANCE;
        }
        videoSession.createEglSurface(surface, num.intValue(), num2.intValue(), renderMode);
        videoSession.mPreviewFitMode = i7;
        videoSession.mPreviewSceneName = str;
        videoSession.mPreviewSource = filterBase;
        videoSession.startPreview();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createRenderTask$lambda$4(VideoSession videoSession, SurfaceTexture surfaceTexture, Integer num, Integer num2, BEGLSurface.RenderMode renderMode, int i7, String str, FilterBase filterBase) {
        if (videoSession.renderTaskId != null) {
            return Unit.INSTANCE;
        }
        videoSession.createEglSurface(surfaceTexture, num.intValue(), num2.intValue(), renderMode);
        videoSession.mPreviewFitMode = i7;
        videoSession.mPreviewSceneName = str;
        videoSession.mPreviewSource = filterBase;
        videoSession.startPreview();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit destroy$lambda$17(VideoSession videoSession) {
        videoSession.destroyRenderTaskSource();
        videoSession.destroySceneSource();
        videoSession.mFilter = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit destroyRenderTaskSource$lambda$20(VideoSession videoSession) {
        videoSession.stopRenderTask();
        try {
            if (videoSession.mEglSurface != null) {
                videoSession.applyDrawTexFilter(null);
                BEGLCurrentState.clean();
                BEGLSurface bEGLSurface = videoSession.mEglSurface;
                if (bEGLSurface != null) {
                    bEGLSurface.destroy();
                }
                videoSession.mEglSurface = null;
            }
        } catch (BGLException e7) {
            LivePusherLog.e(TAG, ID.a.a(e7.getReason().ordinal(), "An exception occurred while VideoSession#startRenderTask running,error: ", e7.getMessage(), " errorCode: "), e7);
        }
        videoSession.mSurfaceTexture = null;
        videoSession.mSurface = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit destroySceneSource$lambda$18(VideoSession videoSession) throws BGLException {
        BEGLContext eglContext = videoSession.avContext.getEglContext();
        if (eglContext != null) {
            eglContext.makeCurrent();
        }
        SceneSource sceneSource = videoSession.sceneSource;
        if (sceneSource != null) {
            sceneSource.destroy();
        }
        videoSession.sceneSource = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit isEncoder$lambda$1(VideoSession videoSession, boolean z6) {
        videoSession.isToEncoder = z6;
        return Unit.INSTANCE;
    }

    private final void runHandlerInvoke(Function0<Unit> function0) {
        if (Intrinsics.areEqual(Looper.myLooper(), this.handler.getLooper())) {
            function0.invoke();
        } else {
            ExtMethodsKt.invoke(this.handler, function0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDrawTexFilter$lambda$23(VideoSession videoSession, Function4 function4) {
        LivePusherLog.i$default(TAG, "setDrawTexFilter for sessionId:" + videoSession.videoSessionID + ", filter:" + function4, null, 4, null);
        videoSession.mFilter = function4;
        videoSession.applyDrawTexFilter(function4);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setSceneSource$default(VideoSession videoSession, SceneSource sceneSource, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        videoSession.setSceneSource(sceneSource, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSceneSource$lambda$0(boolean z6, VideoSession videoSession, SceneSource sceneSource) {
        if (z6) {
            videoSession.destroySceneSource();
        }
        videoSession.sceneSource = sceneSource;
        LivePusherLog.i$default(TAG, "setSceneSource for SessionID " + videoSession.videoSessionID + " @" + videoSession.hashCode() + sceneSource.toSourceString(), null, 4, null);
        return Unit.INSTANCE;
    }

    private final void startPreview() {
        LivePusherLog.i$default(TAG, "startPreview, videoSessionId:" + this.videoSessionID + " obj:" + this, null, 4, null);
        Integer numValueOf = Integer.valueOf(this.pipeLine.getRenderEvent().register(new com.bilibili.ad.adview.pegasus.banner.topview.res.f(this, 2)));
        this.renderTaskId = numValueOf;
        StringBuilder sbB = androidx.fragment.app.A.b("startPreview done, renderTaskId: ", numValueOf, ", videoSessionID:", this.videoSessionID, ", obj:");
        sbB.append(this);
        LivePusherLog.i$default(TAG, sbB.toString(), null, 4, null);
        this.isStopRenderTask.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startPreview$lambda$22(VideoSession videoSession, long j7) {
        IVideoSource iVideoSourceFindInnerFilter;
        if (videoSession.mEglSurface == null) {
            return Unit.INSTANCE;
        }
        String str = videoSession.mPreviewSceneName;
        if (str == null || str.length() == 0) {
            FilterBase filterBase = videoSession.mPreviewSource;
            iVideoSourceFindInnerFilter = filterBase;
            if (filterBase == null) {
                iVideoSourceFindInnerFilter = videoSession.sceneSource;
            }
        } else {
            SceneSource sceneSource = videoSession.sceneSource;
            iVideoSourceFindInnerFilter = sceneSource != null ? sceneSource.findInnerFilter(videoSession.mPreviewSceneName) : null;
        }
        try {
            BEGLSurface bEGLSurface = videoSession.mEglSurface;
            if (bEGLSurface != null) {
                bEGLSurface.makeCurrent();
            }
            videoSession.avContext.waitTickFinish();
            VideoUtils.Companion companion = VideoUtils.Companion;
            AVContext aVContext = videoSession.avContext;
            companion.renderSource(aVContext, 0, 0, videoSession.eglSurfWidth, videoSession.eglSurfHeight, iVideoSourceFindInnerFilter, 2, videoSession.mPreviewFitMode, companion.getRenderCallback(videoSession.sceneSource, aVContext.getTimeStampUs(), videoSession.selectedItem));
            BEGLSurface bEGLSurface2 = videoSession.mEglSurface;
            if (bEGLSurface2 != null) {
                bEGLSurface2.swapBuffer();
            }
            return Unit.INSTANCE;
        } catch (BGLException e7) {
            String message = e7.getMessage();
            int iOrdinal = e7.getReason().ordinal();
            SceneSource sceneSource2 = videoSession.sceneSource;
            BEGLSurface bEGLSurface3 = videoSession.mEglSurface;
            StringBuilder sbA = androidx.constraintlayout.widget.e.a(iOrdinal, "An exception occurred while VideoSession#startRenderTask running,error_msg: ", message, ",error_code: ", ",scene_source_obj: ");
            sbA.append(sceneSource2);
            sbA.append(",egl_surface_obj: ");
            sbA.append(bEGLSurface3);
            sbA.append(",render_source_obj: ");
            sbA.append(iVideoSourceFindInnerFilter);
            LivePusherLog.e(TAG, sbA.toString(), e7);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit stopRenderTask$lambda$16(VideoSession videoSession) {
        SurfaceTexture surfaceTexture;
        Surface surface;
        if (videoSession.isStopRenderTask.get() || (Build.VERSION.SDK_INT >= 26 && (((surfaceTexture = videoSession.mSurfaceTexture) != null && surfaceTexture.isReleased()) || !((surface = videoSession.mSurface) == null || surface.isValid())))) {
            return Unit.INSTANCE;
        }
        Integer num = videoSession.renderTaskId;
        if (num == null) {
            return Unit.INSTANCE;
        }
        int iIntValue = num.intValue();
        LivePusherLog.i$default(TAG, "stopRenderTask, taskId: " + iIntValue + ", videoSessionID: " + videoSession.videoSessionID + ", obj:" + videoSession, null, 4, null);
        videoSession.pipeLine.getRenderEvent().unregister(iIntValue);
        videoSession.renderTaskId = null;
        try {
            BEGLSurface bEGLSurface = videoSession.mEglSurface;
            if (bEGLSurface == null) {
                return Unit.INSTANCE;
            }
            BGLUtil.logGLErrAndThrow(String.valueOf(videoSession.videoSessionID), BGLException.ID.SURFACE_ERROR, "stopRenderTask()");
            bEGLSurface.makeCurrent();
            GLES20.glViewport(0, 0, videoSession.eglSurfWidth, videoSession.eglSurfHeight);
            BGLUtil.clear();
            bEGLSurface.swapBuffer();
            videoSession.isStopRenderTask.set(true);
            videoSession.mSurfaceTexture = null;
            videoSession.mSurface = null;
            return Unit.INSTANCE;
        } catch (BGLException e7) {
            LivePusherLog.e(TAG, ID.a.a(e7.getReason().ordinal(), "An exception occurred while VideoSession#stopRenderTask running,error_msg: ", e7.getMessage(), ",error_code: "), e7);
            return Unit.INSTANCE;
        }
    }

    public final void changeRenderTask(@Nullable final SurfaceTexture surfaceTexture, @Nullable final Integer num, @Nullable final Integer num2, final int i7, @Nullable final String str, @Nullable final FilterBase filterBase, @NotNull BEGLSurface.RenderMode renderMode) {
        if (surfaceTexture == null && num == null && num2 == null) {
            return;
        }
        if (num != null && num.intValue() == 0) {
            return;
        }
        if (num2 != null && num2.intValue() == 0) {
            return;
        }
        BEGLSurface.isHDR(renderMode);
        runHandlerInvoke(new Function0(num, num2, surfaceTexture, this, i7, str, filterBase) { // from class: com.bilibili.live.streaming.V

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f65217a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Integer f65218b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final SurfaceTexture f65219c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final VideoSession f65220d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final int f65221e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final String f65222f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final FilterBase f65223g;

            {
                this.f65217a = num;
                this.f65218b = num2;
                this.f65219c = surfaceTexture;
                this.f65220d = this;
                this.f65221e = i7;
                this.f65222f = str;
                this.f65223g = filterBase;
            }

            public final Object invoke() {
                return VideoSession.changeRenderTask$lambda$15(this.f65217a, this.f65218b, this.f65219c, this.f65220d, this.f65221e, this.f65222f, this.f65223g);
            }
        });
    }

    public final void changeRenderTask(@Nullable final Surface surface, @Nullable final Integer num, @Nullable final Integer num2, final int i7, @Nullable final String str, @Nullable final FilterBase filterBase, @NotNull final BEGLSurface.RenderMode renderMode) {
        if (surface == null && num == null && num2 == null) {
            return;
        }
        if (num != null && num.intValue() == 0) {
            return;
        }
        if (num2 != null && num2.intValue() == 0) {
            return;
        }
        runHandlerInvoke(new Function0(this, surface, num, num2, renderMode, i7, str, filterBase) { // from class: com.bilibili.live.streaming.W

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f65224a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Integer f65225b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Surface f65226c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final VideoSession f65227d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final BEGLSurface.RenderMode f65228e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final int f65229f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final String f65230g;
            public final FilterBase h;

            {
                this.f65224a = num;
                this.f65225b = num2;
                this.f65226c = surface;
                this.f65227d = this;
                this.f65228e = renderMode;
                this.f65229f = i7;
                this.f65230g = str;
                this.h = filterBase;
            }

            public final Object invoke() {
                return VideoSession.changeRenderTask$lambda$9(this.f65224a, this.f65225b, this.f65226c, this.f65227d, this.f65228e, this.f65229f, this.f65230g, this.h);
            }
        });
    }

    public final void createRenderTask(@Nullable final SurfaceTexture surfaceTexture, @Nullable final Integer num, @Nullable final Integer num2, final int i7, @Nullable final String str, @Nullable final FilterBase filterBase, @NotNull final BEGLSurface.RenderMode renderMode) {
        if (surfaceTexture == null || num == null || num2 == null) {
            return;
        }
        BEGLSurface.isHDR(renderMode);
        runHandlerInvoke(new Function0(this, surfaceTexture, num, num2, renderMode, i7, str, filterBase) { // from class: com.bilibili.live.streaming.T

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VideoSession f65203a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final SurfaceTexture f65204b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Integer f65205c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Integer f65206d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final BEGLSurface.RenderMode f65207e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final int f65208f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final String f65209g;
            public final FilterBase h;

            {
                this.f65203a = this;
                this.f65204b = surfaceTexture;
                this.f65205c = num;
                this.f65206d = num2;
                this.f65207e = renderMode;
                this.f65208f = i7;
                this.f65209g = str;
                this.h = filterBase;
            }

            public final Object invoke() {
                return VideoSession.createRenderTask$lambda$4(this.f65203a, this.f65204b, this.f65205c, this.f65206d, this.f65207e, this.f65208f, this.f65209g, this.h);
            }
        });
    }

    public final void createRenderTask(@Nullable final Surface surface, @Nullable final Integer num, @Nullable final Integer num2, final int i7, @Nullable final String str, @Nullable final FilterBase filterBase, @NotNull final BEGLSurface.RenderMode renderMode) {
        if (surface == null || num == null || num2 == null) {
            return;
        }
        runHandlerInvoke(new Function0(this, surface, num, num2, renderMode, i7, str, filterBase) { // from class: com.bilibili.live.streaming.U

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VideoSession f65210a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Surface f65211b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Integer f65212c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Integer f65213d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final BEGLSurface.RenderMode f65214e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final int f65215f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final String f65216g;
            public final FilterBase h;

            {
                this.f65210a = this;
                this.f65211b = surface;
                this.f65212c = num;
                this.f65213d = num2;
                this.f65214e = renderMode;
                this.f65215f = i7;
                this.f65216g = str;
                this.h = filterBase;
            }

            public final Object invoke() {
                return VideoSession.createRenderTask$lambda$2(this.f65210a, this.f65211b, this.f65212c, this.f65213d, this.f65214e, this.f65215f, this.f65216g, this.h);
            }
        });
    }

    public final void destroy() {
        runHandlerInvoke(new Ex0.g(this, 3));
    }

    public final void destroyRenderTaskSource() {
        runHandlerInvoke(new C3943v(this, 1));
    }

    public final void destroySceneSource() {
        runHandlerInvoke(new Td.b(this, 5));
    }

    @Nullable
    public final SceneSource getSceneSource() {
        return this.sceneSource;
    }

    @Nullable
    public final SceneSource.Item getSelectedItem() {
        return this.selectedItem;
    }

    @Nullable
    public final Integer getVideoSessionID() {
        return this.videoSessionID;
    }

    public final void isEncoder(final boolean z6) {
        runHandlerInvoke(new Function0(this, z6) { // from class: com.bilibili.live.streaming.Y

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VideoSession f65236a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f65237b;

            {
                this.f65236a = this;
                this.f65237b = z6;
            }

            public final Object invoke() {
                return VideoSession.isEncoder$lambda$1(this.f65236a, this.f65237b);
            }
        });
    }

    public final boolean isEncoder() {
        return this.isToEncoder;
    }

    public final void setDrawTexFilter(@Nullable final Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> function4) {
        runHandlerInvoke(new Function0(this, function4) { // from class: com.bilibili.live.streaming.S

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VideoSession f65201a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Function4 f65202b;

            {
                this.f65201a = this;
                this.f65202b = function4;
            }

            public final Object invoke() {
                return VideoSession.setDrawTexFilter$lambda$23(this.f65201a, this.f65202b);
            }
        });
    }

    public final void setSceneSource(@NotNull final SceneSource sceneSource, final boolean z6) {
        runHandlerInvoke(new Function0(z6, this, sceneSource) { // from class: com.bilibili.live.streaming.Z

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f65238a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final VideoSession f65239b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final SceneSource f65240c;

            {
                this.f65238a = z6;
                this.f65239b = this;
                this.f65240c = sceneSource;
            }

            public final Object invoke() {
                return VideoSession.setSceneSource$lambda$0(this.f65238a, this.f65239b, this.f65240c);
            }
        });
    }

    public final void setSelectedItem(@Nullable SceneSource.Item item) {
        this.selectedItem = item;
    }

    public final void setVideoSessionID(@Nullable Integer num) {
        this.videoSessionID = num;
    }

    public final void stopRenderTask() {
        LivePusherLog.i$default(TAG, "stopRenderTask... videoSessionID: " + this.videoSessionID + ", obj:" + this, null, 4, null);
        runHandlerInvoke(new Td.c(this, 4));
        LivePusherLog.i$default(TAG, "stopRenderTask done.", null, 4, null);
    }
}
