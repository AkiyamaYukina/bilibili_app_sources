package com.bilibili.ship.theseus.cheese.biz.intro.attendance;

import androidx.compose.ui.graphics.painter.Painter;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.ship.theseus.cheese.biz.intro.attendance.n;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/CheeseAttendanceShare$Companion$createSharePoster$images$1$1$1.class */
public final class CheeseAttendanceShare$Companion$createSharePoster$images$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Painter>, Object> {
    final FragmentActivity $activity;
    final String $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseAttendanceShare$Companion$createSharePoster$images$1$1$1(FragmentActivity fragmentActivity, String str, Continuation<? super CheeseAttendanceShare$Companion$createSharePoster$images$1$1$1> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.$it = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseAttendanceShare$Companion$createSharePoster$images$1$1$1(this.$activity, this.$it, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Painter> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            n.a aVar = n.f89335a;
            FragmentActivity fragmentActivity = this.$activity;
            String str = this.$it;
            this.label = 1;
            Object objA = n.a.a(aVar, fragmentActivity, str, this);
            obj = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
