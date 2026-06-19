package com.bilibili.ship.theseus.playlist;

import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.ship.theseus.playlist.PlaylistErrorStateService$handleNotSupport$2;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.uicomponent.z;
import com.bilibili.ship.theseus.united.page.floatlayer.FloatLayerManager;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistErrorStateService$handleNotSupport$2.class */
final class PlaylistErrorStateService$handleNotSupport$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final PlaylistRepository.d $notSupportType;
    private Object L$0;
    int label;
    final PlaylistErrorStateService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistErrorStateService$handleNotSupport$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistErrorStateService$handleNotSupport$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final PlaylistRepository.d $notSupportType;
        private Object L$0;
        int label;
        final PlaylistErrorStateService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistRepository.d dVar, PlaylistErrorStateService playlistErrorStateService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$notSupportType = dVar;
            this.this$0 = playlistErrorStateService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(PlaylistErrorStateService playlistErrorStateService, PlaylistRepository.d dVar) {
            playlistErrorStateService.getClass();
            if ((dVar instanceof PlaylistRepository.d.f) || (dVar instanceof PlaylistRepository.d.e)) {
                defpackage.a.b("[theseus-playlist-PlaylistErrorStateService-handleButtonClick] ", "button clicked: " + dVar, "PlaylistErrorStateService-handleButtonClick");
            } else {
                String str = dVar.f95136a.f95239m;
                if (str.length() != 0) {
                    BLRouter.routeTo(new RouteRequest.Builder(str).extras(new Ly0.K(playlistErrorStateService, 1)).requestCode(-1).build(), playlistErrorStateService.f95036d);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(PlaylistRepository.d dVar, CoroutineScope coroutineScope, PlaylistErrorStateService playlistErrorStateService) {
            if (dVar instanceof PlaylistRepository.d.e) {
                return Unit.INSTANCE;
            }
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistErrorStateService$handleNotSupport$2$1$2$1(playlistErrorStateService, null), 3, (Object) null);
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$notSupportType, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [com.bilibili.ship.theseus.playlist.q] */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                PlaylistRepository.d dVar = this.$notSupportType;
                String string = dVar instanceof PlaylistRepository.d.f ? this.this$0.f95036d.getString(2131851640) : dVar instanceof PlaylistRepository.d.a ? this.this$0.f95036d.getString(2131851643) : dVar instanceof PlaylistRepository.d.e ? this.this$0.f95036d.getString(2131851671) : dVar instanceof PlaylistRepository.d.b ? this.this$0.f95036d.getString(2131851665) : dVar instanceof PlaylistRepository.d.h ? this.this$0.f95036d.getString(2131851638) : dVar instanceof PlaylistRepository.d.c ? this.this$0.f95036d.getString(2131851642) : dVar instanceof PlaylistRepository.d.C0769d ? this.this$0.f95036d.getString(2131851670) : this.this$0.f95036d.getString(2131851572);
                PlaylistRepository.d dVar2 = this.$notSupportType;
                String string2 = dVar2 instanceof PlaylistRepository.d.f ? this.this$0.f95036d.getString(2131851637) : ((dVar2 instanceof PlaylistRepository.d.e) || (dVar2 instanceof PlaylistRepository.d.g) || (dVar2 instanceof PlaylistRepository.d.b)) ? "" : this.this$0.f95036d.getString(2131851635);
                PlaylistRepository.d dVar3 = this.$notSupportType;
                String string3 = "";
                if (!(dVar3 instanceof PlaylistRepository.d.f)) {
                    string3 = "";
                    if (!(dVar3 instanceof PlaylistRepository.d.e)) {
                        string3 = "";
                        if (!(dVar3 instanceof PlaylistRepository.d.g)) {
                            string3 = dVar3 instanceof PlaylistRepository.d.c ? "" : ((dVar3 instanceof PlaylistRepository.d.b) || (dVar3 instanceof PlaylistRepository.d.h)) ? this.this$0.f95036d.getString(2131851659) : this.this$0.f95036d.getString(2131851645);
                        }
                    }
                }
                int i8 = this.$notSupportType instanceof PlaylistRepository.d.e ? -1 : 5;
                TheseusFloatLayerService theseusFloatLayerService = this.this$0.f95038f;
                z.a aVar = new z.a(string, string3, i8, string2);
                final PlaylistErrorStateService playlistErrorStateService = this.this$0;
                MutableSharedFlow<Unit> mutableSharedFlow = playlistErrorStateService.f95042k;
                final PlaylistRepository.d dVar4 = this.$notSupportType;
                com.bilibili.ship.theseus.playlist.uicomponent.z zVar = new com.bilibili.ship.theseus.playlist.uicomponent.z(aVar, mutableSharedFlow, new Function0(playlistErrorStateService, dVar4) { // from class: com.bilibili.ship.theseus.playlist.q

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final PlaylistErrorStateService f95830a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final PlaylistRepository.d f95831b;

                    {
                        this.f95830a = playlistErrorStateService;
                        this.f95831b = dVar4;
                    }

                    public final Object invoke() {
                        return PlaylistErrorStateService$handleNotSupport$2.AnonymousClass1.invokeSuspend$lambda$0(this.f95830a, this.f95831b);
                    }
                }, new r(dVar4, coroutineScope, playlistErrorStateService));
                this.label = 1;
                if (theseusFloatLayerService.i(zVar, null, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistErrorStateService$handleNotSupport$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistErrorStateService$handleNotSupport$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistErrorStateService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlaylistErrorStateService playlistErrorStateService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = playlistErrorStateService;
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
                FloatLayerManager floatLayerManager = this.this$0.f95041j;
                com.bilibili.ship.theseus.playlist.uicomponent.w wVar = new com.bilibili.ship.theseus.playlist.uicomponent.w(this.this$0.f95036d.getString(2131851572));
                this.label = 1;
                if (floatLayerManager.b(wVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistErrorStateService$handleNotSupport$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistErrorStateService$handleNotSupport$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistErrorStateService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PlaylistErrorStateService playlistErrorStateService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = playlistErrorStateService;
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
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    BLog.i("PlaylistErrorStateService$handleNotSupport$2$3-invokeSuspend", "[theseus-playlist-PlaylistErrorStateService$handleNotSupport$2$3-invokeSuspend] Error call player pause");
                    this.this$0.f95040i.pause();
                    this.this$0.f95040i.h("PlaylistNotSupportService");
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
                this.this$0.f95040i.i("PlaylistNotSupportService");
                BLog.i("PlaylistErrorStateService$handleNotSupport$2$3-invokeSuspend", "[theseus-playlist-PlaylistErrorStateService$handleNotSupport$2$3-invokeSuspend] Canceling show not support layer job.");
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistErrorStateService$handleNotSupport$2(PlaylistRepository.d dVar, PlaylistErrorStateService playlistErrorStateService, Continuation<? super PlaylistErrorStateService$handleNotSupport$2> continuation) {
        super(2, continuation);
        this.$notSupportType = dVar;
        this.this$0 = playlistErrorStateService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlaylistErrorStateService$handleNotSupport$2 playlistErrorStateService$handleNotSupport$2 = new PlaylistErrorStateService$handleNotSupport$2(this.$notSupportType, this.this$0, continuation);
        playlistErrorStateService$handleNotSupport$2.L$0 = obj;
        return playlistErrorStateService$handleNotSupport$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BLog.i("PlaylistErrorStateService$handleNotSupport$2-invokeSuspend", "[theseus-playlist-PlaylistErrorStateService$handleNotSupport$2-invokeSuspend] show not support layer.");
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$notSupportType, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, null), 3, (Object) null);
    }
}
