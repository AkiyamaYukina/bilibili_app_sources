package com.bilibili.studio.videoeditor.generalrender.model;

import android.text.TextUtils;
import com.bilibili.lib.riskcontrol.BiliRiskException;
import com.bilibili.lib.riskcontrol.RiskControlCallback;
import com.bilibili.studio.videoeditor.generalrender.model.o;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/model/n.class */
public final class n implements RiskControlCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o.a f109623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KH.c f109624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f109625c;

    public n(o.a aVar, KH.c cVar, m mVar) {
        this.f109623a = aVar;
        this.f109624b = cVar;
        this.f109625c = mVar;
    }

    @Override // com.bilibili.lib.riskcontrol.RiskControlCallback
    public final void onFailed(BiliRiskException biliRiskException) {
        this.f109623a.f109639m.set(false);
        BLog.e("GRUploadVideoManager", "dealUploadRiskControl onFailed exception=" + biliRiskException);
        this.f109625c.invoke();
    }

    @Override // com.bilibili.lib.riskcontrol.RiskControlCallback
    public final void onSuccess(String str) {
        this.f109623a.f109639m.set(false);
        BLog.e("GRUploadVideoManager", "dealUploadRiskControl onSuccess");
        if (TextUtils.isEmpty(str)) {
            this.f109625c.invoke();
        } else {
            this.f109624b.invoke(str);
        }
    }
}
