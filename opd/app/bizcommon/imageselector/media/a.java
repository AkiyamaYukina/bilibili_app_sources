package com.bilibili.opd.app.bizcommon.imageselector.media;

import android.app.Application;
import com.bilibili.base.BiliContext;
import com.bilibili.opd.app.bizcommon.imageselector.media.MallMediaHelper;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/media/a.class */
public final /* synthetic */ class a implements Function0 {
    public final Object invoke() {
        MallMediaHelper.ScreenType screenType;
        Application application = BiliContext.application();
        if (application == null) {
            screenType = MallMediaHelper.ScreenType.NORMAL;
        } else {
            int i7 = application.getResources().getConfiguration().screenLayout & 15;
            screenType = i7 != 1 ? (i7 == 2 || i7 != 3) ? MallMediaHelper.ScreenType.NORMAL : MallMediaHelper.ScreenType.LARGE : MallMediaHelper.ScreenType.SMALL;
        }
        return screenType;
    }
}
