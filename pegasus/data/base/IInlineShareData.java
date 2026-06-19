package com.bilibili.pegasus.data.base;

import com.bilibili.app.comm.list.common.data.SharePlane;
import com.bilibili.app.comm.list.common.data.ThreePointItem;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/base/IInlineShareData.class */
public interface IInlineShareData {
    long getOid();

    int getShareBusiness();

    @Nullable
    SharePlane getSharePlane();

    @Nullable
    List<ThreePointItem> getThreePoint();

    boolean isHot();
}
