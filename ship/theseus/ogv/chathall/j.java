package com.bilibili.ship.theseus.ogv.chathall;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tv.danmaku.bili.widget.BaseDialog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/j.class */
public final class j implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatHallPopDialog f91779a;

    public j(ChatHallPopDialog chatHallPopDialog) {
        this.f91779a = chatHallPopDialog;
    }

    public final Object invoke(Object obj) {
        BaseDialog baseDialog = this.f91779a;
        baseDialog.setOnDismissListener(null);
        baseDialog.cancel();
        return Unit.INSTANCE;
    }
}
