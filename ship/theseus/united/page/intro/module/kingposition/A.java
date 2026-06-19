package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import androidx.activity.ComponentActivity;
import com.bilibili.lib.riskcontrol.ActionValidateHelper;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import kotlin.text.StringsKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/A.class */
public final class A implements IVideoLikeRouteService.ActionLikeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f100191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f100192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G f100193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ComponentActivity f100194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IVideoLikeRouteService.ActionLikePolymer f100195e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/A$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v f100196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final G f100197b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ComponentActivity f100198c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final IVideoLikeRouteService.ActionLikePolymer f100199d;

        public a(v vVar, G g7, ComponentActivity componentActivity, IVideoLikeRouteService.ActionLikePolymer actionLikePolymer) {
            this.f100196a = vVar;
            this.f100197b = g7;
            this.f100198c = componentActivity;
            this.f100199d = actionLikePolymer;
        }

        public final void a(Throwable th) {
            G.a(this.f100197b, this.f100198c, th, this.f100199d, this.f100196a);
        }
    }

    public A(v vVar, boolean z6, G g7, ComponentActivity componentActivity, IVideoLikeRouteService.ActionLikePolymer actionLikePolymer) {
        this.f100191a = vVar;
        this.f100192b = z6;
        this.f100193c = g7;
        this.f100194d = componentActivity;
        this.f100195e = actionLikePolymer;
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeCallback
    public final boolean isCancel() {
        return this.f100191a.isCancel();
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeCallback
    public final void onRequestFailed(Throwable th) {
        G.a(this.f100193c, this.f100194d, th, this.f100195e, this.f100191a);
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeCallback
    public final void onRequestSuccess(String str, String str2) {
        v vVar = this.f100191a;
        if (str2 == null || StringsKt.isBlank(str2) || this.f100192b) {
            IVideoLikeRouteService.ActionLikeCallback.onRequestSuccess$default(vVar, str, null, 2, null);
            return;
        }
        G g7 = this.f100193c;
        IVideoLikeRouteService.ActionLikePolymer actionLikePolymer = this.f100195e;
        ComponentActivity componentActivity = this.f100194d;
        a aVar = new a(vVar, g7, componentActivity, actionLikePolymer);
        if (componentActivity.isFinishing() || componentActivity.isDestroyed()) {
            BLog.i("LikeDataSource", "onLikeValidate activity is destroyed");
        } else {
            new ActionValidateHelper().checkAction(componentActivity, str2, new C(g7, actionLikePolymer, new D(aVar), aVar));
        }
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeCallback
    public final void onResponseIllegal() {
        this.f100191a.onResponseIllegal();
    }
}
