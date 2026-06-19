package com.bilibili.ship.theseus.united.page.activitywindow;

import android.graphics.Rect;
import android.view.Window;
import com.bilibili.lib.ui.helper.NotchCompat;
import java.util.List;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/p.class */
public final class p implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ActivityWindowPropertyService f98882a;

    public p(@NotNull ActivityWindowPropertyService activityWindowPropertyService) {
        this.f98882a = activityWindowPropertyService;
    }

    @Override // com.bilibili.ship.theseus.united.page.activitywindow.t
    @NotNull
    public final MutableStateFlow a() {
        return this.f98882a.h;
    }

    @Override // com.bilibili.ship.theseus.united.page.activitywindow.t
    public final int b() {
        Window window = this.f98882a.f98848d.getWindow();
        int iMax = 0;
        if (NotchCompat.hasDisplayCutoutHardware(window)) {
            List<Rect> displayCutoutSizeHardware = NotchCompat.getDisplayCutoutSizeHardware(window);
            if (!displayCutoutSizeHardware.isEmpty()) {
                iMax = 0;
                for (Rect rect : displayCutoutSizeHardware) {
                    if (rect.top == 0) {
                        iMax = Math.max(iMax, rect.bottom);
                    }
                }
                bilibili.live.app.service.resolver.c.a(iMax, "Cutout hardware height: ", "ActivityWindowPropertyRepository");
            }
        }
        return iMax;
    }
}
