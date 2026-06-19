package com.bilibili.upper.module.partitionTag.partitionTopic.fragment;

import YT0.i;
import android.view.View;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.mall.ui.page.order.express.MallExpressDetailBottomSheet;
import uI0.C8716e;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/fragment/b.class */
public final /* synthetic */ class b implements C8716e.a, i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx_fragment_app_Fragment f113797a;

    public /* synthetic */ b(androidx_fragment_app_Fragment androidx_fragment_app_fragment) {
        this.f113797a = androidx_fragment_app_fragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    @Override // uI0.C8716e.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.bilibili.upper.api.bean.Child r6) {
        /*
            r5 = this;
            r0 = r5
            com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment r0 = r0.f113797a
            com.bilibili.upper.module.partitionTag.partitionTopic.fragment.PartitionFragment r0 = (com.bilibili.upper.module.partitionTag.partitionTopic.fragment.PartitionFragment) r0
            r7 = r0
            r0 = r7
            AI0.f r0 = r0.f113763f
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L47
            r0 = r8
            com.bilibili.upper.module.partitionTag.partitionTopic.bean.UpperPartTagRequestParam r0 = r0.f246m
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L47
            r0 = r6
            long r0 = r0.id
            r1 = r8
            long r1 = r1.getChildTypeId()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L47
            r0 = r8
            r1 = r6
            long r1 = r1.id
            r0.setChildTypeId(r1)
            r0 = r7
            AI0.f r0 = r0.f113763f
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L47
            r0 = r6
            androidx.lifecycle.MutableLiveData<vI0.a> r0 = r0.h
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L47
            r0 = r6
            vI0.a$c r1 = vI0.AbstractC8790a.c.f128169b
            r0.setValue(r1)
        L47:
            r0 = r7
            AI0.f r0 = r0.f113763f
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L5b
            r0 = r6
            java.lang.String r0 = r0.M0()
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L5e
        L5b:
            java.lang.String r0 = ""
            r6 = r0
        L5e:
            TE0.b r0 = TE0.b.f24088a
            java.lang.Class r0 = r0.getClass()
            r0 = 0
            r1 = r6
            TE0.b.R(r0, r1)
            r0 = 0
            java.lang.String r1 = "creation.select-partition.card-disappear.0.click"
            java.util.HashMap r2 = new java.util.HashMap
            r3 = r2
            r3.<init>()
            com.bilibili.lib.neuron.api.Neurons.reportClick(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.partitionTag.partitionTopic.fragment.b.a(com.bilibili.upper.api.bean.Child):void");
    }

    public void onClick(View view) {
        MallExpressDetailBottomSheet mallExpressDetailBottomSheet = this.f113797a;
        RxExtensionsKt.bothNotNull(Boolean.valueOf(mallExpressDetailBottomSheet.y), mallExpressDetailBottomSheet.w, new com.mall.ui.page.order.express.c(mallExpressDetailBottomSheet));
    }
}
