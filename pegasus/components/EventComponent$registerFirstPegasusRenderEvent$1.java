package com.bilibili.pegasus.components;

import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.bus.IData;
import com.bilibili.bus.Violet;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.pegasus.vm.PegasusViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import mp0.C8026a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/EventComponent$registerFirstPegasusRenderEvent$1.class */
final class EventComponent$registerFirstPegasusRenderEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final RecyclerView $recyclerView;
    int label;
    final C5635p this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/EventComponent$registerFirstPegasusRenderEvent$1$a.class */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f75749a;

        public a(View view) {
            this.f75749a = view;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.bilibili.bus.IData, java.lang.Object] */
        @Override // java.lang.Runnable
        public final void run() {
            ConfigManager.Companion companion = ConfigManager.Companion;
            if (companion.isHitFF("ff_pegasus_first_render_complete")) {
                Violet.INSTANCE.sendMsg((IData) new Object(), companion.isHitFF("ff_pegasus_first_render_complete_async"));
            }
            com.bilibili.pegasus.request.b.f78807d = true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventComponent$registerFirstPegasusRenderEvent$1(C5635p c5635p, RecyclerView recyclerView, Continuation<? super EventComponent$registerFirstPegasusRenderEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = c5635p;
        this.$recyclerView = recyclerView;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EventComponent$registerFirstPegasusRenderEvent$1(this.this$0, this.$recyclerView, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final Flow<C8026a> flow = ((PegasusViewModel) this.this$0.f77108l.getValue()).f79021n;
            Flow<C8026a> flow2 = new Flow<C8026a>(flow) { // from class: com.bilibili.pegasus.components.EventComponent$registerFirstPegasusRenderEvent$1$invokeSuspend$$inlined$filter$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Flow f75750a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.components.EventComponent$registerFirstPegasusRenderEvent$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/EventComponent$registerFirstPegasusRenderEvent$1$invokeSuspend$$inlined$filter$1$2.class */
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FlowCollector f75751a;

                    /* JADX INFO: renamed from: com.bilibili.pegasus.components.EventComponent$registerFirstPegasusRenderEvent$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/EventComponent$registerFirstPegasusRenderEvent$1$invokeSuspend$$inlined$filter$1$2$1.class */
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
                        this.f75751a = flowCollector;
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
                            boolean r0 = r0 instanceof com.bilibili.pegasus.components.EventComponent$registerFirstPegasusRenderEvent$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L29
                            r0 = r7
                            com.bilibili.pegasus.components.EventComponent$registerFirstPegasusRenderEvent$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.bilibili.pegasus.components.EventComponent$registerFirstPegasusRenderEvent$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
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
                            com.bilibili.pegasus.components.EventComponent$registerFirstPegasusRenderEvent$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.bilibili.pegasus.components.EventComponent$registerFirstPegasusRenderEvent$1$invokeSuspend$$inlined$filter$1$2$1
                            r1 = r0
                            r2 = r5
                            r3 = r7
                            r1.<init>(r2, r3)
                            r7 = r0
                        L33:
                            r0 = r7
                            java.lang.Object r0 = r0.result
                            r9 = r0
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
                            r0 = r9
                            kotlin.ResultKt.throwOnFailure(r0)
                            goto L8d
                        L54:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            r1 = r0
                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r2)
                            throw r0
                        L5e:
                            r0 = r9
                            kotlin.ResultKt.throwOnFailure(r0)
                            r0 = r6
                            mp0.a r0 = (mp0.C8026a) r0
                            java.util.List<com.bilibili.pegasus.PegasusHolderData> r0 = r0.f123826a
                            java.util.Collection r0 = (java.util.Collection) r0
                            boolean r0 = r0.isEmpty()
                            if (r0 != 0) goto L8d
                            r0 = r7
                            r1 = 1
                            r0.label = r1
                            r0 = r5
                            kotlinx.coroutines.flow.FlowCollector r0 = r0.f75751a
                            r1 = r6
                            r2 = r7
                            java.lang.Object r0 = r0.emit(r1, r2)
                            r1 = r10
                            if (r0 != r1) goto L8d
                            r0 = r10
                            return r0
                        L8d:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.EventComponent$registerFirstPegasusRenderEvent$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                {
                    this.f75750a = flow;
                }

                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = this.f75750a.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (FlowKt.first(flow2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        RecyclerView recyclerView = this.$recyclerView;
        OneShotPreDrawListener.add(recyclerView, new a(recyclerView));
        return Unit.INSTANCE;
    }
}
