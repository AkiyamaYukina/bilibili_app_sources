package com.bilibili.ship.theseus.ogv.endpage;

import X9.n;
import ZS0.k1;
import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.app.authorspace.ui.pages.p;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.community.follow.FollowSeasonRepository$flowOfFollowSeason$;
import com.bilibili.community.follow.FollowSeasonStatus;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.IThumbnailSizeController;
import com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.playerbizcommon.view.RingProgressBar;
import com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode;
import com.bilibili.ship.theseus.ogv.C6153e;
import com.bilibili.ship.theseus.ogv.endpage.NestedEndPageView;
import com.bilibili.ship.theseus.ogv.endpage.OgvPlayerEndPageVerticalFullScreenFunctionWidget;
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
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tl0.C8669a;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.business.ShutOffTimingService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.widget.AbsGroupWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/OgvPlayerEndPageVerticalFullScreenFunctionWidget.class */
@StabilityInferred(parameters = 0)
public final class OgvPlayerEndPageVerticalFullScreenFunctionWidget extends AbsGroupWidget implements View.OnClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public c f92014A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public RecyclerView f92015B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public TextView f92016C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public NestedEndPageView f92017D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public BangumiVerticalFullScrollTop f92018E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public TextView f92019F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public BiliImageView f92020G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public View f92021H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public View f92022I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @Nullable
    public View f92023J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @Nullable
    public View f92024K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @Nullable
    public TextView f92025L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @Nullable
    public TextView f92026M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @Nullable
    public GridLayoutManager f92027N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @Nullable
    public com.bilibili.app.gemini.player.widget.like.h f92028O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @NotNull
    public com.bilibili.ogv.pub.season.a f92029P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f92030Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f92031R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f92032S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public CoroutineScope f92033T;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f92034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Context f92035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lifecycle f92036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final yk.c f92037g;

    @NotNull
    public final PageReportService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final C6153e f92038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final OgvSeason f92039j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final DetailRelateRepository f92040k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final OgvEpisode f92041l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.endpage.d f92042m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f92043n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.continuousplay.d f92044o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f92045p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.j f92046q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f92047r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.intro.community.a f92048s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final ShutOffTimingService f92049t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f92050u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final k f92051v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.endpage.a f92052w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final C8043a f92053x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f92054y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f92055z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/OgvPlayerEndPageVerticalFullScreenFunctionWidget$a.class */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f92056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final o0 f92057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ExposureEntry f92058c;

        public a(OgvPlayerEndPageVerticalFullScreenFunctionWidget ogvPlayerEndPageVerticalFullScreenFunctionWidget, @NotNull int i7, o0 o0Var) {
            this.f92056a = i7;
            this.f92057b = o0Var;
            this.f92058c = new ExposureEntry(com.bilibili.ship.theseus.united.report.a.f104837a, new k1(1, this, ogvPlayerEndPageVerticalFullScreenFunctionWidget));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/OgvPlayerEndPageVerticalFullScreenFunctionWidget$b.class */
    public final class b implements NestedEndPageView.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f92059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OgvPlayerEndPageVerticalFullScreenFunctionWidget f92060b;

        public b(OgvPlayerEndPageVerticalFullScreenFunctionWidget ogvPlayerEndPageVerticalFullScreenFunctionWidget) {
            this.f92060b = ogvPlayerEndPageVerticalFullScreenFunctionWidget;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x015a  */
        @Override // com.bilibili.ship.theseus.ogv.endpage.NestedEndPageView.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(@org.jetbrains.annotations.NotNull android.view.MotionEvent r5) {
            /*
                Method dump skipped, instruction units count: 556
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.endpage.OgvPlayerEndPageVerticalFullScreenFunctionWidget.b.a(android.view.MotionEvent):boolean");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/OgvPlayerEndPageVerticalFullScreenFunctionWidget$c.class */
    public final class c extends RecyclerView.Adapter<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public List<a> f92061a = CollectionsKt.emptyList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OgvPlayerEndPageVerticalFullScreenFunctionWidget f92062b;

        public c(OgvPlayerEndPageVerticalFullScreenFunctionWidget ogvPlayerEndPageVerticalFullScreenFunctionWidget) {
            this.f92062b = ogvPlayerEndPageVerticalFullScreenFunctionWidget;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f92061a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i7) {
            final d dVar = (d) viewHolder;
            OgvPlayerEndPageVerticalFullScreenFunctionWidget ogvPlayerEndPageVerticalFullScreenFunctionWidget = this.f92062b;
            int i8 = ogvPlayerEndPageVerticalFullScreenFunctionWidget.f92050u.getInt(PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
            a aVar = this.f92061a.get(i7);
            ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(dVar.itemView, aVar.f92058c);
            boolean z6 = i7 == 0 && ogvPlayerEndPageVerticalFullScreenFunctionWidget.f92054y && i8 != 1;
            final o0 o0Var = aVar.f92057b;
            if (o0Var != null) {
                final OgvPlayerEndPageVerticalFullScreenFunctionWidget ogvPlayerEndPageVerticalFullScreenFunctionWidget2 = dVar.f92070i;
                String str = null;
                ImageRequestBuilder imageRequestBuilderThumbnailUrlTransformStrategy = BiliImageLoader.INSTANCE.with(ogvPlayerEndPageVerticalFullScreenFunctionWidget2.f92035e).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("common-ogv", (IThumbnailSizeController) null, 2, (Object) null));
                p0 p0Var = o0Var.f101318c;
                imageRequestBuilderThumbnailUrlTransformStrategy.url(p0Var.f101346c).into(dVar.f92063a);
                dVar.f92064b.setText(p0Var.f101344a);
                C6325l0 c6325l0 = o0Var.f101323i;
                if (Intrinsics.areEqual(c6325l0.f101280b, com.bilibili.ogv.pub.season.a.f71776c)) {
                    dVar.f92065c.setVisibility(4);
                } else {
                    dVar.f92065c.setVisibility(0);
                }
                C6311e0 c6311e0 = c6325l0.f101281c;
                if (c6311e0 != null) {
                    str = c6311e0.f101186g;
                }
                String str2 = str;
                if (str == null) {
                    str2 = "";
                }
                if (str2.length() > 0) {
                    dVar.f92065c.setText(str2);
                }
                dVar.itemView.setOnClickListener(new View.OnClickListener(dVar, o0Var, ogvPlayerEndPageVerticalFullScreenFunctionWidget2, i7) { // from class: com.bilibili.ship.theseus.ogv.endpage.h

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final OgvPlayerEndPageVerticalFullScreenFunctionWidget.d f92087a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final o0 f92088b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final OgvPlayerEndPageVerticalFullScreenFunctionWidget f92089c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final int f92090d;

                    {
                        this.f92087a = dVar;
                        this.f92088b = o0Var;
                        this.f92089c = ogvPlayerEndPageVerticalFullScreenFunctionWidget2;
                        this.f92090d = i7;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OgvPlayerEndPageVerticalFullScreenFunctionWidget.d dVar2 = this.f92087a;
                        o0 o0Var2 = this.f92088b;
                        OgvPlayerEndPageVerticalFullScreenFunctionWidget ogvPlayerEndPageVerticalFullScreenFunctionWidget3 = this.f92089c;
                        int i9 = this.f92090d;
                        dVar2.f92066d.cancelAnimation();
                        Qj0.g.e(ogvPlayerEndPageVerticalFullScreenFunctionWidget3.f92035e, xl0.b.a(Uri.parse(o0Var2.f101318c.f101347d), o0Var2.f101338x));
                        PageReportService.g(ogvPlayerEndPageVerticalFullScreenFunctionWidget3.h, "pgc.player.player-endpage.recommend.click", MapsKt.mapOf(new Pair[]{p.a(i9, 1, "order_id"), TuplesKt.to("rec_seasonid", String.valueOf(o0Var2.f101323i.f101279a)), TuplesKt.to("screen_display", "full"), TuplesKt.to("state", "4")}), 4);
                    }
                });
                dVar.f92067e.setOnClickListener(new View.OnClickListener(dVar, ogvPlayerEndPageVerticalFullScreenFunctionWidget2, o0Var) { // from class: com.bilibili.ship.theseus.ogv.endpage.i

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final OgvPlayerEndPageVerticalFullScreenFunctionWidget.d f92091a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final o0 f92092b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final OgvPlayerEndPageVerticalFullScreenFunctionWidget f92093c;

                    {
                        this.f92091a = dVar;
                        this.f92092b = o0Var;
                        this.f92093c = ogvPlayerEndPageVerticalFullScreenFunctionWidget2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OgvPlayerEndPageVerticalFullScreenFunctionWidget.d dVar2 = this.f92091a;
                        o0 o0Var2 = this.f92092b;
                        OgvPlayerEndPageVerticalFullScreenFunctionWidget ogvPlayerEndPageVerticalFullScreenFunctionWidget3 = this.f92093c;
                        dVar2.f92066d.cancelAnimation();
                        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                        mapCreateMapBuilder.put("season_id", String.valueOf(o0Var2.f101323i.f101279a));
                        mapCreateMapBuilder.put("season_type", String.valueOf(o0Var2.f101323i.f101280b.f71782a));
                        mapCreateMapBuilder.put("epid", String.valueOf(ogvPlayerEndPageVerticalFullScreenFunctionWidget3.f92041l.f93555a));
                        Unit unit = Unit.INSTANCE;
                        Neurons.reportClick(false, "pgc.pgc-video-detail.hookup-full-cancel.0.click", MapsKt.build(mapCreateMapBuilder));
                    }
                });
                LottieAnimationView lottieAnimationView = dVar.f92066d;
                if (!z6 || ogvPlayerEndPageVerticalFullScreenFunctionWidget2.f92042m.f92079a || ogvPlayerEndPageVerticalFullScreenFunctionWidget2.f92030Q || ogvPlayerEndPageVerticalFullScreenFunctionWidget2.f92049t.getTotalTime() != 0) {
                    dVar.f92068f.setVisibility(8);
                    View view = dVar.f92069g;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    dVar.f92067e.setVisibility(8);
                    lottieAnimationView.setVisibility(8);
                    dVar.h.setVisibility(8);
                    return;
                }
                ogvPlayerEndPageVerticalFullScreenFunctionWidget2.f92042m.f92079a = true;
                dVar.f92068f.setVisibility(0);
                View view2 = dVar.f92069g;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                lottieAnimationView.setVisibility(0);
                dVar.f92067e.setVisibility(0);
                dVar.h.setVisibility(0);
                TextView textView = ogvPlayerEndPageVerticalFullScreenFunctionWidget2.f92016C;
                if (textView != null) {
                    textView.setText(ogvPlayerEndPageVerticalFullScreenFunctionWidget2.f92035e.getText(2131847400));
                }
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                mapCreateMapBuilder.put("season_id", String.valueOf(c6325l0.f101279a));
                mapCreateMapBuilder.put("season_type", String.valueOf(c6325l0.f101280b.f71782a));
                mapCreateMapBuilder.put("epid", String.valueOf(ogvPlayerEndPageVerticalFullScreenFunctionWidget2.f92041l.f93555a));
                Unit unit = Unit.INSTANCE;
                Neurons.reportExposure$default(false, "pgc.pgc-video-detail.hookup-full-cancel.0.show", MapsKt.build(mapCreateMapBuilder), (List) null, 8, (Object) null);
                lottieAnimationView.setSpeed(1.0f);
                lottieAnimationView.setProgress(0.0f);
                lottieAnimationView.setAnimation("bangumi_count_down.json");
                lottieAnimationView.playAnimation();
                lottieAnimationView.addAnimatorListener(new j(dVar, ogvPlayerEndPageVerticalFullScreenFunctionWidget2, o0Var));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new d(this.f92062b, p.a(viewGroup, 2131500360, viewGroup, false));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/OgvPlayerEndPageVerticalFullScreenFunctionWidget$d.class */
    public final class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliImageView f92063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f92064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f92065c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final LottieAnimationView f92066d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final TextView f92067e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final View f92068f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final View f92069g;

        @NotNull
        public final ImageView h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final OgvPlayerEndPageVerticalFullScreenFunctionWidget f92070i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull OgvPlayerEndPageVerticalFullScreenFunctionWidget ogvPlayerEndPageVerticalFullScreenFunctionWidget, View view) {
            super(view);
            this.f92070i = ogvPlayerEndPageVerticalFullScreenFunctionWidget;
            this.f92063a = view.findViewById(2131298941);
            this.f92064b = (TextView) view.findViewById(2131308958);
            this.f92065c = (TextView) view.findViewById(2131312539);
            this.f92066d = (LottieAnimationView) view.findViewById(2131299510);
            this.f92067e = (TextView) view.findViewById(2131298274);
            this.f92068f = view.findViewById(2131299509);
            this.f92069g = view.findViewById(2131297137);
            this.h = (ImageView) view.findViewById(2131308931);
            int i7 = ogvPlayerEndPageVerticalFullScreenFunctionWidget.f92035e.getResources().getDisplayMetrics().widthPixels;
            Uj0.c.b(44.0f, ogvPlayerEndPageVerticalFullScreenFunctionWidget.f92035e);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/OgvPlayerEndPageVerticalFullScreenFunctionWidget$e.class */
    public static final class e extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f92071a;

        public e(int i7) {
            this.f92071a = i7;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int i7 = this.f92071a;
            rect.bottom = i7;
            int i8 = i7 / 2;
            rect.right = i8;
            rect.left = i8;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.endpage.OgvPlayerEndPageVerticalFullScreenFunctionWidget$onClick$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/OgvPlayerEndPageVerticalFullScreenFunctionWidget$onClick$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvPlayerEndPageVerticalFullScreenFunctionWidget this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvPlayerEndPageVerticalFullScreenFunctionWidget ogvPlayerEndPageVerticalFullScreenFunctionWidget, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvPlayerEndPageVerticalFullScreenFunctionWidget;
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
                this.this$0.f92047r.p();
                com.bilibili.ship.theseus.keel.player.j jVar = this.this$0.f92046q;
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.endpage.OgvPlayerEndPageVerticalFullScreenFunctionWidget$onClick$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/OgvPlayerEndPageVerticalFullScreenFunctionWidget$onClick$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvPlayerEndPageVerticalFullScreenFunctionWidget this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OgvPlayerEndPageVerticalFullScreenFunctionWidget ogvPlayerEndPageVerticalFullScreenFunctionWidget, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ogvPlayerEndPageVerticalFullScreenFunctionWidget;
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
                com.bilibili.ship.theseus.ogv.intro.community.a aVar = this.this$0.f92048s;
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
    public OgvPlayerEndPageVerticalFullScreenFunctionWidget(@NotNull BiliAccounts biliAccounts, @NotNull Context context, @NotNull Lifecycle lifecycle, @NotNull yk.c cVar, @NotNull PageReportService pageReportService, @NotNull C6153e c6153e, @NotNull OgvSeason ogvSeason, @NotNull DetailRelateRepository detailRelateRepository, @NotNull OgvEpisode ogvEpisode, @NotNull com.bilibili.ship.theseus.ogv.endpage.d dVar, @NotNull BackActionRepository backActionRepository, @NotNull com.bilibili.ship.theseus.ogv.continuousplay.d dVar2, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull com.bilibili.ship.theseus.keel.player.j jVar, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull com.bilibili.ship.theseus.ogv.intro.community.a aVar, @NotNull ShutOffTimingService shutOffTimingService, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull k kVar, @NotNull com.bilibili.ship.theseus.ogv.endpage.a aVar2, @NotNull C8043a c8043a, boolean z6, @NotNull IPlayerSettingService iPlayerSettingService2) {
        super(context);
        this.f92034d = biliAccounts;
        this.f92035e = context;
        this.f92036f = lifecycle;
        this.f92037g = cVar;
        this.h = pageReportService;
        this.f92038i = c6153e;
        this.f92039j = ogvSeason;
        this.f92040k = detailRelateRepository;
        this.f92041l = ogvEpisode;
        this.f92042m = dVar;
        this.f92043n = backActionRepository;
        this.f92044o = dVar2;
        this.f92045p = ogvCurrentEpisodeRepository;
        this.f92046q = jVar;
        this.f92047r = hVar;
        this.f92048s = aVar;
        this.f92049t = shutOffTimingService;
        this.f92050u = iPlayerSettingService;
        this.f92051v = kVar;
        this.f92052w = aVar2;
        this.f92053x = c8043a;
        this.f92054y = z6;
        this.f92055z = iPlayerSettingService2;
        this.f92029P = com.bilibili.ogv.pub.season.a.f71781i;
    }

    @NotNull
    public final tv.danmaku.biliplayerv2.service.f getFunctionInsetConfig() {
        return new tv.danmaku.biliplayerv2.service.f(Uj0.c.b(16.0f, this.f92035e), 26);
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
        this.f92030Q = true;
        this.f92044o.f91811a = 0;
        c cVar = this.f92014A;
        if (cVar != null) {
            cVar.notifyItemChanged(0);
        }
        TextView textView = this.f92016C;
        if (textView != null) {
            textView.setText(this.f92035e.getText(2131846816));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        int id = view.getId();
        if (id == 2131296853) {
            i();
            this.f92043n.c(true);
            return;
        }
        if (id == 2131310129) {
            i();
            CoroutineScope coroutineScope = this.f92033T;
            if (coroutineScope == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
                coroutineScope = null;
            }
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
            this.f92042m.f92079a = false;
            k kVar = this.f92051v;
            kVar.getClass();
            Map<String, ? super String> mapCreateMapBuilder = MapsKt.createMapBuilder();
            kVar.f92097a.a(mapCreateMapBuilder);
            kVar.f92098b.report(new NeuronsEvents.b("player.player.endpage.replay.player", MapsKt.build(mapCreateMapBuilder)));
            return;
        }
        if (id != 2131305570) {
            if (id == 2131308947) {
                i();
                OgvCurrentEpisodeRepository.n(this.f92045p, 0);
                k kVar2 = this.f92051v;
                kVar2.getClass();
                Map<String, ? super String> mapCreateMapBuilder2 = MapsKt.createMapBuilder();
                kVar2.f92097a.a(mapCreateMapBuilder2);
                Neurons.reportClick(false, "pgc.player.player-endpage.next.click", MapsKt.build(mapCreateMapBuilder2));
                return;
            }
            return;
        }
        if (!this.f92034d.isLogin()) {
            i();
        }
        CoroutineScope coroutineScope2 = this.f92033T;
        if (coroutineScope2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            coroutineScope2 = null;
        }
        BuildersKt.launch$default(coroutineScope2, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        long j7 = this.f92039j.f94449a;
        com.bilibili.community.follow.c cVar = com.bilibili.community.follow.c.a;
        com.bilibili.community.follow.b bVar = (com.bilibili.community.follow.b) com.bilibili.community.follow.c.c.c(com.bilibili.community.follow.c.a(j7));
        com.bilibili.community.follow.b bVar2 = bVar;
        if (bVar == null) {
            bVar2 = new com.bilibili.community.follow.b(false, FollowSeasonStatus.UNKNOWN);
        }
        Context context = this.f92035e;
        com.bilibili.ogv.pub.season.a aVar = this.f92029P;
        boolean zE = this.f92039j.f94455g.e();
        boolean z6 = bVar2.a;
        String strA = C8669a.a(context, aVar, z6, zE);
        String str = !this.f92032S ? "will" : this.f92031R ? "bangumi" : "cinema";
        String str2 = !z6 ? "pgc.player.player-endpage.follow.click" : "pgc.player.player-endpage.unfollow.click";
        Map<String, ? super String> mapCreateMapBuilder3 = MapsKt.createMapBuilder();
        this.f92052w.a(mapCreateMapBuilder3);
        mapCreateMapBuilder3.put(NotificationCompat.CATEGORY_STATUS, str);
        mapCreateMapBuilder3.put("btn_text", strA);
        PageReportService.g(this.h, str2, MapsKt.build(mapCreateMapBuilder3), 4);
    }

    @NotNull
    public final View onCreateContentView(@NotNull Context context) {
        BangumiVerticalFullScrollTop bangumiVerticalFullScrollTop = null;
        View viewInflate = LayoutInflater.from(getMContext()).inflate(2131500427, (ViewGroup) null);
        ((ImageView) viewInflate.findViewById(2131296853)).setOnClickListener(this);
        viewInflate.setBackgroundColor(ContextCompat.getColor(context, R.color.black));
        this.f92015B = (RecyclerView) viewInflate.findViewById(2131306580);
        this.f92016C = (TextView) viewInflate.findViewById(2131310009);
        this.f92017D = (NestedEndPageView) viewInflate.findViewById(2131307803);
        BangumiVerticalFullScrollTop bangumiVerticalFullScrollTop2 = (BangumiVerticalFullScrollTop) viewInflate.findViewById(2131297175);
        this.f92018E = bangumiVerticalFullScrollTop2;
        if (bangumiVerticalFullScrollTop2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFullScrollLl");
        } else {
            bangumiVerticalFullScrollTop = bangumiVerticalFullScrollTop2;
        }
        this.f92019F = bangumiVerticalFullScrollTop.getFollow();
        this.f92020G = bangumiVerticalFullScrollTop.getIvFollow();
        this.f92021H = bangumiVerticalFullScrollTop.getLlfollow();
        bangumiVerticalFullScrollTop.getReplay().setOnClickListener(this);
        View view = this.f92021H;
        if (view != null) {
            view.setOnClickListener(this);
        }
        this.f92022I = viewInflate.findViewById(2131301986);
        this.f92023J = viewInflate.findViewById(2131301974);
        this.f92024K = viewInflate.findViewById(2131319077);
        this.f92026M = (TextView) viewInflate.findViewById(2131298996);
        this.f92025L = (TextView) viewInflate.findViewById(2131305027);
        Oi1.d cloudConfig = this.f92055z.getCloudConfig();
        View view2 = this.f92022I;
        if (view2 != null) {
            view2.setVisibility((cloudConfig.D() && ConnectivityMonitor.getInstance().isNetworkActive()) ? 0 : 8);
        }
        if (this.f92055z.getCloudConfig().j()) {
            View view3 = this.f92022I;
            if (view3 != null) {
                view3.setEnabled(false);
            }
            TextView textView = this.f92025L;
            if (textView != null) {
                textView.setAlpha(0.4f);
            }
        } else {
            View view4 = this.f92022I;
            if (view4 != null) {
                view4.setEnabled(true);
            }
        }
        View view5 = this.f92024K;
        if (view5 != null) {
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
            view5.setVisibility(i7);
        }
        if (this.f92055z.getCloudConfig().i()) {
            View view6 = this.f92023J;
            if (view6 != null) {
                view6.setEnabled(false);
            }
            TextView textView2 = this.f92026M;
            if (textView2 != null) {
                textView2.setAlpha(0.4f);
            }
        } else {
            View view7 = this.f92023J;
            if (view7 != null) {
                view7.setEnabled(true);
            }
        }
        this.f92028O = new com.bilibili.app.gemini.player.widget.like.h(this.f92037g, this.f92041l.a(), viewInflate, this.f92022I, viewInflate.findViewById(2131302144), this.f92023J, viewInflate.findViewById(2131298989), (View) null, (View) null, (RingProgressBar) viewInflate.findViewById(2131298995), (RingProgressBar) null);
        int iB = Uj0.c.b(12.0f, context);
        this.f92027N = new GridLayoutManager(context, 3);
        this.f92014A = new c(this);
        RecyclerView recyclerView = this.f92015B;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(this.f92027N);
        }
        RecyclerView recyclerView2 = this.f92015B;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f92014A);
        }
        RecyclerView recyclerView3 = this.f92015B;
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(new e(iB));
        }
        NestedEndPageView nestedEndPageView = this.f92017D;
        if (nestedEndPageView != null) {
            nestedEndPageView.setTouchInterceptor(new b(this));
        }
        return viewInflate;
    }

    public final void onRelease() {
    }

    public final void onWidgetDismiss() {
        super.onWidgetDismiss();
        com.bilibili.app.gemini.player.widget.like.h hVar = this.f92028O;
        if (hVar != null) {
            hVar.a();
        }
        CoroutineScope coroutineScope = this.f92033T;
        CoroutineScope coroutineScope2 = coroutineScope;
        if (coroutineScope == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            coroutineScope2 = null;
        }
        CoroutineScopeKt.cancel$default(coroutineScope2, (CancellationException) null, 1, (Object) null);
    }

    public final void onWidgetShow() {
        super.onWidgetShow();
        RecyclerView recyclerView = this.f92015B;
        int i7 = 0;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
        }
        com.bilibili.app.gemini.player.widget.like.h hVar = this.f92028O;
        if (hVar != null) {
            hVar.c();
        }
        OgvSeason ogvSeason = this.f92039j;
        com.bilibili.ogv.pub.season.a aVar = ogvSeason.f94450b;
        this.f92029P = aVar;
        this.f92031R = com.bilibili.ogv.pub.season.b.a(aVar);
        this.f92032S = ogvSeason.f94455g.e();
        this.f92033T = n.b();
        long j7 = this.f92039j.f94449a;
        com.bilibili.community.follow.c cVar = com.bilibili.community.follow.c.a;
        Flow flowOnEach = FlowKt.onEach(new FollowSeasonRepository$flowOfFollowSeason$.inlined.map.1(com.bilibili.community.follow.c.c.b(com.bilibili.community.follow.c.a(j7))), new OgvPlayerEndPageVerticalFullScreenFunctionWidget$subscribe$1(this, null));
        CoroutineScope coroutineScope = this.f92033T;
        CoroutineScope coroutineScope2 = coroutineScope;
        if (coroutineScope == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            coroutineScope2 = null;
        }
        FlowKt.launchIn(flowOnEach, coroutineScope2);
        CoroutineScope coroutineScope3 = this.f92033T;
        if (coroutineScope3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            coroutineScope3 = null;
        }
        BuildersKt.launch$default(coroutineScope3, (CoroutineContext) null, (CoroutineStart) null, new OgvPlayerEndPageVerticalFullScreenFunctionWidget$subscribe$2(this, null), 3, (Object) null);
        this.f92030Q = false;
        BangumiVerticalFullScrollTop bangumiVerticalFullScrollTop = this.f92018E;
        BangumiVerticalFullScrollTop bangumiVerticalFullScrollTop2 = bangumiVerticalFullScrollTop;
        if (bangumiVerticalFullScrollTop == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFullScrollLl");
            bangumiVerticalFullScrollTop2 = null;
        }
        BiliImageLoader.INSTANCE.with(bangumiVerticalFullScrollTop2.getCover().getContext()).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("common-ogv", (IThumbnailSizeController) null, 2, (Object) null)).url(this.f92039j.f94466s).into(bangumiVerticalFullScrollTop2.getCover());
        bangumiVerticalFullScrollTop2.getTitle().setText(this.f92039j.f94453e);
        k kVar = this.f92051v;
        PageReportService pageReportService = this.h;
        kVar.getClass();
        Map<String, ? super String> mapCreateMapBuilder = MapsKt.createMapBuilder();
        kVar.f92097a.a(mapCreateMapBuilder);
        mapCreateMapBuilder.put("endpage_type", "2");
        PageReportService.i(pageReportService, "player.player.endpage.0.show", MapsKt.build(mapCreateMapBuilder), 4);
        List<o0> listA = this.f92040k.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (((o0) obj).f101323i != null) {
                arrayList.add(obj);
            }
        }
        c cVar2 = this.f92014A;
        if (cVar2 != null) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (Object obj2 : arrayList) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList2.add(new a(this, i7, (o0) obj2));
                i7++;
            }
            cVar2.f92061a = arrayList2;
            cVar2.notifyDataSetChanged();
        }
    }
}
