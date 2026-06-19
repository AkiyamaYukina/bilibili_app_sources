package com.bilibili.playset.editor.widget;

import H3.y0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.playset.editor.widget.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/widget/a.class */
@StabilityInferred(parameters = 1)
public final class C5951a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f84980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f84981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f84982c;

    public C5951a() {
        this(7, null, null);
    }

    public C5951a(int i7, String str, Function0 function0) {
        str = (i7 & 1) != 0 ? null : str;
        function0 = (i7 & 4) != 0 ? new y0(8) : function0;
        this.f84980a = str;
        this.f84981b = true;
        this.f84982c = function0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5951a)) {
            return false;
        }
        C5951a c5951a = (C5951a) obj;
        return Intrinsics.areEqual(this.f84980a, c5951a.f84980a) && this.f84981b == c5951a.f84981b && Intrinsics.areEqual(this.f84982c, c5951a.f84982c);
    }

    public final int hashCode() {
        String str = this.f84980a;
        return this.f84982c.hashCode() + androidx.compose.animation.z.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f84981b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomSheetItemLabel(name=");
        sb.append(this.f84980a);
        sb.append(", hasArrow=");
        sb.append(this.f84981b);
        sb.append(", onAction=");
        return Y0.c.a(sb, this.f84982c, ")");
    }
}
