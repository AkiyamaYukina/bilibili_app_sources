package com.bilibili.ship.theseus.cheese.biz.intro.attendance;

import com.bilibili.ship.theseus.cheese.biz.intro.attendance.n;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/CheeseAttendanceShare$Companion$createSharePoster$1.class */
final class CheeseAttendanceShare$Companion$createSharePoster$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final n.a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseAttendanceShare$Companion$createSharePoster$1(n.a aVar, Continuation<? super CheeseAttendanceShare$Companion$createSharePoster$1> continuation) {
        super(continuation);
        this.this$0 = aVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, this);
    }
}
