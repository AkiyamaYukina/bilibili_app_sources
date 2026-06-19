package com.bilibili.ship.theseus.ogv.endpage;

import L9.q;
import ZS0.i1;
import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.ad.core.click.K;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.community.follow.FollowSeasonStatus;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.IThumbnailSizeController;
import com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.playerbizcommon.view.RingProgressBar;
import com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode;
import com.bilibili.ship.theseus.ogv.C6153e;
import com.bilibili.ship.theseus.ogv.endpage.OgvPlayerEndPageFullScreenFunctionWidget;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6311e0;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6325l0;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateRepository;
import com.bilibili.ship.theseus.united.page.intro.module.relate.o0;
import com.bilibili.ship.theseus.united.page.intro.module.relate.p0;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tl0.C8669a;
import tv.danmaku.bili.widget.SpacesItemDecoration;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.business.ShutOffTimingService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.widget.AbsGroupWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/OgvPlayerEndPageFullScreenFunctionWidget.class */
@StabilityInferred(parameters = 0)
public final class OgvPlayerEndPageFullScreenFunctionWidget extends AbsGroupWidget implements View.OnClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public TextView f91930A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public RecyclerView f91931B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public TextView f91932C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public TextView f91933D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public LinearLayout f91934E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public ImageView f91935F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public View f91936G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public TextView f91937H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public View f91938I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @Nullable
    public BiliImageView f91939J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @Nullable
    public View f91940K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @Nullable
    public View f91941L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @Nullable
    public View f91942M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @Nullable
    public TextView f91943N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @Nullable
    public TextView f91944O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @NotNull
    public String f91945P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @NotNull
    public String f91946Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @Nullable
    public com.bilibili.app.gemini.player.widget.like.h f91947R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f91948S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f91949T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f91950U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public CoroutineScope f91951V;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Context f91952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final yk.c f91953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f91954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PageReportService f91955g;

    @NotNull
    public final C6153e h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final OgvSeason f91956i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final DetailRelateRepository f91957j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final OgvEpisode f91958k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.endpage.d f91959l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f91960m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.continuousplay.d f91961n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f91962o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.intro.community.a f91963p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.j f91964q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f91965r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final ShutOffTimingService f91966s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f91967t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.endpage.a f91968u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.endpage.c f91969v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final C8043a f91970w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f91971x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f91972y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public c f91973z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/OgvPlayerEndPageFullScreenFunctionWidget$a.class */
    public static final class a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OgvPlayerEndPageFullScreenFunctionWidget f91974a;

        public a(OgvPlayerEndPageFullScreenFunctionWidget ogvPlayerEndPageFullScreenFunctionWidget) {
            this.f91974a = ogvPlayerEndPageFullScreenFunctionWidget;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onPause(LifecycleOwner lifecycleOwner) {
            this.f91974a.i();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/OgvPlayerEndPageFullScreenFunctionWidget$b.class */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f91975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final o0 f91976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ExposureEntry f91977c;

        public b(final OgvPlayerEndPageFullScreenFunctionWidget ogvPlayerEndPageFullScreenFunctionWidget, @NotNull int i7, o0 o0Var) {
            this.f91975a = i7;
            this.f91976b = o0Var;
            this.f91977c = new ExposureEntry(com.bilibili.ship.theseus.united.report.a.f104837a, new Function0(this, ogvPlayerEndPageFullScreenFunctionWidget) { // from class: com.bilibili.ship.theseus.ogv.endpage.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final OgvPlayerEndPageFullScreenFunctionWidget.b f92082a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final OgvPlayerEndPageFullScreenFunctionWidget f92083b;

                {
                    this.f92082a = this;
                    this.f92083b = ogvPlayerEndPageFullScreenFunctionWidget;
                }

                public final Object invoke() {
                    OgvPlayerEndPageFullScreenFunctionWidget.b bVar = this.f92082a;
                    C6325l0 c6325l0 = bVar.f91976b.f101323i;
                    long j7 = c6325l0 != null ? c6325l0.f101279a : 0L;
                    Map<String, ? super String> mapCreateMapBuilder = MapsKt.createMapBuilder();
                    OgvPlayerEndPageFullScreenFunctionWidget ogvPlayerEndPageFullScreenFunctionWidget2 = this.f92083b;
                    ogvPlayerEndPageFullScreenFunctionWidget2.f91968u.a(mapCreateMapBuilder);
                    mapCreateMapBuilder.put("order_id", String.valueOf(bVar.f91975a + 1));
                    mapCreateMapBuilder.put("rec_seasonid", String.valueOf(j7));
                    PageReportService.i(ogvPlayerEndPageFullScreenFunctionWidget2.f91955g, "pgc.player.player-endpage.recommend.show", MapsKt.build(mapCreateMapBuilder), 4);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/OgvPlayerEndPageFullScreenFunctionWidget$c.class */
    public final class c extends RecyclerView.Adapter<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public List<b> f91978a = CollectionsKt.emptyList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final LayoutInflater f91979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public com.bilibili.ship.theseus.ogv.endpage.e f91980c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public q f91981d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public i1 f91982e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final OgvPlayerEndPageFullScreenFunctionWidget f91983f;

        public c(Context context, OgvPlayerEndPageFullScreenFunctionWidget ogvPlayerEndPageFullScreenFunctionWidget) {
            this.f91983f = ogvPlayerEndPageFullScreenFunctionWidget;
            this.f91979b = LayoutInflater.from(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f91978a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            d dVar = (d) viewHolder;
            OgvPlayerEndPageFullScreenFunctionWidget ogvPlayerEndPageFullScreenFunctionWidget = this.f91983f;
            int i8 = ogvPlayerEndPageFullScreenFunctionWidget.f91967t.getInt(PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
            b bVar = this.f91978a.get(i7);
            ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(dVar.itemView, bVar.f91977c);
            boolean z6 = i7 == 0 && ogvPlayerEndPageFullScreenFunctionWidget.f91971x && i8 != 1;
            o0 o0Var = bVar.f91976b;
            if (o0Var == null) {
                return;
            }
            TextView textView = dVar.f91984a;
            p0 p0Var = o0Var.f101318c;
            textView.setText(p0Var.f101344a);
            BiliImageLoader.INSTANCE.with(dVar.f91985b.getContext()).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("common-ogv", (IThumbnailSizeController) null, 2, (Object) null)).url(p0Var.f101346c).into(dVar.f91985b);
            C6325l0 c6325l0 = o0Var.f101323i;
            String str = null;
            if (c6325l0 != null) {
                C6311e0 c6311e0 = c6325l0.f101281c;
                str = null;
                if (c6311e0 != null) {
                    str = c6311e0.f101186g;
                }
            }
            if (str == null || str.length() == 0) {
                dVar.f91986c.setVisibility(4);
            } else {
                dVar.f91986c.setText(str);
                dVar.f91986c.setVisibility(0);
            }
            dVar.itemView.setOnClickListener(dVar);
            dVar.itemView.setTag(2131313233, o0Var);
            dVar.f91988e.setOnClickListener(dVar);
            dVar.itemView.setTag(2131313238, Integer.valueOf(dVar.getBindingAdapterPosition()));
            if (z6) {
                OgvPlayerEndPageFullScreenFunctionWidget ogvPlayerEndPageFullScreenFunctionWidget2 = dVar.f91994l;
                if (!ogvPlayerEndPageFullScreenFunctionWidget2.f91959l.f92079a && !ogvPlayerEndPageFullScreenFunctionWidget2.f91948S && ogvPlayerEndPageFullScreenFunctionWidget2.f91966s.getTotalTime() == 0) {
                    dVar.f91994l.f91959l.f92079a = true;
                    dVar.f91989f.setVisibility(0);
                    View view = dVar.h;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    dVar.f91987d.setVisibility(0);
                    dVar.f91988e.setVisibility(0);
                    dVar.f91990g.setVisibility(0);
                    i1 i1Var = dVar.f91993k;
                    if (i1Var != null) {
                        i1Var.invoke(Boolean.TRUE);
                    }
                    OgvPlayerEndPageFullScreenFunctionWidget ogvPlayerEndPageFullScreenFunctionWidget3 = dVar.f91994l;
                    Map<String, ? super String> mapCreateMapBuilder = MapsKt.createMapBuilder();
                    ogvPlayerEndPageFullScreenFunctionWidget3.f91968u.a(mapCreateMapBuilder);
                    Unit unit = Unit.INSTANCE;
                    Neurons.reportExposure$default(false, "pgc.pgc-video-detail.hookup-full-cancel.0.show", MapsKt.build(mapCreateMapBuilder), (List) null, 8, (Object) null);
                    dVar.f91987d.setSpeed(1.0f);
                    dVar.f91987d.setProgress(0.0f);
                    dVar.f91987d.setAnimation("bangumi_count_down.json");
                    dVar.f91987d.playAnimation();
                    dVar.f91987d.addAnimatorListener(new g(dVar, o0Var, dVar.f91994l));
                    return;
                }
            }
            dVar.f91989f.setVisibility(8);
            View view2 = dVar.h;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            dVar.f91988e.setVisibility(8);
            dVar.f91987d.setVisibility(8);
            dVar.f91990g.setVisibility(8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            d dVar = new d(this.f91983f, this.f91979b.inflate(2131500360, viewGroup, false));
            dVar.f91991i = this.f91980c;
            dVar.f91992j = this.f91981d;
            dVar.f91993k = this.f91982e;
            return dVar;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/OgvPlayerEndPageFullScreenFunctionWidget$d.class */
    public final class d extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TextView f91984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final BiliImageView f91985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final TextView f91986c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final LottieAnimationView f91987d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final TextView f91988e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final View f91989f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final ImageView f91990g;

        @Nullable
        public final View h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public com.bilibili.ship.theseus.ogv.endpage.e f91991i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public q f91992j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public i1 f91993k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final OgvPlayerEndPageFullScreenFunctionWidget f91994l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull OgvPlayerEndPageFullScreenFunctionWidget ogvPlayerEndPageFullScreenFunctionWidget, View view) {
            super(view);
            this.f91994l = ogvPlayerEndPageFullScreenFunctionWidget;
            this.f91984a = (TextView) view.findViewById(2131308958);
            this.f91985b = view.findViewById(2131298941);
            this.f91986c = (TextView) view.findViewById(2131312539);
            this.f91987d = (LottieAnimationView) view.findViewById(2131299510);
            this.f91988e = (TextView) view.findViewById(2131298274);
            this.f91989f = view.findViewById(2131299509);
            this.f91990g = (ImageView) view.findViewById(2131308931);
            this.h = view.findViewById(2131297137);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@NotNull View view) {
            if (2131298274 == view.getId()) {
                this.f91987d.cancelAnimation();
                OgvPlayerEndPageFullScreenFunctionWidget ogvPlayerEndPageFullScreenFunctionWidget = this.f91994l;
                Map<String, ? super String> mapCreateMapBuilder = MapsKt.createMapBuilder();
                ogvPlayerEndPageFullScreenFunctionWidget.f91968u.a(mapCreateMapBuilder);
                Unit unit = Unit.INSTANCE;
                Neurons.reportClick(false, "pgc.pgc-video-detail.hookup-full-cancel.0.click", MapsKt.build(mapCreateMapBuilder));
                return;
            }
            this.f91987d.cancelAnimation();
            o0 o0Var = (o0) this.itemView.getTag(2131313233);
            Integer num = (Integer) this.itemView.getTag(2131313238);
            num.getClass();
            com.bilibili.ship.theseus.ogv.endpage.e eVar = this.f91991i;
            if (eVar != null) {
                eVar.invoke(o0Var, num);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/OgvPlayerEndPageFullScreenFunctionWidget$e.class */
    public static final class e extends SpacesItemDecoration {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f91995f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i7, int i8) {
            super(i8);
            this.f91995f = i7;
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            if (recyclerView.getChildLayoutPosition(view) == 0) {
                rect.left = this.f91995f;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.endpage.OgvPlayerEndPageFullScreenFunctionWidget$onClick$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/OgvPlayerEndPageFullScreenFunctionWidget$onClick$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvPlayerEndPageFullScreenFunctionWidget this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvPlayerEndPageFullScreenFunctionWidget ogvPlayerEndPageFullScreenFunctionWidget, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvPlayerEndPageFullScreenFunctionWidget;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.f91965r.p();
                com.bilibili.ship.theseus.keel.player.j jVar = this.this$0.f91964q;
                this.label = 1;
                if (jVar.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.endpage.OgvPlayerEndPageFullScreenFunctionWidget$onClick$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/OgvPlayerEndPageFullScreenFunctionWidget$onClick$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvPlayerEndPageFullScreenFunctionWidget this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OgvPlayerEndPageFullScreenFunctionWidget ogvPlayerEndPageFullScreenFunctionWidget, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ogvPlayerEndPageFullScreenFunctionWidget;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                com.bilibili.ship.theseus.ogv.intro.community.a aVar = this.this$0.f91963p;
                this.label = 1;
                if (aVar.a(false, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Inject
    public OgvPlayerEndPageFullScreenFunctionWidget(@NotNull Context context, @NotNull Lifecycle lifecycle, @NotNull yk.c cVar, @NotNull BiliAccounts biliAccounts, @NotNull PageReportService pageReportService, @NotNull C6153e c6153e, @NotNull OgvSeason ogvSeason, @NotNull DetailRelateRepository detailRelateRepository, @NotNull OgvEpisode ogvEpisode, @NotNull com.bilibili.ship.theseus.ogv.endpage.d dVar, @NotNull BackActionRepository backActionRepository, @NotNull com.bilibili.ship.theseus.ogv.continuousplay.d dVar2, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull com.bilibili.ship.theseus.ogv.intro.community.a aVar, @NotNull com.bilibili.ship.theseus.keel.player.j jVar, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull ShutOffTimingService shutOffTimingService, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull com.bilibili.ship.theseus.ogv.endpage.a aVar2, @NotNull com.bilibili.ship.theseus.ogv.endpage.c cVar2, @NotNull C8043a c8043a, boolean z6, @NotNull IPlayerSettingService iPlayerSettingService2) {
        super(context);
        this.f91952d = context;
        this.f91953e = cVar;
        this.f91954f = biliAccounts;
        this.f91955g = pageReportService;
        this.h = c6153e;
        this.f91956i = ogvSeason;
        this.f91957j = detailRelateRepository;
        this.f91958k = ogvEpisode;
        this.f91959l = dVar;
        this.f91960m = backActionRepository;
        this.f91961n = dVar2;
        this.f91962o = ogvCurrentEpisodeRepository;
        this.f91963p = aVar;
        this.f91964q = jVar;
        this.f91965r = hVar;
        this.f91966s = shutOffTimingService;
        this.f91967t = iPlayerSettingService;
        this.f91968u = aVar2;
        this.f91969v = cVar2;
        this.f91970w = c8043a;
        this.f91971x = z6;
        this.f91972y = iPlayerSettingService2;
        this.f91945P = "";
        this.f91946Q = "";
        lifecycle.addObserver(new a(this));
    }

    @NotNull
    public final tv.danmaku.biliplayerv2.service.f getFunctionInsetConfig() {
        return new tv.danmaku.biliplayerv2.service.f(0, 30);
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builder = new FunctionWidgetConfig.Builder();
        builder.dismissWhenActivityStop(false);
        builder.dismissWhenScreenModeChange(false);
        builder.dismissWhenVideoChange(true);
        builder.dismissWhenVideoCompleted(false);
        builder.persistent(true);
        return builder.build();
    }

    public final void i() {
        this.f91948S = true;
        c cVar = this.f91973z;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        }
        TextView textView = this.f91932C;
        if (textView != null) {
            textView.setText(this.f91952d.getText(2131846816));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        int id = view.getId();
        if (id == 2131296853) {
            i();
            this.f91960m.c(true);
            return;
        }
        if (id == 2131310129) {
            i();
            CoroutineScope coroutineScope = this.f91951V;
            if (coroutineScope == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
                coroutineScope = null;
            }
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
            this.f91959l.f92079a = false;
            com.bilibili.ship.theseus.ogv.endpage.c cVar = this.f91969v;
            cVar.getClass();
            Map<String, ? super String> mapCreateMapBuilder = MapsKt.createMapBuilder();
            cVar.f92077a.a(mapCreateMapBuilder);
            cVar.f92078b.report(new NeuronsEvents.b("player.player.endpage.replay.player", MapsKt.build(mapCreateMapBuilder)));
            return;
        }
        if (id != 2131301778 && id != 2131301801) {
            if (id == 2131308947) {
                i();
                OgvCurrentEpisodeRepository.n(this.f91962o, 0);
                com.bilibili.ship.theseus.ogv.endpage.c cVar2 = this.f91969v;
                cVar2.getClass();
                Map<String, ? super String> mapCreateMapBuilder2 = MapsKt.createMapBuilder();
                cVar2.f92077a.a(mapCreateMapBuilder2);
                Neurons.reportClick(false, "pgc.player.player-endpage.next.click", MapsKt.build(mapCreateMapBuilder2));
                return;
            }
            return;
        }
        if (!this.f91954f.isLogin()) {
            i();
        }
        CoroutineScope coroutineScope2 = this.f91951V;
        if (coroutineScope2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            coroutineScope2 = null;
        }
        BuildersKt.launch$default(coroutineScope2, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        long j7 = this.f91956i.f94449a;
        com.bilibili.community.follow.c cVar3 = com.bilibili.community.follow.c.a;
        com.bilibili.community.follow.b bVar = (com.bilibili.community.follow.b) com.bilibili.community.follow.c.c.c(com.bilibili.community.follow.c.a(j7));
        com.bilibili.community.follow.b bVar2 = bVar;
        if (bVar == null) {
            bVar2 = new com.bilibili.community.follow.b(false, FollowSeasonStatus.UNKNOWN);
        }
        Context context = this.f91952d;
        OgvSeason ogvSeason = this.f91956i;
        com.bilibili.ogv.pub.season.a aVar = ogvSeason.f94450b;
        boolean zE = ogvSeason.f94455g.e();
        boolean z6 = bVar2.a;
        String strA = C8669a.a(context, aVar, z6, zE);
        String str = !this.f91950U ? "will" : this.f91949T ? "bangumi" : "cinema";
        String str2 = !z6 ? "pgc.player.player-endpage.follow.click" : "pgc.player.player-endpage.unfollow.click";
        Map<String, ? super String> mapCreateMapBuilder3 = MapsKt.createMapBuilder();
        this.f91968u.a(mapCreateMapBuilder3);
        mapCreateMapBuilder3.put(NotificationCompat.CATEGORY_STATUS, str);
        mapCreateMapBuilder3.put("btn_text", strA);
        PageReportService.g(this.f91955g, str2, MapsKt.build(mapCreateMapBuilder3), 4);
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
    @NotNull
    public final View onCreateContentView(@NotNull Context context) {
        View viewInflate = LayoutInflater.from(getMContext()).inflate(2131500430, (ViewGroup) null);
        viewInflate.setBackgroundColor(ContextCompat.getColor(context, R.color.black));
        View viewFindViewById = viewInflate.findViewById(2131310129);
        this.f91938I = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(this);
        }
        viewInflate.findViewById(2131296853).setOnClickListener(this);
        TextView textView = (TextView) viewInflate.findViewById(2131308947);
        this.f91937H = textView;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        this.f91936G = viewInflate.findViewById(2131301908);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(2131301801);
        this.f91934E = linearLayout;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(this);
        }
        this.f91935F = (ImageView) viewInflate.findViewById(2131301799);
        TextView textView2 = (TextView) viewInflate.findViewById(2131301778);
        this.f91933D = textView2;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        this.f91930A = (TextView) viewInflate.findViewById(2131304923);
        this.f91932C = (TextView) viewInflate.findViewById(2131310009);
        BiliImageView biliImageViewFindViewById = viewInflate.findViewById(2131296796);
        this.f91939J = biliImageViewFindViewById;
        if (biliImageViewFindViewById != null) {
            biliImageViewFindViewById.setOnClickListener(this);
        }
        this.f91940K = viewInflate.findViewById(2131301986);
        this.f91941L = viewInflate.findViewById(2131301974);
        this.f91942M = viewInflate.findViewById(2131301075);
        this.f91944O = (TextView) viewInflate.findViewById(2131298996);
        this.f91943N = (TextView) viewInflate.findViewById(2131305027);
        Oi1.d cloudConfig = this.f91972y.getCloudConfig();
        View view = this.f91940K;
        if (view != null) {
            view.setVisibility((cloudConfig.D() && ConnectivityMonitor.getInstance().isNetworkActive()) ? 0 : 8);
        }
        if (this.f91972y.getCloudConfig().j()) {
            View view2 = this.f91940K;
            if (view2 != null) {
                view2.setEnabled(false);
            }
            TextView textView3 = this.f91943N;
            if (textView3 != null) {
                textView3.setAlpha(0.4f);
            }
        } else {
            View view3 = this.f91940K;
            if (view3 != null) {
                view3.setEnabled(true);
            }
        }
        View view4 = this.f91942M;
        if (view4 != null) {
            int i7 = 8;
            if (cloudConfig.o()) {
                i7 = 8;
                if (cloudConfig.u()) {
                    i7 = 8;
                    if (ConnectivityMonitor.getInstance().isNetworkActive()) {
                        i7 = 0;
                    }
                }
            }
            view4.setVisibility(i7);
        }
        if (this.f91972y.getCloudConfig().i()) {
            View view5 = this.f91941L;
            if (view5 != null) {
                view5.setEnabled(false);
            }
            TextView textView4 = this.f91944O;
            if (textView4 != null) {
                textView4.setAlpha(0.4f);
            }
        } else {
            View view6 = this.f91941L;
            if (view6 != null) {
                view6.setEnabled(true);
            }
        }
        this.f91947R = new com.bilibili.app.gemini.player.widget.like.h(this.f91953e, this.f91958k.a(), viewInflate, this.f91940K, viewInflate.findViewById(2131302144), this.f91941L, viewInflate.findViewById(2131298989), (View) null, (View) null, (RingProgressBar) viewInflate.findViewById(2131298995), (RingProgressBar) null);
        this.f91931B = (RecyclerView) viewInflate.findViewById(2131306580);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int iApplyDimension = (int) TypedValue.applyDimension(1, 25.0f, displayMetrics);
        RecyclerView recyclerView = this.f91931B;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(new e(iApplyDimension, (int) TypedValue.applyDimension(1, 6.0f, displayMetrics)));
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        RecyclerView recyclerView2 = this.f91931B;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(linearLayoutManager);
        }
        c cVar = new c(context, this);
        this.f91973z = cVar;
        cVar.f91980c = new com.bilibili.ship.theseus.ogv.endpage.e(context, this);
        cVar.f91981d = new q(this, 4);
        cVar.f91982e = new i1(1, this, context);
        RecyclerView recyclerView3 = this.f91931B;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(cVar);
        }
        return viewInflate;
    }

    public final void onRelease() {
    }

    public final void onWidgetDismiss() {
        super.onWidgetDismiss();
        com.bilibili.app.gemini.player.widget.like.h hVar = this.f91947R;
        if (hVar != null) {
            hVar.a();
        }
        CoroutineScope coroutineScope = this.f91951V;
        CoroutineScope coroutineScope2 = coroutineScope;
        if (coroutineScope == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            coroutineScope2 = null;
        }
        CoroutineScopeKt.cancel$default(coroutineScope2, (CancellationException) null, 1, (Object) null);
    }

    public final void onWidgetShow() {
        super.onWidgetShow();
        CoroutineScope coroutineScopeA = K.a((Job) null, 1, (Object) null, Dispatchers.getMain().getImmediate());
        this.f91951V = coroutineScopeA;
        if (coroutineScopeA == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            coroutineScopeA = null;
        }
        BuildersKt.launch$default(coroutineScopeA, (CoroutineContext) null, (CoroutineStart) null, new OgvPlayerEndPageFullScreenFunctionWidget$subscribe$1(this, null), 3, (Object) null);
        com.bilibili.app.gemini.player.widget.like.h hVar = this.f91947R;
        if (hVar != null) {
            hVar.c();
        }
        RecyclerView recyclerView = this.f91931B;
        int i7 = 0;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
        }
        OgvSeason ogvSeason = this.f91956i;
        String str = ogvSeason.f94466s;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        this.f91945P = str2;
        this.f91946Q = ogvSeason.f94453e;
        this.f91949T = com.bilibili.ogv.pub.season.b.a(ogvSeason.c());
        this.f91950U = ogvSeason.f94455g.e();
        this.f91948S = false;
        if (!this.f91958k.h()) {
            TextView textView = this.f91937H;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else if (this.f91962o.f()) {
            TextView textView2 = this.f91937H;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = this.f91937H;
            if (textView3 != null) {
                textView3.setEnabled(true);
            }
            TextView textView4 = this.f91937H;
            if (textView4 != null) {
                textView4.setTextColor(ContextCompat.getColor(this.f91952d, 2131103603));
            }
            Drawable drawable = AppCompatResources.getDrawable(this.f91952d, 2131232500);
            TextView textView5 = this.f91937H;
            if (textView5 != null) {
                textView5.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
            }
            TextView textView6 = this.f91937H;
            if (textView6 != null) {
                TextViewCompat.setCompoundDrawableTintList(textView6, AppCompatResources.getColorStateList(this.f91952d, 2131103603));
            }
        } else {
            TextView textView7 = this.f91937H;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
        }
        com.bilibili.ship.theseus.ogv.endpage.c cVar = this.f91969v;
        PageReportService pageReportService = this.f91955g;
        cVar.getClass();
        Map<String, ? super String> mapCreateMapBuilder = MapsKt.createMapBuilder();
        cVar.f92077a.a(mapCreateMapBuilder);
        mapCreateMapBuilder.put("endpage_type", "2");
        PageReportService.i(pageReportService, "player.player.endpage.0.show", MapsKt.build(mapCreateMapBuilder), 4);
        BiliImageView biliImageView = this.f91939J;
        if (this.f91945P.length() > 0 && biliImageView != null) {
            BiliImageLoader.INSTANCE.with(biliImageView.getContext()).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("common-ogv", (IThumbnailSizeController) null, 2, (Object) null)).url(this.f91945P).into(biliImageView);
        }
        TextView textView8 = this.f91930A;
        if (textView8 != null) {
            textView8.setText(this.f91946Q);
        }
        List<o0> listA = this.f91957j.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (((o0) obj).f101323i != null) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty() || this.f91973z == null) {
            RecyclerView recyclerView2 = this.f91931B;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(8);
            }
            TextView textView9 = this.f91932C;
            if (textView9 != null) {
                textView9.setVisibility(8);
                return;
            }
            return;
        }
        RecyclerView recyclerView3 = this.f91931B;
        if (recyclerView3 != null) {
            recyclerView3.setVisibility(0);
        }
        TextView textView10 = this.f91932C;
        if (textView10 != null) {
            textView10.setVisibility(0);
        }
        c cVar2 = this.f91973z;
        if (cVar2 != null) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (Object obj2 : arrayList) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList2.add(new b(this, i7, (o0) obj2));
                i7++;
            }
            cVar2.f91978a = arrayList2;
            cVar2.notifyDataSetChanged();
        }
    }
}
