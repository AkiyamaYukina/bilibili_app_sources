package com.bilibili.ship.theseus.playlist.di.biz;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import javax.inject.Inject;
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
import kotlinx.coroutines.YieldKt;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/PlaylistHistoryService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistHistoryService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f95353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PlaylistRepository f95354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C7893a f95355d;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.biz.PlaylistHistoryService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/PlaylistHistoryService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistHistoryService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistHistoryService playlistHistoryService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistHistoryService;
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
                this.label = 1;
                if (YieldKt.yield(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C7893a.C1318a c1318aC = this.this$0.f95355d.c();
            if (c1318aC != null) {
                PlaylistHistoryService playlistHistoryService = this.this$0;
                String strValueOf = String.valueOf(playlistHistoryService.f95354c.f95087J);
                String strValueOf2 = String.valueOf(playlistHistoryService.f95354c.f95085H);
                C7893a.C1318a.C1319a c1319a = c1318aC.f123395a;
                String accessKey = playlistHistoryService.f95353b.getAccessKey();
                long j7 = c1319a.f123397a;
                if (j7 >= 0) {
                    long j8 = c1319a.f123398b;
                    if (j8 >= 0) {
                        ((com.bilibili.playerbizcommonv2.api.c) ServiceGenerator.createService(com.bilibili.playerbizcommonv2.api.c.class)).reportArc(accessKey, String.valueOf(j8), String.valueOf(j7), strValueOf, strValueOf2, "medialist").enqueue(new com.bilibili.playerbizcommonv2.api.b(j7, j8, strValueOf, strValueOf2));
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Inject
    public PlaylistHistoryService(@NotNull CoroutineScope coroutineScope, @NotNull BiliAccounts biliAccounts, @NotNull PlaylistRepository playlistRepository, @NotNull C7893a c7893a) {
        this.f95352a = coroutineScope;
        this.f95353b = biliAccounts;
        this.f95354c = playlistRepository;
        this.f95355d = c7893a;
        if (playlistRepository.f95087J > 0) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        }
    }
}
