package com.bilibili.opd.app.bizcommon.imageselector.page;

import android.view.View;
import com.bilibili.mobile.BLHumanActionParamsType;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.imageselector.page.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/m.class */
public final class ViewOnClickListenerC5560m implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.LongRef f73911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f73912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MallMediaFragment f73913c;

    public ViewOnClickListenerC5560m(Ref.LongRef longRef, View view, MallMediaFragment mallMediaFragment) {
        this.f73911a = longRef;
        this.f73912b = view;
        this.f73913c = mallMediaFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Ref.LongRef longRef = this.f73911a;
        long j7 = longRef.element;
        longRef.element = System.currentTimeMillis();
        if (jCurrentTimeMillis - j7 < BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE) {
            return;
        }
        MallMediaFragment.access$toggleAlbumStatus(this.f73913c);
    }
}
