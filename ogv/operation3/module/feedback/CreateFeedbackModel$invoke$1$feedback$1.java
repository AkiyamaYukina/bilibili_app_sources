package com.bilibili.ogv.operation3.module.feedback;

import X1.F;
import com.bilibili.ktor.KApiResponse;
import kntr.base.log.ILogger;
import kntr.base.log.KLog_androidKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import ql0.InterfaceC8453a;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/feedback/CreateFeedbackModel$invoke$1$feedback$1.class */
final class CreateFeedbackModel$invoke$1$feedback$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $feedbackType;
    final y $feedbackable;
    final InterfaceC8453a $reportable;
    int label;
    final h this$0;
    final g this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateFeedbackModel$invoke$1$feedback$1(h hVar, y yVar, int i7, g gVar, InterfaceC8453a interfaceC8453a, Continuation<? super CreateFeedbackModel$invoke$1$feedback$1> continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$feedbackable = yVar;
        this.$feedbackType = i7;
        this.this$1 = gVar;
        this.$reportable = interfaceC8453a;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateFeedbackModel$invoke$1$feedback$1(this.this$0, this.$feedbackable, this.$feedbackType, this.this$1, this.$reportable, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            l lVar = this.this$0.f71215a;
            y yVar = this.$feedbackable;
            int i8 = this.$feedbackType;
            boolean zB = this.this$1.b();
            this.label = 1;
            Object objA = lVar.a(yVar, i8, zB ? 1 : 0, this);
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
        KApiResponse.a aVar = (KApiResponse) obj;
        g gVar = this.this$1;
        if (aVar instanceof KApiResponse.a) {
            KApiResponse.a aVar2 = aVar;
            StringBuilder sbB = F.b(aVar2.a, "code:", ",message:");
            sbB.append(aVar2.b);
            IllegalStateException illegalStateException = new IllegalStateException(sbB.toString());
            ILogger kLog = KLog_androidKt.getKLog();
            String message = illegalStateException.getMessage();
            kLog.e("CreateFeedbackModel", message != null ? message : "", illegalStateException);
        } else if (aVar instanceof KApiResponse.ServiceUnavailable) {
            Exception exception = ((KApiResponse.ServiceUnavailable) aVar).getException();
            ILogger kLog2 = KLog_androidKt.getKLog();
            String message2 = exception.getMessage();
            kLog2.e("CreateFeedbackModel", message2 != null ? message2 : "", exception);
        } else {
            if (!(aVar instanceof KApiResponse.c)) {
                throw new NoWhenBranchMatchedException();
            }
            gVar.f71210c.setValue(Boolean.valueOf(!gVar.b()));
        }
        h hVar = this.this$0;
        hVar.f71217c.a(C8770a.a(new StringBuilder("pgc."), hVar.f71216b, ".recommend.feedback.click"), this.$reportable.getReport());
        return Unit.INSTANCE;
    }
}
