package com.bilibili.teenagersmode.osteen;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/osteen/ParentalCredentialAuthenticateFailedException.class */
@StabilityInferred(parameters = 0)
public final class ParentalCredentialAuthenticateFailedException extends RuntimeException {
    public static final int $stable = 8;
    private final int code;

    public ParentalCredentialAuthenticateFailedException() {
        this(0, null, 3, null);
    }

    public ParentalCredentialAuthenticateFailedException(int i7, @Nullable String str) {
        super(str == null ? "验证失败" : str);
        this.code = i7;
    }

    public /* synthetic */ ParentalCredentialAuthenticateFailedException(int i7, String str, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 101 : i7, (i8 & 2) != 0 ? null : str);
    }

    public final int getCode() {
        return this.code;
    }
}
