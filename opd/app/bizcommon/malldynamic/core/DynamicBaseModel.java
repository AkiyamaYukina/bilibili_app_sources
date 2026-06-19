package com.bilibili.opd.app.bizcommon.malldynamic.core;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/malldynamic/core/DynamicBaseModel.class */
@Keep
public class DynamicBaseModel {

    @Nullable
    private String codeMsg;

    @Nullable
    private Integer codeType = 0;

    @Nullable
    private List<DynamicErrorList> errorList;

    @Nullable
    public final String getCodeMsg() {
        return this.codeMsg;
    }

    @Nullable
    public final Integer getCodeType() {
        return this.codeType;
    }

    @Nullable
    public final List<DynamicErrorList> getErrorList() {
        return this.errorList;
    }

    public final void setCodeMsg(@Nullable String str) {
        this.codeMsg = str;
    }

    public final void setCodeType(@Nullable Integer num) {
        this.codeType = num;
    }

    public final void setErrorList(@Nullable List<DynamicErrorList> list) {
        this.errorList = list;
    }
}
