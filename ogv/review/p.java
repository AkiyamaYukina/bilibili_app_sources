package com.bilibili.ogv.review;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.app.provider.IGlobalGetContainerInfoBehavior;
import com.bilibili.lib.biliid.utils.device.HwIdHelper;
import com.bilibili.lib.foundation.FoundationAlias;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/p.class */
public final class p implements IGlobalGetContainerInfoBehavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReviewWebViewActivity f72453a;

    public p(ReviewWebViewActivity reviewWebViewActivity) {
        this.f72453a = reviewWebViewActivity;
    }

    public final String getContainerName() {
        return "ReviewWebViewActivity";
    }

    public final JSONObject getExtraInfoContainerInfo() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("build", Integer.valueOf(FoundationAlias.getFapps().getVersionCode()));
        jSONObject.put("deviceId", HwIdHelper.getDid(this.f72453a));
        return jSONObject;
    }

    public final boolean isDestroyed() {
        return this.f72453a.isFinishing();
    }
}
