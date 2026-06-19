package com.bilibili.ship.theseus.united.player.mediaplay;

import com.bilibili.ship.theseus.united.page.videoquality.C6435i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/TheseusPlayableFactory$create$7.class */
final /* synthetic */ class TheseusPlayableFactory$create$7 extends FunctionReferenceImpl implements Function0<Boolean> {
    public TheseusPlayableFactory$create$7(Object obj) {
        super(0, obj, C6435i.class, "isRememberDolbyOrHDR", "isRememberDolbyOrHDR()Z", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final Boolean m9680invoke() {
        return Boolean.valueOf(((C6435i) ((CallableReference) this).receiver).a());
    }
}
