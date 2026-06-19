package com.bilibili.ship.theseus.ugc.intro.uplikes;

import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import com.bilibili.adcommon.utils.ext.AdExtensions;
import com.bilibili.ship.theseus.ugc.intro.uplikes.c;
import com.mall.ui.page.ip.sponsor.MallSponsorDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import qk0.ViewOnClickListenerC8443B;
import u9.g;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/a.class */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f97700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f97701b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f97700a = i7;
        this.f97701b = obj;
    }

    public final Object invoke() {
        switch (this.f97700a) {
            case 0:
                ((c) this.f97701b).f97706d.tryEmit(c.a.b.f97710a);
                return Unit.INSTANCE;
            case 1:
                View view = ((MallSponsorDialogFragment) this.f97701b).d;
                return view != null ? (TextView) view.findViewById(2131315398) : null;
            case 2:
                return (TextView) ((ViewOnClickListenerC8443B) this.f97701b).f126033b.findViewById(2131303548);
            case 3:
                return new g.a((u9.g) this.f97701b);
            default:
                int dimensionPixelSize = ((j8.b) ((yc.f) this.f97701b)).b.getResources().getDimensionPixelSize(2131166076);
                return new Rect(dimensionPixelSize, AdExtensions.getToPx(10), dimensionPixelSize, AdExtensions.getToPx(10));
        }
    }
}
