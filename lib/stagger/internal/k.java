package com.bilibili.lib.stagger.internal;

import com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent;
import kntr.app.article.publish.core.model.UploadState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import pZ0.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/k.class */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f64556b;

    public /* synthetic */ k(Object obj, int i7) {
        this.f64555a = i7;
        this.f64556b = obj;
    }

    public final Object invoke() {
        boolean z6;
        switch (this.f64555a) {
            case 0:
                return ((o) this.f64556b).f64576o;
            case 1:
                PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent = (PlayerV3WebGeneralUIComponent) this.f64556b;
                if (playerV3WebGeneralUIComponent.f82097e.f82244a) {
                    playerV3WebGeneralUIComponent.d();
                } else {
                    playerV3WebGeneralUIComponent.f82101j.tryEmit(Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            default:
                pZ0.b bVar = (pZ0.b) this.f64556b;
                d.d dVarD = rZ0.b.d(bVar.g);
                if (dVarD == null) {
                    z6 = false;
                } else {
                    z6 = false;
                    if (dVarD.e) {
                        d.b bVarF = rZ0.b.f(bVar.g);
                        if (bVarF == null) {
                            z6 = false;
                        } else {
                            UploadState uploadState = bVarF.i;
                            z6 = uploadState == null || !uploadState.isSuccess();
                        }
                    }
                }
                return Boolean.valueOf(z6);
        }
    }
}
