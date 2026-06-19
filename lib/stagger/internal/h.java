package com.bilibili.lib.stagger.internal;

import I3.C2234j0;
import androidx.collection.ArrayMap;
import androidx.core.app.NotificationCompat;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.stagger.CDNType;
import com.bilibili.lib.stagger.KeyType;
import com.bilibili.lib.stagger.internal.g;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/h.class */
public final class h implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f64546b = 0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/h$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f64547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f64548b;

        static {
            int[] iArr = new int[CDNType.values().length];
            try {
                iArr[CDNType.CDN.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[CDNType.PCDN.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f64547a = iArr;
            int[] iArr2 = new int[KeyType.values().length];
            try {
                iArr2[KeyType.TASK_ID.ordinal()] = 1;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr2[KeyType.HASH.ordinal()] = 2;
            } catch (NoSuchFieldError e10) {
            }
            f64548b = iArr2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.bilibili.lib.stagger.internal.g
    public final void d(@NotNull g.b bVar) throws NoWhenBranchMatchedException {
        Object obj;
        super.d(bVar);
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("task_id", bVar.h);
        arrayMap.put("hash", bVar.f64538i);
        arrayMap.put("url", bVar.f64536f);
        arrayMap.put("path", bVar.f64537g);
        arrayMap.put("tag", bVar.f64535e);
        arrayMap.put("period", String.valueOf(bVar.f64532b));
        arrayMap.put("success", bVar.f64531a ? "1" : "2");
        int i7 = a.f64547a[bVar.f64534d.ordinal()];
        if (i7 == 1) {
            obj = "1";
        } else {
            if (i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            obj = "2";
        }
        arrayMap.put("cdn", obj);
        arrayMap.put("code", String.valueOf(bVar.f64542m));
        String str = bVar.f64543n;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        arrayMap.put(NotificationCompat.CATEGORY_MESSAGE, str2);
        arrayMap.put("inner_code", String.valueOf(bVar.f64544o));
        String str3 = bVar.f64545p;
        if (str3 != null) {
            arrayMap.put("inner_msg", str3);
        }
        arrayMap.put("length", String.valueOf(bVar.f64533c));
        arrayMap.put("download_time", String.valueOf(bVar.f64539j));
        arrayMap.put("task_effect_time", String.valueOf(bVar.f64540k));
        arrayMap.put("task_expire_time", String.valueOf(bVar.f64541l));
        try {
            Neurons.trackT$default(false, "public.stagger.result.tracker", arrayMap, 0, new C2234j0(7), 8, (Object) null);
        } catch (NoClassDefFoundError e7) {
        } catch (Throwable th) {
            c.c().b(f(), O4.d.a("Neurons/reportResult ex = ", th), th);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.bilibili.lib.stagger.internal.g
    public final void i(@NotNull String str, @NotNull KeyType keyType, boolean z6) throws NoWhenBranchMatchedException {
        Object obj;
        super.i(str, keyType, z6);
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("key", str);
        arrayMap.put("hit", z6 ? "1" : "2");
        int i7 = a.f64548b[keyType.ordinal()];
        if (i7 == 1) {
            obj = "1";
        } else {
            if (i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            obj = "2";
        }
        arrayMap.put("keyType", obj);
        try {
            Neurons.trackT$default(false, "public.stagger.hit.tracker", arrayMap, 0, new C2234j0(7), 8, (Object) null);
        } catch (NoClassDefFoundError e7) {
        } catch (Throwable th) {
            c.c().b(f(), O4.d.a("Neurons/reportHit ex = ", th), th);
        }
    }
}
