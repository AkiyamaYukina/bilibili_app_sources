package com.bilibili.ogv.secondary;

import android.os.Bundle;
import com.bilibili.adcommon.utils.ext.JSONObjectCreator;
import kntr.common.komponent.KomponentKt;
import kntr.common.komponent.KomponentScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/w.class */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f72949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f72950b;

    public /* synthetic */ w(Object obj, int i7) {
        this.f72949a = i7;
        this.f72950b = obj;
    }

    public final Object invoke(Object obj) {
        switch (this.f72949a) {
            case 0:
                KomponentScope komponentScope = (KomponentScope) obj;
                return komponentScope.__setContent(new C(Unit.INSTANCE, komponentScope.getContext(), komponentScope, komponentScope.embed(KomponentKt.Komponent(new com.bilibili.bililive.room.ui.roomv3.gift.r(((x) this.f72950b).a(), 1)))));
            default:
                Bundle bundle = (Bundle) this.f72950b;
                JSONObjectCreator jSONObjectCreator = (JSONObjectCreator) obj;
                kd.i.e(jSONObjectCreator, bundle);
                kd.i.b(jSONObjectCreator, bundle);
                kd.i.j(jSONObjectCreator, bundle);
                kd.i.f(jSONObjectCreator, bundle);
                kd.i.g(jSONObjectCreator, bundle);
                return Unit.INSTANCE;
        }
    }
}
