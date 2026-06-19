package com.bilibili.topix.center;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/EntranceButton.class */
@StabilityInferred(parameters = 0)
@Keep
public final class EntranceButton {
    public static final int $stable = 8;

    @JSONField(name = "link")
    @Nullable
    private String link;

    @JSONField(name = "text")
    @Nullable
    private String text;

    @JSONField(name = "type")
    @Nullable
    private String type;

    public EntranceButton() {
        this(null, null, null, 7, null);
    }

    public EntranceButton(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.link = str;
        this.text = str2;
        this.type = str3;
    }

    public /* synthetic */ EntranceButton(String str, String str2, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3);
    }

    public static /* synthetic */ EntranceButton copy$default(EntranceButton entranceButton, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = entranceButton.link;
        }
        if ((i7 & 2) != 0) {
            str2 = entranceButton.text;
        }
        if ((i7 & 4) != 0) {
            str3 = entranceButton.type;
        }
        return entranceButton.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.link;
    }

    @Nullable
    public final String component2() {
        return this.text;
    }

    @Nullable
    public final String component3() {
        return this.type;
    }

    @NotNull
    public final EntranceButton copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new EntranceButton(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntranceButton)) {
            return false;
        }
        EntranceButton entranceButton = (EntranceButton) obj;
        return Intrinsics.areEqual(this.link, entranceButton.link) && Intrinsics.areEqual(this.text, entranceButton.text) && Intrinsics.areEqual(this.type, entranceButton.type);
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.link;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.text;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.type;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @NotNull
    public String toString() {
        String str = this.link;
        String str2 = this.text;
        return C8770a.a(G0.b.a("EntranceButton(link=", str, ", text=", str2, ", type="), this.type, ")");
    }
}
