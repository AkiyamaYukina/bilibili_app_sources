package com.bilibili.ship.theseus.united.page.intro.module.owner;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.A;
import androidx.window.core.layout.WindowSizeClass;
import com.bapis.bilibili.dagw.component.avatar.v1.LayerTagConfig;
import com.bilibili.ad.composecomponent.feedbackpanel.D;
import com.bilibili.app.comm.vipconfig.VipThemeConfigManager;
import com.bilibili.app.comm.vipconfig.VipThemeInfo;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.ctc.common.avatar.plugin.theme.ThemeStrategyInDarkMode;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.accountinfo.model.VipUserInfo;
import com.bilibili.lib.avatar.layers.LayerAvatarView;
import com.bilibili.lib.avatar.layers.model.layers.ConfigKey;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playerbizcommonv2.guideBubble.BiliGuideBubble;
import com.bilibili.relation.widget.FollowButton;
import com.bilibili.relation.widget.FollowButtonConfig;
import com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerService;
import com.bilibili.ship.theseus.united.page.view.d;
import dv0.Z;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.bili.widget.PriorityLinearLayout;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.utils.DpUtils;
import wg0.C8883a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerComponent$bind$2.class */
public final class OwnerComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
    final Z $binding;
    private Object L$0;
    int label;
    final OwnerComponent this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Z $binding;
        final ConstraintLayout $root;
        int label;
        final OwnerComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent$bind$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerComponent$bind$2$1$1.class */
        public static final class C10221 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final Z $binding;
            final ConstraintLayout $root;
            int I$0;
            int label;
            final OwnerComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10221(ConstraintLayout constraintLayout, OwnerComponent ownerComponent, Z z6, Continuation<? super C10221> continuation) {
                super(2, continuation);
                this.$root = constraintLayout;
                this.this$0 = ownerComponent;
                this.$binding = z6;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C10221 c10221 = new C10221(this.$root, this.this$0, this.$binding, continuation);
                c10221.I$0 = ((Number) obj).intValue();
                return c10221;
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
                int iDpToPx = DimenUtilsKt.dpToPx(this.I$0 - 12);
                ConstraintLayout constraintLayout = this.$root;
                constraintLayout.setPadding(iDpToPx, constraintLayout.getPaddingTop(), iDpToPx, this.$root.getPaddingBottom());
                OwnerComponent.f(this.$binding, this.this$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OwnerComponent ownerComponent, ConstraintLayout constraintLayout, Z z6, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ownerComponent;
            this.$root = constraintLayout;
            this.$binding = z6;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$root, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OwnerComponent ownerComponent = this.this$0;
                StateFlow<Integer> stateFlow = ownerComponent.f100598b;
                C10221 c10221 = new C10221(this.$root, ownerComponent, this.$binding, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c10221, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Z $binding;
        int label;
        final OwnerComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent$bind$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerComponent$bind$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            final Z $binding;
            int label;
            final OwnerComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(OwnerComponent ownerComponent, Z z6, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ownerComponent;
                this.$binding = z6;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$binding, continuation);
            }

            public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
                return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.this$0.f100599c.i() || this.this$0.f100599c.f()) {
                    Z z6 = this.$binding;
                    PriorityLinearLayout priorityLinearLayout = z6.f116876f;
                    ViewGroup.LayoutParams layoutParams = priorityLinearLayout.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    layoutParams2.rightToLeft = z6.f116878i.getId();
                    priorityLinearLayout.setLayoutParams(layoutParams2);
                    Z z7 = this.$binding;
                    PriorityLinearLayout priorityLinearLayout2 = z7.f116881l;
                    ViewGroup.LayoutParams layoutParams3 = priorityLinearLayout2.getLayoutParams();
                    if (layoutParams3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                    layoutParams4.rightToLeft = z7.f116878i.getId();
                    priorityLinearLayout2.setLayoutParams(layoutParams4);
                    ComposeView composeView = this.$binding.f116878i;
                    ViewGroup.LayoutParams layoutParams5 = composeView.getLayoutParams();
                    if (layoutParams5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                    layoutParams6.leftToRight = -1;
                    composeView.setLayoutParams(layoutParams6);
                    FollowButton followButton = this.$binding.f116880k;
                    ViewGroup.LayoutParams layoutParams7 = followButton.getLayoutParams();
                    if (layoutParams7 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
                    layoutParams8.leftToRight = -1;
                    layoutParams8.rightToRight = 0;
                    followButton.setLayoutParams(layoutParams8);
                } else {
                    PriorityLinearLayout priorityLinearLayout3 = this.$binding.f116876f;
                    ViewGroup.LayoutParams layoutParams9 = priorityLinearLayout3.getLayoutParams();
                    if (layoutParams9 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.LayoutParams layoutParams10 = (ConstraintLayout.LayoutParams) layoutParams9;
                    layoutParams10.rightToLeft = -1;
                    priorityLinearLayout3.setLayoutParams(layoutParams10);
                    PriorityLinearLayout priorityLinearLayout4 = this.$binding.f116881l;
                    ViewGroup.LayoutParams layoutParams11 = priorityLinearLayout4.getLayoutParams();
                    if (layoutParams11 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.LayoutParams layoutParams12 = (ConstraintLayout.LayoutParams) layoutParams11;
                    layoutParams12.rightToLeft = -1;
                    priorityLinearLayout4.setLayoutParams(layoutParams12);
                    Z z8 = this.$binding;
                    ComposeView composeView2 = z8.f116878i;
                    ViewGroup.LayoutParams layoutParams13 = composeView2.getLayoutParams();
                    if (layoutParams13 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.LayoutParams layoutParams14 = (ConstraintLayout.LayoutParams) layoutParams13;
                    layoutParams14.leftToRight = z8.f116874d.getId();
                    composeView2.setLayoutParams(layoutParams14);
                    Z z9 = this.$binding;
                    FollowButton followButton2 = z9.f116880k;
                    ViewGroup.LayoutParams layoutParams15 = followButton2.getLayoutParams();
                    if (layoutParams15 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.LayoutParams layoutParams16 = (ConstraintLayout.LayoutParams) layoutParams15;
                    layoutParams16.leftToRight = z9.f116878i.getId();
                    layoutParams16.rightToRight = -1;
                    followButton2.setLayoutParams(layoutParams16);
                }
                OwnerComponent.f(this.$binding, this.this$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OwnerComponent ownerComponent, Z z6, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ownerComponent;
            this.$binding = z6;
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
                OwnerComponent ownerComponent = this.this$0;
                StateFlow<WindowSizeClass> stateFlow = ownerComponent.f100599c.f102939c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ownerComponent, this.$binding, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent$bind$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerComponent$bind$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Z $binding;
        int label;
        final OwnerComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent$bind$2$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerComponent$bind$2$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Z f100604a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final OwnerComponent f100605b;

            public a(Z z6, OwnerComponent ownerComponent) {
                this.f100604a = z6;
                this.f100605b = ownerComponent;
            }

            public final Object emit(Object obj, Continuation continuation) {
                OwnerComponent$bind$2.invokeSuspend$loadCharge(this.f100604a, this.f100605b);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(OwnerComponent ownerComponent, Z z6, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = ownerComponent;
            this.$binding = z6;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OwnerComponent ownerComponent = this.this$0;
                MutableSharedFlow<Unit> mutableSharedFlow = ownerComponent.f100600d;
                a aVar = new a(this.$binding, ownerComponent);
                this.label = 1;
                if (mutableSharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerComponent$bind$2$a.class */
    public static final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OwnerComponent f100606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Z f100607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f100608c;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent$bind$2$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerComponent$bind$2$a$a.class */
        public static final class C1023a implements BiliGuideBubble.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OwnerComponent f100609a;

            public C1023a(OwnerComponent ownerComponent) {
                this.f100609a = ownerComponent;
            }

            @Override // com.bilibili.playerbizcommonv2.guideBubble.BiliGuideBubble.a
            public final void onClick() {
                BiliGuideBubble biliGuideBubble;
                OwnerComponent ownerComponent = this.f100609a;
                BiliGuideBubble biliGuideBubble2 = ownerComponent.h;
                if (biliGuideBubble2 == null || !biliGuideBubble2.isShowing() || (biliGuideBubble = ownerComponent.h) == null) {
                    return;
                }
                biliGuideBubble.dismiss();
            }
        }

        public a(OwnerComponent ownerComponent, Z z6, Context context) {
            this.f100606a = ownerComponent;
            this.f100607b = z6;
            this.f100608c = context;
        }

        @Override // com.bilibili.ship.theseus.united.page.intro.module.owner.f
        public final void a() {
            OwnerComponent ownerComponent = this.f100606a;
            FollowButtonConfig followButtonConfigC = ownerComponent.f100597a.c();
            Z z6 = this.f100607b;
            FollowButton followButton = z6.f116880k;
            boolean zIsAttention = followButtonConfigC.isAttention();
            Boolean boolIsGuestAttention = followButtonConfigC.isGuestAttention();
            followButton.updateUI(zIsAttention, boolIsGuestAttention != null ? boolIsGuestAttention.booleanValue() : false);
            OwnerComponent.g(ownerComponent, z6.f116882m, followButtonConfigC.isAttention(), ownerComponent.f100597a.d());
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x00a2  */
        @Override // com.bilibili.ship.theseus.united.page.intro.module.owner.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b() {
            /*
                Method dump skipped, instruction units count: 232
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent$bind$2.a.b():void");
        }

        @Override // com.bilibili.ship.theseus.united.page.intro.module.owner.f
        public final void c() {
            OwnerComponent ownerComponent = this.f100606a;
            if (ownerComponent.f100597a.f()) {
                OwnerService.b bVar = ownerComponent.f100597a;
                boolean zH = bVar.h();
                Z z6 = this.f100607b;
                if (zH) {
                    ownerComponent.f100600d.tryEmit(Unit.INSTANCE);
                    bVar.f100643f.element = false;
                    z6.f116878i.setAlpha(0.0f);
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(z6.f116878i, "alpha", 0.0f, 1.0f);
                    objectAnimatorOfFloat.setDuration(300L);
                    objectAnimatorOfFloat.start();
                } else if (z6.f116878i.getAlpha() != 1.0f) {
                    z6.f116878i.setAlpha(1.0f);
                }
                z6.f116878i.setVisibility(0);
                OwnerComponent.f(z6, ownerComponent);
            }
        }

        @Override // com.bilibili.ship.theseus.united.page.intro.module.owner.f
        public final com.bilibili.playerbizcommonv2.guideBubble.h d(String str) {
            OwnerComponent ownerComponent = this.f100606a;
            C1023a c1023a = new C1023a(ownerComponent);
            Z z6 = this.f100607b;
            BiliGuideBubble biliGuideBubble = new BiliGuideBubble(str, z6.f116880k, true, true, BiliGuideBubble.ArrowPosition.RightAndBottom, 29, Cj0.a.a(this.f100608c), this.f100608c, null, 0, null, 0, 0, 32256);
            biliGuideBubble.f81747n = c1023a;
            biliGuideBubble.f81755v = 2;
            ownerComponent.h = biliGuideBubble;
            z6.f116880k.getGlobalVisibleRect(new Rect());
            return new com.bilibili.playerbizcommonv2.guideBubble.h(biliGuideBubble, -(biliGuideBubble.getContentView().getMeasuredWidth() - NewPlayerUtilsKt.toPx(72)), -((int) (DpUtils.dp2px(this.f100608c, 46.0f) + r0.height())));
        }

        @Override // com.bilibili.ship.theseus.united.page.intro.module.owner.f
        public final boolean e() {
            Rect rect = new Rect();
            boolean z6 = true;
            if (!this.f100607b.f116871a.getLocalVisibleRect(rect)) {
                return true;
            }
            if (rect.top <= NewPlayerUtilsKt.toPx(10)) {
                z6 = false;
            }
            return z6;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerComponent$bind$2$b.class */
    public static final class b implements s10.f<eX.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OwnerComponent f100610a;

        public b(OwnerComponent ownerComponent) {
            this.f100610a = ownerComponent;
        }

        public final ConfigKey a() {
            return ConfigKey.DarkModeAssociate;
        }

        public final s10.d c(LayerTagConfig layerTagConfig, com.bilibili.lib.avatar.layers.a aVar) {
            return new eX.a(aVar, layerTagConfig, this.f100610a.f100597a.e() ? ThemeStrategyInDarkMode.ForceDay : ThemeStrategyInDarkMode.FollowApp);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OwnerComponent$bind$2(Z z6, OwnerComponent ownerComponent, Continuation<? super OwnerComponent$bind$2> continuation) {
        super(2, continuation);
        this.$binding = z6;
        this.this$0 = ownerComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$10(OwnerComponent ownerComponent, View view) {
        ownerComponent.f100597a.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$11(OwnerComponent ownerComponent, View view) {
        ownerComponent.f100597a.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$6(OwnerComponent ownerComponent, View view) {
        ownerComponent.f100597a.f100639b.f100625p.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$7(OwnerComponent ownerComponent, View view) {
        ownerComponent.f100597a.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$8(OwnerComponent ownerComponent, View view) {
        ownerComponent.f100597a.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$9(OwnerComponent ownerComponent, View view) {
        ownerComponent.f100597a.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$loadCharge(Z z6, final OwnerComponent ownerComponent) {
        z6.f116878i.setContent(ComposableLambdaKt.composableLambdaInstance(-1840657695, true, new Function2(ownerComponent) { // from class: com.bilibili.ship.theseus.united.page.intro.module.owner.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OwnerComponent f100659a;

            {
                this.f100659a = ownerComponent;
            }

            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Integer) obj2).intValue();
                return OwnerComponent$bind$2.invokeSuspend$loadCharge$lambda$0(this.f100659a, (Composer) obj, iIntValue);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit invokeSuspend$loadCharge$lambda$0(final OwnerComponent ownerComponent, Composer composer, int i7) {
        if (composer.shouldExecute((i7 & 3) != 2, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1840657695, i7, -1, "com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent.bind.<anonymous>.loadCharge.<anonymous> (OwnerComponent.kt:172)");
            }
            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-230537063, true, new Function2(ownerComponent) { // from class: com.bilibili.ship.theseus.united.page.intro.module.owner.n

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final OwnerComponent f100666a;

                {
                    this.f100666a = ownerComponent;
                }

                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return OwnerComponent$bind$2.invokeSuspend$loadCharge$lambda$0$0(this.f100666a, (Composer) obj, iIntValue);
                }
            }, composer, 54), composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021d  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit invokeSuspend$loadCharge$lambda$0$0(final com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent r9, androidx.compose.runtime.Composer r10, int r11) {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent$bind$2.invokeSuspend$loadCharge$lambda$0$0(com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit invokeSuspend$loadCharge$lambda$0$0$0(com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent r14, androidx.compose.runtime.Composer r15, int r16) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent$bind$2.invokeSuspend$loadCharge$lambda$0$0$0(com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit invokeSuspend$loadCharge$lambda$0$0$3$0(com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent r5) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent$bind$2.invokeSuspend$loadCharge$lambda$0$0$3$0(com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerComponent):kotlin.Unit");
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OwnerComponent$bind$2 ownerComponent$bind$2 = new OwnerComponent$bind$2(this.$binding, this.this$0, continuation);
        ownerComponent$bind$2.L$0 = obj;
        return ownerComponent$bind$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        BiliGuideBubble biliGuideBubble;
        int color;
        VipUserInfo vipUserInfo;
        String userNameColor;
        VipUserInfo vipUserInfo2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                ConstraintLayout constraintLayout = this.$binding.f116871a;
                Context context = constraintLayout.getContext();
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, constraintLayout, this.$binding, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$binding, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$binding, null), 3, (Object) null);
                d.a aVar = (d.a) this.this$0.f100597a.f100639b.f100612b.f104057d.getValue();
                o10.a aVar2 = aVar != null ? aVar.f104059b : null;
                if (aVar2 != null) {
                    Z z6 = this.$binding;
                    OwnerComponent ownerComponent = this.this$0;
                    LayerAvatarView layerAvatarView = z6.h;
                    s10.i iVar = new s10.i(ConfigKey.LiveAnimaKey);
                    ownerComponent.f100597a.e();
                    ThemeStrategy themeStrategy = ThemeStrategy.FollowApp;
                    layerAvatarView.show(aVar2, MapsKt.mapOf(new Pair[]{TuplesKt.to(iVar, new Object()), TuplesKt.to(new s10.i(ConfigKey.DarkModeOverride), new b(ownerComponent))}));
                }
                this.$binding.f116877g.setText(this.this$0.f100597a.g());
                this.$binding.f116873c.setText(this.this$0.f100597a.j());
                d.a aVar3 = (d.a) this.this$0.f100597a.f100639b.f100612b.f104057d.getValue();
                String str = aVar3 != null ? aVar3.f104074r : null;
                if (str == null || str.length() == 0) {
                    this.$binding.f116883n.setVisibility(8);
                    this.$binding.f116879j.setText(this.this$0.f100597a.b());
                    this.$binding.f116879j.setVisibility(0);
                    this.$binding.f116872b.setText(this.this$0.f100597a.a());
                } else {
                    this.$binding.f116883n.setText(str);
                    this.$binding.f116883n.setVisibility(0);
                    this.$binding.f116879j.setVisibility(8);
                    this.$binding.f116872b.setText(this.this$0.f100597a.b());
                }
                if (this.this$0.f100597a.f100639b.f100612b.e() != null) {
                    LayerAvatarView layerAvatarView2 = this.$binding.h;
                    ViewGroup.LayoutParams layoutParams = layerAvatarView2.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.leftMargin = Uj0.c.b(10, context);
                    layerAvatarView2.setLayoutParams(marginLayoutParams);
                    PriorityLinearLayout priorityLinearLayout = this.$binding.f116876f;
                    ViewGroup.LayoutParams layoutParams2 = priorityLinearLayout.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.leftMargin = Uj0.c.b(2, context);
                    priorityLinearLayout.setLayoutParams(marginLayoutParams2);
                } else {
                    LayerAvatarView layerAvatarView3 = this.$binding.h;
                    ViewGroup.LayoutParams layoutParams3 = layerAvatarView3.getLayoutParams();
                    if (layoutParams3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams3.leftMargin = 0;
                    layerAvatarView3.setLayoutParams(marginLayoutParams3);
                    PriorityLinearLayout priorityLinearLayout2 = this.$binding.f116876f;
                    ViewGroup.LayoutParams layoutParams4 = priorityLinearLayout2.getLayoutParams();
                    if (layoutParams4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                    marginLayoutParams4.leftMargin = 0;
                    priorityLinearLayout2.setLayoutParams(marginLayoutParams4);
                }
                LayerAvatarView layerAvatarView4 = this.$binding.h;
                final OwnerComponent ownerComponent2 = this.this$0;
                layerAvatarView4.setOnClickListener(new View.OnClickListener(ownerComponent2) { // from class: com.bilibili.ship.theseus.united.page.intro.module.owner.h

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final OwnerComponent f100660a;

                    {
                        this.f100660a = ownerComponent2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OwnerComponent$bind$2.invokeSuspend$lambda$6(this.f100660a, view);
                    }
                });
                PriorityLinearLayout priorityLinearLayout3 = this.$binding.f116876f;
                final OwnerComponent ownerComponent3 = this.this$0;
                priorityLinearLayout3.setOnClickListener(new View.OnClickListener(ownerComponent3) { // from class: com.bilibili.ship.theseus.united.page.intro.module.owner.i

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final OwnerComponent f100661a;

                    {
                        this.f100661a = ownerComponent3;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OwnerComponent$bind$2.invokeSuspend$lambda$7(this.f100661a, view);
                    }
                });
                TextView textView = this.$binding.f116879j;
                final OwnerComponent ownerComponent4 = this.this$0;
                textView.setOnClickListener(new View.OnClickListener(ownerComponent4) { // from class: com.bilibili.ship.theseus.united.page.intro.module.owner.j

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final OwnerComponent f100662a;

                    {
                        this.f100662a = ownerComponent4;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OwnerComponent$bind$2.invokeSuspend$lambda$8(this.f100662a, view);
                    }
                });
                TextView textView2 = this.$binding.f116883n;
                final OwnerComponent ownerComponent5 = this.this$0;
                textView2.setOnClickListener(new View.OnClickListener(ownerComponent5) { // from class: com.bilibili.ship.theseus.united.page.intro.module.owner.k

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final OwnerComponent f100663a;

                    {
                        this.f100663a = ownerComponent5;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OwnerComponent$bind$2.invokeSuspend$lambda$9(this.f100663a, view);
                    }
                });
                TextView textView3 = this.$binding.f116872b;
                final OwnerComponent ownerComponent6 = this.this$0;
                textView3.setOnClickListener(new View.OnClickListener(ownerComponent6) { // from class: com.bilibili.ship.theseus.united.page.intro.module.owner.l

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final OwnerComponent f100664a;

                    {
                        this.f100664a = ownerComponent6;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OwnerComponent$bind$2.invokeSuspend$lambda$10(this.f100664a, view);
                    }
                });
                TextView textView4 = this.$binding.f116873c;
                final OwnerComponent ownerComponent7 = this.this$0;
                textView4.setOnClickListener(new View.OnClickListener(ownerComponent7) { // from class: com.bilibili.ship.theseus.united.page.intro.module.owner.m

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final OwnerComponent f100665a;

                    {
                        this.f100665a = ownerComponent7;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OwnerComponent$bind$2.invokeSuspend$lambda$11(this.f100665a, view);
                    }
                });
                if (this.this$0.f100597a.f100639b.d()) {
                    this.$binding.f116880k.setVisibility(8);
                } else {
                    FollowButtonConfig followButtonConfigC = this.this$0.f100597a.c();
                    this.$binding.f116880k.bind(followButtonConfigC);
                    this.$binding.f116880k.setVisibility(0);
                    OwnerComponent.g(this.this$0, this.$binding.f116882m, followButtonConfigC.isAttention(), this.this$0.f100597a.d());
                }
                if (!this.this$0.f100597a.f() || this.this$0.f100597a.h()) {
                    this.$binding.f116878i.setVisibility(8);
                } else {
                    this.this$0.f100600d.tryEmit(Unit.INSTANCE);
                    if (this.$binding.f116878i.getAlpha() != 1.0f) {
                        this.$binding.f116878i.setAlpha(1.0f);
                    }
                    this.$binding.f116878i.setVisibility(0);
                }
                OwnerComponent.f(this.$binding, this.this$0);
                OwnerComponent ownerComponent8 = this.this$0;
                OwnerService.b bVar = ownerComponent8.f100597a;
                Z z7 = this.$binding;
                bVar.f100638a.element = new a(ownerComponent8, z7, context);
                ownerComponent8.getClass();
                TextView textView5 = z7.f116877g;
                OwnerService.b bVar2 = ownerComponent8.f100597a;
                Integer numH = bVar2.f100639b.f100618i.h();
                OwnerService ownerService = bVar2.f100639b;
                ConstraintLayout constraintLayout2 = z7.f116871a;
                if (numH != null) {
                    color = numH.intValue();
                } else {
                    Context context2 = constraintLayout2.getContext();
                    d.a aVar4 = (d.a) ownerService.f100612b.f104057d.getValue();
                    color = ContextCompat.getColor(context2, (aVar4 == null || (vipUserInfo = aVar4.f104069m) == null) ? false : vipUserInfo.isEffectiveVip() ? R$color.Pi5_u : 2131103296);
                }
                textView5.setTextColor(color);
                if (!bVar2.e()) {
                    TextView textView6 = z7.f116877g;
                    String strG = bVar2.g();
                    Context context3 = constraintLayout2.getContext();
                    d.a aVar5 = (d.a) ownerService.f100612b.f104056c.getValue();
                    textView6.setText(C8883a.a(strG, context3, aVar5 != null ? aVar5.f104073q : null, new D(z7, 1)));
                }
                Integer numE = ownerService.f100618i.e();
                int iIntValue = numE != null ? numE.intValue() : ContextCompat.getColor(constraintLayout2.getContext(), R$color.Ga5);
                z7.f116879j.setTextColor(iIntValue);
                z7.f116872b.setTextColor(iIntValue);
                z7.f116873c.setTextColor(iIntValue);
                Integer numA = ownerService.f100618i.a();
                Integer numE2 = ownerService.f100618i.e();
                Integer numC = ownerService.f100618i.c();
                Integer numF = ownerService.f100618i.f();
                FollowButton followButton = z7.f116880k;
                if (numA == null || numE2 == null || numC == null || numF == null) {
                    followButton.setCustomStyle(-1, -1, (Drawable) null, (Drawable) null);
                } else {
                    followButton.setCustomStyle(numE2.intValue(), numA.intValue(), numF.intValue(), numC.intValue());
                }
                OwnerService ownerService2 = this.this$0.f100597a.f100639b;
                if (!ownerService2.f100618i.f99182c) {
                    d.a aVar6 = (d.a) ownerService2.f100612b.f104056c.getValue();
                    VipUserInfo.VipLabel label = (aVar6 == null || (vipUserInfo2 = aVar6.f104069m) == null) ? null : vipUserInfo2.getLabel();
                    TextView textView7 = this.$binding.f116877g;
                    VipThemeInfo.VipThemeDetailInfo vipDetailInfoWithDayNight = VipThemeConfigManager.getVipDetailInfoWithDayNight(context, (VipThemeConfigManager.a) null, Cj0.a.a(context), label != null ? label.getLabelTheme() : null);
                    VipThemeInfo.VipThemeDetailInfo vipThemeDetailInfo = vipDetailInfoWithDayNight;
                    if (vipDetailInfoWithDayNight == null) {
                        vipThemeDetailInfo = new VipThemeInfo.VipThemeDetailInfo();
                    }
                    vipThemeDetailInfo.checkDetailInfo();
                    VipThemeInfo.VipUserNameConfig userNameConfig = vipThemeDetailInfo.getUserNameConfig();
                    Integer numB = (userNameConfig == null || (userNameColor = userNameConfig.getUserNameColor()) == null) ? null : Uj0.a.b(userNameColor);
                    if (numB != null) {
                        textView7.setTextColor(numB.intValue());
                    }
                }
                ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(this.$binding.h, this.this$0.f100601e);
                AX.g.a(this.$binding.f116876f, (str == null || str.length() == 0) ? A.a(this.this$0.f100597a.a(), "，", this.this$0.f100597a.j(), "，点击进入空间页", G0.b.a("up主", this.this$0.f100597a.g(), "，", this.this$0.f100597a.b(), "，")) : A.a(this.this$0.f100597a.b(), "，", this.this$0.f100597a.j(), "，点击进入空间页", G0.b.a("up主", this.this$0.f100597a.g(), "，", str, "，")));
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
            this.this$0.f100597a.f100638a.element = null;
            HandlerThreads.getHandler(0).removeCallbacks(this.this$0.f100603g);
            PopupWindow popupWindow = this.this$0.f100602f;
            if (popupWindow != null) {
                try {
                    if (popupWindow.isShowing()) {
                        OwnerComponent.d(popupWindow);
                    }
                } catch (Exception e7) {
                }
            }
            OwnerComponent ownerComponent9 = this.this$0;
            BiliGuideBubble biliGuideBubble2 = ownerComponent9.h;
            if (biliGuideBubble2 != null && biliGuideBubble2.isShowing() && (biliGuideBubble = ownerComponent9.h) != null) {
                biliGuideBubble.dismiss();
            }
            throw th;
        }
    }
}
