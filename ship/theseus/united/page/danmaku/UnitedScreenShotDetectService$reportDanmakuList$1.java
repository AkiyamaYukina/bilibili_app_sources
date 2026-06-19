package com.bilibili.ship.theseus.united.page.danmaku;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/UnitedScreenShotDetectService$reportDanmakuList$1.class */
final class UnitedScreenShotDetectService$reportDanmakuList$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final UnitedScreenShotDetectService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedScreenShotDetectService$reportDanmakuList$1(UnitedScreenShotDetectService unitedScreenShotDetectService, Continuation<? super UnitedScreenShotDetectService$reportDanmakuList$1> continuation) {
        super(continuation);
        this.this$0 = unitedScreenShotDetectService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return UnitedScreenShotDetectService.a(this.this$0, null, this);
    }
}
