package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import androidx.activity.ComponentActivity;
import com.bilibili.lib.riskcontrol.ActionValidateHelper;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService;
import kotlin.text.StringsKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/B.class */
public final class B implements IVideoLikeRouteService.ActionLikeNologinCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KingPositionService.f f100200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f100201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G f100202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ComponentActivity f100203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f100204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IVideoLikeRouteService.ActionLikeNologinPolymer f100205f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/B$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KingPositionService.f f100206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final G f100207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ComponentActivity f100208c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f100209d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f100210e;

        public a(KingPositionService.f fVar, G g7, ComponentActivity componentActivity, boolean z6, boolean z7) {
            this.f100206a = fVar;
            this.f100207b = g7;
            this.f100208c = componentActivity;
            this.f100209d = z6;
            this.f100210e = z7;
        }

        public final void a(Throwable th) {
            G.b(this.f100207b, this.f100208c, this.f100209d, this.f100210e, th, this.f100206a);
        }
    }

    public B(KingPositionService.f fVar, boolean z6, G g7, ComponentActivity componentActivity, boolean z7, IVideoLikeRouteService.ActionLikeNologinPolymer actionLikeNologinPolymer) {
        this.f100200a = fVar;
        this.f100201b = z6;
        this.f100202c = g7;
        this.f100203d = componentActivity;
        this.f100204e = z7;
        this.f100205f = actionLikeNologinPolymer;
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeNologinCallback
    public final boolean isCancel() {
        return this.f100200a.isCancel();
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeNologinCallback
    public final void onRequestFailed(Throwable th) {
        G.b(this.f100202c, this.f100203d, this.f100201b, this.f100204e, th, this.f100200a);
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeNologinCallback
    public final void onRequestSuccess(String str, int i7, String str2) {
        boolean z6;
        KingPositionService.f fVar = this.f100200a;
        if (str2 == null || StringsKt.isBlank(str2) || (z6 = this.f100201b)) {
            IVideoLikeRouteService.ActionLikeNologinCallback.onRequestSuccess$default(fVar, str, i7, null, 4, null);
            return;
        }
        G g7 = this.f100202c;
        boolean z7 = this.f100204e;
        ComponentActivity componentActivity = this.f100203d;
        a aVar = new a(fVar, g7, componentActivity, z6, z7);
        if (componentActivity.isFinishing() || componentActivity.isDestroyed()) {
            BLog.i("LikeDataSource", "onNoLoginLikeValidate activity is destroyed");
        } else {
            new ActionValidateHelper().checkAction(componentActivity, str2, new E(g7, this.f100205f, new F(aVar), aVar));
        }
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeNologinCallback
    public final void onResponseIllegal() {
        this.f100200a.onResponseIllegal();
    }
}
