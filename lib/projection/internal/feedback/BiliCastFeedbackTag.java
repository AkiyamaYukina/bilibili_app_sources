package com.bilibili.lib.projection.internal.feedback;

import I.E;
import androidx.annotation.Keep;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/feedback/BiliCastFeedbackTag.class */
@Keep
public final class BiliCastFeedbackTag {

    @NotNull
    private final String hint;

    @NotNull
    private final String id;

    @NotNull
    private final String name;

    public BiliCastFeedbackTag(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.id = str;
        this.name = str2;
        this.hint = str3;
    }

    public static /* synthetic */ BiliCastFeedbackTag copy$default(BiliCastFeedbackTag biliCastFeedbackTag, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = biliCastFeedbackTag.id;
        }
        if ((i7 & 2) != 0) {
            str2 = biliCastFeedbackTag.name;
        }
        if ((i7 & 4) != 0) {
            str3 = biliCastFeedbackTag.hint;
        }
        return biliCastFeedbackTag.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final String component3() {
        return this.hint;
    }

    @NotNull
    public final BiliCastFeedbackTag copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        return new BiliCastFeedbackTag(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiliCastFeedbackTag)) {
            return false;
        }
        BiliCastFeedbackTag biliCastFeedbackTag = (BiliCastFeedbackTag) obj;
        return Intrinsics.areEqual(this.id, biliCastFeedbackTag.id) && Intrinsics.areEqual(this.name, biliCastFeedbackTag.name) && Intrinsics.areEqual(this.hint, biliCastFeedbackTag.hint);
    }

    @NotNull
    public final String getHint() {
        return this.hint;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.hint.hashCode() + E.a(this.id.hashCode() * 31, 31, this.name);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        return C8770a.a(G0.b.a("BiliCastFeedbackTag(id=", str, ", name=", str2, ", hint="), this.hint, ")");
    }
}
