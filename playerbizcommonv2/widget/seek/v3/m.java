package com.bilibili.playerbizcommonv2.widget.seek.v3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import androidx.constraintlayout.widget.Group;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.base.BiliContext;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playerbizcommonv2.utils.o;
import com.bilibili.playerbizcommonv2.utils.r;
import java.util.Arrays;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.D;
import tv.danmaku.biliplayerv2.DisplayOrientation;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.DraggingProgressObserver;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayDirector;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.SeekService;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.interact.biz.InteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.helper.ThumbnailLoader2;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.utils.DpUtils;
import tv.danmaku.biliplayerv2.utils.TimeFormater;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/m.class */
@StabilityInferred(parameters = 0)
public final class m extends AbsFunctionWidget {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public ScreenModeType f83018A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public DisplayOrientation f83019B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f83020C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f83021D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f83022E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f83023F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final b f83024G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final c f83025H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f83026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f83027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Group f83028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FrameLayout f83029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f83030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f83031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f83032g;

    @InjectPlayerService
    private IReporterService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @InjectPlayerService
    private InteractLayerService f83033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @InjectPlayerService
    private IControlContainerService f83034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @InjectPlayerService
    private AbsFunctionWidgetService f83035k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @InjectPlayerService
    private IPlayerCoreService f83036l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @InjectPlayerService
    private Er0.a f83037m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @InjectPlayerService
    private Context f83038n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @InjectPlayerService
    private SeekService f83039o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @InjectPlayerService
    private IPlayDirector f83040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public ThumbnailLoader2 f83041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public d f83042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f83043s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f83044t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f83045u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Rect f83046v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f83047w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f83048x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public Bitmap f83049y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f83050z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/m$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends AbsFunctionWidget.Configuration {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f83053c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f83051a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f83052b = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public Rect f83054d = new Rect(0, 0, 0, 0);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/m$b.class */
    public static final class b implements ThumbnailLoader2.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f83055a;

        public b(m mVar) {
            this.f83055a = mVar;
        }

        public final void a(ThumbnailLoader2.c cVar) {
            Bitmap bitmap = cVar.c;
            m mVar = this.f83055a;
            boolean z6 = cVar.d;
            if (bitmap != null || z6) {
                m.k(mVar, bitmap, z6, cVar.e);
                return;
            }
            mVar.f83049y = null;
            if (mVar.isShowing() && mVar.f83043s == 1) {
                ImageView imageView = mVar.f83026a;
                ImageView imageView2 = imageView;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivThumb");
                    imageView2 = null;
                }
                imageView2.setImageBitmap(null);
                Group group = mVar.f83028c;
                if (group == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("thumbGroup");
                    group = null;
                }
                Lazy lazy = com.bilibili.playerbizcommonv2.utils.p.f81943a;
                group.setVisibility(4);
                mVar.o(mVar.f83047w, mVar.f83048x);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/m$c.class */
    public static final class c implements DraggingProgressObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f83056a;

        public c(m mVar) {
            this.f83056a = mVar;
        }

        public final void onDraggingByUserChanged(boolean z6) {
            if (z6) {
                m mVar = this.f83056a;
                IPlayerCoreService iPlayerCoreService = mVar.f83036l;
                IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
                if (iPlayerCoreService == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
                    iPlayerCoreService2 = null;
                }
                mVar.f83047w = iPlayerCoreService2.getCurrentPosition();
                IPlayerCoreService iPlayerCoreService3 = mVar.f83036l;
                if (iPlayerCoreService3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
                    iPlayerCoreService3 = null;
                }
                mVar.f83048x = iPlayerCoreService3.getDuration();
            }
        }

        public final void onDraggingProgressChanged(int i7, int i8) {
            Video.DisplayParams displayParams;
            m mVar = this.f83056a;
            IControlContainerService iControlContainerService = mVar.f83034j;
            IControlContainerService iControlContainerService2 = iControlContainerService;
            if (iControlContainerService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
                iControlContainerService2 = null;
            }
            iControlContainerService2.setImmersive(mVar.f83032g, true);
            if (i7 - mVar.f83047w != 0 || i7 == i8 || i7 == 0) {
                mVar.f83047w = i7;
                mVar.f83048x = i8;
                if (mVar.f83043s != 1 || mVar.f83044t) {
                    mVar.o(i7, i8);
                    return;
                }
                if (mVar.f83049y != null || mVar.f83050z) {
                    Group group = mVar.f83028c;
                    Group group2 = group;
                    if (group == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("thumbGroup");
                        group2 = null;
                    }
                    if (group2.getVisibility() != 0) {
                        Group group3 = mVar.f83028c;
                        Group group4 = group3;
                        if (group3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("thumbGroup");
                            group4 = null;
                        }
                        Lazy lazy = com.bilibili.playerbizcommonv2.utils.p.f81943a;
                        group4.setVisibility(0);
                    }
                    TextView textView = mVar.f83030e;
                    TextView textView2 = textView;
                    if (textView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvTips");
                        textView2 = null;
                    }
                    com.bilibili.playerbizcommonv2.utils.p.h(textView2);
                } else {
                    mVar.o(i7, i8);
                }
                d dVar = mVar.f83042r;
                if (dVar != null && dVar.a()) {
                    Hr0.c cVarB = dVar.b(i7);
                    if (cVarB == null) {
                        mVar.o(i7, i8);
                        return;
                    }
                    ThumbnailLoader2 thumbnailLoader2 = mVar.f83041q;
                    if (thumbnailLoader2 != null) {
                        ThumbnailLoader2.fetch$default(thumbnailLoader2, cVarB.f8753a, (int) (cVarB.f8754b / ((long) 1000)), 0, 4, (Object) null);
                    }
                    m.l(mVar, i7, i8);
                    return;
                }
                IPlayDirector iPlayDirector = mVar.f83040p;
                if (iPlayDirector == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playDirector");
                    iPlayDirector = null;
                }
                Video.PlayableParams currentPlayableParams = iPlayDirector.getCurrentPlayableParams();
                long cid = (currentPlayableParams == null || (displayParams = currentPlayableParams.getDisplayParams()) == null) ? 0L : displayParams.getCid();
                ThumbnailLoader2 thumbnailLoader22 = mVar.f83041q;
                if (thumbnailLoader22 != null) {
                    ThumbnailLoader2.fetch$default(thumbnailLoader22, cid, i7 / 1000, 0, 4, (Object) null);
                }
                m.l(mVar, i7, i8);
            }
        }
    }

    public m(@NotNull Context context) {
        super(context);
        this.f83032g = 1;
        this.f83043s = 2;
        this.f83046v = new Rect(0, 0, 0, 0);
        this.f83018A = ScreenModeType.THUMB;
        this.f83019B = DisplayOrientation.LANDSCAPE;
        this.f83023F = DeviceDecision.INSTANCE.getBoolean("dd_seek_thumbnail_use_backup_bitmap", false);
        this.f83024G = new b(this);
        this.f83025H = new c(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void k(final com.bilibili.playerbizcommonv2.widget.seek.v3.m r7, android.graphics.Bitmap r8, boolean r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 1169
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.seek.v3.m.k(com.bilibili.playerbizcommonv2.widget.seek.v3.m, android.graphics.Bitmap, boolean, java.lang.String):void");
    }

    public static final void l(m mVar, int i7, int i8) {
        mVar.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        String strM = m(i7);
        if (strM.length() > 0) {
            SpannableString spannableString = new SpannableString(strM);
            Context context = mVar.f83038n;
            Context context2 = context;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context2 = null;
            }
            spannableString.setSpan(new ForegroundColorSpan(context2.getResources().getColor(R$color.Wh0_u)), 0, strM.length(), 18);
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        String strA = C4496a.a(" / ", m(i8));
        if (strA.length() > 0) {
            SpannableString spannableString2 = new SpannableString(strA);
            Context context3 = mVar.f83038n;
            Context context4 = context3;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context4 = null;
            }
            spannableString2.setSpan(new ForegroundColorSpan(context4.getResources().getColor(2131100089)), 0, strA.length(), 18);
            spannableStringBuilder.append((CharSequence) spannableString2);
        }
        TextView textView = mVar.f83027b;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvMessage");
            textView = null;
        }
        textView.setText(spannableStringBuilder);
    }

    public static String m(int i7) {
        return i7 >= 0 ? TimeFormater.INSTANCE.formatTime(i7, false, false) : "00:00";
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        Video.DisplayParams displayParams;
        ImageView imageView = null;
        View viewInflate = LayoutInflater.from(context).inflate(2131495192, (ViewGroup) null);
        this.f83030e = (TextView) viewInflate.findViewById(2131312912);
        this.f83031f = (TextView) viewInflate.findViewById(2131320268);
        this.f83026a = (ImageView) viewInflate.findViewById(2131313251);
        this.f83028c = (Group) viewInflate.findViewById(2131313253);
        this.f83029d = (FrameLayout) viewInflate.findViewById(2131313252);
        this.f83027b = (TextView) viewInflate.findViewById(2131304642);
        IPlayDirector iPlayDirector = this.f83040p;
        IPlayDirector iPlayDirector2 = iPlayDirector;
        if (iPlayDirector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playDirector");
            iPlayDirector2 = null;
        }
        Video.PlayableParams currentPlayableParams = iPlayDirector2.getCurrentPlayableParams();
        Float fValueOf = (currentPlayableParams == null || (displayParams = currentPlayableParams.getDisplayParams()) == null) ? null : Float.valueOf(displayParams.getDisplayRotate());
        if (fValueOf != null && fValueOf.floatValue() > 1.0f) {
            ImageView imageView2 = this.f83026a;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivThumb");
            } else {
                imageView = imageView2;
            }
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            int iDp2px = (int) DpUtils.dp2px(BiliContext.application(), 56.0f);
            layoutParams.width = iDp2px;
            layoutParams.height = (int) (fValueOf.floatValue() * iDp2px);
        }
        return viewInflate;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        return new FunctionWidgetConfig.Builder().changeOrientationDisableWhenShow(true).dismissWhenActivityStop(true).dismissWhenScreenModeChange(true).dismissWhenVideoCompleted(true).persistent(true).build();
    }

