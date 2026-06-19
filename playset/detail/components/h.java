package com.bilibili.playset.detail.components;

import android.view.View;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;
import tv.danmaku.bili.widget.dialog.BiliCommonDialog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/components/h.class */
public final class h implements BiliCommonDialog.OnDialogTextClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f84319a;

    public h(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f84319a = cancellableContinuationImpl;
    }

    public final void onDialogTextClicked(View view, BiliCommonDialog biliCommonDialog) {
        Result.Companion companion = Result.Companion;
        this.f84319a.resumeWith(Result.constructor-impl(Boolean.FALSE));
    }
}
