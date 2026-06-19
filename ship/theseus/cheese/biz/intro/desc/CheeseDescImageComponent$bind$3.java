package com.bilibili.ship.theseus.cheese.biz.intro.desc;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.DiffUtil;
import com.bilibili.app.gemini.ui.UIComponentExtKt;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.ship.theseus.cheese.biz.intro.desc.CheeseDescImageComponent$bind$3;
import com.bilibili.ship.theseus.cheese.biz.intro.desc.c;
import com.bilibili.ship.theseus.cheese.biz.intro.desc.h;
import fu0.C7189k;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/CheeseDescImageComponent$bind$3.class */
final class CheeseDescImageComponent$bind$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final C7189k $binding;
    private Object L$0;
    int label;
    final c this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.desc.CheeseDescImageComponent$bind$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/CheeseDescImageComponent$bind$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C7189k $binding;
        int label;
        final c this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.desc.CheeseDescImageComponent$bind$3$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/CheeseDescImageComponent$bind$3$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final c f89373a;

            public a(c cVar) {
                this.f89373a = cVar;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f89373a.f89391b.tryEmit(h.b.f89408a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C7189k c7189k, c cVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$binding = c7189k;
            this.this$0 = cVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$binding, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = UIComponentExtKt.a(this.$binding.f119560f);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowA.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.desc.CheeseDescImageComponent$bind$3$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/CheeseDescImageComponent$bind$3$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C7189k $binding;
        int label;
        final c this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.desc.CheeseDescImageComponent$bind$3$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/CheeseDescImageComponent$bind$3$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<i, Continuation<? super Unit>, Object> {
            final C7189k $binding;
            Object L$0;
            int label;
            final c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C7189k c7189k, c cVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = c7189k;
                this.this$0 = cVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
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
                this.$binding.f119561g.setText(iVar.f89411a.f117589a);
                Group group = this.$binding.f119558d;
                boolean z6 = iVar.f89416f;
                group.setVisibility(!z6 ? 0 : 8);
                c.a aVar = this.this$0.f89392c;
                List<j> listTake = z6 ? iVar.f89414d : CollectionsKt.take(iVar.f89414d, iVar.f89415e);
                aVar.getClass();
                DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new b(aVar, listTake));
                ((ArrayList) aVar.f89393a).clear();
                ((ArrayList) aVar.f89393a).addAll(listTake);
                diffResultCalculateDiff.dispatchUpdatesTo(aVar);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(c cVar, C7189k c7189k, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$binding = c7189k;
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
                c cVar = this.this$0;
                MutableStateFlow mutableStateFlow = cVar.f89390a.f89396a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, cVar, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.desc.CheeseDescImageComponent$bind$3$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/CheeseDescImageComponent$bind$3$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C7189k $binding;
        int label;
        final c this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.desc.CheeseDescImageComponent$bind$3$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/CheeseDescImageComponent$bind$3$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final C7189k $binding;
            int I$0;
            int label;
            final c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C7189k c7189k, c cVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = c7189k;
                this.this$0 = cVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$0$0(c cVar) {
                int itemCount = cVar.f89392c.getItemCount();
                if (itemCount > 0) {
                    cVar.f89392c.notifyItemRangeChanged(0, itemCount, "payload_image_width_changed");
                }
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, this.this$0, continuation);
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
                ConstraintLayout constraintLayout = this.$binding.f119556b;
                final c cVar = this.this$0;
                constraintLayout.setPaddingRelative(DimenUtilsKt.dpToPx(i7), constraintLayout.getPaddingTop(), DimenUtilsKt.dpToPx(i7), constraintLayout.getPaddingBottom());
                constraintLayout.post(new Runnable(cVar) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.desc.f

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final c f89404a;

                    {
                        this.f89404a = cVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        CheeseDescImageComponent$bind$3.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$0$0(this.f89404a);
                    }
                });
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(c cVar, C7189k c7189k, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$binding = c7189k;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                c cVar = this.this$0;
                StateFlow<Integer> stateFlow = cVar.f89390a.f89397b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, cVar, null);
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
    public CheeseDescImageComponent$bind$3(C7189k c7189k, c cVar, Continuation<? super CheeseDescImageComponent$bind$3> continuation) {
        super(2, continuation);
        this.$binding = c7189k;
        this.this$0 = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheeseDescImageComponent$bind$3 cheeseDescImageComponent$bind$3 = new CheeseDescImageComponent$bind$3(this.$binding, this.this$0, continuation);
        cheeseDescImageComponent$bind$3.L$0 = obj;
        return cheeseDescImageComponent$bind$3;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$binding, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$binding, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$binding, null), 3, (Object) null);
    }
}
