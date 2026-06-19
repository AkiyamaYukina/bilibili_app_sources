package com.bilibili.lib.projection.internal.api.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.lib.projection.internal.api.model.ProjectionInterceptInfo;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/InterceptMachineBean.class */
@Keep
public final class InterceptMachineBean {

    @JSONField(name = "intercept_type")
    private int interceptType;

    @JSONField(name = "machine_list")
    @Nullable
    private List<String> machineList;

    public final int getInterceptType() {
        return this.interceptType;
    }

    @Nullable
    public final List<String> getMachineList() {
        return this.machineList;
    }

    public final void setInterceptType(int i7) {
        this.interceptType = i7;
    }

    public final void setMachineList(@Nullable List<String> list) {
        this.machineList = list;
    }

    @NotNull
    public final ProjectionInterceptInfo.ProjectionInterceptType transformInterceptType() {
        int i7 = this.interceptType;
        return i7 != 1 ? i7 != 2 ? ProjectionInterceptInfo.ProjectionInterceptType.Default : ProjectionInterceptInfo.ProjectionInterceptType.InterceptNotInList : ProjectionInterceptInfo.ProjectionInterceptType.OnlyInterceptInList;
    }
}
