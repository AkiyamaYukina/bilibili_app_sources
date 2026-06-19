package com.bilibili.teenagersmode.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.JvmField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/model/TeenagersModeAgeCheck.class */
@StabilityInferred(parameters = 0)
@Keep
public final class TeenagersModeAgeCheck {
    public static final int $stable = 8;

    @JSONField(name = "after14")
    private boolean after14;

    @JSONField(name = "after16")
    private boolean after16;

    @JSONField(name = "after18")
    private boolean after18;

    @JvmField
    @JSONField(name = "realname")
    public int realName = -1;

    public final boolean getAfter14() {
        return this.after14;
    }

    public final boolean getAfter16() {
        return this.after16;
    }

    public final boolean getAfter18() {
        return this.after18;
    }

    public final void setAfter14(boolean z6) {
        this.after14 = z6;
    }

    public final void setAfter16(boolean z6) {
        this.after16 = z6;
    }

    public final void setAfter18(boolean z6) {
        this.after18 = z6;
    }

    public final int toIntEnum() {
        return this.after18 ? 4 : this.after16 ? 3 : this.after14 ? 2 : 1;
    }
}
