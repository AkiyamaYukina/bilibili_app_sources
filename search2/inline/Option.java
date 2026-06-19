package com.bilibili.search2.inline;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.customview.widget.b;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.TrafficConfigOption;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/inline/Option.class */
@StabilityInferred(parameters = 0)
@Keep
public final class Option {
    public static final int $stable = 8;

    @JSONField(name = "id")
    private int id;

    @JSONField(deserialize = false, serialize = false)
    private boolean isSelected;

    @JSONField(name = "text")
    @Nullable
    private String text;

    public Option() {
        this(0, null, 3, null);
    }

    public Option(int i7, @Nullable String str) {
        this.id = i7;
        this.text = str;
    }

    public /* synthetic */ Option(int i7, String str, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? -1 : i7, (i8 & 2) != 0 ? null : str);
    }

    public Option(@NotNull TrafficConfigOption trafficConfigOption) {
        this(trafficConfigOption.getId(), trafficConfigOption.getText());
    }

    public static /* synthetic */ Option copy$default(Option option, int i7, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = option.id;
        }
        if ((i8 & 2) != 0) {
            str = option.text;
        }
        return option.copy(i7, str);
    }

    public final int component1() {
        return this.id;
    }

    @Nullable
    public final String component2() {
        return this.text;
    }

    @NotNull
    public final Option copy(int i7, @Nullable String str) {
        return new Option(i7, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Option)) {
            return false;
        }
        Option option = (Option) obj;
        return this.id == option.id && Intrinsics.areEqual(this.text, option.text);
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id);
        String str = this.text;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setId(int i7) {
        this.id = i7;
    }

    public final void setSelected(boolean z6) {
        this.isSelected = z6;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    @NotNull
    public String toString() {
        return b.b(this.id, "Option(id=", ", text=", this.text, ")");
    }
}
