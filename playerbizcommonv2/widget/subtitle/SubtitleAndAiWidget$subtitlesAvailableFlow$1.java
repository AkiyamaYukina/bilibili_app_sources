package com.bilibili.playerbizcommonv2.widget.subtitle;

import com.bapis.bilibili.community.service.dm.v1.VideoSubtitle;
import com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget$subtitlesAvailableFlow$1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.ISubtitleDataChangedObserver;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiWidget$subtitlesAvailableFlow$1.class */
final class SubtitleAndAiWidget$subtitlesAvailableFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super Boolean>, Continuation<? super Unit>, Object> {
    final IControlContainerService $controlContainerService;
    final IInteractLayerService $interactLayerService;
    final IPlayerSettingService $playerSettingService;
    private Object L$0;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiWidget$subtitlesAvailableFlow$1$a.class */
    public static final class a implements tv.danmaku.biliplayerv2.service.setting.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final H0 f83599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ProducerScope<Boolean> f83600b;

        public a(H0 h02, ProducerScope producerScope) {
            this.f83599a = h02;
            this.f83600b = producerScope;
        }

        public final void c() {
            this.f83600b.trySend-JP2dKIU((Boolean) this.f83599a.invoke());
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiWidget$subtitlesAvailableFlow$1$b.class */
    public static final class b implements ISubtitleDataChangedObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final H0 f83601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ProducerScope<Boolean> f83602b;

        public b(H0 h02, ProducerScope producerScope) {
            this.f83601a = h02;
            this.f83602b = producerScope;
        }

        public final void onSubtitleDataChanged(VideoSubtitle videoSubtitle) {
            this.f83602b.trySend-JP2dKIU((Boolean) this.f83601a.invoke());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubtitleAndAiWidget$subtitlesAvailableFlow$1(IInteractLayerService iInteractLayerService, IPlayerSettingService iPlayerSettingService, IControlContainerService iControlContainerService, Continuation<? super SubtitleAndAiWidget$subtitlesAvailableFlow$1> continuation) {
        super(2, continuation);
        this.$interactLayerService = iInteractLayerService;
        this.$playerSettingService = iPlayerSettingService;
        this.$controlContainerService = iControlContainerService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(IPlayerSettingService iPlayerSettingService, IInteractLayerService iInteractLayerService, IControlContainerService iControlContainerService) {
        Oi1.d cloudConfig = iPlayerSettingService.getCloudConfig();
        boolean z6 = iInteractLayerService.isSubtitleAvailable() && cloudConfig.S();
        boolean zR = iControlContainerService.getScreenModeType() == ScreenModeType.VERTICAL_FULLSCREEN ? true : cloudConfig.r();
        VideoSubtitle subtitleData = iInteractLayerService.getSubtitleData();
        boolean z7 = subtitleData != null && subtitleData.getSubtitlesList().size() > 0;
        boolean z8 = false;
        if (zR) {
            z8 = false;
            if (z6) {
                z8 = false;
                if (z7) {
                    z8 = true;
                }
            }
        }
        return z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(IInteractLayerService iInteractLayerService, b bVar, IPlayerSettingService iPlayerSettingService, a aVar) {
        iInteractLayerService.removeSubtitleDataChangedObserver(bVar);
        iPlayerSettingService.removeCloudConfigObserver(aVar);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SubtitleAndAiWidget$subtitlesAvailableFlow$1 subtitleAndAiWidget$subtitlesAvailableFlow$1 = new SubtitleAndAiWidget$subtitlesAvailableFlow$1(this.$interactLayerService, this.$playerSettingService, this.$controlContainerService, continuation);
        subtitleAndAiWidget$subtitlesAvailableFlow$1.L$0 = obj;
        return subtitleAndAiWidget$subtitlesAvailableFlow$1;
    }

    public final Object invoke(ProducerScope<? super Boolean> producerScope, Continuation<? super Unit> continuation) {
        return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            H0 h02 = new H0(this.$playerSettingService, this.$interactLayerService, this.$controlContainerService);
            final b bVar = new b(h02, producerScope);
            final a aVar = new a(h02, producerScope);
            producerScope.trySend-JP2dKIU(h02.invoke());
            this.$interactLayerService.addSubtitleDataChangedObserver(bVar);
            this.$playerSettingService.addCloudConfigObserver(aVar);
            final IInteractLayerService iInteractLayerService = this.$interactLayerService;
            final IPlayerSettingService iPlayerSettingService = this.$playerSettingService;
            Function0 function0 = new Function0(iInteractLayerService, bVar, iPlayerSettingService, aVar) { // from class: com.bilibili.playerbizcommonv2.widget.subtitle.I0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final IInteractLayerService f83514a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final SubtitleAndAiWidget$subtitlesAvailableFlow$1.b f83515b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final IPlayerSettingService f83516c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final SubtitleAndAiWidget$subtitlesAvailableFlow$1.a f83517d;

                {
                    this.f83514a = iInteractLayerService;
                    this.f83515b = bVar;
                    this.f83516c = iPlayerSettingService;
                    this.f83517d = aVar;
                }

                public final Object invoke() {
                    SubtitleAndAiWidget$subtitlesAvailableFlow$1.a aVar2 = this.f83517d;
                    return SubtitleAndAiWidget$subtitlesAvailableFlow$1.invokeSuspend$lambda$1(this.f83514a, this.f83515b, this.f83516c, aVar2);
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
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
