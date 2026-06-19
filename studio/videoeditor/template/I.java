package com.bilibili.studio.videoeditor.template;

import android.os.Bundle;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.studio.videoeditor.template.bean.BiliActionRequest;
import com.bilibili.upper.module.contribute.up.ui.join.bean.MainAuthorProcessType;
import com.bilibili.upper.module.contribute.up.ui.join.model.JoinUpViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/I.class */
public final /* synthetic */ class I implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f109943a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f109944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f109945c;

    public /* synthetic */ I(BiliActionRequest biliActionRequest, BiliTemplateEngineManager biliTemplateEngineManager) {
        this.f109944b = biliActionRequest;
        this.f109945c = biliTemplateEngineManager;
    }

    public /* synthetic */ I(MainAuthorProcessType mainAuthorProcessType, JoinUpViewModel joinUpViewModel) {
        this.f109944b = mainAuthorProcessType;
        this.f109945c = joinUpViewModel;
    }

    public final Object invoke(Object obj) {
        switch (this.f109943a) {
            case 0:
                MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
                BiliActionRequest biliActionRequest = (BiliActionRequest) this.f109944b;
                Bundle bundle = biliActionRequest.extra;
                Bundle bundle2 = bundle;
                if (bundle == null) {
                    bundle2 = new Bundle();
                }
                Bundle bundle3 = bundle2.getBundle("bili_param_control");
                Bundle bundle4 = bundle3;
                if (bundle3 == null) {
                    bundle4 = new Bundle();
                }
                bundle2.putAll(bundle4);
                bundle2.remove("bili_param_control");
                bundle2.putInt("bili_actionType", biliActionRequest.actionType);
                bundle2.putInt("bili_bCutRequestCode", biliActionRequest.requestCode);
                bundle2.putInt("bili_biliRequestCode", 30012);
                bundle2.putBoolean("bili_needDownload", true);
                BiliTemplateEngineManager biliTemplateEngineManager = (BiliTemplateEngineManager) this.f109945c;
                if (biliTemplateEngineManager.ab("bbs_key_ab_config_large_bundle")) {
                    biliTemplateEngineManager.putIntentData("bbs_key_large_bundle_data", bundle2);
                    Bundle bundle5 = new Bundle();
                    bundle5.putString("bili_largeBundleKey", "bbs_key_large_bundle_data");
                    mutableBundleLike.put("bili_param_control", bundle5);
                } else {
                    mutableBundleLike.put("bili_param_control", bundle2);
                }
                break;
            default:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                oH0.o.b("【联投界面】add result = " + zBooleanValue);
                MainAuthorProcessType mainAuthorProcessType = (MainAuthorProcessType) this.f109944b;
                JoinUpViewModel joinUpViewModel = (JoinUpViewModel) this.f109945c;
                if (zBooleanValue && mainAuthorProcessType == MainAuthorProcessType.REINVITE) {
                    eJ0.H.a(2131855659, joinUpViewModel.getApplication());
                }
                if (zBooleanValue) {
                    joinUpViewModel.s = true;
                }
                joinUpViewModel.q.postValue(new Pair(mainAuthorProcessType, bool));
                break;
        }
        return Unit.INSTANCE;
    }
}
