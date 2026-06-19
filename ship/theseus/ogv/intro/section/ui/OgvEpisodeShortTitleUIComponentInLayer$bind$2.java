package com.bilibili.ship.theseus.ogv.intro.section.ui;

import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository$special$$inlined$map$1;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import zu0.F;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/OgvEpisodeShortTitleUIComponentInLayer$bind$2.class */
final class OgvEpisodeShortTitleUIComponentInLayer$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final F $binding;
    private Object L$0;
    int label;
    final k this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.ui.OgvEpisodeShortTitleUIComponentInLayer$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/OgvEpisodeShortTitleUIComponentInLayer$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final F $binding;
        int label;
        final k this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.ui.OgvEpisodeShortTitleUIComponentInLayer$bind$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/OgvEpisodeShortTitleUIComponentInLayer$bind$2$1$1.class */
        public static final class C07331 extends SuspendLambda implements Function2<OgvEpisode, Continuation<? super Unit>, Object> {
            final F $binding;
            Object L$0;
            int label;
            final k this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07331(k kVar, F f7, Continuation<? super C07331> continuation) {
                super(2, continuation);
                this.this$0 = kVar;
                this.$binding = f7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07331 c07331 = new C07331(this.this$0, this.$binding, continuation);
                c07331.L$0 = obj;
                return c07331;
            }

            public final Object invoke(OgvEpisode ogvEpisode, Continuation<? super Unit> continuation) {
                return create(ogvEpisode, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f93836a.o((OgvEpisode) this.L$0, this.$binding.getRoot().getContext());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(k kVar, F f7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = kVar;
            this.$binding = f7;
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
                k kVar = this.this$0;
                OgvCurrentEpisodeRepository$special$$inlined$map$1 ogvCurrentEpisodeRepository$special$$inlined$map$1 = kVar.f93836a.f93837a;
                C07331 c07331 = new C07331(kVar, this.$binding, null);
                this.label = 1;
                if (FlowKt.collectLatest(ogvCurrentEpisodeRepository$special$$inlined$map$1, c07331, this) == coroutine_suspended) {
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
    public OgvEpisodeShortTitleUIComponentInLayer$bind$2(k kVar, F f7, Continuation<? super OgvEpisodeShortTitleUIComponentInLayer$bind$2> continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$binding = f7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvEpisodeShortTitleUIComponentInLayer$bind$2 ogvEpisodeShortTitleUIComponentInLayer$bind$2 = new OgvEpisodeShortTitleUIComponentInLayer$bind$2(this.this$0, this.$binding, continuation);
        ogvEpisodeShortTitleUIComponentInLayer$bind$2.L$0 = obj;
        return ogvEpisodeShortTitleUIComponentInLayer$bind$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$binding, null), 3, (Object) null);
    }
}
