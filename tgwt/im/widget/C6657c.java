package com.bilibili.tgwt.im.widget;

import android.content.Context;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.tgwt.im.widget.BangumiFakeInputBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.bilibili.tgwt.im.widget.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/c.class */
public final /* synthetic */ class C6657c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BangumiFakeInputBar f111406a;

    public final Object invoke(Object obj, Object obj2) {
        Unit unit;
        Context context = (Context) obj;
        String str = (String) obj2;
        int i7 = BangumiFakeInputBar.f111336c;
        if (com.bilibili.ogv.infra.account.a.f67852b.isLogin()) {
            BangumiFakeInputBar bangumiFakeInputBar = this.f111406a;
            BangumiFakeInputBar.a aVar = bangumiFakeInputBar.f111337a;
            if (aVar != null) {
                aVar.c(str);
            }
            C6655a c6655a = bangumiFakeInputBar.f111338b;
            if (c6655a.f111401f) {
                c6655a.f111401f = false;
                c6655a.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_FACE_OCCLUSION_SEGMENT_USE_TEMPERATURE);
            }
            unit = Unit.INSTANCE;
        } else {
            gm.a.b(context, SearchBangumiItem.TYPE_FULLNET_VARIETY, "activity://main/login/", (String) null);
            unit = Unit.INSTANCE;
        }
        return unit;
    }
}
