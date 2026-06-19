package com.bilibili.moduleservice.ugc;

import com.bapis.bilibili.app.view.v1.ExtType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/ugc/IUploaderCenterServiceProvider.class */
public interface IUploaderCenterServiceProvider {
    @Nullable
    IUploaderCenterService getService(@NotNull ExtType extType);

    void putService(@NotNull ExtType extType, @NotNull IUploaderCenterService iUploaderCenterService);
}
