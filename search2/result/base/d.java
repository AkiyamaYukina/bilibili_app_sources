package com.bilibili.search2.result.base;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.bililive.room.biz.consumption.ui.LiveConsumptionManagerIntroducePanel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/d.class */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LifecycleOwner f87540b;

    public /* synthetic */ d(int i7, LifecycleOwner lifecycleOwner) {
        this.f87539a = i7;
        this.f87540b = lifecycleOwner;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f87539a) {
            case 0:
                BaseSearchResultFragment baseSearchResultFragment = (BaseSearchResultFragment) this.f87540b;
                KProperty<Object>[] kPropertyArr = BaseSearchResultFragment.f87471t;
                baseSearchResultFragment.loadData(true);
                break;
            case 1:
                vq0.d dVar = ((com.bilibili.ship.theseus.united.page.interactvideo.c) this.f87540b).f99955c;
                vq0.d dVar2 = dVar;
                if (dVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mProgressTrackingView");
                    dVar2 = null;
                }
                dVar2.b();
                break;
            default:
                LiveConsumptionManagerIntroducePanel liveConsumptionManagerIntroducePanel = this.f87540b;
                KProperty[] kPropertyArr2 = LiveConsumptionManagerIntroducePanel.h;
                liveConsumptionManagerIntroducePanel.dismissAllowingStateLoss();
                break;
        }
    }
}
