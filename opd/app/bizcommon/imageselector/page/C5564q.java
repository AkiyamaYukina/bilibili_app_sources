package com.bilibili.opd.app.bizcommon.imageselector.page;

import com.bilibili.boxing.model.entity.BaseMedia;
import com.bilibili.opd.app.bizcommon.imageselector.media.MallImageMedia;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.imageselector.page.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/q.class */
public final class C5564q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MallMediaFragment f73921a;

    public C5564q(MallMediaFragment mallMediaFragment) {
        this.f73921a = mallMediaFragment;
    }

    public final void a(ArrayList<BaseMedia> arrayList) {
        MallMediaFragment.Companion.getClass();
        try {
            if (MallMediaFragment.f73777C == null) {
                MallMediaFragment.f73777C = new ArrayList();
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (obj instanceof MallImageMedia) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = MallMediaFragment.f73777C;
            if (arrayList4 != null) {
                arrayList4.clear();
            }
            ArrayList arrayList5 = MallMediaFragment.f73777C;
            if (arrayList5 != null) {
                arrayList5.addAll(arrayList3);
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }
}
