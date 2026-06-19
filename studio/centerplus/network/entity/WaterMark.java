package com.bilibili.studio.centerplus.network.entity;

import androidx.annotation.Keep;
import java.io.Serializable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/WaterMark.class */
@Keep
public class WaterMark implements Serializable, Cloneable {
    public long id;
    public String info;
    public long mid;
    public int position;
    public long state;
    public String tip;
    public long type;
    public String uname;

    public String toString() {
        StringBuilder sb = new StringBuilder("WaterMark{id=");
        sb.append(this.id);
        sb.append(", mid=");
        sb.append(this.mid);
        sb.append(", uname='");
        sb.append(this.uname);
        sb.append("', state=");
        sb.append(this.state);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", info='");
        sb.append(this.info);
        sb.append("', tip='");
        return C8770a.a(sb, this.tip, "'}");
    }
}
