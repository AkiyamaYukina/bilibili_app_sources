package com.bilibili.opd.app.sentinel;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bilibili.opd.app.sentinel.report.InfoEyesReporter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/sentinel/SentinelXXX.class */
public class SentinelXXX {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Long> f74692b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zn0.a f74693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f74694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f74695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f74696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f74697g;
    public final boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f74698i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f74699j;

    public SentinelXXX(Context context, String str, CollectConfig collectConfig, Reporter reporter, String str2, String str3, boolean z6, boolean z7) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        CollectConfig collectConfig2 = collectConfig == null ? CollectConfig.DEFAULT : collectConfig;
        Reporter infoEyesReporter = reporter == null ? new InfoEyesReporter(z6) : reporter;
        this.f74696f = str2;
        this.f74694d = str3;
        this.f74691a = str;
        this.f74697g = z6;
        this.h = z7;
        this.f74699j = context;
        a(collectConfig2, infoEyesReporter);
    }

    @Deprecated
    public SentinelXXX(String str, CollectConfig collectConfig, Reporter reporter, String str2, String str3, boolean z6, boolean z7) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        CollectConfig collectConfig2 = collectConfig == null ? CollectConfig.DEFAULT : collectConfig;
        Reporter infoEyesReporter = reporter == null ? new InfoEyesReporter(z6) : reporter;
        this.f74696f = str2;
        this.f74694d = str3;
        this.f74691a = str;
        this.f74697g = z6;
        this.h = z7;
        a(collectConfig2, infoEyesReporter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zn0.a] */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.bilibili.opd.app.sentinel.b, xn0.a] */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.bilibili.opd.app.sentinel.b, xn0.b] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.bilibili.opd.app.sentinel.b, xn0.c] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(CollectConfig collectConfig, Reporter reporter) {
        ?? obj = new Object();
        obj.f130335b = reporter;
        this.f74693c = obj;
        List<String> list = collectConfig.mWhiteBuvids;
        List<String> list2 = collectConfig.mWhiteMids;
        ?? bVar = new b();
        bVar.f129377b = list;
        bVar.f129378c = list2;
        int i7 = collectConfig.mErrorBacktraceCount;
        ?? bVar2 = new b();
        if (i7 <= 0) {
            bVar2.f129374b = new LinkedBlockingDeque(8);
        } else {
            bVar2.f129374b = new LinkedBlockingDeque(i7);
        }
        ?? bVar3 = new b();
        bVar3.f129376c = new Random();
        bVar3.f129375b = collectConfig.mSampling;
        this.f74693c.a(bVar);
        this.f74693c.a(bVar2);
        this.f74693c.a(bVar3);
    }

    public void addFilter(b bVar) {
        this.f74693c.a(bVar);
    }

    public void addFilterFirst(b bVar) {
        zn0.a aVar = this.f74693c;
        aVar.getClass();
        if (bVar == null) {
            return;
        }
        LinkedList<b> linkedList = new LinkedList<>(aVar.f130334a);
        linkedList.addFirst(bVar);
        bVar.f74700a = aVar;
        aVar.f130334a = linkedList;
    }

    public void addFilterLast(b bVar) {
        zn0.a aVar = this.f74693c;
        aVar.getClass();
        if (bVar == null) {
            return;
        }
        LinkedList<b> linkedList = new LinkedList<>(aVar.f130334a);
        linkedList.addLast(bVar);
        bVar.f74700a = aVar;
        aVar.f130334a = linkedList;
    }

    public Log customLog(String str, String str2) {
        if (!this.f74698i) {
            return Log.EMPTY;
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        Log logCustomLog = Log.customLog(this.f74699j, this.f74693c, this.f74691a, str, str2, this.f74696f, this.f74694d, null, null);
        logCustomLog.setLocalBuvid(this.f74695e);
        boolean z6 = this.h;
        if (z6) {
            logCustomLog.forceReport(z6);
        }
        return logCustomLog;
    }

    public void d(String str, String str2) {
        d(str, str2, null);
    }

    public void d(String str, String str2, Throwable th) {
        if (this.f74698i && !TextUtils.isEmpty(str)) {
            Log logDebugLog = Log.debugLog(this.f74699j, this.f74693c, this.f74691a, str, str2, th, this.f74696f, this.f74694d, null, null);
            logDebugLog.setLocalBuvid(this.f74695e);
            boolean z6 = this.h;
            if (z6) {
                logDebugLog.forceReport(z6);
            }
            logDebugLog.report();
        }
    }

    public void e(String str, String str2) {
        e(str, str2, null);
    }

    public void e(String str, String str2, Throwable th) {
        if (this.f74698i && !TextUtils.isEmpty(str)) {
            Log logErrorLog = Log.errorLog(this.f74699j, this.f74693c, this.f74691a, str, str2, th, this.f74696f, this.f74694d, null, null);
            logErrorLog.setLocalBuvid(this.f74695e);
            boolean z6 = this.h;
            if (z6) {
                logErrorLog.forceReport(z6);
            }
            logErrorLog.report();
        }
    }

    public void enable(boolean z6) {
        this.f74698i = z6;
    }

    public void endEvent(String str, String str2) {
        if (this.f74698i && !TextUtils.isEmpty(str)) {
            Long l7 = (Long) ((HashMap) this.f74692b).remove(android.support.v4.media.a.a("stk", str, str2));
            if (l7 == null) {
                return;
            }
            Context context = this.f74699j;
            zn0.a aVar = this.f74693c;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jLongValue = l7.longValue();
            Log logTraceLog = Log.traceLog(context, aVar, this.f74691a, str, str2, jElapsedRealtime - jLongValue, this.f74696f, this.f74694d, null, null);
            logTraceLog.setLocalBuvid(this.f74695e);
            boolean z6 = this.h;
            if (z6) {
                logTraceLog.forceReport(z6);
            }
            logTraceLog.report();
        }
    }

    public String getProductKey() {
        return this.f74691a;
    }

    public boolean isDebug() {
        return this.f74697g;
    }

    public boolean isEnabled() {
        return this.f74698i;
    }

    public boolean isForceReport() {
        return this.h;
    }

    public SentinelXXX mid(String str) {
        this.f74696f = str;
        return this;
    }

    public void monitorCount(String str, String str2) {
        if (this.f74698i && !TextUtils.isEmpty(str)) {
            Log logMonitorLogByCount = Log.monitorLogByCount(this.f74699j, this.f74693c, this.f74691a, str, str2, this.f74696f, this.f74694d, null, null);
            logMonitorLogByCount.setLocalBuvid(this.f74695e);
            boolean z6 = this.h;
            if (z6) {
                logMonitorLogByCount.forceReport(z6);
            }
            logMonitorLogByCount.report();
        }
    }

    public void monitorSucRate(String str, String str2, boolean z6) {
        if (this.f74698i && !TextUtils.isEmpty(str)) {
            Log logMonitorLogBySucRate = Log.monitorLogBySucRate(this.f74699j, this.f74693c, this.f74691a, str, str2, z6, this.f74696f, this.f74694d, null, null);
            logMonitorLogBySucRate.setLocalBuvid(this.f74695e);
            boolean z7 = this.h;
            if (z7) {
                logMonitorLogBySucRate.forceReport(z7);
            }
            logMonitorLogBySucRate.report();
        }
    }

    public void setLocalBuvid(String str) {
        this.f74695e = str;
    }

    public void traceEvent(String str, String str2) {
        if (this.f74698i && !TextUtils.isEmpty(str)) {
            ((HashMap) this.f74692b).put(android.support.v4.media.a.a("stk", str, str2), Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }
}
