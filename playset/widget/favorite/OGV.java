package com.bilibili.playset.widget.favorite;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/OGV.class */
@StabilityInferred(parameters = 0)
@Bson
@Keep
public final class OGV {
    public static final int $stable = 8;

    @SerializedName("type_name")
    @NotNull
    private String typeName;

    public OGV(@NotNull String str) {
        this.typeName = str;
    }

    @NotNull
    public final String getTypeName() {
        return this.typeName;
    }

    public final void setTypeName(@NotNull String str) {
        this.typeName = str;
    }
}
