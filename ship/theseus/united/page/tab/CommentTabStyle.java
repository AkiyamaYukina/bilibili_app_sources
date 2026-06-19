package com.bilibili.ship.theseus.united.page.tab;

import I.E;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/CommentTabStyle.class */
@StabilityInferred(parameters = 1)
@Bson
public final class CommentTabStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f103121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f103122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f103123c;

    public CommentTabStyle(@NotNull String str, @NotNull String str2, int i7) {
        this.f103121a = str;
        this.f103122b = str2;
        this.f103123c = i7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentTabStyle)) {
            return false;
        }
        CommentTabStyle commentTabStyle = (CommentTabStyle) obj;
        return Intrinsics.areEqual(this.f103121a, commentTabStyle.f103121a) && Intrinsics.areEqual(this.f103122b, commentTabStyle.f103122b) && this.f103123c == commentTabStyle.f103123c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f103123c) + E.a(this.f103121a.hashCode() * 31, 31, this.f103122b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentTabStyle(badgeUrl=");
        sb.append(this.f103121a);
        sb.append(", badgeText=");
        sb.append(this.f103122b);
        sb.append(", badgeType=");
        return C4277b.a(this.f103123c, ")", sb);
    }
}