    public final com.bilibili.playerbizcommonv2.utils.r n() {
        Er0.a aVar = this.f83037m;
        Er0.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
            aVar2 = null;
        }
        return (com.bilibili.playerbizcommonv2.utils.r) aVar2.get(r.a.f81944a);
    }

    public final void o(int i7, int i8) {
        Group group = this.f83028c;
        Group group2 = group;
        if (group == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thumbGroup");
            group2 = null;
        }
        Lazy lazy = com.bilibili.playerbizcommonv2.utils.p.f81943a;
        group2.setVisibility(4);
        TextView textView = this.f83031f;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvForbiddenTips");
            textView2 = null;
        }
        textView2.setVisibility(4);
        TextView textView3 = this.f83030e;
        TextView textView4 = textView3;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvTips");
            textView4 = null;
        }
        textView4.setVisibility(0);
        if (!this.f83044t) {
            String strM = m(i7);
            String strM2 = m(i8);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%s/%s", Arrays.copyOf(new Object[]{strM, strM2}, 2));
            TextView textView5 = this.f83030e;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvTips");
                textView5 = null;
            }
            textView5.setText(str);
            return;
        }
        TextView textView6 = this.f83030e;
        TextView textView7 = textView6;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvTips");
            textView7 = null;
        }
        textView7.setText(getMContext().getString(2131846983));
        if (this.f83045u) {
            return;
        }
        IReporterService iReporterService = this.h;
        if (iReporterService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reporterService");
            iReporterService = null;
        }
        iReporterService.report(new NeuronsEvents.NormalEvent("player.player.cancel-seek.show.player", new String[0]));
        this.f83045u = true;
    }

    public final void onConfigurationChanged(@NotNull AbsFunctionWidget.Configuration configuration) {
        if (configuration instanceof a) {
            a aVar = (a) configuration;
            this.f83043s = aVar.f83052b;
            this.f83046v.set(aVar.f83054d);
            if (!this.f83044t && aVar.f83053c) {
                this.f83045u = false;
            }
            this.f83044t = aVar.f83053c;
            if (this.f83043s != 1) {
                o(this.f83047w, this.f83048x);
                return;
            }
            TextView textView = this.f83030e;
            TextView textView2 = textView;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvTips");
                textView2 = null;
            }
            com.bilibili.playerbizcommonv2.utils.p.h(textView2);
        }
    }

    public final void onRelease() {
        this.f83041q = null;
    }

    public final void onWidgetDismiss() {
        super.onWidgetDismiss();
        ThumbnailLoader2 thumbnailLoader2 = this.f83041q;
        if (thumbnailLoader2 != null) {
            thumbnailLoader2.setFetchCallback((ThumbnailLoader2.d) null);
        }
        ImageView imageView = this.f83026a;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivThumb");
            imageView2 = null;
        }
        imageView2.setImageBitmap(null);
        SeekService seekService = this.f83039o;
        SeekService seekService2 = seekService;
        if (seekService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("seekService");
            seekService2 = null;
        }
        seekService2.unregisterDraggingProgress(this.f83025H);
        this.f83042r = null;
        this.f83044t = false;
        IControlContainerService iControlContainerService = this.f83034j;
        IControlContainerService iControlContainerService2 = iControlContainerService;
        if (iControlContainerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
            iControlContainerService2 = null;
        }
        iControlContainerService2.setBackground((Drawable) null);
        IControlContainerService iControlContainerService3 = this.f83034j;
        IControlContainerService iControlContainerService4 = iControlContainerService3;
        if (iControlContainerService3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
            iControlContainerService4 = null;
        }
        iControlContainerService4.setImmersive(this.f83032g, false);
        this.f83049y = null;
        this.f83021D = false;
        this.f83022E = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onWidgetShow(@org.jetbrains.annotations.Nullable tv.danmaku.biliplayerv2.widget.AbsFunctionWidget.Configuration r10) {
        /*
            Method dump skipped, instruction units count: 1134
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.seek.v3.m.onWidgetShow(tv.danmaku.biliplayerv2.widget.AbsFunctionWidget$Configuration):void");
    }

    public final void p() {
        com.bilibili.playerbizcommonv2.utils.r rVarN;
        StateFlow<WindowSizeClass> windowSizeFlow;
        WindowSizeClass windowSizeClass;
        if ((this.f83018A != ScreenModeType.THUMB || (rVarN = n()) == null || (windowSizeFlow = rVarN.getWindowSizeFlow()) == null || (windowSizeClass = (WindowSizeClass) windowSizeFlow.getValue()) == null || !KScreenAdjustUtilsKt.isNormal(windowSizeClass)) && this.f83019B != DisplayOrientation.VERTICAL) {
            TextView textView = this.f83031f;
            TextView textView2 = textView;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvForbiddenTips");
                textView2 = null;
            }
            textView2.setTextSize(12.0f);
            TextView textView3 = this.f83031f;
            TextView textView4 = textView3;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvForbiddenTips");
                textView4 = null;
            }
            textView4.setMaxLines(1);
            if (this.f83020C != 0) {
                TextView textView5 = this.f83031f;
                TextView textView6 = textView5;
                if (textView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvForbiddenTips");
                    textView6 = null;
                }
                textView6.setMaxWidth(this.f83020C);
            }
            TextView textView7 = this.f83031f;
            TextView textView8 = textView7;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvForbiddenTips");
                textView8 = null;
            }
            Context context = this.f83038n;
            Context context2 = context;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context2 = null;
            }
            textView8.setCompoundDrawablePadding(ScreenUtil.dip2px(context2, 4.0f));
            TextView textView9 = this.f83031f;
            TextView textView10 = textView9;
            if (textView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvForbiddenTips");
                textView10 = null;
            }
            Context context3 = this.f83038n;
            Context context4 = context3;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context4 = null;
            }
            textView10.setCompoundDrawablesWithIntrinsicBounds(context4.getDrawable(2131244518), (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        TextView textView11 = this.f83031f;
        TextView textView12 = textView11;
        if (textView11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvForbiddenTips");
            textView12 = null;
        }
        textView12.setTextSize(10.0f);
        TextView textView13 = this.f83031f;
        TextView textView14 = textView13;
        if (textView13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvForbiddenTips");
            textView14 = null;
        }
        textView14.setMaxLines(2);
        TextView textView15 = this.f83031f;
        TextView textView16 = textView15;
        if (textView15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvForbiddenTips");
            textView16 = null;
        }
        Context context5 = this.f83038n;
        Context context6 = context5;
        if (context5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context6 = null;
        }
        textView16.setMaxWidth(ScreenUtil.dip2px(context6, 53.0f));
        TextView textView17 = this.f83031f;
        TextView textView18 = textView17;
        if (textView17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvForbiddenTips");
            textView18 = null;
        }
        Context context7 = this.f83038n;
        Context context8 = context7;
        if (context7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context8 = null;
        }
        textView18.setCompoundDrawablePadding(ScreenUtil.dip2px(context8, 3.0f));
        TextView textView19 = this.f83031f;
        TextView textView20 = textView19;
        if (textView19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvForbiddenTips");
            textView20 = null;
        }
        Context context9 = this.f83038n;
        Context context10 = context9;
        if (context9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context10 = null;
        }
        textView20.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, context10.getDrawable(2131244518), (Drawable) null, (Drawable) null);
    }

    public final void q(int i7) {
        int iDip2px;
        int iCoerceAtLeast;
        com.bilibili.playerbizcommonv2.utils.r rVarN;
        DisplayOrientation displayOrientation = this.f83019B;
        DisplayOrientation displayOrientation2 = DisplayOrientation.LANDSCAPE;
        if (displayOrientation == displayOrientation2) {
            Context context = this.f83038n;
            Context context2 = context;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context2 = null;
            }
            iDip2px = ScreenUtil.dip2px(context2, 170.0f);
        } else {
            Context context3 = this.f83038n;
            Context context4 = context3;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context4 = null;
            }
            iDip2px = ScreenUtil.dip2px(context4, 95.0f);
        }
        this.f83020C = iDip2px;
        FrameLayout frameLayout = this.f83029d;
        FrameLayout frameLayout2 = frameLayout;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thumbContainer");
            frameLayout2 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
        Context context5 = this.f83038n;
        Context context6 = context5;
        if (context5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context6 = null;
        }
        marginLayoutParams.bottomMargin = ScreenUtil.dip2px(context6, 20.0f);
        FrameLayout frameLayout3 = this.f83029d;
        FrameLayout frameLayout4 = frameLayout3;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thumbContainer");
            frameLayout4 = null;
        }
        frameLayout4.setLayoutParams(marginLayoutParams);
        TextView textView = this.f83027b;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvMessage");
            textView2 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView2.getLayoutParams();
        if (this.f83019B == displayOrientation2 || ((rVarN = n()) != null && com.bilibili.playerbizcommonv2.utils.q.a(rVarN))) {
            AbsFunctionWidgetService absFunctionWidgetService = this.f83035k;
            AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
            if (absFunctionWidgetService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
                absFunctionWidgetService2 = null;
            }
            int availableHeight = absFunctionWidgetService2.getAvailableHeight();
            FrameLayout frameLayout5 = this.f83029d;
            FrameLayout frameLayout6 = frameLayout5;
            if (frameLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("thumbContainer");
                frameLayout6 = null;
            }
            int i8 = ((ViewGroup.MarginLayoutParams) frameLayout6.getLayoutParams()).bottomMargin;
            TextView textView3 = this.f83027b;
            TextView textView4 = textView3;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvMessage");
                textView4 = null;
            }
            iCoerceAtLeast = RangesKt.coerceAtLeast((availableHeight - ((i7 + i8) + textView4.getHeight())) / 2, 0);
        } else if (this.f83018A == ScreenModeType.THUMB) {
            Context context7 = this.f83038n;
            Context context8 = context7;
            if (context7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context8 = null;
            }
            int iDip2px2 = ScreenUtil.dip2px(context8, 60.0f);
            Er0.a aVar = this.f83037m;
            Er0.a aVar2 = aVar;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
                aVar2 = null;
            }
            com.bilibili.playerbizcommonv2.utils.o oVar = (com.bilibili.playerbizcommonv2.utils.o) aVar2.get(o.a.f81942a);
            int iC = 0;
            if (oVar != null) {
                iC = oVar.c();
            }
            iCoerceAtLeast = iDip2px2 + iC;
        } else {
            Context context9 = this.f83038n;
            Context context10 = context9;
            if (context9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context10 = null;
            }
            iCoerceAtLeast = ScreenUtil.dip2px(context10, 125.0f);
        }
        D.a(marginLayoutParams2.bottomMargin, iCoerceAtLeast, "updateThumbWidthMarginHD, messageLayoutParams.bottomMargin:", " newBottomMargin: ", getTag());
        if (marginLayoutParams2.bottomMargin != iCoerceAtLeast) {
            marginLayoutParams2.bottomMargin = iCoerceAtLeast;
            TextView textView5 = this.f83027b;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvMessage");
                textView5 = null;
            }
            textView5.setLayoutParams(marginLayoutParams2);
        }
        p();
    }
}
