package com.bilibili.okretro.response;

import com.bilibili.okretro.response.BiliApiResponseTypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.HttpException;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/response/BiliApiResponse.class */
@JsonAdapter(BiliApiResponseTypeAdapter.Factory.class)
public abstract class BiliApiResponse<T> {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/response/BiliApiResponse$BusinessFailure.class */
    public static final class BusinessFailure extends BiliApiResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f73450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f73451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Object f73452c;

        public BusinessFailure(int i7, @Nullable String str, @Nullable Object obj) {
            super(null);
            this.f73450a = i7;
            this.f73451b = str;
            this.f73452c = obj;
        }

        public final int getCode() {
            return this.f73450a;
        }

        @Nullable
        public final Object getErrorBody() {
            return this.f73452c;
        }

        @Nullable
        public final String getMessage() {
            return this.f73451b;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/response/BiliApiResponse$ServiceUnavailable.class */
    public static final class ServiceUnavailable extends BiliApiResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Exception f73453a;

        public ServiceUnavailable(@NotNull Exception exc) {
            super(null);
            this.f73453a = exc;
        }

        @NotNull
        public final Exception getException() {
            return this.f73453a;
        }

        public final boolean isIOFailure() {
            return this.f73453a instanceof IOException;
        }

        public final boolean isServerFailure() {
            return this.f73453a instanceof HttpException;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/response/BiliApiResponse$Success.class */
    public static final class Success<T> extends BiliApiResponse<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f73454a;

        public Success(T t7) {
            super(null);
            this.f73454a = t7;
        }

        public final T getData() {
            return this.f73454a;
        }
    }

    public BiliApiResponse() {
    }

    public /* synthetic */ BiliApiResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
