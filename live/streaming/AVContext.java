package com.bilibili.live.streaming;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.media.projection.MediaProjection;
import android.opengl.GLES31;
import android.os.Build;
import android.os.Handler;
import android.view.Display;
import android.view.WindowManager;
import androidx.exifinterface.media.ExifInterface;
import com.bilibili.live.streaming.callback.ILivePushEventCallback;
import com.bilibili.live.streaming.callback.LoadImageCallback;
import com.bilibili.live.streaming.encoder.EncoderConfig;
import com.bilibili.live.streaming.filter.FilterBase;
import com.bilibili.live.streaming.filter.IVideoSource;
import com.bilibili.live.streaming.log.LivePusherLog;
import com.bilibili.live.streaming.source.Camera2CaptureSource;
import com.bilibili.live.streaming.source.ImageSource;
import com.bilibili.live.streaming.source.ScreenCaptureSource;
import com.bilibili.live.streaming.utils.ExtMethodsKt;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/AVContext.class */
public final class AVContext extends AVBaseContext {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "AVContext";

    @NotNull
    private Context activityContext;
    private long beautyProcessTotalTime;

    @NotNull
    private HashMap<String, Object> cameraHolder;

    @NotNull
    private final HashMap<Integer, FilterBase> commonSourceMap;

    @NotNull
    private EncoderConfig config;

    @Nullable
    private Function0<Pair<Integer, Integer>> encodeResolution;

    @Nullable
    private ILivePushEventCallback mLivePushEventCallBack;
    private long mReportTimeIntervalMs;

    @Nullable
    private MediaProjection mediaProjection;

    @NotNull
    private String resourcePath;

    @Nullable
    private Long tickFinishMarker;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/AVContext$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AVContext(@NotNull Context context, @NotNull EncoderConfig encoderConfig, @Nullable MediaProjection mediaProjection, @NotNull HashMap<String, Object> map) {
        super(encoderConfig);
        this.activityContext = context;
        this.config = encoderConfig;
        this.mediaProjection = mediaProjection;
        this.cameraHolder = map;
        this.resourcePath = "";
        this.mReportTimeIntervalMs = 10000L;
        this.commonSourceMap = new HashMap<>();
        this.encodeResolution = new WS0.F(this, 5);
    }

