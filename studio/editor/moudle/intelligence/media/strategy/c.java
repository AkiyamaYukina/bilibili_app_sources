package com.bilibili.studio.editor.moudle.intelligence.media.strategy;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/c.class */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f107407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f107408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f107409c;

    public c(int i7, int i8, int i9) {
        this.f107407a = i7;
        this.f107408b = i8;
        this.f107409c = i9;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f107407a == cVar.f107407a && this.f107408b == cVar.f107408b && this.f107409c == cVar.f107409c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f107409c) + I.a(this.f107408b, I.a(3, Integer.hashCode(this.f107407a) * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(pageType=");
        sb.append(this.f107407a);
        sb.append(", resultNumber=3, imageMaxCount=");
        sb.append(this.f107408b);
        sb.append(", imageMinCount=");
        return C4277b.a(this.f107409c, ")", sb);
    }
}
