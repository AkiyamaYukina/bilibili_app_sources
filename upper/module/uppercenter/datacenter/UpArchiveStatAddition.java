package com.bilibili.upper.module.uppercenter.datacenter;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.A;
import androidx.fragment.app.z;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/datacenter/UpArchiveStatAddition.class */
@StabilityInferred(parameters = 0)
@Keep
public final class UpArchiveStatAddition {
    public static final int $stable = 8;

    @JSONField(name = "desc")
    @Nullable
    private String desc;

    @JSONField(name = "desc_url")
    @Nullable
    private String descUrl;

    @JSONField(name = "is_show")
    @Nullable
    private Integer show;

    @JSONField(name = "title")
    @Nullable
    private String title;

    public UpArchiveStatAddition() {
        this(null, null, null, null, 15, null);
    }

    public UpArchiveStatAddition(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.show = num;
        this.title = str;
        this.desc = str2;
        this.descUrl = str3;
    }

    public /* synthetic */ UpArchiveStatAddition(Integer num, String str, String str2, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : num, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ UpArchiveStatAddition copy$default(UpArchiveStatAddition upArchiveStatAddition, Integer num, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = upArchiveStatAddition.show;
        }
        if ((i7 & 2) != 0) {
            str = upArchiveStatAddition.title;
        }
        if ((i7 & 4) != 0) {
            str2 = upArchiveStatAddition.desc;
        }
        if ((i7 & 8) != 0) {
            str3 = upArchiveStatAddition.descUrl;
        }
        return upArchiveStatAddition.copy(num, str, str2, str3);
    }

    @Nullable
    public final Integer component1() {
        return this.show;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @Nullable
    public final String component3() {
        return this.desc;
    }

    @Nullable
    public final String component4() {
        return this.descUrl;
    }

    @NotNull
    public final UpArchiveStatAddition copy(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new UpArchiveStatAddition(num, str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpArchiveStatAddition)) {
            return false;
        }
        UpArchiveStatAddition upArchiveStatAddition = (UpArchiveStatAddition) obj;
        return Intrinsics.areEqual(this.show, upArchiveStatAddition.show) && Intrinsics.areEqual(this.title, upArchiveStatAddition.title) && Intrinsics.areEqual(this.desc, upArchiveStatAddition.desc) && Intrinsics.areEqual(this.descUrl, upArchiveStatAddition.descUrl);
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getDescUrl() {
        return this.descUrl;
    }

    @Nullable
    public final Integer getShow() {
        return this.show;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Integer num = this.show;
        int iHashCode = 0;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str = this.title;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.desc;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.descUrl;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setDescUrl(@Nullable String str) {
        this.descUrl = str;
    }

    public final void setShow(@Nullable Integer num) {
        this.show = num;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        return A.a(this.desc, ", descUrl=", this.descUrl, ")", z.b("UpArchiveStatAddition(show=", this.show, ", title=", this.title, ", desc="));
    }
}
