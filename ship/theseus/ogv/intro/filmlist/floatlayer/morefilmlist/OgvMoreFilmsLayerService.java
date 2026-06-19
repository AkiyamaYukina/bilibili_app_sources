package com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ship.theseus.ogv.intro.filmlist.OgvFilms;
import com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm.OgvAllFilmsLayerService;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.List;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/morefilmlist/OgvMoreFilmsLayerService.class */
@StabilityInferred(parameters = 0)
public final class OgvMoreFilmsLayerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f92755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PageReportService f92756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f92757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f92758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f92759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f92760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final OgvSeason f92761g;

    @NotNull
    public final OgvAllFilmsLayerService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f92762i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/morefilmlist/OgvMoreFilmsLayerService$a.class */
    public interface a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist.OgvMoreFilmsLayerService$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/morefilmlist/OgvMoreFilmsLayerService$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0696a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0696a f92763a = new Object();
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/morefilmlist/OgvMoreFilmsLayerService$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f92764a = new Object();
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/morefilmlist/OgvMoreFilmsLayerService$a$c.class */
        @StabilityInferred(parameters = 0)
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final List<OgvFilms> f92765a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final List<ExposureEntry> f92766b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final List<List<ExposureEntry>> f92767c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            public final ExposureEntry f92768d;

            /* JADX WARN: Multi-variable type inference failed */
            public c(@NotNull List<OgvFilms> list, @NotNull List<? extends ExposureEntry> list2, @NotNull List<? extends List<? extends ExposureEntry>> list3, @NotNull ExposureEntry exposureEntry) {
                this.f92765a = list;
                this.f92766b = list2;
                this.f92767c = list3;
                this.f92768d = exposureEntry;
            }
        }
    }

    @Inject
    public OgvMoreFilmsLayerService(@NotNull Context context, @NotNull PageReportService pageReportService, @NotNull CoroutineScope coroutineScope, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, long j7, @NotNull OgvSeason ogvSeason, @NotNull OgvAllFilmsLayerService ogvAllFilmsLayerService, @NotNull IntroContentSizeRepository introContentSizeRepository) {
        this.f92755a = context;
        this.f92756b = pageReportService;
        this.f92757c = coroutineScope;
        this.f92758d = theseusFloatLayerService;
        this.f92759e = gVar;
        this.f92760f = j7;
        this.f92761g = ogvSeason;
        this.h = ogvAllFilmsLayerService;
        this.f92762i = introContentSizeRepository;
    }

    public final void a(int i7) {
        BuildersKt.launch$default(this.f92757c, (CoroutineContext) null, (CoroutineStart) null, new OgvMoreFilmsLayerService$showMoreFilmsLayer$1(this, i7, null), 3, (Object) null);
    }
}
