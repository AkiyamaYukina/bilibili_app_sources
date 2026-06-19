package com.bilibili.upper.module.partitionTag.partitionTopic.fragment;

import jJ0.C7653b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/fragment/k.class */
public final class k extends C7653b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UpperTopicChooseFragment f113809b;

    public k(UpperTopicChooseFragment upperTopicChooseFragment) {
        this.f113809b = upperTopicChooseFragment;
    }

    @Override // jJ0.C7653b
    public final void onLastItemVisible() {
        AI0.i iVar = this.f113809b.f113794e;
        if (iVar != null) {
            iVar.K0(false);
        }
    }
}
