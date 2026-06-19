package com.bilibili.lib.projection.internal.search;

import By0.C1474m;
import By0.C1498u0;
import Ge0.d;
import I1.P;
import L3.b0;
import L3.c0;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.exoplayer.C4690e;
import androidx.media3.exoplayer.analytics.U;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alipay.sdk.app.PayTask;
import com.bilibili.api.BiliConfig;
import com.bilibili.app.authorspace.ui.C0;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.droid.ToastHelper;
import com.bilibili.droid.WindowManagerHelper;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.projection.ProjectionClient;
import com.bilibili.lib.projection.commonburid.CastCommonParameters;
import com.bilibili.lib.projection.commonburid.CastEventTrackingManager;
import com.bilibili.lib.projection.commonburid.CastScreenType;
import com.bilibili.lib.projection.internal.api.CloudDevices;
import com.bilibili.lib.projection.internal.api.ProjectionHttpService;
import com.bilibili.lib.projection.internal.api.model.ListUiBean;
import com.bilibili.lib.projection.internal.api.model.ProjectionGuidInfo;
import com.bilibili.lib.projection.internal.api.model.ProjectionOperationConfig;
import com.bilibili.lib.projection.internal.api.model.TextUrlBean;
import com.bilibili.lib.projection.internal.api.model.YstUiBean;
import com.bilibili.lib.projection.internal.base.BaseProjectionDialogFragment;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.engine.DefaultProjectionEngineManager;
import com.bilibili.lib.projection.internal.engine.IEngineDeviceChange;
import com.bilibili.lib.projection.internal.login.SyncCheckResult;
import com.bilibili.lib.projection.internal.nirvana.NirvanaEngine;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import com.bilibili.lib.projection.internal.reporter.ProjectionReporter;
import com.bilibili.lib.projection.internal.search.ProjectionSearchFragment;
import com.bilibili.lib.projection.internal.search.p;
import com.bilibili.lib.projection.internal.search.searchv2.SearchPanelContainer;
import com.bilibili.lib.projection.internal.search.view.ProjectionCircleImageView;
import com.bilibili.lib.projection.internal.search.widget.BiliOfficialProjectionWidgetV2;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.pegasus.card.base.CardClickProcessor;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.upper.module.archive.activity.ArchiveEntranceActivityNew;
import com.mall.data.page.cart.bean.WarehouseBean;
import com.mall.ui.page.create2.dialog.rulecontent.MallRuleDialogFragment;
import com.mall.ui.page.create2.dialog.rulecontent.dto.MallCartDialogRuleContentDto;
import com.mall.ui.page.create3.module.T;
import fh0.C7088h0;
import ge0.InterfaceC7274d;
import he0.C7432a;
import he0.C7433b;
import he0.C7435d;
import he0.e;
import ie0.C7564c;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import ke0.AbstractC7758f;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import le0.InterfaceC7845m;
import me0.C7985q;
import me0.InterfaceC7969a;
import ne0.C8085a;
import ne0.InterfaceC8086b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.dialog.CommonDialogUtilsKt;
import tv.danmaku.bili.widget.recycler.DividerDecoration;
import tv.danmaku.biliplayerv2.collection.Collections;
import ue0.InterfaceC8718a;
import ue0.InterfaceC8719b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionSearchFragment.class */
public class ProjectionSearchFragment extends BaseProjectionDialogFragment implements IPvTracker, q, IEngineDeviceChange {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public TextView f63574A;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    @Nullable
    public String f63575A1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public TextView f63576B;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public long f63577B1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public ViewGroup f63578C;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    @NotNull
    public final Lazy f63579C1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f63580D;

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    public long f63581D1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f63582E;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public int f63583E1;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public LinearLayout f63584F;

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    @NotNull
    public final Lazy f63585F1;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public TextView f63586G;

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    @NotNull
    public final Lazy f63587G1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public TextView f63588H;

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    public boolean f63589H1;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public BiliImageView f63590I;

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    @Nullable
    public ProjectionGuidInfo f63591I1;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @Nullable
    public BiliImageView f63592J;

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    @NotNull
    public final Ov0.c f63593J1;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @Nullable
    public BiliImageView f63594K;

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<String, ProjectionDeviceInternal> f63595K1;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f63596L;

    /* JADX INFO: renamed from: L1, reason: collision with root package name */
    @Nullable
    public List<? extends ProjectionDeviceInternal> f63597L1;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f63598M;

    /* JADX INFO: renamed from: M1, reason: collision with root package name */
    @Nullable
    public List<? extends ProjectionDeviceInternal> f63599M1;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f63600N;

    /* JADX INFO: renamed from: N1, reason: collision with root package name */
    @Nullable
    public List<? extends ProjectionDeviceInternal> f63601N1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f63602O;

    /* JADX INFO: renamed from: O1, reason: collision with root package name */
    @Nullable
    public List<? extends InterfaceC7274d> f63603O1;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f63604P;

    /* JADX INFO: renamed from: P1, reason: collision with root package name */
    public int f63605P1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f63606Q;

    /* JADX INFO: renamed from: Q1, reason: collision with root package name */
    public int f63607Q1;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f63608R;

    /* JADX INFO: renamed from: R1, reason: collision with root package name */
    @NotNull
    public final te0.i f63609R1;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public long f63610S;

    /* JADX INFO: renamed from: S1, reason: collision with root package name */
    @Nullable
    public BaseAppCompatActivity f63611S1;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f63612T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f63613U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f63614V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f63615W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    @Nullable
    public ListUiBean f63616X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public volatile boolean f63617X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    @Nullable
    public LinearLayout f63618Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    @NotNull
    public final GQ.b f63619Y0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    @Nullable
    public SearchPanelContainer f63620Z;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    @NotNull
    public final I1.E f63621Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @Nullable
    public BiliOfficialProjectionWidgetV2 f63622a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    @Nullable
    public View f63623a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    @Nullable
    public z f63624b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @Nullable
    public BiliOfficialProjectionWidgetV2 f63625c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    @NotNull
    public final l f63626c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public BiliImageView f63627d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    @NotNull
    public final k f63628d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f63629e;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    @NotNull
    public final m f63630e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public TextView f63631f;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public View f63632f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ViewGroup f63633g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public ConstraintLayout f63634g1;

    @Nullable
    public View h;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public LinearLayout f63635h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public View f63636i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    @Nullable
    public LinearLayout f63637i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RecyclerView f63638j;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    @Nullable
    public View f63639j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ae0.g f63640k;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    @NotNull
    public final CompositeDisposable f63641k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RecyclerView f63642l;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    @NotNull
    public final g f63643l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Ae0.m f63644m;

    @NotNull
    public final i m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RecyclerView f63645n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    @NotNull
    public final h f63646n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Ae0.k f63647o;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    @NotNull
    public final P f63648o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final com.bilibili.lib.projection.internal.widget.v f63649p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public BiliOfficialProjectionWidgetV2 f63650p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    public final Lazy f63651p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public TextView f63652q;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    @NotNull
    public final A f63653q1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public ViewGroup f63654r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Ge0.d f63655r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    @NotNull
    public final B f63656r1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public ViewGroup f63657s;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public long f63658s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public TextView f63659t;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public boolean f63660t1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public TextView f63661u;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    @NotNull
    public final ArrayList<String> f63662u1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public TextView f63663v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public long f63664v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public boolean f63665v1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public TextView f63666w;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public boolean f63667w1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public TextView f63668x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public boolean f63669x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public TextView f63670y;

