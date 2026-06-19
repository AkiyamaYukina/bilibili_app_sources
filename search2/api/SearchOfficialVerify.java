package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.OfficialVerify;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchOfficialVerify.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchOfficialVerify {
    public static final int $stable = 8;
    public static final int COMPANY_V = 1;

    @NotNull
    public static final a Companion = new Object();
    public static final int NORMAL = -1;
    public static final int PERSON_V = 0;

    @JSONField(name = "desc")
    @Nullable
    private String desc;

    @JSONField(name = "type")
    private int type;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchOfficialVerify$a.class */
    public static final class a {
    }

    public SearchOfficialVerify() {
    }

    public SearchOfficialVerify(@NotNull OfficialVerify officialVerify) {
        this.type = officialVerify.getType();
        this.desc = officialVerify.getDesc();
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isAuthority() {
        int i7 = this.type;
        boolean z6 = true;
        if (i7 != 0) {
            z6 = i7 == 1;
        }
        return z6;
    }

    public final boolean isNormal() {
        return this.type == -1;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setType(int i7) {
        this.type = i7;
    }
}