    public /* synthetic */ AVContext(Context context, EncoderConfig encoderConfig, MediaProjection mediaProjection, HashMap map, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, encoderConfig, mediaProjection, (i7 & 8) != 0 ? new HashMap() : map);
    }

    public static /* synthetic */ void addCameraSource$default(AVContext aVContext, int i7, boolean z6, String str, Integer num, Integer num2, int i8, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            str = "CameraSource";
        }
        if ((i9 & 8) != 0) {
            num = null;
        }
        if ((i9 & 16) != 0) {
            num2 = null;
        }
        if ((i9 & 32) != 0) {
            i8 = 0;
        }
        aVContext.addCameraSource(i7, z6, str, num, num2, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addCameraSource$lambda$3(AVContext aVContext, int i7, boolean z6, Integer num, Integer num2, int i8, String str) {
        FilterBase filterBase = aVContext.commonSourceMap.get(Integer.valueOf(i7));
        if (filterBase != null) {
            filterBase.destroy();
        }
        aVContext.commonSourceMap.put(Integer.valueOf(i7), null);
        Camera2CaptureSource camera2CaptureSource = new Camera2CaptureSource();
        camera2CaptureSource.init(aVContext);
        camera2CaptureSource.loadConfig(z6, num, num2, i8);
        camera2CaptureSource.setName(str);
        aVContext.commonSourceMap.put(Integer.valueOf(i7), camera2CaptureSource);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addFilterVideoSource$lambda$8(AVContext aVContext, int i7, IVideoSource iVideoSource) {
        FilterBase filterBase = aVContext.commonSourceMap.get(Integer.valueOf(i7));
        if (filterBase != null) {
            filterBase.destroy();
        }
        aVContext.commonSourceMap.put(Integer.valueOf(i7), null);
        aVContext.commonSourceMap.put(Integer.valueOf(i7), (FilterBase) iVideoSource);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void addImageSource$default(AVContext aVContext, int i7, Bitmap bitmap, String str, Integer num, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str = null;
        }
        if ((i8 & 8) != 0) {
            num = null;
        }
        aVContext.addImageSource(i7, bitmap, str, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addImageSource$lambda$7(AVContext aVContext, int i7, Bitmap bitmap, String str, Integer num) {
        FilterBase filterBase = aVContext.commonSourceMap.get(Integer.valueOf(i7));
        if (filterBase != null) {
            filterBase.destroy();
        }
        aVContext.commonSourceMap.put(Integer.valueOf(i7), null);
        ImageSource imageSource = new ImageSource();
        imageSource.init(aVContext);
        imageSource.loadConfig(null);
        ImageSource.loadBitmap$default(imageSource, bitmap, (LoadImageCallback) null, 2, (Object) null);
        if (str != null) {
            imageSource.setName(str);
        }
        if (num != null) {
            imageSource.setPreFitMode(Integer.valueOf(num.intValue()));
        }
        aVContext.commonSourceMap.put(Integer.valueOf(i7), imageSource);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void addScreenSource$default(AVContext aVContext, int i7, String str, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str = "ScreenSource";
        }
        aVContext.addScreenSource(i7, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addScreenSource$lambda$4(AVContext aVContext, int i7, String str) {
        FilterBase filterBase = aVContext.commonSourceMap.get(Integer.valueOf(i7));
        if (filterBase != null) {
            filterBase.destroy();
        }
        aVContext.commonSourceMap.put(Integer.valueOf(i7), null);
        ScreenCaptureSource screenCaptureSource = new ScreenCaptureSource();
        screenCaptureSource.init(aVContext);
        screenCaptureSource.loadConfig(null);
        screenCaptureSource.setName(str);
        aVContext.commonSourceMap.put(Integer.valueOf(i7), screenCaptureSource);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindReferenceVideoSource$lambda$9(int i7, AVContext aVContext, IVideoSource iVideoSource) {
        boolean z6 = aVContext.commonSourceMap.get(Integer.valueOf(i7)) == null;
        FilterBase filterBase = aVContext.commonSourceMap.get(Integer.valueOf(i7));
        String name = filterBase != null ? filterBase.getName() : null;
        StringBuilder sbA = z4.c.a(i7, "bindReferenceVideoSource: in commonSourceMap idx:", ", is null? ", " name:", z6);
        sbA.append(name);
        LivePusherLog.i$default(TAG, sbA.toString(), null, 4, null);
        aVContext.commonSourceMap.put(Integer.valueOf(i7), (FilterBase) iVideoSource);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit destroy$lambda$17(AVContext aVContext) {
        for (FilterBase filterBase : aVContext.commonSourceMap.values()) {
            if (filterBase != null) {
                filterBase.destroy();
            }
        }
        aVContext.commonSourceMap.clear();
        aVContext.mediaProjection = null;
        aVContext.mLivePushEventCallBack = null;
        Long l7 = aVContext.tickFinishMarker;
        if (l7 != null) {
            GLES31.glDeleteSync(l7.longValue());
            aVContext.tickFinishMarker = null;
        }
        super.destroy();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair encodeResolution$lambda$0(AVContext aVContext) {
        return new Pair(Integer.valueOf(aVContext.config.getWidth()), Integer.valueOf(aVContext.config.getHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCommonSource$lambda$2(Ref.ObjectRef objectRef, AVContext aVContext, int i7) {
        objectRef.element = aVContext.commonSourceMap.get(Integer.valueOf(i7));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ ArrayList getSource$default(AVContext aVContext, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        for (FilterBase filterBase : aVContext.getCommonSourceMap().values()) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (filterBase != null) {
                if (str == null) {
                    arrayList.add(filterBase);
                } else if (Intrinsics.areEqual(str, filterBase != null ? filterBase.getName() : null)) {
                    arrayList.add(filterBase);
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ ArrayList getSourcePosition$default(AVContext aVContext, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : aVContext.getCommonSourceMap().keySet()) {
            FilterBase filterBase = aVContext.getCommonSourceMap().get(num);
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (filterBase != null) {
                if (str == null) {
                    arrayList.add(num);
                } else {
                    FilterBase filterBase2 = aVContext.getCommonSourceMap().get(num);
                    if (Intrinsics.areEqual(str, filterBase2 != null ? filterBase2.getName() : null)) {
                        arrayList.add(num);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeFilterVideoSource$lambda$11(AVContext aVContext, int i7) {
        FilterBase filterBase = aVContext.commonSourceMap.get(Integer.valueOf(i7));
        if (filterBase != null) {
            filterBase.destroy();
        }
        aVContext.commonSourceMap.put(Integer.valueOf(i7), null);
        return Unit.INSTANCE;
    }

    private final void stopMediaProjection() {
        Handler railgunHandler = getRailgunHandler();
        if (railgunHandler != null) {
            ExtMethodsKt.invoke(railgunHandler, new WS0.B(this, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit stopMediaProjection$lambda$18(AVContext aVContext) {
        try {
            MediaProjection mediaProjection = aVContext.mediaProjection;
            if (mediaProjection != null) {
                mediaProjection.stop();
            }
        } catch (Exception e7) {
            LivePusherLog.i(TAG, "destroy() mediaProjection Exception ", e7);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit swapCommonSource$lambda$12(AVContext aVContext, int i7, int i8) {
        FilterBase filterBase = aVContext.commonSourceMap.get(Integer.valueOf(i7));
        aVContext.commonSourceMap.put(Integer.valueOf(i7), aVContext.commonSourceMap.get(Integer.valueOf(i8)));
        aVContext.commonSourceMap.put(Integer.valueOf(i8), filterBase);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unbindReferenceVideoSource$lambda$10(int i7, AVContext aVContext, Ref.ObjectRef objectRef) {
        boolean z6 = aVContext.commonSourceMap.get(Integer.valueOf(i7)) == null;
        FilterBase filterBase = aVContext.commonSourceMap.get(Integer.valueOf(i7));
        String name = filterBase != null ? filterBase.getName() : null;
        StringBuilder sbA = z4.c.a(i7, "unbindReferenceVideoSource: in commonSourceMap idx:", ", is null? ", " name:", z6);
        sbA.append(name);
        LivePusherLog.i$default(TAG, sbA.toString(), null, 4, null);
        objectRef.element = aVContext.commonSourceMap.get(Integer.valueOf(i7));
        aVContext.commonSourceMap.put(Integer.valueOf(i7), null);
        return Unit.INSTANCE;
    }

    public final void addCameraSource(final int i7, final boolean z6, @NotNull final String str, @Nullable final Integer num, @Nullable final Integer num2, final int i8) {
        Handler railgunHandler = getRailgunHandler();
        if (railgunHandler != null) {
            ExtMethodsKt.invoke(railgunHandler, new Function0(this, i7, z6, num, num2, i8, str) { // from class: com.bilibili.live.streaming.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final AVContext f65340a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f65341b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f65342c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Integer f65343d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Integer f65344e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f65345f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final String f65346g;

                {
                    this.f65340a = this;
                    this.f65341b = i7;
                    this.f65342c = z6;
                    this.f65343d = num;
                    this.f65344e = num2;
                    this.f65345f = i8;
                    this.f65346g = str;
                }

                public final Object invoke() {
                    return AVContext.addCameraSource$lambda$3(this.f65340a, this.f65341b, this.f65342c, this.f65343d, this.f65344e, this.f65345f, this.f65346g);
                }
            });
        }
    }

    public final void addFilterVideoSource(final int i7, @NotNull final IVideoSource iVideoSource) {
        Handler railgunHandler = getRailgunHandler();
        if (railgunHandler != null) {
            ExtMethodsKt.invoke(railgunHandler, new Function0(i7, this, iVideoSource) { // from class: com.bilibili.live.streaming.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final AVContext f65334a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f65335b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final IVideoSource f65336c;

                {
                    this.f65334a = this;
                    this.f65335b = i7;
                    this.f65336c = iVideoSource;
                }

                public final Object invoke() {
                    return AVContext.addFilterVideoSource$lambda$8(this.f65334a, this.f65335b, this.f65336c);
                }
            });
        }
    }

    public final void addImageSource(final int i7, @NotNull final Bitmap bitmap, @Nullable final String str, @Nullable final Integer num) {
        Handler railgunHandler = getRailgunHandler();
        if (railgunHandler != null) {
            ExtMethodsKt.invoke(railgunHandler, new Function0(this, i7, bitmap, str, num) { // from class: com.bilibili.live.streaming.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final AVContext f65248a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f65249b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Bitmap f65250c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final String f65251d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Integer f65252e;

                {
                    this.f65248a = this;
                    this.f65249b = i7;
                    this.f65250c = bitmap;
                    this.f65251d = str;
                    this.f65252e = num;
                }

                public final Object invoke() {
                    return AVContext.addImageSource$lambda$7(this.f65248a, this.f65249b, this.f65250c, this.f65251d, this.f65252e);
                }
            });
        }
    }

    public final void addScreenSource(final int i7, @NotNull final String str) {
        Handler railgunHandler = getRailgunHandler();
        if (railgunHandler != null) {
            ExtMethodsKt.invoke(railgunHandler, new Function0(this, i7, str) { // from class: com.bilibili.live.streaming.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final AVContext f65337a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f65338b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f65339c;

                {
                    this.f65337a = this;
                    this.f65338b = i7;
                    this.f65339c = str;
                }

                public final Object invoke() {
                    return AVContext.addScreenSource$lambda$4(this.f65337a, this.f65338b, this.f65339c);
                }
            });
        }
    }

    public final void bindReferenceVideoSource(final int i7, @NotNull final IVideoSource iVideoSource) {
        Handler railgunHandler = getRailgunHandler();
        if (railgunHandler != null) {
            ExtMethodsKt.invoke(railgunHandler, new Function0(i7, this, iVideoSource) { // from class: com.bilibili.live.streaming.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f65321a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final AVContext f65322b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final IVideoSource f65323c;

                {
                    this.f65321a = i7;
                    this.f65322b = this;
                    this.f65323c = iVideoSource;
                }

                public final Object invoke() {
                    return AVContext.bindReferenceVideoSource$lambda$9(this.f65321a, this.f65322b, this.f65323c);
                }
            });
        }
    }

    @Override // com.bilibili.live.streaming.AVBaseContext
    public void destroy() {
        Handler railgunHandler = getRailgunHandler();
        if (railgunHandler != null) {
            ExtMethodsKt.invoke(railgunHandler, new WS0.C(this, 4));
        }
    }

    @NotNull
    public final Context getActivityContext() {
        return this.activityContext;
    }

    public final long getBeautyProcessTotalTime() {
        return this.beautyProcessTotalTime;
    }

    public final int getCameraDegrees() {
        int i7;
        Display display = getDisplay();
        if (display != null) {
            int rotation = display.getRotation();
            i7 = 0;
            if (rotation != 0) {
                i7 = rotation != 1 ? rotation != 2 ? rotation != 3 ? 0 : 270 : 180 : 90;
            }
        } else {
            i7 = -1;
        }
        return i7;
    }

    @NotNull
    public final HashMap<String, Object> getCameraHolder() {
        return this.cameraHolder;
    }

    @Nullable
    public final FilterBase getCommonSource(final int i7) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Handler railgunHandler = getRailgunHandler();
        if (railgunHandler != null) {
            ExtMethodsKt.invoke(railgunHandler, new Function0(i7, this, objectRef) { // from class: com.bilibili.live.streaming.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Ref.ObjectRef f65347a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final AVContext f65348b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f65349c;

                {
                    this.f65347a = objectRef;
                    this.f65348b = this;
                    this.f65349c = i7;
                }

                public final Object invoke() {
                    return AVContext.getCommonSource$lambda$2(this.f65347a, this.f65348b, this.f65349c);
                }
            });
        }
        return (FilterBase) objectRef.element;
    }

    @NotNull
    public final HashMap<Integer, FilterBase> getCommonSourceMap() {
        return this.commonSourceMap;
    }

    @NotNull
    public final EncoderConfig getConfig() {
        return this.config;
    }

    @NotNull
    public final Configuration getConfiguration() {
        return this.activityContext.getResources().getConfiguration();
    }

    @Nullable
    public final Display getDisplay() {
        return Build.VERSION.SDK_INT >= 30 ? this.activityContext.getDisplay() : getWindowManager().getDefaultDisplay();
    }

    @Nullable
    public final Pair<Integer, Integer> getEncodeResolution() {
        Function0<Pair<Integer, Integer>> function0 = this.encodeResolution;
        return function0 != null ? (Pair) function0.invoke() : null;
    }

    @Nullable
    /* JADX INFO: renamed from: getEncodeResolution, reason: collision with other method in class */
    public final Function0<Pair<Integer, Integer>> m6947getEncodeResolution() {
        return this.encodeResolution;
    }

    @Nullable
    public final ILivePushEventCallback getLivePushEventCallback() {
        return this.mLivePushEventCallBack;
    }

    @Nullable
    public final MediaProjection getMediaProject() {
        return this.mediaProjection;
    }

    public final long getReportTimeIntervalMs() {
        return this.mReportTimeIntervalMs;
    }

    @NotNull
    public final String getResourcePath() {
        return this.resourcePath;
    }

    public final /* synthetic */ <T> ArrayList<T> getSource(String str) {
        ArrayList<T> arrayList = new ArrayList<>();
        for (FilterBase filterBase : getCommonSourceMap().values()) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (filterBase != null) {
                if (str == null) {
                    arrayList.add(filterBase);
                } else if (Intrinsics.areEqual(str, filterBase != null ? filterBase.getName() : null)) {
                    arrayList.add(filterBase);
                }
            }
        }
        return arrayList;
    }

    public final /* synthetic */ <T> ArrayList<Integer> getSourcePosition(String str) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer num : getCommonSourceMap().keySet()) {
            FilterBase filterBase = getCommonSourceMap().get(num);
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (filterBase != null) {
                if (str == null) {
                    arrayList.add(num);
                } else {
                    FilterBase filterBase2 = getCommonSourceMap().get(num);
                    if (Intrinsics.areEqual(str, filterBase2 != null ? filterBase2.getName() : null)) {
                        arrayList.add(num);
                    }
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public final WindowManager getWindowManager() {
        return (WindowManager) this.activityContext.getSystemService(WindowManager.class);
    }

    public final void markTickFinish() {
        Long l7 = this.tickFinishMarker;
        if (l7 != null) {
            GLES31.glDeleteSync(l7.longValue());
            this.tickFinishMarker = null;
        }
        this.tickFinishMarker = Long.valueOf(GLES31.glFenceSync(37143, 0));
    }

    public final void removeFilterVideoSource(final int i7) {
        Handler railgunHandler = getRailgunHandler();
        if (railgunHandler != null) {
            ExtMethodsKt.invoke(railgunHandler, new Function0(this, i7) { // from class: com.bilibili.live.streaming.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final AVContext f65243a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f65244b;

                {
                    this.f65243a = this;
                    this.f65244b = i7;
                }

                public final Object invoke() {
                    return AVContext.removeFilterVideoSource$lambda$11(this.f65243a, this.f65244b);
                }
            });
        }
    }

    public final void setBeautyProcessTotalTime(long j7) {
        this.beautyProcessTotalTime = j7;
    }

    public final void setCameraHolder(@NotNull HashMap<String, Object> map) {
        this.cameraHolder = map;
    }

    public final void setConfig(@NotNull EncoderConfig encoderConfig) {
        this.config = encoderConfig;
    }

    public final void setEncodeResolution(@Nullable Function0<Pair<Integer, Integer>> function0) {
        this.encodeResolution = function0;
    }

    public final void setLivePushEventCallBack(@Nullable ILivePushEventCallback iLivePushEventCallback) {
        this.mLivePushEventCallBack = iLivePushEventCallback;
    }

    public final void setMediaProject(@NotNull MediaProjection mediaProjection) {
        this.mediaProjection = mediaProjection;
    }

    public final void setReportTimeIntervalMs(long j7) {
        this.mReportTimeIntervalMs = j7;
    }

    public final void setResourcePath(@NotNull String str) {
        this.resourcePath = str;
    }

    public final void swapCommonSource(final int i7, final int i8) {
        Handler railgunHandler = getRailgunHandler();
        if (railgunHandler != null) {
            ExtMethodsKt.invoke(railgunHandler, new Function0(this, i7, i8) { // from class: com.bilibili.live.streaming.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final AVContext f65245a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f65246b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f65247c;

                {
                    this.f65245a = this;
                    this.f65246b = i7;
                    this.f65247c = i8;
                }

                public final Object invoke() {
                    return AVContext.swapCommonSource$lambda$12(this.f65245a, this.f65246b, this.f65247c);
                }
            });
        }
    }

    @Nullable
    public final IVideoSource unbindReferenceVideoSource(final int i7) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Handler railgunHandler = getRailgunHandler();
        if (railgunHandler != null) {
            ExtMethodsKt.invoke(railgunHandler, new Function0(i7, this, objectRef) { // from class: com.bilibili.live.streaming.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f65324a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final AVContext f65325b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Ref.ObjectRef f65326c;

                {
                    this.f65324a = i7;
                    this.f65325b = this;
                    this.f65326c = objectRef;
                }

                public final Object invoke() {
                    return AVContext.unbindReferenceVideoSource$lambda$10(this.f65324a, this.f65325b, this.f65326c);
                }
            });
        }
        return (IVideoSource) objectRef.element;
    }

    public final void waitTickFinish() {
        Long l7 = this.tickFinishMarker;
        if (l7 != null) {
            GLES31.glWaitSync(l7.longValue(), 0, -1L);
        }
    }
}
