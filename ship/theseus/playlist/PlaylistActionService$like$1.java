package com.bilibili.ship.theseus.playlist;

import androidx.compose.ui.text.font.C4496a;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.ship.theseus.playlist.C6241f;
import com.bilibili.ship.theseus.playlist.api.PlaylistInfo;
import com.bilibili.ship.theseus.playlist.api.PlaylistThumbUp;
import com.bilibili.ship.theseus.playlist.api.Upper;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import retrofit2.Response;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistActionService$like$1.class */
final class PlaylistActionService$like$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $actionType;
    final boolean $isLike;
    final PlaylistInfo $playlistInfo;
    int label;
    final C6241f this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistActionService$like$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistActionService$like$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<String, Continuation<? super Response<BiliApiResponse<? extends PlaylistThumbUp>>>, Object> {
        final int $actionType;
        final PlaylistInfo $playlistInfo;
        Object L$0;
        int label;
        final C6241f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C6241f c6241f, PlaylistInfo playlistInfo, int i7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c6241f;
            this.$playlistInfo = playlistInfo;
            this.$actionType = i7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$playlistInfo, this.$actionType, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(String str, Continuation<? super Response<BiliApiResponse<PlaylistThumbUp>>> continuation) {
            return create(str, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                String str = (String) this.L$0;
                C6241f c6241f = this.this$0;
                C6241f.a aVar = c6241f.f95755l;
                PlaylistInfo playlistInfo = this.$playlistInfo;
                long j7 = playlistInfo.f95276i;
                int i8 = this.$actionType;
                Upper upper = playlistInfo.f95283p;
                long j8 = upper != null ? upper.f95323e : 0L;
                String str2 = c6241f.f95753j.a().f123881c;
                String str3 = this.this$0.f95753j.a().f123880b;
                this.this$0.getClass();
                String strCurrentPolarisActionId = PageViewTracker.getInstance().currentPolarisActionId();
                this.label = 1;
                Object objThumbUp = aVar.thumbUp(j7, i8, 11, j8, str2, str3, strCurrentPolarisActionId, str, this);
                obj = objThumbUp;
                if (objThumbUp == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistActionService$like$1(C6241f c6241f, PlaylistInfo playlistInfo, int i7, boolean z6, Continuation<? super PlaylistActionService$like$1> continuation) {
        super(2, continuation);
        this.this$0 = c6241f;
        this.$playlistInfo = playlistInfo;
        this.$actionType = i7;
        this.$isLike = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(C6241f c6241f, boolean z6, PlaylistThumbUp playlistThumbUp) {
        MutableStateFlow<PlaylistInfo> mutableStateFlow;
        Object value;
        PlaylistRepository playlistRepository = c6241f.f95748d;
        do {
            mutableStateFlow = playlistRepository.f95101i;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, invokeSuspend$lambda$0$0(z6, (PlaylistInfo) value)));
        com.bilibili.ship.theseus.united.utils.q.c(z6 ? c6241f.f95746b.getString(2131845836) : c6241f.f95746b.getString(2131845547));
        return Unit.INSTANCE;
    }

    private static final PlaylistInfo invokeSuspend$lambda$0$0(boolean z6, PlaylistInfo playlistInfo) {
        return z6 ? playlistInfo.c() : playlistInfo.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(BiliApiResponse.BusinessFailure businessFailure) {
        BLog.e("PlaylistActionService$like$1-invokeSuspend$lambda$1", "[theseus-playlist-PlaylistActionService$like$1-invokeSuspend$lambda$1] " + androidx.core.app.o.a(businessFailure.getCode(), "onBusinessFailure, ", " ", businessFailure.getMessage()), (Throwable) null);
        com.bilibili.ship.theseus.united.utils.q.c(businessFailure.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(boolean z6, C6241f c6241f, Exception exc) {
        com.bilibili.bangumi.logic.page.detail.service.e.a("[theseus-playlist-PlaylistActionService$like$1-invokeSuspend$lambda$2] ", C4496a.a("onServiceUnavailable, ", exc.getMessage()), "PlaylistActionService$like$1-invokeSuspend$lambda$2", (Throwable) null);
        com.bilibili.ship.theseus.united.utils.q.c(z6 ? c6241f.f95746b.getString(2131846938) : c6241f.f95746b.getString(2131841697));
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistActionService$like$1(this.this$0, this.$playlistInfo, this.$actionType, this.$isLike, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$playlistInfo, this.$actionType, null);
            final C6241f c6241f = this.this$0;
            final boolean z6 = this.$isLike;
            Function1 function1 = new Function1(c6241f, z6) { // from class: com.bilibili.ship.theseus.playlist.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C6241f f95760a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f95761b;

                {
                    this.f95760a = c6241f;
                    this.f95761b = z6;
                }

                public final Object invoke(Object obj2) {
                    return PlaylistActionService$like$1.invokeSuspend$lambda$0(this.f95760a, this.f95761b, (PlaylistThumbUp) obj2);
                }
            };
            ?? obj2 = new Object();
            Function1 function12 = new Function1(c6241f, z6) { // from class: com.bilibili.ship.theseus.playlist.n

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f95775a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final C6241f f95776b;

                {
                    this.f95775a = z6;
                    this.f95776b = c6241f;
                }

                public final Object invoke(Object obj3) {
                    return PlaylistActionService$like$1.invokeSuspend$lambda$2(this.f95775a, this.f95776b, (Exception) obj3);
                }
            };
            this.label = 1;
            if (com.bilibili.playset.api.t.c(anonymousClass1, "collection_thunmbup", function1, obj2, function12, null, this) == coroutine_suspended) {
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
