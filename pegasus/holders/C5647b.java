package com.bilibili.pegasus.holders;

import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.pegasus.data.base.BasePegasusData;
import com.bilibili.pegasus.data.card.DislikeItemData;
import com.bilibili.pegasus.data.card.DislikeRequestRecord;
import com.bilibili.pegasus.ext.router.SpecialSpmidType;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qp0.C8476b;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/b.class */
@StabilityInferred(parameters = 0)
public class C5647b extends AbstractC5652d<DislikeItemData> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final BiliImageView f77664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final TextView f77665g;

    @NotNull
    public final View h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final TextView f77666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final TextView f77667j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public String f77668k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public String f77669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public String f77670m;

    public C5647b(@NotNull final View view) {
        super(view);
        this.f77664f = view.findViewById(2131299613);
        this.f77665g = (TextView) view.findViewById(2131300194);
        View viewFindViewById = view.findViewById(2131315666);
        this.h = viewFindViewById;
        TextView textView = (TextView) view.findViewById(2131298958);
        this.f77666i = (TextView) view.findViewById(2131309984);
        this.f77667j = (TextView) view.findViewById(2131313347);
        viewFindViewById.setOnClickListener(new View.OnClickListener(this, view) { // from class: com.bilibili.pegasus.holders.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C5647b f77659a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final View f77660b;

            {
                this.f77659a = this;
                this.f77660b = view;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C5647b c5647b = this.f77659a;
                View view3 = this.f77660b;
                DislikeItemData dislikeItemData = (DislikeItemData) c5647b.getBindData();
                if (dislikeItemData == null) {
                    return;
                }
                if (SystemClock.elapsedRealtime() - dislikeItemData.getDislikeTimestamp() > 120000) {
                    PromoToast.showMidToast(view3.getContext(), 2131845086);
                    return;
                }
                BasePegasusData dislikeAnchor = dislikeItemData.getDislikeAnchor();
                if (dislikeAnchor == null) {
                    return;
                }
                c5647b.replaceItem(dislikeItemData, dislikeAnchor);
                DislikeRequestRecord dislikeRequestRecord = dislikeItemData.getDislikeRequestRecord();
                Lazy lazy = C8476b.f126257a;
                com.bilibili.pegasus.request.e.a(dislikeAnchor, dislikeRequestRecord, C8476b.b(SpecialSpmidType.DEFAULT), null, dislikeItemData.getHasSecondPanel());
            }
        });
        if (textView != null) {
            textView.setOnClickListener(new com.bilibili.app.imagepicker.d(this, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.pegasus.holders.b, com.bilibili.pegasus.holders.n] */
    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void u0(@org.jetbrains.annotations.NotNull com.bilibili.pegasus.data.card.DislikeItemData r5) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.C5647b.onBind(com.bilibili.pegasus.data.card.DislikeItemData):void");
    }
}
