package com.bilibili.pegasus.components;

import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.main.MainCommonService;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/f0.class */
public final class f0 extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.IntRef f75958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f75959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f75960c;

    public f0(Ref.IntRef intRef, int i7, g0 g0Var) {
        this.f75958a = intRef;
        this.f75959b = i7;
        this.f75960c = g0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
        super.onScrolled(recyclerView, i7, i8);
        Ref.IntRef intRef = this.f75958a;
        int i9 = intRef.element + i8;
        intRef.element = i9;
        if (i9 >= this.f75959b) {
            recyclerView.removeOnScrollListener(this);
            intRef.element = 0;
            MainCommonService mainCommonService = (MainCommonService) BLRouter.get$default(BLRouter.INSTANCE, MainCommonService.class, (String) null, 2, (Object) null);
            if (mainCommonService != null) {
                mainCommonService.showNotificationSettingDialog(this.f75960c.getActivity(), "8");
            }
        }
    }
}
