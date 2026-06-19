package com.bilibili.moduleservice.main;

import Ns.j;
import OS0.L;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/main/b.class */
public interface b {
    void a(@Nullable Context context, @NotNull String str, @Nullable Bundle bundle, @Nullable j jVar, @NotNull Map map);

    default void b(@Nullable Context context, @NotNull String str, @NotNull String str2) {
        j(context, str, str2, MapsKt.emptyMap());
    }

    default void c(@Nullable Context context, @NotNull String str, @NotNull String str2, int i7, @NotNull String str3) {
        i(context, str, str2, str3, i7, null, MapsKt.emptyMap());
    }

    default void d(int i7, @NotNull String str, @Nullable Context context) {
        f(i7, null, context, "dynamic", str, MapsKt.emptyMap(), null, false);
    }

    default void e(@Nullable Context context, @NotNull String str, @NotNull String str2, int i7, @Nullable Function0<Unit> function0) {
        f(i7, null, context, str, str2, MapsKt.emptyMap(), function0, false);
    }

    void f(int i7, @Nullable L l7, @Nullable Context context, @NotNull String str, @NotNull String str2, @NotNull Map map, @Nullable Function0 function0, boolean z6);

    default void h(@Nullable Context context, @NotNull String str, @Nullable Bundle bundle, @Nullable j jVar) {
        a(context, str, bundle, jVar, MapsKt.emptyMap());
    }

    void i(@Nullable Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, int i7, @Nullable Function0 function0, @NotNull Map map);

    void j(@Nullable Context context, @NotNull String str, @NotNull String str2, @NotNull Map map);

    default void k(@Nullable FragmentActivity fragmentActivity, @Nullable Function1 function1, @NotNull Map map) {
    }
}
