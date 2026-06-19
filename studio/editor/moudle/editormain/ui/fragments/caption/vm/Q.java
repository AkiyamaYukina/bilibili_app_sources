package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/vm/Q.class */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f106694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f106695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f106696c;

    public Q(@NotNull String str, int i7, boolean z6) {
        this.f106694a = str;
        this.f106695b = i7;
        this.f106696c = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q7 = (Q) obj;
        return Intrinsics.areEqual(this.f106694a, q7.f106694a) && this.f106695b == q7.f106695b && this.f106696c == q7.f106696c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f106696c) + androidx.compose.animation.core.I.a(this.f106695b, this.f106694a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TextUpdateData(text=");
        sb.append(this.f106694a);
        sb.append(", maxLimit=");
        sb.append(this.f106695b);
        sb.append(", isSplit=");
        return androidx.appcompat.app.i.a(sb, this.f106696c, ")");
    }
}
