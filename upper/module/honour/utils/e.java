package com.bilibili.upper.module.honour.utils;

import android.os.Bundle;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.upper.module.honour.bean.KingHonourAccountBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/utils/e.class */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KingHonourAccountBean.MinProgramBean f113343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f113345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f113346d;

    public /* synthetic */ e(KingHonourAccountBean.MinProgramBean minProgramBean, String str, boolean z6, boolean z7) {
        this.f113343a = minProgramBean;
        this.f113344b = str;
        this.f113345c = z6;
        this.f113346d = z7;
    }

    public final Object invoke(Object obj) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("king_honour_account_data", this.f113343a);
        bundle.putString("king_honour_video_url", this.f113344b);
        bundle.putBoolean("king_honour_from_add", false);
        bundle.putBoolean("king_honour_user_is_grant", this.f113345c);
        bundle.putBoolean("king_honour_user_is_bind", this.f113346d);
        Unit unit = Unit.INSTANCE;
        ((MutableBundleLike) obj).put("param_control", bundle);
        return Unit.INSTANCE;
    }
}
