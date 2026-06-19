package com.bilibili.pegasus.common.inline;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.droid.ActivityUtils;
import com.bilibili.pegasus.common.inline.l;
import com.bilibili.pegasus.data.base.BasePegasusPlayerData;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/m.class */
public final class m implements IVideoLikeRouteService.ActionLikeTripleCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<BasePegasusPlayerData> f75581a;

    public m(l<BasePegasusPlayerData> lVar) {
        this.f75581a = lVar;
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeTripleCallback
    public final boolean isCancel() {
        Activity wrapperActivity = ActivityUtils.getWrapperActivity(this.f75581a.f75576e);
        FragmentActivity fragmentActivity = wrapperActivity instanceof FragmentActivity ? (FragmentActivity) wrapperActivity : null;
        return fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed();
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeTripleCallback
    public final void onRequestFailed(Throwable th) {
        PromoToast.showBottomToast(this.f75581a.f75576e, 2131845189);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeTripleCallback
    public final void onRequestSuccess(boolean z6, boolean z7, boolean z8, boolean z9, int i7, String str, String str2) {
        l<BasePegasusPlayerData> lVar = this.f75581a;
        if (z6) {
            lVar.f75572a.updateLikeState(z6, -1L);
        }
        lVar.f75572a.setTripleLikeCoin(z7);
        lVar.f75572a.setTripleLikeFav(z8);
        l.a<T> aVar = lVar.f75575d;
        if (aVar != 0) {
            aVar.c(lVar.f75572a);
        }
        if (z6 && z7 && z8) {
            return;
        }
        if (!z6 && !z7 && !z8) {
            PromoToast.showBottomToast(lVar.f75576e, 2131845120);
            return;
        }
        if (!z6 && z7 && z8) {
            PromoToast.showBottomToast(lVar.f75576e, 2131845356);
            return;
        }
        if (z6 && !z7 && z8) {
            PromoToast.showBottomToast(lVar.f75576e, 2131845199);
            return;
        }
        if (z6 && z7) {
            PromoToast.showBottomToast(lVar.f75576e, 2131845350);
            return;
        }
        if (z6) {
            PromoToast.showBottomToast(lVar.f75576e, 2131845133);
        } else if (z7) {
            PromoToast.showBottomToast(lVar.f75576e, 2131845079);
        } else {
            PromoToast.showBottomToast(lVar.f75576e, 2131845111);
        }
    }
}
