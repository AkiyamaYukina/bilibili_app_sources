package com.bilibili.lib.push;

import android.content.Context;
import android.os.Bundle;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/BPushFoundation.class */
public final class BPushFoundation {

    @NotNull
    public static final BPushFoundation INSTANCE = new BPushFoundation();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Delegate f64200a = new Object();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/BPushFoundation$Delegate.class */
    public interface Delegate {
        @NotNull
        Bundle metaData();

        @NotNull
        String mobiApp();

        int versionCode();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/BPushFoundation$LoginState.class */
    public static final class LoginState {
        private static final EnumEntries $ENTRIES;
        private static final LoginState[] $VALUES;
        public static final LoginState LOGIN = new LoginState("LOGIN", 0, 1);
        public static final LoginState LOGOUT = new LoginState("LOGOUT", 1, 2);
        public static final LoginState SWITCH = new LoginState("SWITCH", 2, 3);
        private final int code;

        private static final /* synthetic */ LoginState[] $values() {
            return new LoginState[]{LOGIN, LOGOUT, SWITCH};
        }

        static {
            LoginState[] loginStateArr$values = $values();
            $VALUES = loginStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(loginStateArr$values);
        }

        private LoginState(String str, int i7, int i8) {
            this.code = i8;
        }

        @NotNull
        public static EnumEntries<LoginState> getEntries() {
            return $ENTRIES;
        }

        public static LoginState valueOf(String str) {
            return (LoginState) Enum.valueOf(LoginState.class, str);
        }

        public static LoginState[] values() {
            return (LoginState[]) $VALUES.clone();
        }

        public final int getCode() {
            return this.code;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/BPushFoundation$a.class */
    public static final class a implements Delegate {
        @Override // com.bilibili.lib.push.BPushFoundation.Delegate
        public final Bundle metaData() {
            return new Bundle();
        }

        @Override // com.bilibili.lib.push.BPushFoundation.Delegate
        public final String mobiApp() {
            return "";
        }

        @Override // com.bilibili.lib.push.BPushFoundation.Delegate
        public final int versionCode() {
            return 0;
        }
    }

    @JvmStatic
    @NotNull
    public static final Context getApp() {
        return BPushManagerServiceProvider.INSTANCE.get().getContext();
    }

    @JvmStatic
    @NotNull
    public static final Bundle getMetaData() {
        Delegate delegate = f64200a;
        Delegate delegate2 = delegate;
        if (delegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sBPushFoundationDelegate");
            delegate2 = null;
        }
        return delegate2.metaData();
    }

    @JvmStatic
    @NotNull
    public static final String getMobiApp() {
        Delegate delegate = f64200a;
        Delegate delegate2 = delegate;
        if (delegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sBPushFoundationDelegate");
            delegate2 = null;
        }
        return delegate2.mobiApp();
    }

    @JvmStatic
    public static final int getVersionCode() {
        Delegate delegate = f64200a;
        Delegate delegate2 = delegate;
        if (delegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sBPushFoundationDelegate");
            delegate2 = null;
        }
        return delegate2.versionCode();
    }

    @JvmStatic
    public static final void setFoundationDelegate(@Nullable Delegate delegate) {
        if (delegate != null) {
            f64200a = delegate;
        }
    }
}
