package com.bilibili.ship.theseus.united.page.videoquality;

import android.widget.TextView;
import com.bilibili.upper.feat.open.publish.BiliUpperOpenPublishActivity;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import pi0.AlertDialogC8303c;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/k.class */
public final /* synthetic */ class C6437k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f103889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f103890b;

    public /* synthetic */ C6437k(Object obj, int i7) {
        this.f103889a = i7;
        this.f103890b = obj;
    }

    public final Object invoke() {
        Object obj = this.f103890b;
        switch (this.f103889a) {
            case 0:
                return ((C6438l) obj).f103894d.getScreenModeType();
            case 1:
                BiliUpperOpenPublishActivity biliUpperOpenPublishActivity = (BiliUpperOpenPublishActivity) obj;
                biliUpperOpenPublishActivity.F = true;
                biliUpperOpenPublishActivity.finish();
                return Unit.INSTANCE;
            case 2:
                B81.a.g((A81.a) obj, "app.onepass-login.onepass.operator.click", MapsKt.emptyMap());
                return Unit.INSTANCE;
            case 3:
                int i7 = AlertDialogC8303c.h;
                return (TextView) ((AlertDialogC8303c) obj).findViewById(2131298371);
            default:
                ((Function0) obj).invoke();
                return Unit.INSTANCE;
        }
    }
}
