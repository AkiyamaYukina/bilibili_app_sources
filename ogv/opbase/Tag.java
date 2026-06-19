package com.bilibili.ogv.opbase;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/Tag.class */
@StabilityInferred(parameters = 1)
@Bson
public final class Tag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f69946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Integer f69947b;

    public Tag(@Nullable String str, @Nullable Integer num) {
        this.f69946a = str;
        this.f69947b = num;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) obj;
        return Intrinsics.areEqual(this.f69946a, tag.f69946a) && Intrinsics.areEqual(this.f69947b, tag.f69947b);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f69946a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.f69947b;
        if (num != null) {
            iHashCode = num.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "Tag(text=" + this.f69946a + ", type=" + this.f69947b + ")";
    }
}
