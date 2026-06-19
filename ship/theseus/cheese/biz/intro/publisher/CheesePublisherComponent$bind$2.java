package com.bilibili.ship.theseus.cheese.biz.intro.publisher;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.bplus.im.conversation.E0;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.avatar.AvatarShowParam;
import com.bilibili.relation.utils.FollowFlowHelper;
import com.bilibili.relation.widget.FollowButton;
import com.bilibili.relation.widget.FollowButtonConfig;
import com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePublisherComponent$bind$2;
import com.bilibili.ship.theseus.cheese.biz.intro.publisher.i;
import com.bilibili.ship.theseus.cheese.biz.intro.publisher.z;
import com.bilibili.ship.theseus.cheese.widget.CheeseLivingPendantAvatarView;
import com.bilibili.ship.theseus.cheese.widget.ExpandableTextView;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/CheesePublisherComponent$bind$2.class */
final class CheesePublisherComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final fu0.F $binding;
    private Object L$0;
    int label;
    final i this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePublisherComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/CheesePublisherComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final fu0.F $binding;
        int label;
        final i this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePublisherComponent$bind$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/CheesePublisherComponent$bind$2$1$1.class */
        public static final class C06231 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final fu0.F $binding;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06231(fu0.F f7, Continuation<? super C06231> continuation) {
                super(2, continuation);
                this.$binding = f7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06231 c06231 = new C06231(this.$binding, continuation);
                c06231.I$0 = ((Number) obj).intValue();
                return c06231;
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
                ConstraintLayout constraintLayout = this.$binding.f119433d;
                constraintLayout.setPaddingRelative(DimenUtilsKt.dpToPx(i7), constraintLayout.getPaddingTop(), DimenUtilsKt.dpToPx(i7), constraintLayout.getPaddingBottom());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(i iVar, fu0.F f7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = iVar;
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
                StateFlow<Integer> stateFlow = this.this$0.f89867a.f89869b;
                C06231 c06231 = new C06231(this.$binding, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c06231, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePublisherComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/CheesePublisherComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final fu0.F $binding;
        int label;
        final i this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePublisherComponent$bind$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/CheesePublisherComponent$bind$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function3<Boolean, WindowSizeClass, Continuation<? super Boolean>, Object> {
            Object L$0;
            boolean Z$0;
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Boolean) obj).booleanValue(), (WindowSizeClass) obj2, (Continuation<? super Boolean>) obj3);
            }

            public final Object invoke(boolean z6, WindowSizeClass windowSizeClass, Continuation<? super Boolean> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.Z$0 = z6;
                anonymousClass1.L$0 = windowSizeClass;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.Z$0 || com.bilibili.ship.theseus.united.page.screensize.b.c((WindowSizeClass) this.L$0));
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePublisherComponent$bind$2$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/CheesePublisherComponent$bind$2$2$2.class */
        public static final class C06242 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final fu0.F $binding;
            boolean Z$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06242(fu0.F f7, Continuation<? super C06242> continuation) {
                super(2, continuation);
                this.$binding = f7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06242 c06242 = new C06242(this.$binding, continuation);
                c06242.Z$0 = ((Boolean) obj).booleanValue();
                return c06242;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z6 = this.Z$0;
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.$binding.f119436g.getLayoutParams();
                if (z6) {
                    layoutParams.horizontalBias = 0.0f;
                } else {
                    layoutParams.horizontalBias = 1.0f;
                }
                this.$binding.f119436g.setLayoutParams(layoutParams);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(i iVar, fu0.F f7, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = iVar;
            this.$binding = f7;
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
                i.a aVar = this.this$0.f89867a;
                Flow flowCombine = FlowKt.combine(aVar.f89870c, aVar.f89871d, new AnonymousClass1(null));
                C06242 c06242 = new C06242(this.$binding, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, c06242, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePublisherComponent$bind$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/CheesePublisherComponent$bind$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final fu0.F $binding;
        int label;
        final i this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePublisherComponent$bind$2$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/CheesePublisherComponent$bind$2$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C, Continuation<? super Unit>, Object> {
            final fu0.F $binding;
            Object L$0;
            int label;
            final i this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePublisherComponent$bind$2$3$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/CheesePublisherComponent$bind$2$3$1$a.class */
            public static final class a extends FollowFlowHelper.SimpleCallback {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Context f89812a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final i f89813b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final fu0.F f89814c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final C f89815d;

                public a(Context context, i iVar, fu0.F f7, C c7) {
                    this.f89812a = context;
                    this.f89813b = iVar;
                    this.f89814c = f7;
                    this.f89815d = c7;
                }

                @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
                public final boolean isCancel() {
                    return this.f89812a == null;
                }

                @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
                public final boolean isLogin() {
                    boolean zIsLogin = BiliAccounts.get(this.f89812a).isLogin();
                    if (!zIsLogin) {
                        com.bapis.bilibili.account.interfaces.v1.g.a(null, "activity://main/login/", 2, null);
                    }
                    return zIsLogin;
                }

                @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
                public final boolean onFollowError(Throwable th) {
                    FollowButton followButton = this.f89814c.f119436g;
                    int i7 = i.f89866b;
                    this.f89813b.getClass();
                    followButton.updateUI(false);
                    return super.onFollowError(th);
                }

                @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
                public final void onFollowStart() {
                    FollowButton followButton = this.f89814c.f119436g;
                    int i7 = i.f89866b;
                    this.f89813b.getClass();
                    followButton.updateUI(true);
                    super.onFollowStart();
                }

                @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
                public final boolean onFollowSuccess() {
                    this.f89815d.h.invoke(new z.g(true));
                    return super.onFollowSuccess();
                }

                @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
                public final boolean onUnFollowError(Throwable th) {
                    FollowButton followButton = this.f89814c.f119436g;
                    int i7 = i.f89866b;
                    this.f89813b.getClass();
                    followButton.updateUI(true);
                    return super.onUnFollowError(th);
                }

                @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
                public final void onUnFollowStart() {
                    FollowButton followButton = this.f89814c.f119436g;
                    int i7 = i.f89866b;
                    this.f89813b.getClass();
                    followButton.updateUI(false);
                    super.onUnFollowStart();
                }

                @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
                public final boolean onUnFollowSuccess() {
                    this.f89815d.h.invoke(new z.g(false));
                    return super.onUnFollowSuccess();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(fu0.F f7, i iVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = f7;
                this.this$0 = iVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(C c7, int i7) {
                c7.h.invoke(new z.c(i7));
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$1(C c7, int i7) {
                c7.h.invoke(new z.f(i7));
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$2(C c7, View view) {
                c7.h.invoke(z.a.f89920a);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$3(C c7, View view) {
                c7.h.invoke(z.b.f89921a);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$4(C c7) {
                c7.h.invoke(z.h.f89927a);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$5(C c7) {
                c7.h.invoke(z.i.f89928a);
                return Unit.INSTANCE;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C c7, Continuation<? super Unit> continuation) {
                return create(c7, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final C c7 = (C) this.L$0;
                Context context = this.$binding.f119430a.getContext();
                fu0.F f7 = this.$binding;
                H.a(f7.f119437i, f7.f119432c, c7.f89805b.f89840d, new Function1(c7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.publisher.j

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final C f89872a;

                    {
                        this.f89872a = c7;
                    }

                    public final Object invoke(Object obj2) {
                        return CheesePublisherComponent$bind$2.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$0(this.f89872a, ((Integer) obj2).intValue());
                    }
                }, new Function1(c7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.publisher.k

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final C f89873a;

                    {
                        this.f89873a = c7;
                    }

                    public final Object invoke(Object obj2) {
                        return CheesePublisherComponent$bind$2.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$1(this.f89873a, ((Integer) obj2).intValue());
                    }
                });
                this.$binding.f119431b.setOnClickListener(new View.OnClickListener(c7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.publisher.l

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final C f89874a;

                    {
                        this.f89874a = c7;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CheesePublisherComponent$bind$2.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$2(this.f89874a, view);
                    }
                });
                this.$binding.h.setOnClickListener(new View.OnClickListener(c7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.publisher.m

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final C f89875a;

                    {
                        this.f89875a = c7;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CheesePublisherComponent$bind$2.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$3(this.f89875a, view);
                    }
                });
                ConstraintLayout constraintLayout = this.$binding.f119430a;
                E0 e02 = com.bilibili.ship.theseus.cheese.biz.report.c.f90463a;
                ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(constraintLayout, new ExposureEntry(e02, new Function0(c7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.publisher.n

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final C f89876a;

                    {
                        this.f89876a = c7;
                    }

                    public final Object invoke() {
                        return CheesePublisherComponent$bind$2.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$4(this.f89876a);
                    }
                }));
                TextView textView = this.$binding.f119438j;
                E e7 = c7.f89805b;
                textView.setText(e7.f89837a.f117589a);
                TextView textView2 = this.$binding.h;
                B b7 = c7.f89804a;
                textView2.setText(b7.f89797c);
                this.$binding.f119434e.setOriginText(new ExpandableTextView.b(e7.f89838b));
                AppCompatTextView appCompatTextView = this.$binding.f119435f;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                appCompatTextView.setText(String.format(context.getString(2131835565), Arrays.copyOf(new Object[]{b7.f89798d, b7.f89801g}, 2)));
                AvatarShowParam avatarShowParam = new AvatarShowParam(b7.f89802i);
                avatarShowParam.setDefaultRes(2131231975);
                boolean z6 = b7.h.f89792b != 0;
                CheeseLivingPendantAvatarView cheeseLivingPendantAvatarView = this.$binding.f119431b;
                cheeseLivingPendantAvatarView.f90780r = z6;
                cheeseLivingPendantAvatarView.ensureStyle();
                cheeseLivingPendantAvatarView.ensureVisibility();
                if (cheeseLivingPendantAvatarView.f90780r) {
                    cheeseLivingPendantAvatarView.f90772j.f119635d.setVisibility(0);
                    cheeseLivingPendantAvatarView.f90772j.f119634c.setVisibility(0);
                } else {
                    cheeseLivingPendantAvatarView.f90772j.f119635d.setVisibility(8);
                    cheeseLivingPendantAvatarView.f90772j.f119634c.setVisibility(8);
                    cheeseLivingPendantAvatarView.f90772j.f119633b.setVisibility(8);
                    cheeseLivingPendantAvatarView.f90772j.f119636e.setVisibility(8);
                }
                if (cheeseLivingPendantAvatarView.f90780r) {
                    cheeseLivingPendantAvatarView.j();
                } else {
                    cheeseLivingPendantAvatarView.f90772j.f119633b.setVisibility(8);
                    cheeseLivingPendantAvatarView.f90772j.f119636e.setVisibility(8);
                }
                cheeseLivingPendantAvatarView.show(avatarShowParam);
                BLog.d("publisher bindToView isLiving = " + z6);
                if (z6) {
                    ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(this.$binding.f119431b, new ExposureEntry(e02, new Function0(c7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.publisher.o

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final C f89877a;

                        {
                            this.f89877a = c7;
                        }

                        public final Object invoke() {
                            return CheesePublisherComponent$bind$2.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$5(this.f89877a);
                        }
                    }));
                }
                i iVar = this.this$0;
                FollowButton followButton = this.$binding.f119436g;
                boolean z7 = b7.f89799e == 1;
                int i7 = i.f89866b;
                iVar.getClass();
                followButton.updateUI(z7);
                fu0.F f8 = this.$binding;
                FollowButton followButton2 = f8.f119436g;
                FollowButtonConfig.Builder isGuestAttention = new FollowButtonConfig.Builder(b7.f89803j, b7.f89799e == 1, 0, new a(context, this.this$0, f8, c7)).setIsGuestAttention(false);
                String str = c7.f89806c;
                FollowButtonConfig.Builder spmid = isGuestAttention.setSpmid(str);
                String str2 = c7.f89807d;
                followButton2.bind(spmid.setFromSpmid(str2).setExtendContent(MapsKt.hashMapOf(new Pair[]{TuplesKt.to("entity", "pugv"), TuplesKt.to("entity_id", String.valueOf(c7.f89809f))})).setClickReportExtras(MapsKt.hashMapOf(new Pair[]{TuplesKt.to("ssid", String.valueOf(c7.f89808e)), TuplesKt.to("csource", c7.f89810g), TuplesKt.to("spmid", str), TuplesKt.to("from_spmid", str2), TuplesKt.to("up_mid", String.valueOf(b7.f89803j))})).build());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(i iVar, fu0.F f7, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = iVar;
            this.$binding = f7;
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
                i iVar = this.this$0;
                CheesePublisherService$createPublisherOwner$$inlined$map$1 cheesePublisherService$createPublisherOwner$$inlined$map$1 = iVar.f89867a.f89868a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, iVar, null);
                this.label = 1;
                if (FlowKt.collectLatest(cheesePublisherService$createPublisherOwner$$inlined$map$1, anonymousClass1, this) == coroutine_suspended) {
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
    public CheesePublisherComponent$bind$2(i iVar, fu0.F f7, Continuation<? super CheesePublisherComponent$bind$2> continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$binding = f7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheesePublisherComponent$bind$2 cheesePublisherComponent$bind$2 = new CheesePublisherComponent$bind$2(this.this$0, this.$binding, continuation);
        cheesePublisherComponent$bind$2.L$0 = obj;
        return cheesePublisherComponent$bind$2;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$binding, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$binding, null), 3, (Object) null);
    }
}
