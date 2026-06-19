package com.bilibili.live.streaming.widget;

import CJ.l;
import G.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.live.streaming.log.LivePusherLog;
import com.bilibili.live.streaming.widget.SurfaceRenderView;
import com.bilibili.studio.base.BaseVMFragment;
import com.bilibili.ugc.offline.drama.DramaVideo;
import com.bilibili.upper.module.bcut.fragment.BCutSpecialFragment;
import com.bilibili.upper.module.bcut.model.BCutSpecialViewModel;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kj0.g;
import kntr.common.dionysus.vod.url.VodUrlPlayer;
import kntr.srcs.app.splash.page.view.z;
import kntr.srcs.app.splash.reporter.ad.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.ui.offline.OfflineHomeHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/widget/SurfaceRenderView.class */
public final class SurfaceRenderView extends SurfaceView implements IRenderView {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "SurfaceRenderView";
    private float aspectRatio;

    @NotNull
    private SurfaceViewCallback surfaceCallback;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/widget/SurfaceRenderView$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/widget/SurfaceRenderView$InternalSurfaceHolder.class */
    public static final class InternalSurfaceHolder implements ISurfaceHolder {

        @Nullable
        private final SurfaceRenderView renderView;

        @Nullable
        private final Surface surface;

        @Nullable
        private final SurfaceHolder surfaceHolder;

        public InternalSurfaceHolder(@Nullable SurfaceRenderView surfaceRenderView, @Nullable Surface surface, @Nullable SurfaceHolder surfaceHolder) {
            this.renderView = surfaceRenderView;
            this.surface = surface;
            this.surfaceHolder = surfaceHolder;
        }

        @Override // com.bilibili.live.streaming.widget.ISurfaceHolder
        @Nullable
        public Surface getPreview() {
            return this.surface;
        }

        @Override // com.bilibili.live.streaming.widget.ISurfaceHolder
        @Nullable
        public IRenderView getRenderView() {
            return this.renderView;
        }

