package com.bilibili.playset;

import android.view.View;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;
import tv.danmaku.bili.widget.dialog.BiliCommonDialog;

/* JADX INFO: renamed from: com.bilibili.playset.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/n0.class */
public final class C5993n0 implements BiliCommonDialog.OnDialogTextClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f85107a;

    public C5993n0(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f85107a = cancellableContinuationImpl;
    }

    public final void onDialogTextClicked(View view, BiliCommonDialog biliCommonDialog) {
        Result.Companion companion = Result.Companion;
        this.f85107a.resumeWith(Result.constructor-impl(Boolean.FALSE));
    }
}
