package com.bilibili.pegasus.holders.bannerv8;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.banneradapter.BannerItem;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/n.class */
@StabilityInferred(parameters = 1)
public final class n extends g {
    @Override // com.bilibili.pegasus.holders.bannerv8.g
    @Nullable
    public final BannerItem<gp0.b, RecyclerView.ViewHolder> createItemByType(int i7) {
        BannerItem bannerItem;
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
        BannerItem bannerItem2 = (bannerItemType == null || (creator = bannerItemType.getCreator()) == null) ? null : (BannerItem) creator.invoke();
        if (bannerItem2 != null) {
            bannerItem = bannerItem2;
        }
        if (bannerItem instanceof z) {
            ((z) bannerItem).a();
        }
        return bannerItem;
    }
}
