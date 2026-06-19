package com.bilibili.tgwt.emoticon;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/emoticon/InteractEmote.class */
@StabilityInferred(parameters = 1)
@Bson
public final class InteractEmote {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f111157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f111158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f111159c;

    public InteractEmote(int i7, @NotNull String str, @NotNull String str2) {
        this.f111157a = i7;
        this.f111158b = str;
        this.f111159c = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractEmote)) {
            return false;
        }
        InteractEmote interactEmote = (InteractEmote) obj;
        return this.f111157a == interactEmote.f111157a && Intrinsics.areEqual(this.f111158b, interactEmote.f111158b) && Intrinsics.areEqual(this.f111159c, interactEmote.f111159c);
    }

    public final int hashCode() {
        return this.f111159c.hashCode() + E.a(Integer.hashCode(this.f111157a) * 31, 31, this.f111158b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("InteractEmote(emoteId=");
        sb.append(this.f111157a);
        sb.append(", smallUrl=");
        sb.append(this.f111158b);
        sb.append(", url=");
        return C8770a.a(sb, this.f111159c, ")");
    }
}
