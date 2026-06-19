package com.bilibili.ship.theseus.ogv.intro.section.service;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.lib.theme.R$color;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection;
import com.bilibili.ship.theseus.ogv.intro.section.ui.c;
import com.bilibili.ship.theseus.ogv.intro.section.ui.r;
import com.bilibili.ship.theseus.ogv.intro.section.ui.s;
import com.bilibili.ship.theseus.ogv.intro.section.ui.t;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService.class */
@StabilityInferred(parameters = 0)
public final class OgvPreviewSectionMergedUIComponentService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final e f93748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final OgvSeason f93749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f93750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Context f93751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f93752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f93753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f93754g;

    @NotNull
    public final PageReportService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Gu0.a f93755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f93756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f93757k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<EpisodeSection> f93758l = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<List<EpisodeSection>> f93759m = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final a f93760n = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$a.class */
    public static final class a extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Paint f93761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OgvPreviewSectionMergedUIComponentService f93762b;

        public a(OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService) {
            this.f93762b = ogvPreviewSectionMergedUIComponentService;
            Paint paintA = qe.i.a(true);
            paintA.setColor(ContextCompat.getColor(ogvPreviewSectionMergedUIComponentService.f93751d, R$color.Line_regular));
            this.f93761a = paintA;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService = this.f93762b;
            if (childAdapterPosition != 0) {
                rect.left = Uj0.c.b(12, ogvPreviewSectionMergedUIComponentService.f93751d);
            }
            rect.right = Uj0.c.b(13, ogvPreviewSectionMergedUIComponentService.f93751d);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            super.onDraw(canvas, recyclerView, state);
            OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService = this.f93762b;
            Context context = ogvPreviewSectionMergedUIComponentService.f93751d;
            float f7 = 12;
            int iB = Uj0.c.b(f7, context);
            for (View view : ViewGroupKt.getChildren(recyclerView)) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (childAdapterPosition != recyclerView.getChildCount() - 1 && childAdapterPosition != -1) {
                    int height = view.getHeight();
                    int paddingTop = recyclerView.getPaddingTop();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    float top = ((height - iB) / 2.0f) + view.getTop() + paddingTop + ((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r10.topMargin : 0);
                    float f8 = iB;
                    int right = view.getRight();
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    canvas.drawRect(Uj0.c.b(f7, ogvPreviewSectionMergedUIComponentService.f93751d) + right + (marginLayoutParams != null ? marginLayoutParams.rightMargin : 0), top, Uj0.c.b(1, ogvPreviewSectionMergedUIComponentService.f93751d) + r0, top + f8, this.f93761a);
                }
            }
        }
    }

    @Inject
    public OgvPreviewSectionMergedUIComponentService(@NotNull e eVar, @NotNull OgvSeason ogvSeason, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull Context context, @NotNull CoroutineScope coroutineScope, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull PageReportService pageReportService, @NotNull Gu0.a aVar, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar2) {
        this.f93748a = eVar;
        this.f93749b = ogvSeason;
        this.f93750c = ogvCurrentEpisodeRepository;
        this.f93751d = context;
        this.f93752e = coroutineScope;
        this.f93753f = theseusFloatLayerService;
        this.f93754g = gVar;
        this.h = pageReportService;
        this.f93755i = aVar;
        this.f93756j = aVar2;
    }

    public static final r a(OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService, EpisodeSection episodeSection, int i7) {
        ogvPreviewSectionMergedUIComponentService.getClass();
        r rVar = new r(episodeSection.f93527e, new b(ogvPreviewSectionMergedUIComponentService, episodeSection, i7));
        String str = rVar.f93873d;
        String str2 = episodeSection.f93523a;
        if (!Intrinsics.areEqual(str2, str)) {
            rVar.f93873d = str2;
            rVar.notifyPropertyChanged(655);
        }
        EpisodeSection episodeSection2 = (EpisodeSection) ogvPreviewSectionMergedUIComponentService.f93758l.getValue();
        boolean z6 = false;
        if (episodeSection2 != null) {
            z6 = false;
            if (episodeSection.f93527e == episodeSection2.f93527e) {
                z6 = true;
            }
        }
        if (z6 != rVar.f93874e) {
            rVar.f93874e = z6;
            rVar.notifyPropertyChanged(550);
        }
        return rVar;
    }

    @NotNull
    public final RunningUIComponent b(@NotNull List<EpisodeSection> list, @Nullable List<Hu0.c> list2) {
        s.a aVar = new s.a(new OgvPreviewSectionMergedUIComponentService$buildMergedTitlesVm$1(this));
        RecyclerView.ItemDecoration itemDecoration = aVar.f93878c;
        a aVar2 = this.f93760n;
        if (!Intrinsics.areEqual(aVar2, itemDecoration)) {
            aVar.f93878c = aVar2;
            aVar.notifyPropertyChanged(326);
        }
        UIComponent sVar = new s(aVar);
        RunningUIComponent runningUIComponent = new RunningUIComponent(sVar, 0, new OgvPreviewSectionMergedUIComponentService$buildMergedTitlesRunningUIComponent$1(this, aVar, null), 2);
        c.a aVar3 = new c.a();
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        String string = this.f93751d.getString(2131840048);
        if (!Intrinsics.areEqual(string, aVar3.f93827c)) {
            aVar3.f93827c = string;
            aVar3.notifyPropertyChanged(193);
        }
        UIComponent cVar = new com.bilibili.ship.theseus.ogv.intro.section.ui.c(MutableStateFlow, aVar3, this.f93750c.f92119v);
        return new RunningUIComponent(new t(CollectionsKt.listOf(new UIComponent[]{sVar, cVar})), 0, new OgvPreviewSectionMergedUIComponentService$create$1(new RunningUIComponent(cVar, 0, new OgvPreviewSectionMergedUIComponentService$buildEpisodeListUIComponent$1(this, MutableStateFlow, this.f93749b, aVar3, null), 2), runningUIComponent, this, list2, list, null), 2);
    }
}
