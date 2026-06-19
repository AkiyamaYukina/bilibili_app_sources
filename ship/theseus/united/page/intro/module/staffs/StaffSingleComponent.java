package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.relation.widget.FollowButton;
import dv0.C6868h0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffSingleComponent.class */
@StabilityInferred(parameters = 0)
public final class StaffSingleComponent extends com.bilibili.app.gemini.ui.m<C6868h0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final F f101795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f101796b = new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new EV.f(this, 8));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffSingleComponent$a.class */
    public static final class a implements InterfaceC6365b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FollowButton f101797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final StaffSingleComponent f101798b;

        public a(FollowButton followButton, StaffSingleComponent staffSingleComponent) {
            this.f101797a = followButton;
            this.f101798b = staffSingleComponent;
        }

        @Override // com.bilibili.ship.theseus.united.page.intro.module.staffs.InterfaceC6365b
        public final void a() {
            this.f101797a.bind(this.f101798b.f101795a.a());
        }
    }

    public StaffSingleComponent(@NotNull F f7) {
        this.f101795a = f7;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C6868h0.inflate(layoutInflater, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull dv0.C6868h0 r15, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 577
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffSingleComponent.a(dv0.h0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
