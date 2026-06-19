package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bilibili.app.gemini.ui.UIComponentExtKt;
import com.bilibili.bplus.im.conversation.E0;
import com.bilibili.cheese.pay.model.PayCouponVo;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.C6095p;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryFloatLayerComponent$bind$3;
import fu0.C7185g;
import fu0.C7199v;
import java.util.Arrays;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryFloatLayerComponent$bind$3.class */
final class CheesePrimaryFloatLayerComponent$bind$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final C7199v $binding;
    final C7185g $bottomBinding;
    final Context $context;
    private Object L$0;
    int label;
    final C6095p this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryFloatLayerComponent$bind$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryFloatLayerComponent$bind$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C7199v $binding;
        int label;
        final C6095p this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryFloatLayerComponent$bind$3$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryFloatLayerComponent$bind$3$1$1.class */
        public static final class C06151 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            final C7199v $binding;
            int label;
            final C6095p this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06151(C6095p c6095p, C7199v c7199v, Continuation<? super C06151> continuation) {
                super(2, continuation);
                this.this$0 = c6095p;
                this.$binding = c7199v;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06151(this.this$0, this.$binding, continuation);
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
                this.this$0.f89756e.tryEmit(new C6095p.c.a(this.$binding.f119616c));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C7199v c7199v, C6095p c6095p, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$binding = c7199v;
            this.this$0 = c6095p;
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
                Flow flowA = UIComponentExtKt.a(this.$binding.f119616c);
                C06151 c06151 = new C06151(this.this$0, this.$binding, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, c06151, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryFloatLayerComponent$bind$3$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryFloatLayerComponent$bind$3$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C7199v $binding;
        int label;
        final C6095p this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryFloatLayerComponent$bind$3$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryFloatLayerComponent$bind$3$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            final C7199v $binding;
            int label;
            final C6095p this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C6095p c6095p, C7199v c7199v, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = c6095p;
                this.$binding = c7199v;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$binding, continuation);
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
                this.this$0.f89756e.tryEmit(new C6095p.c.a(this.$binding.f119619f));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C7199v c7199v, C6095p c6095p, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$binding = c7199v;
            this.this$0 = c6095p;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$binding, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = UIComponentExtKt.a(this.$binding.f119619f);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$binding, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryFloatLayerComponent$bind$3$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryFloatLayerComponent$bind$3$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C7199v $binding;
        final C7185g $bottomBinding;
        int label;
        final C6095p this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryFloatLayerComponent$bind$3$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryFloatLayerComponent$bind$3$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            final C7199v $binding;
            int label;
            final C6095p this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C7199v c7199v, C6095p c6095p, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = c7199v;
                this.this$0 = c6095p;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$binding, this.this$0, continuation);
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
                this.$binding.f119616c.performClick();
                this.this$0.f89756e.tryEmit(C6095p.c.C0620c.f89764a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C7185g c7185g, C7199v c7199v, C6095p c6095p, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$bottomBinding = c7185g;
            this.$binding = c7199v;
            this.this$0 = c6095p;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$bottomBinding, this.$binding, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = UIComponentExtKt.a(this.$bottomBinding.f119544c);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, this.this$0, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryFloatLayerComponent$bind$3$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryFloatLayerComponent$bind$3$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C7199v $binding;
        final Context $context;
        int label;
        final C6095p this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryFloatLayerComponent$bind$3$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryFloatLayerComponent$bind$3$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C6095p.d, Continuation<? super Unit>, Object> {
            final C7199v $binding;
            final Context $context;
            Object L$0;
            int label;
            final C6095p this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C7199v c7199v, Context context, C6095p c6095p, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = c7199v;
                this.$context = context;
                this.this$0 = c6095p;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(C6095p c6095p) {
                c6095p.f89756e.tryEmit(C6095p.c.d.f89765a);
                return Unit.INSTANCE;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, this.$context, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C6095p.d dVar, Continuation<? super Unit> continuation) {
                return create(dVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C6095p.d dVar = (C6095p.d) this.L$0;
                this.$binding.f119618e.setLayoutManager(new LinearLayoutManager(this.$context));
                C6095p c6095p = this.this$0;
                c6095p.f89755d = new C6095p.a(c6095p, dVar.f89766a);
                this.$binding.f119618e.setAdapter(this.this$0.f89755d);
                FrameLayout frameLayout = this.$binding.f119619f;
                E0 e02 = com.bilibili.ship.theseus.cheese.biz.report.c.f90463a;
                final C6095p c6095p2 = this.this$0;
                ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(frameLayout, new ExposureEntry(e02, new Function0(c6095p2) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.primary.u

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final C6095p f89775a;

                    {
                        this.f89775a = c6095p2;
                    }

                    public final Object invoke() {
                        return CheesePrimaryFloatLayerComponent$bind$3.AnonymousClass4.AnonymousClass1.invokeSuspend$lambda$0(this.f89775a);
                    }
                }));
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(this.$context.getString(2131848742), Arrays.copyOf(new Object[]{Boxing.boxInt(dVar.f89766a.size())}, 1));
                SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) str);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ContextCompat.getColor(this.$context, R$color.Brand_pink));
                int length = (str.length() - String.valueOf(dVar.f89766a.size()).length()) - 3;
                int length2 = str.length();
                if (length < length2) {
                    spannableStringBuilderAppend.setSpan(foregroundColorSpan, length, length2, 18);
                    this.$binding.f119620g.setText(spannableStringBuilderAppend);
                } else {
                    this.$binding.f119620g.setText(this.$context.getString(2131848761));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(C6095p c6095p, C7199v c7199v, Context context, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = c6095p;
            this.$binding = c7199v;
            this.$context = context;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, this.$binding, this.$context, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                C6095p c6095p = this.this$0;
                Flow<C6095p.d> flow = c6095p.f89754c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, this.$context, c6095p, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryFloatLayerComponent$bind$3$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryFloatLayerComponent$bind$3$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C7185g $bottomBinding;
        final Context $context;
        int label;
        final C6095p this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryFloatLayerComponent$bind$3$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryFloatLayerComponent$bind$3$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends PayCouponVo>, Continuation<? super Unit>, Object> {
            final C7185g $bottomBinding;
            final Context $context;
            Object L$0;
            int label;
            final C6095p this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C6095p c6095p, Context context, C7185g c7185g, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = c6095p;
                this.$context = context;
                this.$bottomBinding = c7185g;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$context, this.$bottomBinding, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(List<PayCouponVo> list, Continuation<? super Unit> continuation) {
                return create(list, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C6095p.c(this.this$0, this.$context, (List) this.L$0, this.$bottomBinding);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(C6095p c6095p, Context context, C7185g c7185g, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = c6095p;
            this.$context = context;
            this.$bottomBinding = c7185g;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, this.$context, this.$bottomBinding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                C6095p c6095p = this.this$0;
                StateFlow<List<PayCouponVo>> stateFlow = c6095p.f89752a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(c6095p, this.$context, this.$bottomBinding, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryFloatLayerComponent$bind$3$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryFloatLayerComponent$bind$3$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C7185g $bottomBinding;
        final Context $context;
        int label;
        final C6095p this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryFloatLayerComponent$bind$3$6$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryFloatLayerComponent$bind$3$6$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            final C7185g $bottomBinding;
            final Context $context;
            int label;
            final C6095p this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C6095p c6095p, Context context, C7185g c7185g, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = c6095p;
                this.$context = context;
                this.$bottomBinding = c7185g;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$context, this.$bottomBinding, continuation);
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
                C6095p c6095p = this.this$0;
                C6095p.c(c6095p, this.$context, (List) c6095p.f89752a.getValue(), this.$bottomBinding);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(C6095p c6095p, Context context, C7185g c7185g, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = c6095p;
            this.$context = context;
            this.$bottomBinding = c7185g;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.this$0, this.$context, this.$bottomBinding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                C6095p c6095p = this.this$0;
                Flow<Unit> flow = c6095p.f89753b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(c6095p, this.$context, this.$bottomBinding, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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
    public CheesePrimaryFloatLayerComponent$bind$3(C7199v c7199v, C6095p c6095p, C7185g c7185g, Context context, Continuation<? super CheesePrimaryFloatLayerComponent$bind$3> continuation) {
        super(2, continuation);
        this.$binding = c7199v;
        this.this$0 = c6095p;
        this.$bottomBinding = c7185g;
        this.$context = context;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheesePrimaryFloatLayerComponent$bind$3 cheesePrimaryFloatLayerComponent$bind$3 = new CheesePrimaryFloatLayerComponent$bind$3(this.$binding, this.this$0, this.$bottomBinding, this.$context, continuation);
        cheesePrimaryFloatLayerComponent$bind$3.L$0 = obj;
        return cheesePrimaryFloatLayerComponent$bind$3;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$binding, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.$bottomBinding, this.$binding, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, this.$binding, this.$context, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this.this$0, this.$context, this.$bottomBinding, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this.this$0, this.$context, this.$bottomBinding, null), 3, (Object) null);
    }
}
