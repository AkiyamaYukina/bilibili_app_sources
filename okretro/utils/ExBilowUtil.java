package com.bilibili.okretro.utils;

import androidx.annotation.Nullable;
import com.bilibili.api.BiliApiException;
import com.bilibili.okretro.GeneralResponse;
import java.lang.annotation.Annotation;
import okhttp3.Headers;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/utils/ExBilowUtil.class */
public class ExBilowUtil {
    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    public static <T> T extractResponse(Response<T> response) throws HttpException {
        if (response.isSuccessful()) {
            return (T) response.body();
        }
        throw new HttpException(response);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.bilibili.api.BiliApiException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    public static <T> T extractResponseData(Response<GeneralResponse<T>> response) throws BiliApiException, HttpException {
        if (!response.isSuccessful()) {
            throw new HttpException(response);
        }
        GeneralResponse generalResponse = (GeneralResponse) response.body();
        if (generalResponse == null) {
            return null;
        }
        if (generalResponse.code == 0) {
            return generalResponse.data;
        }
        throw new BiliApiException(generalResponse.code, generalResponse.message);
    }

    public static boolean isAnnotationPresent(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isAuthStatusError(java.lang.Throwable r3) {
        /*
            r0 = r3
            boolean r0 = r0 instanceof com.bilibili.api.BiliApiException
            r7 = r0
            r0 = 0
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r7
            if (r0 == 0) goto L27
            r0 = r3
            com.bilibili.api.BiliApiException r0 = (com.bilibili.api.BiliApiException) r0
            int r0 = r0.mCode
            r4 = r0
            r0 = r4
            r1 = -2
            if (r0 == r1) goto L25
            r0 = r6
            r5 = r0
            r0 = r4
            r1 = -101(0xffffffffffffff9b, float:NaN)
            if (r0 != r1) goto L27
        L25:
            r0 = 1
            r5 = r0
        L27:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.okretro.utils.ExBilowUtil.isAuthStatusError(java.lang.Throwable):boolean");
    }

    public static boolean isFromCache(@Nullable okhttp3.Response response) {
        Headers headers;
        if (response == null || (headers = response.headers()) == null) {
            return false;
        }
        return "Bili-Cache-Hit".equals(headers.get("Bili-Cache-Hit"));
    }

    public static boolean isFromCache(@Nullable Response response) {
        if (response == null) {
            return false;
        }
        return isFromCache(response.raw());
    }
}
