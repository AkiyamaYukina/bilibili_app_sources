package com.bilibili.ship.theseus.united.page.toolbar.actionview.home;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository;
import com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository;
import com.bilibili.ship.theseus.united.utils.UnitedDetailStackManager;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/home/ToolbarHomeRepository.class */
@StabilityInferred(parameters = 0)
public final class ToolbarHomeRepository extends yv0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Context f103322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ToolbarRepository f103323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ActivityColorRepository f103324g;

    @NotNull
    public final PageNestedScrollFusionRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.miniplayer.b f103325i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lifecycle f103326j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Garb f103327k = GarbManager.getCurGarb();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final String f103328l = "ToolbarHomeRepository";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final a f103329m;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.actionview.home.ToolbarHomeRepository$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/home/ToolbarHomeRepository$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ToolbarHomeRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.actionview.home.ToolbarHomeRepository$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/home/ToolbarHomeRepository$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final ToolbarHomeRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ToolbarHomeRepository toolbarHomeRepository, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = toolbarHomeRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
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
                this.this$0.f103329m.setVisibility(!this.Z$0 ? 0 : 8);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ToolbarHomeRepository toolbarHomeRepository, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = toolbarHomeRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ToolbarHomeRepository toolbarHomeRepository = this.this$0;
                StateFlow<Boolean> stateFlow = toolbarHomeRepository.f129911c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(toolbarHomeRepository, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.actionview.home.ToolbarHomeRepository$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/home/ToolbarHomeRepository$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ToolbarHomeRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.actionview.home.ToolbarHomeRepository$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/home/ToolbarHomeRepository$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final ToolbarHomeRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ToolbarHomeRepository toolbarHomeRepository, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = toolbarHomeRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                int color;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z6 = this.Z$0;
                ToolbarHomeRepository toolbarHomeRepository = this.this$0;
                a aVar = toolbarHomeRepository.f103329m;
                if (aVar.getVisibility() == 0) {
                    if (z6) {
                        ActivityColorRepository.a aVarG = toolbarHomeRepository.f103324g.g();
                        if (aVarG != null) {
                            color = aVarG.f99194a;
                        } else {
                            Garb garb = toolbarHomeRepository.f103327k;
                            color = (garb.isPure() || garb.isPrimaryOnly()) ? ContextCompat.getColor(toolbarHomeRepository.f103322e, R.color.white) : garb.getFontColor();
                        }
                    } else {
                        color = ContextCompat.getColor(toolbarHomeRepository.f103322e, R.color.white);
                    }
                    aVar.getBinding().f116753b.setImageTintList(ColorStateList.valueOf(color));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ToolbarHomeRepository toolbarHomeRepository, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = toolbarHomeRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ToolbarHomeRepository toolbarHomeRepository = this.this$0;
                StateFlow<Boolean> stateFlow = toolbarHomeRepository.h.f102266r;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(toolbarHomeRepository, null);
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

    @Inject
    public ToolbarHomeRepository(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull ToolbarRepository toolbarRepository, @NotNull ActivityColorRepository activityColorRepository, @NotNull PageNestedScrollFusionRepository pageNestedScrollFusionRepository, @NotNull com.bilibili.ship.theseus.united.page.miniplayer.b bVar, @NotNull Lifecycle lifecycle) {
        this.f103321d = coroutineScope;
        this.f103322e = context;
        this.f103323f = toolbarRepository;
        this.f103324g = activityColorRepository;
        this.h = pageNestedScrollFusionRepository;
        this.f103325i = bVar;
        this.f103326j = lifecycle;
        a aVar = new a(context, 0);
        this.f103329m = aVar;
        aVar.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.ship.theseus.united.page.toolbar.actionview.home.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ToolbarHomeRepository f103331a;

            {
                this.f103331a = this;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws NoWhenBranchMatchedException {
                ToolbarHomeRepository toolbarHomeRepository = this.f103331a;
                toolbarHomeRepository.f103325i.a(toolbarHomeRepository.f103328l);
                BuildersKt.launch$default(toolbarHomeRepository.f103321d, (CoroutineContext) null, (CoroutineStart) null, new ToolbarHomeRepository$1$1(toolbarHomeRepository, null), 3, (Object) null);
                BLog.i("HomeViewRepository", "onClick back home");
                ArrayDeque<Integer> arrayDeque = UnitedDetailStackManager.f104843a;
                if (UnitedDetailStackManager.a.f104844a[UnitedDetailStackManager.StackElementType.UNITED_VIDEO.ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                UnitedDetailStackManager.f104843a.clear();
                BLRouter.routeTo(new RouteRequest.Builder("bilibili://root?tab_name=%E9%A6%96%E9%A1%B5").build(), toolbarHomeRepository.f103322e);
            }
        });
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }
}
