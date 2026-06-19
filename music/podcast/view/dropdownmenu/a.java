package com.bilibili.music.podcast.view.dropdownmenu;

import android.view.View;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/dropdownmenu/a.class */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DropDownMenuHead f67229a;

    public a(DropDownMenuHead dropDownMenuHead) {
        this.f67229a = dropDownMenuHead;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f67229a.f67222x) {
            return;
        }
        int iIntValue = ((Integer) view.getTag()).intValue();
        DropDownMenuHead dropDownMenuHead = this.f67229a;
        boolean z6 = iIntValue == dropDownMenuHead.f67211m;
        dropDownMenuHead.setCurrentMenu(iIntValue);
        int i7 = 0;
        while (i7 < this.f67229a.f67205f.size()) {
            this.f67229a.f67205f.get(i7).f56690b = iIntValue == i7 && this.f67229a.f67202c.getVisibility() != 0;
            i7++;
        }
        this.f67229a.d(false);
        this.f67229a.setRecyclerView(iIntValue);
        if (this.f67229a.f67202c.getVisibility() == 0) {
            if (z6) {
                this.f67229a.c();
                return;
            }
            return;
        }
        DropDownMenuHead dropDownMenuHead2 = this.f67229a;
        if (dropDownMenuHead2.f67202c.getVisibility() == 0 || dropDownMenuHead2.f67222x) {
            return;
        }
        dropDownMenuHead2.f67203d.setVisibility(0);
        dropDownMenuHead2.f67203d.startAnimation(dropDownMenuHead2.f67207i);
        dropDownMenuHead2.f67202c.setVisibility(0);
        dropDownMenuHead2.f67202c.startAnimation(dropDownMenuHead2.f67208j);
    }
}
