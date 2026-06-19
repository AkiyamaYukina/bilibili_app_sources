package com.bilibili.ship.theseus.ugc.intro.upcenter;

import Vu0.x;
import com.bilibili.app.gemini.ui.UIComponentExtKt;
import com.bilibili.app.screen.adjust.widget.z;
import com.bilibili.lib.biliweb.BiliWebViewConfigHolderV2;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterFloatLayerUiComponent$bindToView$2.class */
final class UgcUpCenterFloatLayerUiComponent$bindToView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final x $binding;
    private Object L$0;
    int label;
    final c this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterFloatLayerUiComponent$bindToView$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterFloatLayerUiComponent$bindToView$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final x $binding;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterFloatLayerUiComponent$bindToView$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterFloatLayerUiComponent$bindToView$2$1$1.class */
        public static final class C08741 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            final x $binding;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08741(x xVar, Continuation<? super C08741> continuation) {
                super(2, continuation);
                this.$binding = xVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08741(this.$binding, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                z.a(this.$binding.f25989d);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(x xVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$binding = xVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = UIComponentExtKt.a(this.$binding.f25987b);
                C08741 c08741 = new C08741(this.$binding, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, c08741, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterFloatLayerUiComponent$bindToView$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterFloatLayerUiComponent$bindToView$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final x $binding;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterFloatLayerUiComponent$bindToView$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterFloatLayerUiComponent$bindToView$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            final x $binding;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(x xVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = xVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$binding, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                z.a(this.$binding.f25989d);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(x xVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$binding = xVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = UIComponentExtKt.a(this.$binding.f25989d);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterFloatLayerUiComponent$bindToView$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterFloatLayerUiComponent$bindToView$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final x $binding;
        int label;
        final c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(x xVar, c cVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$binding = xVar;
            this.this$0 = cVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$binding, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
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
                this.$binding.f25990e.loadUrl("");
                BiliWebViewConfigHolderV2 biliWebViewConfigHolderV2 = this.this$0.f97554c;
                if (biliWebViewConfigHolderV2 != null) {
                    biliWebViewConfigHolderV2.destroyWebView();
                }
                this.this$0.f97553b = false;
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcUpCenterFloatLayerUiComponent$bindToView$2(c cVar, x xVar, Continuation<? super UgcUpCenterFloatLayerUiComponent$bindToView$2> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$binding = xVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UgcUpCenterFloatLayerUiComponent$bindToView$2 ugcUpCenterFloatLayerUiComponent$bindToView$2 = new UgcUpCenterFloatLayerUiComponent$bindToView$2(this.this$0, this.$binding, continuation);
        ugcUpCenterFloatLayerUiComponent$bindToView$2.L$0 = obj;
        return ugcUpCenterFloatLayerUiComponent$bindToView$2;
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
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$binding, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$binding, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.$binding, this.this$0, null), 3, (Object) null);
        c cVar = this.this$0;
        if (!cVar.f97553b) {
            cVar.a(this.$binding.f25990e);
        }
        this.$binding.f25990e.loadUrl(this.this$0.f97552a);
        return Unit.INSTANCE;
    }
}
