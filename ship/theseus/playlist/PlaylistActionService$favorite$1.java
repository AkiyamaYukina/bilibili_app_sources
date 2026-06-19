package com.bilibili.ship.theseus.playlist;

import android.content.Context;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.playset.widget.favorite.FavSnackBarUtil;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.ship.theseus.playlist.C6241f;
import com.bilibili.ship.theseus.playlist.api.FolderFavorite;
import com.bilibili.ship.theseus.playlist.api.PlaylistInfo;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistActionService$favorite$1.class */
final class PlaylistActionService$favorite$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $id;
    final Function0<Unit> $onSuccess;
    int label;
    final C6241f this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistActionService$favorite$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistActionService$favorite$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<String, Continuation<? super Response<BiliApiResponse<? extends FolderFavorite>>>, Object> {
        final long $id;
        Object L$0;
        int label;
        final C6241f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C6241f c6241f, long j7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c6241f;
            this.$id = j7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$id, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(String str, Continuation<? super Response<BiliApiResponse<FolderFavorite>>> continuation) {
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
                long j7 = this.$id;
                String str2 = c6241f.f95753j.a().f123881c;
                String str3 = this.this$0.f95753j.a().f123880b;
                this.this$0.getClass();
                String strCurrentPolarisActionId = PageViewTracker.getInstance().currentPolarisActionId();
                this.label = 1;
                Object objFavorite = aVar.favorite(j7, str2, str3, strCurrentPolarisActionId, str, this);
                obj = objFavorite;
                if (objFavorite == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistActionService$favorite$1$a.class */
    public static final class a implements FavSnackBarUtil.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C6241f f94994b;

        public a(String str, C6241f c6241f) {
            this.f94993a = str;
            this.f94994b = c6241f;
        }

        @Override // com.bilibili.playset.widget.favorite.FavSnackBarUtil.b
        public final void onClick() {
            StringBuilder sb = new StringBuilder("onClick link: ");
            String str = this.f94993a;
            sb.append(str);
            BLog.i("PlaylistActionService$favorite$1$2$2-onClick", "[theseus-playlist-PlaylistActionService$favorite$1$2$2-onClick] " + sb.toString());
            BLRouter.routeTo$default(RouteRequestKt.toRouteRequest(str), (Context) null, 2, (Object) null);
            PageReportService.g(this.f94994b.f95750f, "united.player-video-detail.playlist-bottom.snackbar.click", null, 6);
        }

        @Override // com.bilibili.playset.widget.favorite.FavSnackBarUtil.b
        public final void onDismiss() {
            BLog.i("PlaylistActionService$favorite$1$2$2-onDismiss", "[theseus-playlist-PlaylistActionService$favorite$1$2$2-onDismiss] onDismiss");
        }

        @Override // com.bilibili.playset.widget.favorite.FavSnackBarUtil.b
        public final void onShow() {
            BLog.i("PlaylistActionService$favorite$1$2$2-onShow", "[theseus-playlist-PlaylistActionService$favorite$1$2$2-onShow] onShow");
            PageReportService.i(this.f94994b.f95750f, "united.player-video-detail.playlist-bottom.snackbar.show", null, 6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistActionService$favorite$1(C6241f c6241f, long j7, Function0<Unit> function0, Continuation<? super PlaylistActionService$favorite$1> continuation) {
        super(2, continuation);
        this.this$0 = c6241f;
        this.$id = j7;
        this.$onSuccess = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit invokeSuspend$lambda$0(com.bilibili.ship.theseus.playlist.C6241f r8, kotlin.jvm.functions.Function0 r9, com.bilibili.ship.theseus.playlist.api.FolderFavorite r10) {
        /*
            r0 = r8
            com.bilibili.ship.theseus.playlist.PlaylistRepository r0 = r0.f95748d
            r11 = r0
        L5:
            r0 = r11
            kotlinx.coroutines.flow.MutableStateFlow<com.bilibili.ship.theseus.playlist.api.PlaylistInfo> r0 = r0.f95101i
            r12 = r0
            r0 = r12
            java.lang.Object r0 = r0.getValue()
            r13 = r0
            r0 = r12
            r1 = r13
            r2 = r13
            com.bilibili.ship.theseus.playlist.api.PlaylistInfo r2 = (com.bilibili.ship.theseus.playlist.api.PlaylistInfo) r2
            com.bilibili.ship.theseus.playlist.api.PlaylistInfo r2 = invokeSuspend$lambda$0$0(r2)
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L5
            r0 = r10
            java.lang.String r0 = r0.f95204b
            r11 = r0
            r0 = r11
            int r0 = r0.length()
            if (r0 != 0) goto L37
            goto L45
        L37:
            r0 = r10
            java.lang.String r0 = r0.f95203a
            r12 = r0
            r0 = r12
            int r0 = r0.length()
            if (r0 != 0) goto L4d
        L45:
            r0 = 2131846674(0x7f116612, float:1.9326804E38)
            com.bilibili.ship.theseus.united.utils.q.b(r0)
            goto L67
        L4d:
            r0 = r8
            androidx.activity.ComponentActivity r0 = r0.f95747c
            r10 = r0
            r0 = r11
            r1 = r10
            r2 = 2131851606(0x7f117956, float:1.9336807E38)
            java.lang.String r1 = r1.getString(r2)
            r2 = r10
            com.bilibili.ship.theseus.playlist.PlaylistActionService$favorite$1$a r3 = new com.bilibili.ship.theseus.playlist.PlaylistActionService$favorite$1$a
            r4 = r3
            r5 = r12
            r6 = r8
            r4.<init>(r5, r6)
            com.bilibili.playset.widget.favorite.FavSnackBarUtil.b(r0, r1, r2, r3)
        L67:
            r0 = r9
            if (r0 == 0) goto L72
            r0 = r9
            java.lang.Object r0 = r0.invoke()
        L72:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.PlaylistActionService$favorite$1.invokeSuspend$lambda$0(com.bilibili.ship.theseus.playlist.f, kotlin.jvm.functions.Function0, com.bilibili.ship.theseus.playlist.api.FolderFavorite):kotlin.Unit");
    }

    private static final PlaylistInfo invokeSuspend$lambda$0$0(PlaylistInfo playlistInfo) {
        return playlistInfo.i(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(BiliApiResponse.BusinessFailure businessFailure) {
        BLog.e("PlaylistActionService$favorite$1-invokeSuspend$lambda$1", "[theseus-playlist-PlaylistActionService$favorite$1-invokeSuspend$lambda$1] " + androidx.core.app.o.a(businessFailure.getCode(), "onBusinessFailure, ", " ", businessFailure.getMessage()), (Throwable) null);
        com.bilibili.ship.theseus.united.utils.q.c(businessFailure.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(Exception exc) {
        BLog.e("PlaylistActionService$favorite$1-invokeSuspend$lambda$2", "[theseus-playlist-PlaylistActionService$favorite$1-invokeSuspend$lambda$2] " + C4496a.a("onServiceUnavailable, ", exc.getMessage()), (Throwable) null);
        com.bilibili.ship.theseus.united.utils.q.b(2131845879);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistActionService$favorite$1(this.this$0, this.$id, this.$onSuccess, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$id, null);
            final C6241f c6241f = this.this$0;
            final Function0<Unit> function0 = this.$onSuccess;
            Function1 function1 = new Function1(c6241f, function0) { // from class: com.bilibili.ship.theseus.playlist.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C6241f f95758a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function0 f95759b;

                {
                    this.f95758a = c6241f;
                    this.f95759b = function0;
                }

                public final Object invoke(Object obj2) {
                    return PlaylistActionService$favorite$1.invokeSuspend$lambda$0(this.f95758a, this.f95759b, (FolderFavorite) obj2);
                }
            };
            ?? obj2 = new Object();
            ?? obj3 = new Object();
            this.label = 1;
            if (com.bilibili.playset.api.t.c(anonymousClass1, "collection_favorite", function1, obj2, obj3, null, this) == coroutine_suspended) {
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
