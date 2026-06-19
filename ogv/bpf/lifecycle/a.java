package com.bilibili.ogv.bpf.lifecycle;

import androidx.fragment.app.FragmentActivity;
import com.bilibili.opd.app.bizcommon.bilicaptcha.MallCaptchaVerfyConf;
import com.bilibili.opd.app.bizcommon.bilicaptcha.VerfyConfBean;
import com.bilibili.playset.detail.MultiTypeListDetailFragment;
import com.bilibili.playset.playlist.helper.MultiTypeShareHelper;
import com.bilibili.ship.theseus.ogv.operation.OperationContainerViewModel;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bpf/lifecycle/a.class */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f67491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f67492b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f67491a = i7;
        this.f67492b = obj;
    }

    public final Object invoke() {
        MultiTypeShareHelper multiTypeShareHelper;
        VerfyConfBean verfyConf;
        switch (this.f67491a) {
            case 0:
                return SkeletonViewModel.toaster_delegate$lambda$0((SkeletonViewModel) this.f67492b);
            case 1:
                MultiTypeListDetailFragment multiTypeListDetailFragment = (MultiTypeListDetailFragment) this.f67492b;
                FragmentActivity fragmentActivityP3 = multiTypeListDetailFragment.p3();
                if (fragmentActivityP3 == null) {
                    multiTypeShareHelper = null;
                } else {
                    MultiTypeShareHelper multiTypeShareHelper2 = multiTypeListDetailFragment.f84260l;
                    multiTypeShareHelper = multiTypeShareHelper2;
                    if (multiTypeShareHelper2 == null) {
                        multiTypeShareHelper = new MultiTypeShareHelper(fragmentActivityP3);
                        multiTypeShareHelper.f85319d = multiTypeListDetailFragment;
                        multiTypeListDetailFragment.f84260l = multiTypeShareHelper;
                    }
                }
                return multiTypeShareHelper;
            case 2:
                ((OperationContainerViewModel) this.f67492b).f94081c.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 3:
                BLog.i("StoryChronosService", "DanmakuFeedback dismissed, notifying interaction resume");
                IRemoteHandler remoteHandler = ((PlayerContainer) this.f67492b).getInteractLayerService().getRemoteHandler();
                if (remoteHandler != null) {
                    IRemoteHandler.onBusinessDataChanged$default(remoteHandler, "interaction_resume", (Object) null, 2, (Object) null);
                }
                return Unit.INSTANCE;
            default:
                MallCaptchaVerfyConf mallCaptchaVerfyConf = (MallCaptchaVerfyConf) this.f67492b;
                return TuplesKt.to((mallCaptchaVerfyConf == null || (verfyConf = mallCaptchaVerfyConf.getVerfyConf()) == null) ? null : verfyConf.getNaUrl(), "");
        }
    }
}
