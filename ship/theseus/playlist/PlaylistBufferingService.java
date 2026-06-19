package com.bilibili.ship.theseus.playlist;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.BufferingObserver;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistBufferingService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistBufferingService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f95014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Context f95015c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistBufferingService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistBufferingService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final PlaylistBufferingService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistBufferingService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistBufferingService$1$a.class */
        public static final class a implements BufferingObserver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlaylistBufferingService f95016a;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistBufferingService$1$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistBufferingService$1$a$a.class */
            public static final class C0766a implements Function0<Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0766a f95017a = new Object();

                public final /* bridge */ /* synthetic */ Object invoke() {
                    return Unit.INSTANCE;
                }
            }

            public a(PlaylistBufferingService playlistBufferingService) {
                this.f95016a = playlistBufferingService;
            }

            public final void onBufferingEnd() {
            }

            public final void onBufferingStart(int i7) {
                if (i7 == 17) {
                    Context context = this.f95016a.f95015c;
                    new com.bilibili.playerbizcommonv2.danmaku.widget.A(context, context.getString(2131851644), null, "", null, 0, 0, 0, C0766a.f95017a, null, 3060).show();
                }
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistBufferingService$1$b */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistBufferingService$1$b.class */
        public static final class b implements com.bilibili.lib.coroutineextension.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlaylistBufferingService f95018a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final a f95019b;

            public b(PlaylistBufferingService playlistBufferingService, a aVar) {
                this.f95018a = playlistBufferingService;
                this.f95019b = aVar;
            }

            public final void invoke() {
                this.f95018a.f95014b.unregisterBufferingState(this.f95019b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistBufferingService playlistBufferingService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistBufferingService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            com.bilibili.lib.coroutineextension.j bVar;
            Throwable th;
            com.bilibili.lib.coroutineextension.j jVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PlaylistBufferingService playlistBufferingService = this.this$0;
                a aVar = new a(playlistBufferingService);
                playlistBufferingService.f95014b.registerBufferingState(aVar);
                bVar = new b(playlistBufferingService, aVar);
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

    @Inject
    public PlaylistBufferingService(@NotNull CoroutineScope coroutineScope, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull Context context) {
        this.f95013a = coroutineScope;
        this.f95014b = iPlayerCoreService;
        this.f95015c = context;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
