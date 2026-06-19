package com.bilibili.opd.app.bizcommon.imageselector.page;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.mobile.BLHumanActionParamsType;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.imageselector.page.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/k.class */
public final class ViewOnClickListenerC5558k implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.LongRef f73905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f73906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MallMediaFragment f73907c;

    public ViewOnClickListenerC5558k(Ref.LongRef longRef, View view, MallMediaFragment mallMediaFragment) {
        this.f73905a = longRef;
        this.f73906b = view;
        this.f73907c = mallMediaFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FragmentActivity fragmentActivityP3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Ref.LongRef longRef = this.f73905a;
        long j7 = longRef.element;
        longRef.element = System.currentTimeMillis();
        if (jCurrentTimeMillis - j7 >= BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE && (fragmentActivityP3 = this.f73907c.p3()) != null) {
            fragmentActivityP3.finish();
        }
    }
}
