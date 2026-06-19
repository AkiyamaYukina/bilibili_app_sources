package com.bilibili.search2.result.holder.chatgpt;

import android.view.View;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/w.class */
public final class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f88049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SearchChatGptHolder f88050b;

    public w(View view, SearchChatGptHolder searchChatGptHolder) {
        this.f88049a = view;
        this.f88050b = searchChatGptHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f88050b.C0();
    }
}
