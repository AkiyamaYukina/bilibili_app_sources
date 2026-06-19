package com.bilibili.ogv.review.web;

import Cl0.a;
import Nl0.h;
import Qj0.g;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.api.BiliApiException;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.ogv.infra.jsb.BundledJsbParam;
import com.bilibili.ogv.infra.jsb.f;
import com.bilibili.ogv.review.ReviewWebViewActivity;
import com.bilibili.ogv.review.data.ReviewLongDetail;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import javax.inject.Named;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/web/BangumiJsBridgeReviewBehavior.class */
@StabilityInferred(parameters = 0)
public final class BangumiJsBridgeReviewBehavior implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ReviewWebViewActivity f72554a;

    public BangumiJsBridgeReviewBehavior(@NotNull ReviewWebViewActivity reviewWebViewActivity) {
        this.f72554a = reviewWebViewActivity;
    }

    public final void jumpToAuthority(@Named("code") int i7, @Named("message") @NotNull String str) {
        ReviewWebViewActivity reviewWebViewActivity = this.f72554a;
        reviewWebViewActivity.getClass();
        a.a(reviewWebViewActivity, new BiliApiException(i7, str));
    }

    public final void jumpToBindPhone() {
        ReviewWebViewActivity reviewWebViewActivity = this.f72554a;
        reviewWebViewActivity.f72200V = true;
        g.c(reviewWebViewActivity, RouteRequestKt.toRouteRequest("https://passport.bilibili.com/mobile/index.html"));
    }

    public final void jumpToLogin() {
        ReviewWebViewActivity reviewWebViewActivity = this.f72554a;
        reviewWebViewActivity.getClass();
        h.c(reviewWebViewActivity, "activity://main/login/", 0, SearchBangumiItem.TYPE_FULLNET_VARIETY, null);
    }

    public final void jumpToLongReviewComment(@Named("mediaId") long j7, @Named("reviewId") long j8) {
        this.f72554a.R6(j7, j8);
    }

    public final void jumpToPublish() {
        this.f72554a.Q6();
    }

    public final void jumpToReviewDetail(@Named("mediaId") long j7) {
        this.f72554a.S6(j7);
    }

    public final void jumpToUpSpace(@Named(EditCustomizeSticker.TAG_MID) long j7, @Named("name") @NotNull String str) {
        ReviewWebViewActivity reviewWebViewActivity = this.f72554a;
        reviewWebViewActivity.getClass();
        h.a(j7, str, reviewWebViewActivity);
    }

    public final void setOverflow(@Named("isHost") boolean z6) {
        this.f72554a.T6(z6);
    }

    public final void setReviewInfo(@BundledJsbParam @NotNull ReviewLongDetail reviewLongDetail) {
        ReviewWebViewActivity reviewWebViewActivity = this.f72554a;
        if (reviewLongDetail == null) {
            reviewWebViewActivity.getClass();
        } else {
            reviewWebViewActivity.f72196R = reviewLongDetail;
        }
    }
}
