package com.bilibili.ship.theseus.ugc.pages;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ship.theseus.ugc.pages.UgcPagesPanelComponent$bind$2;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository;
import com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonDetailRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/UgcPagesService.class */
@StabilityInferred(parameters = 0)
public final class UgcPagesService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f97999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f98000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<Av0.a> f98001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final UGCPlaybackRepository f98002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final UnitedSeasonDetailRepository f98003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C7893a f98004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f98005g;

    @NotNull
    public final PageReportService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f98006i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f98007j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f98008k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Av0.a f98009l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public Job f98010m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public UgcPagesPanelComponent$bind$2.a f98011n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lazy f98012o = LazyKt.lazy(new Ad.b(this, 4));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/UgcPagesService$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Ref.ObjectRef<g> f98013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UgcPagesService f98014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Ref.BooleanRef f98015c;

        public a(Ref.ObjectRef<g> objectRef, UgcPagesService ugcPagesService, Ref.BooleanRef booleanRef) {
            this.f98013a = objectRef;
            this.f98014b = ugcPagesService;
            this.f98015c = booleanRef;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/UgcPagesService$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UgcPagesService f98016a;

        public b(UgcPagesService ugcPagesService) {
            this.f98016a = ugcPagesService;
        }
    }

    @Inject
    public UgcPagesService(@NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull List<Av0.a> list, @NotNull UGCPlaybackRepository uGCPlaybackRepository, @NotNull UnitedSeasonDetailRepository unitedSeasonDetailRepository, @NotNull C7893a c7893a, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull DanmakuCompoundRepository danmakuCompoundRepository, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar2) {
        this.f97999a = coroutineScope;
        this.f98000b = aVar;
        this.f98001c = list;
        this.f98002d = uGCPlaybackRepository;
        this.f98003e = unitedSeasonDetailRepository;
        this.f98004f = c7893a;
        this.f98005g = theseusFloatLayerService;
        this.h = pageReportService;
        this.f98006i = gVar;
        this.f98007j = introContentSizeRepository;
        this.f98008k = aVar2;
        danmakuCompoundRepository.f99385v = list.size() != 1 ? false : true;
    }

    @NotNull
    public final RunningUIComponent a() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        return new RunningUIComponent(new k(new a(objectRef, this, new Ref.BooleanRef()), this.f98007j.f100020a), 0, new UgcPagesService$create$1(this, objectRef, null), 2);
    }
}
