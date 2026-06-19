package com.bilibili.ship.theseus.united.page.toolbar.actionview.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import dv0.D0;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/home/a.class */
@StabilityInferred(parameters = 0)
public final class a extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public D0 f103330a;

    @JvmOverloads
    public a(@NotNull Context context) {
        this(context, 0);
    }

    public a(Context context, int i7) {
        super(context, null, 0);
        this.f103330a = D0.inflate(LayoutInflater.from(context), this);
    }

    @NotNull
    public final D0 getBinding() {
        return this.f103330a;
    }

    public final void setBinding(@NotNull D0 d02) {
        this.f103330a = d02;
    }
}
