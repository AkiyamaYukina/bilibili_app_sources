package com.bilibili.ship.theseus.united.page.toolbar.actionview.miniplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import dv0.E0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/miniplayer/a.class */
@StabilityInferred(parameters = 0)
public final class a extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public E0 f103340a;

    public a(@NotNull Context context) {
        super(context);
        setBinding(E0.inflate(LayoutInflater.from(getContext()), this));
    }

    @NotNull
    public final E0 getBinding() {
        E0 e02 = this.f103340a;
        if (e02 != null) {
            return e02;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void setBinding(@NotNull E0 e02) {
        this.f103340a = e02;
    }
}
