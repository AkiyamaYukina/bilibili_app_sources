package com.bilibili.playset;

import android.view.View;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;
import tv.danmaku.bili.widget.dialog.BiliCommonDialog;

/* JADX INFO: renamed from: com.bilibili.playset.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/p0.class */
public final class C5997p0 implements BiliCommonDialog.OnDialogTextClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f85189a;

    public C5997p0(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f85189a = cancellableContinuationImpl;
    }

    public final void onDialogTextClicked(View view, BiliCommonDialog biliCommonDialog) {
        Result.Companion companion = Result.Companion;
        this.f85189a.resumeWith(Result.constructor-impl(Boolean.FALSE));
    }
}
