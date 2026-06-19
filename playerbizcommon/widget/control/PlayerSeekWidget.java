package com.bilibili.playerbizcommon.widget.control;

import Hk0.m;
import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import bolts.Continuation;
import bolts.Task;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.BiliImageLoaderHelper;
import com.bilibili.lib.image2.bean.BiliAnimatedDrawable;
import com.bilibili.lib.image2.bean.DrawableHolder;
import com.bilibili.lib.mod.P0;
import com.bilibili.mediautils.FileUtils;
import com.bilibili.opd.app.bizcommon.context.KFCFragmentLoaderActivity;
import com.bilibili.playerbizcommon.gesture.GestureService;
import com.bilibili.playerbizcommon.gesture.HorizontalScrollListener;
import com.bilibili.playerbizcommon.utils.GestureMaxValueHolder;
import com.bilibili.playerbizcommon.utils.SpriteManager;
import com.bilibili.playerbizcommon.widget.control.PlayerSeekWidget;
import com.bilibili.playerbizcommon.widget.function.seek.SeekThumbnailFunctionWidget;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.panel.IPanelContainer;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.CurrentVideoPointer;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IPlayerServiceManager;
import tv.danmaku.biliplayerv2.service.IRenderContainerService;
import tv.danmaku.biliplayerv2.service.IVideosPlayDirectorService;
import tv.danmaku.biliplayerv2.service.PlayerProgressObserver;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.service.SeekGestureEnableObserver;
import tv.danmaku.biliplayerv2.service.SeekService;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.render.wholescene.WholeSceneModeChangeObserver;
import tv.danmaku.biliplayerv2.widget.IControlWidget;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerSeekWidget.class */
public class PlayerSeekWidget extends AppCompatSeekBar implements IControlWidget, SeekGestureEnableObserver, WholeSceneModeChangeObserver, PlayerProgressObserver {

    @NotNull
    public static final a Companion = new Object();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public CoroutineScope f80517A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final g f80518B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final e f80519C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final f f80520D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public PlayerContainer f80521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public IPlayerCoreService f80522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public IControlContainerService f80523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.Client<GestureService> f80524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.Client<SeekService> f80525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public c f80526g;

    @Nullable
    public b h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f80527i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public FunctionWidgetToken f80528j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f80529k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f80530l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f80531m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f80532n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f80533o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f80534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f80535q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f80536r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Lazy f80537s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public d f80538t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f80539u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public DrawableHolder f80540v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public DrawableHolder f80541w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final GestureMaxValueHolder f80542x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public Drawable f80543y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f80544z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerSeekWidget$a.class */
    public static final class a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerSeekWidget$b.class */
    public static final class b extends Drawable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Paint f80545a = new Paint(1);

