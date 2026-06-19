package com.bilibili.ship.theseus.ogv.aggregate;

import Mu0.r;
import Mu0.s;
import Y31.a;
import ZS0.m0;
import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentManager;
import com.bilibili.ship.theseus.ogv.router.OpenPageInterceptor;
import com.bilibili.ship.theseus.ogv.vip.d;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import ev0.j;
import k.InterfaceC7728a;
import kntr.base.router.Response;
import kntr.base.router.Router;
import kntr.base.router.target.RouterTarget;
import kntr.common.router.GlobalRouterKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/aggregate/a.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.bilibili.ship.theseus.united.di.MediaCoroutineScope"})
public final class a implements Factory<Router> {
    public static Router a(OpenPageInterceptor openPageInterceptor, ComponentActivity componentActivity, FragmentManager fragmentManager, final CoroutineScope coroutineScope, final j.a aVar) {
        Router.a aVarNewBuilder = GlobalRouterKt.getGlobalRouter().newBuilder();
        aVarNewBuilder.b(openPageInterceptor);
        aVarNewBuilder.b(new Y31.a(coroutineScope, aVar) { // from class: com.bilibili.ship.theseus.ogv.aggregate.OgvMediaBaselineModule$provideRouter$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CoroutineScope f91604a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final j.a f91605b;

            {
                this.f91604a = coroutineScope;
                this.f91605b = aVar;
            }

            public final Response a(a.a aVar2) {
                if (!d.a.c(((kntr.base.router.internal.b) aVar2).e)) {
                    return a.a.a(aVar2, (RouterTarget) null, 3);
                }
                BuildersKt.launch$default(this.f91604a, (CoroutineContext) null, (CoroutineStart) null, new OgvMediaBaselineModule$provideRouter$1$intercept$1(this.f91605b, aVar2, null), 3, (Object) null);
                return Response.b.a;
            }
        });
        aVarNewBuilder.a(Reflection.typeOf(Context.class), new m0(componentActivity));
        aVarNewBuilder.a(Reflection.typeOf(InterfaceC7728a.class), new m0(componentActivity));
        aVarNewBuilder.a(Reflection.typeOf(FragmentManager.class), new r(fragmentManager, 1));
        aVarNewBuilder.a(Reflection.typeOf(CoroutineScope.class), new s(coroutineScope, 3));
        return (Router) Preconditions.checkNotNullFromProvides(aVarNewBuilder.c());
    }
}
