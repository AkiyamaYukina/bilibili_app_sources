package com.bilibili.ship.theseus.cheese.pay.purchase.guide;

import com.bilibili.commons.io.FileUtils;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blkv.BLKV;
import com.bilibili.lib.blkv.RawKV;
import com.bilibili.lib.foundation.FoundationAlias;
import java.io.File;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/pay/purchase/guide/CheesePurchaseGuideRepository$isSeasonIdExist$2.class */
final class CheesePurchaseGuideRepository$isSeasonIdExist$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final String $id;
    final boolean $putIfNotExit;
    int label;
    final CheesePurchaseGuideRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePurchaseGuideRepository$isSeasonIdExist$2(CheesePurchaseGuideRepository cheesePurchaseGuideRepository, String str, boolean z6, Continuation<? super CheesePurchaseGuideRepository$isSeasonIdExist$2> continuation) {
        super(2, continuation);
        this.this$0 = cheesePurchaseGuideRepository;
        this.$id = str;
        this.$putIfNotExit = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheesePurchaseGuideRepository$isSeasonIdExist$2(this.this$0, this.$id, this.$putIfNotExit, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        File file = new File(FoundationAlias.getFapp().getCacheDir(), "purchase_favorite_guide");
        boolean zIsExist = false;
        RawKV kvs$default = BLKV.toKvs$default(file, false, 0, 3, (Object) null);
        Integer intOrNull = StringsKt.toIntOrNull(ConfigManager.Companion.getConfig("theseus_comment_tab_guide_file_size", "4096"));
        int iIntValue = intOrNull != null ? intOrNull.intValue() : 4096;
        this.this$0.getClass();
        if (!file.exists() || file.isDirectory()) {
            try {
                Boxing.boxBoolean(file.createNewFile());
            } catch (IOException e7) {
                defpackage.a.b("[theseus-cheese-CheesePurchaseGuideRepository$isSeasonIdExist$2-invokeSuspend] ", "IOException: " + e7 + ", could not create needed files", "CheesePurchaseGuideRepository$isSeasonIdExist$2-invokeSuspend");
                Unit unit = Unit.INSTANCE;
            }
        } else {
            zIsExist = kvs$default.isExist(this.$id);
        }
        if (!zIsExist && this.$putIfNotExit) {
            kvs$default.putInt(this.$id, 1);
        }
        this.this$0.getClass();
        if ((file.exists() ? file.length() : -1L) > iIntValue) {
            FileUtils.deleteQuietly(file);
        }
        return Boxing.boxBoolean(zIsExist);
    }
}
