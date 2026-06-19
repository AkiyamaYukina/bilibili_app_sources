package com.bilibili.playerbizcommonv2.videomentioned;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.UIComponent.ViewEntry;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/B.class */
@StabilityInferred(parameters = 0)
public final class B<E extends UIComponent.ViewEntry, F extends UIComponent.ViewEntry> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f81984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<MentionedSectionItem<E, F>> f81985b;

    public B(@NotNull String str, @NotNull List<MentionedSectionItem<E, F>> list) {
        this.f81984a = str;
        this.f81985b = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b7 = (B) obj;
        return Intrinsics.areEqual(this.f81984a, b7.f81984a) && Intrinsics.areEqual(this.f81985b, b7.f81985b);
    }

    public final int hashCode() {
        return this.f81985b.hashCode() + (this.f81984a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        List<MentionedSectionItem<E, F>> list = this.f81985b;
        return N1.o.a(this.f81984a, ", mentions=", ")", new StringBuilder("VideoMentionedSection(title="), list);
    }
}
