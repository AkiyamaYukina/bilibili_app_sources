package com.bilibili.pegasus.components.interest;

import androidx.lifecycle.Lifecycle;
import ap0.C4823a;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.arch.lifecycle.Status;
import com.bilibili.pegasus.PegasusVisibleState;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.interest.reporter.InterestErrorType;
import com.bilibili.pegasus.interest.reporter.InterestEvent;
import com.bilibili.pegasus.interest.reporter.InterestFrom;
import com.bilibili.pegasus.vm.PegasusViewModel;
import com.bilibili.studio.material.util.UtilsKt;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.teenagersmode.c;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kp0.C7778a;
import kp0.C7781d;
import kp0.C7782e;
import lp0.C7879b;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/NewUserInterestChoosePlugin$tryInterestChoose$1.class */
final class NewUserInterestChoosePlugin$tryInterestChoose$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final NewUserInterestChoosePlugin this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/NewUserInterestChoosePlugin$tryInterestChoose$1$a.class */
    public static final class a implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NewUserInterestChoosePlugin f76316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C7782e f76317b;

        public a(NewUserInterestChoosePlugin newUserInterestChoosePlugin, C7782e c7782e) {
            this.f76316a = newUserInterestChoosePlugin;
            this.f76317b = c7782e;
        }

        public final Object invoke() {
            NewUserInterestChoosePlugin newUserInterestChoosePlugin = this.f76316a;
            boolean zIsAtLeast = newUserInterestChoosePlugin.getRequireFragment().getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED);
            C7782e c7782e = this.f76317b;
            if (zIsAtLeast) {
                newUserInterestChoosePlugin.e(c7782e.b());
            } else {
                newUserInterestChoosePlugin.getRequireFragment().getLifecycle().addObserver(new y(newUserInterestChoosePlugin, c7782e));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewUserInterestChoosePlugin$tryInterestChoose$1(NewUserInterestChoosePlugin newUserInterestChoosePlugin, Continuation<? super NewUserInterestChoosePlugin$tryInterestChoose$1> continuation) {
        super(2, continuation);
        this.this$0 = newUserInterestChoosePlugin;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NewUserInterestChoosePlugin$tryInterestChoose$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        C7778a c7778aA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Gp0.a.b(InterestEvent.REQUEST, null, null, InterestFrom.NEW, 6);
            e.b(InterestChainProcess.REQUEST, 1, null, null, null, "interest", 28);
            PegasusViewModel pegasusViewModel = (PegasusViewModel) this.this$0.f76295l.getValue();
            pegasusViewModel.getClass();
            pegasusViewModel.z(pegasusViewModel, new C7879b(true));
            String strI0 = ((com.bilibili.pegasus.components.cny.a) this.this$0.f76298o.getValue()).I0();
            this.label = 1;
            Object objD = com.bilibili.pegasus.request.b.d(0, strI0, this, 1);
            obj = objD;
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Resource resource = (Resource) obj;
        NewUserInterestChoosePlugin newUserInterestChoosePlugin = this.this$0;
        if (resource.getStatus() == Status.SUCCESS) {
            C7782e c7782e = (C7782e) resource.getData();
            C4823a.a((c7782e == null || (c7778aA = c7782e.a()) == null) ? 0 : c7778aA.a(), "interest");
            c.C1213c.f110575a.getClass();
            if (com.bilibili.teenagersmode.c.q()) {
                BLog.i("[Interest]NewUserInterestChoosePlugin", "interest choose blocked by overseas teenages");
                com.bilibili.teenagersmode.c.s(newUserInterestChoosePlugin.getRequireFragment().requireContext());
                newUserInterestChoosePlugin.c(false, null);
                Gp0.a.b(InterestEvent.ERROR, InterestErrorType.OVERSEAS_TEEN_BLOCKED, null, InterestFrom.NEW, 4);
                e.b(InterestChainProcess.ERROR, 0, InterestChainErrorCode.OVERSEAS_USER, null, null, "interest", 24);
            } else {
                if ((c7782e != null ? c7782e.b() : null) == null) {
                    BLog.i("[Interest]NewUserInterestChoosePlugin", "Request interest choose failure, and data is null");
                    Gp0.a.b(InterestEvent.ERROR, InterestErrorType.RESPONSE_EMPTY, null, InterestFrom.NEW, 4);
                    InterestChainProcess interestChainProcess = InterestChainProcess.ERROR;
                    InterestChainErrorCode interestChainErrorCode = InterestChainErrorCode.DATA_EMPTY;
                    Integer numBoxInt = null;
                    if (c7782e != null) {
                        C7778a c7778aA2 = c7782e.a();
                        numBoxInt = null;
                        if (c7778aA2 != null) {
                            numBoxInt = Boxing.boxInt(c7778aA2.b());
                        }
                    }
                    e.b(interestChainProcess, 0, interestChainErrorCode, null, numBoxInt, "interest", 8);
                    newUserInterestChoosePlugin.c(false, null);
                } else {
                    InterestChoose interestChooseB = c7782e.b();
                    if (interestChooseB == null || C7781d.i(interestChooseB)) {
                        Gp0.a.b(InterestEvent.VALID_RESPONSE, null, null, InterestFrom.NEW, 6);
                        InterestChoose interestChooseB2 = c7782e.b();
                        String strB = null;
                        if (interestChooseB2 != null) {
                            strB = interestChooseB2.B();
                        }
                        newUserInterestChoosePlugin.f76301r = strB;
                        e.b(InterestChainProcess.VALID_RESPONSE, 1, null, strB, null, "interest", 20);
                        BLog.i("[Interest]NewUserInterestChoosePlugin", "Request interest choose success and data is valid.");
                        a aVar = new a(newUserInterestChoosePlugin, c7782e);
                        if (PegasusVisibleState.getVisibleFromSplash-impl(newUserInterestChoosePlugin.getVisibleState-XRWi58s())) {
                            aVar.invoke();
                        } else {
                            newUserInterestChoosePlugin.f76304u = aVar;
                        }
                    } else {
                        BLog.i("[Interest]NewUserInterestChoosePlugin", "Request interest choose failure, and data is not valid:" + c7782e);
                        Gp0.a.b(InterestEvent.ERROR, InterestErrorType.RESPONSE_INVALID, null, InterestFrom.NEW, 4);
                        e.b(InterestChainProcess.ERROR, 0, InterestChainErrorCode.DATA_VALIDATION_ERROR, null, null, "interest", 24);
                        newUserInterestChoosePlugin.c(false, null);
                    }
                }
            }
        }
        NewUserInterestChoosePlugin newUserInterestChoosePlugin2 = this.this$0;
        if (resource.getStatus() == Status.ERROR && resource.getError() != null) {
            Throwable error = resource.getError();
            BLog.i("[Interest]NewUserInterestChoosePlugin", "Request interest choose error:" + error + UtilsKt.DOT);
            Gp0.a.a(InterestEvent.ERROR, InterestErrorType.NETWORK_ERROR, MapsKt.mapOf(TuplesKt.to(CaptureSchema.JUMP_PARAMS_EXTRA, String.valueOf(error.getMessage()))), InterestFrom.NEW);
            e.b(InterestChainProcess.ERROR, 0, InterestChainErrorCode.NETWORK_ERROR, null, null, "interest", 24);
            newUserInterestChoosePlugin2.c(false, null);
        }
        return Unit.INSTANCE;
    }
}
