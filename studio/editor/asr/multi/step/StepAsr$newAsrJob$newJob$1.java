package com.bilibili.studio.editor.asr.multi.step;

import androidx.fragment.app.z;
import com.bilibili.studio.editor.asr.core.exception.AsrBaseException;
import com.bilibili.studio.editor.asr.multi.step.a;
import j4.o;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/step/StepAsr$newAsrJob$newJob$1.class */
final class StepAsr$newAsrJob$newJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super a.C1187a>, Object> {
    Object L$0;
    int label;
    final com.bilibili.studio.editor.asr.multi.step.a this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/step/StepAsr$newAsrJob$newJob$1$a.class */
    public static final class a implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bilibili.studio.editor.asr.multi.step.a f105647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CancellableContinuationImpl f105648b;

        public a(com.bilibili.studio.editor.asr.multi.step.a aVar, CancellableContinuationImpl cancellableContinuationImpl) {
            this.f105647a = aVar;
            this.f105648b = cancellableContinuationImpl;
        }

        public final Object invoke(Object obj) {
            String str = (String) obj;
            com.bilibili.studio.editor.asr.multi.step.a aVar = this.f105647a;
            o.a("FastASR onQuickSuspend id=", aVar.f105663a, ", labelResult=", str, "BiliEditorMultiAsrManager");
            if (aVar.f105664b.f1855k) {
                CancellableContinuationImpl cancellableContinuationImpl = this.f105648b;
                if (cancellableContinuationImpl.isActive()) {
                    cancellableContinuationImpl.resumeWith(Result.constructor-impl(new a.C1187a("success", str, null, 12)));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/step/StepAsr$newAsrJob$newJob$1$b.class */
    public static final class b implements Function1<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bilibili.studio.editor.asr.multi.step.a f105649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CancellableContinuationImpl f105650b;

        public b(com.bilibili.studio.editor.asr.multi.step.a aVar, CancellableContinuationImpl cancellableContinuationImpl) {
            this.f105649a = aVar;
            this.f105650b = cancellableContinuationImpl;
        }

        public final Object invoke(Object obj) {
            String str = (String) obj;
            com.bilibili.studio.editor.asr.multi.step.a aVar = this.f105649a;
            o.a("FastASR onSuccess id=", aVar.f105663a, ", labelResult=", str, "BiliEditorMultiAsrManager");
            if (!aVar.f105664b.f1855k) {
                CancellableContinuationImpl cancellableContinuationImpl = this.f105650b;
                if (cancellableContinuationImpl.isActive()) {
                    cancellableContinuationImpl.resumeWith(Result.constructor-impl(new a.C1187a("success", str, null, 12)));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/step/StepAsr$newAsrJob$newJob$1$c.class */
    public static final class c implements Function1<AsrBaseException, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bilibili.studio.editor.asr.multi.step.a f105651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CancellableContinuationImpl f105652b;

        public c(com.bilibili.studio.editor.asr.multi.step.a aVar, CancellableContinuationImpl cancellableContinuationImpl) {
            this.f105651a = aVar;
            this.f105652b = cancellableContinuationImpl;
        }

        public final Object invoke(Object obj) {
            AsrBaseException asrBaseException = (AsrBaseException) obj;
            BLog.e("BiliEditorMultiAsrManager", z.a("FastASR onFailed id=", this.f105651a.f105663a, ", error=", asrBaseException.getMessage()), asrBaseException);
            CancellableContinuationImpl cancellableContinuationImpl = this.f105652b;
            if (cancellableContinuationImpl.isActive()) {
                cancellableContinuationImpl.resumeWith(Result.constructor-impl(new a.C1187a("failed", null, asrBaseException, 6)));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/step/StepAsr$newAsrJob$newJob$1$d.class */
    public static final class d implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bilibili.studio.editor.asr.multi.step.a f105653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CancellableContinuationImpl f105654b;

        public d(com.bilibili.studio.editor.asr.multi.step.a aVar, CancellableContinuationImpl cancellableContinuationImpl) {
            this.f105653a = aVar;
            this.f105654b = cancellableContinuationImpl;
        }

        public final Object invoke() {
            defpackage.a.b("FastASR onCancel id=", this.f105653a.f105663a, "BiliEditorMultiAsrManager");
            CancellableContinuationImpl cancellableContinuationImpl = this.f105654b;
            if (cancellableContinuationImpl.isActive()) {
                cancellableContinuationImpl.resumeWith(Result.constructor-impl(new a.C1187a("cancel", null, null, 14)));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepAsr$newAsrJob$newJob$1(com.bilibili.studio.editor.asr.multi.step.a aVar, Continuation<? super StepAsr$newAsrJob$newJob$1> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StepAsr$newAsrJob$newJob$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super a.C1187a> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [Dw0.a, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.studio.editor.asr.multi.step.a aVar = this.this$0;
            this.L$0 = aVar;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            Cw0.o oVar = aVar.f105664b;
            oVar.f1856l = new a(aVar, cancellableContinuationImpl);
            oVar.c(new Object(), new b(aVar, cancellableContinuationImpl), new c(aVar, cancellableContinuationImpl), new d(aVar, cancellableContinuationImpl));
            Cw0.o oVar2 = aVar.f105664b;
            oVar2.f1855k = true;
            BLog.i("BiliEditorMultiAsrManager", "FastASR start task id=" + aVar.f105663a);
            oVar2.d();
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            obj = result;
            if (result == coroutine_suspended) {
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
