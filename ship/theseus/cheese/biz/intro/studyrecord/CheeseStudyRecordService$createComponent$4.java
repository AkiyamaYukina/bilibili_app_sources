package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyRecordService$createComponent$4.class */
public final class CheeseStudyRecordService$createComponent$4 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final MutableStateFlow<StudyRecord> $studyRecordFlow;
    int label;
    final CheeseStudyRecordService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyRecordService$createComponent$4$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyRecordService$createComponent$4$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final MutableStateFlow<StudyRecord> $studyRecordFlow;
        int label;
        final CheeseStudyRecordService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyRecordService$createComponent$4$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyRecordService$createComponent$4$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableStateFlow<StudyRecord> f90202a;

            public a(MutableStateFlow<StudyRecord> mutableStateFlow) {
                this.f90202a = mutableStateFlow;
            }

            public final Object emit(Object obj, Continuation continuation) {
                StudyRecord studyRecord = (StudyRecord) obj;
                if (studyRecord != null) {
                    this.f90202a.setValue(studyRecord);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseStudyRecordService cheeseStudyRecordService, MutableStateFlow<StudyRecord> mutableStateFlow, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseStudyRecordService;
            this.$studyRecordFlow = mutableStateFlow;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$studyRecordFlow, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<StudyRecord> stateFlow = this.this$0.f90201g.f90290b;
                a aVar = new a(this.$studyRecordFlow);
                this.label = 1;
                if (stateFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseStudyRecordService$createComponent$4(CheeseStudyRecordService cheeseStudyRecordService, MutableStateFlow<StudyRecord> mutableStateFlow, Continuation<? super CheeseStudyRecordService$createComponent$4> continuation) {
        super(1, continuation);
        this.this$0 = cheeseStudyRecordService;
        this.$studyRecordFlow = mutableStateFlow;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CheeseStudyRecordService$createComponent$4(this.this$0, this.$studyRecordFlow, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CheeseStudyRecordService cheeseStudyRecordService = this.this$0;
        BuildersKt.launch$default(cheeseStudyRecordService.f90195a, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(cheeseStudyRecordService, this.$studyRecordFlow, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
