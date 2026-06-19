package com.bilibili.ship.theseus.united.page.interactvideo.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.common.chronoscommon.message.RequestDefine;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/model/InteractiveVideoUpdateSceneInfo$Request.class */
@StabilityInferred(parameters = 0)
@RequestDefine(method = "InteractiveVideo_OnSceneInfoChanged")
@Keep
public final class InteractiveVideoUpdateSceneInfo$Request {
    public static final int $stable = 8;

    @JSONField(name = "eval_hidden_var_action")
    @Nullable
    private String evalHiddenVarAction;

    @JSONField(name = "scene")
    @Nullable
    private String scene;

    @Nullable
    public final String getEvalHiddenVarAction() {
        return this.evalHiddenVarAction;
    }

    @Nullable
    public final String getScene() {
        return this.scene;
    }

    public final void setEvalHiddenVarAction(@Nullable String str) {
        this.evalHiddenVarAction = str;
    }

    public final void setScene(@Nullable String str) {
        this.scene = str;
    }
}
