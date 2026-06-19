package com.bilibili.opd.app.bizcommon.imageselector.component;

import android.os.Bundle;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/component/IMallMediaExternalService.class */
public interface IMallMediaExternalService {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void text2Img$default(IMallMediaExternalService iMallMediaExternalService, String str, List list, Long l7, Function2 function2, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: text2Img");
        }
        if ((i7 & 2) != 0) {
            list = null;
        }
        if ((i7 & 4) != 0) {
            l7 = null;
        }
        iMallMediaExternalService.text2Img(str, list, l7, function2);
    }

    void text2Img(@NotNull String str, @Nullable List<Long> list, @Nullable Long l7, @NotNull Function2<? super String, ? super Long, Unit> function2);

    void uploadMedia(@NotNull MallMediaUploadOption mallMediaUploadOption, @NotNull Function1<? super Bundle, Unit> function1);
}
