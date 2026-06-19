package com.bilibili.ogv.review.detailpage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.ogvcommon.deprecated.bottomsheet.BangumiBottomSheet;
import com.bilibili.search2.api.SearchBangumiItem;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/s.class */
public final class s implements BangumiBottomSheet.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f72416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f72417b;

    public s(Context context, r rVar) {
        this.f72416a = context;
        this.f72417b = rVar;
    }

    @Override // com.bilibili.ogvcommon.deprecated.bottomsheet.BangumiBottomSheet.b
    public final void a(int i7, View view) {
        r rVar = this.f72417b;
        if (i7 == 88) {
            if (rVar.f72408r != null) {
                BangumiReviewFragment bangumiReviewFragment = rVar.f72393b;
                bangumiReviewFragment.getClass();
                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(bangumiReviewFragment), (CoroutineContext) null, (CoroutineStart) null, new BangumiReviewFragment$gotoShortPublish$1(bangumiReviewFragment, null), 3, (Object) null);
                return;
            }
            return;
        }
        if (i7 != 89) {
            return;
        }
        if (!com.bilibili.ogv.infra.account.a.f67852b.isLogin()) {
            Nl0.h.c(this.f72416a, "activity://main/login/", 0, SearchBangumiItem.TYPE_FULLNET_VARIETY, null);
            return;
        }
        Context context = this.f72416a;
        ReviewItem reviewItem = rVar.f72408r;
        long j7 = 0;
        long j8 = reviewItem != null ? reviewItem.h : 0L;
        if (reviewItem != null) {
            j7 = reviewItem.f72298m;
        }
        Qj0.g.c(context, RouteRequestKt.toRouteRequest(Uri.parse("https://www.bilibili.com").buildUpon().appendPath("appeal").appendQueryParameter("reviewId", String.valueOf(j8)).appendQueryParameter("type", "shortComment").appendQueryParameter("mediaId", String.valueOf(j7)).build()));
    }
}
