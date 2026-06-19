package com.bilibili.upper.module.honour.publish;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.upper.api.bean.topic.Topic;
import com.bilibili.upper.contribute.up.entity.RequestAdd;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/publish/f.class */
public final class f extends BiliApiDataCallback<Topic> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f113194b;

    public f(e eVar) {
        this.f113194b = eVar;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(Topic topic) {
        RequestAdd requestAdd;
        Topic topic2 = topic;
        e eVar = this.f113194b;
        eVar.getClass();
        BLog.i("KingHonourVideoPublisher", "fetchTopicNameByTopicId success");
        if (topic2 == null || (requestAdd = eVar.f113186c) == null) {
            return;
        }
        requestAdd.mission_id = topic2.mission_id;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        this.f113194b.getClass();
        BLog.e("KingHonourVideoPublisher", "fetchTopicNameByTopicId error, " + th);
    }
}
