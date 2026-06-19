package com.bilibili.ship.theseus.cheese.biz.intro.shoppingnotice;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.ship.theseus.cheese.biz.intro.shoppingnotice.CheeseShoppingNoticeComponent$bind$2;
import com.bilibili.ship.theseus.cheese.biz.intro.shoppingnotice.b;
import com.bilibili.ship.theseus.cheese.biz.intro.shoppingnotice.g;
import fu0.S;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/shoppingnotice/CheeseShoppingNoticeComponent$bind$2.class */
final class CheeseShoppingNoticeComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final S $binding;
    private Object L$0;
    int label;
    final b this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.shoppingnotice.CheeseShoppingNoticeComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/shoppingnotice/CheeseShoppingNoticeComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final S $binding;
        int label;
        final b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.shoppingnotice.CheeseShoppingNoticeComponent$bind$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/shoppingnotice/CheeseShoppingNoticeComponent$bind$2$1$1.class */
        public static final class C06391 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final S $binding;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06391(S s7, Continuation<? super C06391> continuation) {
                super(2, continuation);
                this.$binding = s7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06391 c06391 = new C06391(this.$binding, continuation);
                c06391.I$0 = ((Number) obj).intValue();
                return c06391;
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
                ConstraintLayout constraintLayout = this.$binding.f119490b;
                constraintLayout.setPaddingRelative(DimenUtilsKt.dpToPx(i7), constraintLayout.getPaddingTop(), DimenUtilsKt.dpToPx(i7), constraintLayout.getPaddingBottom());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, S s7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$binding = s7;
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
                StateFlow<Integer> stateFlow = this.this$0.f90116a.f90120b;
                C06391 c06391 = new C06391(this.$binding, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c06391, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.shoppingnotice.CheeseShoppingNoticeComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/shoppingnotice/CheeseShoppingNoticeComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final S $binding;
        int label;
        final b this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.shoppingnotice.CheeseShoppingNoticeComponent$bind$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/shoppingnotice/CheeseShoppingNoticeComponent$bind$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<h, Continuation<? super Unit>, Object> {
            final S $binding;
            Object L$0;
            int label;
            final b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(S s7, b bVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = s7;
                this.this$0 = bVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(h hVar) {
                hVar.f90132b.invoke(g.a.f90130a);
                return Unit.INSTANCE;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(h hVar, Continuation<? super Unit> continuation) {
                return create(hVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final h hVar = (h) this.L$0;
                final Context context = this.$binding.f119489a.getContext();
                this.$binding.f119492d.setLayoutManager(new LinearLayoutManager(context));
                this.$binding.f119492d.setAdapter(new b.a(this.this$0, hVar.f90131a));
                ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(this.$binding.f119489a, new ExposureEntry(com.bilibili.ship.theseus.cheese.biz.report.c.f90463a, new Function0(hVar) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.shoppingnotice.c

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final h f90121a;

                    {
                        this.f90121a = hVar;
                    }

                    public final Object invoke() {
                        return CheeseShoppingNoticeComponent$bind$2.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$0(this.f90121a);
                    }
                }));
                TintTextView tintTextView = this.$binding.f119493e;
                a aVar = hVar.f90131a;
                tintTextView.setText(aVar.f90113a.f117589a);
                Layer layer = this.$binding.f119491c;
                final String str = aVar.f90115c;
                layer.setVisibility(str.length() > 0 ? 0 : 8);
                this.$binding.f119491c.setOnClickListener(new View.OnClickListener(context, str) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.shoppingnotice.d

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Context f90122a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final String f90123b;

                    {
                        this.f90122a = context;
                        this.f90123b = str;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        qV.a.b(this.f90122a, this.f90123b);
                    }
                });
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(b bVar, S s7, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$binding = s7;
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
                b bVar = this.this$0;
                MutableStateFlow mutableStateFlow = bVar.f90116a.f90119a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, bVar, null);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseShoppingNoticeComponent$bind$2(b bVar, S s7, Continuation<? super CheeseShoppingNoticeComponent$bind$2> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$binding = s7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheeseShoppingNoticeComponent$bind$2 cheeseShoppingNoticeComponent$bind$2 = new CheeseShoppingNoticeComponent$bind$2(this.this$0, this.$binding, continuation);
        cheeseShoppingNoticeComponent$bind$2.L$0 = obj;
        return cheeseShoppingNoticeComponent$bind$2;
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