        public b() {
            setBounds(new Rect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom));
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(@NotNull Canvas canvas) {
            Rect bounds = getBounds();
            canvas.translate(bounds.left, bounds.top);
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i7) {
            this.f80545a.setAlpha(i7);
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(@Nullable ColorFilter colorFilter) {
            this.f80545a.setColorFilter(colorFilter);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerSeekWidget$c.class */
    public static final class c extends LottieDrawable {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Nullable
        public final LottieComposition f80546v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @Nullable
        public final LottieComposition f80547w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f80548x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public boolean f80549y = true;

        public c(@Nullable LottieComposition lottieComposition, @Nullable LottieComposition lottieComposition2) {
            this.f80546v = lottieComposition;
            this.f80547w = lottieComposition2;
            setComposition(lottieComposition);
            setProgress(0.5f);
        }

        @Override // com.airbnb.lottie.LottieDrawable, android.graphics.drawable.Drawable
        public final void draw(@NotNull Canvas canvas) {
            try {
                Rect bounds = getBounds();
                canvas.translate(bounds.left, bounds.top);
                super.draw(canvas);
            } catch (Exception e7) {
                BLog.e("SeekWidgetDrawable", e7);
            }
        }

        @Override // com.airbnb.lottie.LottieDrawable
        public final boolean setComposition(@NotNull LottieComposition lottieComposition) {
            Rect rect = new Rect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
            boolean composition = super.setComposition(lottieComposition);
            setBounds(rect);
            return composition;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerSeekWidget$d.class */
    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final BiliAnimatedDrawable f80550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final BiliAnimatedDrawable f80551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f80552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f80553d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f80554e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final PlayerSeekWidget f80555f;

        public d(@NotNull PlayerSeekWidget playerSeekWidget, @NotNull BiliAnimatedDrawable biliAnimatedDrawable, BiliAnimatedDrawable biliAnimatedDrawable2) {
            this.f80555f = playerSeekWidget;
            this.f80550a = biliAnimatedDrawable;
            this.f80551b = biliAnimatedDrawable2;
            playerSeekWidget.setThumbInternal(biliAnimatedDrawable);
            int frameCount = biliAnimatedDrawable.getFrameCount() / 2;
            this.f80554e = frameCount;
            biliAnimatedDrawable.jumpToFrame(frameCount);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerSeekWidget$e.class */
    public static final class e implements HorizontalScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f80556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f80557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PlayerSeekWidget f80558c;

        public e(PlayerSeekWidget playerSeekWidget) {
            this.f80558c = playerSeekWidget;
        }

        @Override // com.bilibili.playerbizcommon.gesture.HorizontalScrollListener
        public final void onCancel() {
            this.f80558c.o();
        }

        @Override // com.bilibili.playerbizcommon.gesture.HorizontalScrollListener
        public final void onScroll(float f7, Pair<Float, Float> pair) {
            IPanelContainer panelContainer;
            IPanelContainer panelContainer2;
            PlayerSeekWidget playerSeekWidget = this.f80558c;
            if (playerSeekWidget.f80528j != null) {
                PlayerContainer playerContainer = playerSeekWidget.f80521b;
                int width = (playerContainer == null || (panelContainer2 = playerContainer.getPanelContainer()) == null) ? 0 : panelContainer2.getWidth();
                PlayerContainer playerContainer2 = playerSeekWidget.f80521b;
                int height = (playerContainer2 == null || (panelContainer = playerContainer2.getPanelContainer()) == null) ? 0 : panelContainer.getHeight();
                float f8 = width;
                boolean z6 = ((Number) pair.getFirst()).floatValue() < 0.1f * f8 && ((Number) pair.getSecond()).floatValue() < ((float) height) * 0.3f;
                boolean z7 = z6;
                if (((Number) pair.getFirst()).floatValue() > f8 * 0.9f) {
                    z7 = z6;
                    if (((Number) pair.getSecond()).floatValue() < height * 0.3f) {
                        z7 = true;
                    }
                }
                if (playerSeekWidget.f80529k != z7) {
                    playerSeekWidget.f80529k = z7;
                    playerSeekWidget.f80531m = true;
                }
            }
            PlayerSeekWidget.access$refreshGestureHolder(playerSeekWidget);
            int maxValue = (int) ((playerSeekWidget.f80542x.getMaxValue() * f7) + this.f80556a);
            this.f80557b = maxValue;
            int iMin = Math.min(Math.max(maxValue, 0), playerSeekWidget.getMax());
            this.f80557b = iMin;
            playerSeekWidget.setProgress(iMin);
            PlayerSeekWidget.access$progressChangeFromUser(playerSeekWidget, this.f80557b);
        }

        @Override // com.bilibili.playerbizcommon.gesture.HorizontalScrollListener
        public final void onScrollStart(float f7, Pair<Float, Float> pair) {
            PlayerSeekWidget playerSeekWidget = this.f80558c;
            IControlContainerService iControlContainerService = playerSeekWidget.f80523d;
            if (iControlContainerService != null) {
                iControlContainerService.removeHideTask();
            }
            PlayerSeekWidget.access$refresh(playerSeekWidget);
            this.f80556a = playerSeekWidget.getProgress();
            PlayerSeekWidget.access$startTrackingTouch(playerSeekWidget);
        }

        @Override // com.bilibili.playerbizcommon.gesture.HorizontalScrollListener
        public final void onScrollStop(float f7, Pair<Float, Float> pair) {
            PlayerSeekWidget playerSeekWidget = this.f80558c;
            IControlContainerService iControlContainerService = playerSeekWidget.f80523d;
            if (iControlContainerService != null) {
                iControlContainerService.addHideTask();
            }
            playerSeekWidget.setProgress(this.f80557b);
            PlayerSeekWidget.access$stopTrackingTouch(playerSeekWidget);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerSeekWidget$f.class */
    public static final class f implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerSeekWidget f80559a;

        public f(PlayerSeekWidget playerSeekWidget) {
            this.f80559a = playerSeekWidget;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
            PlayerSeekWidget.access$updateIconWhenProgressChanged(this.f80559a, i7);
            c cVar = this.f80559a.f80526g;
            if (cVar != null && !cVar.f80549y) {
                int i8 = i7 - cVar.f80548x;
                cVar.f80548x = i7;
                float fMin = Math.min(Math.max(cVar.getProgress(), 0.0f), 1.0f);
                if (i8 > 0) {
                    cVar.setProgress(fMin + 0.05f);
                } else if (i8 < 0) {
                    cVar.setProgress(fMin - 0.05f);
                } else {
                    cVar.setProgress(fMin < 0.5f ? fMin + 0.05f : fMin - 0.05f);
                }
            }
            d dVar = this.f80559a.f80538t;
            if (dVar != null && !dVar.f80553d) {
                int i9 = i7 - dVar.f80552c;
                dVar.f80552c = i7;
                BiliAnimatedDrawable biliAnimatedDrawable = dVar.f80550a;
                int frameCount = biliAnimatedDrawable.getFrameCount();
                if (i9 > 0) {
                    dVar.f80554e++;
                } else if (i9 < 0) {
                    dVar.f80554e--;
                } else {
                    int i10 = dVar.f80554e;
                    dVar.f80554e = i10 < frameCount / 2 ? i10 + 1 : i10 - 1;
                }
                int iCoerceIn = RangesKt.coerceIn(dVar.f80554e, 0, frameCount - 1);
                dVar.f80554e = iCoerceIn;
                biliAnimatedDrawable.jumpToFrame(iCoerceIn);
            }
            if (z6) {
                PlayerSeekWidget.access$progressChangeFromUser(this.f80559a, i7);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            ViewParent parent = this.f80559a.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            PlayerSeekWidget.access$startTrackingTouch(this.f80559a);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            ViewParent parent = this.f80559a.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            PlayerSeekWidget.access$stopTrackingTouch(this.f80559a);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/PlayerSeekWidget$g.class */
    public static final class g implements IVideosPlayDirectorService.VideoPlayEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerSeekWidget f80560a;

        public g(PlayerSeekWidget playerSeekWidget) {
            this.f80560a = playerSeekWidget;
        }

        public final void onVideoItemStart(CurrentVideoPointer currentVideoPointer, Video video) {
            this.f80560a.v();
        }

        public final void onVideoItemWillChange(CurrentVideoPointer currentVideoPointer, CurrentVideoPointer currentVideoPointer2, Video video) {
            if (!Intrinsics.areEqual(currentVideoPointer, currentVideoPointer2)) {
                this.f80560a.f80542x.setShouldUpdate(true);
            }
            super.onVideoItemWillChange(currentVideoPointer, currentVideoPointer2, video);
        }

        public final void onVideoSetChanged() {
            String finishSpriteImg;
            IVideosPlayDirectorService videoPlayDirectorService;
            Video.PlayableParams currentPlayableParams;
            super.onVideoSetChanged();
            PlayerSeekWidget playerSeekWidget = this.f80560a;
            if (playerSeekWidget.f80532n || playerSeekWidget.f80533o) {
                return;
            }
            PlayerContainer playerContainer = playerSeekWidget.f80521b;
            Video.DisplayParams displayParams = (playerContainer == null || (videoPlayDirectorService = playerContainer.getVideoPlayDirectorService()) == null || (currentPlayableParams = videoPlayDirectorService.getCurrentPlayableParams()) == null) ? null : currentPlayableParams.getDisplayParams();
            if (displayParams == null || TextUtils.equals(displayParams.getFrom(), "downloaded")) {
                return;
            }
            String seekIconUrl1 = displayParams.getSeekIconUrl1();
            String seekIconUrl2 = displayParams.getSeekIconUrl2();
            String middleIcon = displayParams.getMiddleIcon();
            String dragSpriteImg = displayParams.getDragSpriteImg();
            if ((dragSpriteImg == null || dragSpriteImg.length() == 0 || (finishSpriteImg = displayParams.getFinishSpriteImg()) == null || finishSpriteImg.length() == 0) && ((TextUtils.isEmpty(seekIconUrl1) || TextUtils.isEmpty(seekIconUrl2)) && TextUtils.isEmpty(middleIcon))) {
                return;
            }
            playerSeekWidget.v();
        }

        public final void onVideoStart(Video video) {
            PlayerSeekWidget playerSeekWidget = this.f80560a;
            playerSeekWidget.f80532n = false;
            playerSeekWidget.f80533o = false;
            playerSeekWidget.f80527i = false;
            playerSeekWidget.f80539u = false;
            playerSeekWidget.z();
        }

        public final void onVideoWillChange(Video video, Video video2) {
            if (Intrinsics.areEqual(video, video2)) {
                return;
            }
            this.f80560a.f80542x.setShouldUpdate(true);
        }
    }

    public PlayerSeekWidget(@NotNull Context context) {
        super(context);
        this.f80524e = new PlayerServiceManager.Client<>();
        this.f80525f = new PlayerServiceManager.Client<>();
        this.f80535q = true;
        this.f80536r = ConfigManager.Companion.isHitFF("ugc.player_seekbar_sprite_disable");
        this.f80537s = LazyKt.lazy(new m(this, 2));
        this.f80542x = new GestureMaxValueHolder();
        this.f80518B = new g(this);
        this.f80519C = new e(this);
        this.f80520D = new f(this);
        u();
    }

    public PlayerSeekWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f80524e = new PlayerServiceManager.Client<>();
        this.f80525f = new PlayerServiceManager.Client<>();
        this.f80535q = true;
        this.f80536r = ConfigManager.Companion.isHitFF("ugc.player_seekbar_sprite_disable");
        this.f80537s = LazyKt.lazy(new m(this, 2));
        this.f80542x = new GestureMaxValueHolder();
        this.f80518B = new g(this);
        this.f80519C = new e(this);
        this.f80520D = new f(this);
        u();
    }

    public PlayerSeekWidget(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f80524e = new PlayerServiceManager.Client<>();
        this.f80525f = new PlayerServiceManager.Client<>();
        this.f80535q = true;
        this.f80536r = ConfigManager.Companion.isHitFF("ugc.player_seekbar_sprite_disable");
        this.f80537s = LazyKt.lazy(new m(this, 2));
        this.f80542x = new GestureMaxValueHolder();
        this.f80518B = new g(this);
        this.f80519C = new e(this);
        this.f80520D = new f(this);
        u();
    }

    public static final void access$progressChangeFromUser(PlayerSeekWidget playerSeekWidget, int i7) {
        AbsFunctionWidgetService functionWidgetService;
        IPanelContainer panelContainer;
        IInteractLayerService interactLayerService;
        SeekService service = playerSeekWidget.f80525f.getService();
        if (service != null) {
            service.setDraggingProgress(i7, playerSeekWidget.getMax());
        }
        FunctionWidgetToken functionWidgetToken = playerSeekWidget.f80528j;
        if (functionWidgetToken == null || !playerSeekWidget.f80531m) {
            return;
        }
        playerSeekWidget.f80531m = false;
        SeekThumbnailFunctionWidget.Configuration configuration = new SeekThumbnailFunctionWidget.Configuration();
        configuration.setInUnSeekRegion(playerSeekWidget.f80529k);
        if (playerSeekWidget.G()) {
            configuration.setType(1);
            PlayerContainer playerContainer = playerSeekWidget.f80521b;
            configuration.setThumbnailFetcher((playerContainer == null || (interactLayerService = playerContainer.getInteractLayerService()) == null) ? null : interactLayerService.getThumbnailFetcher());
        } else {
            configuration.setType(2);
        }
        int[] iArr = new int[2];
        PlayerContainer playerContainer2 = playerSeekWidget.f80521b;
        if (playerContainer2 != null && (panelContainer = playerContainer2.getPanelContainer()) != null) {
            panelContainer.location(playerSeekWidget, iArr);
        }
        int i8 = iArr[0];
        configuration.setSeekBounds(new Rect(i8, iArr[1], playerSeekWidget.getWidth() + i8, playerSeekWidget.getHeight() + iArr[1]));
        PlayerContainer playerContainer3 = playerSeekWidget.f80521b;
        if (playerContainer3 == null || (functionWidgetService = playerContainer3.getFunctionWidgetService()) == null) {
            return;
        }
        functionWidgetService.updateFunctionWidgetConfiguration(functionWidgetToken, configuration);
    }

    public static final void access$refresh(PlayerSeekWidget playerSeekWidget) {
        IPlayerCoreService iPlayerCoreService = playerSeekWidget.f80522c;
        if (iPlayerCoreService != null) {
            int duration = iPlayerCoreService.getDuration();
            int currentPosition = iPlayerCoreService.getCurrentPosition();
            float bufferedPercentage = iPlayerCoreService.getBufferedPercentage();
            if (currentPosition < 0 || duration <= 0) {
                return;
            }
            int i7 = currentPosition;
            if (currentPosition > duration) {
                i7 = duration;
            }
            playerSeekWidget.setMax(duration);
            if (!playerSeekWidget.f80530l) {
                playerSeekWidget.setProgress(i7);
            }
            if (playerSeekWidget.f80543y == null) {
                playerSeekWidget.f80543y = ((LayerDrawable) playerSeekWidget.getProgressDrawable()).findDrawableByLayerId(R.id.progress);
            }
            playerSeekWidget.f80544z = i7;
            playerSeekWidget.K(i7);
            playerSeekWidget.setSecondaryProgress((int) (duration * bufferedPercentage));
        }
    }

    public static final void access$refreshGestureHolder(PlayerSeekWidget playerSeekWidget) {
        GestureMaxValueHolder gestureMaxValueHolder = playerSeekWidget.f80542x;
        IPlayerCoreService iPlayerCoreService = playerSeekWidget.f80522c;
        gestureMaxValueHolder.refresh(iPlayerCoreService != null ? iPlayerCoreService.getDuration() : 0);
    }

    public static final void access$startTrackingTouch(PlayerSeekWidget playerSeekWidget) {
        PlayerContainer playerContainer;
        IInteractLayerService interactLayerService;
        AbsFunctionWidgetService functionWidgetService;
        playerSeekWidget.f80530l = true;
        SeekService service = playerSeekWidget.f80525f.getService();
        if (service != null) {
            service.setDraggingByUser(true);
        }
        d dVar = playerSeekWidget.f80538t;
        if (dVar != null) {
            int progress = playerSeekWidget.getProgress();
            dVar.f80551b.stop();
            dVar.f80552c = progress;
            dVar.f80553d = false;
            BiliAnimatedDrawable biliAnimatedDrawable = dVar.f80550a;
            dVar.f80555f.setThumbInternal(biliAnimatedDrawable);
            int frameCount = biliAnimatedDrawable.getFrameCount() / 2;
            dVar.f80554e = frameCount;
            biliAnimatedDrawable.jumpToFrame(frameCount);
        }
        if (playerSeekWidget.h != null) {
            playerSeekWidget.f80535q = false;
            c cVar = playerSeekWidget.f80526g;
            if (cVar != null) {
                if (cVar.isAnimating()) {
                    playerSeekWidget.f80526g.cancelAnimation();
                }
                playerSeekWidget.f80526g = null;
            }
        }
        c cVar2 = playerSeekWidget.f80526g;
        if (cVar2 != null) {
            cVar2.f80548x = playerSeekWidget.getProgress();
            cVar2.f80549y = false;
            LottieComposition lottieComposition = cVar2.f80546v;
            if (lottieComposition != null) {
                cVar2.setComposition(lottieComposition);
                cVar2.setProgress(0.5f);
            }
        }
        FunctionWidgetToken functionWidgetToken = playerSeekWidget.f80528j;
        if (functionWidgetToken == null || functionWidgetToken.isRemoved()) {
            IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-1, -1);
            layoutParams.setLayoutType(32);
            layoutParams.setFunctionType(1);
            layoutParams.setEnterAnim(-1);
            layoutParams.setExitAnim(-1);
            PlayerContainer playerContainer2 = playerSeekWidget.f80521b;
            FunctionWidgetToken functionWidgetTokenShowWidget = null;
            if (playerContainer2 != null) {
                AbsFunctionWidgetService functionWidgetService2 = playerContainer2.getFunctionWidgetService();
                functionWidgetTokenShowWidget = null;
                if (functionWidgetService2 != null) {
                    functionWidgetTokenShowWidget = functionWidgetService2.showWidget(SeekThumbnailFunctionWidget.class, layoutParams);
                }
            }
            playerSeekWidget.f80528j = functionWidgetTokenShowWidget;
        } else {
            PlayerContainer playerContainer3 = playerSeekWidget.f80521b;
            if (playerContainer3 != null && (functionWidgetService = playerContainer3.getFunctionWidgetService()) != null) {
                functionWidgetService.showWidget(playerSeekWidget.f80528j);
            }
        }
        playerSeekWidget.f80531m = true;
        if (!playerSeekWidget.G() || (playerContainer = playerSeekWidget.f80521b) == null || (interactLayerService = playerContainer.getInteractLayerService()) == null) {
            return;
        }
        interactLayerService.loadThumbnailIfNeed();
    }

    public static final void access$stopTrackingTouch(PlayerSeekWidget playerSeekWidget) {
        PlayerContainer playerContainer;
        AbsFunctionWidgetService functionWidgetService;
        IPlayerCoreService playerCoreService;
        SeekService service = playerSeekWidget.f80525f.getService();
        if (service == null || !service.isSeekEnable()) {
            playerSeekWidget.o();
            return;
        }
        d dVar = playerSeekWidget.f80538t;
        if (dVar != null) {
            dVar.f80553d = true;
            BiliAnimatedDrawable biliAnimatedDrawable = dVar.f80551b;
            dVar.f80555f.setThumbInternal(biliAnimatedDrawable);
            biliAnimatedDrawable.start();
        }
        c cVar = playerSeekWidget.f80526g;
        if (cVar != null) {
            cVar.f80549y = true;
            LottieComposition lottieComposition = cVar.f80547w;
            if (lottieComposition != null) {
                cVar.setComposition(lottieComposition);
                cVar.playAnimation();
            }
        }
        PlayerContainer playerContainer2 = playerSeekWidget.f80521b;
        Integer numValueOf = (playerContainer2 == null || (playerCoreService = playerContainer2.getPlayerCoreService()) == null) ? null : Integer.valueOf(playerCoreService.getState());
        if (!playerSeekWidget.f80529k && ((numValueOf != null && numValueOf.intValue() == 4) || ((numValueOf != null && numValueOf.intValue() == 5) || (numValueOf != null && numValueOf.intValue() == 6)))) {
            int progress = playerSeekWidget.getProgress();
            int i7 = playerSeekWidget.f80544z;
            int i8 = progress - i7;
            if (i8 > 2000 || i8 < -500) {
                playerSeekWidget.K(playerSeekWidget.getProgress());
                playerSeekWidget.f80544z = playerSeekWidget.getProgress();
                IPlayerCoreService iPlayerCoreService = playerSeekWidget.f80522c;
                if (iPlayerCoreService != null) {
                    iPlayerCoreService.seekTo(playerSeekWidget.getProgress());
                }
            } else {
                playerSeekWidget.setProgress(i7);
            }
        }
        SeekService service2 = playerSeekWidget.f80525f.getService();
        if (service2 != null) {
            service2.setDraggingByUser(false);
        }
        playerSeekWidget.f80530l = false;
        FunctionWidgetToken functionWidgetToken = playerSeekWidget.f80528j;
        if (functionWidgetToken != null && (playerContainer = playerSeekWidget.f80521b) != null && (functionWidgetService = playerContainer.getFunctionWidgetService()) != null) {
            functionWidgetService.hideWidget(functionWidgetToken);
        }
        playerSeekWidget.f80529k = false;
        playerSeekWidget.f80531m = false;
        playerSeekWidget.f80535q = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void access$updateIconWhenProgressChanged(com.bilibili.playerbizcommon.widget.control.PlayerSeekWidget r3, int r4) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.widget.control.PlayerSeekWidget.access$updateIconWhenProgressChanged(com.bilibili.playerbizcommon.widget.control.PlayerSeekWidget, int):void");
    }

    public static Unit g(PlayerSeekWidget playerSeekWidget, Task task) {
        if (task == null || !task.isCompleted()) {
            playerSeekWidget.z();
        } else {
            android.util.Pair pair = (android.util.Pair) task.getResult();
            if ((pair != null ? (LottieComposition) pair.first : null) != null && pair.second != null) {
                c cVar = new c((LottieComposition) pair.first, (LottieComposition) pair.second);
                playerSeekWidget.f80526g = cVar;
                playerSeekWidget.setThumbInternal(cVar);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SpriteManager getMSpriteManager() {
        return (SpriteManager) this.f80537s.getValue();
    }

    public static void k(LottieComposition lottieComposition, PlayerSeekWidget playerSeekWidget, LottieComposition lottieComposition2) {
        if (lottieComposition != null) {
            c cVar = new c(lottieComposition, lottieComposition2);
            playerSeekWidget.f80526g = cVar;
            playerSeekWidget.setThumbInternal(cVar);
        }
    }

    public static String[] q(String str, String str2) {
        String path;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return null;
        }
        try {
            File externalFilesDir = BiliContext.application().getExternalFilesDir("player");
            if (externalFilesDir == null) {
                path = null;
            } else {
                if (!externalFilesDir.exists()) {
                    externalFilesDir.mkdirs();
                }
                path = externalFilesDir.getPath();
            }
            if (TextUtils.isEmpty(path)) {
                return null;
            }
            StringBuilder sb = new StringBuilder(path);
            StringBuilder sb2 = new StringBuilder(path);
            if (StringsKt.w(path, "/")) {
                sb.append("player_seek_bar_1_" + str.hashCode() + FileUtils.SUFFIX_JSON);
                ID.a.b(str2.hashCode(), "player_seek_bar_2_", FileUtils.SUFFIX_JSON, sb2);
            } else {
                String str3 = File.separator;
                sb.append(str3);
                ID.a.b(str.hashCode(), "player_seek_bar_1_", FileUtils.SUFFIX_JSON, sb);
                sb2.append(str3);
                ID.a.b(str2.hashCode(), "player_seek_bar_2_", FileUtils.SUFFIX_JSON, sb2);
            }
            return new String[]{sb.toString(), sb2.toString()};
        } catch (Exception e7) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setThumbInternal(Drawable drawable) {
        super.setThumb(drawable);
        requestLayout();
    }

    public final void F() {
        IVideosPlayDirectorService videoPlayDirectorService;
        Video.PlayableParams currentPlayableParams;
        PlayerContainer playerContainer = this.f80521b;
        Video.DisplayParams displayParams = (playerContainer == null || (videoPlayDirectorService = playerContainer.getVideoPlayDirectorService()) == null || (currentPlayableParams = videoPlayDirectorService.getCurrentPlayableParams()) == null) ? null : currentPlayableParams.getDisplayParams();
        if (displayParams == null || Intrinsics.areEqual(displayParams.getFrom(), "downloaded")) {
            z();
            return;
        }
        if (!this.f80536r && !this.f80539u) {
            String spritePath = getMSpriteManager().getSpritePath(displayParams.getDragSpriteImg(), displayParams.getDragSpriteMeta());
            String spritePath2 = getMSpriteManager().getSpritePath(displayParams.getFinishSpriteImg(), displayParams.getFinishSpriteMeta());
            if (spritePath != null && spritePath2 != null) {
                File file = new File(spritePath);
                File file2 = new File(spritePath2);
                FragmentActivity fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(getContext());
                if (file.exists() && file2.exists() && fragmentActivityFindFragmentActivityOrNull != null) {
                    BiliImageLoader.INSTANCE.acquire(fragmentActivityFindFragmentActivityOrNull).useOrigin().asDrawable().enableAnimatable(1, Boolean.FALSE).url(BiliImageLoaderHelper.fileToUri(file)).submit().subscribe(new com.bilibili.playerbizcommon.widget.control.f(this, fragmentActivityFindFragmentActivityOrNull, file2, file));
                    return;
                }
            }
        }
        String[] strArrQ = q(displayParams.getSeekIconUrl1(), displayParams.getSeekIconUrl2());
        if (strArrQ != null) {
            final File file3 = new File(strArrQ[0]);
            final File file4 = new File(strArrQ[1]);
            if (file3.exists() && file4.exists()) {
                Task.callInBackground(new Callable(file3, file4) { // from class: com.bilibili.playerbizcommon.widget.control.c

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final File f80572a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final File f80573b;

                    {
                        this.f80572a = file3;
                        this.f80573b = file4;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        File file5 = this.f80572a;
                        File file6 = this.f80573b;
                        PlayerSeekWidget.a aVar = PlayerSeekWidget.Companion;
                        return new android.util.Pair(LottieComposition.Factory.fromInputStreamSync(new FileInputStream(file5)), LottieComposition.Factory.fromInputStreamSync(new FileInputStream(file6)));
                    }
                }).continueWith(new Continuation(this) { // from class: com.bilibili.playerbizcommon.widget.control.d

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final PlayerSeekWidget f80574a;

                    {
                        this.f80574a = this;
                    }

                    @Override // bolts.Continuation
                    public final Object then(Task task) {
                        return PlayerSeekWidget.g(this.f80574a, task);
                    }
                }, Task.UI_THREAD_EXECUTOR);
                this.f80527i = false;
                return;
            }
        }
        String middleIcon = displayParams.getMiddleIcon();
        if (middleIcon == null || StringsKt.isBlank(middleIcon)) {
            if (this.f80527i) {
                return;
            }
            z();
            return;
        }
        c cVar = this.f80526g;
        if (cVar != null && cVar.isAnimating()) {
            this.f80526g.cancelAnimation();
            this.f80526g = null;
        }
        this.h = new b();
        this.f80527i = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean G() {
        /*
            r3 = this;
            com.bilibili.base.connectivity.ConnectivityMonitor r0 = com.bilibili.base.connectivity.ConnectivityMonitor.getInstance()
            int r0 = r0.getNetworkWithoutCache()
            r4 = r0
            r0 = r3
            tv.danmaku.biliplayerv2.PlayerContainer r0 = r0.f80521b
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L28
            r0 = r6
            tv.danmaku.biliplayerv2.service.IControlContainerService r0 = r0.getControlContainerService()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L28
            r0 = r6
            tv.danmaku.biliplayerv2.ScreenModeType r0 = r0.getScreenModeType()
            r6 = r0
            goto L2a
        L28:
            r0 = 0
            r6 = r0
        L2a:
            r0 = r6
            tv.danmaku.biliplayerv2.ScreenModeType r1 = tv.danmaku.biliplayerv2.ScreenModeType.VERTICAL_FULLSCREEN
            if (r0 == r1) goto L5f
            r0 = r3
            tv.danmaku.biliplayerv2.PlayerContainer r0 = r0.f80521b
            r8 = r0
            r0 = r7
            r6 = r0
            r0 = r8
            if (r0 == 0) goto L58
            r0 = r8
            tv.danmaku.biliplayerv2.service.IControlContainerService r0 = r0.getControlContainerService()
            r8 = r0
            r0 = r7
            r6 = r0
            r0 = r8
            if (r0 == 0) goto L58
            r0 = r8
            tv.danmaku.biliplayerv2.ScreenModeType r0 = r0.getScreenModeType()
            r6 = r0
        L58:
            r0 = r6
            tv.danmaku.biliplayerv2.ScreenModeType r1 = tv.danmaku.biliplayerv2.ScreenModeType.LANDSCAPE_FULLSCREEN
            if (r0 != r1) goto L95
        L5f:
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = 2
            if (r0 != r1) goto L6f
            tv.danmaku.biliplayerv2.service.network.PlayerFreeDataHelper r0 = tv.danmaku.biliplayerv2.service.network.PlayerFreeDataHelper.INSTANCE
            boolean r0 = r0.isFreeCardUser()
            if (r0 != 0) goto L74
        L6f:
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L95
        L74:
            r0 = r3
            tv.danmaku.biliplayerv2.PlayerContainer r0 = r0.f80521b
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L95
            r0 = r6
            tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService r0 = r0.getInteractLayerService()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L95
            r0 = r6
            boolean r0 = r0.hasThumbnails()
            r1 = 1
            if (r0 != r1) goto L95
            goto L97
        L95:
            r0 = 0
            r5 = r0
        L97:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.widget.control.PlayerSeekWidget.G():boolean");
    }

    public final void J(String str) {
        FragmentActivity fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(getContext());
        if (fragmentActivityFindFragmentActivityOrNull == null) {
            return;
        }
        BiliImageLoader.INSTANCE.acquire(fragmentActivityFindFragmentActivityOrNull).useOrigin().asDrawable().url(str).submit().subscribe(new com.bilibili.playerbizcommon.widget.control.g(this));
    }

    public final void K(int i7) {
        if (getProgressDrawable() instanceof LayerDrawable) {
            if (this.f80543y == null) {
                this.f80543y = ((LayerDrawable) getProgressDrawable()).findDrawableByLayerId(R.id.progress);
            }
            Drawable drawable = this.f80543y;
            if (drawable != null) {
                drawable.setLevel(getMax() > 0 ? (int) ((i7 / getMax()) * KFCFragmentLoaderActivity.REQ_CODE_LOGIN) : 0);
            }
        }
    }

    public void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f80521b = playerContainer;
        if (playerContainer != null) {
            setProgressDrawable(playerContainer.getPlayerParams().getConfig().getTheme() == 2 ? ContextCompat.getDrawable(getContext(), 2131233552) : ContextCompat.getDrawable(getContext(), 2131233526));
        }
        PlayerContainer playerContainer2 = this.f80521b;
        this.f80522c = playerContainer2 != null ? playerContainer2.getPlayerCoreService() : null;
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        if (this.f80530l) {
            K(this.f80544z);
        }
        try {
            super.draw(canvas);
        } catch (Exception e7) {
            BLog.e("PlayerSeekWidget", e7);
        }
    }

    @Override // android.widget.ProgressBar
    public boolean isAnimating() {
        c cVar = this.f80526g;
        return cVar != null && cVar.isAnimating();
    }

    public final void o() {
        PlayerContainer playerContainer;
        AbsFunctionWidgetService functionWidgetService;
        c cVar = this.f80526g;
        if (cVar != null) {
            cVar.f80549y = true;
            LottieComposition lottieComposition = cVar.f80547w;
            if (lottieComposition != null) {
                cVar.setComposition(lottieComposition);
                cVar.playAnimation();
            }
        }
        SeekService service = this.f80525f.getService();
        if (service != null) {
            service.setDraggingByUser(false);
        }
        this.f80530l = false;
        FunctionWidgetToken functionWidgetToken = this.f80528j;
        if (functionWidgetToken != null && (playerContainer = this.f80521b) != null && (functionWidgetService = playerContainer.getFunctionWidgetService()) != null) {
            functionWidgetService.hideWidget(functionWidgetToken);
        }
        this.f80529k = false;
        this.f80531m = false;
        this.f80535q = true;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        F();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        c cVar;
        if (isAnimating() && (cVar = this.f80526g) != null) {
            cVar.cancelAnimation();
        }
        super.onDetachedFromWindow();
    }

    public void onEnterWholeScene() {
        GestureService gestureService = (GestureService) this.f80524e.getService();
        if (gestureService != null) {
            gestureService.setHorizontalScrollListener(null);
        }
    }

    public void onExitWholeScene() {
        GestureService gestureService = (GestureService) this.f80524e.getService();
        if (gestureService != null) {
            gestureService.setHorizontalScrollListener(this.f80519C);
        }
    }

    public void onPlayerProgressChange(int i7, int i8) {
        IPlayerCoreService iPlayerCoreService = this.f80522c;
        float bufferedPercentage = iPlayerCoreService != null ? iPlayerCoreService.getBufferedPercentage() : 0.0f;
        setMax(i8);
        if (!this.f80530l) {
            setProgress(i7);
        }
        if (this.f80543y == null) {
            this.f80543y = ((LayerDrawable) getProgressDrawable()).findDrawableByLayerId(R.id.progress);
        }
        this.f80544z = i7;
        K(i7);
        setSecondaryProgress((int) (i8 * bufferedPercentage));
    }

    public void onSeekGestureEnableChange(boolean z6) {
        if (z6) {
            GestureService gestureService = (GestureService) this.f80524e.getService();
            if (gestureService != null) {
                gestureService.setHorizontalScrollListener(this.f80519C);
                return;
            }
            return;
        }
        GestureService gestureService2 = (GestureService) this.f80524e.getService();
        if (gestureService2 != null) {
            gestureService2.setHorizontalScrollListener(null);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i7, int i8, int i9, int i10) {
        try {
            super.onSizeChanged(i7, i8, i9, i10);
        } catch (Exception e7) {
        }
        this.f80531m = true;
    }

    public void onWidgetActive() {
        IRenderContainerService renderContainerService;
        PlayerContainer playerContainer;
        IRenderContainerService renderContainerService2;
        IPlayerServiceManager playerServiceManager;
        PlayerContainer playerContainer2 = this.f80521b;
        if (playerContainer2 != null) {
            if (this.f80525f.getService() == null) {
                PlayerServiceManager.ServiceDescriptor serviceDescriptorObtain = PlayerServiceManager.ServiceDescriptor.Companion.obtain(SeekService.class);
                playerContainer2.getPlayerServiceManager().startService(serviceDescriptorObtain);
                playerContainer2.getPlayerServiceManager().bindService(serviceDescriptorObtain, this.f80525f);
                SeekService service = this.f80525f.getService();
                if (service != null) {
                    service.registerPlayerProgressObserver(this);
                }
            }
            if (this.f80523d == null) {
                this.f80523d = playerContainer2.getControlContainerService();
            }
            PlayerContainer playerContainer3 = this.f80521b;
            if (playerContainer3 != null && (playerServiceManager = playerContainer3.getPlayerServiceManager()) != null) {
                playerServiceManager.bindService(PlayerServiceManager.ServiceDescriptor.Companion.obtain(GestureService.class), this.f80524e);
            }
            SeekService service2 = this.f80525f.getService();
            if (service2 != null) {
                service2.addSeekGestureEnableObserver(this);
            }
            SeekService service3 = this.f80525f.getService();
            if (service3 == null || !service3.isSeekGestureEnable() || (playerContainer = this.f80521b) == null || (renderContainerService2 = playerContainer.getRenderContainerService()) == null || renderContainerService2.isInWholeSceneMode()) {
                GestureService gestureService = (GestureService) this.f80524e.getService();
                if (gestureService != null) {
                    gestureService.setHorizontalScrollListener(null);
                }
            } else {
                GestureService gestureService2 = (GestureService) this.f80524e.getService();
                if (gestureService2 != null) {
                    gestureService2.setHorizontalScrollListener(this.f80519C);
                }
            }
            playerContainer2.getVideoPlayDirectorService().addVideoPlayEventListener(this.f80518B);
            v();
            PlayerContainer playerContainer4 = this.f80521b;
            if (playerContainer4 == null || (renderContainerService = playerContainer4.getRenderContainerService()) == null) {
                return;
            }
            renderContainerService.addWholeSceneModeChangeObserver(this);
        }
    }

    public void onWidgetInactive() {
        IPlayerServiceManager playerServiceManager;
        IPlayerServiceManager playerServiceManager2;
        IRenderContainerService renderContainerService;
        IVideosPlayDirectorService videoPlayDirectorService;
        CoroutineScope coroutineScope = this.f80517A;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
        }
        this.f80517A = null;
        this.f80538t = null;
        DrawableHolder drawableHolder = this.f80540v;
        if (drawableHolder != null) {
            drawableHolder.close();
        }
        this.f80540v = null;
        DrawableHolder drawableHolder2 = this.f80541w;
        if (drawableHolder2 != null) {
            drawableHolder2.close();
        }
        this.f80541w = null;
        PlayerContainer playerContainer = this.f80521b;
        if (playerContainer != null && (videoPlayDirectorService = playerContainer.getVideoPlayDirectorService()) != null) {
            videoPlayDirectorService.removeVideoPlayEventListener(this.f80518B);
        }
        PlayerContainer playerContainer2 = this.f80521b;
        if (playerContainer2 != null && (renderContainerService = playerContainer2.getRenderContainerService()) != null) {
            renderContainerService.removeWholeSceneModeChangObserver(this);
        }
        PlayerContainer playerContainer3 = this.f80521b;
        if (playerContainer3 != null && (playerServiceManager2 = playerContainer3.getPlayerServiceManager()) != null) {
            playerServiceManager2.unbindService(PlayerServiceManager.ServiceDescriptor.Companion.obtain(SeekService.class), this.f80525f);
        }
        PlayerContainer playerContainer4 = this.f80521b;
        if (playerContainer4 == null || (playerServiceManager = playerContainer4.getPlayerServiceManager()) == null) {
            return;
        }
        playerServiceManager.unbindService(PlayerServiceManager.ServiceDescriptor.Companion.obtain(GestureService.class), this.f80524e);
    }

    public final void u() {
        setThumb(null);
        setSplitTrack(false);
        F();
        setOnSeekBarChangeListener(this.f80520D);
    }

    public final void v() {
        LifecycleCoroutineScope lifecycleScope;
        IVideosPlayDirectorService videoPlayDirectorService;
        if (this.f80532n || this.f80533o) {
            return;
        }
        this.f80533o = true;
        PlayerContainer playerContainer = this.f80521b;
        Video.DisplayParams displayParams = null;
        Video.PlayableParams currentPlayableParams = (playerContainer == null || (videoPlayDirectorService = playerContainer.getVideoPlayDirectorService()) == null) ? null : videoPlayDirectorService.getCurrentPlayableParams();
        if (currentPlayableParams != null) {
            displayParams = currentPlayableParams.getDisplayParams();
        }
        WeakReference weakReference = new WeakReference(this.f80521b);
        if (displayParams == null || TextUtils.equals(displayParams.getFrom(), "downloaded")) {
            return;
        }
        if (!this.f80536r && !this.f80539u) {
            String spritePath = getMSpriteManager().getSpritePath(displayParams.getDragSpriteImg(), displayParams.getDragSpriteMeta());
            String spritePath2 = getMSpriteManager().getSpritePath(displayParams.getFinishSpriteImg(), displayParams.getFinishSpriteMeta());
            if (spritePath != null && spritePath2 != null) {
                File file = new File(spritePath);
                File file2 = new File(spritePath2);
                if (file.exists() && file2.exists()) {
                    this.f80532n = true;
                    this.f80533o = false;
                    F();
                    return;
                } else {
                    FragmentActivity fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(getContext());
                    if (fragmentActivityFindFragmentActivityOrNull == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragmentActivityFindFragmentActivityOrNull)) == null) {
                        return;
                    }
                    BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new PlayerSeekWidget$loadIcon$1(weakReference, displayParams, file, file2, this, spritePath, spritePath2, null), 3, (Object) null);
                    return;
                }
            }
        }
        String seekIconUrl1 = displayParams.getSeekIconUrl1();
        String seekIconUrl2 = displayParams.getSeekIconUrl2();
        String[] strArrQ = q(seekIconUrl1, seekIconUrl2);
        if (strArrQ == null) {
            String middleIcon = displayParams.getMiddleIcon();
            if (middleIcon == null || StringsKt.isBlank(middleIcon)) {
                this.f80533o = false;
                return;
            } else {
                F();
                return;
            }
        }
        File file3 = new File(strArrQ[0]);
        File file4 = new File(strArrQ[1]);
        if (file3.exists() && file4.exists() && this.f80532n) {
            this.f80533o = false;
            return;
        }
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        this.f80517A = CoroutineScope;
        if (CoroutineScope != null) {
            BuildersKt.launch$default(CoroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlayerSeekWidget$loadIcon$2(this, weakReference, seekIconUrl1, seekIconUrl2, file3, file4, null), 3, (Object) null);
        }
    }

    public final void z() {
        this.f80527i = true;
        LottieComposition.Factory.fromAssetFileName(BiliContext.application(), "player_seek_bar_tv_1.json", new P0(this));
    }
}
