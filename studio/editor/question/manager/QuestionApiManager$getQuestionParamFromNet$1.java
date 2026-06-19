package com.bilibili.studio.editor.question.manager;

import Xz0.d;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.studio.editor.question.bean.InvestigationActionParam;
import com.bilibili.studio.editor.question.bean.InvestigationDetail;
import com.bilibili.studio.editor.question.service.QuestionApiService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/question/manager/QuestionApiManager$getQuestionParamFromNet$1.class */
final class QuestionApiManager$getQuestionParamFromNet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $beforeTime;
    final Ref.ObjectRef<Function1<InvestigationActionParam, Unit>> $local;
    final long $timeOut;
    final String $type;
    private Object L$0;
    int label;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.question.manager.QuestionApiManager$getQuestionParamFromNet$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/question/manager/QuestionApiManager$getQuestionParamFromNet$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final long $beforeTime;
        final Ref.ObjectRef<Function1<InvestigationActionParam, Unit>> $local;
        final String $type;
        long J$0;
        int label;

        /* JADX INFO: renamed from: com.bilibili.studio.editor.question.manager.QuestionApiManager$getQuestionParamFromNet$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/question/manager/QuestionApiManager$getQuestionParamFromNet$1$1$1.class */
        public static final class C12001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<Function1<InvestigationActionParam, Unit>> $local;
            final InvestigationActionParam $result;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12001(Ref.ObjectRef<Function1<InvestigationActionParam, Unit>> objectRef, InvestigationActionParam investigationActionParam, Continuation<? super C12001> continuation) {
                super(2, continuation);
                this.$local = objectRef;
                this.$result = investigationActionParam;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C12001(this.$local, this.$result, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Function1 function1 = (Function1) this.$local.element;
                if (function1 != null) {
                    function1.invoke(this.$result);
                }
                this.$local.element = null;
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.studio.editor.question.manager.QuestionApiManager$getQuestionParamFromNet$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/question/manager/QuestionApiManager$getQuestionParamFromNet$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<Function1<InvestigationActionParam, Unit>> $local;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Ref.ObjectRef<Function1<InvestigationActionParam, Unit>> objectRef, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$local = objectRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$local, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Function1 function1 = (Function1) this.$local.element;
                if (function1 != null) {
                    function1.invoke((Object) null);
                }
                this.$local.element = null;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, long j7, Ref.ObjectRef<Function1<InvestigationActionParam, Unit>> objectRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$type = str;
            this.$beforeTime = j7;
            this.$local = objectRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$type, this.$beforeTime, this.$local, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            long jCurrentTimeMillis;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.$type;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                ((QuestionApiService) ServiceGenerator.createService(QuestionApiService.class)).requestInvestigationParam(str).enqueue(new Vz0.b(0, cancellableContinuationImpl));
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
                    if (i7 == 2) {
                        jCurrentTimeMillis = this.J$0;
                        ResultKt.throwOnFailure(obj);
                        d dVar = d.f28458a;
                        Long lBoxLong = Boxing.boxLong(jCurrentTimeMillis - this.$beforeTime);
                        dVar.getClass();
                        d.X(lBoxLong, "1");
                        return Unit.INSTANCE;
                    }
                    if (i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jCurrentTimeMillis = this.J$0;
                    ResultKt.throwOnFailure(obj);
                    d dVar2 = d.f28458a;
                    Long lBoxLong2 = Boxing.boxLong(jCurrentTimeMillis - this.$beforeTime);
                    dVar2.getClass();
                    d.X(lBoxLong2, "2");
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            InvestigationActionParam investigationActionParam = (InvestigationActionParam) obj;
            jCurrentTimeMillis = System.currentTimeMillis();
            if (investigationActionParam != null && investigationActionParam.getMatched()) {
                InvestigationDetail data = investigationActionParam.getData();
                String link = data != null ? data.getLink() : null;
                if (link != null && link.length() != 0 && Intrinsics.areEqual(investigationActionParam.getContainerType(), "H5") && Intrinsics.areEqual(investigationActionParam.getHandleType(), "card")) {
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    C12001 c12001 = new C12001(this.$local, investigationActionParam, null);
                    this.J$0 = jCurrentTimeMillis;
                    this.label = 2;
                    if (BuildersKt.withContext(main, c12001, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    d dVar3 = d.f28458a;
                    Long lBoxLong3 = Boxing.boxLong(jCurrentTimeMillis - this.$beforeTime);
                    dVar3.getClass();
                    d.X(lBoxLong3, "1");
                    return Unit.INSTANCE;
                }
            }
            MainCoroutineDispatcher main2 = Dispatchers.getMain();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$local, null);
            this.J$0 = jCurrentTimeMillis;
            this.label = 3;
            if (BuildersKt.withContext(main2, anonymousClass2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            d dVar22 = d.f28458a;
            Long lBoxLong22 = Boxing.boxLong(jCurrentTimeMillis - this.$beforeTime);
            dVar22.getClass();
            d.X(lBoxLong22, "2");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.editor.question.manager.QuestionApiManager$getQuestionParamFromNet$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/question/manager/QuestionApiManager$getQuestionParamFromNet$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<Function1<InvestigationActionParam, Unit>> $local;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Ref.ObjectRef<Function1<InvestigationActionParam, Unit>> objectRef, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$local = objectRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$local, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function1 function1 = (Function1) this.$local.element;
            if (function1 != null) {
                function1.invoke((Object) null);
            }
            this.$local.element = null;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestionApiManager$getQuestionParamFromNet$1(long j7, String str, long j8, Ref.ObjectRef<Function1<InvestigationActionParam, Unit>> objectRef, Continuation<? super QuestionApiManager$getQuestionParamFromNet$1> continuation) {
        super(2, continuation);
        this.$timeOut = j7;
        this.$type = str;
        this.$beforeTime = j8;
        this.$local = objectRef;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        QuestionApiManager$getQuestionParamFromNet$1 questionApiManager$getQuestionParamFromNet$1 = new QuestionApiManager$getQuestionParamFromNet$1(this.$timeOut, this.$type, this.$beforeTime, this.$local, continuation);
        questionApiManager$getQuestionParamFromNet$1.L$0 = obj;
        return questionApiManager$getQuestionParamFromNet$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
        } catch (Exception e7) {
            Wz0.a.a("【问卷调查事件匹配：失败】 接口获取失败");
        }
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BuildersKt.async$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$type, this.$beforeTime, this.$local, null), 3, (Object) null);
            long j7 = this.$timeOut;
            this.label = 1;
            if (DelayKt.delay(j7, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$local, null);
        this.label = 2;
        if (BuildersKt.withContext(main, anonymousClass2, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
