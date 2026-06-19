package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.api.SearchBangumiItem;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IRenderContainerService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.ijk.media.player.render.tools.BiliDaltonizer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/DaltonismEnforcingService.class */
@StabilityInferred(parameters = 0)
public final class DaltonismEnforcingService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IRenderContainerService f104748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f104749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f104750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104751d;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.playercontainer.DaltonismEnforcingService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/DaltonismEnforcingService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final DaltonismEnforcingService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.playercontainer.DaltonismEnforcingService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/DaltonismEnforcingService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DaltonismEnforcingService f104752a;

            public a(DaltonismEnforcingService daltonismEnforcingService) {
                this.f104752a = daltonismEnforcingService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                com.bilibili.player.tangram.basic.a aVar = (com.bilibili.player.tangram.basic.a) obj;
                if (aVar != null) {
                    int i7 = aVar.f79320a;
                    boolean zB = com.bilibili.player.tangram.basic.a.b(i7, SearchBangumiItem.TYPE_FULLNET_DOCUMENTARY);
                    DaltonismEnforcingService daltonismEnforcingService = this.f104752a;
                    IRenderContainerService iRenderContainerService = daltonismEnforcingService.f104748a;
                    if (zB || com.bilibili.player.tangram.basic.a.b(i7, 129) || com.bilibili.player.tangram.basic.a.b(i7, SearchBangumiItem.TYPE_FULLNET_MOVIE)) {
                        iRenderContainerService.setDaltonism(BiliDaltonizer.ColorBlindnessType.None);
                    } else {
                        daltonismEnforcingService.f104750c.getCloudConfig().getClass();
                        int iF = Oi1.d.f();
                        if (iF == 0) {
                            iRenderContainerService.setDaltonism(BiliDaltonizer.ColorBlindnessType.None);
                        } else if (iF == 1) {
                            iRenderContainerService.setDaltonism(BiliDaltonizer.ColorBlindnessType.Protanomaly);
                        } else if (iF == 2) {
                            iRenderContainerService.setDaltonism(BiliDaltonizer.ColorBlindnessType.Deuteranomaly);
                        } else if (iF == 3) {
                            iRenderContainerService.setDaltonism(BiliDaltonizer.ColorBlindnessType.Tritanomaly);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DaltonismEnforcingService daltonismEnforcingService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = daltonismEnforcingService;
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
                DaltonismEnforcingService daltonismEnforcingService = this.this$0;
                MutableStateFlow<com.bilibili.player.tangram.basic.a> mutableStateFlow = daltonismEnforcingService.f104749b.f91109c.f79295b;
                a aVar = new a(daltonismEnforcingService);
                this.label = 1;
                if (mutableStateFlow.collect(aVar, this) == coroutine_suspended) {
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

    @Inject
    public DaltonismEnforcingService(@NotNull IRenderContainerService iRenderContainerService, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull CoroutineScope coroutineScope) {
        this.f104748a = iRenderContainerService;
        this.f104749b = hVar;
        this.f104750c = iPlayerSettingService;
        this.f104751d = coroutineScope;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
