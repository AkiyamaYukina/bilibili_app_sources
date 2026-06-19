package com.bilibili.teenagersmode.model;

import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/model/TeenagersModeStatus.class */
@Keep
public class TeenagersModeStatus {
    public static final int IS_FORCE_DISABLE = 0;
    public static final int IS_FORCE_ENABLE = 1;
    public static final int STATE_NEVER_SYNC = 2;
    public static final int STATE_NORMAL = 0;
    public static final int STATE_TEENAGERS_MODE = 1;
    public boolean isForce;

    @JSONField(name = "teenagers_status")
    public int status;

    @JSONField(deserialize = false, serialize = false)
    public boolean useLocalTime;

    @JSONField(name = "must_teen")
    public boolean mustTeen = false;

    @JSONField(name = "must_realname")
    public boolean mustRealName = false;

    @JSONField(name = "is_parent_control")
    public boolean isParentControl = false;

    @JSONField(name = "is_overseas")
    public boolean isOverseas = false;

    @JSONField(deserialize = false, serialize = false)
    public String code = "";

    public boolean isValid() {
        int i7 = this.status;
        return i7 >= 0 && i7 <= 2 && i7 != 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TeenagersModeStatus{status=");
        sb.append(this.status);
        sb.append(", mustTeen='");
        sb.append(this.mustTeen);
        sb.append("', mustRealName='");
        sb.append(this.mustRealName);
        sb.append("', isParentControl='");
        sb.append(this.isParentControl);
        sb.append("', isOverseas='");
        return i.a(sb, this.isOverseas, "'}");
    }
}
