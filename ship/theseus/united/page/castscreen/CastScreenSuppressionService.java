package com.bilibili.ship.theseus.united.page.castscreen;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.media.resource.PlayConfig;
import com.bilibili.lib.projection.ProjectionClient;
import com.bilibili.lib.projection.internal.api.model.ProjectionOperationConfig;
import com.bilibili.ship.theseus.united.page.toolbar.C6418b;
import com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.ToolbarCastScreenRepository;
import java.util.List;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/CastScreenSuppressionService.class */
@StabilityInferred(parameters = 0)
public final class CastScreenSuppressionService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f99108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f99109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ToolbarCastScreenRepository f99110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f99111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f99112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TheseusCastScreenRepository f99113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f99114g;

    @Nullable
    public C6418b h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final List<String> f99115i = CollectionsKt.listOf(new String[]{"projRedDot", "projButtonBubble"});

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final b f99116j = new b(this);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.castscreen.CastScreenSuppressionService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/CastScreenSuppressionService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CastScreenSuppressionService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CastScreenSuppressionService castScreenSuppressionService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = castScreenSuppressionService;
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
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CastScreenSuppressionService castScreenSuppressionService = this.this$0;
                    CastScreenSuppressionService.a(castScreenSuppressionService, castScreenSuppressionService.f99109b.getCloudConfig());
                    CastScreenSuppressionService castScreenSuppressionService2 = this.this$0;
                    castScreenSuppressionService2.f99109b.addCloudConfigObserver(castScreenSuppressionService2.f99116j);
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
                CastScreenSuppressionService castScreenSuppressionService3 = this.this$0;
                castScreenSuppressionService3.f99109b.removeCloudConfigObserver(castScreenSuppressionService3.f99116j);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.castscreen.CastScreenSuppressionService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/CastScreenSuppressionService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CastScreenSuppressionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.castscreen.CastScreenSuppressionService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/CastScreenSuppressionService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final CastScreenSuppressionService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CastScreenSuppressionService castScreenSuppressionService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = castScreenSuppressionService;
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
                    this.this$0.f99110c.a("teenagersModeSuppressor");
                } else {
                    this.this$0.f99110c.b("teenagersModeSuppressor");
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CastScreenSuppressionService castScreenSuppressionService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = castScreenSuppressionService;
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
                CastScreenSuppressionService castScreenSuppressionService = this.this$0;
                StateFlow<Boolean> stateFlow = castScreenSuppressionService.f99112e;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(castScreenSuppressionService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.castscreen.CastScreenSuppressionService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/CastScreenSuppressionService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CastScreenSuppressionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.castscreen.CastScreenSuppressionService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/CastScreenSuppressionService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final CastScreenSuppressionService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CastScreenSuppressionService castScreenSuppressionService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = castScreenSuppressionService;
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
                    this.this$0.f99110c.a("lessonsModeSuppressor");
                } else {
                    this.this$0.f99110c.b("lessonsModeSuppressor");
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CastScreenSuppressionService castScreenSuppressionService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = castScreenSuppressionService;
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
                CastScreenSuppressionService castScreenSuppressionService = this.this$0;
                StateFlow<Boolean> stateFlow = castScreenSuppressionService.f99111d;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(castScreenSuppressionService, null);
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/CastScreenSuppressionService$a.class */
    public interface a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.castscreen.CastScreenSuppressionService$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/CastScreenSuppressionService$a$a.class */
        @StabilityInferred(parameters = 0)
        public static final class C0953a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f99117a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public final ProjectionOperationConfig.ProjButtonBubbleConfig f99118b;

            public C0953a(boolean z6, @Nullable ProjectionOperationConfig.ProjButtonBubbleConfig projButtonBubbleConfig) {
                this.f99117a = z6;
                this.f99118b = projButtonBubbleConfig;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0953a)) {
                    return false;
                }
                C0953a c0953a = (C0953a) obj;
                return this.f99117a == c0953a.f99117a && Intrinsics.areEqual(this.f99118b, c0953a.f99118b);
            }

            public final int hashCode() {
                int iHashCode = Boolean.hashCode(this.f99117a);
                ProjectionOperationConfig.ProjButtonBubbleConfig projButtonBubbleConfig = this.f99118b;
                return (iHashCode * 31) + (projButtonBubbleConfig == null ? 0 : projButtonBubbleConfig.hashCode());
            }

            @NotNull
            public final String toString() {
                return "BubbleConfig(visible=" + this.f99117a + ", projButtonBubble=" + this.f99118b + ")";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/CastScreenSuppressionService$a$b.class */
        @StabilityInferred(parameters = 0)
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f99119a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public final ProjectionOperationConfig.DotConfig f99120b;

            public b(boolean z6, @Nullable ProjectionOperationConfig.DotConfig dotConfig) {
                this.f99119a = z6;
                this.f99120b = dotConfig;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f99119a == bVar.f99119a && Intrinsics.areEqual(this.f99120b, bVar.f99120b);
            }

            public final int hashCode() {
                int iHashCode = Boolean.hashCode(this.f99119a);
                ProjectionOperationConfig.DotConfig dotConfig = this.f99120b;
                return (iHashCode * 31) + (dotConfig == null ? 0 : dotConfig.hashCode());
            }

            @NotNull
            public final String toString() {
                return "DotConfig(visible=" + this.f99119a + ", dot=" + this.f99120b + ")";
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/CastScreenSuppressionService$b.class */
    public static final class b implements tv.danmaku.biliplayerv2.service.setting.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CastScreenSuppressionService f99121a;

        public b(CastScreenSuppressionService castScreenSuppressionService) {
            this.f99121a = castScreenSuppressionService;
        }

        public final void c() {
            CastScreenSuppressionService castScreenSuppressionService = this.f99121a;
            CastScreenSuppressionService.a(castScreenSuppressionService, castScreenSuppressionService.f99109b.getCloudConfig());
        }
    }

    @Inject
    public CastScreenSuppressionService(@NotNull CoroutineScope coroutineScope, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull ToolbarCastScreenRepository toolbarCastScreenRepository, @NotNull StateFlow<Boolean> stateFlow, @NotNull StateFlow<Boolean> stateFlow2, @NotNull TheseusCastScreenRepository theseusCastScreenRepository, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar) {
        this.f99108a = coroutineScope;
        this.f99109b = iPlayerSettingService;
        this.f99110c = toolbarCastScreenRepository;
        this.f99111d = stateFlow;
        this.f99112e = stateFlow2;
        this.f99113f = theseusCastScreenRepository;
        this.f99114g = aVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }

    public static final void a(CastScreenSuppressionService castScreenSuppressionService, Oi1.d dVar) {
        ProjectionClient projectionClientA;
        PlayConfig.PlayMenuConfig.ExtraContent extraContent;
        castScreenSuppressionService.getClass();
        boolean zM = dVar.M();
        ToolbarCastScreenRepository toolbarCastScreenRepository = castScreenSuppressionService.f99110c;
        if (zM) {
            toolbarCastScreenRepository.b("cloudConfigSuppressor");
        } else {
            toolbarCastScreenRepository.a("cloudConfigSuppressor");
        }
        int length = toolbarCastScreenRepository.d().length();
        MutableStateFlow<Boolean> mutableStateFlow = toolbarCastScreenRepository.f103357r;
        if (length <= 0) {
            PlayConfig playConfig = toolbarCastScreenRepository.f103352m.getCloudConfig().b;
            PlayConfig.PlayMenuConfig playMenuConfig = playConfig != null ? playConfig.c : null;
            if (((playMenuConfig == null || (extraContent = playMenuConfig.c) == null) ? -1L : extraContent.b) <= 0) {
                C6418b c6418b = castScreenSuppressionService.h;
                if (c6418b != null) {
                    toolbarCastScreenRepository.f103356q.remove(c6418b);
                    mutableStateFlow.setValue(Boolean.valueOf(!toolbarCastScreenRepository.f103356q.isEmpty()));
                }
                if (((Boolean) toolbarCastScreenRepository.f103361v.getValue()).booleanValue() || !zM || (projectionClientA = castScreenSuppressionService.f99113f.a()) == null || !projectionClientA.hasDevice()) {
                    return;
                }
                BuildersKt.launch$default(castScreenSuppressionService.f99108a, (CoroutineContext) null, (CoroutineStart) null, new CastScreenSuppressionService$requestCastActivityConfig$1(castScreenSuppressionService, null), 3, (Object) null);
                return;
            }
        }
        C6418b c6418b2 = new C6418b(toolbarCastScreenRepository.d());
        toolbarCastScreenRepository.f103356q.add(c6418b2);
        mutableStateFlow.setValue(Boolean.valueOf(!toolbarCastScreenRepository.f103356q.isEmpty()));
        castScreenSuppressionService.h = c6418b2;
    }
}
