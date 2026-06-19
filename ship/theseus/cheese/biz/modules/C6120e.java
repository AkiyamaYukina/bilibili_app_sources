package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.common.PugvCooperationApplication;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ship.theseus.cheese.biz.intro.cooperation.a;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.modules.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/e.class */
public final /* synthetic */ class C6120e implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.ship.theseus.cheese.biz.intro.cooperation.d f90398a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        PugvCooperationApplication pugvCooperationApplication = mVar.f124400a.getPugvCooperationApplication();
        com.bilibili.ship.theseus.cheese.biz.intro.cooperation.d dVar = this.f90398a;
        dVar.getClass();
        mVar.a(new RunningUIComponent(new com.bilibili.ship.theseus.cheese.biz.intro.cooperation.a(StateFlowKt.MutableStateFlow(new a.C0607a(pugvCooperationApplication.getTitle(), pugvCooperationApplication.getSubtitle(), pugvCooperationApplication.getButtonText(), pugvCooperationApplication.getIcon(), dVar.f89371c.f100021b, new com.bilibili.ship.theseus.cheese.biz.intro.cooperation.c(0, dVar, pugvCooperationApplication)))), 0, (Function1) null, 6));
    }
}
