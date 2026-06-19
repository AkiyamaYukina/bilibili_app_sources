package com.bilibili.opd.app.bizcommon.imageselector.page;

import android.view.View;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.mobile.BLHumanActionParamsType;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.imageselector.page.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/i.class */
public final class ViewOnClickListenerC5556i implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.LongRef f73901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f73902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MallMediaFragment f73903c;

    public ViewOnClickListenerC5556i(Ref.LongRef longRef, View view, MallMediaFragment mallMediaFragment) {
        this.f73901a = longRef;
        this.f73902b = view;
        this.f73903c = mallMediaFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Ref.LongRef longRef = this.f73901a;
        long j7 = longRef.element;
        longRef.element = System.currentTimeMillis();
        if (jCurrentTimeMillis - j7 < BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE) {
            return;
        }
        BiliImageView biliImageView = this.f73903c.f73785g;
        if (biliImageView != null) {
            biliImageView.setVisibility(8);
        }
        new SharedPreferencesHelper(this.f73903c.getContext(), "bilibili.mall.share.preference").setBoolean("show_text2img_guide", false);
    }
}
