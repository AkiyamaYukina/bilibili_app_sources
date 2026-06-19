package com.bilibili.ship.theseus.ogv.toolbar;

import Nu0.d;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.lib.media.resource.PlayConfig;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.service.setting.PlayerSettingServiceKtxKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/toolbar/ToolbarTogetherWatchRepository.class */
@StabilityInferred(parameters = 0)
public final class ToolbarTogetherWatchRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ToolbarRepository f94576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f94577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f94578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final d f94579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ComposeView f94580f;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.toolbar.ToolbarTogetherWatchRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/toolbar/ToolbarTogetherWatchRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ToolbarTogetherWatchRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.toolbar.ToolbarTogetherWatchRepository$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/toolbar/ToolbarTogetherWatchRepository$1$1.class */
        public static final class C07481 extends SuspendLambda implements Function3<Oi1.d, OgvEpisode, Continuation<? super Boolean>, Object> {
            Object L$0;
            Object L$1;
            int label;

            public C07481(Continuation<? super C07481> continuation) {
                super(3, continuation);
            }

            public final Object invoke(Oi1.d dVar, OgvEpisode ogvEpisode, Continuation<? super Boolean> continuation) {
                C07481 c07481 = new C07481(continuation);
                c07481.L$0 = dVar;
                c07481.L$1 = ogvEpisode;
                return c07481.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                PlayConfig.PlayMenuConfig playMenuConfig;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Oi1.d dVar = (Oi1.d) this.L$0;
                OgvEpisode ogvEpisode = (OgvEpisode) this.L$1;
                PlayConfig playConfig = dVar.b;
                return Boxing.boxBoolean((playConfig != null && (playMenuConfig = playConfig.C) != null && playMenuConfig.a) && !(ogvEpisode != null ? ogvEpisode.h() : false));
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.toolbar.ToolbarTogetherWatchRepository$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/toolbar/ToolbarTogetherWatchRepository$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final ToolbarTogetherWatchRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ToolbarTogetherWatchRepository toolbarTogetherWatchRepository, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = toolbarTogetherWatchRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
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
                if (this.Z$0) {
                    this.this$0.f94580f.setVisibility(0);
                } else {
                    this.this$0.f94580f.setVisibility(8);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ToolbarTogetherWatchRepository toolbarTogetherWatchRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = toolbarTogetherWatchRepository;
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
                Flow flowCombine = FlowKt.combine(PlayerSettingServiceKtxKt.a(this.this$0.f94577c), this.this$0.f94578d.f92119v, new C07481(null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass2, this) == coroutine_suspended) {
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
    public ToolbarTogetherWatchRepository(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull ToolbarRepository toolbarRepository, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull d dVar) {
        this.f94575a = coroutineScope;
        this.f94576b = toolbarRepository;
        this.f94577c = iPlayerSettingService;
        this.f94578d = ogvCurrentEpisodeRepository;
        this.f94579e = dVar;
        this.f94580f = new ComposeView(context, null, 0, 6, null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.compose.runtime.Composer r10, int r11) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.toolbar.ToolbarTogetherWatchRepository.a(androidx.compose.runtime.Composer, int):void");
    }
}
