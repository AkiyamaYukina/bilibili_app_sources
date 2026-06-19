package com.bilibili.search2.main;

import androidx.activity.OnBackPressedCallback;

/* JADX INFO: renamed from: com.bilibili.search2.main.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/h.class */
public final class C6041h extends OnBackPressedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliMainSearchCoreFragment f86834a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6041h(BiliMainSearchCoreFragment biliMainSearchCoreFragment) {
        super(true);
        this.f86834a = biliMainSearchCoreFragment;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() throws Exception {
        this.f86834a.mf();
    }
}
