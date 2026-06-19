package com.bilibili.opd.app.bizcommon.context;

import android.content.Context;
import com.bilibili.lib.blkv.BLKV;
import com.bilibili.lib.blkv.RawKV;
import java.util.ArrayList;
import kotlin.collections.ArraysKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/l.class */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f73547c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public static volatile l f73548d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RawKV f73549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public ArrayList<String> f73550b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/l$a.class */
    public static final class a {
        @NotNull
        public final l a(@NotNull Context context) {
            l lVar = l.f73548d;
            l lVar2 = lVar;
            if (lVar == null) {
                synchronized (this) {
                    l lVar3 = l.f73548d;
                    lVar2 = lVar3;
                    if (lVar3 == null) {
                        lVar2 = new l(context);
                        l.f73548d = lVar2;
                    }
                }
            }
            return lVar2;
        }
    }

    public l(Context context) {
        RawKV kvs = BLKV.getKvs(context, "mall_s_value", true, 10240);
        this.f73549a = kvs;
        this.f73550b = (ArrayList) ArraysKt.toCollection(kvs.getStrings("sValues", new String[0]), new ArrayList());
    }
}
