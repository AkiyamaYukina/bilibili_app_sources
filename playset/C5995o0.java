package com.bilibili.playset;

import android.view.View;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;
import tv.danmaku.bili.widget.dialog.BiliCommonDialog;

/* JADX INFO: renamed from: com.bilibili.playset.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/o0.class */
public final class C5995o0 implements BiliCommonDialog.OnDialogTextClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f85180a;

    public C5995o0(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f85180a = cancellableContinuationImpl;
    }

    public final void onDialogTextClicked(View view, BiliCommonDialog biliCommonDialog) {
        Result.Companion companion = Result.Companion;
        this.f85180a.resumeWith(Result.constructor-impl(Boolean.TRUE));
    }
}
