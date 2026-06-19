package com.bilibili.pegasus.holders;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.app.comm.list.common.feed.FeedbackEventType;
import com.bilibili.app.comm.list.common.feed.PegasusProblemReporter;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.pegasus.compat.PegasusCoverStyle;
import com.bilibili.pegasus.data.base.BasePegasusData;
import com.bilibili.pegasus.data.card.DislikeItemData;
import com.bilibili.pegasus.data.card.DislikeRequestRecord;
import com.bilibili.pegasus.ext.router.SpecialSpmidType;
import kotlin.Lazy;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import qp0.C8476b;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/v.class */
@StabilityInferred(parameters = 0)
public final class C5702v extends AbstractC5652d<DislikeItemData> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f78102k = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final BiliImageView f78103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final TintLinearLayout f78104g;

    @NotNull
    public final View h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final TintLinearLayout f78105i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final TextView f78106j;

    public C5702v(@NotNull ConstraintLayout constraintLayout) {
        super(constraintLayout);
        BiliImageView biliImageViewFindViewById = constraintLayout.findViewById(2131299613);
        this.f78103f = biliImageViewFindViewById;
        TintLinearLayout tintLinearLayout = (TintLinearLayout) constraintLayout.findViewById(2131319339);
        this.f78104g = tintLinearLayout;
        View viewFindViewById = constraintLayout.findViewById(2131319315);
        this.h = viewFindViewById;
        TintLinearLayout tintLinearLayout2 = (TintLinearLayout) constraintLayout.findViewById(2131319338);
        this.f78105i = tintLinearLayout2;
        this.f78106j = (TextView) constraintLayout.findViewById(2131309984);
        biliImageViewFindViewById.setAspectRatio(PegasusCoverStyle.INSTANCE.getCoverRatio());
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: com.bilibili.pegasus.holders.r

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C5702v f78080a;

            {
                this.f78080a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                BasePegasusData dislikeAnchor;
                C5702v c5702v = this.f78080a;
                PegasusProblemReporter pegasusProblemReporter = PegasusProblemReporter.INSTANCE;
                FeedbackEventType feedbackEventType = FeedbackEventType.CANCEL_DISLIKE;
                if (c5702v.getBindData() == null) {
                    str = "1";
                } else {
                    DislikeItemData dislikeItemData = (DislikeItemData) c5702v.getBindData();
                    str = (dislikeItemData != null ? dislikeItemData.getDislikeAnchor() : null) == null ? "2" : "0";
                }
                pegasusProblemReporter.reportFeedbackState(feedbackEventType, MapsKt.mapOf(TuplesKt.to("data_check", str)));
                DislikeItemData dislikeItemData2 = (DislikeItemData) c5702v.getBindData();
                if (dislikeItemData2 == null || (dislikeAnchor = dislikeItemData2.getDislikeAnchor()) == null) {
                    return;
                }
                rp0.p.d(dislikeAnchor, "feedback.revoke", MapsKt.mapOf(TuplesKt.to("card_type", "dislike_v3")));
                c5702v.replaceItem(dislikeItemData2, dislikeAnchor);
                DislikeRequestRecord dislikeRequestRecord = dislikeItemData2.getDislikeRequestRecord();
                Lazy lazy = C8476b.f126257a;
                com.bilibili.pegasus.request.e.a(dislikeAnchor, dislikeRequestRecord, C8476b.b(SpecialSpmidType.DEFAULT), null, dislikeItemData2.getHasSecondPanel());
            }
        };
        tintLinearLayout.setOnClickListener(onClickListener);
        tintLinearLayout2.setOnClickListener(onClickListener);
        ListExtentionsKt.setOnClickDebounce$default(viewFindViewById, 0L, new com.bilibili.app.preferences.a(this, constraintLayout), 1, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u0(@org.jetbrains.annotations.NotNull com.bilibili.pegasus.data.card.DislikeItemData r9) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.C5702v.u0(com.bilibili.pegasus.data.card.DislikeItemData):void");
    }

    public final void z0(int i7) {
        DislikeItemData dislikeItemData = (DislikeItemData) getBindData();
        if (dislikeItemData == null) {
            return;
        }
        dislikeItemData.setDislikeState(i7);
        TintLinearLayout tintLinearLayout = this.f78105i;
        TintLinearLayout tintLinearLayout2 = this.f78104g;
        if (i7 == 1) {
            tintLinearLayout2.setVisibility(0);
            this.f78106j.setMaxLines(3);
            this.h.setVisibility(0);
            tintLinearLayout.setVisibility(8);
            return;
        }
        if (i7 == 2) {
            tintLinearLayout2.setVisibility(8);
            this.f78106j.setMaxLines(4);
            this.h.setVisibility(8);
            tintLinearLayout.setVisibility(0);
            return;
        }
        if (i7 != 3) {
            return;
        }
        tintLinearLayout2.setVisibility(8);
        this.f78106j.setMaxLines(4);
        this.h.setVisibility(8);
        tintLinearLayout.setVisibility(0);
    }
}
