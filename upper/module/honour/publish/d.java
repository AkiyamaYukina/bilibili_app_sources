package com.bilibili.upper.module.honour.publish;

import com.bapis.bilibili.app.im.v1.KSessionPageType;
import com.bilibili.lib.gripper.api.SuspendProducer;
import com.bilibili.lib.gripper.api.hiltlike.Component_jvmKt;
import com.google.common.collect.ImmutableSet;
import dagger.internal.Preconditions;
import im.session.IMSessionStateMachine;
import im.session.IMSessionViewModel;
import im.session.service.IMSessionBroadcastService;
import im.session.service.l;
import im.session.service.m;
import im.session.service.n;
import im.session.service.s;
import im.session.service.u;
import kntr.base.hilt.component.HiltSingletonComponent_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/publish/d.class */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f113183a;

    /* JADX WARN: Type inference failed for: r10v6, types: [im.session.service.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4, types: [im.session.service.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [im.session.service.i, java.lang.Object] */
    public final Object invoke(Object obj) {
        switch (this.f113183a) {
            case 0:
                ((Integer) obj).intValue();
                return Unit.INSTANCE;
            default:
                a.j1 j1Var = ((im.session.di.b) Component_jvmKt.entryPoint(HiltSingletonComponent_androidKt.getHiltSingletonComponent(), Reflection.getOrCreateKotlinClass(im.session.di.b.class))).u().a;
                yW0.b bVarB = yW0.b.b(new tv.danmaku.bili.f(j1Var, 0));
                yW0.b bVarB2 = yW0.b.b(new tv.danmaku.bili.f(j1Var, 1));
                KSessionPageType.SESSION_PAGE_TYPE_HOME session_page_type_home = KSessionPageType.SESSION_PAGE_TYPE_HOME.INSTANCE;
                return new IMSessionViewModel(session_page_type_home, new IMSessionStateMachine(session_page_type_home, (IMSessionBroadcastService) j1Var.ub.get(), new l(new n(j1Var.getAccount(), (im.session.service.j) ((SuspendProducer) j1Var.V6.get()).get()), new im.session.service.request.b((u) bVarB.get())), new s((u) bVarB.get()), (im.session.service.i) new Object(), (im.session.service.f) new Object(), (im.session.service.e) new Object(), (m) bVarB2.get(), j1Var.getAccount(), (u) bVarB.get(), new n(j1Var.getAccount(), (im.session.service.j) ((SuspendProducer) j1Var.V6.get()).get()), (im.session.service.g) Preconditions.checkNotNullFromProvides((im.session.service.g) ((SuspendProducer) j1Var.Pb.get()).get())), ImmutableSet.of(new Object(), (xX0.b) Preconditions.checkNotNullFromProvides(com.bilibili.bplus.im.badge.h.provideSessionEventCallback((com.bilibili.bplus.im.badge.a) Preconditions.checkNotNullFromProvides((com.bilibili.bplus.im.badge.a) ((SuspendProducer) j1Var.g7.get()).get())))));
        }
    }
}
