package com.bilibili.playerbizcommonv2.api;

import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.response.BiliApiResponse;
import java.util.Map;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/api/e.class */
@BaseUrl("https://api.bilibili.com")
public interface e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f80822a = a.f80823a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/api/e$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f80823a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final e f80824b = (e) ServiceGenerator.createService(e.class);

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(int r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws kotlin.NoWhenBranchMatchedException {
            /*
                Method dump skipped, instruction units count: 256
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.api.e.a.a(int, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(int r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws kotlin.NoWhenBranchMatchedException {
            /*
                Method dump skipped, instruction units count: 256
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.api.e.a.b(int, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }
    }

    @FormUrlEncoded
    @POST("/x/vip/hd/trial_modify")
    @Nullable
    Object modify(@Field("modify_type") @NotNull String str, @Field("biz_type") int i7, @Field("st_uuid") @NotNull String str2, @Field("aid") @NotNull String str3, @NotNull Continuation<? super BiliApiResponse<? extends Map<String, TrialBenefit>>> continuation);
}
