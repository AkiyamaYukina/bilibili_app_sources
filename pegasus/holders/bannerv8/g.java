package com.bilibili.pegasus.holders.bannerv8;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.banneradapter.BannerItem;
import com.bilibili.app.comm.list.widget.banneradapter.BannerItemFactory;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/g.class */
@StabilityInferred(parameters = 1)
public class g implements BannerItemFactory<gp0.b, RecyclerView.ViewHolder> {
    @Nullable
    public BannerItem<gp0.b, RecyclerView.ViewHolder> createItemByType(int i7) {
        BannerItem<gp0.b, RecyclerView.ViewHolder> bannerItem;
        Object next;
        Function0<BannerItem<gp0.b, ?>> creator;
        Iterator it = BannerItemType.getEntries().iterator();
        while (true) {
            bannerItem = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((BannerItemType) next).getViewType() == i7) {
                break;
            }
        }
        BannerItemType bannerItemType = (BannerItemType) next;
        BannerItem<gp0.b, RecyclerView.ViewHolder> bannerItem2 = (bannerItemType == null || (creator = bannerItemType.getCreator()) == null) ? null : (BannerItem) creator.invoke();
        if (bannerItem2 != null) {
            bannerItem = bannerItem2;
        }
        return bannerItem;
    }
}
