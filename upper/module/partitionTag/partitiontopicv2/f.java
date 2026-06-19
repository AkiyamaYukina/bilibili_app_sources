package com.bilibili.upper.module.partitionTag.partitiontopicv2;

import com.bilibili.upper.module.partitionTag.partitionTopic.bean.PartitionLimitState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/f.class */
public final /* synthetic */ class f implements Function1 {
    public final Object invoke(Object obj) {
        PartitionLimitState partitionLimitState = (PartitionLimitState) obj;
        int i7 = UpperFenquBiaoqianHuatiActivity.f113890Q;
        BLog.ifmt("~0bitian~", "\n------------------------   \n \n%s\n\n------------------------\n  ", new Object[]{"【分区+标签+话题】 话题活动校验监听 ".concat(partitionLimitState.getVisible() ? "不通过" : "通过")});
        if (partitionLimitState.getVisible()) {
            com.bilibili.upper.module.contribute.up.util.j.b();
        }
        return Unit.INSTANCE;
    }
}
