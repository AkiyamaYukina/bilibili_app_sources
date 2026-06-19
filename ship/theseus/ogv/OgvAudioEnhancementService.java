package com.bilibili.ship.theseus.ogv;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository;
import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.router.PlayerRouteUris;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvAudioEnhancementService.class */
@StabilityInferred(parameters = 0)
public final class OgvAudioEnhancementService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f91242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Fr0.j f91243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final EpisodeExtraInfoRepository f91244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.restrictionlayer.G f91245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f91246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f91247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final BiliAccountInfo f91248g;

    @NotNull
    public final Context h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final OgvAudioEnhancementService$audioEnhancementDelegate$1 f91249i;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.OgvAudioEnhancementService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvAudioEnhancementService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvAudioEnhancementService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvAudioEnhancementService ogvAudioEnhancementService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvAudioEnhancementService;
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
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    OgvAudioEnhancementService ogvAudioEnhancementService = this.this$0;
                    ogvAudioEnhancementService.f91243b.f6420j = ogvAudioEnhancementService.f91249i;
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
                this.this$0.f91243b.f6420j = null;
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [com.bilibili.ship.theseus.ogv.OgvAudioEnhancementService$audioEnhancementDelegate$1] */
    @Inject
    public OgvAudioEnhancementService(@NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull final CoroutineScope coroutineScope, @NotNull Fr0.j jVar, @NotNull EpisodeExtraInfoRepository episodeExtraInfoRepository, @NotNull com.bilibili.ship.theseus.united.page.restrictionlayer.G g7, @NotNull BackActionRepository backActionRepository, @NotNull BiliAccounts biliAccounts, @NotNull BiliAccountInfo biliAccountInfo, @NotNull Context context) {
        this.f91242a = hVar;
        this.f91243b = jVar;
        this.f91244c = episodeExtraInfoRepository;
        this.f91245d = g7;
        this.f91246e = backActionRepository;
        this.f91247f = biliAccounts;
        this.f91248g = biliAccountInfo;
        this.h = context;
        this.f91249i = new Fr0.n(this, coroutineScope) { // from class: com.bilibili.ship.theseus.ogv.OgvAudioEnhancementService$audioEnhancementDelegate$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvAudioEnhancementService f91250a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CoroutineScope f91251b;

            {
                this.f91250a = this;
                this.f91251b = coroutineScope;
            }

            @Override // Fr0.n
            public final boolean enableOpenAudio(int i7, boolean z6, boolean z7) {
                if (i7 != 2 && i7 != 1) {
                    return false;
                }
                OgvAudioEnhancementService ogvAudioEnhancementService = this.f91250a;
                if (!ogvAudioEnhancementService.f91247f.isLogin()) {
                    if (!z7) {
                        return false;
                    }
                    PlayerRouteUris.Routers.login$default(PlayerRouteUris.Routers.INSTANCE, ogvAudioEnhancementService.h, 2336, (String) null, 4, (Object) null);
                    return false;
                }
                if (!z6 || ogvAudioEnhancementService.f91248g.isEffectiveVip()) {
                    return true;
                }
                if (!z7) {
                    return false;
                }
                new IFunctionContainer.LayoutParams(-1, -1).setLayoutType(32);
                ExtraInfo extraInfoA = ogvAudioEnhancementService.f91244c.a();
                RestrictionLayerVo restrictionLayerVo = extraInfoA != null ? (RestrictionLayerVo) Ju0.a.f11702j.a(extraInfoA) : null;
                if (restrictionLayerVo == null) {
                    return false;
                }
                BuildersKt.launch$default(this.f91251b, (CoroutineContext) null, (CoroutineStart) null, new OgvAudioEnhancementService$audioEnhancementDelegate$1$enableOpenAudio$1(ogvAudioEnhancementService, restrictionLayerVo, null), 3, (Object) null);
                return false;
            }
        };
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
