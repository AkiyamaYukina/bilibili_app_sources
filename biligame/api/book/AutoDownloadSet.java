package com.bilibili.biligame.api.book;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/book/AutoDownloadSet.class */
@StabilityInferred(parameters = 0)
@Keep
public final class AutoDownloadSet implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "default_select")
    private boolean defaultSelect = true;

    @JSONField(name = "list")
    @Nullable
    private List<AutoDownloadStatus> list;

    public final boolean getDefaultSelect() {
        return this.defaultSelect;
    }

    @Nullable
    public final List<AutoDownloadStatus> getList() {
        return this.list;
    }

    public final void setDefaultSelect(boolean z6) {
        this.defaultSelect = z6;
    }

    public final void setList(@Nullable List<AutoDownloadStatus> list) {
        this.list = list;
    }
}
