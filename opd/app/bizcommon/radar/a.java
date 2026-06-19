package com.bilibili.opd.app.bizcommon.radar;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.blkv.BLKV;
import com.bilibili.lib.blkv.RawKV;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C0471a f74168b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static volatile a f74169c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RawKV f74170a = BLKV.getKvs$default(BiliContext.application(), "radar", true, 0, 4, (Object) null);

    /* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.radar.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/a$a.class */
    public static final class C0471a {
        @NotNull
        public final a a() {
            a aVar = a.f74169c;
            a aVar2 = aVar;
            if (aVar == null) {
                synchronized (this) {
                    a aVar3 = a.f74169c;
                    aVar2 = aVar3;
                    if (aVar3 == null) {
                        aVar2 = new a();
                        a.f74169c = aVar2;
                    }
                }
            }
            return aVar2;
        }
    }
}
