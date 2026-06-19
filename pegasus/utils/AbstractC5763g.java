package com.bilibili.pegasus.utils;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.api.BiliApiException;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.mobile.BLHumanActionParamsType;
import java.util.Collection;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.pegasus.utils.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/g.class */
@StabilityInferred(parameters = 1)
public abstract class AbstractC5763g implements hg.a {
    public final void a(@NotNull Map<Long, gg.b> map) {
        Context contextC = c();
        if (contextC == null || map.isEmpty()) {
            return;
        }
        Collection<gg.b> collectionValues = map.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            for (gg.b bVar : collectionValues) {
                if (!bVar.b) {
                    BiliApiException biliApiException = bVar.f;
                    BiliApiException biliApiException2 = biliApiException instanceof BiliApiException ? biliApiException : null;
                    if (biliApiException2 != null && biliApiException2.mCode == 16004) {
                        new AlertDialog.Builder(contextC).setMessage(2131845335).setPositiveButton(2131841686, new DialogInterface.OnClickListener(this) { // from class: com.bilibili.pegasus.utils.f

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final AbstractC5763g f78869a;

                            {
                                this.f78869a = this;
                            }

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i7) {
                                Qp0.c.e(this.f78869a.c(), "bilibili://main/favorite?tab=channel", null, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_SEGMENT_RESULT_BLUR, null);
                            }
                        }).show();
                        return;
                    }
                }
            }
        }
        gg.b bVar2 = (gg.b) CollectionsKt.firstOrNull(map.values());
        if (bVar2 == null) {
            return;
        }
        if (bVar2.b) {
            PromoToast.showBottomToast(contextC.getApplicationContext(), 2131845069);
        } else {
            PromoToast.showBottomToast(contextC, 2131845141);
        }
    }

    @Nullable
    public abstract Context c();
}
