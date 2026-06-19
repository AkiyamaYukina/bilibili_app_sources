package com.bilibili.upper.module.uppercenter.view;

import com.alipay.alipaysecuritysdk.common.model.DynamicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/view/BiliUpperTabLayout$mLogger$1.class */
public final /* synthetic */ class BiliUpperTabLayout$mLogger$1 extends FunctionReferenceImpl implements Function2<String, String, Unit> {
    public static final BiliUpperTabLayout$mLogger$1 INSTANCE = new BiliUpperTabLayout$mLogger$1();

    public BiliUpperTabLayout$mLogger$1() {
        super(2, BLog.class, DynamicModel.KEY_ABBR_DEPENDENCY_MODE, "d(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (String) obj2);
        return Unit.INSTANCE;
    }

    public final void invoke(String str, String str2) {
        BLog.d(str, str2);
    }
}
