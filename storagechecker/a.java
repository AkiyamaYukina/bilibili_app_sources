package com.bilibili.storagechecker;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/storagechecker/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentMap<String, ReentrantReadWriteLock> f105067a = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:47:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r5) {
        /*
            r0 = r5
            boolean r0 = cn.com.chinatelecom.account.api.d.m.b(r0)
            if (r0 != 0) goto La
            java.lang.String r0 = ""
            return r0
        La:
            r0 = r5
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r7 = r0
            r0 = 0
            r9 = r0
            r0 = 0
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L1b
            goto La2
        L1b:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L75
            r9 = r0
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L75
            r10 = r0
            r0 = r10
            r1 = r5
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L75
            r0 = r9
            r1 = r10
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L75
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L5a java.io.IOException -> L69 java.io.IOException -> L75
            r10 = r0
            r0 = r10
            r0.<init>()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L69
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L5a java.io.IOException -> Lac
            r5 = r0
        L42:
            r0 = r9
            r1 = r5
            int r0 = r0.read(r1)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> Lac
            r6 = r0
            r0 = r6
            r1 = -1
            if (r0 != r1) goto L5e
            r0 = r10
            byte[] r0 = r0.toByteArray()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> Lac
            r5 = r0
            r0 = r10
            r8 = r0
            goto L86
        L5a:
            r5 = move-exception
            goto L84
        L5e:
            r0 = r10
            r1 = r5
            r2 = 0
            r3 = r6
            r0.write(r1, r2, r3)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> Lac
            goto L42
        L69:
            r5 = move-exception
            r0 = 0
            r10 = r0
            r0 = r8
            r5 = r0
            r0 = r10
            r8 = r0
            goto L86
        L75:
            r5 = move-exception
            r0 = 0
            r10 = r0
            r0 = 0
            r9 = r0
            r0 = r8
            r5 = r0
            r0 = r10
            r8 = r0
            goto L86
        L84:
            r0 = r5
            throw r0
        L86:
            r0 = r9
            if (r0 == 0) goto L92
            r0 = r9
            r0.close()     // Catch: java.lang.Throwable -> Lb5
        L92:
            r0 = r5
            r9 = r0
            r0 = r8
            if (r0 == 0) goto La2
            r0 = r8
            r0.close()     // Catch: java.lang.Throwable -> Lba
            r0 = r5
            r9 = r0
        La2:
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            return r0
        Lac:
            r5 = move-exception
            r0 = r8
            r5 = r0
            r0 = r10
            r8 = r0
            goto L86
        Lb5:
            r9 = move-exception
            goto L92
        Lba:
            r8 = move-exception
            r0 = r5
            r9 = r0
            goto La2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.storagechecker.a.a(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.storagechecker.a.b(java.lang.String, java.lang.String, boolean):boolean");
    }

    public static void c(String str) {
        ConcurrentMap<String, ReentrantReadWriteLock> concurrentMap = f105067a;
        synchronized (concurrentMap) {
            if (((ConcurrentHashMap) concurrentMap).containsKey(str)) {
                ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) ((ConcurrentHashMap) concurrentMap).get(str);
                if (!reentrantReadWriteLock.hasQueuedThreads() && reentrantReadWriteLock.getReadHoldCount() == 0 && reentrantReadWriteLock.getWriteHoldCount() == 0) {
                    ((ConcurrentHashMap) concurrentMap).remove(str);
                }
            }
        }
    }
}
