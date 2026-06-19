package com.bilibili.ship.theseus.united.page.toolbar.actionview.projection;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.i;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.projection.internal.api.model.ProjectionRedDotSubmitResponse;
import com.bilibili.lib.projection.internal.widget.e;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository;
import com.bilibili.ship.theseus.united.page.toolbar.C6418b;
import com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository;
import com.bilibili.ship.theseus.united.utils.q;
import java.util.HashSet;
import java.util.Iterator;
import javax.inject.Inject;
import je0.InterfaceC7670k;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/projection/ToolbarCastScreenRepository.class */
@StabilityInferred(parameters = 0)
public final class ToolbarCastScreenRepository extends yv0.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f103341A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public e f103342B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public Job f103343C;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Context f103345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IReporterService f103346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ToolbarRepository f103347g;

    @NotNull
    public final ActivityColorRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final PageNestedScrollFusionRepository f103348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f103349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f103350k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final BusinessType f103351l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f103352m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final TheseusCastScreenRepository f103353n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.b f103354o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Garb f103355p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final HashSet<C6418b> f103356q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f103357r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f103358s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f103359t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f103360u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f103361v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f103362w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f103363x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<String> f103364y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<a> f103365z;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.ToolbarCastScreenRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/projection/ToolbarCastScreenRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ToolbarCastScreenRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.ToolbarCastScreenRepository$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/projection/ToolbarCastScreenRepository$1$1.class */
        public static final class C11391 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final ToolbarCastScreenRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11391(ToolbarCastScreenRepository toolbarCastScreenRepository, Continuation<? super C11391> continuation) {
                super(2, continuation);
                this.this$0 = toolbarCastScreenRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C11391 c11391 = new C11391(this.this$0, continuation);
                c11391.Z$0 = ((Boolean) obj).booleanValue();
                return c11391;
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
                ToolbarCastScreenRepository toolbarCastScreenRepository = this.this$0;
                com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.b bVar = toolbarCastScreenRepository.f103354o;
                int i7 = 0;
                if (z6 || !toolbarCastScreenRepository.f103352m.getCloudConfig().M()) {
                    i7 = 8;
                }
                bVar.setVisibility(i7);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ToolbarCastScreenRepository toolbarCastScreenRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = toolbarCastScreenRepository;
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
                ToolbarCastScreenRepository toolbarCastScreenRepository = this.this$0;
                StateFlow<Boolean> stateFlow = toolbarCastScreenRepository.f129911c;
                C11391 c11391 = new C11391(toolbarCastScreenRepository, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c11391, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.ToolbarCastScreenRepository$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/projection/ToolbarCastScreenRepository$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ToolbarCastScreenRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.ToolbarCastScreenRepository$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/projection/ToolbarCastScreenRepository$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final ToolbarCastScreenRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ToolbarCastScreenRepository toolbarCastScreenRepository, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = toolbarCastScreenRepository;
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
                if (this.Z$0) {
                    ImageView imageView = this.this$0.f103354o.getBinding().f116747b;
                    imageView.setImageTintList(null);
                    imageView.setImageResource(2131233485);
                } else {
                    ImageView imageView2 = this.this$0.f103354o.getBinding().f116747b;
                    imageView2.setImageTintList(null);
                    imageView2.setImageResource(2131233484);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ToolbarCastScreenRepository toolbarCastScreenRepository, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = toolbarCastScreenRepository;
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
                ToolbarCastScreenRepository toolbarCastScreenRepository = this.this$0;
                StateFlow<Boolean> stateFlow = toolbarCastScreenRepository.f103358s;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(toolbarCastScreenRepository, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.ToolbarCastScreenRepository$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/projection/ToolbarCastScreenRepository$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ToolbarCastScreenRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.ToolbarCastScreenRepository$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/projection/ToolbarCastScreenRepository$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final ToolbarCastScreenRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ToolbarCastScreenRepository toolbarCastScreenRepository, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = toolbarCastScreenRepository;
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
                ToolbarCastScreenRepository toolbarCastScreenRepository = this.this$0;
                if (!((Boolean) toolbarCastScreenRepository.f103358s.getValue()).booleanValue()) {
                    com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.b bVar = toolbarCastScreenRepository.f103354o;
                    if (bVar.getVisibility() == 0) {
                        if (z6) {
                            ActivityColorRepository.a aVarG = toolbarCastScreenRepository.h.g();
                            if (aVarG != null) {
                                color = aVarG.f99194a;
                            } else {
                                Garb garb = toolbarCastScreenRepository.f103355p;
                                color = (garb.isPure() || garb.isPrimaryOnly()) ? ContextCompat.getColor(toolbarCastScreenRepository.f103345e, R.color.white) : garb.getFontColor();
                            }
                        } else {
                            color = ContextCompat.getColor(toolbarCastScreenRepository.f103345e, R.color.white);
                        }
                        bVar.getBinding().f116747b.setImageTintList(ColorStateList.valueOf(color));
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ToolbarCastScreenRepository toolbarCastScreenRepository, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = toolbarCastScreenRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ToolbarCastScreenRepository toolbarCastScreenRepository = this.this$0;
                StateFlow<Boolean> stateFlow = toolbarCastScreenRepository.f103348i.f102266r;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(toolbarCastScreenRepository, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.ToolbarCastScreenRepository$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/projection/ToolbarCastScreenRepository$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ToolbarCastScreenRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.ToolbarCastScreenRepository$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/projection/ToolbarCastScreenRepository$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final ToolbarCastScreenRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ToolbarCastScreenRepository toolbarCastScreenRepository, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = toolbarCastScreenRepository;
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
                this.this$0.f103354o.getBinding().f116748c.setVisibility(this.Z$0 ? 0 : 8);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(ToolbarCastScreenRepository toolbarCastScreenRepository, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = toolbarCastScreenRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ToolbarCastScreenRepository toolbarCastScreenRepository = this.this$0;
                StateFlow<Boolean> stateFlow = toolbarCastScreenRepository.f103363x;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(toolbarCastScreenRepository, null);
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/projection/ToolbarCastScreenRepository$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f103366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f103367b;

        public a(boolean z6, boolean z7) {
            this.f103366a = z6;
            this.f103367b = z7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f103366a == aVar.f103366a && this.f103367b == aVar.f103367b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f103367b) + (Boolean.hashCode(this.f103366a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ActShow(dotShown=");
            sb.append(this.f103366a);
            sb.append(", bubbleShown=");
            return i.a(sb, this.f103367b, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/projection/ToolbarCastScreenRepository$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f103368a;

        static {
            int[] iArr = new int[BusinessType.values().length];
            try {
                iArr[BusinessType.UGC.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BusinessType.OGV.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[BusinessType.CHEESE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f103368a = iArr;
        }
    }

    @Inject
    public ToolbarCastScreenRepository(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull IReporterService iReporterService, @NotNull ToolbarRepository toolbarRepository, @NotNull ActivityColorRepository activityColorRepository, @NotNull PageNestedScrollFusionRepository pageNestedScrollFusionRepository, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull BusinessType businessType, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull TheseusCastScreenRepository theseusCastScreenRepository) {
        this.f103344d = coroutineScope;
        this.f103345e = context;
        this.f103346f = iReporterService;
        this.f103347g = toolbarRepository;
        this.h = activityColorRepository;
        this.f103348i = pageNestedScrollFusionRepository;
        this.f103349j = cVar;
        this.f103350k = aVar;
        this.f103351l = businessType;
        this.f103352m = iPlayerSettingService;
        this.f103353n = theseusCastScreenRepository;
        com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.b bVar = new com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.b(context);
        this.f103354o = bVar;
        this.f103355p = GarbManager.getCurGarb();
        this.f103356q = new HashSet<>();
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.f103357r = MutableStateFlow;
        this.f103358s = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_LATEST, 1, (Object) null);
        this.f103359t = mutableSharedFlowMutableSharedFlow$default;
        this.f103360u = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.f103361v = StateFlowKt.MutableStateFlow(bool);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.f103362w = MutableStateFlow2;
        this.f103363x = FlowKt.asStateFlow(MutableStateFlow2);
        this.f103364y = StateFlowKt.MutableStateFlow("");
        this.f103365z = StateFlowKt.MutableStateFlow(new a(false, false));
        this.f103341A = StateFlowKt.MutableStateFlow(bool);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        bVar.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ToolbarCastScreenRepository f103378a;

            {
                this.f103378a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object next;
                ToolbarCastScreenRepository toolbarCastScreenRepository = this.f103378a;
                if (toolbarCastScreenRepository.f103356q.isEmpty()) {
                    toolbarCastScreenRepository.f103359t.tryEmit(Unit.INSTANCE);
                    b bVar2 = toolbarCastScreenRepository.f103354o;
                    if (bVar2.getBinding().f116748c.getVisibility() == 0) {
                        bVar2.getBinding().f116748c.setVisibility(8);
                        Lazy lazy = he0.e.f120842a;
                        if (he0.e.f120855o) {
                            BiliCall<GeneralResponse<ProjectionRedDotSubmitResponse>> biliCallProjectionRedDotSubmit = ((InterfaceC7670k) he0.e.f120851k.getValue()).projectionRedDotSubmit(he0.e.f120852l, (String) he0.e.f120853m.getValue());
                            he0.e.f120859s = biliCallProjectionRedDotSubmit;
                            if (biliCallProjectionRedDotSubmit != null) {
                                biliCallProjectionRedDotSubmit.enqueue(he0.e.f120863w);
                            }
                        }
                    }
                    toolbarCastScreenRepository.f103346f.report(new NeuronsEvents.NormalEvent("player.player.screencast.click.player", new String[]{"is_guide_reddot", toolbarCastScreenRepository.c().f103366a ? "1" : "0", "activity_id", (String) toolbarCastScreenRepository.f103364y.getValue(), "is_guide_toast", toolbarCastScreenRepository.c().f103367b ? "1" : "0", "is_new", Ie0.d.e(0) ? "1" : "0"}));
                    return;
                }
                Iterator it = CollectionsKt.reversed(toolbarCastScreenRepository.f103356q).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((C6418b) next).f103380a.length() > 0) {
                            break;
                        }
                    }
                }
                C6418b c6418b = (C6418b) next;
                String str = null;
                if (c6418b != null) {
                    str = c6418b.f103380a;
                }
                q.c(str);
            }
        });
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
        e eVar = new e(View.inflate(context, 2131496578, null), bVar.getBinding().f116747b, 1, 1);
        eVar.setFocusable(false);
        eVar.setOutsideTouchable(true);
        eVar.setTouchInterceptor(new View.OnTouchListener(this) { // from class: com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ToolbarCastScreenRepository f103379a;

            {
                this.f103379a = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                e eVar2;
                ToolbarCastScreenRepository toolbarCastScreenRepository = this.f103379a;
                e eVar3 = toolbarCastScreenRepository.f103342B;
                if (eVar3 != null && eVar3.isShowing() && (eVar2 = toolbarCastScreenRepository.f103342B) != null) {
                    eVar2.dismiss();
                }
                return view.performClick();
            }
        });
        this.f103342B = eVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ToolbarCastScreenRepository$special$$inlined$awaitCancel$1(null, this), 3, (Object) null);
    }

    @NotNull
    public final a c() {
        return (a) this.f103365z.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String d() {
        /*
            r2 = this;
            r0 = r2
            tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService r0 = r0.f103352m
            Oi1.d r0 = r0.getCloudConfig()
            com.bilibili.lib.media.resource.PlayConfig r0 = r0.b
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L19
            r0 = r3
            com.bilibili.lib.media.resource.PlayConfig$PlayMenuConfig r0 = r0.c
            r3 = r0
            goto L1b
        L19:
            r0 = 0
            r3 = r0
        L1b:
            r0 = r3
            if (r0 == 0) goto L33
            r0 = r3
            com.bilibili.lib.media.resource.PlayConfig$PlayMenuConfig$ExtraContent r0 = r0.c
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L33
            r0 = r3
            java.lang.String r0 = r0.a
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L36
        L33:
            java.lang.String r0 = ""
            r3 = r0
        L36:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.ToolbarCastScreenRepository.d():java.lang.String");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public final String e() throws NoWhenBranchMatchedException {
        String str;
        int i7 = b.f103368a[this.f103351l.ordinal()];
        if (i7 == 1) {
            str = "1";
        } else if (i7 == 2) {
            str = "2";
        } else {
            if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "3";
        }
        return str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.compare((r12 == null || (r0 = r12.c) == null) ? -1 : r0.b, 0) < 1) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(@org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.castscreen.CastScreenSuppressionService.a r12) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.ToolbarCastScreenRepository.f(com.bilibili.ship.theseus.united.page.castscreen.CastScreenSuppressionService$a):void");
    }

    @Nullable
    public final Object g(@NotNull Continuation<? super Unit> continuation) {
        Object objE = this.f103347g.e(CollectionsKt.listOf(this.f103354o), (SuspendLambda) continuation);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : Unit.INSTANCE;
    }
}
