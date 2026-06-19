package com.bilibili.pegasus.channelv2.detail;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.collection.LongSparseArray;
import androidx.compose.foundation.text.input.internal.selection.r;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import ao0.C4802A;
import ao0.C4804C;
import ao0.L;
import ao0.t;
import ao0.u;
import com.bilibili.ad.adview.liveroom.card.ui.enterprise.AdLiveEnterpriseBigCardSection;
import com.bilibili.adcommon.data.model.FeedExtra;
import com.bilibili.adcommon.data.model.SourceContent;
import com.bilibili.app.comm.list.common.channel.detail.IChannelDetailPage;
import com.bilibili.app.comm.list.common.utils.BiliCallLifeCycleObserverKt;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.biligame.bean.GameCenterBottomTabConfig;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.gripper.api.ad.biz.live.enterprise.IAdLiveEnterpriseBigCardCallBack;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.gripper.api.ad.core.report.ReportPresetKt;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.PassportObserver;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.lib.fasthybrid.game.engine.ability.impl.video.control.ControlLayer;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.magicasakura.widgets.TintToolbar;
import com.bilibili.magicasakura.widgets.TintView;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.pegasus.api.k;
import com.bilibili.pegasus.api.model.BaseTagsData;
import com.bilibili.pegasus.api.model.ChannelTabV2;
import com.bilibili.pegasus.api.model.ChannelV2;
import com.bilibili.pegasus.channelv2.detail.ChannelDetailActivityV2;
import com.bilibili.pegasus.utils.AbstractC5763g;
import com.bilibili.pegasus.utils.x;
import com.bilibili.pegasus.widgets.CalculateViewGroup;
import com.bilibili.pegasus.widgets.ChannelStateFulButton;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.video.story.action.functionwidget.QualityDolbyInfoFunctionWidget;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.squareup.otto.Bus;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lo0.C7875a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ro0.j;
import ro0.l;
import ro0.m;
import tv.danmaku.bili.widget.LoadingImageView;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;
import tv.danmaku.bili.widget.statefulbutton.StatefulButton;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/ChannelDetailActivityV2.class */
@StabilityInferred(parameters = 0)
public final class ChannelDetailActivityV2 extends BaseAppCompatActivity implements PassportObserver, pc1.b, IPvTracker {

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public static final int f74980C1 = 0;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    @NotNull
    public final c f74981A1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final Bus f74982B = new Bus(GameCenterBottomTabConfig.TAB_TYPE_ACT);

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    @NotNull
    public final Lazy f74983B1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public TintImageView f74984C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public AppBarLayout f74985D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public CoordinatorLayout f74986E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public TintToolbar f74987F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public CollapsingToolbarLayout f74988G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public TintTextView f74989H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public StatefulButton f74990I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @Nullable
    public LinearLayout f74991J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @Nullable
    public View f74992K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @Nullable
    public TintTextView f74993L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @Nullable
    public TintTextView f74994M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @Nullable
    public TintTextView f74995N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @Nullable
    public TintTextView f74996O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @Nullable
    public TintView f74997P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @Nullable
    public TintView f74998Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @Nullable
    public TintView f74999R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    @Nullable
    public BiliImageView f75000S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    @Nullable
    public ChannelStateFulButton f75001T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    @Nullable
    public PagerSlidingTabStrip f75002U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    @Nullable
    public View f75003V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    @Nullable
    public ViewPager f75004W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    @Nullable
    public LoadingImageView f75005X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    @Nullable
    public TintTextView f75006X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    @Nullable
    public TintImageView f75007Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    @Nullable
    public TintLinearLayout f75008Y0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    @Nullable
    public TintImageView f75009Z;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    @Nullable
    public TintTextView f75010Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @Nullable
    public TintImageView f75011a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    @Nullable
    public u f75012a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    @NotNull
    public final j f75013b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @Nullable
    public RecyclerView f75014c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    @NotNull
    public final m f75015c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public float f75016d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public float f75017e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    @NotNull
    public final Lazy f75018f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    @Nullable
    public RecyclerView f75019g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public C4804C f75020h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public C7875a f75021i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public ChannelV2 f75022j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public boolean f75023k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    @NotNull
    public final ColorDrawable f75024l1;

