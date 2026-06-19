package com.bilibili.opd.app.bizcommon.context.download.bean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/download/bean/H5ConstantResBean.class */
@Keep
public final class H5ConstantResBean {

    @Nullable
    private Integer fileType;

    @Nullable
    private List<PreloadLocalCacheBean> resourceUrlsList;

    @Nullable
    private Integer version;

    @Nullable
    public final Integer getFileType() {
        return this.fileType;
    }

    @Nullable
    public final List<PreloadLocalCacheBean> getResourceUrlsList() {
        return this.resourceUrlsList;
    }

    @Nullable
    public final Integer getVersion() {
        return this.version;
    }

    public final void setFileType(@Nullable Integer num) {
        this.fileType = num;
    }

    public final void setResourceUrlsList(@Nullable List<PreloadLocalCacheBean> list) {
        this.resourceUrlsList = list;
    }

    public final void setVersion(@Nullable Integer num) {
        this.version = num;
    }
}
