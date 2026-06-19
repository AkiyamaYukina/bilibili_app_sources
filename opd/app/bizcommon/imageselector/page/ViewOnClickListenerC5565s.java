package com.bilibili.opd.app.bizcommon.imageselector.page;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$$ExternalSyntheticOutline1;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.mobile.BLHumanActionParamsType;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.imageselector.page.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/s.class */
public final class ViewOnClickListenerC5565s implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.LongRef f73923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f73924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MallMediaFragment f73925c;

    public ViewOnClickListenerC5565s(Ref.LongRef longRef, View view, MallMediaFragment mallMediaFragment) {
        this.f73923a = longRef;
        this.f73924b = view;
        this.f73925c = mallMediaFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Ref.LongRef longRef = this.f73923a;
        long j7 = longRef.element;
        longRef.element = System.currentTimeMillis();
        if (jCurrentTimeMillis - j7 < BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE) {
            return;
        }
        FragmentActivity fragmentActivityP3 = this.f73925c.p3();
        if (fragmentActivityP3 != null) {
            Intent intent = new Intent();
            Bundle bundleM = CredentialProviderBeginSignInController$$ExternalSyntheticOutline1.m("skip", "1", "mediaType", "1");
            Unit unit = Unit.INSTANCE;
            fragmentActivityP3.setResult(-1, intent.putExtras(bundleM));
        }
        this.f73925c.finishAttachedActivity();
    }
}
