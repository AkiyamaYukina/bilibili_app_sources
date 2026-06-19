package com.bilibili.pegasus.common.inlineplay;

import android.view.View;
import com.bilibili.app.comm.list.common.utils.AutoPlayHelperKt;
import com.bilibili.inline.biz.card.IListInlineAutoPlayerParams;
import com.bilibili.inline.fetcher.IInlineFetcher;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inlineplay/h.class */
public final class h implements IInlineFetcher.IViewChecker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IListInlineAutoPlayerParams f75649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f75650b;

    public h(IListInlineAutoPlayerParams iListInlineAutoPlayerParams, int i7) {
        this.f75649a = iListInlineAutoPlayerParams;
        this.f75650b = i7;
    }

    public final boolean isViewVisible(View view) {
        return AutoPlayHelperKt.isViewVisiblePer$default(view, this.f75649a.getViewVisibleRect(), this.f75650b, 0, 8, (Object) null);
    }
}
