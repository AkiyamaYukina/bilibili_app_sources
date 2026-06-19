package com.bilibili.studio.centerplus.bubble;

import B21.g;
import C21.f;
import Cf1.i;
import android.app.Application;
import ci0.InterfaceC5262d;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import javax.inject.Singleton;
import kntr.app.upper.entrance.bubble2.service.d;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/bubble/b.class */
@Singleton
public final class b implements InterfaceC5262d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy<Boolean> f105099a = LazyKt.lazy(new i(10));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/bubble/b$a.class */
    public static final class a {
        public static boolean a() {
            return ((Boolean) b.f105099a.getValue()).booleanValue();
        }

        @NotNull
        public static String b() {
            Application application = BiliContext.application();
            return application == null ? "" : String.valueOf(BiliAccounts.get(application).mid());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // ci0.InterfaceC5262d
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.centerplus.bubble.b.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // ci0.InterfaceC5262d
    public final long b() {
        if (a.a()) {
            return DurationKt.toDuration(kntr.app.upper.entrance.bubble.b.c != null ? d.h().a : 0L, DurationUnit.SECONDS);
        }
        return DurationKt.toDuration(30L, DurationUnit.SECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // ci0.InterfaceC5262d
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.centerplus.bubble.b.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // ci0.InterfaceC5262d
    public final void d(@Nullable InterfaceC5262d.a aVar) {
        BLog.i("CenterPlusBubbleServiceImpl", "bubbleExposure, " + aVar);
        if (a.a() && aVar != null) {
            kntr.app.upper.entrance.bubble.b bVar = kntr.app.upper.entrance.bubble.b.a;
            String strB = a.b();
            Lazy lazy = f.a;
            StringBuilder sb = new StringBuilder("exposure, bubbleID=");
            String str = aVar.f58935a;
            sb.append(str);
            sb.append(", strategyID=0,resourceID=");
            String str2 = aVar.f58941g;
            sb.append(str2);
            sb.append(", ");
            String str3 = aVar.f58937c;
            sb.append(str3);
            sb.append(", isForce=");
            int i7 = aVar.f58945l;
            sb.append(i7);
            f.c("UperCenterPlusBubble", sb.toString());
            if (kntr.app.upper.entrance.bubble.b.c != null) {
                Lazy lazy2 = d.a;
                g gVar = new g();
                gVar.a = d.i();
                gVar.c = str2;
                gVar.d = str;
                gVar.e = str3;
                gVar.b = aVar.h;
                gVar.f = aVar.f58942i;
                gVar.g = aVar.f58943j;
                gVar.h = i7;
                d.f(strB).a(gVar);
            }
        }
    }
}
