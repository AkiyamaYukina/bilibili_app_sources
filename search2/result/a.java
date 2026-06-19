package com.bilibili.search2.result;

import Bl.N;
import HS0.B;
import android.graphics.Rect;
import android.view.TouchDelegate;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.search2.result.ArticleHolderV3;
import com.mall.data.page.ip.bean.HotIPAtmosphereBean;
import com.mall.logic.page.ip.IPGoodsViewModel;
import com.mall.ui.page.base.H;
import com.mall.ui.page.ip.view.IPFragmentV2;
import com.mall.ui.page.ip.view.IPGoodsFragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/a.class */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f87120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f87121c;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f87119a = i7;
        this.f87120b = obj;
        this.f87121c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<IPGoodsFragment> arrayList;
        IPGoodsViewModel iPGoodsViewModel;
        MutableLiveData mutableLiveData;
        switch (this.f87119a) {
            case 0:
                N n7 = (N) this.f87120b;
                ArticleHolderV3 articleHolderV3 = (ArticleHolderV3) this.f87121c;
                ArticleHolderV3.Companion companion = ArticleHolderV3.f87050p;
                Rect rect = new Rect();
                n7.d.getHitRect(rect);
                int px = ListExtentionsKt.toPx(9);
                rect.top -= px;
                rect.bottom += px;
                rect.left -= px;
                rect.right += px;
                articleHolderV3.f87052b.setTouchDelegate(new TouchDelegate(rect, n7.d));
                break;
            default:
                IPFragmentV2 iPFragmentV2 = (IPFragmentV2) this.f87120b;
                HotIPAtmosphereBean hotIPAtmosphereBean = (HotIPAtmosphereBean) this.f87121c;
                B b7 = iPFragmentV2.d;
                if (b7 != null && (arrayList = ((H) b7).d) != null) {
                    for (IPGoodsFragment iPGoodsFragment : arrayList) {
                        if ((iPGoodsFragment instanceof IPGoodsFragment) && (iPGoodsViewModel = iPGoodsFragment.q) != null && (mutableLiveData = iPGoodsViewModel.m) != null) {
                            mutableLiveData.setValue(hotIPAtmosphereBean);
                        }
                    }
                    break;
                }
                break;
        }
    }
}
