package com.bilibili.lib.projection.internal.api.model;

import androidx.annotation.Keep;
import androidx.fragment.app.A;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/DefaultQnInfo.class */
@Keep
public final class DefaultQnInfo {

    @JSONField(name = "default_qn")
    @Nullable
    private Integer defaultQn;

    @JSONField(name = "default_qn_third")
    @Nullable
    private Integer defaultQnThird;

    @JSONField(name = "qn_third_des")
    @Nullable
    private String defaultQnThirdDes;

    @Nullable
    public final Integer getDefaultQn() {
        return this.defaultQn;
    }

    @Nullable
    public final Integer getDefaultQnThird() {
        return this.defaultQnThird;
    }

    @Nullable
    public final String getDefaultQnThirdDes() {
        return this.defaultQnThirdDes;
    }

    public final void setDefaultQn(@Nullable Integer num) {
        this.defaultQn = num;
    }

    public final void setDefaultQnThird(@Nullable Integer num) {
        this.defaultQnThird = num;
    }

    public final void setDefaultQnThirdDes(@Nullable String str) {
        this.defaultQnThirdDes = str;
    }

    @NotNull
    public String toString() {
        Integer num = this.defaultQn;
        Integer num2 = this.defaultQnThird;
        return C8770a.a(A.b("DefaultQninfo(defaultQn=", num, ", defaultQnThird=", num2, ", defaultQnThirdDes="), this.defaultQnThirdDes, ")");
    }
}
