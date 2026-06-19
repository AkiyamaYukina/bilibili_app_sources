package com.bilibili.pegasus.verticaltab;

import android.os.Bundle;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.unit.IntSize;
import com.bilibili.adcommon.utils.ext.JSONObjectCreator;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.search2.result.base.BaseSearchResultFragment;
import com.bilibili.search2.result.base.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import tv.danmaku.bili.ui.login.PlayerLoginFragmentV2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/verticaltab/f.class */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f78967b;

    public /* synthetic */ f(Object obj, int i7) {
        this.f78966a = i7;
        this.f78967b = obj;
    }

    public final Object invoke(Object obj) {
        Object obj2 = this.f78967b;
        switch (this.f78966a) {
            case 0:
                KProperty<Object>[] kPropertyArr = VerticalTabFragment.f78919k;
                ((VerticalTabFragment) obj2).of();
                return Unit.INSTANCE;
            case 1:
                com.bilibili.search2.result.base.i iVar = (com.bilibili.search2.result.base.i) obj;
                KProperty<Object>[] kPropertyArr2 = BaseSearchResultFragment.f87471t;
                String str = "errorState changed:" + iVar;
                BaseSearchResultFragment baseSearchResultFragment = (BaseSearchResultFragment) obj2;
                baseSearchResultFragment.uf(str);
                baseSearchResultFragment.Gf(iVar);
                if (iVar instanceof i.a) {
                    baseSearchResultFragment.C1();
                } else if (iVar instanceof i.c) {
                    baseSearchResultFragment.Ff();
                } else if (iVar instanceof i.b) {
                    baseSearchResultFragment.Ef();
                }
                return Unit.INSTANCE;
            case 2:
                Bundle bundle = (Bundle) obj2;
                JSONObjectCreator jSONObjectCreator = (JSONObjectCreator) obj;
                kd.i.e(jSONObjectCreator, bundle);
                kd.i.c(jSONObjectCreator, bundle);
                return Unit.INSTANCE;
            case 3:
                ((MutableIntState) obj2).setIntValue((int) (((IntSize) obj).m3976unboximpl() & 4294967295L));
                return Unit.INSTANCE;
            default:
                MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
                PlayerLoginFragmentV2 playerLoginFragmentV2 = (PlayerLoginFragmentV2) obj2;
                playerLoginFragmentV2.getClass();
                Boolean bool = Boolean.TRUE;
                mutableBundleLike.put("key_sms_login_direct", bool.toString());
                mutableBundleLike.put("key_sms_login_enable", bool.toString());
                mutableBundleLike.put("key_prompt_scene", playerLoginFragmentV2.B);
                mutableBundleLike.put("router_from", playerLoginFragmentV2.C);
                return null;
        }
    }
}
