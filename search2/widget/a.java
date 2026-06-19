package com.bilibili.search2.widget;

import androidx.core.view.GravityCompat;
import com.bilibili.search2.widget.NewFlowLayoutManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/a.class */
public final class a extends NewFlowLayoutManager.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NewFlowLayoutManager f88975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88976b;

    public a(NewFlowLayoutManager newFlowLayoutManager, int i7) {
        this.f88975a = newFlowLayoutManager;
        this.f88976b = i7;
    }

    @Override // com.bilibili.search2.widget.NewFlowLayoutManager.a
    public final int a(int i7, int i8) {
        int i9;
        int i10 = this.f88976b & 112;
        if (i10 != 16) {
            if (i10 != 80) {
                i9 = 0;
            }
            return i9;
        }
        i8 /= 2;
        i7 /= 2;
        i9 = i8 - i7;
        return i9;
    }

    @Override // com.bilibili.search2.widget.NewFlowLayoutManager.a
    public final int b(int i7) {
        int width;
        int paddingLeft;
        NewFlowLayoutManager newFlowLayoutManager = this.f88975a;
        int absoluteGravity = GravityCompat.getAbsoluteGravity(this.f88976b, newFlowLayoutManager.getLayoutDirection()) & 7;
        if (absoluteGravity == 1) {
            width = ((newFlowLayoutManager.getWidth() - newFlowLayoutManager.getPaddingLeft()) - newFlowLayoutManager.getPaddingRight()) / 2;
            i7 /= 2;
        } else {
            if (absoluteGravity != 5) {
                paddingLeft = newFlowLayoutManager.getPaddingLeft();
                return paddingLeft;
            }
            width = newFlowLayoutManager.getWidth() - newFlowLayoutManager.getPaddingRight();
        }
        paddingLeft = width - i7;
        return paddingLeft;
    }

    @Override // com.bilibili.search2.widget.NewFlowLayoutManager.a
    public final int c() {
        NewFlowLayoutManager newFlowLayoutManager = this.f88975a;
        return (newFlowLayoutManager.getWidth() - newFlowLayoutManager.getPaddingLeft()) - newFlowLayoutManager.getPaddingRight();
    }
}
