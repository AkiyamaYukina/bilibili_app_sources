package com.bilibili.pegasus.holders;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bilibili.app.comm.list.common.feed.FeedbackEventType;
import com.bilibili.app.comm.list.common.feed.PegasusProblemReporter;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.pegasus.data.base.BasePegasusData;
import com.bilibili.pegasus.data.card.DislikeItemData;
import com.bilibili.pegasus.feedbackdialog.model.NegativeFeedbackResponse;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/u.class */
public final class C5700u extends BiliApiDataCallback<NegativeFeedbackResponse> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasePegasusData f78095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f78096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5702v f78097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Fragment f78098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DislikeItemData f78099f;

    public C5700u(BasePegasusData basePegasusData, ConstraintLayout constraintLayout, C5702v c5702v, Fragment fragment, DislikeItemData dislikeItemData) {
        this.f78095b = basePegasusData;
        this.f78096c = constraintLayout;
        this.f78097d = c5702v;
        this.f78098e = fragment;
        this.f78099f = dislikeItemData;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    @Override // com.bilibili.okretro.BiliApiDataCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDataSuccess(com.bilibili.pegasus.feedbackdialog.model.NegativeFeedbackResponse r14) {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.C5700u.onDataSuccess(java.lang.Object):void");
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        ToastHelper.showToastShort(FoundationAlias.getFapp(), 2131841487);
        BLog.w("NegativeFeedbackResponse", "error", th);
        PegasusProblemReporter pegasusProblemReporter = PegasusProblemReporter.INSTANCE;
        FeedbackEventType feedbackEventType = FeedbackEventType.NF_RESPONSE;
        BasePegasusData basePegasusData = this.f78095b;
        String cardGoto = basePegasusData.getCardGoto();
        String str = cardGoto;
        if (cardGoto == null) {
            str = "invalid";
        }
        Pair pair = TuplesKt.to("goto", str);
        String cardType = basePegasusData.getCardType();
        String str2 = cardType;
        if (cardType == null) {
            str2 = "invalid";
        }
        Pair pair2 = TuplesKt.to("card_type", str2);
        String threePointV = basePegasusData.getThreePointV();
        if (threePointV == null) {
            threePointV = "invalid";
        }
        pegasusProblemReporter.reportFeedbackState(feedbackEventType, MapsKt.mapOf(new Pair[]{pair, pair2, TuplesKt.to("three_point_v", threePointV), TuplesKt.to("success", "0"), TuplesKt.to("from", "dislike_v6")}));
    }
}
