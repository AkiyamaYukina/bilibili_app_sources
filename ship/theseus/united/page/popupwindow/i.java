package com.bilibili.ship.theseus.united.page.popupwindow;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.popupwindow.TheseusPopupWindowService;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/popupwindow/i.class */
@StabilityInferred(parameters = 0)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f102452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<g> f102453b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public TheseusPopupWindowService.a f102454c;

    public i(@NotNull Context context) {
        this.f102452a = context;
    }
}
