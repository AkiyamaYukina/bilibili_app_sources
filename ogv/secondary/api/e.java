package com.bilibili.ogv.secondary.api;

import androidx.compose.runtime.internal.StabilityInferred;
import io.ktor.client.HttpClient;
import javax.inject.Inject;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/api/e.class */
@StabilityInferred(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HttpClient f72648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Json f72649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f72650c;

    @Inject
    public e(@NotNull HttpClient httpClient, @NotNull Json json, @Nullable String str) {
        this.f72648a = httpClient;
        this.f72649b = json;
        this.f72650c = str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(2:4|(1:6)(1:8))(0)|9|58|(2:11|(2:13|(4:15|16|45|(3:47|52|53)(2:48|49))(2:21|22))(2:23|24))(6:25|26|27|28|29|(2:31|32)(1:33))|34|35|56|36|39|40|(2:42|43)(3:44|45|(0)(0))|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0297, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x034a A[Catch: Exception -> 0x00cc, CancellationException -> 0x00d0, TRY_ENTER, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x00d0, Exception -> 0x00cc, blocks: (B:16:0x00c4, B:47:0x034a, B:48:0x035b, B:49:0x0366, B:24:0x014d, B:34:0x0260, B:39:0x029a, B:26:0x015a, B:28:0x0205), top: B:58:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x035b A[Catch: Exception -> 0x00cc, CancellationException -> 0x00d0, TRY_ENTER, TryCatch #3 {CancellationException -> 0x00d0, Exception -> 0x00cc, blocks: (B:16:0x00c4, B:47:0x034a, B:48:0x035b, B:49:0x0366, B:24:0x014d, B:34:0x0260, B:39:0x029a, B:26:0x015a, B:28:0x0205), top: B:58:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(final boolean r8, @org.jetbrains.annotations.NotNull final java.lang.String r9, @org.jetbrains.annotations.NotNull final java.lang.String r10, @org.jetbrains.annotations.Nullable final java.lang.String r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 881
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.secondary.api.e.a(boolean, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
