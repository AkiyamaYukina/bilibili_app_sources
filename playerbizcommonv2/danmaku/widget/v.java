package com.bilibili.playerbizcommonv2.danmaku.widget;

import com.bilibili.okretro.GeneralResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.biliplayerv2.IPlayerContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/v.class */
public final /* synthetic */ class v implements Function8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f81701a;

    public /* synthetic */ v(w wVar) {
        this.f81701a = wVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        String str = (String) obj;
        String str2 = (String) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        String str3 = (String) obj5;
        String str4 = (String) obj6;
        GeneralResponse generalResponse = (GeneralResponse) obj7;
        String str5 = (String) obj8;
        IPlayerContainer iPlayerContainer = this.f81701a.f81702a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getInteractLayerService().reportDanmaku(str, str2, zBooleanValue2, str3, str4, false, zBooleanValue, generalResponse, str5);
        return Unit.INSTANCE;
    }
}
