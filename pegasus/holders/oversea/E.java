package com.bilibili.pegasus.holders.oversea;

import android.os.SystemClock;
import android.view.View;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.pegasus.data.base.BasePegasusData;
import com.bilibili.pegasus.data.card.DislikeItemData;
import com.bilibili.pegasus.data.card.DislikeRequestRecord;
import com.bilibili.pegasus.ext.router.SpecialSpmidType;
import com.bilibili.pegasus.holders.AbstractC5652d;
import kotlin.Lazy;
import op0.C8249a;
import qp0.C8476b;
import tv.danmaku.bili.widget.ForegroundConstraintLayout;
import vp0.C8840a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/oversea/E.class */
public final /* synthetic */ class E implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC5652d f77915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f77916c;

    public /* synthetic */ E(AbstractC5652d abstractC5652d, Object obj, int i7) {
        this.f77914a = i7;
        this.f77915b = abstractC5652d;
        this.f77916c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strA = null;
        switch (this.f77914a) {
            case 0:
                LargeCoverSingleV13Holder largeCoverSingleV13Holder = (LargeCoverSingleV13Holder) this.f77915b;
                ip0.c cVar = (ip0.c) this.f77916c;
                jp0.d dVarK = cVar.k();
                if (dVarK != null) {
                    strA = dVarK.a(cVar.getUri());
                }
                C8249a.f(largeCoverSingleV13Holder, ListExtentionsKt.toUri(strA), null, null, false, null, null, 254);
                break;
            default:
                C8840a c8840a = (C8840a) this.f77915b;
                ForegroundConstraintLayout foregroundConstraintLayout = (ForegroundConstraintLayout) this.f77916c;
                DislikeItemData dislikeItemData = (DislikeItemData) c8840a.getBindData();
                if (dislikeItemData != null) {
                    if (SystemClock.elapsedRealtime() - dislikeItemData.getDislikeTimestamp() <= 120000) {
                        BasePegasusData dislikeAnchor = dislikeItemData.getDislikeAnchor();
                        if (dislikeAnchor != null) {
                            c8840a.replaceItem(dislikeItemData, dislikeAnchor);
                            DislikeRequestRecord dislikeRequestRecord = dislikeItemData.getDislikeRequestRecord();
                            Lazy lazy = C8476b.f126257a;
                            com.bilibili.pegasus.request.e.a(dislikeAnchor, dislikeRequestRecord, C8476b.b(SpecialSpmidType.DEFAULT), null, dislikeItemData.getHasSecondPanel());
                            break;
                        }
                    } else {
                        PromoToast.showMidToast(foregroundConstraintLayout.getContext(), 2131845086);
                        break;
                    }
                }
                break;
        }
    }
}
