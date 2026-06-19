package com.bilibili.ship.theseus.united.player.mediaplay;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.media.resource.MediaResource;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IMediaResourceObserver;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaPlayDRMRepository.class */
@StabilityInferred(parameters = 0)
public final class MediaPlayDRMRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<DRMState> f104490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow f104491b;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.MediaPlayDRMRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaPlayDRMRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final IPlayerCoreService $playerCoreService;
        Object L$0;
        int label;
        final MediaPlayDRMRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.MediaPlayDRMRepository$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaPlayDRMRepository$1$a.class */
        public static final class a implements IMediaResourceObserver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MediaPlayDRMRepository f104492a;

            public a(MediaPlayDRMRepository mediaPlayDRMRepository) {
                this.f104492a = mediaPlayDRMRepository;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onUpdated(com.bilibili.lib.media.resource.MediaResource r4) {
                /*
                    r3 = this;
                    r0 = r3
                    com.bilibili.ship.theseus.united.player.mediaplay.MediaPlayDRMRepository r0 = r0.f104492a
                    kotlinx.coroutines.flow.MutableStateFlow<com.bilibili.ship.theseus.united.player.mediaplay.MediaPlayDRMRepository$DRMState> r0 = r0.f104490a
                    r5 = r0
                    r0 = r4
                    if (r0 == 0) goto L25
                    r0 = r4
                    boolean r0 = r0.isDrm()
                    if (r0 == 0) goto L1a
                    com.bilibili.ship.theseus.united.player.mediaplay.MediaPlayDRMRepository$DRMState r0 = com.bilibili.ship.theseus.united.player.mediaplay.MediaPlayDRMRepository.DRMState.DRM
                    r4 = r0
                    goto L1e
                L1a:
                    com.bilibili.ship.theseus.united.player.mediaplay.MediaPlayDRMRepository$DRMState r0 = com.bilibili.ship.theseus.united.player.mediaplay.MediaPlayDRMRepository.DRMState.NO_DRM
                    r4 = r0
                L1e:
                    r0 = r4
                    if (r0 == 0) goto L25
                    goto L29
                L25:
                    com.bilibili.ship.theseus.united.player.mediaplay.MediaPlayDRMRepository$DRMState r0 = com.bilibili.ship.theseus.united.player.mediaplay.MediaPlayDRMRepository.DRMState.UNKNOWN
                    r4 = r0
                L29:
                    r0 = r5
                    r1 = r4
                    r0.setValue(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.mediaplay.MediaPlayDRMRepository.AnonymousClass1.a.onUpdated(com.bilibili.lib.media.resource.MediaResource):void");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IPlayerCoreService iPlayerCoreService, MediaPlayDRMRepository mediaPlayDRMRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$playerCoreService = iPlayerCoreService;
            this.this$0 = mediaPlayDRMRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$playerCoreService, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar;
            a aVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                aVar = new a(this.this$0);
                try {
                    this.$playerCoreService.addMediaResourceObserver(aVar);
                    this.L$0 = aVar;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th) {
                    th = th;
                    this.$playerCoreService.removeMediaResourceObserver(aVar);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a aVar3 = (a) this.L$0;
                aVar2 = aVar3;
                try {
                    ResultKt.throwOnFailure(obj);
                    aVar = aVar3;
                } catch (Throwable th2) {
                    aVar = aVar2;
                    th = th2;
                    this.$playerCoreService.removeMediaResourceObserver(aVar);
                    throw th;
                }
            }
            aVar2 = aVar;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/MediaPlayDRMRepository$DRMState.class */
    public static final class DRMState {
        private static final EnumEntries $ENTRIES;
        private static final DRMState[] $VALUES;
        public static final DRMState DRM = new DRMState("DRM", 0);
        public static final DRMState NO_DRM = new DRMState("NO_DRM", 1);
        public static final DRMState UNKNOWN = new DRMState("UNKNOWN", 2);

        private static final /* synthetic */ DRMState[] $values() {
            return new DRMState[]{DRM, NO_DRM, UNKNOWN};
        }

        static {
            DRMState[] dRMStateArr$values = $values();
            $VALUES = dRMStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(dRMStateArr$values);
        }

        private DRMState(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<DRMState> getEntries() {
            return $ENTRIES;
        }

        public static DRMState valueOf(String str) {
            return (DRMState) Enum.valueOf(DRMState.class, str);
        }

        public static DRMState[] values() {
            return (DRMState[]) $VALUES.clone();
        }
    }

    @Inject
    public MediaPlayDRMRepository(@NotNull CoroutineScope coroutineScope, @NotNull IPlayerCoreService iPlayerCoreService) {
        MediaResource mediaResource = iPlayerCoreService.getMediaResource();
        MutableStateFlow<DRMState> MutableStateFlow = StateFlowKt.MutableStateFlow(mediaResource == null ? DRMState.UNKNOWN : mediaResource.isDrm() ? DRMState.DRM : DRMState.NO_DRM);
        this.f104490a = MutableStateFlow;
        this.f104491b = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(iPlayerCoreService, this, null), 3, (Object) null);
    }
}
