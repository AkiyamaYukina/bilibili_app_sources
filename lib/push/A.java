package com.bilibili.lib.push;

import android.content.Context;
import com.bilibili.droid.ProcessUtils;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/A.class */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final A f64156a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static B f64157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f64158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f64159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static DisturbInfo f64160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f64161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f64162g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARN: Type inference failed for: r0v21, types: [com.bilibili.lib.push.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [com.bilibili.lib.push.B] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.bilibili.lib.push.G] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bilibili.lib.push.B a(android.content.Context r3) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.push.A.a(android.content.Context):com.bilibili.lib.push.B");
    }

    public static void c(int i7, @NotNull Context context, int i8) {
        BPushLog.i("RedDotHelper", "setRedDot source = " + i8 + ", process = " + ProcessUtils.myProcName());
        if (ProcessUtils.isMainProcess()) {
            BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), (CoroutineContext) null, (CoroutineStart) null, new RedDotHelper$setRedDot$1(i8, context, i7, null), 3, (Object) null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.Context r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.push.A.b(android.content.Context, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
