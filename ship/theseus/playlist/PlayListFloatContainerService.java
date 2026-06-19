package com.bilibili.ship.theseus.playlist;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlayListFloatContainerService.class */
@StabilityInferred(parameters = 0)
public final class PlayListFloatContainerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlaylistRepository f94984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final E f94985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Flow<a> f94986d;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlayListFloatContainerService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlayListFloatContainerService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlayListFloatContainerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlayListFloatContainerService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlayListFloatContainerService$1$1.class */
        public static final class C07631 extends SuspendLambda implements Function2<a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PlayListFloatContainerService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlayListFloatContainerService$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlayListFloatContainerService$1$1$a.class */
            public static final class a implements AppBarLayout.OnOffsetChangedListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PlayListFloatContainerService f94987a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final View f94988b;

                public a(PlayListFloatContainerService playListFloatContainerService, View view) {
                    this.f94987a = playListFloatContainerService;
                    this.f94988b = view;
                }

                public final void onOffsetChanged(AppBarLayout appBarLayout, int i7) {
                    PlayListFloatContainerService.a(this.f94987a, this.f94988b, appBarLayout.getBottom());
                }
            }

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlayListFloatContainerService$1$1$b */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlayListFloatContainerService$1$1$b.class */
            public static final class b implements com.bilibili.lib.coroutineextension.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final AppBarLayout f94989a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final a f94990b;

                public b(AppBarLayout appBarLayout, a aVar) {
                    this.f94989a = appBarLayout;
                    this.f94990b = aVar;
                }

                public final void invoke() {
                    this.f94989a.removeOnOffsetChangedListener(this.f94990b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07631(PlayListFloatContainerService playListFloatContainerService, Continuation<? super C07631> continuation) {
                super(2, continuation);
                this.this$0 = playListFloatContainerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07631 c07631 = new C07631(this.this$0, continuation);
                c07631.L$0 = obj;
                return c07631;
            }

            public final Object invoke(a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                com.bilibili.lib.coroutineextension.j bVar;
                Throwable th;
                com.bilibili.lib.coroutineextension.j jVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    a aVar = (a) this.L$0;
                    if (aVar == null) {
                        return Unit.INSTANCE;
                    }
                    View view = aVar.f94991a;
                    AppBarLayout appBarLayout = aVar.f94992b;
                    if (appBarLayout == null) {
                        PlayListFloatContainerService.a(this.this$0, view, 0);
                        return Unit.INSTANCE;
                    }
                    a aVar2 = new a(this.this$0, view);
                    appBarLayout.addOnOffsetChangedListener(aVar2);
                    bVar = new b(appBarLayout, aVar2);
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
                    com.bilibili.lib.coroutineextension.j jVar2 = (com.bilibili.lib.coroutineextension.j) this.L$0;
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
                com.bilibili.lib.coroutineextension.j jVar3 = bVar;
                jVar = bVar;
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlayListFloatContainerService playListFloatContainerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playListFloatContainerService;
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
                PlayListFloatContainerService playListFloatContainerService = this.this$0;
                Flow<a> flow = playListFloatContainerService.f94986d;
                C07631 c07631 = new C07631(playListFloatContainerService, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c07631, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlayListFloatContainerService$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final View f94991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final AppBarLayout f94992b;

        public a(@NotNull View view, @Nullable AppBarLayout appBarLayout) {
            this.f94991a = view;
            this.f94992b = appBarLayout;
        }
    }

    @Inject
    public PlayListFloatContainerService(@NotNull CoroutineScope coroutineScope, @NotNull PlaylistRepository playlistRepository, @NotNull E e7, @NotNull Flow<a> flow) {
        this.f94983a = coroutineScope;
        this.f94984b = playlistRepository;
        this.f94985c = e7;
        this.f94986d = flow;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public static final void a(PlayListFloatContainerService playListFloatContainerService, View view, int i7) {
        playListFloatContainerService.f94985c.f94955x.setValue(Integer.valueOf((view.getHeight() - i7) - (playListFloatContainerService.f94984b.c().f95137a.u() ? NewPlayerUtilsKt.toPx(60.0f) : 0)));
    }
}
