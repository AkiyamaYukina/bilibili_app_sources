package com.bilibili.ship.theseus.united.page.interactvideo;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f99960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TheseusInteractVideoService f99961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f99962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public FunctionWidgetToken f99963d;

    public d(@NotNull Context context, @NotNull TheseusInteractVideoService theseusInteractVideoService, @NotNull AbsFunctionWidgetService absFunctionWidgetService) {
        this.f99960a = context;
        this.f99961b = theseusInteractVideoService;
        this.f99962c = absFunctionWidgetService;
    }

    public final boolean a() {
        FunctionWidgetToken functionWidgetToken = this.f99963d;
        boolean z6 = false;
        if (functionWidgetToken != null) {
            z6 = false;
            if (functionWidgetToken.isShowing()) {
                z6 = true;
            }
        }
        return z6;
    }
}
