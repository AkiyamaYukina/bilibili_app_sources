package com.bilibili.pegasus.channelv3.feed.holder;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.community.follow.FollowSeasonStatus;
import com.bilibili.ogv.misc.follow.BangumiGroupMangerBottomSheet;
import com.bilibili.ogv.misc.follow.api.entity.ItemData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import pk0.C8330y;
import pk0.C8331z;
import uo0.C8747d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/feed/holder/j.class */
public final /* synthetic */ class j implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LifecycleOwner f75310b;

    public /* synthetic */ j(int i7, LifecycleOwner lifecycleOwner) {
        this.f75309a = i7;
        this.f75310b = lifecycleOwner;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f75309a) {
            case 0:
                C8747d.b((k) this.f75310b);
                break;
            default:
                BangumiGroupMangerBottomSheet bangumiGroupMangerBottomSheet = (BangumiGroupMangerBottomSheet) this.f75310b;
                C8331z.a(bangumiGroupMangerBottomSheet.f69035g == 1 ? "pgc.my-bangumi.watched-list.move-group.click" : "pgc.my-favorite-cinema.watched-list.move-group.click", null, null, null);
                BangumiGroupMangerBottomSheet.a aVar = bangumiGroupMangerBottomSheet.f69036i;
                ArrayList<ItemData> arrayList = null;
                if (aVar != null) {
                    ArrayList arrayList2 = new ArrayList();
                    List<ItemData> list = aVar.f69039a;
                    arrayList = arrayList2;
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            arrayList = arrayList2;
                            if (it.hasNext()) {
                                ItemData itemData = (ItemData) it.next();
                                if (itemData.f69140o) {
                                    arrayList2.add(itemData);
                                }
                            }
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                if (arrayList != null) {
                    for (ItemData itemData2 : arrayList) {
                        if (itemData2 != null) {
                            arrayList3.add(String.valueOf(itemData2.d()));
                        }
                    }
                }
                if (!arrayList3.isEmpty()) {
                    Lazy lazy = C8330y.f125459a;
                    bangumiGroupMangerBottomSheet.f69038k.add(C8330y.a(FollowSeasonStatus.WATCHED.getValue().intValue(), arrayList3).subscribe(new BangumiGroupMangerBottomSheet.c(bangumiGroupMangerBottomSheet, arrayList3), new BangumiGroupMangerBottomSheet.d(bangumiGroupMangerBottomSheet)));
                }
                break;
        }
    }
}
