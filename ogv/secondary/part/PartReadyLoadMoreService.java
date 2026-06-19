package com.bilibili.ogv.secondary.part;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import com.bilibili.ogv.operation3.module.list.MoreLoadingState;
import com.bilibili.ogv.secondary.api.FeedType;
import javax.inject.Inject;
import kl0.C7772a;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentScope;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/PartReadyLoadMoreService.class */
@StabilityInferred(parameters = 0)
public final class PartReadyLoadMoreService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KomponentScope<Unit> f72790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableState f72791b = SnapshotStateKt.mutableStateOf$default(MoreLoadingState.IDLE, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final D f72792c;

    /* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.PartReadyLoadMoreService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/PartReadyLoadMoreService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PartReadyLoadMoreService this$0;

        /* JADX INFO: renamed from: com.bilibili.ogv.secondary.part.PartReadyLoadMoreService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/PartReadyLoadMoreService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PartReadyLoadMoreService f72793a;

            public a(PartReadyLoadMoreService partReadyLoadMoreService) {
                this.f72793a = partReadyLoadMoreService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f72793a.f72791b.setValue((MoreLoadingState) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PartReadyLoadMoreService partReadyLoadMoreService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = partReadyLoadMoreService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
                MutableStateFlow<MoreLoadingState> mutableStateFlowA = this.this$0.f72792c.a();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (mutableStateFlowA.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/PartReadyLoadMoreService$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f72794a;

        static {
            int[] iArr = new int[FeedType.values().length];
            try {
                iArr[FeedType.PGC_FEED.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[FeedType.FALL_REGION.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f72794a = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Inject
    public PartReadyLoadMoreService(@NotNull KomponentScope<? super Unit> komponentScope, @NotNull com.bilibili.ogv.secondary.api.c cVar, @NotNull C c7, @NotNull B b7) throws NoWhenBranchMatchedException {
        this.f72790a = komponentScope;
        com.bilibili.ogv.secondary.api.a aVar = cVar.f72640e;
        int i7 = a.f72794a[(aVar == null ? FeedType.PGC_FEED : aVar.f72626a).ordinal()];
        D d7 = c7;
        if (i7 != 1) {
            if (i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            d7 = b7;
        }
        this.f72792c = d7;
        KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void a(@Nullable final Modifier modifier, @Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(2024887920);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        int i9 = i8;
        if ((i7 & 48) == 0) {
            i9 = i8 | (composerStartRestartGroup.changedInstance(this) ? 32 : 16);
        }
        if (composerStartRestartGroup.shouldExecute((i9 & 19) != 18, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2024887920, i9, -1, "com.bilibili.ogv.secondary.part.PartReadyLoadMoreService.Content (PartReadyLoadMoreService.kt:56)");
            }
            C7772a.a((MoreLoadingState) this.f72791b.getValue(), modifier, composerStartRestartGroup, (i9 << 3) & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, modifier, i7) { // from class: com.bilibili.ogv.secondary.part.E

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PartReadyLoadMoreService f72772a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Modifier f72773b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f72774c;

                {
                    this.f72772a = this;
                    this.f72773b = modifier;
                    this.f72774c = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f72774c | 1);
                    this.f72772a.a(this.f72773b, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
