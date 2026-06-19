package com.bilibili.okretro.response;

import com.bilibili.okretro.response.BiliApiResponse;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.i;
import com.google.gson.reflect.TypeToken;
import fN0.b;
import java.lang.reflect.ParameterizedType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/response/BiliApiResponseTypeAdapter.class */
public final class BiliApiResponseTypeAdapter<T> extends TypeAdapter<BiliApiResponse<? extends T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Gson f73455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TypeAdapter<T> f73456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TypeAdapter<JsonElement> f73457c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/response/BiliApiResponseTypeAdapter$Factory.class */
    public static final class Factory implements i {
        @Nullable
        public final <T> TypeAdapter<T> a(@NotNull Gson gson, @NotNull TypeToken<T> typeToken) {
            if (Intrinsics.areEqual(typeToken.getRawType(), BiliApiResponse.class)) {
                return new BiliApiResponseTypeAdapter(gson, gson.getAdapter(TypeToken.get(((ParameterizedType) typeToken.getType()).getActualTypeArguments()[0])));
            }
            return null;
        }
    }

    public BiliApiResponseTypeAdapter(@NotNull Gson gson, @NotNull TypeAdapter<T> typeAdapter) {
        this.f73455a = gson;
        this.f73456b = typeAdapter;
        this.f73457c = gson.getAdapter(JsonElement.class);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(fN0.a r7) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.okretro.response.BiliApiResponseTypeAdapter.e(fN0.a):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void f(b bVar, Object obj) throws NoWhenBranchMatchedException {
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        bVar.d();
        boolean z6 = biliApiResponse instanceof BiliApiResponse.Success;
        Gson gson = this.f73455a;
        if (z6) {
            bVar.k("code");
            bVar.s(0L);
            bVar.k("data");
            Object data = ((BiliApiResponse.Success) biliApiResponse).getData();
            if (data == null) {
                bVar.n();
            } else {
                gson.getAdapter(data.getClass()).f(bVar, data);
            }
        } else if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            bVar.k("code");
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            bVar.u(Integer.valueOf(businessFailure.getCode()));
            bVar.k("message");
            bVar.w(businessFailure.getMessage());
            Object errorBody = businessFailure.getErrorBody();
            if (errorBody != null) {
                bVar.k("data");
                gson.getAdapter(errorBody.getClass()).f(bVar, errorBody);
            }
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.ServiceUnavailable)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar.k("message");
            bVar.w(((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException().getMessage());
        }
        bVar.g();
    }
}
