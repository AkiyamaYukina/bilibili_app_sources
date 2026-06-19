package com.bilibili.ship.theseus.united.page.uistyle;

import LJ0.c;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.userfeedback.laserreport.LogReportStrategy;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusForceNormalUIStyleService.class */
@StabilityInferred(parameters = 1)
public final class TheseusForceNormalUIStyleService {

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusForceNormalUIStyleService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusForceNormalUIStyleService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.ship.theseus.united.page.view.a $archiveRepository;
        final FragmentActivity $fragmentActivity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.bilibili.ship.theseus.united.page.view.a aVar, FragmentActivity fragmentActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$archiveRepository = aVar;
            this.$fragmentActivity = fragmentActivity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$archiveRepository, this.$fragmentActivity, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Long> stateFlow = this.$archiveRepository.f104038c;
                TheseusForceNormalUIStyleService$1$avid$1 theseusForceNormalUIStyleService$1$avid$1 = new TheseusForceNormalUIStyleService$1$avid$1(null);
                this.label = 1;
                Object objFirst = FlowKt.first(stateFlow, theseusForceNormalUIStyleService$1$avid$1, this);
                obj = objFirst;
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            long jLongValue = ((Number) obj).longValue();
            long jC = this.$archiveRepository.c();
            BLRouter.routeTo$default(RouteRequestKt.toRouteRequest(c.a(LogReportStrategy.TAG_DEFAULT, "united_video").appendQueryParameter("aid", String.valueOf(jLongValue)).appendQueryParameter("cid", String.valueOf(jC)).appendQueryParameter("united_ui_force_normal_ui_style", "1").build()), (Context) null, 2, (Object) null);
            StringBuilder sb = new StringBuilder("Redirecting to normal UI style with aid: ");
            sb.append(jLongValue);
            defpackage.a.b("[theseus-united-TheseusForceNormalUIStyleService$1-invokeSuspend] ", Ld.c.a(sb, jC, ", cid: "), "TheseusForceNormalUIStyleService$1-invokeSuspend");
            this.$fragmentActivity.finish();
            return Unit.INSTANCE;
        }
    }

    @Inject
    public TheseusForceNormalUIStyleService(@NotNull CoroutineScope coroutineScope, @NotNull FragmentActivity fragmentActivity, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull TheseusPageUIStyleRepository theseusPageUIStyleRepository) {
        if (theseusPageUIStyleRepository.f103503m) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(aVar, fragmentActivity, null), 3, (Object) null);
        }
    }
}
