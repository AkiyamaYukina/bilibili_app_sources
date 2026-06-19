package com.bilibili.ogv.review.reviewpublish;

import android.content.DialogInterface;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.magicasakura.widgets.TintProgressDialog;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/k.class */
public final /* synthetic */ class k implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShortReviewPublishFragment f72546a;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        ShortReviewPublishFragment shortReviewPublishFragment = this.f72546a;
        if (shortReviewPublishFragment.f72501o) {
            return;
        }
        TintProgressDialog tintProgressDialog = shortReviewPublishFragment.f72500n;
        TintProgressDialog tintProgressDialog2 = tintProgressDialog;
        if (tintProgressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
            tintProgressDialog2 = null;
        }
        tintProgressDialog2.setMessage(shortReviewPublishFragment.getString(2131857146));
        TintProgressDialog tintProgressDialog3 = shortReviewPublishFragment.f72500n;
        TintProgressDialog tintProgressDialog4 = tintProgressDialog3;
        if (tintProgressDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
            tintProgressDialog4 = null;
        }
        tintProgressDialog4.show();
        shortReviewPublishFragment.f72501o = true;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(shortReviewPublishFragment), (CoroutineContext) null, (CoroutineStart) null, new ShortReviewPublishFragment$delete$1(shortReviewPublishFragment, null), 3, (Object) null);
    }
}
