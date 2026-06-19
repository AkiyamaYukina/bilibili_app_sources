package com.bilibili.playset.detail;

import android.os.Bundle;
import androidx.fragment.app.FragmentResultListener;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.mall.ui.page.home.view.HomeFragmentV3;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/g.class */
public final /* synthetic */ class g implements FragmentResultListener, Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx_fragment_app_Fragment f84571a;

    public /* synthetic */ g(androidx_fragment_app_Fragment androidx_fragment_app_fragment) {
        this.f84571a = androidx_fragment_app_fragment;
    }

    public void accept(Object obj) {
        HomeFragmentV3.pg(this.f84571a, (Boolean) obj);
    }

    @Override // androidx.fragment.app.FragmentResultListener
    public void onFragmentResult(String str, Bundle bundle) {
        if (bundle.getInt("resultCode") == 200) {
            ((MultiTypeListDetailFragment) this.f84571a).nf(bundle.getBundle("data"));
        }
    }
}
