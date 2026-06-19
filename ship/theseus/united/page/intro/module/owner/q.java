package com.bilibili.ship.theseus.united.page.intro.module.owner;

import android.view.View;
import dv0.Z;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/q.class */
public final class q implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z f100669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OwnerComponent f100670b;

    public q(Z z6, OwnerComponent ownerComponent) {
        this.f100669a = z6;
        this.f100670b = ownerComponent;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        view.removeOnLayoutChangeListener(this);
        int width = this.f100669a.f116871a.getWidth();
        int paddingRight = this.f100669a.f116871a.getPaddingRight();
        int iE = OwnerComponent.e(this.f100670b, this.f100669a.f116878i);
        int iE2 = OwnerComponent.e(this.f100670b, this.f100669a.f116880k);
        int iE3 = OwnerComponent.e(this.f100670b, this.f100669a.f116875e);
        this.f100669a.f116877g.setMaxWidth(RangesKt.coerceAtLeast(((width - paddingRight) - this.f100669a.f116876f.getLeft()) - (iE3 + (iE2 + iE)), 0));
    }
}
