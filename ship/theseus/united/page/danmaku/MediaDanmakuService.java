package com.bilibili.ship.theseus.united.page.danmaku;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.base.player.GeminiCommonResolverParams;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import java.util.Map;
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
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.local.ILocalHandler;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.local.RpcInvokeObserver;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.GetWorkInfo;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateCurrentWork;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateShipChain;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/MediaDanmakuService.class */
@StabilityInferred(parameters = 0)
public final class MediaDanmakuService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f99504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.j f99505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final wv0.a f99506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f99507d = new a(this);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.MediaDanmakuService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/MediaDanmakuService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final IInteractLayerService $interactService;
        int label;
        final MediaDanmakuService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MediaDanmakuService mediaDanmakuService, IInteractLayerService iInteractLayerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = mediaDanmakuService;
            this.$interactService = iInteractLayerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$interactService, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.this$0.f99506c.f129025a.f129027a == GeminiCommonResolverParams.Scene.OFFLINE) {
                    ILocalHandler localHandler = this.$interactService.getLocalHandler();
                    if (localHandler != null) {
                        localHandler.registerRpcInvokeObserver(this.this$0.f99507d);
                    }
                    com.bilibili.ship.theseus.keel.player.j jVar = this.this$0.f99505b;
                    this.label = 1;
                    if (jVar.u(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!ConnectivityMonitor.getInstance().isNetworkActive()) {
                IInteractLayerService.reloadViewProgress$default(this.$interactService, false, (Map) null, 3, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/MediaDanmakuService$a.class */
    public static final class a implements RpcInvokeObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaDanmakuService f99508a;

        public a(MediaDanmakuService mediaDanmakuService) {
            this.f99508a = mediaDanmakuService;
        }

        public final UpdateShipChain.Response getRelationshipChain() {
            return null;
        }

        public final UpdateCurrentWork.Response onRpcGetCurrentWork() {
            UpdateCurrentWork.Response response = new UpdateCurrentWork.Response();
            MediaDanmakuService mediaDanmakuService = this.f99508a;
            response.setWorkId(String.valueOf(mediaDanmakuService.f99505b.f().getAvid()));
            response.setVideoId(String.valueOf(mediaDanmakuService.f99505b.f().getCid()));
            return response;
        }

        public final GetWorkInfo.Response onRpcGetWorkInfo() {
            GetWorkInfo.Response response = new GetWorkInfo.Response();
            MediaDanmakuService mediaDanmakuService = this.f99508a;
            response.setWorkId(String.valueOf(mediaDanmakuService.f99505b.f().getAvid()));
            response.setVideoId(String.valueOf(mediaDanmakuService.f99505b.f().getCid()));
            return response;
        }

        public final boolean onUpdateCurrentWork(UpdateCurrentWork.Request request) {
            return true;
        }
    }

    @Inject
    public MediaDanmakuService(@NotNull CoroutineScope coroutineScope, @NotNull IInteractLayerService iInteractLayerService, @NotNull com.bilibili.ship.theseus.keel.player.j jVar, @NotNull wv0.a aVar) {
        this.f99504a = coroutineScope;
        this.f99505b = jVar;
        this.f99506c = aVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, iInteractLayerService, null), 3, (Object) null);
    }
}
