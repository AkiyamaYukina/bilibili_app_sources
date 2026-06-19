package com.bilibili.ship.theseus.united.page.interactvideo.model;

import G0.d;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.common.chronoscommon.message.RequestDefine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/model/InteractiveVideoJumpNode$Request.class */
@StabilityInferred(parameters = 0)
@RequestDefine(method = "InteractiveVideo_Jump")
@Keep
public final class InteractiveVideoJumpNode$Request {
    public static final int $stable = 8;

    @JSONField(name = "choices")
    @Nullable
    private String choices;

    @JSONField(name = "cid")
    private long cid;

    @JSONField(name = "edge_id")
    private long edgeId;

    @Nullable
    public final String getChoices() {
        return this.choices;
    }

    public final long getCid() {
        return this.cid;
    }

    public final long getEdgeId() {
        return this.edgeId;
    }

    public final void setChoices(@Nullable String str) {
        this.choices = str;
    }

    public final void setCid(long j7) {
        this.cid = j7;
    }

    public final void setEdgeId(long j7) {
        this.edgeId = j7;
    }

    @NotNull
    public String toString() {
        long j7 = this.edgeId;
        long j8 = this.cid;
        String str = this.choices;
        StringBuilder sbA = z.a(j7, "InteractiveVideoJumpNode.Request(edgeId='", "', cid='");
        d.a(j8, "', choices=", str, sbA);
        sbA.append(")");
        return sbA.toString();
    }
}
