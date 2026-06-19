package com.bilibili.ship.theseus.united.page.videoquality;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import java.util.ArrayList;
import java.util.Comparator;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.videoplayer.coreV2.adapter.ijk.IjkMediaItem;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityParamsConfigService.class */
@StabilityInferred(parameters = 0)
public final class TheseusPlayerQualityParamsConfigService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f103766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f103767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IReporterService f103768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PlayViewUniteReply f103769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.a f103770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f103771g;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityParamsConfigService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityParamsConfigService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPlayerQualityParamsConfigService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityParamsConfigService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityParamsConfigService$1$1.class */
        public static final class C11531 extends SuspendLambda implements Function2<c.a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final TheseusPlayerQualityParamsConfigService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11531(TheseusPlayerQualityParamsConfigService theseusPlayerQualityParamsConfigService, Continuation<? super C11531> continuation) {
                super(2, continuation);
                this.this$0 = theseusPlayerQualityParamsConfigService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C11531 c11531 = new C11531(this.this$0, continuation);
                c11531.L$0 = obj;
                return c11531;
            }

            public final Object invoke(c.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c.a aVar = (c.a) this.L$0;
                IPlayerCoreService iPlayerCoreService = this.this$0.f103766b;
                ScreenState screenState = !aVar.f102988b ? ScreenState.STATE_HALF : ScreenState.STATE_FULL;
                IjkMediaItem currentMediaItem = iPlayerCoreService.getCurrentMediaItem();
                IjkMediaItem ijkMediaItem = currentMediaItem instanceof IjkMediaItem ? currentMediaItem : null;
                if (ijkMediaItem != null) {
                    BLog.i("PlayerQualityParamsConfigService", "updateScreenState: " + screenState);
                    ijkMediaItem.setScreenState(screenState.getValue());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusPlayerQualityParamsConfigService theseusPlayerQualityParamsConfigService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusPlayerQualityParamsConfigService;
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
                StateFlow stateFlowC = this.this$0.f103767c.c();
                C11531 c11531 = new C11531(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowC, c11531, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityParamsConfigService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityParamsConfigService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final TheseusPlayerQualityParamsConfigService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityParamsConfigService$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityParamsConfigService$2$a.class */
        public static final class a implements tv.danmaku.biliplayerv2.service.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TheseusPlayerQualityParamsConfigService f103772a;

            public a(TheseusPlayerQualityParamsConfigService theseusPlayerQualityParamsConfigService) {
                this.f103772a = theseusPlayerQualityParamsConfigService;
            }

            public final void b() {
            }

            public final void e() {
                TheseusPlayerQualityParamsConfigService theseusPlayerQualityParamsConfigService = this.f103772a;
                MediaResource mediaResource = theseusPlayerQualityParamsConfigService.f103766b.getMediaResource();
                if (mediaResource == null) {
                    return;
                }
                TheseusPlayerQualityParamsConfigService.a(theseusPlayerQualityParamsConfigService, mediaResource);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TheseusPlayerQualityParamsConfigService theseusPlayerQualityParamsConfigService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = theseusPlayerQualityParamsConfigService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar;
            a aVar2;
            a aVar3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusPlayerQualityParamsConfigService theseusPlayerQualityParamsConfigService = this.this$0;
                aVar = new a(theseusPlayerQualityParamsConfigService);
                try {
                    theseusPlayerQualityParamsConfigService.f103766b.addMediaCenterObserver(aVar);
                    this.L$0 = aVar;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th) {
                    th = th;
                    aVar2 = aVar;
                    this.this$0.f103766b.removeMediaCenterObserver(aVar2);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a aVar4 = (a) this.L$0;
                aVar3 = aVar4;
                try {
                    ResultKt.throwOnFailure(obj);
                    aVar = aVar4;
                } catch (Throwable th2) {
                    aVar2 = aVar3;
                    th = th2;
                    this.this$0.f103766b.removeMediaCenterObserver(aVar2);
                    throw th;
                }
            }
            aVar3 = aVar;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityParamsConfigService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityParamsConfigService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPlayerQualityParamsConfigService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TheseusPlayerQualityParamsConfigService theseusPlayerQualityParamsConfigService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = theseusPlayerQualityParamsConfigService;
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
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowCallbackFlow = FlowKt.callbackFlow(new TheseusPlayerQualityParamsConfigService$Companion$mediaResourceUpdateFlow$1(this.this$0.f103766b, null));
                this.label = 1;
                Object objFirstOrNull = FlowKt.firstOrNull(flowCallbackFlow, this);
                obj = objFirstOrNull;
                if (objFirstOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MediaResource mediaResource = (MediaResource) obj;
            if (mediaResource == null) {
                return Unit.INSTANCE;
            }
            TheseusPlayerQualityParamsConfigService.a(this.this$0, mediaResource);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityParamsConfigService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityParamsConfigService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPlayerQualityParamsConfigService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(TheseusPlayerQualityParamsConfigService theseusPlayerQualityParamsConfigService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = theseusPlayerQualityParamsConfigService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ff  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 368
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityParamsConfigService.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityParamsConfigService$ScreenState.class */
    public static final class ScreenState {
        private static final EnumEntries $ENTRIES;
        private static final ScreenState[] $VALUES;
        private final int value;
        public static final ScreenState STATE_HALF = new ScreenState("STATE_HALF", 0, 0);
        public static final ScreenState STATE_FULL = new ScreenState("STATE_FULL", 1, 1);
        public static final ScreenState STATE_STORY = new ScreenState("STATE_STORY", 2, 2);
        public static final ScreenState STATE_MINI = new ScreenState("STATE_MINI", 3, 3);

        private static final /* synthetic */ ScreenState[] $values() {
            return new ScreenState[]{STATE_HALF, STATE_FULL, STATE_STORY, STATE_MINI};
        }

        static {
            ScreenState[] screenStateArr$values = $values();
            $VALUES = screenStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(screenStateArr$values);
        }

        private ScreenState(String str, int i7, int i8) {
            this.value = i8;
        }

        @NotNull
        public static EnumEntries<ScreenState> getEntries() {
            return $ENTRIES;
        }

        public static ScreenState valueOf(String str) {
            return (ScreenState) Enum.valueOf(ScreenState.class, str);
        }

        public static ScreenState[] values() {
            return (ScreenState[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Inject
    public TheseusPlayerQualityParamsConfigService(@NotNull CoroutineScope coroutineScope, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull IReporterService iReporterService, @NotNull PlayViewUniteReply playViewUniteReply, @NotNull com.bilibili.ship.theseus.united.page.playingarea.a aVar, @NotNull com.bilibili.ship.theseus.keel.player.h hVar) {
        this.f103765a = coroutineScope;
        this.f103766b = iPlayerCoreService;
        this.f103767c = cVar;
        this.f103768d = iReporterService;
        this.f103769e = playViewUniteReply;
        this.f103770f = aVar;
        this.f103771g = hVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bilibili.ship.theseus.united.page.videoquality.V] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.bilibili.ship.theseus.united.page.videoquality.U, java.lang.Object] */
    public static final void a(TheseusPlayerQualityParamsConfigService theseusPlayerQualityParamsConfigService, MediaResource mediaResource) {
        theseusPlayerQualityParamsConfigService.getClass();
        ArrayList arrayList = mediaResource.mVodIndex.mVodList;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        final ?? obj = new Object();
        PlayIndex playIndex = (PlayIndex) CollectionsKt.q(arrayList, (V) new Comparator(obj) { // from class: com.bilibili.ship.theseus.united.page.videoquality.V

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final U f103841a;

            {
                this.f103841a = obj;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((Number) this.f103841a.invoke(obj2, obj3)).intValue();
            }
        });
        if (playIndex == null) {
            return;
        }
        IjkMediaItem currentMediaItem = theseusPlayerQualityParamsConfigService.f103766b.getCurrentMediaItem();
        IjkMediaItem ijkMediaItem = currentMediaItem instanceof IjkMediaItem ? currentMediaItem : null;
        if (ijkMediaItem == null) {
            return;
        }
        bilibili.live.app.service.resolver.c.a(playIndex.mQuality, "updateMaxQn: ", "PlayerQualityParamsConfigService");
        ijkMediaItem.setItemMaxQn(playIndex.mQuality);
    }
}
