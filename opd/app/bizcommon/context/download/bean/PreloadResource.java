package com.bilibili.opd.app.bizcommon.context.download.bean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/download/bean/PreloadResource.class */
@Keep
public final class PreloadResource {

    @Nullable
    private List<PreloadResourceBean> list;

    @Nullable
    public final List<PreloadResourceBean> getList() {
        return this.list;
    }

    public final void setList(@Nullable List<PreloadResourceBean> list) {
        this.list = list;
    }
}
