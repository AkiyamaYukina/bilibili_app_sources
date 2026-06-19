package com.bilibili.ship.theseus.united.report;

import androidx.compose.foundation.gestures.C3392f;
import kotlin.jvm.JvmInline;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/report/b.class */
@JvmInline
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104838a;

    public /* synthetic */ b(int i7) {
        this.f104838a = i7;
    }

    public static String a(int i7) {
        return C3392f.a(i7, "Trigger(reportValue=", ")");
    }

    public final boolean equals(Object obj) {
        boolean z6 = false;
        if (obj instanceof b) {
            if (this.f104838a == ((b) obj).f104838a) {
                z6 = true;
            }
        }
        return z6;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f104838a);
    }

    public final String toString() {
        return a(this.f104838a);
    }
}
