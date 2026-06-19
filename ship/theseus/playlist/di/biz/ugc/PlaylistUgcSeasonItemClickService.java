package com.bilibili.ship.theseus.playlist.di.biz.ugc;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6355q;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonDetailRepository;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/ugc/PlaylistUgcSeasonItemClickService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistUgcSeasonItemClickService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f95393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C8043a f95394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final UnitedSeasonDetailRepository f95395d;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.biz.ugc.PlaylistUgcSeasonItemClickService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/ugc/PlaylistUgcSeasonItemClickService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistUgcSeasonItemClickService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.biz.ugc.PlaylistUgcSeasonItemClickService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/ugc/PlaylistUgcSeasonItemClickService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlaylistUgcSeasonItemClickService f95396a;

            public a(PlaylistUgcSeasonItemClickService playlistUgcSeasonItemClickService) {
                this.f95396a = playlistUgcSeasonItemClickService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                C6355q c6355q = (C6355q) obj;
                Uri.Builder builderAppendQueryParameter = Uri.parse("bilibili://video/" + c6355q.f101682b + "/").buildUpon().appendQueryParameter("cid", String.valueOf(c6355q.f101683c));
                PlaylistUgcSeasonItemClickService playlistUgcSeasonItemClickService = this.f95396a;
                BLRouter.routeTo(new RouteRequest.Builder(builderAppendQueryParameter.appendQueryParameter("from_spmid", playlistUgcSeasonItemClickService.f95394c.a().f123880b).build()).requestCode(-1).build(), playlistUgcSeasonItemClickService.f95393b);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistUgcSeasonItemClickService playlistUgcSeasonItemClickService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistUgcSeasonItemClickService;
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
                PlaylistUgcSeasonItemClickService playlistUgcSeasonItemClickService = this.this$0;
                SharedFlow<C6355q> sharedFlow = playlistUgcSeasonItemClickService.f95395d.f101578j;
                a aVar = new a(playlistUgcSeasonItemClickService);
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

    @Inject
    public PlaylistUgcSeasonItemClickService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull C8043a c8043a, @NotNull UnitedSeasonDetailRepository unitedSeasonDetailRepository) {
        this.f95392a = coroutineScope;
        this.f95393b = context;
        this.f95394c = c8043a;
        this.f95395d = unitedSeasonDetailRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
