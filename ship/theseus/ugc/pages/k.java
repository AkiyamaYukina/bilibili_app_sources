package com.bilibili.ship.theseus.ugc.pages;

import Vu0.v;
import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.LeadingMarginSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.material3.internal.C4094s;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.ship.theseus.ugc.pages.UgcPagesService;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonDetailRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.recycler.HLinearLayoutManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/k.class */
@StabilityInferred(parameters = 0)
public final class k implements UIComponent<com.bilibili.app.gemini.ui.n<v>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final UgcPagesService.a f98029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f98030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a f98031c = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/k$a.class */
    public final class a extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ArrayList<Av0.a> f98032a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f98033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k f98034c;

        public a(k kVar) {
            this.f98034c = kVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f98032a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            b bVar = (b) viewHolder;
            if (this.f98032a.isEmpty()) {
                return;
            }
            bVar.f98036b++;
            bVar.f98038d.cancelAnimation();
            bVar.f98038d.setVisibility(8);
            TextView textView = bVar.f98037c;
            Av0.a aVar = (Av0.a) CollectionsKt.getOrNull(this.f98032a, i7);
            if (aVar == null) {
                return;
            }
            Context context = bVar.itemView.getContext();
            bVar.f98039e = aVar;
            bVar.f98035a = new i(this.f98034c);
            textView.setSelected(false);
            int i8 = this.f98033b;
            String str = aVar.f593d;
            if (i8 == i7) {
                textView.setSelected(true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard(DimenUtilsKt.dpToPx(12), 0), 0, spannableStringBuilder.length(), 33);
                textView.setText(spannableStringBuilder);
                textView.setTextColor(ThemeUtils.getColorById(context, 2131103284));
                textView.setTypeface(Typeface.DEFAULT_BOLD);
                bVar.f98038d.setVisibility(0);
                bVar.f98038d.playAnimation();
                if (textView.getWidth() <= 0) {
                    textView.getViewTreeObserver().addOnGlobalLayoutListener(new j(textView, spannableStringBuilder, bVar));
                } else {
                    spannableStringBuilder.toString();
                    textView.post(new h(bVar, bVar.f98036b, textView, bVar.f98038d));
                }
            } else {
                textView.setText(str);
                textView.setTextColor(ThemeUtils.getThemeAttrColor(context, R.attr.textColorPrimary));
                textView.setTypeface(Typeface.DEFAULT);
            }
            String str2 = textView.isSelected() ? "已选定，" : "";
            CharSequence text = textView.getText();
            textView.setContentDescription(str2 + ((Object) text) + "，共" + this.f98032a.size() + "集");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new b(p.a(viewGroup, 2131500383, viewGroup, false));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/k$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public i f98035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f98036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final TextView f98037c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final LottieAnimationView f98038d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public Av0.a f98039e;

        public b(@NotNull View view) {
            super(view);
            this.f98037c = (TextView) view.findViewById(2131308958);
            this.f98038d = (LottieAnimationView) view.findViewById(2131305926);
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@NotNull View view) {
            i iVar;
            Av0.a aVar = this.f98039e;
            if (aVar == null || (iVar = this.f98035a) == null) {
                return;
            }
            UgcPagesService ugcPagesService = iVar.f98025a.f98029a.f98014b;
            UGCPlaybackRepository uGCPlaybackRepository = ugcPagesService.f98002d;
            com.bilibili.ship.theseus.united.page.view.a aVar2 = ugcPagesService.f98000b;
            UGCPlaybackRepository.g(uGCPlaybackRepository, aVar2.a(), aVar.f591b, null, null, 0, 12);
            HashMap mapC = O4.b.c("module_type", "2");
            mapC.put("goto_avid", String.valueOf(aVar2.a()));
            mapC.put("goto_cid", String.valueOf(aVar.f591b));
            Unit unit = Unit.INSTANCE;
            PageReportService.g(ugcPagesService.h, "united.player-video-detail.multi-p.p.click", mapC, 4);
        }
    }

    public k(@NotNull UgcPagesService.a aVar, @NotNull StateFlow stateFlow) {
        this.f98029a = aVar;
        this.f98030b = stateFlow;
    }

    public static final void a(final k kVar, final RecyclerView recyclerView, Av0.a aVar) {
        a aVar2 = kVar.f98031c;
        aVar2.getClass();
        int i7 = 0;
        if (!aVar2.f98032a.isEmpty()) {
            if (aVar == null) {
                i7 = 0;
            } else {
                int size = aVar2.f98032a.size();
                int i8 = 0;
                while (true) {
                    i7 = 0;
                    if (i8 >= size) {
                        break;
                    }
                    if (aVar2.f98032a.get(i8).f591b == aVar.f591b) {
                        i7 = i8;
                        break;
                    }
                    i8++;
                }
            }
        }
        aVar2.f98033b = i7;
        if (recyclerView.isComputingLayout()) {
            recyclerView.post(new Runnable(kVar) { // from class: com.bilibili.ship.theseus.ugc.pages.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final k f98018a;

                {
                    this.f98018a = kVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f98018a.f98031c.notifyDataSetChanged();
                }
            });
        } else {
            kVar.f98031c.notifyDataSetChanged();
        }
        recyclerView.post(new Runnable(recyclerView, kVar) { // from class: com.bilibili.ship.theseus.ugc.pages.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RecyclerView f98019a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final k f98020b;

            {
                this.f98019a = recyclerView;
                this.f98020b = kVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                RecyclerView recyclerView2 = this.f98019a;
                k kVar2 = this.f98020b;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.getLayoutManager();
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int i9 = kVar2.f98031c.f98033b;
                if (Math.abs(i9 - iFindFirstVisibleItemPosition) > 10) {
                    linearLayoutManager.scrollToPositionWithOffset(i9, 0);
                } else {
                    recyclerView2.smoothScrollToPosition(i9);
                }
            }
        });
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        v vVar = (v) ((com.bilibili.app.gemini.ui.n) viewEntry).a;
        ConstraintLayout constraintLayout = vVar.f25979a;
        Context context = constraintLayout.getContext();
        vVar.f25980b.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.ship.theseus.ugc.pages.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final k f98017a;

            {
                this.f98017a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UgcPagesService ugcPagesService = this.f98017a.f98029a.f98014b;
                PageReportService.g(ugcPagesService.h, "united.player-video-detail.multi-p.more.click", null, 6);
                UnitedSeasonDetailRepository unitedSeasonDetailRepository = ugcPagesService.f98003e;
                if (unitedSeasonDetailRepository.h != null) {
                    unitedSeasonDetailRepository.e(ugcPagesService.f98000b.c());
                    return;
                }
                Job job = ugcPagesService.f98010m;
                if (job == null || !job.isActive()) {
                    ugcPagesService.f98010m = BuildersKt.launch$default(ugcPagesService.f97999a, (CoroutineContext) null, (CoroutineStart) null, new UgcPagesService$showPagesLayer$1(ugcPagesService, null), 3, (Object) null);
                }
            }
        });
        RecyclerView recyclerView = vVar.f25981c;
        l lVar = new l(recyclerView, this);
        UgcPagesService.a aVar = this.f98029a;
        aVar.f98013a.element = lVar;
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(constraintLayout, new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new C4094s(this, 3)));
        UgcPagesService ugcPagesService = aVar.f98014b;
        List<Av0.a> list = ugcPagesService.f98001c;
        a aVar2 = this.f98031c;
        aVar2.f98032a.clear();
        aVar2.f98032a.addAll(list);
        a(this, recyclerView, ugcPagesService.f98009l);
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new UgcPagesComponent$bindToView$5(this, constraintLayout, recyclerView, context, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        v vVarInflate = v.inflate(LayoutInflater.from(context), viewGroup, false);
        RecyclerView recyclerView = vVarInflate.f25981c;
        recyclerView.setLayoutManager(new HLinearLayoutManager(context));
        recyclerView.setAdapter(this.f98031c);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        return new com.bilibili.app.gemini.ui.n(vVarInflate);
    }
}
