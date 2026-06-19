package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import com.bilibili.app.gemini.ui.UIComponent;
import java.util.List;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import zu0.a1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionCalendarFloatLayerUIComponent$bind$2.class */
final class OgvSectionCalendarFloatLayerUIComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
    final a1 $binding;
    private Object L$0;
    int label;
    final h this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionCalendarFloatLayerUIComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionCalendarFloatLayerUIComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final a1 $binding;
        int label;
        final h this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionCalendarFloatLayerUIComponent$bind$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionCalendarFloatLayerUIComponent$bind$2$1$1.class */
        public static final class C07101 extends SuspendLambda implements Function2<List<? extends UIComponent<?>>, Continuation<? super Unit>, Object> {
            final a1 $binding;
            Object L$0;
            int label;
            final h this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07101(a1 a1Var, h hVar, Continuation<? super C07101> continuation) {
                super(2, continuation);
                this.$binding = a1Var;
                this.this$0 = hVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07101 c07101 = new C07101(this.$binding, this.this$0, continuation);
                c07101.L$0 = obj;
                return c07101;
            }

            public final Object invoke(List<? extends UIComponent<?>> list, Continuation<? super Unit> continuation) {
                return create(list, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List list = (List) this.L$0;
                this.$binding.f130629A.getAdapter().N(list);
                if (list.size() == this.this$0.f93664c.size()) {
                    this.$binding.f130631C.getAdapter().N(this.this$0.f93664c);
                } else {
                    this.$binding.f130631C.getAdapter().N(this.this$0.f93664c.subList(0, 1));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(h hVar, a1 a1Var, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = hVar;
            this.$binding = a1Var;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                h hVar = this.this$0;
                MutableStateFlow mutableStateFlow = hVar.f93662a.f93674i;
                C07101 c07101 = new C07101(this.$binding, hVar, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, c07101, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvSectionCalendarFloatLayerUIComponent$bind$2(a1 a1Var, h hVar, Continuation<? super OgvSectionCalendarFloatLayerUIComponent$bind$2> continuation) {
        super(2, continuation);
        this.$binding = a1Var;
        this.this$0 = hVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvSectionCalendarFloatLayerUIComponent$bind$2 ogvSectionCalendarFloatLayerUIComponent$bind$2 = new OgvSectionCalendarFloatLayerUIComponent$bind$2(this.$binding, this.this$0, continuation);
        ogvSectionCalendarFloatLayerUIComponent$bind$2.L$0 = obj;
        return ogvSectionCalendarFloatLayerUIComponent$bind$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$binding, null), 3, (Object) null);
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            this.$binding.f130631C.unregisterOnPageChangeCallback(this.this$0.f93666e);
            this.$binding.f130631C.setAdapter(null);
            throw th;
        }
    }
}
