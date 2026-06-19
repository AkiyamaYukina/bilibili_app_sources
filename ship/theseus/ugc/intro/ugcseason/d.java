package com.bilibili.ship.theseus.ugc.intro.ugcseason;

import Vu0.F;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.LeadingMarginSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.SimpleColorFilter;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieValueCallback;
import com.bilibili.app.gemini.ui.m;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playerbizcommonv2.utils.p;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6353o;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6355q;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonActivity;
import com.bilibili.ship.theseus.united.page.intro.module.season.Z;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/d.class */
@StabilityInferred(parameters = 0)
public final class d extends m<F> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final h f97470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f97471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a f97472c = new a(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final c f97473d = new c(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Z> f97474e = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/d$a.class */
    public final class a extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ArrayList<C6355q> f97475a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f97476b;

        public a(d dVar) {
            this.f97476b = dVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f97475a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            b bVar = (b) viewHolder;
            final C6355q c6355q = (C6355q) CollectionsKt.getOrNull(this.f97475a, i7);
            if (c6355q == null) {
                return;
            }
            Context context = bVar.itemView.getContext();
            final d dVar = this.f97476b;
            final boolean zAreEqual = Intrinsics.areEqual(dVar.f97470a.f97494e.element, c6355q);
            ActivityColorRepository activityColorRepository = dVar.f97470a.f97496g.f97460j;
            BiliImageLoader biliImageLoader = BiliImageLoader.INSTANCE;
            BiliImageView biliImageView = bVar.f97477a;
            biliImageLoader.with(biliImageView.getContext()).url(c6355q.f101685e).into(biliImageView);
            TextView textView = bVar.f97479c;
            String str = c6355q.f101686f;
            textView.setVisibility(!StringsKt.isBlank(str) ? 0 : 8);
            if (!StringsKt.isBlank(str)) {
                bVar.f97479c.setText(str);
            }
            String str2 = c6355q.f101684d;
            LottieAnimationView lottieAnimationView = bVar.f97480d;
            if (zAreEqual) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard(Uj0.c.b(14.0f, context), 0), 0, spannableStringBuilder.length(), 33);
                bVar.f97478b.setText(spannableStringBuilder);
                bVar.f97478b.setTypeface(Typeface.DEFAULT_BOLD);
                Integer numC = activityColorRepository.c();
                bVar.f97478b.setTextColor(numC != null ? numC.intValue() : ContextCompat.getColor(context, R$color.Brand_pink));
                lottieAnimationView.setVisibility(0);
                int iIntValue = numC != null ? numC.intValue() : ContextCompat.getColor(context, R$color.Brand_pink);
                Lazy lazy = p.f81943a;
                SimpleColorFilter simpleColorFilter = new SimpleColorFilter(iIntValue);
                KeyPath keyPath = new KeyPath("**");
                LottieValueCallback lottieValueCallback = new LottieValueCallback(simpleColorFilter);
                ColorFilter colorFilter = LottieProperty.COLOR_FILTER;
                lottieAnimationView.addValueCallback(keyPath, colorFilter, (LottieValueCallback<ColorFilter>) lottieValueCallback);
                if (numC != null) {
                    lottieAnimationView.addValueCallback(new KeyPath("**"), colorFilter, new com.bilibili.ship.theseus.ugc.intro.ugcseason.c(numC));
                }
                lottieAnimationView.playAnimation();
            } else {
                lottieAnimationView.cancelAnimation();
                lottieAnimationView.setVisibility(8);
                bVar.f97478b.setText(str2);
                bVar.f97478b.setTypeface(Typeface.DEFAULT);
                TextView textView2 = bVar.f97478b;
                Integer numH = activityColorRepository.h();
                textView2.setTextColor(numH != null ? numH.intValue() : ContextCompat.getColor(context, R$color.Text1));
            }
            View view = bVar.itemView;
            int size = this.f97475a.size();
            StringBuilder sbA = G0.b.a("视频，", str2, "，发布时间", str, "，");
            sbA.append(size);
            sbA.append("之");
            sbA.append(i7 + 1);
            view.setContentDescription(sbA.toString());
            bVar.itemView.setOnClickListener(new View.OnClickListener(zAreEqual, dVar, c6355q) { // from class: com.bilibili.ship.theseus.ugc.intro.ugcseason.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f97466a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final d f97467b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final C6355q f97468c;

                {
                    this.f97466a = zAreEqual;
                    this.f97467b = dVar;
                    this.f97468c = c6355q;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    boolean z6 = this.f97466a;
                    d dVar2 = this.f97467b;
                    C6355q c6355q2 = this.f97468c;
                    if (z6) {
                        return;
                    }
                    h hVar = dVar2.f97470a;
                    UgcSeasonService ugcSeasonService = hVar.f97496g;
                    ugcSeasonService.f97456e.f101577i.tryEmit(c6355q2);
                    HashMap map = new HashMap();
                    Ref.ObjectRef<C6353o> objectRef = hVar.f97491b;
                    map.put("goto_daid", String.valueOf(((C6353o) objectRef.element).f101669a));
                    map.put("goto_avid", String.valueOf(c6355q2.f101682b));
                    UnitedSeasonActivity unitedSeasonActivity = ((C6353o) objectRef.element).f101678k;
                    map.put("clockin_type", String.valueOf(unitedSeasonActivity != null ? Integer.valueOf(unitedSeasonActivity.k()) : null));
                    Z z7 = (Z) hVar.f97495f.element;
                    Long lValueOf = null;
                    if (z7 != null) {
                        lValueOf = Long.valueOf(z7.f101645a);
                    }
                    map.put("sectionid", String.valueOf(lValueOf));
                    Unit unit = Unit.INSTANCE;
                    PageReportService.g(ugcSeasonService.f97461k, "united.player-video-detail.selected-drama.video-card.click", map, 4);
                }
            });
            ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(bVar.itemView, new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new Fc0.m(1, dVar, c6355q)));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new b(p.a(viewGroup, 2131500411, viewGroup, false));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/d$b.class */
    public final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliImageView f97477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f97478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f97479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final LottieAnimationView f97480d;

        public b(@NotNull View view) {
            super(view);
            this.f97477a = view.findViewById(2131302584);
            this.f97478b = (TextView) view.findViewById(2131310619);
            this.f97479c = (TextView) view.findViewById(2131310598);
            this.f97480d = (LottieAnimationView) view.findViewById(2131305926);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/d$c.class */
    public final class c extends RecyclerView.Adapter<C0873d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ArrayList<Z> f97481a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f97482b;

        public c(d dVar) {
            this.f97482b = dVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f97481a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            C0873d c0873d = (C0873d) viewHolder;
            Context context = c0873d.itemView.getContext();
            final Z z6 = (Z) CollectionsKt.getOrNull(this.f97481a, i7);
            if (z6 == null) {
                return;
            }
            c0873d.f97483a.setText(z6.f101646b);
            final d dVar = this.f97482b;
            ActivityColorRepository activityColorRepository = dVar.f97470a.f97496g.f97460j;
            Z z7 = (Z) dVar.f97474e.getValue();
            if (z7 == null || z7.f101645a != z6.f101645a) {
                TextView textView = c0873d.f97483a;
                Integer numH = activityColorRepository.h();
                textView.setTextColor(numH != null ? numH.intValue() : ContextCompat.getColor(context, R$color.Text2));
                c0873d.f97483a.getPaint().setTextSize(Uj0.c.a(12.0f, context));
            } else {
                TextView textView2 = c0873d.f97483a;
                Integer numC = activityColorRepository.c();
                textView2.setTextColor(numC != null ? numC.intValue() : ContextCompat.getColor(context, R$color.Pi5));
                c0873d.f97483a.getPaint().setTextSize(Uj0.c.a(14.0f, context));
            }
            c0873d.itemView.setOnClickListener(new View.OnClickListener(dVar, z6) { // from class: com.bilibili.ship.theseus.ugc.intro.ugcseason.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final d f97484a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Z f97485b;

                {
                    this.f97484a = dVar;
                    this.f97485b = z6;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d dVar2 = this.f97484a;
                    Z z8 = this.f97485b;
                    dVar2.f97474e.setValue(z8);
                    h hVar = dVar2.f97470a;
                    PageReportService pageReportService = hVar.f97496g.f97461k;
                    HashMap map = new HashMap();
                    Ref.ObjectRef<C6353o> objectRef = hVar.f97491b;
                    map.put("goto_daid", String.valueOf(((C6353o) objectRef.element).f101669a));
                    Z z9 = (Z) hVar.f97495f.element;
                    map.put("sectionid", String.valueOf(z9 != null ? Long.valueOf(z9.f101645a) : ""));
                    map.put("goto_sectionid", String.valueOf(z8.f101645a));
                    UnitedSeasonActivity unitedSeasonActivity = ((C6353o) objectRef.element).f101678k;
                    map.put("clockin_type", String.valueOf(unitedSeasonActivity != null ? Integer.valueOf(unitedSeasonActivity.k()) : null));
                    Unit unit = Unit.INSTANCE;
                    PageReportService.g(pageReportService, "united.player-video-detail.selected-drama.sectionid.click", map, 4);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new C0873d(p.a(viewGroup, 2131500413, viewGroup, false));
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.d$d, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/d$d.class */
    public final class C0873d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TextView f97483a;

        public C0873d(@NotNull View view) {
            super(view);
            this.f97483a = (TextView) this.itemView.findViewById(2131310619);
        }
    }

    public d(@NotNull h hVar, @NotNull StateFlow stateFlow) {
        this.f97470a = hVar;
        this.f97471b = stateFlow;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(com.bilibili.ship.theseus.ugc.intro.ugcseason.d r4, tv.danmaku.bili.widget.RecyclerView r5) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.ugcseason.d.c(com.bilibili.ship.theseus.ugc.intro.ugcseason.d, tv.danmaku.bili.widget.RecyclerView):void");
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        F f7 = (F) viewBinding;
        Context context = f7.f25812a.getContext();
        TextView textView = f7.f25817f;
        TextView textView2 = f7.f25816e;
        ImageView imageView = f7.f25813b;
        h hVar = this.f97470a;
        ActivityColorRepository activityColorRepository = hVar.f97496g.f97460j;
        textView.setText(((C6353o) hVar.f97491b.element).f101674f);
        Integer numH = activityColorRepository.h();
        textView.setTextColor(numH != null ? numH.intValue() : ContextCompat.getColor(context, R$color.Ga10));
        if (StringsKt.isBlank(hVar.c())) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(hVar.c());
            Integer numC = activityColorRepository.c();
            textView2.setTextColor(numC != null ? numC.intValue() : ContextCompat.getColor(context, R$color.Pi5));
        }
        Integer numE = activityColorRepository.e();
        LinearLayoutManager linearLayoutManager = null;
        if (numE != null) {
            imageView.setColorFilter(numE.intValue());
        } else {
            imageView.setColorFilter((ColorFilter) null);
        }
        tv.danmaku.bili.widget.RecyclerView recyclerView = f7.f25814c;
        recyclerView.setAdapter(this.f97472c);
        tv.danmaku.bili.widget.RecyclerView recyclerView2 = f7.f25815d;
        recyclerView2.setAdapter(this.f97473d);
        imageView.setOnClickListener(new com.bilibili.bililive.biz.livehome.videofeed.adapter.c(this, 2));
        this.f97474e.setValue(hVar.a());
        c(this, recyclerView2);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        }
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPositionWithOffset(hVar.f97493d.element, 0);
        }
        hVar.f97490a.element = new f(this, recyclerView2, recyclerView);
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new UgcFineSeasonComponent$bind$4(this, textView, imageView, recyclerView, recyclerView2, context, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        F fInflate = F.inflate(layoutInflater, viewGroup, false);
        tv.danmaku.bili.widget.RecyclerView recyclerView = fInflate.f25815d;
        tv.danmaku.bili.widget.RecyclerView recyclerView2 = fInflate.f25814c;
        recyclerView2.setNestedScrollingEnabled(false);
        recyclerView2.setItemAnimator(null);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        return fInflate;
    }
}
