package com.bilibili.upper.module.partitionTag.partitiontopicv2;

import jJ0.C7653b;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/k.class */
public final class k extends C7653b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UpperFenquBiaoqianHuatiFragment f113935b;

    public k(UpperFenquBiaoqianHuatiFragment upperFenquBiaoqianHuatiFragment) {
        this.f113935b = upperFenquBiaoqianHuatiFragment;
    }

    @Override // jJ0.C7653b
    public final void onLastItemVisible() {
        UpperFenquBiaoqianHuatiFragment upperFenquBiaoqianHuatiFragment = this.f113935b;
        upperFenquBiaoqianHuatiFragment.getClass();
        BLog.wfmt("~0bitian~", "\n------------------------   \n \n%s\n\n------------------------\n  ", new Object[]{"话题区域 loadMore"});
        upperFenquBiaoqianHuatiFragment.jf().K0(false);
    }
}
