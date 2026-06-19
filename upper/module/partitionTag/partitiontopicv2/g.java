package com.bilibili.upper.module.partitionTag.partitiontopicv2;

import bF0.C5006k2;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.upper.module.partitionTag.partitionTopic.activity.a;
import j4.t;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/g.class */
public final class g implements a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpperFenquBiaoqianHuatiActivity f113929a;

    public g(UpperFenquBiaoqianHuatiActivity upperFenquBiaoqianHuatiActivity) {
        this.f113929a = upperFenquBiaoqianHuatiActivity;
    }

    @Override // com.bilibili.upper.module.partitionTag.partitionTopic.activity.a.d
    public final void a(boolean z6) {
        t.a("onChangedToHidden auto: ", "PartitionTagAActivity", z6);
        C5006k2 c5006k2 = this.f113929a.f113893M;
        C5006k2 c5006k22 = c5006k2;
        if (c5006k2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5006k22 = null;
        }
        if (c5006k22.f55753f.getCurrentItem() == 1) {
            TE0.b.f24088a.getClass();
            Neurons.reportClick(false, "creation.select-partition.card-disappear.0.click", new HashMap());
        }
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
