package com.bilibili.opd.app.bizcommon.imageselector.page;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.mobile.BLHumanActionParamsType;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/F.class */
public final class F implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.LongRef f73754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f73755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MallMediaTakePhotoFragment f73756c;

    public F(Ref.LongRef longRef, View view, MallMediaTakePhotoFragment mallMediaTakePhotoFragment) {
        this.f73754a = longRef;
        this.f73755b = view;
        this.f73756c = mallMediaTakePhotoFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FragmentActivity fragmentActivityP3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Ref.LongRef longRef = this.f73754a;
        long j7 = longRef.element;
        longRef.element = System.currentTimeMillis();
        if (jCurrentTimeMillis - j7 >= BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE && (fragmentActivityP3 = this.f73756c.p3()) != null) {
            fragmentActivityP3.finish();
        }
    }
}
