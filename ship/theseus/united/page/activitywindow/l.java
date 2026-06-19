package com.bilibili.ship.theseus.united.page.activitywindow;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import java.util.Set;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/l.class */
@StabilityInferred(parameters = 0)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final t f98873a;

    @Inject
    public l(@NotNull yW0.b bVar, @NotNull yW0.b bVar2) {
        t pVar;
        if (((Set) a.f98857b.getValue()).contains("edge_to_edge")) {
            BLog.i("ActivityWindowPropertyServiceDelegate-<init>", "[theseus-united-ActivityWindowPropertyServiceDelegate-<init>] " + C4496a.a("use ActivityWindowEdgeToEdgePropertyService, config:", a.a()));
            pVar = new o((ActivityWindowEdgeToEdgePropertyService) bVar2.get());
        } else {
            BLog.i("ActivityWindowPropertyServiceDelegate-<init>", "[theseus-united-ActivityWindowPropertyServiceDelegate-<init>] " + C4496a.a("use ActivityWindowPropertyService, config:", a.a()));
            pVar = new p((ActivityWindowPropertyService) bVar.get());
        }
        this.f98873a = pVar;
    }
}
