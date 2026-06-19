package com.bilibili.upper.module.cover_v2.ui;

import com.bilibili.upper.module.cover_v2.draft.MultiCoverDraft;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/c.class */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiCoverActivity f112940a;

    @Override // java.lang.Runnable
    public final void run() {
        MultiCoverDraft multiCoverDraft;
        MultiCoverActivity multiCoverActivity = this.f112940a;
        KH0.i iVar = multiCoverActivity.f112865A;
        multiCoverActivity.f112877z = (iVar == null || (multiCoverDraft = iVar.f12747e) == null) ? null : multiCoverDraft.m10652clone();
        multiCoverActivity.Q6();
    }
}
