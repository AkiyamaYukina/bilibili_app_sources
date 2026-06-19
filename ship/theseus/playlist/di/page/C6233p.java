package com.bilibili.ship.theseus.playlist.di.page;

import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.tab.TabPage;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.page.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/p.class */
@StabilityInferred(parameters = 0)
public final class C6233p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f95706A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.bean.d f95707B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public final com.bilibili.ship.theseus.united.bean.g f95708C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final String f95709D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final String f95710E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public final String f95711F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.bean.b f95712G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Uri f95713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f95714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Bundle f95715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f95716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f95717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f95718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f95719g;
    public final long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f95720i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f95721j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f95722k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f95723l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f95724m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f95725n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f95726o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f95727p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final String f95728q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f95729r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final Float f95730s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final String f95731t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f95732u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f95733v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final String f95734w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final String f95735x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f95736y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public final TabPage.LocatableTag f95737z;

    /* JADX WARN: Removed duplicated region for block: B:195:0x04fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C6233p(@org.jetbrains.annotations.NotNull android.content.Intent r17, @org.jetbrains.annotations.Nullable com.bilibili.ship.theseus.united.page.screenstate.PageRestoredState r18) {
        /*
            Method dump skipped, instruction units count: 1589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.di.page.C6233p.<init>(android.content.Intent, com.bilibili.ship.theseus.united.page.screenstate.PageRestoredState):void");
    }

    public static int a(Uri uri, String str, int i7) {
        if (uri == null) {
            return i7;
        }
        String queryParameter = uri.getQueryParameter(str);
        int i8 = i7;
        if (queryParameter != null) {
            if (StringsKt.isBlank(queryParameter)) {
                i8 = i7;
            } else {
                try {
                    i8 = Integer.parseInt(queryParameter);
                } catch (Exception e7) {
                    i8 = i7;
                }
            }
        }
        return i8;
    }

    public static long b(Uri uri, String str) {
        long j7 = 0;
        if (uri != null) {
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter == null) {
                j7 = 0;
            } else {
                try {
                    j7 = Long.parseLong(queryParameter);
                } catch (Exception e7) {
                    j7 = 0;
                }
            }
        }
        return j7;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(com.bilibili.ship.theseus.playlist.di.page.C6233p r3, java.lang.String r4, android.net.Uri r5) {
        /*
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            r0 = r5
            if (r0 == 0) goto L15
            r0 = r5
            r1 = r4
            java.lang.String r0 = r0.getQueryParameter(r1)
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L18
        L15:
            java.lang.String r0 = ""
            r3 = r0
        L18:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.di.page.C6233p.c(com.bilibili.ship.theseus.playlist.di.page.p, java.lang.String, android.net.Uri):java.lang.String");
    }

    public final boolean d() {
        long j7 = this.f95717e;
        return j7 == 0 || j7 == 99999999;
    }
}
