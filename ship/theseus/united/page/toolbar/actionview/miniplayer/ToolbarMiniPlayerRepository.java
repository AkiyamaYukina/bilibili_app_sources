package com.bilibili.ship.theseus.united.page.toolbar.actionview.miniplayer;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import ar.h;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository;
import com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository;
import javax.inject.Inject;
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
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/miniplayer/ToolbarMiniPlayerRepository.class */
@StabilityInferred(parameters = 0)
public final class ToolbarMiniPlayerRepository extends yv0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Context f103333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ToolbarRepository f103334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ActivityColorRepository f103335g;

    @NotNull
    public final PageNestedScrollFusionRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Garb f103336i = GarbManager.getCurGarb();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f103337j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f103338k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final a f103339l;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.actionview.miniplayer.ToolbarMiniPlayerRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/miniplayer/ToolbarMiniPlayerRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ToolbarMiniPlayerRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.actionview.miniplayer.ToolbarMiniPlayerRepository$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/miniplayer/ToolbarMiniPlayerRepository$1$1.class */
        public static final class C11381 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final ToolbarMiniPlayerRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11381(ToolbarMiniPlayerRepository toolbarMiniPlayerRepository, Continuation<? super C11381> continuation) {
                super(2, continuation);
                this.this$0 = toolbarMiniPlayerRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C11381 c11381 = new C11381(this.this$0, continuation);
                c11381.Z$0 = ((Boolean) obj).booleanValue();
                return c11381;
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
                this.this$0.f103339l.setVisibility(!this.Z$0 ? 0 : 8);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ToolbarMiniPlayerRepository toolbarMiniPlayerRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = toolbarMiniPlayerRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ToolbarMiniPlayerRepository toolbarMiniPlayerRepository = this.this$0;
                StateFlow<Boolean> stateFlow = toolbarMiniPlayerRepository.f129911c;
                C11381 c11381 = new C11381(toolbarMiniPlayerRepository, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c11381, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.actionview.miniplayer.ToolbarMiniPlayerRepository$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/miniplayer/ToolbarMiniPlayerRepository$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ToolbarMiniPlayerRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.actionview.miniplayer.ToolbarMiniPlayerRepository$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/miniplayer/ToolbarMiniPlayerRepository$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final ToolbarMiniPlayerRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ToolbarMiniPlayerRepository toolbarMiniPlayerRepository, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = toolbarMiniPlayerRepository;
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
                ToolbarMiniPlayerRepository toolbarMiniPlayerRepository = this.this$0;
                a aVar = toolbarMiniPlayerRepository.f103339l;
                if (aVar.getVisibility() == 0) {
                    if (z6) {
                        ActivityColorRepository.a aVarG = toolbarMiniPlayerRepository.f103335g.g();
                        if (aVarG != null) {
                            color = aVarG.f99194a;
                        } else {
                            Garb garb = toolbarMiniPlayerRepository.f103336i;
                            color = (garb.isPure() || garb.isPrimaryOnly()) ? ContextCompat.getColor(toolbarMiniPlayerRepository.f103333e, R.color.white) : garb.getFontColor();
                        }
                    } else {
                        color = ContextCompat.getColor(toolbarMiniPlayerRepository.f103333e, R.color.white);
                    }
                    aVar.getBinding().f116757b.setImageTintList(ColorStateList.valueOf(color));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ToolbarMiniPlayerRepository toolbarMiniPlayerRepository, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = toolbarMiniPlayerRepository;
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
                ToolbarMiniPlayerRepository toolbarMiniPlayerRepository = this.this$0;
                StateFlow<Boolean> stateFlow = toolbarMiniPlayerRepository.h.f102266r;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(toolbarMiniPlayerRepository, null);
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
    public ToolbarMiniPlayerRepository(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull ToolbarRepository toolbarRepository, @NotNull ActivityColorRepository activityColorRepository, @NotNull PageNestedScrollFusionRepository pageNestedScrollFusionRepository) {
        this.f103332d = coroutineScope;
        this.f103333e = context;
        this.f103334f = toolbarRepository;
        this.f103335g = activityColorRepository;
        this.h = pageNestedScrollFusionRepository;
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_LATEST, 1, (Object) null);
        this.f103337j = mutableSharedFlowMutableSharedFlow$default;
        this.f103338k = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        a aVar = new a(context);
        this.f103339l = aVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        aVar.setOnClickListener(new h(this, 1));
    }

    @Nullable
    public final Object c(@NotNull Continuation<? super Unit> continuation) {
        Object objE = this.f103334f.e(CollectionsKt.listOf(this.f103339l), (SuspendLambda) continuation);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : Unit.INSTANCE;
    }
}
