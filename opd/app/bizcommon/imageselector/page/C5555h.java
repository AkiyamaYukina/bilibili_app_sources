package com.bilibili.opd.app.bizcommon.imageselector.page;

import com.bilibili.opd.app.bizcommon.imageselector.media.MallImageMedia;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.imageselector.page.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/h.class */
public final /* synthetic */ class C5555h implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MallMediaFragment f73900a;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Long l7 = (Long) obj3;
        l7.longValue();
        ArrayList<MallImageMedia> arrayList = new ArrayList<>();
        MallImageMedia mallImageMedia = new MallImageMedia();
        mallImageMedia.setUrl((String) obj2);
        mallImageMedia.setText((String) obj);
        mallImageMedia.setTemplateId(l7);
        arrayList.add(mallImageMedia);
        Jm0.B.f11518a = arrayList;
        MallMediaFragment mallMediaFragment = this.f73900a;
        Jm0.B.f11519b = mallMediaFragment.f73779B;
        mallMediaFragment.finishAttachedActivity();
        return Unit.INSTANCE;
    }
}
