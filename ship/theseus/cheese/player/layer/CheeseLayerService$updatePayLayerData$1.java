package com.bilibili.ship.theseus.cheese.player.layer;

import android.content.Context;
import com.bilibili.lib.image2.view.BiliImageView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/CheeseLayerService$updatePayLayerData$1.class */
final /* synthetic */ class CheeseLayerService$updatePayLayerData$1 extends FunctionReferenceImpl implements Function1<Context, BiliImageView> {
    public CheeseLayerService$updatePayLayerData$1(Object obj) {
        super(1, obj, CheeseLayerService.class, "coverFactory", "coverFactory(Landroid/content/Context;)Lcom/bilibili/lib/image2/view/BiliImageView;", 0);
    }

    public final BiliImageView invoke(Context context) {
        return CheeseLayerService.a((CheeseLayerService) ((CallableReference) this).receiver, context);
    }
}
