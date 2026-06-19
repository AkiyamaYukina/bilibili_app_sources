package com.bilibili.playset;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bilibili.playset.api.PlaySetGroups;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/E0.class */
public final class E0 extends ls0.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f83855e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f83856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f83857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f83858d;

    public E0(View view) {
        super(view);
        this.f83856b = (ImageView) view.findViewById(2131312046);
        this.f83857c = (TextView) view.findViewById(2131308958);
        this.f83858d = (TextView) view.findViewById(2131299492);
    }

    @Override // ls0.g
    public final void p0() {
        this.f83856b.setImageResource(2131238491);
    }

    @Override // ls0.g
    public final void q0() {
        this.f83856b.setImageResource(2131238493);
    }

    public final void r0(PlaySetGroups.OtherFolderGroup otherFolderGroup) {
        TextView textView = this.f83857c;
        long j7 = otherFolderGroup.id;
        String string = j7 == 1 ? TextUtils.isEmpty(otherFolderGroup.name) ? this.itemView.getResources().getString(2131842467) : otherFolderGroup.name : (j7 == 2 && TextUtils.isEmpty(otherFolderGroup.name)) ? this.itemView.getResources().getString(2131842500) : otherFolderGroup.name;
        textView.setText(string);
        this.f83858d.setText(this.itemView.getResources().getString(2131833087, Integer.valueOf(otherFolderGroup.getTotalCount())));
    }
}
