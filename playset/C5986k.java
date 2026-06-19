package com.bilibili.playset;

import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.TextView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.playset.api.PlaySet;
import com.bilibili.playset.api.PlaySetGroups;

/* JADX INFO: renamed from: com.bilibili.playset.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/k.class */
public final class C5986k extends ls0.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f85091i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f85092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f85093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f85094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TintTextView f85095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f85096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f85097g;
    public PlaySetGroups.DefaultFolderGroup h;

    public C5986k() {
        throw null;
    }

    @Override // ls0.g
    public final void p0() {
        this.f85092b.setImageResource(2131238491);
    }

    @Override // ls0.g
    public final void q0() {
        this.f85092b.setImageResource(2131238493);
    }

    public final void r0(PlaySetGroups.DefaultFolderGroup defaultFolderGroup) {
        this.h = defaultFolderGroup;
        this.f85095e.setTag(defaultFolderGroup.detail);
        this.f85096f.setTag(defaultFolderGroup.detail);
        this.f85097g.setTag(defaultFolderGroup.detail);
        TextView textView = this.f85093c;
        PlaySet playSet = defaultFolderGroup.detail;
        textView.setText(playSet == null ? this.itemView.getResources().getString(2131842609) : playSet.title);
        this.f85094d.setText(this.itemView.getResources().getString(2131833087, Integer.valueOf(defaultFolderGroup.getTotalCount())));
        if (defaultFolderGroup.getTotalCount() == 0) {
            this.f85095e.setVisibility(8);
        } else {
            this.f85095e.setVisibility(0);
        }
    }

    public final boolean s0(MotionEvent motionEvent) {
        float x6 = motionEvent.getX();
        if (this.f85095e.getVisibility() != 0) {
            if (x6 < this.f85096f.getLeft()) {
                return false;
            }
            if (x6 < this.f85097g.getLeft()) {
                this.f85096f.performClick();
                return true;
            }
            this.f85097g.performClick();
            return true;
        }
        if (x6 < this.f85095e.getLeft()) {
            return false;
        }
        if (x6 < this.f85096f.getLeft()) {
            this.f85095e.performClick();
            return true;
        }
        if (x6 < this.f85097g.getLeft()) {
            this.f85096f.performClick();
            return true;
        }
        this.f85097g.performClick();
        return true;
    }
}
