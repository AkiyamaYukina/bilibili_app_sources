package com.bilibili.upper.module.partitionTag.partitionTopic.activity;

import bF0.C4949D;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.upper.module.partitionTag.partitionTopic.activity.a;
import j4.t;
import java.util.HashMap;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/activity/c.class */
public final class c implements a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PartitionTagActivity f113750a;

    public c(PartitionTagActivity partitionTagActivity) {
        this.f113750a = partitionTagActivity;
    }

    @Override // com.bilibili.upper.module.partitionTag.partitionTopic.activity.a.d
    public final void a(boolean z6) {
        t.a("onChangedToHidden auto: ", "PartitionTagAActivity", z6);
        PartitionTagActivity partitionTagActivity = this.f113750a;
        C4949D c4949d = partitionTagActivity.f113715K;
        if (c4949d == null || c4949d.f54682f.getCurrentItem() != 1) {
            return;
        }
        partitionTagActivity.U6().M0();
    }

    @Override // com.bilibili.upper.module.partitionTag.partitionTopic.activity.a.d
    public final void b(boolean z6) {
        t.a("onChangedToHalf auto: ", "PartitionTagAActivity", z6);
    }

    @Override // com.bilibili.upper.module.partitionTag.partitionTopic.activity.a.d
    public final void c(boolean z6) {
        BLog.i("PartitionTagAActivity", "onChangedToMax auto: " + z6);
        Neurons.reportClick(false, "creation.partition-lable.0.slide.click", new HashMap());
    }
}
