package com.bilibili.pegasus.page;

import android.content.Context;
import android.view.OrientationEventListener;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.pegasus.page.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/c.class */
@StabilityInferred(parameters = 0)
public final class C5714c extends OrientationEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Function1<? super Boolean, Unit> f78390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Boolean f78391d;

    public C5714c(Context context) {
        super(context);
        this.f78388a = 45;
        this.f78389b = 45;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i7) {
        if (i7 == -1) {
            return;
        }
        int i8 = this.f78388a;
        boolean z6 = true;
        boolean z7 = i7 <= i8 || i7 >= 360 - i8;
        int i9 = this.f78389b;
        if (i7 > i9 + 180 || 180 - i9 > i7) {
            z6 = false;
        }
        Boolean bool = this.f78391d;
        if (bool == null) {
            Boolean bool2 = z6 ? Boolean.TRUE : z7 ? Boolean.FALSE : Boolean.FALSE;
            this.f78391d = bool2;
            BLog.i("GraduationFlipDetector", "init isReverse=" + bool2 + " orientation=" + i7);
            return;
        }
        Boolean bool3 = Boolean.FALSE;
        if (Intrinsics.areEqual(bool, bool3) && z6) {
            Boolean bool4 = Boolean.TRUE;
            this.f78391d = bool4;
            bilibili.live.app.service.resolver.c.a(i7, "Forward → Reverse orientation=", "GraduationFlipDetector");
            Function1<? super Boolean, Unit> function1 = this.f78390c;
            if (function1 != null) {
                function1.invoke(bool4);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(this.f78391d, Boolean.TRUE) && z7) {
            this.f78391d = bool3;
            bilibili.live.app.service.resolver.c.a(i7, "Reverse → Forward orientation=", "GraduationFlipDetector");
            Function1<? super Boolean, Unit> function12 = this.f78390c;
            if (function12 != null) {
                function12.invoke(bool3);
            }
        }
    }
}
