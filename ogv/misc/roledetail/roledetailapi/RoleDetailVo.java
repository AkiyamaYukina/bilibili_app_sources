package com.bilibili.ogv.misc.roledetail.roledetailapi;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/roledetail/roledetailapi/RoleDetailVo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class RoleDetailVo {
    public static final int $stable = 8;

    @Nullable
    private PersonInfoVo personInfoVo;

    @Nullable
    private PersonRelateContentVo personRelateContentVo;

    @Nullable
    public final PersonInfoVo getPersonInfoVo() {
        return this.personInfoVo;
    }

    @Nullable
    public final PersonRelateContentVo getPersonRelateContentVo() {
        return this.personRelateContentVo;
    }

    public final void setPersonInfoVo(@Nullable PersonInfoVo personInfoVo) {
        this.personInfoVo = personInfoVo;
    }

    public final void setPersonRelateContentVo(@Nullable PersonRelateContentVo personRelateContentVo) {
        this.personRelateContentVo = personRelateContentVo;
    }
}
