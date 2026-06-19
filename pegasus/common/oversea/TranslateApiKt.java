package com.bilibili.pegasus.common.oversea;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.pegasus.data.base.BasePegasusData;
import com.bilibili.pegasus.holders.AbstractC5652d;
import ip0.e;
import ip0.g;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/oversea/TranslateApiKt.class */
public final class TranslateApiKt {
    public static final void a(@NotNull AbstractC5652d<?> abstractC5652d, @NotNull e eVar) {
        LifecycleCoroutineScope lifecycleScope;
        g translateRequestParams = eVar.getTranslateRequestParams();
        if (translateRequestParams == null || Intrinsics.areEqual(eVar.getTranslatedStatus(), "TRANSLATING")) {
            return;
        }
        if (Intrinsics.areEqual(eVar.getTranslatedStatus(), "TRANSLATED")) {
            eVar.setTranslatedStatus("ORIGIN");
            BasePegasusData basePegasusData = (BasePegasusData) abstractC5652d.getBindData();
            if (basePegasusData != null) {
                abstractC5652d.notifyItemChanged(basePegasusData, "PAYLOAD_UPDATE_TRANSLATE");
                return;
            }
            return;
        }
        Fragment fragment = abstractC5652d.getFragment();
        if (fragment == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment)) == null) {
            return;
        }
        BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new TranslateApiKt$translateCard$2(eVar, abstractC5652d, translateRequestParams, null), 3, (Object) null);
    }
}
