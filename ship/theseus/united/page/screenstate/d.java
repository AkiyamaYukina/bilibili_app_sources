package com.bilibili.ship.theseus.united.page.screenstate;

import android.app.Activity;
import androidx.collection.ArraySet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommonv2.utils.p;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.bilibili.studio.material.util.UtilsKt;
import java.util.Set;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/d.class */
@StabilityInferred(parameters = 0)
public final class d implements c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final KProperty<Object>[] f102990m = {new MutablePropertyReference1Impl(d.class, "sensorOrientation", "getSensorOrientation()I", 0), new MutablePropertyReference1Impl(d.class, "isSystemAutoRotationOn", "isSystemAutoRotationOn()Z", 0), new MutablePropertyReference1Impl(d.class, "isUserAutoRotationOn", "isUserAutoRotationOn()Ljava/lang/Boolean;", 0), new MutablePropertyReference1Impl(d.class, "isVideoPortrait", "isVideoPortrait()Ljava/lang/Boolean;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f102991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f102992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<c.a> f102993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f102994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a f102995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final a f102996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final a f102997g;

    @Nullable
    public Integer h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Boolean f102998i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f102999j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ArraySet<Object> f103000k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ArraySet<Object> f103001l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/d$a.class */
    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public T f103002a;

        public a(T t7) {
            this.f103002a = t7;
        }

        public final void a(@NotNull d dVar, @NotNull KProperty<?> kProperty, T t7) {
            if (Intrinsics.areEqual(this.f103002a, t7)) {
                return;
            }
            defpackage.a.b("[theseus-united-TheseusScreenStateRepositoryImpl$RefreshStateDelegate-setValue] ", "Setting property " + kProperty.getName() + " to " + t7 + UtilsKt.DOT, "TheseusScreenStateRepositoryImpl$RefreshStateDelegate-setValue");
            this.f103002a = t7;
            dVar.q();
        }
    }

    @Inject
    public d(@NotNull Activity activity, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar) {
        this.f102991a = aVar;
        boolean zD = p.d();
        this.f102992b = zD;
        this.f102993c = zD ? activity.getWindowManager().getDefaultDisplay().getRotation() == 3 ? StateFlowKt.MutableStateFlow(new c.a(false, false, true)) : StateFlowKt.MutableStateFlow(new c.a(false, false, false)) : StateFlowKt.MutableStateFlow(new c.a());
        this.f102994d = new a(-2);
        this.f102995e = new a(Boolean.FALSE);
        this.f102996f = new a(null);
        this.f102997g = new a(null);
        this.f103000k = new ArraySet<>(0, 1, null);
        this.f103001l = new ArraySet<>(0, 1, null);
    }

    @Override // com.bilibili.ship.theseus.united.page.screenstate.c
    public final void a(@Nullable Boolean bool) {
        this.f102996f.a(this, f102990m[2], bool);
    }

    @Override // com.bilibili.ship.theseus.united.page.screenstate.c
    public final void b(@NotNull Object obj, boolean z6) {
        r(this.f103001l, "sensor rotation", obj, z6);
    }

    @Override // com.bilibili.ship.theseus.united.page.screenstate.c
    @NotNull
    public final StateFlow c() {
        return FlowKt.asStateFlow(this.f102993c);
    }

    @Override // com.bilibili.ship.theseus.united.page.screenstate.c
    public final void d() {
        BLog.i("TheseusScreenStateRepositoryImpl-switchToPortrait", "[theseus-united-TheseusScreenStateRepositoryImpl-switchToPortrait] switchToPortrait");
        if (h().f102987a) {
            return;
        }
        this.h = Integer.valueOf(o());
        this.f102998i = f();
        this.f102999j = false;
        q();
    }

    @Override // com.bilibili.ship.theseus.united.page.screenstate.c
    public final void e() {
        BLog.i("TheseusScreenStateRepositoryImpl-switchToFullscreen", "[theseus-united-TheseusScreenStateRepositoryImpl-switchToFullscreen] switchToFullscreen");
        this.h = Integer.valueOf(o());
        this.f102998i = f();
        this.f102999j = true;
        q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.ship.theseus.united.page.screenstate.c
    @Nullable
    public final Boolean f() {
        KProperty<Object> kProperty = f102990m[3];
        return (Boolean) this.f102997g.f103002a;
    }

    @Override // com.bilibili.ship.theseus.united.page.screenstate.c
    public final void g() {
        BLog.i("TheseusScreenStateRepositoryImpl-switchToHalfscreen", "[theseus-united-TheseusScreenStateRepositoryImpl-switchToHalfscreen] switchToHalfScreen");
        this.h = Integer.valueOf(o());
        this.f102998i = f();
        this.f102999j = false;
        q();
    }

    @Override // com.bilibili.ship.theseus.united.page.screenstate.c
    @NotNull
    public final c.a h() {
        return (c.a) this.f102993c.getValue();
    }

    @Override // com.bilibili.ship.theseus.united.page.screenstate.c
    public final void i(boolean z6) {
        this.f102995e.a(this, f102990m[1], Boolean.valueOf(z6));
    }

    @Override // com.bilibili.ship.theseus.united.page.screenstate.c
    public final void j(@NotNull Object obj, boolean z6) {
        r(this.f103000k, "landscape", obj, z6);
    }

    @Override // com.bilibili.ship.theseus.united.page.screenstate.c
    public final boolean k() {
        return !this.f103001l.isEmpty();
    }

    @Override // com.bilibili.ship.theseus.united.page.screenstate.c
    public final void l(@Nullable Boolean bool) {
        this.f102997g.a(this, f102990m[3], bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.ship.theseus.united.page.screenstate.c
    public final boolean m() {
        KProperty<Object> kProperty = f102990m[1];
        return ((Boolean) this.f102995e.f103002a).booleanValue();
    }

    @Override // com.bilibili.ship.theseus.united.page.screenstate.c
    public final void n(int i7) {
        this.f102994d.a(this, f102990m[0], Integer.valueOf(i7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int o() {
        KProperty<Object> kProperty = f102990m[0];
        return ((Number) this.f102994d.f103002a).intValue();
    }

    public final boolean p() {
        Integer num = this.h;
        if (num != null && num.intValue() == -2) {
            this.h = Integer.valueOf(o());
        }
        Integer num2 = this.h;
        int iO = o();
        if (num2 != null && num2.intValue() == iO) {
            if (Intrinsics.areEqual(this.f102998i, f())) {
                return true;
            }
            if (this.f102998i == null) {
                this.f102998i = f();
                return true;
            }
        }
        this.h = null;
        this.f102998i = null;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q() {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.screenstate.d.q():void");
    }

    public final void r(Set<Object> set, String str, Object obj, boolean z6) {
        boolean zIsEmpty = set.isEmpty();
        if (z6 ? set.add(obj) : set.remove(obj)) {
            StringBuilder sbA = G0.b.a("rotation lockChanged: ", z6 ? "Lock" : "Unlock", " ", str, " with ");
            sbA.append(obj);
            defpackage.a.b("[theseus-united-TheseusScreenStateRepositoryImpl-updateLocks] ", sbA.toString(), "TheseusScreenStateRepositoryImpl-updateLocks");
        }
        if (zIsEmpty != set.isEmpty()) {
            BLog.i("TheseusScreenStateRepositoryImpl-updateLocks", "[theseus-united-TheseusScreenStateRepositoryImpl-updateLocks] updateLocks");
            q();
        }
    }
}
