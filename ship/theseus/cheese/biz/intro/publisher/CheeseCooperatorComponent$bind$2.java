package com.bilibili.ship.theseus.cheese.biz.intro.publisher;

import android.content.Context;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.ship.theseus.cheese.biz.intro.publisher.C6107c;
import com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheeseCooperatorComponent$bind$2;
import com.bilibili.ship.theseus.cheese.biz.intro.publisher.z;
import com.bilibili.ship.theseus.cheese.widget.ExpandableTextView;
import fu0.C7177D;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/CheeseCooperatorComponent$bind$2.class */
final class CheeseCooperatorComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final C7177D $binding;
    private Object L$0;
    int label;
    final C6107c this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheeseCooperatorComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/CheeseCooperatorComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C7177D $binding;
        int label;
        final C6107c this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheeseCooperatorComponent$bind$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/CheeseCooperatorComponent$bind$2$1$1.class */
        public static final class C06211 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final C7177D $binding;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06211(C7177D c7177d, Continuation<? super C06211> continuation) {
                super(2, continuation);
                this.$binding = c7177d;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06211 c06211 = new C06211(this.$binding, continuation);
                c06211.I$0 = ((Number) obj).intValue();
                return c06211;
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
                ConstraintLayout constraintLayout = this.$binding.f119421c;
                constraintLayout.setPaddingRelative(DimenUtilsKt.dpToPx(i7), constraintLayout.getPaddingTop(), DimenUtilsKt.dpToPx(i7), constraintLayout.getPaddingBottom());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C6107c c6107c, C7177D c7177d, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c6107c;
            this.$binding = c7177d;
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
                StateFlow<Integer> stateFlow = this.this$0.f89850a.f89856b;
                C06211 c06211 = new C06211(this.$binding, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c06211, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheeseCooperatorComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/CheeseCooperatorComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C7177D $binding;
        int label;
        final C6107c this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheeseCooperatorComponent$bind$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/CheeseCooperatorComponent$bind$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<u, Continuation<? super Unit>, Object> {
            final C7177D $binding;
            Object L$0;
            int label;
            final C6107c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C7177D c7177d, C6107c c6107c, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = c7177d;
                this.this$0 = c6107c;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(u uVar, int i7) {
                uVar.f89909g.invoke(new z.c(i7));
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$1(u uVar, int i7) {
                uVar.f89909g.invoke(new z.f(i7));
                return Unit.INSTANCE;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(u uVar, Continuation<? super Unit> continuation) {
                return create(uVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final u uVar = (u) this.L$0;
                Context context = this.$binding.f119419a.getContext();
                C7177D c7177d = this.$binding;
                H.a(c7177d.f119423e, c7177d.f119420b, uVar.f89903a.f89840d, new Function1(uVar) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.publisher.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final u f89859a;

                    {
                        this.f89859a = uVar;
                    }

                    public final Object invoke(Object obj2) {
                        return CheeseCooperatorComponent$bind$2.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$0(this.f89859a, ((Integer) obj2).intValue());
                    }
                }, new Function1(uVar) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.publisher.f

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final u f89860a;

                    {
                        this.f89860a = uVar;
                    }

                    public final Object invoke(Object obj2) {
                        return CheeseCooperatorComponent$bind$2.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$1(this.f89860a, ((Integer) obj2).intValue());
                    }
                });
                this.$binding.f119424f.setLayoutManager(new LinearLayoutManager(context, 0, false));
                this.$binding.f119424f.setAdapter(new C6107c.b(this.this$0, uVar));
                TextView textView = this.$binding.f119425g;
                E e7 = uVar.f89903a;
                textView.setText(e7.f89837a.f117589a);
                this.$binding.f119422d.setOriginText(new ExpandableTextView.b(e7.f89838b));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C6107c c6107c, C7177D c7177d, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = c6107c;
            this.$binding = c7177d;
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
                C6107c c6107c = this.this$0;
                CheesePublisherService$createPublisherCooperator$$inlined$map$1 cheesePublisherService$createPublisherCooperator$$inlined$map$1 = c6107c.f89850a.f89855a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, c6107c, null);
                this.label = 1;
                if (FlowKt.collectLatest(cheesePublisherService$createPublisherCooperator$$inlined$map$1, anonymousClass1, this) == coroutine_suspended) {
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
    public CheeseCooperatorComponent$bind$2(C6107c c6107c, C7177D c7177d, Continuation<? super CheeseCooperatorComponent$bind$2> continuation) {
        super(2, continuation);
        this.this$0 = c6107c;
        this.$binding = c7177d;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheeseCooperatorComponent$bind$2 cheeseCooperatorComponent$bind$2 = new CheeseCooperatorComponent$bind$2(this.this$0, this.$binding, continuation);
        cheeseCooperatorComponent$bind$2.L$0 = obj;
        return cheeseCooperatorComponent$bind$2;
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
