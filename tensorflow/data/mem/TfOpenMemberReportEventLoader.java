package com.bilibili.tensorflow.data.mem;

import com.bilibili.tensorflow.model.c;
import java.io.File;
import java.util.LinkedHashMap;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/data/mem/TfOpenMemberReportEventLoader.class */
public final class TfOpenMemberReportEventLoader {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static volatile File f110747c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final TfOpenMemberReportEventLoader f110745a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final c f110746b = new c("tf_open_membership_report_event", "", "event_map.csv", "1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static volatile String f110748d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final LinkedHashMap<String, String> f110749e = new LinkedHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Mutex f110750f = MutexKt.Mutex$default(false, 1, (Object) null);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tensorflow.data.mem.TfOpenMemberReportEventLoader.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tensorflow.data.mem.TfOpenMemberReportEventLoader.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
