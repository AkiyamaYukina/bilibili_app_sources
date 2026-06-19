package com.bilibili.ship.theseus.cheese.biz.intro.desc;

import android.widget.TextView;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.ship.theseus.cheese.biz.intro.desc.h;
import fu0.C7190l;
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
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/CheeseDescTextComponent$bind$2.class */
final class CheeseDescTextComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final C7190l $binding;
    private Object L$0;
    int label;
    final g this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.desc.CheeseDescTextComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/CheeseDescTextComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C7190l $binding;
        int label;
        final g this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.desc.CheeseDescTextComponent$bind$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/CheeseDescTextComponent$bind$2$1$1.class */
        public static final class C06101 extends SuspendLambda implements Function2<i, Continuation<? super Unit>, Object> {
            final C7190l $binding;
            Object L$0;
            int label;
            final g this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06101(C7190l c7190l, g gVar, Continuation<? super C06101> continuation) {
                super(2, continuation);
                this.$binding = c7190l;
                this.this$0 = gVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06101 c06101 = new C06101(this.$binding, this.this$0, continuation);
                c06101.L$0 = obj;
                return c06101;
            }

            public final Object invoke(i iVar, Continuation<? super Unit> continuation) {
                return create(iVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                i iVar = (i) this.L$0;
                this.$binding.f119564c.setText(iVar.f89411a.f117589a);
                this.$binding.f119563b.setText(iVar.f89413c);
                this.this$0.f89406b.tryEmit(h.d.f89410a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g gVar, C7190l c7190l, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = gVar;
            this.$binding = c7190l;
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
                g gVar = this.this$0;
                MutableStateFlow mutableStateFlow = gVar.f89405a.f89396a;
                C06101 c06101 = new C06101(this.$binding, gVar, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, c06101, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.desc.CheeseDescTextComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/CheeseDescTextComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C7190l $binding;
        int label;
        final g this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.desc.CheeseDescTextComponent$bind$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/CheeseDescTextComponent$bind$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final C7190l $binding;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C7190l c7190l, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = c7190l;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, continuation);
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
                int i7 = this.I$0;
                TintTextView tintTextView = this.$binding.f119564c;
                tintTextView.setPaddingRelative(DimenUtilsKt.dpToPx(i7), tintTextView.getPaddingTop(), DimenUtilsKt.dpToPx(i7), tintTextView.getPaddingBottom());
                TextView textView = this.$binding.f119563b;
                textView.setPaddingRelative(DimenUtilsKt.dpToPx(i7), textView.getPaddingTop(), DimenUtilsKt.dpToPx(i7), textView.getPaddingBottom());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(g gVar, C7190l c7190l, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = gVar;
            this.$binding = c7190l;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> stateFlow = this.this$0.f89405a.f89397b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
    public CheeseDescTextComponent$bind$2(g gVar, C7190l c7190l, Continuation<? super CheeseDescTextComponent$bind$2> continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$binding = c7190l;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheeseDescTextComponent$bind$2 cheeseDescTextComponent$bind$2 = new CheeseDescTextComponent$bind$2(this.this$0, this.$binding, continuation);
        cheeseDescTextComponent$bind$2.L$0 = obj;
        return cheeseDescTextComponent$bind$2;
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
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$binding, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$binding, null), 3, (Object) null);
    }
}
