package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameDetailRankInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligameDetailRankInfo implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "link")
    @Nullable
    private String link;

    @JSONField(name = "name")
    @Nullable
    private String name;

    @JSONField(name = "type")
    private int type = -1;

    @JSONField(name = "index")
    private int index = -1;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(BiligameDetailRankInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        BiligameDetailRankInfo biligameDetailRankInfo = (BiligameDetailRankInfo) obj;
        return this.type == biligameDetailRankInfo.type && Intrinsics.areEqual(this.name, biligameDetailRankInfo.name) && this.index == biligameDetailRankInfo.index && Intrinsics.areEqual(this.link, biligameDetailRankInfo.link);
    }

    public final int getIndex() {
        return this.index;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int i7 = this.type;
        String str = this.name;
        int iHashCode = 0;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        int i8 = this.index;
        String str2 = this.link;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return (((((i7 * 31) + iHashCode2) * 31) + i8) * 31) + iHashCode;
    }

    public final void setIndex(int i7) {
        this.index = i7;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setType(int i7) {
        this.type = i7;
    }
}
