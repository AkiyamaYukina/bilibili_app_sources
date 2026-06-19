package com.bilibili.ship.theseus.ugc.playercontainer;

import Vr0.b;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.accounts.BiliAccounts;
import com.tencent.connect.common.Constants;
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
import tv.danmaku.biliplayerv2.router.PlayerRouteUris;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/OldWayUGCAudioEnhanceCompatService.class */
@StabilityInferred(parameters = 0)
public final class OldWayUGCAudioEnhanceCompatService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f98198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Fr0.j f98199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f98200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f98201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f98202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final a f98203f = new a(this);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playercontainer.OldWayUGCAudioEnhanceCompatService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/OldWayUGCAudioEnhanceCompatService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final OldWayUGCAudioEnhanceCompatService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OldWayUGCAudioEnhanceCompatService oldWayUGCAudioEnhanceCompatService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = oldWayUGCAudioEnhanceCompatService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            OldWayUGCAudioEnhanceCompatService oldWayUGCAudioEnhanceCompatService = this.this$0;
            Fr0.j jVar = oldWayUGCAudioEnhanceCompatService.f98199b;
            jVar.f6420j = oldWayUGCAudioEnhanceCompatService.f98203f;
            jVar.onUpdated(oldWayUGCAudioEnhanceCompatService.f98202e.getMediaResource());
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new OldWayUGCAudioEnhanceCompatService$1$invokeSuspend$$inlined$awaitCancel$1(null, this.this$0), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/OldWayUGCAudioEnhanceCompatService$a.class */
    public static final class a implements Fr0.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OldWayUGCAudioEnhanceCompatService f98204a;

        public a(OldWayUGCAudioEnhanceCompatService oldWayUGCAudioEnhanceCompatService) {
            this.f98204a = oldWayUGCAudioEnhanceCompatService;
        }

        @Override // Fr0.n
        public final boolean enableOpenAudio(int i7, boolean z6, boolean z7) {
            OldWayUGCAudioEnhanceCompatService oldWayUGCAudioEnhanceCompatService = this.f98204a;
            if (!BiliAccounts.get(oldWayUGCAudioEnhanceCompatService.f98198a).isLogin()) {
                if (!z7) {
                    return false;
                }
                PlayerRouteUris.Routers.login$default(PlayerRouteUris.Routers.INSTANCE, oldWayUGCAudioEnhanceCompatService.f98198a, 2336, (String) null, 4, (Object) null);
                return false;
            }
            BiliAccountInfo.Companion companion = BiliAccountInfo.Companion;
            AccountInfo accountInfoFromCache = companion.get().getAccountInfoFromCache();
            if (accountInfoFromCache != null) {
                if (oldWayUGCAudioEnhanceCompatService.f98201d.f() == accountInfoFromCache.getMid()) {
                    return true;
                }
            }
            if (!z6 || companion.get().isEffectiveVip()) {
                return true;
            }
            if (!z7) {
                return false;
            }
            IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-1, -1);
            layoutParams.setLayoutType(32);
            AbsFunctionWidgetService absFunctionWidgetService = oldWayUGCAudioEnhanceCompatService.f98200c;
            FunctionWidgetToken functionWidgetTokenShowWidget = absFunctionWidgetService.showWidget(Vr0.b.class, layoutParams);
            if (functionWidgetTokenShowWidget == null) {
                return false;
            }
            absFunctionWidgetService.updateFunctionWidgetConfiguration(functionWidgetTokenShowWidget, new b.a("", Constants.VIA_REPORT_TYPE_SHARE_TO_QQ, i7 == 3 ? "ugcWav" : "ugcdubi", "player.player.vip-intro.click.player", null));
            return false;
        }
    }

    @Inject
    public OldWayUGCAudioEnhanceCompatService(@NotNull Context context, @NotNull CoroutineScope coroutineScope, @NotNull Fr0.j jVar, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull IPlayerCoreService iPlayerCoreService) {
        this.f98198a = context;
        this.f98199b = jVar;
        this.f98200c = absFunctionWidgetService;
        this.f98201d = dVar;
        this.f98202e = iPlayerCoreService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
