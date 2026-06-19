package com.bilibili.ship.theseus.cheese.biz.intro.season;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.coroutineextension.j;
import com.google.android.material.appbar.AppBarLayout;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/season/CheeseFloatContainerService.class */
@StabilityInferred(parameters = 0)
public final class CheeseFloatContainerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CheeseSeasonService f90017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Flow<a> f90018c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.season.CheeseFloatContainerService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/season/CheeseFloatContainerService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseFloatContainerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.season.CheeseFloatContainerService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/season/CheeseFloatContainerService$1$1.class */
        public static final class C06301 extends SuspendLambda implements Function2<a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CheeseFloatContainerService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.season.CheeseFloatContainerService$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/season/CheeseFloatContainerService$1$1$a.class */
            public static final class a implements AppBarLayout.OnOffsetChangedListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CheeseFloatContainerService f90019a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final View f90020b;

                public a(CheeseFloatContainerService cheeseFloatContainerService, View view) {
                    this.f90019a = cheeseFloatContainerService;
                    this.f90020b = view;
                }

                public final void onOffsetChanged(AppBarLayout appBarLayout, int i7) {
                    CheeseFloatContainerService.a(this.f90019a, this.f90020b, appBarLayout.getBottom());
                }
            }

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.season.CheeseFloatContainerService$1$1$b */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/season/CheeseFloatContainerService$1$1$b.class */
            public static final class b implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final a f90021a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final a f90022b;

                public b(a aVar, a aVar2) {
                    this.f90021a = aVar;
                    this.f90022b = aVar2;
                }

                public final void invoke() {
                    this.f90021a.f90024b.removeOnOffsetChangedListener(this.f90022b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06301(CheeseFloatContainerService cheeseFloatContainerService, Continuation<? super C06301> continuation) {
                super(2, continuation);
                this.this$0 = cheeseFloatContainerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06301 c06301 = new C06301(this.this$0, continuation);
                c06301.L$0 = obj;
                return c06301;
            }

            public final Object invoke(a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                j bVar;
                Throwable th;
                j jVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    a aVar = (a) this.L$0;
                    if (aVar == null) {
                        return Unit.INSTANCE;
                    }
                    View view = aVar.f90023a;
                    AppBarLayout appBarLayout = aVar.f90024b;
                    if (appBarLayout == null) {
                        CheeseFloatContainerService.a(this.this$0, view, 0);
                        return Unit.INSTANCE;
                    }
                    a aVar2 = new a(this.this$0, view);
                    appBarLayout.addOnOffsetChangedListener(aVar2);
                    bVar = new b(aVar, aVar2);
                    try {
                        this.L$0 = bVar;
                        this.label = 1;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th2) {
                        th = th2;
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
                    } catch (Throwable th3) {
                        th = th3;
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
        public AnonymousClass1(CheeseFloatContainerService cheeseFloatContainerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseFloatContainerService;
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
                CheeseFloatContainerService cheeseFloatContainerService = this.this$0;
                Flow<a> flow = cheeseFloatContainerService.f90018c;
                C06301 c06301 = new C06301(cheeseFloatContainerService, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c06301, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/season/CheeseFloatContainerService$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final View f90023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final AppBarLayout f90024b;

        public a(@NotNull View view, @Nullable AppBarLayout appBarLayout) {
            this.f90023a = view;
            this.f90024b = appBarLayout;
        }
    }

    @Inject
    public CheeseFloatContainerService(@NotNull CoroutineScope coroutineScope, @NotNull CheeseSeasonService cheeseSeasonService, @NotNull Flow<a> flow) {
        this.f90016a = coroutineScope;
        this.f90017b = cheeseSeasonService;
        this.f90018c = flow;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public static final void a(CheeseFloatContainerService cheeseFloatContainerService, View view, int i7) {
        cheeseFloatContainerService.getClass();
        cheeseFloatContainerService.f90017b.f90038i.setValue(Integer.valueOf(((view.getHeight() - i7) - NewPlayerUtilsKt.toPx(38.0f)) - NewPlayerUtilsKt.toPx(60.0f)));
    }
}
