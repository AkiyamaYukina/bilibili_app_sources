package com.bilibili.lib.push.utils;

import androidx.annotation.Keep;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/utils/NotificationSwitchType.class */
@Keep
public final class NotificationSwitchType {

    @Nullable
    private List<? extends Map<String, Integer>> status;

    @Nullable
    private List<String> switch_name;

    @Nullable
    public final List<Map<String, Integer>> getStatus() {
        return this.status;
    }

    @Nullable
    public final List<String> getSwitch_name() {
        return this.switch_name;
    }

    public final void setStatus(@Nullable List<? extends Map<String, Integer>> list) {
        this.status = list;
    }

    public final void setSwitch_name(@Nullable List<String> list) {
        this.switch_name = list;
    }
}
