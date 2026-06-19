package com.bilibili.opd.app.bizcommon.mangapaysdk.view;

import android.view.View;
import android.view.ViewGroup;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.opd.app.bizcommon.mangapaysdk.adapter.MangaCommonAdapter;
import com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.BatchBuy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/d.class */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f74144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f74145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f74146c;

    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        this.f74144a = i7;
        this.f74145b = obj;
        this.f74146c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f74144a) {
            case 0:
                MangaPayFragment mangaPayFragment = (MangaPayFragment) this.f74145b;
                List<BatchBuy> list = (List) this.f74146c;
                View view = mangaPayFragment.f74081F;
                if (view != null && view.getVisibility() == 0) {
                    View view2 = mangaPayFragment.f74081F;
                    int width = ((view2 != null ? view2.getWidth() : 0) - DimenUtilsKt.dpToPx(48.0d)) / 3;
                    mangaPayFragment.f74090O = width;
                    if (width <= 0) {
                        mangaPayFragment.f74090O = mangaPayFragment.f74089N;
                    }
                    ArrayList arrayList = new ArrayList();
                    int size = list.size();
                    if (size == 1) {
                        BatchBuy batchBuy = (BatchBuy) list.get(0);
                        arrayList.add(new MangaCommonAdapter.b(batchBuy != null && batchBuy.isDefaultSelect(), MangaCommonAdapter.MangaRVItemHolderType.BulkLevelSubsequentType, DimenUtilsKt.dpToPx(16.0d) + (mangaPayFragment.f74090O * 3), batchBuy, null, null, false, mangaPayFragment.xf(batchBuy != null ? Integer.valueOf(batchBuy.getEpNum()) : null), 368));
                    } else if (size != 2) {
                        for (BatchBuy batchBuy2 : list) {
                            arrayList.add(new MangaCommonAdapter.b(batchBuy2 != null && batchBuy2.isDefaultSelect(), MangaCommonAdapter.MangaRVItemHolderType.BulkLevelSubsequentType, mangaPayFragment.f74090O, batchBuy2, null, null, false, mangaPayFragment.xf(batchBuy2 != null ? Integer.valueOf(batchBuy2.getEpNum()) : null), 368));
                        }
                    } else {
                        BatchBuy batchBuy3 = (BatchBuy) list.get(0);
                        String strXf = mangaPayFragment.xf(batchBuy3 != null ? Integer.valueOf(batchBuy3.getEpNum()) : null);
                        boolean z6 = batchBuy3 != null && batchBuy3.isDefaultSelect();
                        int i7 = mangaPayFragment.f74090O;
                        MangaCommonAdapter.MangaRVItemHolderType mangaRVItemHolderType = MangaCommonAdapter.MangaRVItemHolderType.BulkLevelSubsequentType;
                        arrayList.add(new MangaCommonAdapter.b(z6, mangaRVItemHolderType, i7, batchBuy3, null, null, false, strXf, 368));
                        BatchBuy batchBuy4 = (BatchBuy) list.get(1);
                        arrayList.add(new MangaCommonAdapter.b(batchBuy4 != null && batchBuy4.isDefaultSelect(), mangaRVItemHolderType, DimenUtilsKt.dpToPx(8.0d) + (mangaPayFragment.f74090O * 2), batchBuy4, null, null, false, mangaPayFragment.xf(batchBuy4 != null ? Integer.valueOf(batchBuy4.getEpNum()) : null), 368));
                    }
                    mangaPayFragment.f74116s = arrayList.size() > 3;
                    MangaCommonAdapter mangaCommonAdapter = mangaPayFragment.f74114q;
                    if (mangaCommonAdapter != null) {
                        mangaCommonAdapter.O(arrayList);
                    }
                    break;
                }
                break;
            default:
                ((ViewGroup) this.f74145b).removeView((View) this.f74146c);
                break;
        }
    }
}
