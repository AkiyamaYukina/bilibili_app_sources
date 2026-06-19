package com.bilibili.lib.push;

import android.content.Context;
import com.bilibili.droid.ProcessUtils;
import com.bilibili.gripper.container.bpush.d;
import com.bilibili.lib.push.utils.RomUtils;
import java.util.HashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/RedDotHelper$clearRedDot$1.class */
final class RedDotHelper$clearRedDot$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Context $context;
    final ClearTrigger $trigger;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedDotHelper$clearRedDot$1(Context context, ClearTrigger clearTrigger, Continuation<? super RedDotHelper$clearRedDot$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$trigger = clearTrigger;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RedDotHelper$clearRedDot$1(this.$context, this.$trigger, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        int followingRedDot = 0;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if ((RomUtils.isOppoRom() || RomUtils.isHuaweiRomNew() || RomUtils.isHonorRom()) && C5334b.c().getPushParams().reportRedDotClick()) {
                B bA = A.a(this.$context);
                Integer numBoxInt = bA != null ? Boxing.boxInt(bA.a(this.$context)) : null;
                HashMap map = new HashMap();
                map.put("num", String.valueOf(numBoxInt));
                map.put("is_coldstart", this.$trigger == ClearTrigger.INIT ? "1" : "0");
                if (this.$trigger != ClearTrigger.FOREGROUND || A.f64159d) {
                    try {
                        Result.Companion companion = Result.Companion;
                        BPushNeurons.INSTANCE.reportClick(false, "main.active.redpoint.0.click", map);
                        Result.constructor-impl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        Result.constructor-impl(ResultKt.createFailure(th));
                    }
                } else {
                    BPushLog.i("RedDotHelper", "report RedDot not real foreground");
                }
            }
            Context context = this.$context;
            B bA2 = A.a(context);
            if (bA2 != null) {
                bA2.b(0, context);
            }
            if (this.$trigger != ClearTrigger.INIT) {
                if (A.f64159d) {
                    Context context2 = this.$context;
                    this.label = 1;
                    Object objB = A.f64160e == null ? A.f64156a.b(context2, this) : Boxing.boxBoolean(A.f64158c);
                    obj2 = objB;
                    if (objB == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    BPushLog.i("RedDotHelper", "clearRedDot not real foreground");
                    A.f64159d = true;
                }
            }
            return Unit.INSTANCE;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        obj2 = obj;
        if (!((Boolean) obj2).booleanValue()) {
            BPushLog.i("RedDotHelper", "clearRedDot not in exp");
            return Unit.INSTANCE;
        }
        BPushLog.i("RedDotHelper", "clearRedDot in exp");
        RedDotBiz redDotBiz = RedDotBiz.FOLLOWING;
        d.a.a aVar = C5334b.b().f64244e;
        if (aVar != null) {
            followingRedDot = aVar.a.getFollowingRedDot();
        }
        BPushLog.i("RedDotHelper", "clearRedDot getBizRedDot = " + followingRedDot);
        if (followingRedDot != 0) {
            Context context3 = this.$context;
            int code = redDotBiz.getCode();
            BPushLog.i("RedDotHelper", "setRedDot source = " + code + ", process = " + ProcessUtils.myProcName());
            if (ProcessUtils.isMainProcess()) {
                BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), (CoroutineContext) null, (CoroutineStart) null, new RedDotHelper$setRedDot$1(code, context3, followingRedDot, null), 3, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }
}
