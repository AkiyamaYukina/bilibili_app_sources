package com.bilibili.ship.theseus.ugc.weblayer;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteFloatLayerService$showNoteEditPanel$2$1$1$2.class */
public final class NoteFloatLayerService$showNoteEditPanel$2$1$1$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final NoteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1 $softKeyBoardChangeListener;
    final Ref.BooleanRef $windowInsetsKeyboardShown;
    int label;
    final NoteFloatLayerService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.weblayer.NoteFloatLayerService$showNoteEditPanel$2$1$1$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteFloatLayerService$showNoteEditPanel$2$1$1$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        final NoteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1 $softKeyBoardChangeListener;
        final Ref.BooleanRef $windowInsetsKeyboardShown;
        int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.BooleanRef booleanRef, NoteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1 noteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$windowInsetsKeyboardShown = booleanRef;
            this.$softKeyBoardChangeListener = noteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$windowInsetsKeyboardShown, this.$softKeyBoardChangeListener, continuation);
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i7, Continuation<? super Unit> continuation) {
            return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            NoteFloatLayerService$showNoteEditPanel$2.invokeSuspend$dispatchWindowInsetsKeyboardHeight(this.$windowInsetsKeyboardShown, this.$softKeyBoardChangeListener, this.I$0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFloatLayerService$showNoteEditPanel$2$1$1$2(NoteFloatLayerService noteFloatLayerService, Ref.BooleanRef booleanRef, NoteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1 noteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1, Continuation<? super NoteFloatLayerService$showNoteEditPanel$2$1$1$2> continuation) {
        super(1, continuation);
        this.this$0 = noteFloatLayerService;
        this.$windowInsetsKeyboardShown = booleanRef;
        this.$softKeyBoardChangeListener = noteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new NoteFloatLayerService$showNoteEditPanel$2$1$1$2(this.this$0, this.$windowInsetsKeyboardShown, this.$softKeyBoardChangeListener, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final MutableStateFlow mutableStateFlowA = this.this$0.f98612r.f98876c.f98873a.a();
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Integer>(mutableStateFlowA) { // from class: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowSoftInputModeService$special$$inlined$map$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Flow f98854a;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowSoftInputModeService$special$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowSoftInputModeService$special$$inlined$map$1$2.class */
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FlowCollector f98855a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowSoftInputModeService$special$$inlined$map$1$2$1, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowSoftInputModeService$special$$inlined$map$1$2$1.class */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
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
                        this.f98855a = flowCollector;
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
                            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowSoftInputModeService$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L29
                            r0 = r7
                            com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowSoftInputModeService$special$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowSoftInputModeService$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            r10 = r0
                            r0 = r10
                            int r0 = r0.label
                            r8 = r0
                            r0 = r8
                            r1 = -2147483648(0xffffffff80000000, float:-0.0)
                            r0 = r0 & r1
                            if (r0 == 0) goto L29
                            r0 = r10
                            r1 = r8
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            int r1 = r1 + r2
                            r0.label = r1
                            r0 = r10
                            r7 = r0
                            goto L33
                        L29:
                            com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowSoftInputModeService$special$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowSoftInputModeService$special$$inlined$map$1$2$1
                            r1 = r0
                            r2 = r5
                            r3 = r7
                            r1.<init>(r2, r3)
                            r7 = r0
                        L33:
                            r0 = r7
                            java.lang.Object r0 = r0.result
                            r11 = r0
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            r10 = r0
                            r0 = r7
                            int r0 = r0.label
                            r8 = r0
                            r0 = r8
                            if (r0 == 0) goto L5e
                            r0 = r8
                            r1 = 1
                            if (r0 != r1) goto L54
                            r0 = r11
                            kotlin.ResultKt.throwOnFailure(r0)
                            goto Laf
                        L54:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            r1 = r0
                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r2)
                            throw r0
                        L5e:
                            r0 = r11
                            kotlin.ResultKt.throwOnFailure(r0)
                            r0 = r6
                            androidx.core.view.WindowInsetsCompat r0 = (androidx.core.view.WindowInsetsCompat) r0
                            r6 = r0
                            kotlin.Lazy r0 = com.bilibili.ship.theseus.united.page.activitywindow.r.f98884a
                            r11 = r0
                            boolean r0 = com.bilibili.ship.theseus.united.page.activitywindow.a.b()
                            r9 = r0
                            r0 = 0
                            r8 = r0
                            r0 = r9
                            if (r0 != 0) goto L7c
                            goto L92
                        L7c:
                            r0 = r6
                            if (r0 == 0) goto L92
                            kotlin.Lazy r0 = com.bilibili.ship.theseus.united.page.activitywindow.r.f98884a
                            java.lang.Object r0 = r0.getValue()
                            com.bilibili.ship.theseus.united.page.activitywindow.s r0 = (com.bilibili.ship.theseus.united.page.activitywindow.s) r0
                            r1 = r6
                            int r0 = r0.a(r1)
                            r8 = r0
                        L92:
                            r0 = r8
                            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
                            r6 = r0
                            r0 = r7
                            r1 = 1
                            r0.label = r1
                            r0 = r5
                            kotlinx.coroutines.flow.FlowCollector r0 = r0.f98855a
                            r1 = r6
                            r2 = r7
                            java.lang.Object r0 = r0.emit(r1, r2)
                            r1 = r10
                            if (r0 != r1) goto Laf
                            r0 = r10
                            return r0
                        Laf:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowSoftInputModeService$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                {
                    this.f98854a = mutableStateFlowA;
                }

                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = this.f98854a.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            });
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$windowInsetsKeyboardShown, this.$softKeyBoardChangeListener, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
