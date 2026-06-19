package com.bilibili.ship.theseus.ugc.intro;

import com.bapis.bilibili.app.viewunite.common.UpReserveManageBar;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableStateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/r.class */
public final /* synthetic */ class r implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.ship.theseus.united.page.intro.module.upreserve.j f97180a;

    /* JADX WARN: Type inference failed for: r7v0, types: [com.bilibili.ship.theseus.united.page.intro.module.upreserve.f] */
    @Override // nv0.h
    public final void a(nv0.m mVar) {
        UpReserveManageBar upReserveManageBar = mVar.f124400a.getUpReserveManageBar();
        String icon = upReserveManageBar.getIcon();
        String text = upReserveManageBar.getText();
        String actionText = upReserveManageBar.getActionText();
        String actionUri = upReserveManageBar.getActionUri();
        com.bilibili.ship.theseus.united.page.intro.module.upreserve.d dVar = new com.bilibili.ship.theseus.united.page.intro.module.upreserve.d(icon, text, actionText, actionUri, upReserveManageBar.getActionIcon());
        com.bilibili.ship.theseus.united.page.intro.module.upreserve.j jVar = this.f97180a;
        jVar.getClass();
        BLog.i("UpReserveManageService", "Init the  UI，uri = " + actionUri);
        MutableStateFlow<com.bilibili.ship.theseus.united.page.intro.module.upreserve.d> mutableStateFlow = jVar.h;
        mutableStateFlow.setValue(dVar);
        mVar.a(new RunningUIComponent(new com.bilibili.ship.theseus.united.page.intro.module.upreserve.e(mutableStateFlow, jVar.f102000e.f100020a, new Function0(jVar) { // from class: com.bilibili.ship.theseus.united.page.intro.module.upreserve.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final j f101992a;

            {
                this.f101992a = jVar;
            }

            public final Object invoke() {
                j jVar2 = this.f101992a;
                jVar2.getClass();
                BuildersKt.launch$default(jVar2.f101996a, (CoroutineContext) null, (CoroutineStart) null, new UpReserveManageService$createUpReservePanel$1(jVar2, null), 3, (Object) null);
                return Unit.INSTANCE;
            }
        }), 0, (Function1) null, 6));
    }
}
