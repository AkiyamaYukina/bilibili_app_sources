package com.bilibili.pegasus.channelv2.detail.tab.baike.inline;

import android.widget.TextView;
import kotlin.jvm.functions.Function0;
import pi0.AlertDialogC8303c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/inline/d.class */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f75152b;

    public /* synthetic */ d(Object obj, int i7) {
        this.f75151a = i7;
        this.f75152b = obj;
    }

    public final Object invoke() {
        Object obj = this.f75152b;
        switch (this.f75151a) {
            case 0:
                return new f(((e) obj).f75153a);
            case 1:
                return ((Exception) obj).toString();
            default:
                int i7 = AlertDialogC8303c.h;
                return (TextView) ((AlertDialogC8303c) obj).findViewById(2131298237);
        }
    }
}
