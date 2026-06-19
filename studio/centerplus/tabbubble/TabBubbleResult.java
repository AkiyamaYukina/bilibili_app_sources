package com.bilibili.studio.centerplus.tabbubble;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/tabbubble/TabBubbleResult.class */
@Keep
public final class TabBubbleResult {

    @JSONField(name = "invalid")
    @Nullable
    private List<Long> invalid;

    @JSONField(name = "bubble")
    @Nullable
    private TabBubble tabBubble;

    @Nullable
    public final List<Long> getInvalid() {
        return this.invalid;
    }

    @Nullable
    public final TabBubble getTabBubble() {
        return this.tabBubble;
    }

    public final void setInvalid(@Nullable List<Long> list) {
        this.invalid = list;
    }

    public final void setTabBubble(@Nullable TabBubble tabBubble) {
        this.tabBubble = tabBubble;
    }
}
