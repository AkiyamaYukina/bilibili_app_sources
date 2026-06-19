package com.bilibili.upper.module.partitionTag.partitiontopicv2;

import com.bilibili.upper.api.bean.topic.UpperPublishTopicBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tv.danmaku.android.log.BLog;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/n.class */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f113936a;

    public final Object invoke(Object obj) {
        switch (this.f113936a) {
            case 0:
                UpperPublishTopicBean.Topic topic = (UpperPublishTopicBean.Topic) obj;
                String str = topic.topicName;
                long j7 = topic.topicId;
                return C8770a.a(com.bilibili.playerbizcommon.features.background.b.a(j7, "话题： topicName = ", str, " topicId = "), "  description = ", topic.description);
            default:
                BLog.e("MALL_BLE", "setDeviceNotify超时");
                return Unit.INSTANCE;
        }
    }
}
