package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.motion.widget.p;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/BottomButton.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BottomButton {
    public static final int $stable = 8;

    @JSONField(name = "desc")
    @Nullable
    private String desc;

    @JSONField(name = "link")
    @Nullable
    private String link;

    public BottomButton() {
        this(null, null, 3, null);
    }

    public BottomButton(@NotNull com.bapis.bilibili.polymer.app.search.v1.BottomButton bottomButton) {
        this(bottomButton.getDesc(), bottomButton.getLink());
    }

    public BottomButton(@Nullable String str, @Nullable String str2) {
        this.desc = str;
        this.link = str2;
    }

    public /* synthetic */ BottomButton(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ BottomButton copy$default(BottomButton bottomButton, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = bottomButton.desc;
        }
        if ((i7 & 2) != 0) {
            str2 = bottomButton.link;
        }
        return bottomButton.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.desc;
    }

    @Nullable
    public final String component2() {
        return this.link;
    }

    @NotNull
    public final BottomButton copy(@Nullable String str, @Nullable String str2) {
        return new BottomButton(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomButton)) {
            return false;
        }
        BottomButton bottomButton = (BottomButton) obj;
        return Intrinsics.areEqual(this.desc, bottomButton.desc) && Intrinsics.areEqual(this.link, bottomButton.link);
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    public int hashCode() {
        String str = this.desc;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.link;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    @NotNull
    public String toString() {
        return p.a("BottomButton(desc=", this.desc, ", link=", this.link, ")");
    }
}
