package com.bilibili.ship.theseus.ogv.intro.section.service;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection;
import com.bilibili.ship.theseus.ogv.intro.section.bean.SectionType;
import com.bilibili.ship.theseus.ogv.intro.section.ui.c;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/e.class */
@StabilityInferred(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final l f93785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Gu0.a f93786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f93787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f93788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Context f93789e;

    @Inject
    public e(@NotNull l lVar, @NotNull Gu0.a aVar, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull Context context) {
        this.f93785a = lVar;
        this.f93786b = aVar;
        this.f93787c = ogvCurrentEpisodeRepository;
        this.f93788d = introContentSizeRepository;
        this.f93789e = context;
    }

    public static RunningUIComponent a(e eVar, OgvSeason ogvSeason, EpisodeSection episodeSection) {
        String string;
        eVar.getClass();
        c.a aVar = new c.a();
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(eVar.b(ogvSeason, episodeSection.h, episodeSection.f93531j, episodeSection.f93534m, false));
        SectionType sectionType = SectionType.FEATURE;
        SectionType sectionType2 = episodeSection.f93531j;
        MutableStateFlow<Boolean> mutableStateFlow = sectionType2 == sectionType ? eVar.f93786b.f7441i : null;
        if (sectionType2 == sectionType) {
            string = eVar.f93789e.getString(2131840045);
        } else {
            string = eVar.f93789e.getString(2131840048) + ", " + sectionType2;
        }
        if (!Intrinsics.areEqual(string, aVar.f93827c)) {
            aVar.f93827c = string;
            aVar.notifyPropertyChanged(193);
        }
        return new RunningUIComponent(new com.bilibili.ship.theseus.ogv.intro.section.ui.c(MutableStateFlow, aVar, eVar.f93787c.f92119v), 0, new OgvSectionEpisodeListUIComponentService$buildEpisodeListUIComponent$1(episodeSection, MutableStateFlow, eVar, ogvSeason, false, mutableStateFlow, aVar, null), 2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.bilibili.app.gemini.ui.UIComponent<?>> b(@org.jetbrains.annotations.NotNull final com.bilibili.ship.theseus.ogv.intro.section.floatlayer.v r12, @org.jetbrains.annotations.NotNull java.util.List<com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode> r13, @org.jetbrains.annotations.NotNull final com.bilibili.ship.theseus.ogv.intro.section.bean.SectionType r14, @org.jetbrains.annotations.Nullable com.bilibili.ship.theseus.ogv.intro.section.bean.EpBgInfo r15, boolean r16) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 739
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.section.service.e.b(com.bilibili.ship.theseus.ogv.intro.section.floatlayer.v, java.util.List, com.bilibili.ship.theseus.ogv.intro.section.bean.SectionType, com.bilibili.ship.theseus.ogv.intro.section.bean.EpBgInfo, boolean):java.util.List");
    }
}
