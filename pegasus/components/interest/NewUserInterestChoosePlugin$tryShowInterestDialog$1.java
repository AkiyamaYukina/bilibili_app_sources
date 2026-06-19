package com.bilibili.pegasus.components.interest;

import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.module.account.LoginInterestExperiment;
import com.bilibili.pegasus.interest.reporter.InterestErrorType;
import com.bilibili.pegasus.interest.reporter.InterestEvent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;
import zh0.C9195b;
import zh0.InterfaceC9194a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/NewUserInterestChoosePlugin$tryShowInterestDialog$1.class */
public final class NewUserInterestChoosePlugin$tryShowInterestDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function0<Unit> $realDisplayAction;
    int label;
    final NewUserInterestChoosePlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewUserInterestChoosePlugin$tryShowInterestDialog$1(NewUserInterestChoosePlugin newUserInterestChoosePlugin, Function0<Unit> function0, Continuation<? super NewUserInterestChoosePlugin$tryShowInterestDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = newUserInterestChoosePlugin;
        this.$realDisplayAction = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NewUserInterestChoosePlugin$tryShowInterestDialog$1(this.this$0, this.$realDisplayAction, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        final StateFlow<Rg0.b> state;
        InterfaceC9194a interfaceC9194a;
        LoginInterestExperiment loginInterestExperimentF;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Rg0.c cVarB = this.this$0.b();
            if (cVarB != null && (state = cVarB.getState()) != null) {
                Flow<Rg0.b> flow = new Flow<Rg0.b>(state) { // from class: com.bilibili.pegasus.components.interest.NewUserInterestChoosePlugin$tryShowInterestDialog$1$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final StateFlow f76318a;

                    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.NewUserInterestChoosePlugin$tryShowInterestDialog$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/NewUserInterestChoosePlugin$tryShowInterestDialog$1$invokeSuspend$$inlined$filter$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f76319a;

                        /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.NewUserInterestChoosePlugin$tryShowInterestDialog$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/NewUserInterestChoosePlugin$tryShowInterestDialog$1$invokeSuspend$$inlined$filter$1$2$1.class */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            Object result;
                            final AnonymousClass2 this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                                super(continuation);
                                this.this$0 = anonymousClass2;
                            }

                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return this.this$0.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.f76319a = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                            /*
                                r5 = this;
                                r0 = r7
                                boolean r0 = r0 instanceof com.bilibili.pegasus.components.interest.NewUserInterestChoosePlugin$tryShowInterestDialog$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L29
                                r0 = r7
                                com.bilibili.pegasus.components.interest.NewUserInterestChoosePlugin$tryShowInterestDialog$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.bilibili.pegasus.components.interest.NewUserInterestChoosePlugin$tryShowInterestDialog$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                                r9 = r0
                                r0 = r9
                                int r0 = r0.label
                                r8 = r0
                                r0 = r8
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r1
                                if (r0 == 0) goto L29
                                r0 = r9
                                r1 = r8
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                int r1 = r1 + r2
                                r0.label = r1
                                r0 = r9
                                r7 = r0
                                goto L33
                            L29:
                                com.bilibili.pegasus.components.interest.NewUserInterestChoosePlugin$tryShowInterestDialog$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.bilibili.pegasus.components.interest.NewUserInterestChoosePlugin$tryShowInterestDialog$1$invokeSuspend$$inlined$filter$1$2$1
                                r1 = r0
                                r2 = r5
                                r3 = r7
                                r1.<init>(r2, r3)
                                r7 = r0
                            L33:
                                r0 = r7
                                java.lang.Object r0 = r0.result
                                r10 = r0
                                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                r9 = r0
                                r0 = r7
                                int r0 = r0.label
                                r8 = r0
                                r0 = r8
                                if (r0 == 0) goto L5e
                                r0 = r8
                                r1 = 1
                                if (r0 != r1) goto L54
                                r0 = r10
                                kotlin.ResultKt.throwOnFailure(r0)
                                goto L85
                            L54:
                                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                r1 = r0
                                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r2)
                                throw r0
                            L5e:
                                r0 = r10
                                kotlin.ResultKt.throwOnFailure(r0)
                                r0 = r6
                                Rg0.b r0 = (Rg0.b) r0
                                boolean r0 = r0.f20817a
                                if (r0 != 0) goto L85
                                r0 = r7
                                r1 = 1
                                r0.label = r1
                                r0 = r5
                                kotlinx.coroutines.flow.FlowCollector r0 = r0.f76319a
                                r1 = r6
                                r2 = r7
                                java.lang.Object r0 = r0.emit(r1, r2)
                                r1 = r9
                                if (r0 != r1) goto L85
                                r0 = r9
                                return r0
                            L85:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.NewUserInterestChoosePlugin$tryShowInterestDialog$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f76318a = state;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f76318a.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                Object objFirst = FlowKt.first(flow, this);
                obj = objFirst;
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            BLog.i("[Interest]NewUserInterestChoosePlugin", "tryShowInterestDialog, wait finish");
            if (BiliAccounts.get(BiliContext.application()).isLogin() && (interfaceC9194a = C9195b.f130326a) != null) {
                loginInterestExperimentF = interfaceC9194a.f();
                boolean zB = interfaceC9194a.b();
                com.bilibili.ad.adview.pegasus.banner.adinline.i.b("handleLoginInterestExperiment, dismissFlag = ", loginInterestExperimentF.name(), ", isNewUser = ", "[Interest]InterestChooseFactory", zB);
                if (loginInterestExperimentF != LoginInterestExperiment.DismissInterest || (loginInterestExperimentF == LoginInterestExperiment.DismissInterestForOld && !zB)) {
                    Gp0.a.b(InterestEvent.ERROR, InterestErrorType.OLD_USER_NEW_DEVICE, null, null, 12);
                    e.b(InterestChainProcess.ERROR, 0, InterestChainErrorCode.OTHER_EXCEPTION, null, null, "interest", 24);
                    this.this$0.c(false, null);
                    return Unit.INSTANCE;
                }
            }
            this.$realDisplayAction.invoke();
            return Unit.INSTANCE;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BLog.i("[Interest]NewUserInterestChoosePlugin", "tryShowInterestDialog, wait finish");
        if (BiliAccounts.get(BiliContext.application()).isLogin()) {
            loginInterestExperimentF = interfaceC9194a.f();
            boolean zB2 = interfaceC9194a.b();
            com.bilibili.ad.adview.pegasus.banner.adinline.i.b("handleLoginInterestExperiment, dismissFlag = ", loginInterestExperimentF.name(), ", isNewUser = ", "[Interest]InterestChooseFactory", zB2);
            if (loginInterestExperimentF != LoginInterestExperiment.DismissInterest) {
            }
            Gp0.a.b(InterestEvent.ERROR, InterestErrorType.OLD_USER_NEW_DEVICE, null, null, 12);
            e.b(InterestChainProcess.ERROR, 0, InterestChainErrorCode.OTHER_EXCEPTION, null, null, "interest", 24);
            this.this$0.c(false, null);
            return Unit.INSTANCE;
        }
        this.$realDisplayAction.invoke();
        return Unit.INSTANCE;
    }
}