    @Nullable
    public View y1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public TextView f63671z;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public int f63672z1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionSearchFragment$a.class */
    public static final class a {
        public static ProjectionSearchFragment a(int i7, boolean z6, int i8, int i9, boolean z7, boolean z8, ListUiBean listUiBean, boolean z9, int i10) {
            if ((i10 & 16) != 0) {
                z7 = false;
            }
            if ((i10 & 32) != 0) {
                z8 = false;
            }
            if ((i10 & 128) != 0) {
                z9 = false;
            }
            ProjectionSearchFragment projectionSearchFragment = new ProjectionSearchFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("key_client_id", i7);
            bundle.putBoolean("key_switch", z6);
            bundle.putInt("key_top", i8);
            bundle.putInt("key_display_height", i9);
            bundle.putBoolean("key_from_full", z7);
            bundle.putBoolean("key_story_style", z8);
            bundle.putBoolean("key_from_projection_full_screen", z9);
            projectionSearchFragment.setArguments(bundle);
            projectionSearchFragment.f63616X = listUiBean;
            return projectionSearchFragment;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionSearchFragment$b.class */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Function0<Unit> f63673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ProjectionSearchFragment f63674b;

        public b(@Nullable ProjectionSearchFragment projectionSearchFragment, Function0<Unit> function0) {
            this.f63674b = projectionSearchFragment;
            this.f63673a = function0;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionSearchFragment$c.class */
    public static abstract class c implements Runnable {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionSearchFragment$c$a.class */
        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f63675a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f63676b;

            public a(int i7) {
                Long longOrNull;
                this.f63675a = i7;
                String str = (String) Contract.get$default(ConfigManager.Companion.config(), "cast.cloud_search_repeat_time", (Object) null, 2, (Object) null);
                this.f63676b = (str == null || (longOrNull = StringsKt.toLongOrNull(str)) == null) ? 3L : longOrNull.longValue();
            }

            @Override // java.lang.Runnable
            public final void run() {
                BLog.i("SearchRunnable", "cloud search ....");
                com.bilibili.lib.projection.internal.engine.r rVarR = C7564c.f121640q.r(10);
                if (rVarR != null) {
                    rVarR.k(this.f63675a);
                }
                HandlerThreads.postDelayed(2, this, this.f63676b * ((long) 1000));
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionSearchFragment$c$b.class */
        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f63677a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f63678b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f63679c;

            public b(int i7) {
                Long longOrNull;
                this.f63677a = i7;
                ConfigManager.Companion companion = ConfigManager.Companion;
                this.f63678b = companion.isHitFF("cast.link_search_repeat");
                String str = (String) Contract.get$default(companion.config(), "cast.link_search_repeat_time", (Object) null, 2, (Object) null);
                this.f63679c = (str == null || (longOrNull = StringsKt.toLongOrNull(str)) == null) ? 1L : longOrNull.longValue();
            }

            @Override // java.lang.Runnable
            public final void run() {
                BLog.i("SearchRunnable", "link search ....");
                com.bilibili.lib.projection.internal.engine.r rVarR = C7564c.f121640q.r(7);
                if (rVarR != null) {
                    rVarR.k(this.f63677a);
                }
                if (this.f63678b) {
                    HandlerThreads.postDelayed(2, this, this.f63679c * ((long) 1000));
                }
            }
        }

        /* JADX INFO: renamed from: com.bilibili.lib.projection.internal.search.ProjectionSearchFragment$c$c, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionSearchFragment$c$c.class */
        public static final class C0353c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f63680a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f63681b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f63682c;

            public C0353c(int i7) {
                Long longOrNull;
                this.f63680a = i7;
                ConfigManager.Companion companion = ConfigManager.Companion;
                this.f63681b = companion.isHitFF("cast.nirvana_search_repeat");
                String str = (String) Contract.get$default(companion.config(), "cast.nirvana_search_repeat_time", (Object) null, 2, (Object) null);
                this.f63682c = (str == null || (longOrNull = StringsKt.toLongOrNull(str)) == null) ? 1L : longOrNull.longValue();
            }

            @Override // java.lang.Runnable
            public final void run() {
                BLog.i("SearchRunnable", "nirvana search ....");
                com.bilibili.lib.projection.internal.engine.r rVarR = C7564c.f121640q.r(5);
                if (rVarR != null) {
                    rVarR.k(this.f63680a);
                }
                if (this.f63681b) {
                    HandlerThreads.postDelayed(2, this, this.f63682c * ((long) 1000));
                }
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionSearchFragment$c$d.class */
        public static final class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f63683a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f63684b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f63685c;

            public d(int i7) {
                Long longOrNull;
                this.f63683a = i7;
                ConfigManager.Companion companion = ConfigManager.Companion;
                this.f63684b = !companion.isHitFF("cast.ott_blink_search_repeat");
                String str = (String) Contract.get$default(companion.config(), "cast.ott_blink_search_repeat_time", (Object) null, 2, (Object) null);
                this.f63685c = (str == null || (longOrNull = StringsKt.toLongOrNull(str)) == null) ? 5L : longOrNull.longValue();
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) C7433b.f120834i.getValue()).booleanValue()) {
                    BLog.i("SearchRunnable", "ott blink search ....");
                    com.bilibili.lib.projection.internal.engine.r rVarR = C7564c.f121640q.r(15);
                    if (rVarR != null) {
                        rVarR.k(this.f63683a);
                    }
                    if (this.f63684b) {
                        HandlerThreads.postDelayed(2, this, this.f63685c * ((long) 1000));
                    }
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionSearchFragment$d.class */
    public static final class d extends DividerDecoration {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ProjectionSearchFragment f63686f;

        public d(ProjectionSearchFragment projectionSearchFragment) {
            this.f63686f = projectionSearchFragment;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean needDrawDivider(androidx.recyclerview.widget.RecyclerView.ViewHolder r5) {
            /*
                r4 = this;
                r0 = r5
                boolean r0 = r0 instanceof Fe0.C1883c
                if (r0 == 0) goto L3e
                r0 = r5
                Fe0.c r0 = (Fe0.C1883c) r0
                int r0 = r0.getAbsoluteAdapterPosition()
                r7 = r0
                r0 = r4
                com.bilibili.lib.projection.internal.search.ProjectionSearchFragment r0 = r0.f63686f
                Ae0.m r0 = r0.f63644m
                r9 = r0
                r0 = r9
                r5 = r0
                r0 = r9
                if (r0 != 0) goto L27
                java.lang.String r0 = "mVehicleDeviceAdapter"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                r0 = 0
                r5 = r0
            L27:
                r0 = r5
                java.util.List<ge0.d> r0 = r0.f122752i
                int r0 = r0.size()
                r6 = r0
                r0 = 1
                r8 = r0
                r0 = r7
                r1 = r6
                r2 = 1
                int r1 = r1 - r2
                if (r0 == r1) goto L3e
                goto L41
            L3e:
                r0 = 0
                r8 = r0
            L41:
                r0 = r8
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.search.ProjectionSearchFragment.d.needDrawDivider(androidx.recyclerview.widget.RecyclerView$ViewHolder):boolean");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionSearchFragment$e.class */
    public static final class e extends DividerDecoration {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ProjectionSearchFragment f63687f;

        public e(ProjectionSearchFragment projectionSearchFragment) {
            this.f63687f = projectionSearchFragment;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean needDrawDivider(androidx.recyclerview.widget.RecyclerView.ViewHolder r5) {
            /*
                r4 = this;
                r0 = r5
                boolean r0 = r0 instanceof Fe0.C1883c
                if (r0 == 0) goto L3e
                r0 = r5
                Fe0.c r0 = (Fe0.C1883c) r0
                int r0 = r0.getAbsoluteAdapterPosition()
                r6 = r0
                r0 = r4
                com.bilibili.lib.projection.internal.search.ProjectionSearchFragment r0 = r0.f63687f
                Ae0.m r0 = r0.f63644m
                r9 = r0
                r0 = r9
                r5 = r0
                r0 = r9
                if (r0 != 0) goto L27
                java.lang.String r0 = "mVehicleDeviceAdapter"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                r0 = 0
                r5 = r0
            L27:
                r0 = r5
                java.util.List<ge0.d> r0 = r0.f122752i
                int r0 = r0.size()
                r7 = r0
                r0 = 1
                r8 = r0
                r0 = r6
                r1 = r7
                r2 = 1
                int r1 = r1 - r2
                if (r0 == r1) goto L3e
                goto L41
            L3e:
                r0 = 0
                r8 = r0
            L41:
                r0 = r8
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.search.ProjectionSearchFragment.e.needDrawDivider(androidx.recyclerview.widget.RecyclerView$ViewHolder):boolean");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionSearchFragment$f.class */
    public static final class f extends DividerDecoration {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ProjectionSearchFragment f63688f;

        public f(ProjectionSearchFragment projectionSearchFragment) {
            this.f63688f = projectionSearchFragment;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean needDrawDivider(androidx.recyclerview.widget.RecyclerView.ViewHolder r5) {
            /*
                r4 = this;
                r0 = r5
                boolean r0 = r0 instanceof Fe0.C1883c
                if (r0 == 0) goto L3e
                r0 = r5
                Fe0.c r0 = (Fe0.C1883c) r0
                int r0 = r0.getAbsoluteAdapterPosition()
                r7 = r0
                r0 = r4
                com.bilibili.lib.projection.internal.search.ProjectionSearchFragment r0 = r0.f63688f
                Ae0.m r0 = r0.f63644m
                r9 = r0
                r0 = r9
                r5 = r0
                r0 = r9
                if (r0 != 0) goto L27
                java.lang.String r0 = "mVehicleDeviceAdapter"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                r0 = 0
                r5 = r0
            L27:
                r0 = r5
                java.util.List<ge0.d> r0 = r0.f122752i
                int r0 = r0.size()
                r6 = r0
                r0 = 1
                r8 = r0
                r0 = r7
                r1 = r6
                r2 = 1
                int r1 = r1 - r2
                if (r0 == r1) goto L3e
                goto L41
            L3e:
                r0 = 0
                r8 = r0
            L41:
                r0 = r8
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.search.ProjectionSearchFragment.f.needDrawDivider(androidx.recyclerview.widget.RecyclerView$ViewHolder):boolean");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionSearchFragment$g.class */
    public static final class g extends BiliApiDataCallback<ProjectionGuidInfo> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ProjectionSearchFragment f63689b;

        public g(ProjectionSearchFragment projectionSearchFragment) {
            this.f63689b = projectionSearchFragment;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final boolean isCancel() {
            FragmentActivity fragmentActivityP3 = this.f63689b.p3();
            return fragmentActivityP3 == null || fragmentActivityP3.isDestroyed() || fragmentActivityP3.isFinishing();
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(ProjectionGuidInfo projectionGuidInfo) {
            ProjectionGuidInfo projectionGuidInfo2 = projectionGuidInfo;
            if (projectionGuidInfo2 == null) {
                return;
            }
            this.f63689b.f63591I1 = projectionGuidInfo2;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            BLog.e("ProjectionSearchFragment", th != null ? th.getMessage() : null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionSearchFragment$h.class */
    public static final class h implements p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionSearchFragment f63690a;

        public h(ProjectionSearchFragment projectionSearchFragment) {
            this.f63690a = projectionSearchFragment;
        }

        @Override // com.bilibili.lib.projection.internal.search.p.a
        public final void a() {
            com.bilibili.lib.projection.internal.reporter.a reporter;
            InterfaceC7845m interfaceC7845m = this.f63690a.f63598M;
            if (interfaceC7845m == null || (reporter = interfaceC7845m.getReporter()) == null) {
                return;
            }
            he0.j.c("main.public.guide-page.scan-cast-button.click", null, null, reporter.f63524a, null, 20);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        @Override // com.bilibili.lib.projection.internal.search.p.a
        public final void b(CloudDevices.Device device, String str) throws NoWhenBranchMatchedException {
            com.bilibili.lib.projection.internal.reporter.a reporter;
            CastCommonParameters castCommonParametersCommonParams = CastEventTrackingManager.Companion.instance().commonParams();
            if (castCommonParametersCommonParams != null) {
                castCommonParametersCommonParams.updateScreenCastType(CastScreenType.CastScreenTypeQRCode);
            }
            C7985q c7985q = new C7985q(C7564c.f121640q, device.getMName(), device.getMBuvid(), device.getMBrand(), device.getMModel(), String.valueOf(device.getMVersion()), device.getMFourk() == 1 && device.getMVersion() >= 104300, device.getMobiApp(), device.getMid());
            c7985q.f123678J = true;
            ProjectionSearchFragment projectionSearchFragment = this.f63690a;
            InterfaceC7845m interfaceC7845m = projectionSearchFragment.f63598M;
            if (interfaceC7845m != null && (reporter = interfaceC7845m.getReporter()) != null) {
                ProjectionReporter.C(reporter, true, str, device.getMBuvid(), null, 8);
            }
            projectionSearchFragment.f63628d1.b(c7985q, BiliOfficialProjectionWidgetV2.WidgetV2Type.Bili);
        }

        @Override // com.bilibili.lib.projection.internal.search.p.a
        public final void onFailed(String str, String str2) {
            com.bilibili.lib.projection.internal.reporter.a reporter;
            InterfaceC7845m interfaceC7845m = this.f63690a.f63598M;
            if (interfaceC7845m == null || (reporter = interfaceC7845m.getReporter()) == null) {
                return;
            }
            ProjectionReporter.C(reporter, false, str, null, str2, 4);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionSearchFragment$i.class */
    public static final class i implements e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionSearchFragment f63691a;

        public i(ProjectionSearchFragment projectionSearchFragment) {
            this.f63691a = projectionSearchFragment;
        }

        @Override // he0.e.a
        public final void a() {
            this.f63691a.sf();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionSearchFragment$j.class */
    public static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionSearchFragment f63692a;

        public j(ProjectionSearchFragment projectionSearchFragment) {
            this.f63692a = projectionSearchFragment;
        }

        public final void a(String str) {
            ToastHelper.showToast(FoundationAlias.getFapp(), "登录失败，请在TV端打开云视听小电视-登录-扫码或输入账号密码完成登录", 0);
            BLog.e("ProjectionSearchFragment", "onCancel sync login failed code = 301, cause = " + str);
            this.f63692a.dismissAllowingStateLoss();
        }

        public final void b() {
            this.f63692a.dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionSearchFragment$k.class */
    public static final class k implements BiliOfficialProjectionWidgetV2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionSearchFragment f63693a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionSearchFragment$k$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f63694a;

            static {
                int[] iArr = new int[BiliOfficialProjectionWidgetV2.WidgetV2Type.values().length];
                try {
                    iArr[BiliOfficialProjectionWidgetV2.WidgetV2Type.Bili.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[BiliOfficialProjectionWidgetV2.WidgetV2Type.Vehicle.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[BiliOfficialProjectionWidgetV2.WidgetV2Type.ThirdParty.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                try {
                    iArr[BiliOfficialProjectionWidgetV2.WidgetV2Type.Unknown.ordinal()] = 4;
                } catch (NoSuchFieldError e10) {
                }
                f63694a = iArr;
            }
        }

        public k(ProjectionSearchFragment projectionSearchFragment) {
            this.f63693a = projectionSearchFragment;
        }

        @Override // com.bilibili.lib.projection.internal.search.widget.BiliOfficialProjectionWidgetV2.b
        public final void a(String str) {
            com.bilibili.lib.projection.internal.reporter.a reporter;
            ProjectionSearchFragment projectionSearchFragment = this.f63693a;
            Context context = projectionSearchFragment.getContext();
            if (context != null && str != null && !StringsKt.isBlank(str)) {
                BLRouter.routeTo(RouteRequestKt.toRouteRequest(Uri.parse(str).buildUpon().appendQueryParameter("wbType", "common").build()), context);
            }
            InterfaceC7845m interfaceC7845m = projectionSearchFragment.f63598M;
            if (interfaceC7845m == null || (reporter = interfaceC7845m.getReporter()) == null) {
                return;
            }
            reporter.O();
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        @Override // com.bilibili.lib.projection.internal.search.widget.BiliOfficialProjectionWidgetV2.b
        public final void b(InterfaceC7274d interfaceC7274d, BiliOfficialProjectionWidgetV2.WidgetV2Type widgetV2Type) throws NoWhenBranchMatchedException {
            AbstractC7758f abstractC7758f;
            Application application;
            int i7 = a.f63694a[widgetV2Type.ordinal()];
            ProjectionSearchFragment projectionSearchFragment = this.f63693a;
            if (i7 == 1) {
                String strC = Ie0.j.c();
                if (strC != null && strC.length() > 0 && C7433b.b(interfaceC7274d) && (application = BiliContext.application()) != null) {
                    BiliGlobalPreferenceHelper.getBLKVSharedPreference(application).edit().putBoolean("pref_projection_bili_record_".concat(strC), true).apply();
                }
                Ae0.g gVar = projectionSearchFragment.f63640k;
                abstractC7758f = gVar;
                if (gVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBiliTVAdapter");
                    abstractC7758f = null;
                }
            } else if (i7 == 2) {
                Ae0.m mVar = projectionSearchFragment.f63644m;
                abstractC7758f = mVar;
                if (mVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVehicleDeviceAdapter");
                    abstractC7758f = null;
                }
            } else if (i7 == 3) {
                Ae0.k kVar = projectionSearchFragment.f63647o;
                abstractC7758f = kVar;
                if (kVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mThirdPartyAdapter");
                    abstractC7758f = null;
                }
            } else {
                if (i7 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                abstractC7758f = null;
            }
            if (abstractC7758f != null) {
                abstractC7758f.S(interfaceC7274d);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionSearchFragment$l.class */
    public static final class l implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionSearchFragment f63695a;

        public l(ProjectionSearchFragment projectionSearchFragment) {
            this.f63695a = projectionSearchFragment;
        }

        @Override // Ge0.d.a
        public final void a() {
            this.f63695a.tf(false);
        }

        @Override // Ge0.d.a
        public final void b() {
            ProjectionSearchFragment projectionSearchFragment = this.f63695a;
            Ge0.d dVar = projectionSearchFragment.f63655r0;
            if ((dVar != null ? dVar.getParent() : null) != null) {
                ConstraintLayout constraintLayout = projectionSearchFragment.f63634g1;
                ConstraintLayout constraintLayout2 = constraintLayout;
                if (constraintLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rootNewUi");
                    constraintLayout2 = null;
                }
                constraintLayout2.removeView(projectionSearchFragment.f63655r0);
            }
            Ge0.d dVar2 = projectionSearchFragment.f63655r0;
            if (dVar2 != null) {
                dVar2.setVisibility(8);
            }
            projectionSearchFragment.f63655r0 = null;
            View view = projectionSearchFragment.f63639j1;
            if ((view != null ? view.getParent() : null) != null) {
                LinearLayout linearLayout = projectionSearchFragment.f63635h1;
                if (linearLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rootNewUiContent");
                    linearLayout = null;
                }
                linearLayout.removeView(projectionSearchFragment.f63639j1);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionSearchFragment$m.class */
    public static final class m implements BiliOfficialProjectionWidgetV2.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionSearchFragment f63696a;

        public m(ProjectionSearchFragment projectionSearchFragment) {
            this.f63696a = projectionSearchFragment;
        }

        @Override // com.bilibili.lib.projection.internal.search.widget.BiliOfficialProjectionWidgetV2.c
        public final void a(final boolean z6) {
            BiliOfficialProjectionWidgetV2 biliOfficialProjectionWidgetV2;
            ProjectionSearchFragment projectionSearchFragment = this.f63696a;
            BiliOfficialProjectionWidgetV2 biliOfficialProjectionWidgetV22 = projectionSearchFragment.f63622a0;
            boolean z7 = true;
            if ((biliOfficialProjectionWidgetV22 == null || !biliOfficialProjectionWidgetV22.f63831l) && ((biliOfficialProjectionWidgetV2 = projectionSearchFragment.f63650p0) == null || !biliOfficialProjectionWidgetV2.f63831l)) {
                z7 = false;
            }
            InterfaceC7845m interfaceC7845m = projectionSearchFragment.f63598M;
            if (interfaceC7845m == null || interfaceC7845m.getReporter() == null) {
                return;
            }
            InterfaceC7845m interfaceC7845m2 = projectionSearchFragment.f63598M;
            IProjectionItem iProjectionItemN = interfaceC7845m2 != null ? interfaceC7845m2.n(false) : null;
            StandardProjectionItem standardProjectionItem = iProjectionItemN instanceof StandardProjectionItem ? (StandardProjectionItem) iProjectionItemN : null;
            if (standardProjectionItem == null) {
                standardProjectionItem = null;
            }
            final boolean z8 = z7;
            he0.j.e("player.player.devices.no_tv_solutions.show", null, standardProjectionItem, null, new Function1(z8, z6) { // from class: ze0.B

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f130215a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f130216b;

                {
                    this.f130215a = z8;
                    this.f130216b = z6;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final Object invoke(Object obj) {
                    Map map = (Map) obj;
                    map.put("others_on", String.valueOf(this.f130215a ? 1 : 0));
                    map.put("state", this.f130216b ? "off" : "no");
                    return Unit.INSTANCE;
                }
            }, 8);
        }

        @Override // com.bilibili.lib.projection.internal.search.widget.BiliOfficialProjectionWidgetV2.c
        public final void b() {
            com.bilibili.lib.projection.internal.reporter.a reporter;
            ProjectionSearchFragment projectionSearchFragment = this.f63696a;
            if (projectionSearchFragment.qf() || projectionSearchFragment.f63614V) {
                return;
            }
            projectionSearchFragment.f63614V = true;
            InterfaceC7845m interfaceC7845m = projectionSearchFragment.f63598M;
            if (interfaceC7845m == null || (reporter = interfaceC7845m.getReporter()) == null) {
                return;
            }
            reporter.P();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionSearchFragment$n.class */
    public static final class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionSearchFragment f63697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ProjectionDeviceInternal f63698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Function0<Unit> f63699c;

        public n(ProjectionSearchFragment projectionSearchFragment, ProjectionDeviceInternal projectionDeviceInternal, Function0<Unit> function0) {
            this.f63697a = projectionSearchFragment;
            this.f63698b = projectionDeviceInternal;
            this.f63699c = function0;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(com.bilibili.lib.projection.internal.login.SyncCheckResult r9) {
            /*
                Method dump skipped, instruction units count: 392
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.search.ProjectionSearchFragment.n.a(com.bilibili.lib.projection.internal.login.SyncCheckResult):void");
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bilibili.lib.projection.internal.widget.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.bilibili.lib.projection.internal.search.A] */
    /* JADX WARN: Type inference failed for: r1v17, types: [com.bilibili.lib.projection.internal.search.B] */
    public ProjectionSearchFragment() {
        ?? obj = new Object();
        obj.f64125a = com.bilibili.lib.projection.internal.widget.PageState.IDLE;
        this.f63649p = obj;
        this.f63612T = true;
        this.f63619Y0 = new GQ.b(1, this);
        this.f63621Z0 = new I1.E(this, 1);
        this.f63626c1 = new l(this);
        this.f63628d1 = new k(this);
        this.f63630e1 = new m(this);
        this.f63641k1 = new CompositeDisposable();
        this.f63643l1 = new g(this);
        this.m1 = new i(this);
        this.f63646n1 = new h(this);
        this.f63648o1 = new P(this, 1);
        this.f63651p1 = LazyKt.lazy(new com.bilibili.bililive.room.ui.roomv3.player.y(this, 2));
        this.f63653q1 = new Runnable(this) { // from class: com.bilibili.lib.projection.internal.search.A

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ProjectionSearchFragment f63526a;

            {
                this.f63526a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ProjectionSearchFragment projectionSearchFragment = this.f63526a;
                FragmentActivity fragmentActivityP3 = projectionSearchFragment.p3();
                if (fragmentActivityP3 == null || fragmentActivityP3.isDestroyed() || fragmentActivityP3.isFinishing()) {
                    return;
                }
                BLog.e("ProjectionSearchFragment", "search device timeout");
                projectionSearchFragment.f63580D = true;
                projectionSearchFragment.kf();
            }
        };
        this.f63656r1 = new ConnectivityMonitor.OnNetworkChangedListener(this) { // from class: com.bilibili.lib.projection.internal.search.B

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ProjectionSearchFragment f63527a;

            {
                this.f63527a = this;
            }

            public final void onChanged(int i7) {
                this.f63527a.kf();
            }
        };
        this.f63662u1 = new ArrayList<>();
        this.f63577B1 = System.currentTimeMillis();
        this.f63579C1 = LazyKt.lazy(new QY0.f(this, 5));
        this.f63585F1 = LazyKt.lazy(new b0(6));
        this.f63587G1 = LazyKt.lazy(new c0(6));
        this.f63593J1 = new Ov0.c(this, 2);
        this.f63595K1 = new ConcurrentHashMap<>();
        this.f63605P1 = -1;
        this.f63607Q1 = -1;
        this.f63609R1 = new te0.i(new j(this));
    }

    public static float mf(@Nullable FragmentActivity fragmentActivity) {
        Resources resources;
        if (fragmentActivity == null || (resources = fragmentActivity.getResources()) == null) {
            return 40.0f;
        }
        return 40.0f * resources.getDisplayMetrics().density;
    }

    @Override // com.bilibili.lib.projection.internal.engine.IEngineDeviceChange
    public final void O8(boolean z6) {
        if (z6) {
            BiliOfficialProjectionWidgetV2 biliOfficialProjectionWidgetV2 = this.f63622a0;
            if (biliOfficialProjectionWidgetV2 != null) {
                biliOfficialProjectionWidgetV2.b();
            }
            BiliOfficialProjectionWidgetV2 biliOfficialProjectionWidgetV22 = this.f63625c0;
            if (biliOfficialProjectionWidgetV22 != null) {
                biliOfficialProjectionWidgetV22.b();
            }
            BiliOfficialProjectionWidgetV2 biliOfficialProjectionWidgetV23 = this.f63650p0;
            if (biliOfficialProjectionWidgetV23 != null) {
                biliOfficialProjectionWidgetV23.b();
            }
            HandlerThreads.remove(0, this.f63621Z0);
            HandlerThreads.postDelayed(0, this.f63621Z0, 1000L);
            HandlerThreads.remove(0, this.f63593J1);
            HandlerThreads.postDelayed(0, this.f63593J1, 5000L);
            return;
        }
        BLog.d("BiliWidgetV2", "bili new ui widget will frozen...");
        BiliOfficialProjectionWidgetV2 biliOfficialProjectionWidgetV24 = this.f63622a0;
        if (biliOfficialProjectionWidgetV24 != null) {
            biliOfficialProjectionWidgetV24.setFrozenUi(true);
        }
        BiliOfficialProjectionWidgetV2 biliOfficialProjectionWidgetV25 = this.f63625c0;
        if (biliOfficialProjectionWidgetV25 != null) {
            biliOfficialProjectionWidgetV25.setFrozenUi(true);
        }
        BiliOfficialProjectionWidgetV2 biliOfficialProjectionWidgetV26 = this.f63650p0;
        if (biliOfficialProjectionWidgetV26 != null) {
            biliOfficialProjectionWidgetV26.setFrozenUi(true);
        }
        BiliOfficialProjectionWidgetV2 biliOfficialProjectionWidgetV27 = this.f63622a0;
        if (biliOfficialProjectionWidgetV27 != null) {
            biliOfficialProjectionWidgetV27.i(BiliOfficialProjectionWidgetV2.WidgetV2Type.Bili);
        }
        BiliOfficialProjectionWidgetV2 biliOfficialProjectionWidgetV28 = this.f63625c0;
        if (biliOfficialProjectionWidgetV28 != null) {
            biliOfficialProjectionWidgetV28.i(BiliOfficialProjectionWidgetV2.WidgetV2Type.Vehicle);
        }
        BiliOfficialProjectionWidgetV2 biliOfficialProjectionWidgetV29 = this.f63650p0;
        if (biliOfficialProjectionWidgetV29 != null) {
            biliOfficialProjectionWidgetV29.i(BiliOfficialProjectionWidgetV2.WidgetV2Type.ThirdParty);
        }
    }

    @Override // com.bilibili.lib.projection.internal.search.q
    public final void Rd(@NotNull InterfaceC8718a interfaceC8718a, @NotNull ProjectionDeviceInternal projectionDeviceInternal, @Nullable Function0<Unit> function0) {
        IProjectionItem iProjectionItemN;
        te0.i iVar = this.f63609R1;
        InterfaceC7845m interfaceC7845m = this.f63598M;
        n nVar = new n(this, projectionDeviceInternal, function0);
        if (interfaceC7845m != null) {
            iVar.getClass();
            iProjectionItemN = interfaceC7845m.n(false);
        } else {
            iProjectionItemN = null;
        }
        iVar.f127502e = iProjectionItemN;
        SyncCheckResult syncCheckResult = new SyncCheckResult();
        syncCheckResult.setValid(false);
        if (interfaceC8718a != null) {
            Iterator<InterfaceC8718a> it = te0.i.f127497f.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(it.next().getUuid(), interfaceC8718a.getUuid())) {
                    syncCheckResult.setMsg("device has try");
                    nVar.a(syncCheckResult);
                    return;
                }
            }
        }
        iVar.f127500c = interfaceC8718a;
        iVar.f127501d = projectionDeviceInternal;
        if (!C0.b()) {
            syncCheckResult.setMsg("app not login");
            nVar.a(syncCheckResult);
            return;
        }
        Cd0.g gVarM = interfaceC8718a.m();
        iVar.f127499b = gVarM;
        if (gVarM == null) {
            syncCheckResult.setMsg("not ott device");
            nVar.a(syncCheckResult);
            return;
        }
        int version = gVarM.getVersion();
        C8085a c8085a = C7564c.f121633j;
        if (!((List) c8085a.f124078i.getValue()).isEmpty()) {
            Lazy lazy = c8085a.f124078i;
            if (version >= ((Number) ((List) lazy.getValue()).get(0)).intValue()) {
                List listSubList = ((List) lazy.getValue()).subList(1, ((List) lazy.getValue()).size());
                if (!(listSubList instanceof Collection) || !listSubList.isEmpty()) {
                    Iterator it2 = listSubList.iterator();
                    while (it2.hasNext()) {
                        if (((Number) it2.next()).intValue() == version) {
                        }
                    }
                }
            }
            syncCheckResult.setMsg("nirvana version invalid");
            nVar.a(syncCheckResult);
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        Cd0.g gVar = iVar.f127499b;
        if (gVar != null) {
            gVar.i(new te0.e(syncCheckResult, nVar, iVar, interfaceC8718a, jUptimeMillis));
        }
    }

    @Override // com.bilibili.lib.projection.internal.base.BaseProjectionDialogFragment
    public final int getDialogViewRes() {
        return 2131497863;
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "player.throwing-screen-devicelist.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        Bundle bundle = new Bundle();
        List<Float> list = C7433b.f120827a;
        InterfaceC7845m interfaceC7845m = this.f63598M;
        int clientType = interfaceC7845m != null ? interfaceC7845m.getClientType() : 0;
        int i7 = 2;
        if (clientType != 1) {
            i7 = clientType != 2 ? 1 : 3;
        }
        bundle.putString("type", String.valueOf(i7));
        bundle.putString("platform", "0");
        return bundle;
    }

    @Override // com.bilibili.lib.projection.internal.search.q
    public final void he(@NotNull InterfaceC7274d interfaceC7274d) {
        if ((interfaceC7274d instanceof pe0.i) || (interfaceC7274d instanceof se0.j)) {
            CastCommonParameters castCommonParametersCommonParams = CastEventTrackingManager.Companion.instance().commonParams();
            if (castCommonParametersCommonParams != null) {
                castCommonParametersCommonParams.updateScreenCastType(CastScreenType.CastScreenTypeDLNA);
            }
        } else if (interfaceC7274d instanceof InterfaceC7969a) {
            CastCommonParameters castCommonParametersCommonParams2 = CastEventTrackingManager.Companion.instance().commonParams();
            if (castCommonParametersCommonParams2 != null) {
                castCommonParametersCommonParams2.updateScreenCastType(CastScreenType.CastScreenTypeCloud);
            }
        } else {
            CastCommonParameters castCommonParametersCommonParams3 = CastEventTrackingManager.Companion.instance().commonParams();
            if (castCommonParametersCommonParams3 != null) {
                castCommonParametersCommonParams3.updateScreenCastType(CastScreenType.CastScreenTypeUnknown);
            }
        }
        BLog.i("ProjectionTrack", "select device by user device = " + interfaceC7274d);
        C7564c.f121640q.j(this.f63596L, interfaceC7274d);
        if (interfaceC7274d instanceof ProjectionDeviceInternal) {
            InterfaceC7845m interfaceC7845m = this.f63598M;
            IProjectionItem iProjectionItemN = interfaceC7845m != null ? interfaceC7845m.n(false) : null;
            com.bilibili.lib.projection.internal.reporter.a aVar = C7564c.f121634k;
            ProjectionDeviceInternal projectionDeviceInternal = (ProjectionDeviceInternal) interfaceC7274d;
            aVar.getClass();
            he0.j jVar = he0.j.f120871a;
            boolean z6 = iProjectionItemN instanceof StandardProjectionItem;
            he0.j.h("projection.device.selected", projectionDeviceInternal, true, z6 ? (StandardProjectionItem) iProjectionItemN : null, aVar.f63524a, new com.bilibili.biligame.compose.c(1));
            StandardProjectionItem standardProjectionItem = null;
            if (z6) {
                standardProjectionItem = (StandardProjectionItem) iProjectionItemN;
            }
            jVar.b("main.public.screencast-panel-device.0.click", projectionDeviceInternal, standardProjectionItem, aVar.f63524a, new C1498u0(projectionDeviceInternal, 3));
        }
    }

    @Override // com.bilibili.lib.projection.internal.base.BaseProjectionDialogFragment
    public final float hf() {
        float f7 = 0.5f;
        if (!this.f63606Q && !rf()) {
            f7 = 0.0f;
        }
        return f7;
    }

    @Override // com.bilibili.lib.projection.internal.base.BaseProjectionDialogFragment
    public final void initSavedData() {
        boolean z6 = false;
        if (!this.f63608R && (!this.f63604P || rf())) {
            z6 = true;
        }
        this.f63011b = z6;
        this.f63012c = true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v545, types: [com.bilibili.lib.projection.internal.widget.t, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v218, types: [com.bilibili.lib.projection.internal.search.z] */
    /* JADX WARN: Type inference failed for: r1v269, types: [com.bilibili.lib.projection.internal.widget.e$b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v279, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // com.bilibili.lib.projection.internal.base.BaseProjectionDialogFragment
    public final void initView(@NotNull View view) throws NoWhenBranchMatchedException {
        String string;
        String thirdPartyDesc;
        Context context;
        Window window;
        View decorView;
        this.f63664v0 = System.currentTimeMillis();
        this.y1 = view;
        this.f63618Y = (LinearLayout) view.findViewById(2131306968);
        this.f63620Z = (SearchPanelContainer) view.findViewById(2131322115);
        if (qf()) {
            LinearLayout linearLayout = this.f63618Y;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                Unit unit = Unit.INSTANCE;
            }
            SearchPanelContainer searchPanelContainer = this.f63620Z;
            if (searchPanelContainer != null) {
                searchPanelContainer.setVisibility(0);
                Unit unit2 = Unit.INSTANCE;
            }
            SearchPanelContainer searchPanelContainer2 = this.f63620Z;
            if (searchPanelContainer2 != null) {
                searchPanelContainer2.setBackCallback(new GS0.k(this, 3));
                searchPanelContainer2.getPanelInfo().f63787a = this.f63665v1;
                searchPanelContainer2.getPanelInfo().f63788b = this.f63596L;
                searchPanelContainer2.setListUiBean(this.f63616X);
                if (searchPanelContainer2.getListUiBean() == null) {
                    searchPanelContainer2.setListUiBean(C7435d.f120838c);
                }
                searchPanelContainer2.setSearchCallback$biliscreencast_release(this);
                searchPanelContainer2.setCompanionLiveInfo(C7435d.f120840e);
                if (!searchPanelContainer2.isLaidOut() || searchPanelContainer2.isLayoutRequested()) {
                    searchPanelContainer2.addOnLayoutChangeListener(new com.bilibili.lib.projection.internal.search.searchv2.g(this, searchPanelContainer2));
                } else {
                    Dialog dialog = getDialog();
                    searchPanelContainer2.setSearchPageFullscreen(((dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) ? 0 : decorView.getHeight()) >= (searchPanelContainer2.getContext().getResources().getDisplayMetrics().heightPixels * 4) / 5);
                }
            }
            final SearchPanelContainer searchPanelContainer3 = this.f63620Z;
            if (searchPanelContainer3 != null) {
                searchPanelContainer3.setRefreshCallback(new Function0(this, searchPanelContainer3) { // from class: com.bilibili.lib.projection.internal.search.searchv2.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ProjectionSearchFragment f63797a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final SearchPanelContainer f63798b;

                    {
                        this.f63797a = this;
                        this.f63798b = searchPanelContainer3;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke() {
                        /*
                            Method dump skipped, instruction units count: 266
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.search.searchv2.e.invoke():java.lang.Object");
                    }
                });
            }
        }
        jf(rf());
        this.h = view.findViewById(2131297828);
        this.f63636i = view.findViewById(2131307861);
        View viewFindViewById = view.findViewById(2131309142);
        if (this.f63616X != null) {
            View view2 = this.f63636i;
            if (view2 != null) {
                view2.setVisibility(0);
                Unit unit3 = Unit.INSTANCE;
            }
            View view3 = this.h;
            if (view3 != null) {
                view3.setVisibility(8);
                Unit unit4 = Unit.INSTANCE;
            }
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
                Unit unit5 = Unit.INSTANCE;
            }
            view.findViewById(2131307857).setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.lib.projection.internal.search.s

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ProjectionSearchFragment f63747a;

                {
                    this.f63747a = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:58:0x021f  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void onClick(android.view.View r10) {
                    /*
                        Method dump skipped, instruction units count: 602
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.search.s.onClick(android.view.View):void");
                }
            });
            view.findViewById(2131307856).setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.lib.projection.internal.search.w

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ProjectionSearchFragment f63819a;

                {
                    this.f63819a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    ProjectionSearchFragment projectionSearchFragment = this.f63819a;
                    com.bilibili.lib.projection.internal.reporter.a aVar = C7564c.f121634k;
                    projectionSearchFragment.nf();
                    aVar.Q();
                    projectionSearchFragment.f63575A1 = "close";
                    projectionSearchFragment.dismissAllowingStateLoss();
                }
            });
            HandlerThreads.remove(0, this.f63593J1);
            HandlerThreads.postDelayed(0, this.f63593J1, 5000L);
        } else {
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
                Unit unit6 = Unit.INSTANCE;
            }
            View view4 = this.f63636i;
            if (view4 != null) {
                view4.setVisibility(8);
                Unit unit7 = Unit.INSTANCE;
            }
            if (this.f63604P) {
                View view5 = this.h;
                if (view5 != null) {
                    view5.setVisibility(0);
                    Unit unit8 = Unit.INSTANCE;
                }
                view.findViewById(2131297094).setOnClickListener(new Bu.b(this, 1));
            } else {
                View view6 = this.h;
                if (view6 != null) {
                    view6.setVisibility(8);
                    Unit unit9 = Unit.INSTANCE;
                }
            }
            view.findViewById(2131309542).setOnClickListener(new Bu.c(this, 1));
            if (this.f63604P) {
                viewFindViewById.setVisibility(8);
            }
            if (this.f63606Q) {
                viewFindViewById.setBackgroundColor(0);
                viewFindViewById.setBackgroundResource(2131231853);
            } else {
                viewFindViewById.setBackgroundResource(0);
                viewFindViewById.setBackgroundColor(ResourcesCompat.getColor(getResources(), R$color.f64616Wh0, null));
            }
        }
        this.f63627d = view.findViewById(2131297523);
        this.f63631f = (TextView) view.findViewById(2131313247);
        this.f63633g = (ViewGroup) view.findViewById(2131316094);
        BiliImageView biliImageView = (ProjectionCircleImageView) view.findViewById(2131316092);
        if (biliImageView != null) {
            biliImageView.setImageResource(2131238645);
            int width = biliImageView.getWidth();
            int measuredWidth = width;
            if (width == 0) {
                biliImageView.measure(-1, -2);
                measuredWidth = biliImageView.getMeasuredWidth();
            }
            if (measuredWidth > 0) {
                biliImageView.getLayoutParams().height = (int) (((int) (ScreenUtil.getScreenWidth(biliImageView.getContext()) - C7432a.a(biliImageView.getContext(), 24.0f))) * 0.10826211f);
                biliImageView.requestLayout();
            }
        }
        this.f63638j = (RecyclerView) view.findViewById(2131297518);
        this.f63642l = (RecyclerView) view.findViewById(2131316093);
        this.f63645n = (RecyclerView) view.findViewById(2131308527);
        final com.bilibili.lib.projection.internal.widget.v vVar = this.f63649p;
        ProjectionOperationConfig projectionOperationConfigOf = of();
        ProjectionOperationConfig.ProjButtonBubbleConfig projButtonBubble = projectionOperationConfigOf != null ? projectionOperationConfigOf.getProjButtonBubble() : null;
        vVar.f64126b = view;
        vVar.f64143t = projButtonBubble;
        vVar.f64127c = (ViewGroup) view.findViewById(2131309561);
        vVar.f64128d = (ViewGroup) view.findViewById(2131309562);
        vVar.f64129e = (ViewGroup) view.findViewById(2131309548);
        vVar.f64130f = (ViewGroup) view.findViewById(2131309574);
        vVar.f64132i = (ViewGroup) view.findViewById(2131309279);
        vVar.f64131g = (ImageView) view.findViewById(2131309542);
        vVar.f64133j = (TextView) view.findViewById(2131309288);
        vVar.f64134k = (TextView) view.findViewById(2131309592);
        vVar.f64135l = (TextView) view.findViewById(2131309588);
        vVar.f64136m = (ImageView) view.findViewById(2131309590);
        vVar.f64137n = (TextView) view.findViewById(2131309593);
        vVar.f64138o = (TextView) view.findViewById(2131309589);
        vVar.f64139p = (ImageView) view.findViewById(2131309591);
        TextView textView = vVar.f64135l;
        if (textView != null) {
            textView.setOnClickListener(new Qh1.h(vVar, 3));
        }
        ImageView imageView = vVar.f64136m;
        if (imageView != null) {
            imageView.setOnClickListener(new com.bilibili.app.comment3.ui.holder.u(vVar, 1));
        }
        TextView textView2 = vVar.f64138o;
        if (textView2 != null) {
            textView2.setOnClickListener(new com.bilibili.lib.projection.internal.widget.r(0));
        }
        ImageView imageView2 = vVar.f64139p;
        if (imageView2 != 0) {
            imageView2.setOnClickListener(new Object());
        }
        View view7 = vVar.f64126b;
        if (view7 != null && (context = view7.getContext()) != null) {
            vVar.f64140q = AnimationUtils.loadAnimation(context, 2130772311);
            vVar.f64141r = AnimationUtils.loadAnimation(context, 2130772312);
        }
        if (Ie0.d.e(4) && Ie0.d.e(0)) {
            ProjectionOperationConfig.ProjButtonBubbleConfig projButtonBubbleConfig = vVar.f64143t;
            if (projButtonBubbleConfig != null ? Intrinsics.areEqual(projButtonBubbleConfig.getShowGuide(), Boolean.TRUE) : false) {
                if (vVar.f64136m != null) {
                    View view8 = vVar.f64126b;
                    com.bilibili.lib.projection.internal.widget.e eVar = new com.bilibili.lib.projection.internal.widget.e(View.inflate(view8 != null ? view8.getContext() : null, 2131496556, null), vVar.f64136m, 4, 3);
                    eVar.setFocusable(false);
                    eVar.setOutsideTouchable(true);
                    vVar.f64142s = eVar;
                }
                com.bilibili.lib.projection.internal.widget.e eVar2 = vVar.f64142s;
                if (eVar2 != null) {
                    eVar2.f63908b = new Object();
                }
                ?? r02 = new Runnable(vVar) { // from class: com.bilibili.lib.projection.internal.widget.t

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final v f64124a;

                    {
                        this.f64124a = vVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        e eVar3;
                        v vVar2 = this.f64124a;
                        e eVar4 = vVar2.f64142s;
                        if ((eVar4 == null || !eVar4.isShowing()) && (eVar3 = vVar2.f64142s) != null) {
                            e.b(eVar3, 3, -5, 0L, 4);
                        }
                    }
                };
                HandlerThreads.getHandler(0).removeCallbacks(r02);
                HandlerThreads.getHandler(0).postDelayed(r02, 1500L);
                vVar.f64144u = r02;
            }
        }
        this.f63649p.h = new Bu.d(this, 2);
        this.f63652q = (TextView) view.findViewById(2131309544);
        this.f63654r = (ViewGroup) view.findViewById(2131309545);
        this.f63657s = (ViewGroup) view.findViewById(2131309541);
        this.f63578C = (ViewGroup) view.findViewById(2131309543);
        this.f63659t = (TextView) view.findViewById(2131309566);
        this.f63663v = (TextView) view.findViewById(2131309552);
        this.f63670y = (TextView) view.findViewById(2131309578);
        this.f63661u = (TextView) view.findViewById(2131309565);
        this.f63666w = (TextView) view.findViewById(2131309551);
        this.f63671z = (TextView) view.findViewById(2131309577);
        this.f63668x = (TextView) view.findViewById(2131309560);
        this.f63574A = (TextView) view.findViewById(2131309586);
        this.f63576B = (TextView) view.findViewById(2131309568);
        this.f63590I = view.findViewById(2131309571);
        this.f63592J = view.findViewById(2131309587);
        this.f63594K = view.findViewById(2131309582);
        BiliImageView biliImageView2 = this.f63590I;
        if (biliImageView2 != null) {
            lf(biliImageView2);
            Unit unit10 = Unit.INSTANCE;
        }
        BiliImageView biliImageView3 = this.f63592J;
        if (biliImageView3 != null) {
            lf(biliImageView3);
            Unit unit11 = Unit.INSTANCE;
        }
        BiliImageView biliImageView4 = this.f63594K;
        if (biliImageView4 != null) {
            lf(biliImageView4);
            Unit unit12 = Unit.INSTANCE;
        }
        BiliImageView biliImageView5 = this.f63590I;
        if (biliImageView5 != null) {
            biliImageView5.setOnClickListener(new Bu.e(this, 1));
            Unit unit13 = Unit.INSTANCE;
        }
        BiliImageView biliImageView6 = this.f63592J;
        if (biliImageView6 != null) {
            biliImageView6.setOnClickListener(new Bu.f(this, 2));
            Unit unit14 = Unit.INSTANCE;
        }
        BiliImageView biliImageView7 = this.f63594K;
        if (biliImageView7 != null) {
            final int i7 = 1;
            biliImageView7.setOnClickListener(new View.OnClickListener(this, i7) { // from class: MF0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f16009a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f16010b;

                {
                    this.f16009a = i7;
                    this.f16010b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view9) {
                    switch (this.f16009a) {
                        case 0:
                            ArchiveEntranceActivityNew archiveEntranceActivityNew = (ArchiveEntranceActivityNew) this.f16010b;
                            int i8 = ArchiveEntranceActivityNew.N;
                            archiveEntranceActivityNew.finish();
                            break;
                        default:
                            ProjectionSearchFragment projectionSearchFragment = (ProjectionSearchFragment) this.f16010b;
                            C7564c.f121634k.N(3);
                            String str = (String) ConfigManager.Companion.config().get("videodetail.projection_nodevice_banner_jumpurl", "https://www.bilibili.com/blackboard/activity-Ud7nkGPbaa.html");
                            Lazy lazy = he0.e.f120842a;
                            if (!TextUtils.isEmpty(str)) {
                                BLRouter.routeTo(RouteRequestKt.toRouteRequest(str), projectionSearchFragment);
                            }
                            break;
                    }
                }
            });
            Unit unit15 = Unit.INSTANCE;
        }
        TextView textView3 = this.f63631f;
        if (textView3 != null) {
            ProjectionOperationConfig.DeviceBannerConfig deviceBannerConfigPf = pf();
            if ((deviceBannerConfigPf == null || (thirdPartyDesc = deviceBannerConfigPf.getThirdPartyDesc()) == null || !(StringsKt.isBlank(thirdPartyDesc) ^ true)) ? false : true) {
                ProjectionOperationConfig.DeviceBannerConfig deviceBannerConfigPf2 = pf();
                string = deviceBannerConfigPf2 != null ? deviceBannerConfigPf2.getThirdPartyDesc() : null;
            } else {
                string = nf() == 4 ? getString(2131855204) : getString(2131855202);
            }
            textView3.setText(string);
            Unit unit16 = Unit.INSTANCE;
        }
        BiliImageView biliImageView8 = this.f63627d;
        if (biliImageView8 != null) {
            biliImageView8.setVisibility(0);
            Unit unit17 = Unit.INSTANCE;
        }
        BiliImageView biliImageView9 = this.f63627d;
        if (biliImageView9 != null) {
            final int i8 = 0;
            biliImageView9.setOnClickListener(new View.OnClickListener(this, i8) { // from class: com.bilibili.lib.projection.internal.search.x

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f63838a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f63839b;

                {
                    this.f63838a = i8;
                    this.f63839b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view9) {
                    switch (this.f63838a) {
                        case 0:
                            ((ProjectionSearchFragment) this.f63839b).tf(false);
                            break;
                        case 1:
                            com.bilibili.pegasus.card.h hVar = (com.bilibili.pegasus.card.h) this.f63839b;
                            CardClickProcessor cardClickProcessor = ((com.bilibili.pegasus.card.base.b) hVar).f;
                            if (cardClickProcessor != null) {
                                cardClickProcessor.i(hVar, hVar.o, false);
                            }
                            break;
                        default:
                            s8.e eVar3 = (s8.e) this.f63839b;
                            if (eVar3.b.i) {
                                eVar3.e.toggle();
                            }
                            break;
                    }
                }
            });
            Unit unit18 = Unit.INSTANCE;
        }
        RecyclerView recyclerView = this.f63638j;
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBiliTVRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setBackgroundResource(2131238592);
        Ae0.g gVar = new Ae0.g(this.f63596L);
        this.f63640k = gVar;
        gVar.f122750f = this;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(p3());
        RecyclerView recyclerView3 = this.f63638j;
        RecyclerView recyclerView4 = recyclerView3;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBiliTVRecyclerView");
            recyclerView4 = null;
        }
        recyclerView4.setLayoutManager(linearLayoutManager);
        DividerDecoration dVar = new d(this);
        dVar.setHorizontalLeftSpacing((int) mf(p3()));
        dVar.setHorizontalRightSpacing((int) mf(p3()));
        RecyclerView recyclerView5 = this.f63638j;
        RecyclerView recyclerView6 = recyclerView5;
        if (recyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBiliTVRecyclerView");
            recyclerView6 = null;
        }
        recyclerView6.addItemDecoration(dVar);
        RecyclerView recyclerView7 = this.f63638j;
        RecyclerView recyclerView8 = recyclerView7;
        if (recyclerView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBiliTVRecyclerView");
            recyclerView8 = null;
        }
        Ae0.g gVar2 = this.f63640k;
        Ae0.g gVar3 = gVar2;
        if (gVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBiliTVAdapter");
            gVar3 = null;
        }
        recyclerView8.setAdapter(gVar3);
        RecyclerView recyclerView9 = this.f63642l;
        RecyclerView recyclerView10 = recyclerView9;
        if (recyclerView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVehicleDeviceRv");
            recyclerView10 = null;
        }
        recyclerView10.setBackgroundResource(2131238592);
        Ae0.m mVar = new Ae0.m(this.f63596L);
        this.f63644m = mVar;
        mVar.f122750f = this;
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(p3());
        RecyclerView recyclerView11 = this.f63642l;
        RecyclerView recyclerView12 = recyclerView11;
        if (recyclerView11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVehicleDeviceRv");
            recyclerView12 = null;
        }
        recyclerView12.setLayoutManager(linearLayoutManager2);
        DividerDecoration fVar = new f(this);
        fVar.setHorizontalLeftSpacing((int) mf(p3()));
        fVar.setHorizontalRightSpacing((int) mf(p3()));
        RecyclerView recyclerView13 = this.f63642l;
        RecyclerView recyclerView14 = recyclerView13;
        if (recyclerView13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVehicleDeviceRv");
            recyclerView14 = null;
        }
        recyclerView14.addItemDecoration(fVar);
        RecyclerView recyclerView15 = this.f63642l;
        RecyclerView recyclerView16 = recyclerView15;
        if (recyclerView15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVehicleDeviceRv");
            recyclerView16 = null;
        }
        Ae0.m mVar2 = this.f63644m;
        Ae0.m mVar3 = mVar2;
        if (mVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVehicleDeviceAdapter");
            mVar3 = null;
        }
        recyclerView16.setAdapter(mVar3);
        Ae0.k kVar = new Ae0.k(this.f63596L);
        this.f63647o = kVar;
        kVar.f122750f = this;
        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(p3());
        RecyclerView recyclerView17 = this.f63645n;
        RecyclerView recyclerView18 = recyclerView17;
        if (recyclerView17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mThirdPartyRecyclerView");
            recyclerView18 = null;
        }
        recyclerView18.setLayoutManager(linearLayoutManager3);
        DividerDecoration eVar3 = new e(this);
        eVar3.setHorizontalLeftSpacing((int) mf(p3()));
        RecyclerView recyclerView19 = this.f63645n;
        RecyclerView recyclerView20 = recyclerView19;
        if (recyclerView19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mThirdPartyRecyclerView");
            recyclerView20 = null;
        }
        recyclerView20.addItemDecoration(eVar3);
        RecyclerView recyclerView21 = this.f63645n;
        RecyclerView recyclerView22 = recyclerView21;
        if (recyclerView21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mThirdPartyRecyclerView");
            recyclerView22 = null;
        }
        Ae0.k kVar2 = this.f63647o;
        Ae0.k kVar3 = kVar2;
        if (kVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mThirdPartyAdapter");
            kVar3 = null;
        }
        recyclerView22.setAdapter(kVar3);
        this.f63610S = System.currentTimeMillis();
        TextView textView4 = this.f63652q;
        if (textView4 != null) {
            textView4.setOnClickListener(new WI0.P(this, 1));
            Unit unit19 = Unit.INSTANCE;
        }
        TextView textView5 = this.f63576B;
        if (textView5 != null) {
            textView5.setOnClickListener(new Bt0.k(this, 2));
            Unit unit20 = Unit.INSTANCE;
        }
        TextView textView6 = this.f63659t;
        if (textView6 != null) {
            final int i9 = 0;
            textView6.setOnClickListener(new View.OnClickListener(this, i9) { // from class: com.bilibili.lib.projection.internal.search.t

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f63811a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f63812b;

                {
                    this.f63811a = i9;
                    this.f63812b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view9) {
                    switch (this.f63811a) {
                        case 0:
                            ProjectionSearchFragment projectionSearchFragment = (ProjectionSearchFragment) this.f63812b;
                            if (!StringsKt.isBlank("https://www.bilibili.com/blackboard/redpack/activity-6Z2rq0AZcY.html")) {
                                BLRouter.routeTo(RouteRequestKt.toRouteRequest(Uri.parse("https://www.bilibili.com/blackboard/redpack/activity-6Z2rq0AZcY.html").buildUpon().appendQueryParameter("wbType", "common").build()), projectionSearchFragment);
                            }
                            com.bilibili.lib.projection.internal.reporter.a aVar = C7564c.f121634k;
                            projectionSearchFragment.nf();
                            aVar.G(projectionSearchFragment.f63582E);
                            break;
                        case 1:
                            T t7 = (T) this.f63812b;
                            RadioButton radioButton = t7.h;
                            if (radioButton != null) {
                                radioButton.setChecked(false);
                            }
                            RadioButton radioButton2 = t7.g;
                            if (radioButton2 != null) {
                                radioButton2.setChecked(true);
                            }
                            C7088h0 c7088h0 = (C7088h0) ((com.mall.ui.page.create3.module.r) t7).c;
                            if (c7088h0 != null) {
                                c7088h0.f118124c = 1;
                            }
                            break;
                        default:
                            ((eR0.f) this.f63812b).t0();
                            break;
                    }
                }
            });
            Unit unit21 = Unit.INSTANCE;
        }
        TextView textView7 = this.f63663v;
        if (textView7 != null) {
            final int i10 = 0;
            textView7.setOnClickListener(new View.OnClickListener(this, i10) { // from class: com.bilibili.lib.projection.internal.search.u

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f63813a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f63814b;

                {
                    this.f63813a = i10;
                    this.f63814b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view9) {
                    switch (this.f63813a) {
                        case 0:
                            ProjectionSearchFragment projectionSearchFragment = (ProjectionSearchFragment) this.f63814b;
                            if (!StringsKt.isBlank("https://www.bilibili.com/blackboard/redpack/activity-6Z2rq0AZcY.html")) {
                                BLRouter.routeTo(RouteRequestKt.toRouteRequest(Uri.parse("https://www.bilibili.com/blackboard/redpack/activity-6Z2rq0AZcY.html").buildUpon().appendQueryParameter("wbType", "common").build()), projectionSearchFragment);
                            }
                            com.bilibili.lib.projection.internal.reporter.a aVar = C7564c.f121634k;
                            projectionSearchFragment.nf();
                            aVar.G(projectionSearchFragment.f63582E);
                            break;
                        case 1:
                            T t7 = (T) this.f63814b;
                            RadioButton radioButton = t7.h;
                            if (radioButton != null) {
                                radioButton.setChecked(true);
                            }
                            RadioButton radioButton2 = t7.g;
                            if (radioButton2 != null) {
                                radioButton2.setChecked(false);
                            }
                            C7088h0 c7088h0 = (C7088h0) ((com.mall.ui.page.create3.module.r) t7).c;
                            if (c7088h0 != null) {
                                c7088h0.f118124c = 0;
                            }
                            break;
                        default:
                            ((eR0.f) this.f63814b).a.Af();
                            HashMap map = new HashMap();
                            map.put("url", com.mall.logic.support.router.y.c("cart"));
                            KQ0.e.f(2131830293, map, 2131830296);
                            break;
                    }
                }
            });
            Unit unit22 = Unit.INSTANCE;
        }
        TextView textView8 = this.f63670y;
        if (textView8 != null) {
            final int i11 = 0;
            textView8.setOnClickListener(new View.OnClickListener(this, i11) { // from class: com.bilibili.lib.projection.internal.search.v

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f63815a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f63816b;

                {
                    this.f63815a = i11;
                    this.f63816b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view9) {
                    FragmentManager fragmentManager;
                    switch (this.f63815a) {
                        case 0:
                            ProjectionSearchFragment projectionSearchFragment = (ProjectionSearchFragment) this.f63816b;
                            if (!StringsKt.isBlank("https://www.bilibili.com/blackboard/redpack/activity-6Z2rq0AZcY.html")) {
                                BLRouter.routeTo(RouteRequestKt.toRouteRequest(Uri.parse("https://www.bilibili.com/blackboard/redpack/activity-6Z2rq0AZcY.html").buildUpon().appendQueryParameter("wbType", "common").build()), projectionSearchFragment);
                            }
                            com.bilibili.lib.projection.internal.reporter.a aVar = C7564c.f121634k;
                            projectionSearchFragment.nf();
                            aVar.G(projectionSearchFragment.f63582E);
                            break;
                        default:
                            eR0.f fVar2 = (eR0.f) this.f63816b;
                            WarehouseBean warehouseBean = fVar2.h;
                            String ruleContent = warehouseBean != null ? warehouseBean.getRuleContent() : null;
                            if (ruleContent != null && (fragmentManager = fVar2.a.getFragmentManager()) != null) {
                                int i12 = MallRuleDialogFragment.h;
                                Serializable mallCartDialogRuleContentDto = new MallCartDialogRuleContentDto(ruleContent);
                                MallRuleDialogFragment mallRuleDialogFragment = new MallRuleDialogFragment();
                                Bundle bundle = new Bundle();
                                bundle.putSerializable("bundle_key_MallRuleDialogFragment", mallCartDialogRuleContentDto);
                                mallRuleDialogFragment.setArguments(bundle);
                                mallRuleDialogFragment.show(fragmentManager, "MallRuleDialogFragment");
                            }
                            fVar2.v0();
                            break;
                    }
                }
            });
            Unit unit23 = Unit.INSTANCE;
        }
        TextView textView9 = this.f63661u;
        if (textView9 != null) {
            textView9.setOnClickListener(new GR.b(this, 1));
            Unit unit24 = Unit.INSTANCE;
        }
        TextView textView10 = this.f63666w;
        if (textView10 != null) {
            textView10.setOnClickListener(new WI0.C(this, 1));
            Unit unit25 = Unit.INSTANCE;
        }
        TextView textView11 = this.f63671z;
        if (textView11 != null) {
            textView11.setOnClickListener(new com.bilibili.bplus.im.communication.q(this, 1));
            Unit unit26 = Unit.INSTANCE;
        }
        ConnectivityMonitor.getInstance().register(this.f63656r1);
        vf();
        InterfaceC8086b interfaceC8086b = C7564c.f121636m;
        ((ProjectionHttpService) ServiceGenerator.createService(ProjectionHttpService.class)).guidInfo(String.valueOf(BiliConfig.getBiliVersionCode()), String.valueOf(interfaceC8086b.a()), interfaceC8086b.isConnected(), interfaceC8086b.h(), interfaceC8086b.d(), interfaceC8086b.b()).enqueue(this.f63643l1);
        this.f63632f1 = view.findViewById(2131310523);
        this.f63634g1 = (ConstraintLayout) view.findViewById(2131310521);
        this.f63635h1 = (LinearLayout) view.findViewById(2131310520);
        this.f63637i1 = (LinearLayout) view.findViewById(2131320882);
        if (!(this.f63616X != null)) {
            ConstraintLayout constraintLayout = this.f63634g1;
            ConstraintLayout constraintLayout2 = constraintLayout;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootNewUi");
                constraintLayout2 = null;
            }
            CommonDialogUtilsKt.setVisibility(constraintLayout2, false);
            View view9 = this.f63632f1;
            View view10 = view9;
            if (view9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootOldUi");
                view10 = null;
            }
            CommonDialogUtilsKt.setVisibility(view10, true);
            LinearLayout linearLayout2 = this.f63635h1;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootNewUiContent");
                linearLayout2 = null;
            }
            linearLayout2.removeAllViews();
            Unit unit27 = Unit.INSTANCE;
            return;
        }
        View view11 = this.f63632f1;
        View view12 = view11;
        if (view11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootOldUi");
            view12 = null;
        }
        CommonDialogUtilsKt.setVisibility(view12, false);
        ConstraintLayout constraintLayout3 = this.f63634g1;
        ConstraintLayout constraintLayout4 = constraintLayout3;
        if (constraintLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootNewUi");
            constraintLayout4 = null;
        }
        CommonDialogUtilsKt.setVisibility(constraintLayout4, true);
        TextView textView12 = this.f63652q;
        if (textView12 != null) {
            textView12.setVisibility(8);
            Unit unit28 = Unit.INSTANCE;
        }
        ViewGroup viewGroup = this.f63578C;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            Unit unit29 = Unit.INSTANCE;
        }
        LinearLayout linearLayout3 = this.f63635h1;
        LinearLayout linearLayout4 = linearLayout3;
        if (linearLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootNewUiContent");
            linearLayout4 = null;
        }
        linearLayout4.removeAllViews();
        int i12 = BiliOfficialProjectionWidgetV2.f63820r;
        BiliOfficialProjectionWidgetV2 biliOfficialProjectionWidgetV2A = BiliOfficialProjectionWidgetV2.a.a(getContext(), BiliOfficialProjectionWidgetV2.WidgetV2Type.Bili, this.f63596L, nf() == 4, this.f63628d1);
        this.f63622a0 = biliOfficialProjectionWidgetV2A;
        if (biliOfficialProjectionWidgetV2A != null) {
            biliOfficialProjectionWidgetV2A.setIV2ExposeAction(this.f63630e1);
            Unit unit30 = Unit.INSTANCE;
        }
        this.f63625c0 = BiliOfficialProjectionWidgetV2.a.a(getContext(), BiliOfficialProjectionWidgetV2.WidgetV2Type.Vehicle, this.f63596L, nf() == 4, this.f63628d1);
        BiliOfficialProjectionWidgetV2 biliOfficialProjectionWidgetV2A2 = BiliOfficialProjectionWidgetV2.a.a(getContext(), BiliOfficialProjectionWidgetV2.WidgetV2Type.ThirdParty, this.f63596L, nf() == 4, this.f63628d1);
        this.f63650p0 = biliOfficialProjectionWidgetV2A2;
        if (biliOfficialProjectionWidgetV2A2 != null) {
            biliOfficialProjectionWidgetV2A2.setNewMarginTop(20.0f);
            Unit unit31 = Unit.INSTANCE;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        LinearLayout linearLayout5 = this.f63635h1;
        LinearLayout linearLayout6 = linearLayout5;
        if (linearLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootNewUiContent");
            linearLayout6 = null;
        }
        View viewInflate = layoutInflaterFrom.inflate(2131499763, (ViewGroup) linearLayout6, false);
        this.f63623a1 = viewInflate;
        if (viewInflate != null) {
            viewInflate.setVisibility(0);
        }
        BiliOfficialProjectionWidgetV2 biliOfficialProjectionWidgetV2 = this.f63622a0;
        if (biliOfficialProjectionWidgetV2 != null) {
            biliOfficialProjectionWidgetV2.setNewMarginTop(18.0f);
        }
        this.f63624b1 = new Runnable(this) { // from class: com.bilibili.lib.projection.internal.search.z

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ProjectionSearchFragment f63842a;

            {
                this.f63842a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ProjectionSearchFragment projectionSearchFragment = this.f63842a;
                View view13 = projectionSearchFragment.f63623a1;
                if (view13 != null) {
                    view13.setVisibility(8);
                }
                BiliOfficialProjectionWidgetV2 biliOfficialProjectionWidgetV22 = projectionSearchFragment.f63622a0;
                if (biliOfficialProjectionWidgetV22 != null) {
                    biliOfficialProjectionWidgetV22.setNewMarginTop(20.0f);
                }
            }
        };
        uf();
        LinearLayout linearLayout7 = this.f63635h1;
        LinearLayout linearLayout8 = linearLayout7;
        if (linearLayout7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootNewUiContent");
            linearLayout8 = null;
        }
        linearLayout8.addView(this.f63623a1);
        LinearLayout linearLayout9 = this.f63635h1;
        LinearLayout linearLayout10 = linearLayout9;
        if (linearLayout9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootNewUiContent");
            linearLayout10 = null;
        }
        linearLayout10.addView(this.f63625c0);
        LinearLayout linearLayout11 = this.f63635h1;
        LinearLayout linearLayout12 = linearLayout11;
        if (linearLayout11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootNewUiContent");
            linearLayout12 = null;
        }
        linearLayout12.addView(this.f63622a0);
        LinearLayout linearLayout13 = this.f63635h1;
        LinearLayout linearLayout14 = linearLayout13;
        if (linearLayout13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootNewUiContent");
            linearLayout14 = null;
        }
        linearLayout14.addView(this.f63650p0);
        ListUiBean listUiBean = this.f63616X;
        TextUrlBean help = null;
        if (listUiBean != null) {
            YstUiBean ystUi = listUiBean.getYstUi();
            help = null;
            if (ystUi != null) {
                help = ystUi.getHelp();
            }
        }
        if (help != null) {
            this.f63641k1.add(C7564c.f121640q.v().observeOn(AndroidSchedulers.mainThread()).subscribe(new D(this, listUiBean)));
        }
        BiliOfficialProjectionWidgetV2 biliOfficialProjectionWidgetV22 = this.f63625c0;
        if (biliOfficialProjectionWidgetV22 != null) {
            biliOfficialProjectionWidgetV22.setUiBean(this.f63616X);
            Unit unit32 = Unit.INSTANCE;
        }
        BiliOfficialProjectionWidgetV2 biliOfficialProjectionWidgetV23 = this.f63622a0;
        if (biliOfficialProjectionWidgetV23 != null) {
            biliOfficialProjectionWidgetV23.setUiBean(this.f63616X);
            Unit unit33 = Unit.INSTANCE;
        }
        BiliOfficialProjectionWidgetV2 biliOfficialProjectionWidgetV24 = this.f63650p0;
        if (biliOfficialProjectionWidgetV24 != null) {
            biliOfficialProjectionWidgetV24.setUiBean(this.f63616X);
            Unit unit34 = Unit.INSTANCE;
        }
    }

    public final void jf(boolean z6) {
        View view = this.y1;
        if (view == null) {
            return;
        }
        if (!z6) {
            view.setBackgroundColor(ContextCompat.getColor(FoundationAlias.getFapp(), R$color.f64616Wh0));
            view.setClipToOutline(false);
            return;
        }
        float fA = C7432a.a(FoundationAlias.getFapp(), 12.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ContextCompat.getColor(FoundationAlias.getFapp(), R$color.f64616Wh0));
        gradientDrawable.setCornerRadii(new float[]{fA, fA, fA, fA, 0.0f, 0.0f, 0.0f, 0.0f});
        view.setBackground(gradientDrawable);
        view.setClipToOutline(true);
    }

    public final void kf() {
        Set<String> set;
        if (this.f63580D && isAdded()) {
            Ae0.g gVar = this.f63640k;
            Ae0.g gVar2 = gVar;
            if (gVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBiliTVAdapter");
                gVar2 = null;
            }
            if (gVar2.T()) {
                Ae0.k kVar = this.f63647o;
                Ae0.k kVar2 = kVar;
                if (kVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mThirdPartyAdapter");
                    kVar2 = null;
                }
                if (kVar2.T()) {
                    Ae0.m mVar = this.f63644m;
                    Ae0.m mVar2 = mVar;
                    if (mVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mVehicleDeviceAdapter");
                        mVar2 = null;
                    }
                    if (mVar2.T()) {
                        if (!ConnectivityMonitor.getInstance().isWifiActive()) {
                            this.f63649p.a(com.bilibili.lib.projection.internal.widget.PageState.NO_WIFI, false);
                            if (this.f63582E != 1) {
                                this.f63582E = 1;
                                com.bilibili.lib.projection.internal.reporter.a aVar = C7564c.f121634k;
                                nf();
                                aVar.J(this.f63582E);
                            }
                            com.bilibili.lib.projection.internal.reporter.a aVar2 = C7564c.f121634k;
                            aVar2.getClass();
                            final int i7 = 1;
                            he0.j.e("main.public-community.screencast-floats.recommendation.show", null, null, aVar2.f63524a, new Function1(i7) { // from class: ze0.O

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final int f130246a;

                                {
                                    this.f130246a = i7;
                                }

                                public final Object invoke(Object obj) {
                                    ((Map) obj).put("scene", String.valueOf(this.f130246a));
                                    return Unit.INSTANCE;
                                }
                            }, 4);
                            return;
                        }
                        com.bilibili.lib.projection.internal.engine.r rVarR = C7564c.f121640q.r(5);
                        NirvanaEngine nirvanaEngine = null;
                        if (rVarR instanceof NirvanaEngine) {
                            nirvanaEngine = (NirvanaEngine) rVarR;
                        }
                        if (((nirvanaEngine == null || (set = nirvanaEngine.f63236n.get(1)) == null) ? 0 : set.size()) != 0) {
                            this.f63649p.a(com.bilibili.lib.projection.internal.widget.PageState.OTHER_SEARCH, false);
                            String strC = Ie0.j.c();
                            if (strC == null || strC.length() == 0) {
                                TextView textView = this.f63574A;
                                if (textView != null) {
                                    textView.setVisibility(8);
                                }
                            } else {
                                TextView textView2 = this.f63574A;
                                if (textView2 != null) {
                                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                    U.a(new Object[]{strC}, 1, getResources().getString(2131855203), textView2);
                                }
                                TextView textView3 = this.f63574A;
                                if (textView3 != null) {
                                    textView3.setVisibility(0);
                                }
                            }
                            if (this.f63582E != 3) {
                                this.f63582E = 3;
                                com.bilibili.lib.projection.internal.reporter.a aVar3 = C7564c.f121634k;
                                nf();
                                aVar3.J(this.f63582E);
                                return;
                            }
                            return;
                        }
                        this.f63649p.a(com.bilibili.lib.projection.internal.widget.PageState.NO_DEVICE, false);
                        String strC2 = Ie0.j.c();
                        if (strC2 == null || strC2.length() == 0) {
                            TextView textView4 = this.f63668x;
                            if (textView4 != null) {
                                textView4.setVisibility(8);
                            }
                        } else {
                            TextView textView5 = this.f63668x;
                            if (textView5 != null) {
                                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                U.a(new Object[]{strC2}, 1, getResources().getString(2131855203), textView5);
                            }
                            TextView textView6 = this.f63668x;
                            if (textView6 != null) {
                                textView6.setVisibility(0);
                            }
                        }
                        if (this.f63582E != 2) {
                            this.f63582E = 2;
                            com.bilibili.lib.projection.internal.reporter.a aVar4 = C7564c.f121634k;
                            nf();
                            aVar4.J(this.f63582E);
                        }
                        com.bilibili.lib.projection.internal.reporter.a aVar5 = C7564c.f121634k;
                        aVar5.getClass();
                        final int i8 = 2;
                        he0.j.e("main.public-community.screencast-floats.recommendation.show", null, null, aVar5.f63524a, new Function1(i8) { // from class: ze0.O

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final int f130246a;

                            {
                                this.f130246a = i8;
                            }

                            public final Object invoke(Object obj) {
                                ((Map) obj).put("scene", String.valueOf(this.f130246a));
                                return Unit.INSTANCE;
                            }
                        }, 4);
                        return;
                    }
                }
            }
            this.f63649p.a(com.bilibili.lib.projection.internal.widget.PageState.NORMAL, false);
            ViewGroup viewGroup = this.f63654r;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            this.f63582E = 0;
        }
    }

    public final void lf(BiliImageView biliImageView) {
        String str = (String) ConfigManager.Companion.config().get("videodetail.projection_nodevice_banner_imageurl", "");
        if (!TextUtils.isEmpty(str)) {
            BiliImageLoader.INSTANCE.with(this).url(str).into(biliImageView);
        }
        biliImageView.measure(-1, -2);
        float screenWidth = ScreenUtil.getScreenWidth(getContext()) - C7432a.a(getContext(), 32.0f);
        ViewGroup.LayoutParams layoutParams = biliImageView.getLayoutParams();
        layoutParams.width = (int) screenWidth;
        layoutParams.height = (int) (0.20408164f * screenWidth);
        biliImageView.setLayoutParams(layoutParams);
    }

    public final int nf() {
        IProjectionItem iProjectionItemN;
        InterfaceC7845m interfaceC7845mH = C7564c.f121625a.h(this.f63596L);
        return (interfaceC7845mH == null || (iProjectionItemN = interfaceC7845mH.n(false)) == null) ? 1 : iProjectionItemN.getClientType();
    }

    public final ProjectionOperationConfig of() {
        Lazy lazy = he0.e.f120842a;
        InterfaceC7845m interfaceC7845m = this.f63598M;
        String strValueOf = String.valueOf(he0.e.f(interfaceC7845m != null ? interfaceC7845m.getConfig() : null));
        ProjectionOperationConfig projectionOperationConfigB = he0.e.b(strValueOf);
        defpackage.a.b("internalData key id -> ", strValueOf, "ProjectionSearchFragment");
        return projectionOperationConfigB;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NotNull DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        if (this.f63575A1 == null) {
            this.f63575A1 = "gesture";
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        Window window;
        WindowManager.LayoutParams attributes;
        int displayHeight;
        int i7;
        final Context applicationContext;
        super.onConfigurationChanged(configuration);
        if (this.f63604P && !this.f63608R && configuration.smallestScreenWidthDp >= 600) {
            Context context = getContext();
            if (context == null || (applicationContext = context.getApplicationContext()) == null) {
                return;
            }
            final int i8 = this.f63596L;
            final boolean z6 = this.f63665v1;
            dismissAllowingStateLoss();
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable(applicationContext, i8, z6) { // from class: com.bilibili.lib.projection.internal.search.r

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f63744a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Context f63745b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f63746c;

                {
                    this.f63744a = i8;
                    this.f63745b = applicationContext;
                    this.f63746c = z6;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i9 = this.f63744a;
                    Context context2 = this.f63745b;
                    boolean z7 = this.f63746c;
                    InterfaceC7845m interfaceC7845mH = C7564c.f121625a.h(i9);
                    if (interfaceC7845mH != null) {
                        InterfaceC7845m.h(interfaceC7845mH, context2, z7, false, false, 8);
                    }
                }
            }, 1000L);
            return;
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return;
        }
        boolean z7 = true;
        if (configuration.smallestScreenWidthDp >= 600) {
            attributes.width = (int) C7432a.a(FoundationAlias.getFapp(), 482.0f);
            attributes.height = (int) C7432a.a(FoundationAlias.getFapp(), 494.0f);
            attributes.gravity = 81;
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
        } else {
            attributes.gravity = 80;
            int i9 = -1;
            attributes.width = -1;
            if (!this.f63604P) {
                if (this.f63606Q) {
                    displayHeight = this.f63602O;
                    i7 = this.f63600N;
                } else {
                    displayHeight = WindowManagerHelper.getDisplayHeight(FoundationAlias.getFapp());
                    i7 = this.f63600N;
                }
                i9 = displayHeight - i7;
            }
            attributes.height = i9;
        }
        window.setAttributes(attributes);
        if (configuration.smallestScreenWidthDp < 600) {
            z7 = false;
        }
        jf(z7);
    }

    @Override // com.bilibili.lib.projection.internal.base.BaseProjectionDialogFragment, androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f63658s1 = SystemClock.uptimeMillis();
        C5323b.f63716a.b(this);
        Bundle arguments = getArguments();
        this.f63596L = arguments != null ? arguments.getInt("key_client_id") : 0;
        this.f63665v1 = arguments != null ? arguments.getBoolean("key_switch") : false;
        this.f63598M = C7564c.f121625a.h(this.f63596L);
        this.f63600N = arguments != null ? arguments.getInt("key_top") : 0;
        this.f63602O = arguments != null ? arguments.getInt("key_display_height") : WindowManagerHelper.getDisplayHeight(FoundationAlias.getFapp());
        this.f63604P = arguments != null ? arguments.getBoolean("key_from_full") : false;
        this.f63606Q = arguments != null ? arguments.getBoolean("key_story_style") : false;
        boolean z6 = false;
        if (arguments != null) {
            z6 = arguments.getBoolean("key_from_projection_full_screen");
        }
        this.f63608R = z6;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int i7;
        int i8;
        com.bilibili.lib.projection.internal.device.a aVarS;
        IProjectionPlayableItem currentItem;
        synchronized (C5323b.f63716a) {
            C5323b.f63717b.remove(this);
        }
        Lazy lazy = he0.e.f120842a;
        i iVar = this.m1;
        Collections.SafeIteratorList<e.a> safeIteratorList = he0.e.f120845d;
        if (safeIteratorList.contains(iVar)) {
            safeIteratorList.remove(iVar);
        }
        p.f63742b = null;
        HandlerThreads.remove(0, this.f63653q1);
        HandlerThreads.remove(0, this.f63593J1);
        HandlerThreads.remove(0, this.f63619Y0);
        HandlerThreads.remove(0, this.f63621Z0);
        HandlerThreads.remove(0, this.f63624b1);
        for (com.bilibili.lib.projection.internal.engine.r rVar : ((LinkedHashMap) C7564c.f121640q.f63100a).values()) {
            if (rVar instanceof ve0.e) {
                ve0.e eVar = (ve0.e) rVar;
                eVar.f128187f = true;
                eVar.f128184c.clear();
                eVar.f128182a.onNext(CollectionsKt.emptyList());
                HandlerThreads.remove(0, eVar.f128188g);
            }
        }
        Iterator it = ((List) this.f63651p1.getValue()).iterator();
        while (it.hasNext()) {
            HandlerThreads.remove(2, (c) it.next());
        }
        ConnectivityMonitor.getInstance().unregister(this.f63656r1);
        HashMap map = new HashMap();
        List<? extends InterfaceC7274d> list = this.f63603O1;
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            int i9 = 0;
            int i10 = 0;
            while (true) {
                i7 = i9;
                i8 = i10;
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC7274d interfaceC7274d = (InterfaceC7274d) it2.next();
                if (interfaceC7274d instanceof InterfaceC7969a) {
                    i9++;
                } else if (interfaceC7274d instanceof InterfaceC8719b) {
                    i10++;
                }
            }
        } else {
            i7 = 0;
            i8 = 0;
        }
        P4.b.a(i7, map, "cloud", i8, "dlna");
        map.put("mirror", String.valueOf(0));
        map.put("switch", this.f63665v1 ? "1" : "2");
        map.put("restart", this.f63667w1 ? "1" : "0");
        map.put("blink_start", this.f63669x1 ? "1" : "0");
        map.put("blink_count", String.valueOf(this.f63615W));
        map.put("time", String.valueOf(SystemClock.uptimeMillis() - this.f63658s1));
        com.bilibili.lib.projection.internal.reporter.a aVar = C7564c.f121634k;
        InterfaceC7845m interfaceC7845m = this.f63598M;
        aVar.getClass();
        he0.j jVar = he0.j.f120871a;
        he0.j.i("projection.device.find", null, false, null, interfaceC7845m, new C1474m(map, 4), 12);
        this.f63669x1 = false;
        this.f63595K1.clear();
        final int iCoerceAtLeast = RangesKt.coerceAtLeast((int) ((System.currentTimeMillis() - this.f63664v0) / ((long) 1000)), 0);
        InterfaceC7845m interfaceC7845m2 = this.f63598M;
        IProjectionItem rawItem = (interfaceC7845m2 == null || (aVarS = interfaceC7845m2.s()) == null || (currentItem = aVarS.getCurrentItem()) == null) ? null : currentItem.getRawItem();
        jVar.d("main.public.screencast-device-panel-back.all.show", null, rawItem instanceof StandardProjectionItem ? (StandardProjectionItem) rawItem : null, this.f63598M, new Function1(iCoerceAtLeast) { // from class: com.bilibili.lib.projection.internal.search.searchv2.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f63796a;

            {
                this.f63796a = iCoerceAtLeast;
            }

            public final Object invoke(Object obj) {
                ((Map) obj).put("stay_duration", String.valueOf(this.f63796a));
                return Unit.INSTANCE;
            }
        });
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r0v57, types: [com.bilibili.lib.projection.internal.search.J, com.bilibili.lib.ui.BaseAppCompatActivity] */
    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        ProjectionClient.ClientCallback callback;
        IProjectionItem iProjectionItemN;
        FragmentActivity fragmentActivityP3;
        com.bilibili.lib.projection.internal.widget.t tVar = this.f63649p.f64144u;
        if (tVar != null) {
            HandlerThreads.getHandler(0).removeCallbacks(tVar);
        }
        HandlerThreads.remove(0, this.f63593J1);
        HandlerThreads.remove(0, this.f63624b1);
        View view = this.f63623a1;
        if (view != null) {
            view.setVisibility(8);
        }
        HashMap map = new HashMap(4);
        map.put("stay_time", String.valueOf(System.currentTimeMillis() - this.f63610S));
        Neurons.reportClick(false, "player.throwing-screen-devicelist.page-back.0.click", map);
        this.f63641k1.dispose();
        if (this.f63604P) {
            ?? r02 = this.f63611S1;
            if (r02 != 0) {
                r02.k();
            } else if (!this.f63608R && (fragmentActivityP3 = p3()) != null) {
                fragmentActivityP3.finish();
            }
        }
        DefaultProjectionEngineManager defaultProjectionEngineManager = C7564c.f121640q;
        InterfaceC7845m interfaceC7845mH = ((C7564c) defaultProjectionEngineManager.getContext()).h(this.f63596L);
        int clientType = (interfaceC7845mH == null || (iProjectionItemN = interfaceC7845mH.n(false)) == null) ? 1 : iProjectionItemN.getClientType();
        Iterator it = ((LinkedHashMap) defaultProjectionEngineManager.f63100a).values().iterator();
        while (it.hasNext()) {
            ((com.bilibili.lib.projection.internal.engine.r) it.next()).m(clientType);
        }
        this.f63629e = false;
        InterfaceC7845m interfaceC7845m = this.f63598M;
        if (interfaceC7845m != null && (callback = interfaceC7845m.getCallback()) != null) {
            callback.onShowSearchFragment(false, this.f63613U);
        }
        String str = this.f63575A1;
        if (str != null) {
            CastEventTrackingManager.Companion.instance().trackClick("main.public.screencast-panel-exit.0.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("refresh_index", String.valueOf(this.f63672z1)), TuplesKt.to("exit_reason", str)}));
        }
        super.onDismiss(dialogInterface);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        final com.bilibili.lib.projection.internal.reporter.a reporter;
        com.bilibili.lib.projection.internal.device.a aVarS;
        IProjectionPlayableItem currentItem;
        ProjectionClient.ClientCallback callback;
        super.onResume();
        if (pf() == null) {
            Lazy lazy = he0.e.f120842a;
            i iVar = this.m1;
            Collections.SafeIteratorList<e.a> safeIteratorList = he0.e.f120845d;
            if (!safeIteratorList.contains(iVar)) {
                safeIteratorList.add(iVar);
            }
            BLog.i("ProjectionSearchFragment", "act data unready, add listener");
        } else {
            sf();
        }
        Vibrator vibrator = p.f63741a;
        p.f63742b = this.f63646n1;
        InterfaceC7845m interfaceC7845m = this.f63598M;
        if (interfaceC7845m != null && (callback = interfaceC7845m.getCallback()) != null) {
            callback.onShowSearchFragment(true, this.f63613U);
        }
        InterfaceC7845m interfaceC7845m2 = this.f63598M;
        if (interfaceC7845m2 != null && (reporter = interfaceC7845m2.getReporter()) != null) {
            nf();
            InterfaceC7845m interfaceC7845m3 = this.f63598M;
            IProjectionItem rawItem = (interfaceC7845m3 == null || (aVarS = interfaceC7845m3.s()) == null || (currentItem = aVarS.getCurrentItem()) == null) ? null : currentItem.getRawItem();
            boolean z6 = rawItem instanceof StandardProjectionItem;
            he0.j.e("main.public-community.screencast-floats.0.show", null, z6 ? (StandardProjectionItem) rawItem : null, reporter.f63524a, null, 16);
            final IProjectionItem iProjectionItem = rawItem;
            HandlerThreads.postDelayed(0, new Runnable(iProjectionItem, reporter) { // from class: ze0.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final IProjectionItem f130257a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final com.bilibili.lib.projection.internal.reporter.a f130258b;

                {
                    this.f130257a = iProjectionItem;
                    this.f130258b = reporter;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IProjectionItem iProjectionItem2 = this.f130257a;
                    he0.j.e("main.public.screencast-panel.0.show", null, iProjectionItem2 instanceof StandardProjectionItem ? (StandardProjectionItem) iProjectionItem2 : null, this.f130258b.f63524a, null, 16);
                }
            }, 5000L);
            StandardProjectionItem standardProjectionItem = null;
            if (z6) {
                standardProjectionItem = (StandardProjectionItem) rawItem;
            }
            he0.j.e("main.public.screencast-device-panel.all.show", null, standardProjectionItem, reporter.f63524a, null, 16);
        }
        Ie0.d.j(0);
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        WindowManager.LayoutParams layoutParams;
        WindowManager.LayoutParams attributes;
        Dialog dialog = getDialog();
        if (dialog == null) {
            return;
        }
        Window window = dialog.getWindow();
        if (!this.f63604P && !rf() && window != null) {
            window.setWindowAnimations(2131887292);
        }
        int i7 = this.f63602O;
        Integer numValueOf = null;
        if (window == null || (attributes = window.getAttributes()) == null) {
            layoutParams = null;
        } else {
            attributes.gravity = 80;
            int i8 = -1;
            attributes.width = -1;
            if (!this.f63604P) {
                i8 = i7 - this.f63600N;
            }
            attributes.height = i8;
            layoutParams = attributes;
            if (rf()) {
                attributes.width = (int) C7432a.a(FoundationAlias.getFapp(), 482.0f);
                attributes.height = (int) C7432a.a(FoundationAlias.getFapp(), 494.0f);
                attributes.gravity = 81;
                layoutParams = attributes;
                if (Build.VERSION.SDK_INT >= 28) {
                    attributes.layoutInDisplayCutoutMode = 1;
                    layoutParams = attributes;
                }
            }
        }
        int displayHeight = WindowManagerHelper.getDisplayHeight(FoundationAlias.getFapp());
        int i9 = this.f63602O;
        int i10 = this.f63600N;
        if (layoutParams != null) {
            numValueOf = Integer.valueOf(layoutParams.height);
        }
        StringBuilder sbB = Vn.A.b(i7, displayHeight, "on Start h: ", ", wmheight: ", ", displayHeight: ");
        C4690e.a(i9, i10, ", top: ", ", layoutParams Height: ", sbB);
        sbB.append(numValueOf);
        BLog.d("ProjectionSearchFragment", sbB.toString());
        if (window != null) {
            window.setAttributes(layoutParams);
        }
        super.onStart();
    }

    public final ProjectionOperationConfig.DeviceBannerConfig pf() {
        ProjectionOperationConfig projectionOperationConfigOf = of();
        return projectionOperationConfigOf != null ? projectionOperationConfigOf.getDeviceBanner() : null;
    }

    public final boolean qf() {
        return ((Boolean) this.f63579C1.getValue()).booleanValue();
    }

    public final boolean rf() {
        Resources resources;
        Configuration configuration;
        Context context = getContext();
        boolean z6 = false;
        if (((context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) ? 0 : configuration.smallestScreenWidthDp) >= 600) {
            z6 = true;
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Type inference failed for: r0v27, types: [Ge0.d, android.widget.FrameLayout, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void sf() {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.search.ProjectionSearchFragment.sf():void");
    }

    public final void tf(boolean z6) {
        String url;
        String url2;
        ProjectionOperationConfig.DeviceBannerConfig deviceBannerConfigPf = pf();
        StandardProjectionItem standardProjectionItem = null;
        if (deviceBannerConfigPf == null || (url2 = deviceBannerConfigPf.getUrl()) == null || !(!StringsKt.isBlank(url2)) || z6) {
            url = "https://www.bilibili.com/blackboard/activity-Ud7nkGPbaa.html";
        } else {
            ProjectionOperationConfig.DeviceBannerConfig deviceBannerConfigPf2 = pf();
            url = deviceBannerConfigPf2 != null ? deviceBannerConfigPf2.getUrl() : null;
        }
        com.bilibili.lib.projection.internal.reporter.a aVar = C7564c.f121634k;
        ProjectionOperationConfig.DeviceBannerConfig deviceBannerConfigPf3 = pf();
        String id = deviceBannerConfigPf3 != null ? deviceBannerConfigPf3.getId() : null;
        InterfaceC7845m interfaceC7845m = this.f63598M;
        IProjectionItem iProjectionItemN = interfaceC7845m != null ? interfaceC7845m.n(false) : null;
        if (iProjectionItemN instanceof StandardProjectionItem) {
            standardProjectionItem = (StandardProjectionItem) iProjectionItemN;
        }
        aVar.getClass();
        he0.j.f120871a.b("main.public-community.screencast-floats.banner.click", null, standardProjectionItem, aVar.f63524a, new T9.g(id, 4));
        if (url == null || StringsKt.isBlank(url)) {
            return;
        }
        BLRouter.routeTo(RouteRequestKt.toRouteRequest(Uri.parse(url).buildUpon().appendQueryParameter("wbType", "common").build()), this);
    }

    public final void uf() {
        View view = this.f63623a1;
        if (view != null) {
            view.setVisibility(0);
        }
        HandlerThreads.remove(0, this.f63624b1);
        HandlerThreads.postDelayed(0, this.f63624b1, PayTask.f60018j);
    }

    public final void vf() {
        this.f63641k1.clear();
        CompositeDisposable compositeDisposable = this.f63641k1;
        DefaultProjectionEngineManager defaultProjectionEngineManager = C7564c.f121640q;
        compositeDisposable.add(defaultProjectionEngineManager.v().subscribe(new E(this)));
        com.bilibili.lib.projection.internal.engine.r rVarR = defaultProjectionEngineManager.r(5);
        NirvanaEngine nirvanaEngine = rVarR instanceof NirvanaEngine ? (NirvanaEngine) rVarR : null;
        if (nirvanaEngine != null) {
            this.f63641k1.add(nirvanaEngine.f63235m.observeOn(AndroidSchedulers.mainThread()).subscribe(new F(this, 0)));
        }
        Iterator it = ((List) this.f63651p1.getValue()).iterator();
        while (it.hasNext()) {
            HandlerThreads.remove(2, (c) it.next());
        }
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null && !fragmentActivityP3.isDestroyed() && !fragmentActivityP3.isFinishing()) {
            if (((Boolean) C7433b.f120834i.getValue()).booleanValue()) {
                this.f63669x1 = true;
            }
            BLog.e("ProjectionSearchFragment", "search fragment search device......");
            for (c cVar : (List) this.f63651p1.getValue()) {
                HandlerThreads.remove(2, cVar);
                cVar.getClass();
                HandlerThreads.post(2, cVar);
            }
        }
        HandlerThreads.remove(0, this.f63653q1);
        HandlerThreads.postDelayed(0, this.f63653q1, PayTask.f60018j);
        if (this.f63616X != null) {
            ((C7564c) C7564c.f121640q.getContext()).getClass();
            this.f63641k1.add(C7564c.f121641r.f126652a.subscribe(new G(this)));
        }
    }

    public final void wf(boolean z6) {
        float f7;
        String lightFold;
        if (this.f63629e) {
            return;
        }
        boolean zIsNight = GarbManager.getCurGarb().isNight();
        String lightExpand = null;
        if (z6) {
            if (zIsNight) {
                ProjectionOperationConfig.DeviceBannerConfig deviceBannerConfigPf = pf();
                lightFold = null;
                if (deviceBannerConfigPf != null) {
                    lightFold = deviceBannerConfigPf.getDarkFold();
                }
            } else {
                ProjectionOperationConfig.DeviceBannerConfig deviceBannerConfigPf2 = pf();
                lightFold = null;
                if (deviceBannerConfigPf2 != null) {
                    lightFold = deviceBannerConfigPf2.getLightFold();
                }
            }
            if (this.f63627d == null || lightFold == null || !(!StringsKt.isBlank(lightFold))) {
                BiliImageView biliImageView = this.f63627d;
                if (biliImageView != null) {
                    biliImageView.setImageResource(nf() == 4 ? 2131238642 : 2131238641);
                }
            } else {
                BiliImageLoader.INSTANCE.with(this).url(lightFold).into(this.f63627d);
            }
            f7 = 0.108f;
        } else {
            if (zIsNight) {
                ProjectionOperationConfig.DeviceBannerConfig deviceBannerConfigPf3 = pf();
                if (deviceBannerConfigPf3 != null) {
                    lightExpand = deviceBannerConfigPf3.getDarkExpand();
                }
            } else {
                ProjectionOperationConfig.DeviceBannerConfig deviceBannerConfigPf4 = pf();
                if (deviceBannerConfigPf4 != null) {
                    lightExpand = deviceBannerConfigPf4.getLightExpand();
                }
            }
            if (this.f63627d != null && lightExpand != null && (!StringsKt.isBlank(lightExpand))) {
                BiliImageLoader.INSTANCE.with(this).url(lightExpand).into(this.f63627d);
            }
            BiliImageView biliImageView2 = this.f63627d;
            if (biliImageView2 != null) {
                biliImageView2.setImageResource(nf() == 4 ? 2131238589 : 2131238588);
            }
            f7 = 0.157f;
        }
        BiliImageView biliImageView3 = this.f63627d;
        if (biliImageView3 != null) {
            int width = biliImageView3.getWidth();
            int measuredWidth = width;
            if (width == 0) {
                biliImageView3.measure(-1, -2);
                measuredWidth = biliImageView3.getMeasuredWidth();
            }
            if (measuredWidth <= 0 || this.f63629e) {
                return;
            }
            biliImageView3.getLayoutParams().height = (int) (((int) (ScreenUtil.getScreenWidth(getContext()) - C7432a.a(getContext(), 24.0f))) * f7);
            biliImageView3.requestLayout();
            this.f63629e = true;
        }
    }
}
