package com.bilibili.search2.result.holder.aichat;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import q4.D;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/aichat/i.class */
public final class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SearchAIChatHolder f87783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f87784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f87785d;

    public i(RecyclerView recyclerView, int i7, SearchAIChatHolder searchAIChatHolder, RecyclerView recyclerView2, Integer num) {
        this.f87782a = i7;
        this.f87783b = searchAIChatHolder;
        this.f87784c = recyclerView2;
        this.f87785d = num;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.holder.aichat.SearchAIChatHolder] */
    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f87782a;
        ?? r02 = this.f87783b;
        if (i7 == r02.f87764l) {
            defpackage.a.a(r02.itemView.getHeight(), "beforeScrollToNext: itemView.height=", "[Search]SearchAIChatHolder");
            SearchAIChatHolder searchAIChatHolder = this.f87783b;
            RecyclerView recyclerView = this.f87784c;
            int iIntValue = this.f87785d.intValue();
            searchAIChatHolder.getClass();
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                BLog.d("[Search]SearchAIChatHolder", "scrollToNextPosition skipped: layoutManager=null");
                searchAIChatHolder.s0();
                return;
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            if (iIntValue < 0 || iIntValue >= itemCount) {
                D.a(iIntValue, itemCount, "scrollToNextPosition skipped: position=", ", itemCount=", "[Search]SearchAIChatHolder");
                searchAIChatHolder.s0();
            } else if (!recyclerView.isAttachedToWindow()) {
                BLog.d("[Search]SearchAIChatHolder", "scrollToNextPosition skipped: rv detached");
                searchAIChatHolder.s0();
            } else {
                defpackage.a.a(iIntValue, "scrollToNextPosition: position=", "[Search]SearchAIChatHolder");
                linearLayoutManager.scrollToPositionWithOffset(iIntValue, 0);
                recyclerView.addOnLayoutChangeListener(new j(linearLayoutManager, iIntValue));
            }
        }
    }
}
