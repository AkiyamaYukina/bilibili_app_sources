package com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.List;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/allfilm/OgvAllFilmsLayerService.class */
@StabilityInferred(parameters = 0)
public final class OgvAllFilmsLayerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f92698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f92699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f92700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f92701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PageReportService f92702e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/allfilm/OgvAllFilmsLayerService$a.class */
    public interface a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm.OgvAllFilmsLayerService$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/allfilm/OgvAllFilmsLayerService$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0695a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0695a f92703a = new Object();
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/allfilm/OgvAllFilmsLayerService$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f92704a = new Object();
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/allfilm/OgvAllFilmsLayerService$a$c.class */
        @StabilityInferred(parameters = 0)
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final OgvAllFilms f92705a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final List<ExposureEntry> f92706b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final ExposureEntry f92707c;

            public c(@NotNull OgvAllFilms ogvAllFilms, @NotNull List<? extends ExposureEntry> list, @NotNull ExposureEntry exposureEntry) {
                this.f92705a = ogvAllFilms;
                this.f92706b = list;
                this.f92707c = exposureEntry;
            }
        }
    }

    @Inject
    public OgvAllFilmsLayerService(@NotNull Context context, @NotNull CoroutineScope coroutineScope, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull PageReportService pageReportService) {
        this.f92698a = context;
        this.f92699b = coroutineScope;
        this.f92700c = theseusFloatLayerService;
        this.f92701d = gVar;
        this.f92702e = pageReportService;
    }

    public final void a(long j7) {
        BuildersKt.launch$default(this.f92699b, (CoroutineContext) null, (CoroutineStart) null, new OgvAllFilmsLayerService$showAllFilmsLayer$1(this, j7, null), 3, (Object) null);
    }
}
