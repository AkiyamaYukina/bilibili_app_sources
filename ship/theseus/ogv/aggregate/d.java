package com.bilibili.ship.theseus.ogv.aggregate;

import Mu0.r;
import Mu0.s;
import ZS0.m0;
import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentManager;
import com.bilibili.ship.theseus.ogv.router.OpenPageInterceptor;
import com.bilibili.ship.theseus.ogv.vip.VipCashierRouter$createVipCashierInterceptor$1;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import k.InterfaceC7728a;
import kntr.base.router.Router;
import kntr.common.router.GlobalRouterKt;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/aggregate/d.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.bilibili.ship.theseus.united.di.DetailBizCoroutineScope"})
public final class d implements Factory<Router> {
    public static Router a(OpenPageInterceptor openPageInterceptor, com.bilibili.ship.theseus.ogv.vip.d dVar, ComponentActivity componentActivity, FragmentManager fragmentManager, CoroutineScope coroutineScope) {
        Router.a aVarNewBuilder = GlobalRouterKt.getGlobalRouter().newBuilder();
        aVarNewBuilder.b(openPageInterceptor);
        dVar.getClass();
        aVarNewBuilder.b(new VipCashierRouter$createVipCashierInterceptor$1(dVar));
        aVarNewBuilder.a(Reflection.typeOf(Context.class), new m0(componentActivity));
        aVarNewBuilder.a(Reflection.typeOf(InterfaceC7728a.class), new m0(componentActivity));
        aVarNewBuilder.a(Reflection.typeOf(FragmentManager.class), new r(fragmentManager, 1));
        aVarNewBuilder.a(Reflection.typeOf(CoroutineScope.class), new s(coroutineScope, 3));
        return (Router) Preconditions.checkNotNullFromProvides(aVarNewBuilder.c());
    }
}
