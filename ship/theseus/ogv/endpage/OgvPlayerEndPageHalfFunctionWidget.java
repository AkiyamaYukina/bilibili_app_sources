package com.bilibili.ship.theseus.ogv.endpage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bilibili.iconfont.IconFont;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.IThumbnailSizeController;
import com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6311e0;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6325l0;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateRepository;
import com.bilibili.ship.theseus.united.page.intro.module.relate.o0;
import com.bilibili.ship.theseus.united.page.intro.module.relate.p0;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.view.StatData;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kntr.base.localization.NumberFormat_androidKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.widget.AbsGroupWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/OgvPlayerEndPageHalfFunctionWidget.class */
@StabilityInferred(parameters = 0)
public final class OgvPlayerEndPageHalfFunctionWidget extends AbsGroupWidget implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final DetailRelateRepository f91997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PageReportService f91998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final OgvEpisode f91999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Gu0.a f92000g;

    @NotNull
    public final OgvCurrentEpisodeRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final d f92001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f92002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.j f92003k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f92004l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final a f92005m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final b f92006n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public TextView f92007o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public TextView f92008p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public TextView f92009q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f92010r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public TextView f92011s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public BiliImageView f92012t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public View f92013u;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.endpage.OgvPlayerEndPageHalfFunctionWidget$onClick$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/OgvPlayerEndPageHalfFunctionWidget$onClick$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvPlayerEndPageHalfFunctionWidget this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OgvPlayerEndPageHalfFunctionWidget ogvPlayerEndPageHalfFunctionWidget, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ogvPlayerEndPageHalfFunctionWidget;
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
                this.this$0.f92004l.p();
                com.bilibili.ship.theseus.keel.player.j jVar = this.this$0.f92003k;
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

    @Inject
    public OgvPlayerEndPageHalfFunctionWidget(@NotNull Context context, @NotNull DetailRelateRepository detailRelateRepository, @NotNull PageReportService pageReportService, @NotNull OgvEpisode ogvEpisode, @NotNull Gu0.a aVar, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull d dVar, @NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.keel.player.j jVar, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull a aVar2, @NotNull b bVar) {
        super(context);
        this.f91997d = detailRelateRepository;
        this.f91998e = pageReportService;
        this.f91999f = ogvEpisode;
        this.f92000g = aVar;
        this.h = ogvCurrentEpisodeRepository;
        this.f92001i = dVar;
        this.f92002j = coroutineScope;
        this.f92003k = jVar;
        this.f92004l = hVar;
        this.f92005m = aVar2;
        this.f92006n = bVar;
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

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        Object next;
        View view2;
        int id = view.getId();
        if (id != 2131298635 && id != 2131308931 && id != 2131298941) {
            if (id == 2131310129) {
                BuildersKt.launch$default(this.f92002j, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
                this.f92001i.f92079a = false;
                b bVar = this.f92006n;
                bVar.getClass();
                Map<String, ? super String> mapCreateMapBuilder = MapsKt.createMapBuilder();
                bVar.f92076a.a(mapCreateMapBuilder);
                Neurons.reportClick(false, "pgc.player.player-endpage.replay.click", MapsKt.build(mapCreateMapBuilder));
                return;
            }
            if (id != 2131307878) {
                if (id != 2131311217 || (view2 = this.f92013u) == null) {
                    return;
                }
                view2.performClick();
                return;
            }
            OgvCurrentEpisodeRepository.n(this.h, 0);
            b bVar2 = this.f92006n;
            bVar2.getClass();
            Map<String, ? super String> mapCreateMapBuilder2 = MapsKt.createMapBuilder();
            bVar2.f92076a.a(mapCreateMapBuilder2);
            Neurons.reportClick(false, "pgc.player.player-endpage.next.click", MapsKt.build(mapCreateMapBuilder2));
            return;
        }
        Iterator<T> it = this.f91997d.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((o0) next).f101323i != null) {
                    break;
                }
            }
        }
        o0 o0Var = (o0) next;
        if (o0Var == null) {
            return;
        }
        Qj0.g.e(view.getContext(), xl0.b.a(Uri.parse(o0Var.f101318c.f101347d), o0Var.f101338x));
        PageReportService pageReportService = this.f91998e;
        Map<String, ? super String> mapCreateMapBuilder3 = MapsKt.createMapBuilder();
        this.f92005m.a(mapCreateMapBuilder3);
        mapCreateMapBuilder3.put("order_id", "1");
        C6325l0 c6325l0 = o0Var.f101323i;
        Long lValueOf = null;
        if (c6325l0 != null) {
            lValueOf = Long.valueOf(c6325l0.f101279a);
        }
        mapCreateMapBuilder3.put("rec_seasonid", String.valueOf(lValueOf));
        mapCreateMapBuilder3.put("screen_display", "half");
        Unit unit = Unit.INSTANCE;
        PageReportService.g(pageReportService, "pgc.player.player-endpage.recommend.click", MapsKt.build(mapCreateMapBuilder3), 4);
    }

    @NotNull
    public final View onCreateContentView(@NotNull Context context) {
        View viewInflate = LayoutInflater.from(getMContext()).inflate(2131500431, (ViewGroup) null);
        viewInflate.setBackgroundColor(ContextCompat.getColor(context, R.color.black));
        this.f92007o = (TextView) viewInflate.findViewById(2131308958);
        viewInflate.findViewById(2131298941).setOnClickListener(this);
        ((ImageView) viewInflate.findViewById(2131308931)).setOnClickListener(this);
        ((TextView) viewInflate.findViewById(2131298635)).setOnClickListener(this);
        viewInflate.findViewById(2131311217).setOnClickListener(this);
        this.f92012t = viewInflate.findViewById(2131298941);
        TextView textView = (TextView) viewInflate.findViewById(2131310129);
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        TextView textView2 = (TextView) viewInflate.findViewById(2131307878);
        this.f92008p = textView2;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        this.f92009q = (TextView) viewInflate.findViewById(2131310005);
        this.f92010r = (TextView) viewInflate.findViewById(2131316234);
        this.f92013u = viewInflate.findViewById(2131311173);
        this.f92011s = (TextView) viewInflate.findViewById(2131316170);
        viewInflate.setClickable(true);
        return viewInflate;
    }

    public final void onRelease() {
    }

    public final void onWidgetShow() {
        Object next;
        Object next2;
        C6325l0 c6325l0;
        C6325l0 c6325l02;
        StatData statData;
        C6325l0 c6325l03;
        C6311e0 c6311e0;
        BiliImageView biliImageView;
        C6325l0 c6325l04;
        C6311e0 c6311e02;
        p0 p0Var;
        super.onWidgetShow();
        List<o0> listA = this.f91997d.a();
        if ((listA instanceof Collection) && listA.isEmpty()) {
            return;
        }
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            if (((o0) it.next()).f101323i != null) {
                OgvEpisode ogvEpisodeC = this.f92000g.c(this.f91999f.f93555a);
                boolean z6 = ogvEpisodeC != null && this.f91999f.f93555a == ogvEpisodeC.f93555a;
                Iterator<T> it2 = this.f91997d.a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (((o0) next).f101323i != null) {
                            break;
                        }
                    }
                }
                o0 o0Var = (o0) next;
                TextView textView = this.f92007o;
                if (textView != null) {
                    textView.setText((o0Var == null || (p0Var = o0Var.f101318c) == null) ? null : p0Var.f101344a);
                }
                String str = (o0Var == null || (c6325l04 = o0Var.f101323i) == null || (c6311e02 = c6325l04.f101281c) == null) ? null : c6311e02.f101185f;
                if (str != null && str.length() != 0 && (biliImageView = this.f92012t) != null) {
                    BiliImageLoader.INSTANCE.with(biliImageView.getContext()).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("common-ogv", (IThumbnailSizeController) null, 2, (Object) null)).url(str).into(biliImageView);
                }
                TextView textView2 = this.f92008p;
                if (textView2 != null) {
                    textView2.setVisibility(this.f91999f.h() && !z6 ? 0 : 8);
                }
                TextView textView3 = this.f92009q;
                if (textView3 != null) {
                    textView3.setText((o0Var == null || (c6325l03 = o0Var.f101323i) == null || (c6311e0 = c6325l03.f101281c) == null) ? null : c6311e0.f101186g);
                }
                if (o0Var != null && (c6325l02 = o0Var.f101323i) != null && (statData = c6325l02.f101282d) != null) {
                    TextView textView4 = this.f92010r;
                    TextView textView5 = textView4;
                    if (textView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("videoViewTv");
                        textView5 = null;
                    }
                    textView5.setText(statData.b().f104028b);
                    Drawable iconDrawable = IconFont.getIconDrawable(statData.b().f104030d, ContextCompat.getColor(getMContext(), R$color.Graph_medium));
                    int iB = Uj0.c.b(14.0f, getMContext());
                    if (iconDrawable != null) {
                        iconDrawable.setBounds(0, 0, iB, iB);
                    }
                    TextView textView6 = this.f92010r;
                    TextView textView7 = textView6;
                    if (textView6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("videoViewTv");
                        textView7 = null;
                    }
                    textView7.setCompoundDrawablesRelative(iconDrawable, null, null, null);
                    TextView textView8 = this.f92011s;
                    if (textView8 != null) {
                        String str2 = NumberFormat_androidKt.format$default(Long.valueOf(statData.h), (String) null, 0, 3, (Object) null);
                        if (str2 == null) {
                            str2 = "";
                        }
                        textView8.setText(str2);
                    }
                }
                b bVar = this.f92006n;
                bVar.getClass();
                Map<String, ? super String> mapCreateMapBuilder = MapsKt.createMapBuilder();
                bVar.f92076a.a(mapCreateMapBuilder);
                Neurons.reportExposure$default(false, "pgc.player.player-endpage.0.show", MapsKt.build(mapCreateMapBuilder), (List) null, 8, (Object) null);
                Iterator<T> it3 = this.f91997d.a().iterator();
                do {
                    next2 = null;
                    if (!it3.hasNext()) {
                        break;
                    } else {
                        next2 = it3.next();
                    }
                } while (((o0) next2).f101323i == null);
                o0 o0Var2 = (o0) next2;
                long j7 = (o0Var2 == null || (c6325l0 = o0Var2.f101323i) == null) ? 0L : c6325l0.f101279a;
                Map<String, ? super String> mapCreateMapBuilder2 = MapsKt.createMapBuilder();
                this.f92005m.a(mapCreateMapBuilder2);
                mapCreateMapBuilder2.put("order_id", "1");
                mapCreateMapBuilder2.put("rec_seasonid", String.valueOf(j7));
                Neurons.reportExposure$default(false, "pgc.player.player-endpage.recommend.show", MapsKt.build(mapCreateMapBuilder2), (List) null, 8, (Object) null);
                return;
            }
        }
    }
}
