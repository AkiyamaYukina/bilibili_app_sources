package com.bilibili.search2.result.holder.comic;

import android.view.View;
import com.bilibili.adcommon.data.model.SourceContent;
import com.bilibili.gripper.api.ad.biz.GAdBizKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/comic/p.class */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88117a;

    public final Object invoke(Object obj) {
        boolean z6;
        switch (this.f88117a) {
            case 0:
                return new r((View) obj);
            default:
                SourceContent sourceContent = (SourceContent) obj;
                List adViewTypeList = GAdBizKt.getGAdVideoDetail().getRelate().getAdViewTypeList();
                if ((adViewTypeList instanceof Collection) && adViewTypeList.isEmpty()) {
                    z6 = false;
                } else {
                    Iterator it = adViewTypeList.iterator();
                    while (true) {
                        z6 = false;
                        if (it.hasNext()) {
                            if (((Number) it.next()).intValue() == GAdBizKt.getGAdVideoDetail().getRelate().getAdViewType(sourceContent)) {
                                z6 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z6);
        }
    }
}
