package com.bilibili.tensorflow.utils;

import HT0.e;
import androidx.annotation.WorkerThread;
import com.bilibili.ogv.infra.util.i;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/utils/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Reader f110814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f110815b = LazyKt.lazy(new e(this, 2));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final HashMap<String, String> f110816c = new HashMap<>();

    public b(@NotNull Reader reader) {
        this.f110814a = reader;
    }

    @WorkerThread
    public final void a() throws IOException {
        while (true) {
            Lazy lazy = this.f110815b;
            String[] strArrB = ((xD0.a) lazy.getValue()).b();
            if (strArrB == null) {
                ((xD0.a) lazy.getValue()).a.close();
                this.f110814a.close();
                return;
            } else {
                this.f110816c.put(Cp.b.a("\\n", StringsKt.trim(strArrB[0]).toString(), ""), Cp.b.a("\\n", StringsKt.trim(strArrB[1]).toString(), ""));
            }
        }
    }

    public final int b(int i7, @NotNull String str) {
        String str2 = this.f110816c.get(str);
        int i8 = 0;
        int i9 = 0;
        if (str2 != null) {
            List listR = StringsKt.R(str2, new String[]{"|"}, 0, 6);
            i9 = 0;
            if (listR != null) {
                Iterator it = listR.iterator();
                int i10 = 0;
                while (true) {
                    int i11 = i10;
                    i9 = i8;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (i7 > i.c((String) next)) {
                        i8 = i12;
                    }
                    i10 = i12;
                }
            }
        }
        return i9;
    }
}
