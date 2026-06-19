package com.bilibili.ship.theseus.ogv.report;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import javax.inject.Inject;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/report/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/report/b$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f94395a;

        @Inject
        public a() {
        }
    }

    @Inject
    public b(@Nullable String str, @NotNull PageReportService pageReportService, @NotNull a aVar) {
        if (aVar.f94395a) {
            return;
        }
        aVar.f94395a = true;
        if (str != null) {
            PageReportService.i(pageReportService, "united.player-video-detail.activate-inbound.0.show", MapsKt.mapOf(TuplesKt.to("h5_awaken_params", str)), 4);
        }
    }
}
