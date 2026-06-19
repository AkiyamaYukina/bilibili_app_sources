package com.bilibili.ship.theseus.cheese.biz.intro.cooperation;

import android.view.View;
import com.bilibili.app.comm.list.common.utils.CommonExtensionKt;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.coroutineextension.j;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.ship.theseus.cheese.biz.intro.cooperation.CheeseCooperationComponent$bindToView$2;
import com.bilibili.ship.theseus.cheese.biz.intro.cooperation.a;
import fu0.X;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/cooperation/CheeseCooperationComponent$bindToView$2.class */
final class CheeseCooperationComponent$bindToView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final X $binding;
    private Object L$0;
    int label;
    final a this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.cooperation.CheeseCooperationComponent$bindToView$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/cooperation/CheeseCooperationComponent$bindToView$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final X $binding;
        int label;
        final a this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.cooperation.CheeseCooperationComponent$bindToView$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/cooperation/CheeseCooperationComponent$bindToView$2$1$1.class */
        public static final class C06061 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final X $binding;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06061(X x6, Continuation<? super C06061> continuation) {
                super(2, continuation);
                this.$binding = x6;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06061 c06061 = new C06061(this.$binding, continuation);
                c06061.I$0 = ((Number) obj).intValue();
                return c06061;
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
                CommonExtensionKt.setMarginLeft(this.$binding.f119514c, DimenUtilsKt.dpToPx(i7));
                CommonExtensionKt.setMarginRight(this.$binding.f119513b, DimenUtilsKt.dpToPx(i7));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, X x6, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$binding = x6;
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
                StateFlow<Integer> stateFlow = ((a.C0607a) this.this$0.f89356a.getValue()).f89361e;
                C06061 c06061 = new C06061(this.$binding, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c06061, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.cooperation.CheeseCooperationComponent$bindToView$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/cooperation/CheeseCooperationComponent$bindToView$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final X $binding;
        int label;
        final a this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.cooperation.CheeseCooperationComponent$bindToView$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/cooperation/CheeseCooperationComponent$bindToView$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<a.C0607a, Continuation<? super Unit>, Object> {
            final X $binding;
            Object L$0;
            int label;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.cooperation.CheeseCooperationComponent$bindToView$2$2$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/cooperation/CheeseCooperationComponent$bindToView$2$2$1$a.class */
            public static final class a implements View.OnClickListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final a.C0607a f89354a;

                public a(a.C0607a c0607a) {
                    this.f89354a = c0607a;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f89354a.f89362f.invoke(a.C0607a.InterfaceC0608a.b.f89364a);
                }
            }

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.cooperation.CheeseCooperationComponent$bindToView$2$2$1$b */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/cooperation/CheeseCooperationComponent$bindToView$2$2$1$b.class */
            public static final class b implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final X f89355a;

                public b(X x6) {
                    this.f89355a = x6;
                }

                public final void invoke() {
                    this.f89355a.f119513b.setOnClickListener(null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(X x6, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = x6;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(a.C0607a c0607a) {
                c0607a.f89362f.invoke(a.C0607a.InterfaceC0608a.C0609a.f89363a);
                return Unit.INSTANCE;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(a.C0607a c0607a, Continuation<? super Unit> continuation) {
                return create(c0607a, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                j bVar;
                j jVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    final a.C0607a c0607a = (a.C0607a) this.L$0;
                    ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(this.$binding.f119512a, new ExposureEntry(com.bilibili.ship.theseus.cheese.biz.report.c.f90463a, new Function0(c0607a) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.cooperation.b

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final a.C0607a f89365a;

                        {
                            this.f89365a = c0607a;
                        }

                        public final Object invoke() {
                            return CheeseCooperationComponent$bindToView$2.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$0(this.f89365a);
                        }
                    }));
                    ImageRequestBuilder.placeholderImageResId$default(BiliImageLoader.INSTANCE.with(this.$binding.f119512a.getContext()).url(c0607a.f89360d), 2131240799, (ScaleType) null, 2, (Object) null).into(this.$binding.f119514c);
                    this.$binding.f119516e.setText(c0607a.f89357a);
                    this.$binding.f119515d.setText(c0607a.f89358b);
                    this.$binding.f119513b.setText(c0607a.f89359c);
                    X x6 = this.$binding;
                    x6.f119513b.setOnClickListener(new a(c0607a));
                    bVar = new b(x6);
                    try {
                        this.L$0 = bVar;
                        this.label = 1;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th) {
                        th = th;
                        jVar = bVar;
                        jVar.invoke();
                        throw th;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j jVar2 = (j) this.L$0;
                    jVar = jVar2;
                    try {
                        ResultKt.throwOnFailure(obj);
                        bVar = jVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        jVar.invoke();
                        throw th;
                    }
                }
                j jVar3 = bVar;
                jVar = bVar;
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(a aVar, X x6, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$binding = x6;
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
                MutableStateFlow mutableStateFlow = this.this$0.f89356a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, null);
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
    public CheeseCooperationComponent$bindToView$2(a aVar, X x6, Continuation<? super CheeseCooperationComponent$bindToView$2> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$binding = x6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheeseCooperationComponent$bindToView$2 cheeseCooperationComponent$bindToView$2 = new CheeseCooperationComponent$bindToView$2(this.this$0, this.$binding, continuation);
        cheeseCooperationComponent$bindToView$2.L$0 = obj;
        return cheeseCooperationComponent$bindToView$2;
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
