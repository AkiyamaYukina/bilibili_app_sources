package com.bilibili.opd.app.bizcommon.imageselector.page;

import android.view.View;
import com.bilibili.boxing.model.entity.BaseMedia;
import com.bilibili.mobile.BLHumanActionParamsType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.imageselector.page.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/n.class */
public final class ViewOnClickListenerC5561n implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.LongRef f73914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f73915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MallMediaFragment f73916c;

    public ViewOnClickListenerC5561n(Ref.LongRef longRef, View view, MallMediaFragment mallMediaFragment) {
        this.f73914a = longRef;
        this.f73915b = view;
        this.f73916c = mallMediaFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList<BaseMedia> arrayList;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Ref.LongRef longRef = this.f73914a;
        long j7 = longRef.element;
        longRef.element = System.currentTimeMillis();
        if (jCurrentTimeMillis - j7 >= BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE && this.f73916c.p3() != null) {
            ArrayList<BaseMedia> arrayList2 = new ArrayList<>();
            Jm0.f fVar = this.f73916c.f73797t;
            if (fVar != null && (arrayList = fVar.f11537d) != null) {
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((BaseMedia) it.next());
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            this.f73916c.entryPreviewPage(null, arrayList2);
        }
    }
}
