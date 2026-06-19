package com.bilibili.ship.theseus.ogv.followseason;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.material.P1;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.community.follow.FollowSeasonStatus;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import javax.inject.Inject;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/followseason/OgvPlayerFollowSeasonWidget.class */
@StabilityInferred(parameters = 0)
public final class OgvPlayerFollowSeasonWidget extends FrameLayout implements IControlWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f92175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final OgvSeason f92176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PageReportService f92177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f92178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f92179e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/followseason/OgvPlayerFollowSeasonWidget$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OgvPlayerFollowSeasonWidget f92182a;

        public a(OgvPlayerFollowSeasonWidget ogvPlayerFollowSeasonWidget) {
            this.f92182a = ogvPlayerFollowSeasonWidget;
        }

        public final Object emit(Object obj, Continuation continuation) {
            Unit unit;
            if (((OgvEpisode) obj) == null) {
                unit = Unit.INSTANCE;
            } else {
                OgvPlayerFollowSeasonWidget ogvPlayerFollowSeasonWidget = this.f92182a;
                if (((Boolean) ogvPlayerFollowSeasonWidget.f92179e.getValue()).booleanValue()) {
                    ogvPlayerFollowSeasonWidget.setVisibility(0);
                    long j7 = ogvPlayerFollowSeasonWidget.f92176b.f94449a;
                    com.bilibili.community.follow.c cVar = com.bilibili.community.follow.c.a;
                    com.bilibili.community.follow.b bVar = (com.bilibili.community.follow.b) com.bilibili.community.follow.c.c.c(com.bilibili.community.follow.c.a(j7));
                    com.bilibili.community.follow.b bVar2 = bVar;
                    if (bVar == null) {
                        bVar2 = new com.bilibili.community.follow.b(false, FollowSeasonStatus.UNKNOWN);
                    }
                    PageReportService.i(ogvPlayerFollowSeasonWidget.f92177c, "player.player.portrait.follow.show", MapsKt.mapOf(TuplesKt.to("follow_state", bVar2.a ? "1" : "0")), 4);
                } else {
                    ogvPlayerFollowSeasonWidget.setVisibility(8);
                }
                unit = Unit.INSTANCE;
            }
            return unit;
        }
    }

    @Inject
    public OgvPlayerFollowSeasonWidget(@NotNull Context context, @NotNull CoroutineScope coroutineScope, @NotNull OgvSeason ogvSeason, @NotNull PageReportService pageReportService, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull StateFlow<Boolean> stateFlow) {
        super(context);
        this.f92175a = coroutineScope;
        this.f92176b = ogvSeason;
        this.f92177c = pageReportService;
        this.f92178d = ogvCurrentEpisodeRepository;
        this.f92179e = stateFlow;
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(770533334, true, new P1(this, 1)));
        addView(composeView);
    }

    @Nullable
    public final Object bindToView(@NotNull Continuation<? super Unit> continuation) {
        Object objCollect = this.f92178d.f92119v.collect(new a(this), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
