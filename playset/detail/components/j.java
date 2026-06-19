package com.bilibili.playset.detail.components;

import android.view.View;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;
import tv.danmaku.bili.widget.dialog.BiliCommonDialog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/components/j.class */
public final class j implements BiliCommonDialog.OnDialogTextClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f84321a;

    public j(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f84321a = cancellableContinuationImpl;
    }

    public final void onDialogTextClicked(View view, BiliCommonDialog biliCommonDialog) {
        Result.Companion companion = Result.Companion;
        this.f84321a.resumeWith(Result.constructor-impl(Boolean.FALSE));
    }
}
