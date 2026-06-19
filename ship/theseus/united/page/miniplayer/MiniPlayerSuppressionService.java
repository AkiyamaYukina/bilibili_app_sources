package com.bilibili.ship.theseus.united.page.miniplayer;

import Oi1.d;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository;
import com.bilibili.ship.theseus.united.page.charge.ChargeRepository;
import com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository;
import com.bilibili.ship.theseus.united.page.toolbar.actionview.miniplayer.ToolbarMiniPlayerRepository;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/MiniPlayerSuppressionService.class */
@StabilityInferred(parameters = 0)
public final class MiniPlayerSuppressionService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f102033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TheseusCastScreenRepository f102034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final b f102035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final h f102036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.miniplayer.a f102037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ToolbarRepository f102038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ToolbarMiniPlayerRepository f102039g;

    @NotNull
    public final StateFlow<Boolean> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f102040i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f102041j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ChargeRepository f102042k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final a f102043l = new a(this);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.miniplayer.MiniPlayerSuppressionService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/MiniPlayerSuppressionService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final MiniPlayerSuppressionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.miniplayer.MiniPlayerSuppressionService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/MiniPlayerSuppressionService$1$1.class */
        public static final class C10701 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            int label;
            final MiniPlayerSuppressionService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10701(MiniPlayerSuppressionService miniPlayerSuppressionService, Continuation<? super C10701> continuation) {
                super(2, continuation);
                this.this$0 = miniPlayerSuppressionService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C10701(this.this$0, continuation);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MiniPlayerSuppressionService miniPlayerSuppressionService = this.this$0;
                com.bilibili.ship.theseus.united.page.miniplayer.a aVar = miniPlayerSuppressionService.f102037e;
                aVar.getClass();
                boolean zC = com.bilibili.ship.theseus.united.page.miniplayer.a.c();
                boolean zD = aVar.d();
                boolean z6 = true;
                if (!miniPlayerSuppressionService.f102037e.e() && (zC || zD)) {
                    z6 = false;
                }
                ToolbarMiniPlayerRepository toolbarMiniPlayerRepository = miniPlayerSuppressionService.f102039g;
                if (z6) {
                    toolbarMiniPlayerRepository.b("autoMiniPlayerSettingSuppressor");
                } else {
                    toolbarMiniPlayerRepository.a("autoMiniPlayerSettingSuppressor");
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MiniPlayerSuppressionService miniPlayerSuppressionService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = miniPlayerSuppressionService;
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
                MiniPlayerSuppressionService miniPlayerSuppressionService = this.this$0;
                Flow<Boolean> flow = miniPlayerSuppressionService.f102038f.f103289m;
                C10701 c10701 = new C10701(miniPlayerSuppressionService, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c10701, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/MiniPlayerSuppressionService$a.class */
    public static final class a implements tv.danmaku.biliplayerv2.service.setting.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MiniPlayerSuppressionService f102044a;

        public a(MiniPlayerSuppressionService miniPlayerSuppressionService) {
            this.f102044a = miniPlayerSuppressionService;
        }

        public final void c() {
            MiniPlayerSuppressionService.a(this.f102044a);
        }
    }

    @Inject
    public MiniPlayerSuppressionService(@NotNull CoroutineScope coroutineScope, @NotNull TheseusCastScreenRepository theseusCastScreenRepository, @NotNull b bVar, @NotNull h hVar, @NotNull com.bilibili.ship.theseus.united.page.miniplayer.a aVar, @NotNull ToolbarRepository toolbarRepository, @NotNull ToolbarMiniPlayerRepository toolbarMiniPlayerRepository, @NotNull StateFlow<Boolean> stateFlow, @NotNull StateFlow<Boolean> stateFlow2, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull ChargeRepository chargeRepository) {
        this.f102033a = coroutineScope;
        this.f102034b = theseusCastScreenRepository;
        this.f102035c = bVar;
        this.f102036d = hVar;
        this.f102037e = aVar;
        this.f102038f = toolbarRepository;
        this.f102039g = toolbarMiniPlayerRepository;
        this.h = stateFlow;
        this.f102040i = stateFlow2;
        this.f102041j = iPlayerSettingService;
        this.f102042k = chargeRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MiniPlayerSuppressionService$collectCastScreenState$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MiniPlayerSuppressionService$observeCloudConfig$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MiniPlayerSuppressionService$observeTeenagersMode$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MiniPlayerSuppressionService$observeLessonsMode$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MiniPlayerSuppressionService$collectPlayerState$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MiniPlayerSuppressionService$collectAutoMiniSuppress$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MiniPlayerSuppressionService$collectChargeAdUnlocking$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MiniPlayerSuppressionService$collectMiniPlayerAutoPlaySetting$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public static final void a(MiniPlayerSuppressionService miniPlayerSuppressionService) {
        d.a aVarM;
        IPlayerSettingService iPlayerSettingService = miniPlayerSuppressionService.f102041j;
        boolean zG = iPlayerSettingService.getCloudConfig().G();
        ToolbarMiniPlayerRepository toolbarMiniPlayerRepository = miniPlayerSuppressionService.f102039g;
        b bVar = miniPlayerSuppressionService.f102035c;
        if (!zG || ((aVarM = iPlayerSettingService.getCloudConfig().m()) != null && aVarM.a)) {
            bVar.a("cloudConfigSuppressor");
            toolbarMiniPlayerRepository.a("cloudConfigSuppressor");
        } else {
            bVar.b("cloudConfigSuppressor");
            toolbarMiniPlayerRepository.b("cloudConfigSuppressor");
        }
    }
}
