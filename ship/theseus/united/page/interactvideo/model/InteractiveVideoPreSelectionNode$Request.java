package com.bilibili.ship.theseus.united.page.interactvideo.model;

import G0.b;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.common.chronoscommon.message.RequestDefine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/model/InteractiveVideoPreSelectionNode$Request.class */
@StabilityInferred(parameters = 0)
@RequestDefine(method = "InteractiveVideo_Selection")
@Keep
public final class InteractiveVideoPreSelectionNode$Request {
    public static final int $stable = 8;

    @JSONField(name = "choices")
    @Nullable
    private String choices;

    @JSONField(name = "edge_id")
    @NotNull
    private String edgeId = "";

    @JSONField(name = "cid")
    @NotNull
    private String cid = "";

    @Nullable
    public final String getChoices() {
        return this.choices;
    }

    @NotNull
    public final String getCid() {
        return this.cid;
    }

    @NotNull
    public final String getEdgeId() {
        return this.edgeId;
    }

    public final void setChoices(@Nullable String str) {
        this.choices = str;
    }

    public final void setCid(@NotNull String str) {
        this.cid = str;
    }

    public final void setEdgeId(@NotNull String str) {
        this.edgeId = str;
    }

    @NotNull
    public String toString() {
        String str = this.edgeId;
        String str2 = this.cid;
        return C8770a.a(b.a("InteractiveVideoPreSelectionNode.Request(edgeId='", str, "', cid='", str2, "', choices="), this.choices, ")");
    }
}