    @Nullable
    public C4802A m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public int f75025n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    @NotNull
    public String f75026o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public ConstraintLayout f75027p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public L f75028p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    @NotNull
    public final AtomicInteger f75029q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public LinearLayout f75030r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public boolean f75031r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public boolean f75032s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public int f75033t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    @NotNull
    public final Lazy f75034u1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    @Nullable
    public CalculateViewGroup f75035v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    @NotNull
    public final Lazy f75036v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    @NotNull
    public final Lazy f75037w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @NotNull
    public final d f75038x1;
    public eg.a y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    @NotNull
    public final b f75039z1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/ChannelDetailActivityV2$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f75040a;

        static {
            int[] iArr = new int[Topic.values().length];
            try {
                iArr[Topic.SIGN_IN.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Topic.SIGN_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f75040a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/ChannelDetailActivityV2$b.class */
    public static final class b extends AbstractC5763g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelDetailActivityV2 f75041a;

        public b(ChannelDetailActivityV2 channelDetailActivityV2) {
            this.f75041a = channelDetailActivityV2;
        }

        public static boolean d(List list, Map map) {
            boolean z6 = false;
            boolean z7 = false;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    z6 = z7;
                    if (!it.hasNext()) {
                        break;
                    }
                    BaseTagsData baseTagsData = (BaseTagsData) it.next();
                    gg.b bVar = (gg.b) map.get(Long.valueOf(baseTagsData.id));
                    if (bVar != null) {
                        baseTagsData.attention = bVar.b ? 1 : 0;
                        z7 = true;
                    }
                }
            }
            return z6;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void b(Map<Long, gg.b> map) {
            ChannelDetailActivityV2 channelDetailActivityV2 = this.f75041a;
            ChannelV2 channelV2 = channelDetailActivityV2.f75022j1;
            ChannelV2 channelV22 = channelV2;
            if (channelV2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("channel");
                channelV22 = null;
            }
            gg.b bVar = map.get(Long.valueOf(channelV22.id));
            if (bVar != null) {
                ChannelV2 channelV23 = channelDetailActivityV2.f75022j1;
                ChannelV2 channelV24 = channelV23;
                if (channelV23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("channel");
                    channelV24 = null;
                }
                if (channelV24.id == bVar.a) {
                    ChannelV2 channelV25 = channelDetailActivityV2.f75022j1;
                    ChannelV2 channelV26 = channelV25;
                    if (channelV25 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("channel");
                        channelV26 = null;
                    }
                    boolean z6 = true;
                    if (channelV26.attention != 1) {
                        z6 = false;
                    }
                    boolean z7 = bVar.b;
                    if (z6 != z7) {
                        ChannelV2 channelV27 = channelDetailActivityV2.f75022j1;
                        ChannelV2 channelV28 = channelV27;
                        if (channelV27 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("channel");
                            channelV28 = null;
                        }
                        channelV28.attention = z7 ? 1 : 0;
                        channelDetailActivityV2.a7(z7);
                    }
                }
            }
            ChannelV2 channelV29 = channelDetailActivityV2.f75022j1;
            ChannelV2 channelV210 = channelV29;
            if (channelV29 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("channel");
                channelV210 = null;
            }
            if (!d(channelV210.tagsParents, map)) {
                ChannelV2 channelV211 = channelDetailActivityV2.f75022j1;
                ChannelV2 channelV212 = channelV211;
                if (channelV211 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("channel");
                    channelV212 = null;
                }
                if (!d(channelV212.tagsChildren, map)) {
                    return;
                }
            }
            C7875a c7875a = channelDetailActivityV2.f75021i1;
            if (c7875a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRecommendAdapter");
                c7875a = null;
            }
            c7875a.notifyDataSetChanged();
        }

        @Override // com.bilibili.pegasus.utils.AbstractC5763g
        public final Context c() {
            return this.f75041a;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/ChannelDetailActivityV2$c.class */
    public static final class c implements ViewPager.OnPageChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelDetailActivityV2 f75042a;

        public c(ChannelDetailActivityV2 channelDetailActivityV2) {
            this.f75042a = channelDetailActivityV2;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i7) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i7, float f7, int i8) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i7) {
            int i8 = ChannelDetailActivityV2.f74980C1;
            ChannelDetailActivityV2 channelDetailActivityV2 = this.f75042a;
            channelDetailActivityV2.f75026o1 = channelDetailActivityV2.S6(i7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/ChannelDetailActivityV2$d.class */
    public static final class d implements Fh.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelDetailActivityV2 f75043a;

        public d(ChannelDetailActivityV2 channelDetailActivityV2) {
            this.f75043a = channelDetailActivityV2;
        }

        public final void a() {
            int i7 = ChannelDetailActivityV2.f74980C1;
            this.f75043a.T6();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/ChannelDetailActivityV2$e.class */
    public static final class e extends BiliApiDataCallback<ChannelV2> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ChannelDetailActivityV2 f75044b;

        public e(ChannelDetailActivityV2 channelDetailActivityV2) {
            this.f75044b = channelDetailActivityV2;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final boolean isCancel() {
            ChannelDetailActivityV2 channelDetailActivityV2 = this.f75044b;
            return channelDetailActivityV2.isFinishing() || channelDetailActivityV2.isDestroyCalled();
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(ChannelV2 channelV2) {
            ChannelV2 channelV22 = channelV2;
            if (channelV22 == null) {
                onError(null);
            } else {
                this.f75044b.Y6(channelV22);
            }
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            ChannelDetailActivityV2 channelDetailActivityV2 = this.f75044b;
            channelDetailActivityV2.Y6(null);
            C4802A c4802a = channelDetailActivityV2.m1;
            if (c4802a != null) {
                d dVar = channelDetailActivityV2.f75038x1;
                List list = c4802a.f53572c.tabs;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        IChannelDetailPage iChannelDetailPageB = c4802a.b(((ChannelTabV2) it.next()).getId());
                        IChannelDetailPage iChannelDetailPage = iChannelDetailPageB instanceof IChannelDetailPage ? iChannelDetailPageB : null;
                        if (iChannelDetailPage != null) {
                            iChannelDetailPage.setRefreshCallback(dVar);
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ro0.j] */
    public ChannelDetailActivityV2() {
        ?? obj = new Object();
        obj.f126806l = ListExtentionsKt.toPx(174.0f);
        this.f75013b1 = obj;
        this.f75015c1 = new m();
        ListExtentionsKt.toPx(116.0f);
        this.f75016d1 = 0.6f;
        this.f75017e1 = 0.6f;
        this.f75018f1 = LazyKt.lazy(new Qo.b(this, 1));
        this.f75024l1 = new ColorDrawable();
        this.f75026o1 = "";
        this.f75029q1 = new AtomicInteger(0);
        this.f75033t1 = 3;
        this.f75034u1 = LazyKt.lazy(new r(this, 1));
        final int i7 = 0;
        this.f75036v1 = LazyKt.lazy(new Function0(this, i7) { // from class: ao0.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f53605a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f53606b;

            {
                this.f53605a = i7;
                this.f53606b = this;
            }

            public final Object invoke() {
                FeedExtra extra;
                Object obj2 = this.f53606b;
                switch (this.f53605a) {
                    case 0:
                        int i8 = ChannelDetailActivityV2.f74980C1;
                        break;
                    case 1:
                        AdLiveEnterpriseBigCardSection adLiveEnterpriseBigCardSection = (AdLiveEnterpriseBigCardSection) obj2;
                        SourceContent sourceContentA = adLiveEnterpriseBigCardSection.a();
                        Map map = adLiveEnterpriseBigCardSection.e;
                        if (sourceContentA != null) {
                            SourceContent.AdContent adContent = sourceContentA.getAdContent();
                            GAdCoreKt.getGAdReport().uiEvent("live_native_card_close", ReportPresetKt.addUrl(ReportPresetKt.toReportPreset(sourceContentA), (adContent == null || (extra = adContent.getExtra()) == null) ? null : extra.jumpUrl()), map);
                        }
                        IAdLiveEnterpriseBigCardCallBack iAdLiveEnterpriseBigCardCallBack = adLiveEnterpriseBigCardSection.b;
                        if (iAdLiveEnterpriseBigCardCallBack == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("liveAbility");
                            iAdLiveEnterpriseBigCardCallBack = null;
                        }
                        iAdLiveEnterpriseBigCardCallBack.onCloseIconClick();
                        break;
                    case 2:
                        ControlLayer controlLayer = (ControlLayer) obj2;
                        if (controlLayer.x.getVisibility() == 0) {
                            controlLayer.x.setVisibility(8);
                        } else if (controlLayer.b.getControls()) {
                            controlLayer.d();
                            controlLayer.x.setVisibility(0);
                        }
                        break;
                    default:
                        QualityDolbyInfoFunctionWidget qualityDolbyInfoFunctionWidget = (QualityDolbyInfoFunctionWidget) obj2;
                        AbsFunctionWidgetService functionWidgetService = qualityDolbyInfoFunctionWidget.a.getFunctionWidgetService();
                        if (functionWidgetService != null) {
                            functionWidgetService.hideWidget(qualityDolbyInfoFunctionWidget.getToken());
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        this.f75037w1 = LazyKt.lazy(new Bz.e(this, 2));
        this.f75038x1 = new d(this);
        this.f75039z1 = new b(this);
        this.f74981A1 = new c(this);
        this.f74983B1 = LazyKt.lazy(new Qq.a(this, 1));
    }

    public static void P6(ChannelDetailActivityV2 channelDetailActivityV2) {
        eg.a aVar = channelDetailActivityV2.y1;
        ChannelV2 channelV2 = null;
        eg.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channelManager");
            aVar2 = null;
        }
        ChannelV2 channelV22 = channelDetailActivityV2.f75022j1;
        if (channelV22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
        } else {
            channelV2 = channelV22;
        }
        long j7 = channelV2.id;
        aVar2.getClass();
        LongSparseArray longSparseArray = gg.a.a;
        gg.a.b(j7, false, aVar2.a, aVar2.b, (String) null);
        l.b("traffic.new-channel-detail.guide-subscription-btn.0.click", MapsKt.mapOf(TuplesKt.to("type", "1")));
        super.onBackPressed();
    }

    public static void Q6(ChannelDetailActivityV2 channelDetailActivityV2) {
        l.b("traffic.new-channel-detail.guide-subscription-btn.0.click", MapsKt.mapOf(TuplesKt.to("type", "0")));
        super.onBackPressed();
    }

    public static void U6(TextView textView, String str, boolean z6) {
        if (textView != null) {
            textView.setText(str);
        }
        if (textView != null) {
            textView.setVisibility(z6 ? 0 : 8);
        }
    }

    public final t R6() {
        return (t) this.f75034u1.getValue();
    }

    @NotNull
    public final Bus S3() {
        return this.f74982B;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String S6(int r4) {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.pegasus.api.model.ChannelV2 r0 = r0.f75022j1
            r7 = r0
            r0 = 0
            r6 = r0
            r0 = r7
            r5 = r0
            r0 = r7
            if (r0 != 0) goto L17
            java.lang.String r0 = "channel"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            r5 = r0
        L17:
            r0 = r5
            java.util.List r0 = r0.tabs
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L7a
            r0 = r4
            if (r0 < 0) goto L39
            r0 = r4
            r1 = r5
            int r1 = r1.size()
            if (r0 >= r1) goto L39
            r0 = r5
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            r5 = r0
            goto L65
        L39:
            r0 = r3
            com.bilibili.pegasus.api.model.ChannelV2 r0 = r0.f75022j1
            r7 = r0
            r0 = r7
            r5 = r0
            r0 = r7
            if (r0 != 0) goto L4e
            java.lang.String r0 = "channel"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            r5 = r0
        L4e:
            r0 = r5
            java.util.List r0 = r0.tabs
            r7 = r0
            r0 = r6
            r5 = r0
            r0 = r7
            if (r0 == 0) goto L65
            r0 = r7
            r1 = 0
            java.lang.Object r0 = kotlin.collections.CollectionsKt.getOrNull(r0, r1)
            com.bilibili.pegasus.api.model.ChannelTabV2 r0 = (com.bilibili.pegasus.api.model.ChannelTabV2) r0
            r5 = r0
        L65:
            r0 = r5
            com.bilibili.pegasus.api.model.ChannelTabV2 r0 = (com.bilibili.pegasus.api.model.ChannelTabV2) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L7a
            r0 = r5
            java.lang.String r0 = r0.tabId
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L7a
            goto L7e
        L7a:
            java.lang.String r0 = "all"
            r5 = r0
        L7e:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.detail.ChannelDetailActivityV2.S6(int):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.bilibili.okretro.converter.IParser, java.lang.Object] */
    public final void T6() {
        Lazy lazy = k.a;
        ChannelV2 channelV2 = this.f75022j1;
        ChannelV2 channelV22 = channelV2;
        if (channelV2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            channelV22 = null;
        }
        BiliCallLifeCycleObserverKt.enqueue(k.b().getFeedTabV2(channelV22.id, k.a()).setParser(new Object()), this, new e(this));
    }

    public final void V6() {
        StatefulButton statefulButton;
        StatefulButton statefulButton2 = this.f74990I;
        boolean z6 = (statefulButton2 != null ? statefulButton2.getAlpha() : 0.0f) > 0.0f;
        StatefulButton statefulButton3 = this.f74990I;
        if ((statefulButton3 == null || statefulButton3.isClickable() != z6) && (statefulButton = this.f74990I) != null) {
            statefulButton.setClickable(z6);
        }
    }

    public final void X6(int i7) {
        this.f75024l1.mutate().setAlpha(i7);
        TintToolbar tintToolbar = this.f74987F;
        if (tintToolbar != null) {
            tintToolbar.setBackgroundDrawable(this.f75024l1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:327:0x077a  */
    /* JADX WARN: Type inference failed for: r1v73, types: [ao0.c, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y6(@org.jetbrains.annotations.Nullable com.bilibili.pegasus.api.model.ChannelV2 r15) {
        /*
            Method dump skipped, instruction units count: 2554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.detail.ChannelDetailActivityV2.Y6(com.bilibili.pegasus.api.model.ChannelV2):void");
    }

    public final void a7(boolean z6) {
        ChannelStateFulButton channelStateFulButton = this.f75001T;
        if (channelStateFulButton != null) {
            channelStateFulButton.setIconSize(z6 ? ListExtentionsKt.toPx(22.0f) : ListExtentionsKt.toPx(14.0f));
        }
        for (StatefulButton statefulButton : (StatefulButton[]) this.f75018f1.getValue()) {
            if (statefulButton != null) {
                statefulButton.updateUI(z6);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return Op0.b.b("traffic.new-channel-detail.0.0");
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        Bundle bundle = new Bundle();
        ChannelV2 channelV2 = this.f75022j1;
        ChannelV2 channelV22 = channelV2;
        if (channelV2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            channelV22 = null;
        }
        bundle.putString("channel-id", String.valueOf(channelV22.id));
        bundle.putString("from", R6().f53626i);
        return bundle;
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Map mapEmptyMap;
        if (this.f75032s1 && this.f75029q1.get() >= this.f75033t1) {
            ChannelV2 channelV2 = this.f75022j1;
            ChannelV2 channelV22 = channelV2;
            if (channelV2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("channel");
                channelV22 = null;
            }
            if (channelV22.attention != 1 && !this.f75031r1) {
                x.a aVar = x.f78893a;
                if (BiliAccounts.get(this).isLogin()) {
                    BiliAccounts.get(this).getAccessKey();
                    AlertDialog alertDialogCreate = new AlertDialog.Builder(this).setMessage(2131845181).setNegativeButton(2131841360, new DialogInterface.OnClickListener(this) { // from class: ao0.j

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final ChannelDetailActivityV2 f53610a;

                        {
                            this.f53610a = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i7) {
                            ChannelDetailActivityV2.Q6(this.f53610a);
                        }
                    }).setPositiveButton(2131845358, new DialogInterface.OnClickListener(this) { // from class: ao0.k

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final ChannelDetailActivityV2 f53611a;

                        {
                            this.f53611a = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i7) {
                            ChannelDetailActivityV2.P6(this.f53611a);
                        }
                    }).create();
                    if (alertDialogCreate != null) {
                        alertDialogCreate.show();
                    }
                    Map mapMapOf = MapsKt.mapOf(TuplesKt.to("click", String.valueOf(this.f75029q1.get())));
                    if (mapMapOf != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapMapOf.size()));
                        Iterator it = mapMapOf.entrySet().iterator();
                        while (true) {
                            mapEmptyMap = linkedHashMap;
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            Object key = entry.getKey();
                            String str = (String) entry.getValue();
                            String str2 = str;
                            if (str == null) {
                                str2 = "";
                            }
                            linkedHashMap.put(key, Uri.encode(str2));
                        }
                    } else {
                        mapEmptyMap = MapsKt.emptyMap();
                    }
                    Neurons.reportExposure$default(false, "traffic.new-channel-detail.guide-subscription.0.show", mapEmptyMap, (List) null, 8, (Object) null);
                    this.f75031r1 = true;
                    return;
                }
            }
        }
        super.onBackPressed();
    }

    public final void onChange(@Nullable Topic topic) {
        int i7 = topic == null ? -1 : a.f75040a[topic.ordinal()];
        if (i7 == 1) {
            T6();
            return;
        }
        if (i7 != 2) {
            return;
        }
        ChannelStateFulButton channelStateFulButton = this.f75001T;
        if (channelStateFulButton != null) {
            channelStateFulButton.updateUI(false);
        }
        StatefulButton statefulButton = this.f74990I;
        if (statefulButton != null) {
            statefulButton.updateUI(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Type inference failed for: r0v51, types: [ao0.u, com.bilibili.magicasakura.utils.ThemeUtils$b, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 1845
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.detail.ChannelDetailActivityV2.onCreate(android.os.Bundle):void");
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        this.f74982B.unregister(this);
        BiliAccounts.get(this).unsubscribe(this, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT});
        ThemeUtils.removeSwitchColor(this);
        HandlerThreads.remove(0, this.f75015c1.f126812e);
        j jVar = this.f75013b1;
        jVar.getClass();
        TintImageView tintImageView = jVar.f126796a;
        LinearLayout linearLayout = jVar.f126797b;
        RecyclerView recyclerView = jVar.f126798c;
        RecyclerView recyclerView2 = jVar.f126799d;
        ConstraintLayout constraintLayout = jVar.f126800e;
        View view = jVar.f126801f;
        TintTextView tintTextView = jVar.f126802g;
        for (int i7 = 0; i7 < 7; i7++) {
            View view2 = new View[]{tintImageView, linearLayout, recyclerView, recyclerView2, constraintLayout, view, tintTextView}[i7];
            if (view2 != null) {
                view2.clearAnimation();
            }
        }
        super.onDestroy();
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        StatusBarCompat.immersiveStatusBar(this);
        getWindow().setStatusBarColor(0);
        StatusBarCompat.tintStatusBar(this, 0);
        removeShade();
        CoordinatorLayout coordinatorLayout = this.f74986E;
        if (coordinatorLayout != null) {
            coordinatorLayout.setStatusBarBackgroundColor(0);
        }
    }
}
