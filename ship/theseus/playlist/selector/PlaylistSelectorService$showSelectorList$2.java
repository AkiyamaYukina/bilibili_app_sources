package com.bilibili.ship.theseus.playlist.selector;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.playlist.selector.PlaylistSelectorService$showSelectorList$2;
import com.bilibili.ship.theseus.playlist.selector.k;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/PlaylistSelectorService$showSelectorList$2.class */
final class PlaylistSelectorService$showSelectorList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final PlaylistSelectorService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.selector.PlaylistSelectorService$showSelectorList$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/PlaylistSelectorService$showSelectorList$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final k $component;
        int label;
        final PlaylistSelectorService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.selector.PlaylistSelectorService$showSelectorList$2$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/PlaylistSelectorService$showSelectorList$2$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlaylistSelectorService f95849a;

            public a(PlaylistSelectorService playlistSelectorService) {
                this.f95849a = playlistSelectorService;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
                k.b bVar = (k.b) obj;
                boolean zAreEqual = Intrinsics.areEqual(bVar, k.b.C0797b.f95886a);
                PlaylistSelectorService playlistSelectorService = this.f95849a;
                if (zAreEqual) {
                    playlistSelectorService.f95838c.g();
                } else {
                    if (!Intrinsics.areEqual(bVar, k.b.a.f95885a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    playlistSelectorService.f95838c.f();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(k kVar, PlaylistSelectorService playlistSelectorService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$component = kVar;
            this.this$0 = playlistSelectorService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$component, this.this$0, continuation);
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
                SharedFlow<k.b> sharedFlow = this.$component.f95883e;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.selector.PlaylistSelectorService$showSelectorList$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/PlaylistSelectorService$showSelectorList$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistSelectorService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlaylistSelectorService playlistSelectorService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = playlistSelectorService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(PlaylistSelectorService playlistSelectorService, boolean z6) {
            Job job = playlistSelectorService.f95845k;
            if (job == null || !job.isActive()) {
                return false;
            }
            Job job2 = playlistSelectorService.f95845k;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            playlistSelectorService.f95845k = null;
            return true;
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
                final PlaylistSelectorService playlistSelectorService = this.this$0;
                BackActionRepository backActionRepository = playlistSelectorService.h;
                Function1<? super Boolean, Boolean> function1 = new Function1(playlistSelectorService) { // from class: com.bilibili.ship.theseus.playlist.selector.g

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final PlaylistSelectorService f95870a;

                    {
                        this.f95870a = playlistSelectorService;
                    }

                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(PlaylistSelectorService$showSelectorList$2.AnonymousClass2.invokeSuspend$lambda$0(this.f95870a, ((Boolean) obj2).booleanValue()));
                    }
                };
                this.label = 1;
                if (backActionRepository.b(function1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.selector.PlaylistSelectorService$showSelectorList$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/PlaylistSelectorService$showSelectorList$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final k $component;
        int label;
        final PlaylistSelectorService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.selector.PlaylistSelectorService$showSelectorList$2$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/PlaylistSelectorService$showSelectorList$2$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlaylistSelectorService f95850a;

            public a(PlaylistSelectorService playlistSelectorService) {
                this.f95850a = playlistSelectorService;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0119  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0120  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) throws kotlin.NoWhenBranchMatchedException {
                /*
                    Method dump skipped, instruction units count: 354
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.selector.PlaylistSelectorService$showSelectorList$2.AnonymousClass3.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(k kVar, PlaylistSelectorService playlistSelectorService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$component = kVar;
            this.this$0 = playlistSelectorService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$component, this.this$0, continuation);
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
                SharedFlow<k.c> sharedFlow = this.$component.f95881c;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistSelectorService$showSelectorList$2(PlaylistSelectorService playlistSelectorService, Continuation<? super PlaylistSelectorService$showSelectorList$2> continuation) {
        super(2, continuation);
        this.this$0 = playlistSelectorService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlaylistSelectorService$showSelectorList$2 playlistSelectorService$showSelectorList$2 = new PlaylistSelectorService$showSelectorList$2(this.this$0, continuation);
        playlistSelectorService$showSelectorList$2.L$0 = obj;
        return playlistSelectorService$showSelectorList$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            PlaylistSelectorService playlistSelectorService = this.this$0;
            Flow flowMapLatest = FlowKt.mapLatest(playlistSelectorService.f95837b.f95108p, new PlaylistSelectorService$showSelectorList$2$component$1(playlistSelectorService, null));
            PlaylistSelectorService playlistSelectorService2 = this.this$0;
            UIComponent<?> kVar = new k(new k.d(flowMapLatest, playlistSelectorService2.f95838c.f95050g, playlistSelectorService2.f95837b.c(), this.this$0.f95837b.f95087J));
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(kVar, this.this$0, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(kVar, this.this$0, null), 3, (Object) null);
            TheseusFloatLayerService theseusFloatLayerService = this.this$0.f95840e;
            TheseusFloatLayerService.a aVar = new TheseusFloatLayerService.a(2130772368, 2130772369, null, 28);
            this.label = 1;
            if (theseusFloatLayerService.i(kVar, aVar, this) == coroutine_suspended) {
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
