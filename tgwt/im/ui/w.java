package com.bilibili.tgwt.im.ui;

import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/w.class */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TogetherWatchChangeRoomFragment f111327a;

    public final Object invoke(Object obj) {
        TogetherWatchChangeRoomFragment togetherWatchChangeRoomFragment = this.f111327a;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(togetherWatchChangeRoomFragment), (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchChangeRoomFragment$onCreate$1$1(togetherWatchChangeRoomFragment, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
