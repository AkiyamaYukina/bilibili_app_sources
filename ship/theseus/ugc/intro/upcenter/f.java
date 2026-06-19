package com.bilibili.ship.theseus.ugc.intro.upcenter;

import android.view.View;
import android.widget.TextView;
import com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterUIComponent;
import com.mall.ui.page.ip.sponsor.MallCharacterSponsorFragmentV2;
import gJ.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import qk0.ViewOnClickListenerC8443B;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/f.class */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f97559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f97560b;

    public /* synthetic */ f(Object obj, int i7) {
        this.f97559a = i7;
        this.f97560b = obj;
    }

    public final Object invoke() {
        switch (this.f97559a) {
            case 0:
                ((UgcUpCenterUIComponent) this.f97560b).f97526c.tryEmit(UgcUpCenterUIComponent.a.d.f97532a);
                return Unit.INSTANCE;
            case 1:
                ((Function0) this.f97560b).invoke();
                return Unit.INSTANCE;
            case 2:
                View view = ((MallCharacterSponsorFragmentV2) this.f97560b).b;
                return view != null ? view.findViewById(2131310348) : null;
            case 3:
                n nVar = (n) this.f97560b;
                return new dJ.g(((gJ.c) nVar).a.jf().a, nVar.a());
            default:
                return (TextView) ((ViewOnClickListenerC8443B) this.f97560b).f126033b.findViewById(2131311514);
        }
    }
}
