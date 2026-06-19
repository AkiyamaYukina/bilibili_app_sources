package com.bilibili.playerbizcommonv2.danmaku.input.panel;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.result.vertical.live.report.ReporterMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/a.class */
@StabilityInferred(parameters = 0)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ViewGroup f81001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f81002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f81003c;

    public final void j(@NotNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = this.f81001a;
        ViewParent parent = viewGroup2 != null ? viewGroup2.getParent() : null;
        if (parent == null) {
            throw new IllegalArgumentException("AbsInputPanel has not attach to a container");
        }
        if (!Intrinsics.areEqual(parent, viewGroup)) {
            throw new IllegalArgumentException("AbsInputPanel has attach to another contaienr");
        }
        p();
        viewGroup.removeView(this.f81001a);
        this.f81003c = false;
        n();
    }

    public void k() {
    }

    public void l(@NotNull com.bilibili.playerbizcommonv2.danmaku.input.a aVar) {
    }

    @NotNull
    public abstract ViewGroup m(@NotNull Context context, @NotNull ViewGroup viewGroup);

    public void n() {
    }

    public void o() {
    }

    public void p() {
        if (this.f81001a == null) {
            return;
        }
        this.f81002b = false;
        o();
    }

    public void q() {
        if (this.f81001a == null) {
            return;
        }
        this.f81002b = true;
        r();
    }

    public void r() {
    }

    public void s() {
    }

    public void t() {
    }

    @NotNull
    public final String toString() {
        return ReporterMap.LEFT_BRACES + getClass().getSimpleName() + ":" + this.f81003c + ReporterMap.RIGHT_BRACES;
    }

    public abstract void u(@NotNull ViewGroup viewGroup);
}
