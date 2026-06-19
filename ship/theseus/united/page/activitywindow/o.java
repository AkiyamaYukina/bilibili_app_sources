package com.bilibili.ship.theseus.united.page.activitywindow;

import android.graphics.Rect;
import com.bilibili.lib.ui.helper.NotchCompat;
import java.util.List;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/o.class */
public final class o implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ActivityWindowEdgeToEdgePropertyService f98881a;

    public o(@NotNull ActivityWindowEdgeToEdgePropertyService activityWindowEdgeToEdgePropertyService) {
        this.f98881a = activityWindowEdgeToEdgePropertyService;
    }

    @Override // com.bilibili.ship.theseus.united.page.activitywindow.t
    @NotNull
    public final MutableStateFlow a() {
        return this.f98881a.h;
    }

    @Override // com.bilibili.ship.theseus.united.page.activitywindow.t
    public final int b() {
        ActivityWindowEdgeToEdgePropertyService activityWindowEdgeToEdgePropertyService = this.f98881a;
        int iMax = 0;
        if (NotchCompat.hasDisplayCutoutHardware(activityWindowEdgeToEdgePropertyService.f98840i)) {
            List<Rect> displayCutoutSizeHardware = NotchCompat.getDisplayCutoutSizeHardware(activityWindowEdgeToEdgePropertyService.f98840i);
            if (!displayCutoutSizeHardware.isEmpty()) {
                iMax = 0;
                for (Rect rect : displayCutoutSizeHardware) {
                    if (rect.top == 0) {
                        iMax = Math.max(iMax, rect.bottom);
                    }
                }
                bilibili.live.app.service.resolver.c.a(iMax, "Cutout hardware height: ", "ActivityWindowEdgeToEdgePropertyService");
            }
        }
        return iMax;
    }
}