        @Override // com.bilibili.live.streaming.widget.ISurfaceHolder
        @Nullable
        public SurfaceHolder getSurfaceHolder() {
            return this.surfaceHolder;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/widget/SurfaceRenderView$SurfaceViewCallback.class */
    public final class SurfaceViewCallback implements SurfaceHolder.Callback {
        private int formatValue;
        private boolean isFormatChanged;

        @Nullable
        private Surface previewSurface;

        @NotNull
        private final CopyOnWriteArrayList<IRenderViewCallback> renderCallbacks = new CopyOnWriteArrayList<>();
        private int surfaceHeight;
        private int surfaceWidth;
        final SurfaceRenderView this$0;

        @NotNull
        private final WeakReference<SurfaceRenderView> weakRenderView;

        public SurfaceViewCallback(@NotNull SurfaceRenderView surfaceRenderView, SurfaceRenderView surfaceRenderView2) {
            this.this$0 = surfaceRenderView;
            this.weakRenderView = new WeakReference<>(surfaceRenderView2);
        }

        private final void dispatch(Function1<? super IRenderViewCallback, ? extends Object> function1) {
            Iterator<IRenderViewCallback> it = this.renderCallbacks.iterator();
            while (it.hasNext()) {
                try {
                    function1.invoke(it.next());
                } catch (Exception e7) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit surfaceChanged$lambda$1(InternalSurfaceHolder internalSurfaceHolder, SurfaceViewCallback surfaceViewCallback, IRenderViewCallback iRenderViewCallback) {
            iRenderViewCallback.onSurfaceChanged(internalSurfaceHolder, surfaceViewCallback.formatValue, surfaceViewCallback.surfaceWidth, surfaceViewCallback.surfaceHeight);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit surfaceCreated$lambda$0(InternalSurfaceHolder internalSurfaceHolder, SurfaceViewCallback surfaceViewCallback, IRenderViewCallback iRenderViewCallback) {
            iRenderViewCallback.onSurfaceCreated(internalSurfaceHolder, surfaceViewCallback.surfaceWidth, surfaceViewCallback.surfaceHeight);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit surfaceDestroyed$lambda$2(InternalSurfaceHolder internalSurfaceHolder, IRenderViewCallback iRenderViewCallback) {
            iRenderViewCallback.onSurfaceDestroyed(internalSurfaceHolder);
            return Unit.INSTANCE;
        }

        public final void addRenderCallback(@NotNull IRenderViewCallback iRenderViewCallback) {
            this.renderCallbacks.add(iRenderViewCallback);
            if (this.previewSurface != null) {
                iRenderViewCallback.onSurfaceCreated(new InternalSurfaceHolder(this.weakRenderView.get(), this.previewSurface, this.this$0.getHolder()), this.surfaceWidth, this.surfaceHeight);
            }
            if (this.isFormatChanged) {
                iRenderViewCallback.onSurfaceChanged(new InternalSurfaceHolder(this.weakRenderView.get(), this.previewSurface, this.this$0.getHolder()), this.formatValue, this.surfaceWidth, this.surfaceHeight);
            }
        }

        public final void removeRenderCallback(@NotNull IRenderViewCallback iRenderViewCallback) {
            this.renderCallbacks.remove(iRenderViewCallback);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(@NotNull SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
            LivePusherLog.i$default(SurfaceRenderView.TAG, "surfaceChanged", null, 4, null);
            this.previewSurface = surfaceHolder.getSurface();
            this.isFormatChanged = true;
            this.surfaceWidth = i8;
            this.surfaceHeight = i9;
            this.formatValue = i7;
            final int i10 = 0;
            final InternalSurfaceHolder internalSurfaceHolder = new InternalSurfaceHolder(this.weakRenderView.get(), this.previewSurface, surfaceHolder);
            dispatch(new Function1(i10, internalSurfaceHolder, this) { // from class: com.bilibili.live.streaming.widget.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f65423a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f65424b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f65425c;

                {
                    this.f65423a = i10;
                    this.f65424b = internalSurfaceHolder;
                    this.f65425c = this;
                }

                public final Object invoke(Object obj) {
                    switch (this.f65423a) {
                        case 0:
                            return SurfaceRenderView.SurfaceViewCallback.surfaceChanged$lambda$1((SurfaceRenderView.InternalSurfaceHolder) this.f65424b, (SurfaceRenderView.SurfaceViewCallback) this.f65425c, (IRenderViewCallback) obj);
                        default:
                            ((cG0.d) this.f65424b).f();
                            BCutSpecialViewModel bCutSpecialViewModel = ((BaseVMFragment) ((BCutSpecialFragment) this.f65425c)).b;
                            if (bCutSpecialViewModel != null) {
                                bCutSpecialViewModel.J0();
                            }
                            return Unit.INSTANCE;
                    }
                }
            });
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(@NotNull SurfaceHolder surfaceHolder) {
            LivePusherLog.i$default(SurfaceRenderView.TAG, "surfaceCreated", null, 4, null);
            this.previewSurface = surfaceHolder.getSurface();
            this.isFormatChanged = false;
            this.surfaceWidth = this.this$0.getMeasuredWidth();
            this.surfaceHeight = this.this$0.getMeasuredHeight();
            final int i7 = 0;
            final InternalSurfaceHolder internalSurfaceHolder = new InternalSurfaceHolder(this.weakRenderView.get(), this.previewSurface, surfaceHolder);
            dispatch(new Function1(i7, internalSurfaceHolder, this) { // from class: com.bilibili.live.streaming.widget.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f65426a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f65427b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f65428c;

                {
                    this.f65426a = i7;
                    this.f65427b = internalSurfaceHolder;
                    this.f65428c = this;
                }

                public final Object invoke(Object obj) {
                    switch (this.f65426a) {
                        case 0:
                            return SurfaceRenderView.SurfaceViewCallback.surfaceCreated$lambda$0((SurfaceRenderView.InternalSurfaceHolder) this.f65427b, (SurfaceRenderView.SurfaceViewCallback) this.f65428c, (IRenderViewCallback) obj);
                        case 1:
                            return new z((VodUrlPlayer) this.f65427b, (v) this.f65428c);
                        default:
                            MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
                            g gVar = (g) this.f65427b;
                            mutableBundleLike.put("video_id", String.valueOf(gVar.f122790a));
                            String str = gVar.f122791b;
                            String str2 = str;
                            if (str == null) {
                                str2 = "";
                            }
                            mutableBundleLike.put("video_title", str2);
                            mutableBundleLike.put("download_page_scene", String.valueOf((((OfflineHomeHolder.DownloadedVideoHolder) this.f65428c).b == OfflineHomeHolder.DownloadedVideoHolder.HolderScene.DOWNLOAD_LIST && (gVar.f122800l instanceof DramaVideo)) ? 1L : 0L));
                            return Unit.INSTANCE;
                    }
                }
            });
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(@NotNull SurfaceHolder surfaceHolder) {
            LivePusherLog.i$default(SurfaceRenderView.TAG, "surfaceDestroyed", null, 4, null);
            this.previewSurface = surfaceHolder.getSurface();
            this.isFormatChanged = false;
            this.surfaceWidth = 0;
            this.surfaceHeight = 0;
            dispatch(new l(new InternalSurfaceHolder(this.weakRenderView.get(), this.previewSurface, surfaceHolder), 1));
        }
    }

    public SurfaceRenderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.surfaceCallback = new SurfaceViewCallback(this, this);
        getHolder().addCallback(this.surfaceCallback);
    }

    public /* synthetic */ SurfaceRenderView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    @Override // com.bilibili.live.streaming.widget.IRenderView
    public void addRenderCallback(@NotNull IRenderViewCallback iRenderViewCallback) {
        this.surfaceCallback.addRenderCallback(iRenderViewCallback);
    }

    @Nullable
    public final Surface getSurface() {
        return getHolder().getSurface();
    }

    @Override // com.bilibili.live.streaming.widget.IRenderView
    @NotNull
    public View getView() {
        return this;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i7, int i8) {
        int iRoundToInt;
        super.onMeasure(i7, i8);
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i8);
        float f7 = this.aspectRatio;
        if (f7 == 0.0f) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (size <= size2) {
            f7 = 1.0f / f7;
        }
        float f8 = size;
        float f9 = size2 * f7;
        if (f8 < f9) {
            iRoundToInt = MathKt.roundToInt(f9);
        } else {
            size2 = MathKt.roundToInt(f8 / f7);
            iRoundToInt = size;
        }
        LivePusherLog.i$default(TAG, f.a(iRoundToInt, size2, "Measured dimensions set: ", " x "), null, 4, null);
        setMeasuredDimension(iRoundToInt, size2);
    }

    @Override // com.bilibili.live.streaming.widget.IRenderView
    public void removeRenderCallback(@NotNull IRenderViewCallback iRenderViewCallback) {
        this.surfaceCallback.removeRenderCallback(iRenderViewCallback);
    }

    public final void setAspectRatio(int i7, int i8) {
        if (i7 <= 0 || i8 <= 0) {
            throw new IllegalArgumentException("Size cannot be negative");
        }
        this.aspectRatio = i7 / i8;
        getHolder().setFixedSize(i7, i8);
        requestLayout();
    }
}
