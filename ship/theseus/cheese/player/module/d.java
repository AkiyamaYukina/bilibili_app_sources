package com.bilibili.ship.theseus.cheese.player.module;

import X1.F;
import android.content.Intent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/module/d.class */
public final class d<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d<T> f90668a = (d<T>) new Object();

    public final Object emit(Object obj, Continuation continuation) {
        com.bilibili.ship.theseus.united.page.activityresult.a aVar = (com.bilibili.ship.theseus.united.page.activityresult.a) obj;
        int i7 = aVar.f98830a;
        Intent intent = aVar.f98832c;
        StringBuilder sbB = F.b(i7, "ActivityResult requestCode = ", " resultCode = ");
        sbB.append(aVar.f98831b);
        sbB.append(" data = ");
        sbB.append(intent);
        defpackage.a.b("[theseus-cheese-CheeseChronosBusinessService$collectPermissionGrantResult$2-emit] ", sbB.toString(), "CheeseChronosBusinessService$collectPermissionGrantResult$2-emit");
        return Unit.INSTANCE;
    }
}
