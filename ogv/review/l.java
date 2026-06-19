package com.bilibili.ogv.review;

import android.content.DialogInterface;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/l.class */
public final /* synthetic */ class l implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReviewWebViewActivity f72450a;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        ReviewWebViewActivity reviewWebViewActivity = this.f72450a;
        int i8 = ReviewWebViewActivity.f72181p0;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(reviewWebViewActivity), (CoroutineContext) null, (CoroutineStart) null, new ReviewWebViewActivity$clickMenuDelete$1$1(reviewWebViewActivity, null), 3, (Object) null);
    }
}
