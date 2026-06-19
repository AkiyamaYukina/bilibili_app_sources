package com.bilibili.mall;

import com.bilibili.lib.blrouter.BLRouter;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/IMallShoppingTipCardViewKt.class */
public final class IMallShoppingTipCardViewKt {
    @Nullable
    public static final IMallShoppingLiveCardService getMallLiveCardService() {
        return (IMallShoppingLiveCardService) BLRouter.get$default(BLRouter.INSTANCE, IMallShoppingLiveCardService.class, (String) null, 2, (Object) null);
    }
}
