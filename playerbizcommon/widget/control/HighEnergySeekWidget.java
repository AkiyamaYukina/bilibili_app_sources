package com.bilibili.playerbizcommon.widget.control;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.SeekBar;
import er0.C6970a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.panel.IPanelContainer;
import tv.danmaku.biliplayerv2.service.CurrentVideoPointer;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.service.IVideosPlayDirectorService;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.service.SeekService;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.interact.biz.IWatchPointsLoadListener;
import tv.danmaku.biliplayerv2.service.interact.biz.WatchPointObserver;
import tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;
import yq0.C9078b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/HighEnergySeekWidget.class */
public final class HighEnergySeekWidget extends PlayerSeekWidget implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f80443E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f80444F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f80445G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public SeekBar.OnSeekBarChangeListener f80446H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public HighEnergySeekWidget f80447I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f80448J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f80449K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f80450L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public PlayerContainer f80451M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.Client<SeekService> f80452N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @Nullable
    public FunctionWidgetToken f80453O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public C9078b f80454P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @NotNull
    public final b f80455Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @NotNull
    public final d f80456R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    @NotNull
    public final c f80457S;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/HighEnergySeekWidget$a.class */
    public interface a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/HighEnergySeekWidget$b.class */
    public static final class b implements IVideosPlayDirectorService.VideoPlayEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HighEnergySeekWidget f80458a;

        public b(HighEnergySeekWidget highEnergySeekWidget) {
            this.f80458a = highEnergySeekWidget;
        }

        public final void onVideoItemWillChange(CurrentVideoPointer currentVideoPointer, CurrentVideoPointer currentVideoPointer2, Video video) {
            if (Intrinsics.areEqual(currentVideoPointer, currentVideoPointer2)) {
                return;
            }
            this.f80458a.setSeekBarProcessDrawable(null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/HighEnergySeekWidget$c.class */
    public static final class c implements WatchPointObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HighEnergySeekWidget f80459a;

        public c(HighEnergySeekWidget highEnergySeekWidget) {
            this.f80459a = highEnergySeekWidget;
        }

        public final void onDraggingListener(boolean z6) {
            if (z6) {
                return;
            }
            C9078b c9078b = this.f80459a.f80454P;
            C9078b c9078b2 = c9078b;
            if (c9078b == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSeekBarDrawableHelper");
                c9078b2 = null;
            }
            c9078b2.c(null);
        }

        public final void onWatchPointChanged(ChronosThumbnailInfo.WatchPoint watchPoint, ChronosThumbnailInfo.WatchPoint watchPoint2, boolean z6) {
            if (z6) {
                C9078b c9078b = this.f80459a.f80454P;
                C9078b c9078b2 = c9078b;
                if (c9078b == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSeekBarDrawableHelper");
                    c9078b2 = null;
                }
                c9078b2.c(watchPoint2);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/HighEnergySeekWidget$d.class */
    public static final class d implements IWatchPointsLoadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HighEnergySeekWidget f80460a;

        public d(HighEnergySeekWidget highEnergySeekWidget) {
            this.f80460a = highEnergySeekWidget;
        }

        public final void onLoaded(List<ChronosThumbnailInfo.WatchPoint> list) {
            HighEnergySeekWidget highEnergySeekWidget = this.f80460a;
            IPlayerContainer iPlayerContainer = highEnergySeekWidget.f80451M;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            if (iPlayerContainer2.getPlayerCoreService().getDuration() <= 0) {
                return;
            }
            highEnergySeekWidget.setSeekBarProcessDrawable(list);
        }
    }

    public HighEnergySeekWidget(@NotNull Context context) {
        super(context);
        this.f80452N = new PlayerServiceManager.Client<>();
        this.f80455Q = new b(this);
        this.f80456R = new d(this);
        this.f80457S = new c(this);
        M(context, null);
    }

    public HighEnergySeekWidget(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f80452N = new PlayerServiceManager.Client<>();
        this.f80455Q = new b(this);
        this.f80456R = new d(this);
        this.f80457S = new c(this);
        M(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSeekBarProcessDrawable(List<ChronosThumbnailInfo.WatchPoint> list) {
        IPlayerContainer iPlayerContainer = this.f80451M;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        int duration = iPlayerContainer2.getPlayerCoreService().getDuration() / 1000;
        C9078b c9078b = this.f80454P;
        C9078b c9078b2 = c9078b;
        if (c9078b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBarDrawableHelper");
            c9078b2 = null;
        }
        if (c9078b2.f129799j) {
            C9078b c9078b3 = this.f80454P;
            if (c9078b3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSeekBarDrawableHelper");
                c9078b3 = null;
            }
            c9078b3.d(duration, list);
            return;
        }
        C9078b c9078b4 = this.f80454P;
        if (c9078b4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBarDrawableHelper");
            c9078b4 = null;
        }
        setProgressDrawable(c9078b4.a(duration, list));
    }

    public final void M(Context context, AttributeSet attributeSet) {
        if (this.f80449K) {
            return;
        }
        this.f80449K = true;
        this.f80448J = ViewConfiguration.get(context).getScaledTouchSlop();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Nh1.a.c);
            this.f80445G = typedArrayObtainStyledAttributes.getBoolean(2, false);
            typedArrayObtainStyledAttributes.recycle();
        }
        setAccessibilityDelegate(new com.bilibili.playerbizcommon.widget.control.a(this));
    }

    public final void O() {
        this.f80444F = true;
        HighEnergySeekWidget highEnergySeekWidget = this.f80447I;
        if (highEnergySeekWidget != null) {
            highEnergySeekWidget.onStartTrackingTouch(this);
        }
    }

    public final void P() {
        this.f80444F = false;
        HighEnergySeekWidget highEnergySeekWidget = this.f80447I;
        if (highEnergySeekWidget != null) {
            highEnergySeekWidget.onStopTrackingTouch(this);
        }
    }

    public final void Q(MotionEvent motionEvent) {
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int x6 = (int) motionEvent.getX();
        boolean z6 = false;
        int max = (int) (((x6 < paddingLeft ? 0.0f : x6 > width - paddingRight ? 1.0f : (x6 - paddingLeft) / ((width - paddingLeft) - paddingRight)) * getMax()) + 0);
        if (max != getProgress()) {
            z6 = true;
        }
        this.f80450L = z6;
        setProgress(max);
    }

    @Override // com.bilibili.playerbizcommon.widget.control.PlayerSeekWidget
    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        super.bindPlayerContainer(playerContainer);
        this.f80451M = playerContainer;
        C9078b c9078b = new C9078b(getContext());
        PlayerContainer playerContainer2 = this.f80451M;
        PlayerContainer playerContainer3 = playerContainer2;
        if (playerContainer2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer3 = null;
        }
        c9078b.e(playerContainer3.getPlayerParams().getConfig().getTheme());
        this.f80454P = c9078b;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(@NotNull SeekBar seekBar, int i7, boolean z6) {
        boolean z7 = this.f80450L;
        this.f80450L = false;
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f80446H;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i7, z7);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(@NotNull SeekBar seekBar) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f80446H;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(@NotNull SeekBar seekBar) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f80446H;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
        C9078b c9078b = this.f80454P;
        C9078b c9078b2 = c9078b;
        if (c9078b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBarDrawableHelper");
            c9078b2 = null;
        }
        c9078b2.c(null);
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        C9078b.a aVarB;
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            ViewParent parent = getParent();
            while (true) {
                ViewParent viewParent = parent;
                if (viewParent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) viewParent;
                    if (viewGroup.shouldDelayChildPressedState()) {
                        break;
                    }
                    parent = viewGroup.getParent();
                } else if (!this.f80445G) {
                    setPressed(true);
                    if (getThumb() != null) {
                        invalidate(getThumb().getBounds());
                    }
                    O();
                    Q(motionEvent);
                    ViewParent parent2 = getParent();
                    if (parent2 == null) {
                        return true;
                    }
                    parent2.requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            }
            this.f80443E = motionEvent.getX();
            return true;
        }
        if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    return true;
                }
                if (this.f80444F) {
                    P();
                    setPressed(false);
                }
                invalidate();
                return true;
            }
            if (this.f80444F) {
                Q(motionEvent);
                return true;
            }
            if (Math.abs(motionEvent.getX() - this.f80443E) <= this.f80448J) {
                return true;
            }
            setPressed(true);
            if (getThumb() != null) {
                invalidate(getThumb().getBounds());
            }
            O();
            Q(motionEvent);
            ViewParent parent3 = getParent();
            if (parent3 == null) {
                return true;
            }
            parent3.requestDisallowInterceptTouchEvent(true);
            return true;
        }
        if (this.f80444F) {
            Q(motionEvent);
            P();
            setPressed(false);
        } else if (this.f80445G) {
            float x6 = motionEvent.getX();
            int width = getWidth();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            IPlayerContainer iPlayerContainer = this.f80451M;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            int duration = iPlayerContainer2.getPlayerCoreService().getDuration() / 1000;
            if (duration <= 0) {
                aVarB = null;
            } else {
                C9078b c9078b = this.f80454P;
                C9078b c9078b2 = c9078b;
                if (c9078b == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSeekBarDrawableHelper");
                    c9078b2 = null;
                }
                aVarB = c9078b2.b(x6 - getPaddingLeft(), duration, (width - paddingLeft) - paddingRight);
            }
            if (aVarB == null) {
                O();
                Q(motionEvent);
                P();
            } else {
                FunctionWidgetToken functionWidgetToken = this.f80453O;
                if (functionWidgetToken == null || functionWidgetToken.isRemoved()) {
                    IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-2, -2);
                    layoutParams.setFunctionType(1);
                    layoutParams.setLayoutType(8);
                    layoutParams.setExitAnim(-1);
                    layoutParams.setEnterAnim(-1);
                    layoutParams.touchOutsideDismiss(false);
                    IPlayerContainer iPlayerContainer3 = this.f80451M;
                    IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
                    if (iPlayerContainer3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                        iPlayerContainer4 = null;
                    }
                    this.f80453O = iPlayerContainer4.getFunctionWidgetService().showWidget(C6970a.class, layoutParams);
                } else {
                    IPlayerContainer iPlayerContainer5 = this.f80451M;
                    IPlayerContainer iPlayerContainer6 = iPlayerContainer5;
                    if (iPlayerContainer5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                        iPlayerContainer6 = null;
                    }
                    iPlayerContainer6.getFunctionWidgetService().showWidget(this.f80453O);
                }
                int[] iArr = new int[2];
                PlayerContainer playerContainer = this.f80451M;
                PlayerContainer playerContainer2 = playerContainer;
                if (playerContainer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                    playerContainer2 = null;
                }
                IPanelContainer panelContainer = playerContainer2.getPanelContainer();
                if (panelContainer != null) {
                    panelContainer.location(this, iArr);
                }
                int i7 = iArr[0];
                int paddingLeft2 = getPaddingLeft();
                Rect rect = new Rect(paddingLeft2 + i7, iArr[1], getWidth() + iArr[0], getHeight() + iArr[1]);
                ChronosThumbnailInfo.WatchPoint watchPoint = aVarB.f129800a;
                int from = watchPoint.getFrom();
                IPlayerContainer iPlayerContainer7 = this.f80451M;
                IPlayerContainer iPlayerContainer8 = iPlayerContainer7;
                if (iPlayerContainer7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                    iPlayerContainer8 = null;
                }
                iPlayerContainer8.getPlayerCoreService().getDuration();
                String content = watchPoint.getContent();
                String str = content;
                if (content == null) {
                    str = "";
                }
                C6970a.C1256a c1256a = new C6970a.C1256a(from * 1000, aVarB.f129801b, str, rect);
                IPlayerContainer iPlayerContainer9 = this.f80451M;
                if (iPlayerContainer9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                    iPlayerContainer9 = null;
                }
                iPlayerContainer9.getFunctionWidgetService().updateFunctionWidgetConfiguration(this.f80453O, c1256a);
            }
        } else {
            O();
            Q(motionEvent);
            P();
        }
        invalidate();
        return true;
    }

    @Override // com.bilibili.playerbizcommon.widget.control.PlayerSeekWidget
    public final void onWidgetActive() {
        super.onWidgetActive();
        IPlayerContainer iPlayerContainer = this.f80451M;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getVideoPlayDirectorService().addVideoPlayEventListener(this.f80455Q);
        IPlayerContainer iPlayerContainer3 = this.f80451M;
        IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer4 = null;
        }
        iPlayerContainer4.getPlayerServiceManager().bindService(PlayerServiceManager.ServiceDescriptor.Companion.obtain(SeekService.class), this.f80452N);
        IPlayerContainer iPlayerContainer5 = this.f80451M;
        IPlayerContainer iPlayerContainer6 = iPlayerContainer5;
        if (iPlayerContainer5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer6 = null;
        }
        iPlayerContainer6.getInteractLayerService().addWatchPointsLoadListener(this.f80456R);
        IPlayerContainer iPlayerContainer7 = this.f80451M;
        IPlayerContainer iPlayerContainer8 = iPlayerContainer7;
        if (iPlayerContainer7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer8 = null;
        }
        iPlayerContainer8.getInteractLayerService().registerWatchPointsChangeObserver(this.f80457S);
        IPlayerContainer iPlayerContainer9 = this.f80451M;
        IPlayerContainer iPlayerContainer10 = iPlayerContainer9;
        if (iPlayerContainer9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer10 = null;
        }
        if (iPlayerContainer10.getPlayerCoreService().getDuration() <= 0) {
            return;
        }
        IPlayerContainer iPlayerContainer11 = this.f80451M;
        if (iPlayerContainer11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer11 = null;
        }
        setSeekBarProcessDrawable(iPlayerContainer11.getInteractLayerService().getWatchPoints());
    }

    @Override // com.bilibili.playerbizcommon.widget.control.PlayerSeekWidget
    public final void onWidgetInactive() {
        super.onWidgetInactive();
        IPlayerContainer iPlayerContainer = this.f80451M;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getInteractLayerService().removeWatchPointsLoadListener(this.f80456R);
        IPlayerContainer iPlayerContainer3 = this.f80451M;
        IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer4 = null;
        }
        iPlayerContainer4.getInteractLayerService().unregisterWatchPointsChangeObserver(this.f80457S);
        IPlayerContainer iPlayerContainer5 = this.f80451M;
        IPlayerContainer iPlayerContainer6 = iPlayerContainer5;
        if (iPlayerContainer5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer6 = null;
        }
        iPlayerContainer6.getVideoPlayDirectorService().removeVideoPlayEventListener(this.f80455Q);
        IPlayerContainer iPlayerContainer7 = this.f80451M;
        if (iPlayerContainer7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer7 = null;
        }
        iPlayerContainer7.getPlayerServiceManager().unbindService(PlayerServiceManager.ServiceDescriptor.Companion.obtain(SeekService.class), this.f80452N);
    }

    public final void setEnableTap(boolean z6) {
        this.f80445G = z6;
    }

    public final void setOnEnergeticPartTapListener(@NotNull a aVar) {
        setEnableTap(true);
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(@NotNull SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f80447I = this;
        super.setOnSeekBarChangeListener(this);
        this.f80446H = onSeekBarChangeListener;
    }
}
