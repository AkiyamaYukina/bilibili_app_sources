package com.bilibili.ogv.operation2.inlinevideo;

import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/D.class */
final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private View f70872a;

    public D() {
        this(null, 1, null);
    }

    public D(@Nullable View view) {
        this.f70872a = view;
    }

    public /* synthetic */ D(View view, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : view);
    }

    @Nullable
    public final View a() {
        return this.f70872a;
    }

    public final void b(@Nullable View view) {
        this.f70872a = view;
    }
}
