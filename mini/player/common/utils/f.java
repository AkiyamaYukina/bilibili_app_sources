package com.bilibili.mini.player.common.utils;

import com.bilibili.opd.app.bizcommon.hybridruntime.core.context.HybridContext;
import com.bilibili.opd.app.bizcommon.hybridruntime.web.KFCWebFragmentV2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/common/utils/f.class */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f66102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f66103b;

    public /* synthetic */ f(Object obj, int i7) {
        this.f66102a = i7;
        this.f66103b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f66102a) {
            case 0:
                ((c) this.f66103b).invoke();
                break;
            default:
                HybridContext hybridContext = (HybridContext) this.f66103b;
                if (((KFCWebFragmentV2) hybridContext.getAttachOwner()).p3() != null) {
                    ((KFCWebFragmentV2) hybridContext.getAttachOwner()).p3().finish();
                }
                break;
        }
    }
}
