package com.bilibili.opd.app.bizcommon;

import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/HybridRuntimeService.class */
public interface HybridRuntimeService {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/HybridRuntimeService$Response.class */
    public static final class Response {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f73460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f73461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final JSONObject f73462c;

        public Response(int i7, @Nullable String str, @Nullable JSONObject jSONObject) {
            this.f73460a = i7;
            this.f73461b = str;
            this.f73462c = jSONObject;
        }

        public static /* synthetic */ Response copy$default(Response response, int i7, String str, JSONObject jSONObject, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                i7 = response.f73460a;
            }
            if ((i8 & 2) != 0) {
                str = response.f73461b;
            }
            if ((i8 & 4) != 0) {
                jSONObject = response.f73462c;
            }
            return response.copy(i7, str, jSONObject);
        }

        public final int component1() {
            return this.f73460a;
        }

        @Nullable
        public final String component2() {
            return this.f73461b;
        }

        @Nullable
        public final JSONObject component3() {
            return this.f73462c;
        }

        @NotNull
        public final Response copy(int i7, @Nullable String str, @Nullable JSONObject jSONObject) {
            return new Response(i7, str, jSONObject);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Response)) {
                return false;
            }
            Response response = (Response) obj;
            return this.f73460a == response.f73460a && Intrinsics.areEqual(this.f73461b, response.f73461b) && Intrinsics.areEqual(this.f73462c, response.f73462c);
        }

        @Nullable
        public final JSONObject getMData() {
            return this.f73462c;
        }

        @Nullable
        public final String getMErrmsg() {
            return this.f73461b;
        }

        public final int getMErrno() {
            return this.f73460a;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f73460a);
            int iHashCode2 = 0;
            String str = this.f73461b;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            JSONObject jSONObject = this.f73462c;
            if (jSONObject != null) {
                iHashCode2 = jSONObject.hashCode();
            }
            return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
        }

        @NotNull
        public final JSONObject toJSON() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", Integer.valueOf(this.f73460a));
            jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, this.f73461b);
            JSONObject jSONObject2 = this.f73462c;
            if (jSONObject2 == null) {
                jSONObject.put("data", "");
            } else {
                jSONObject.put("data", jSONObject2);
            }
            return jSONObject;
        }

        @NotNull
        public String toString() {
            return toJSON().toString();
        }
    }

    @Nullable
    Response callNative(@NotNull JSONObject jSONObject, @NotNull Fragment fragment, @Nullable Function1<? super String, Unit> function1, @Nullable Function1<? super Response, Unit> function12);
}
