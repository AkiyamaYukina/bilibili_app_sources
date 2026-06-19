package com.bilibili.ogv.review.detailpage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.ogvcommon.deprecated.bottomsheet.BangumiBottomSheet;
import com.bilibili.search2.api.SearchBangumiItem;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/n.class */
public final class n implements BangumiBottomSheet.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f72366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f72367b;

    public n(Context context, o oVar) {
        this.f72366a = context;
        this.f72367b = oVar;
    }

    @Override // com.bilibili.ogvcommon.deprecated.bottomsheet.BangumiBottomSheet.b
    public final void a(int i7, View view) {
        o oVar = this.f72367b;
        if (i7 == 88) {
            ReviewItem reviewItem = oVar.f72381o;
            if (reviewItem != null) {
                BLRouter.routeTo$default(RouteRequestKt.toRouteRequest(reviewItem.f72297l), (Context) null, 2, (Object) null);
                return;
            }
            return;
        }
        if (i7 != 89) {
            return;
        }
        if (!com.bilibili.ogv.infra.account.a.f67852b.isLogin()) {
            Nl0.h.c(this.f72366a, "activity://main/login/", 0, SearchBangumiItem.TYPE_FULLNET_VARIETY, null);
            return;
        }
        Context context = this.f72366a;
        ReviewItem reviewItem2 = oVar.f72381o;
        long j7 = 0;
        long j8 = reviewItem2 != null ? reviewItem2.h : 0L;
        if (reviewItem2 != null) {
            j7 = reviewItem2.f72298m;
        }
        Qj0.g.c(context, RouteRequestKt.toRouteRequest(Uri.parse("https://www.bilibili.com").buildUpon().appendPath("appeal").appendQueryParameter("reviewId", String.valueOf(j8)).appendQueryParameter("type", "longComment").appendQueryParameter("mediaId", String.valueOf(j7)).build()));
    }
}
