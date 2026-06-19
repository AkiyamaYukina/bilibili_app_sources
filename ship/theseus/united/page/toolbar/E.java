package com.bilibili.ship.theseus.united.page.toolbar;

import android.content.Context;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbWatcher;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintToolbar;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/E.class */
public final class E implements GarbWatcher.Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TintToolbar f103227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ToolbarRepository f103228b;

    public E(TintToolbar tintToolbar, ToolbarRepository toolbarRepository) {
        this.f103227a = tintToolbar;
        this.f103228b = toolbarRepository;
    }

    @Override // com.bilibili.lib.ui.garb.GarbWatcher.Observer
    public final void onSkinChange(Garb garb) {
        boolean zIsPure = garb.isPure();
        int fontColor = 0;
        ToolbarRepository toolbarRepository = this.f103228b;
        TintToolbar tintToolbar = this.f103227a;
        if (zIsPure) {
            if (tintToolbar.hasIconTint()) {
                tintToolbar.setIconTintColorResource(2131103911);
                tintToolbar.setBackgroundResource(2131103971);
                MultipleThemeUtils.refreshMenuIconTint(toolbarRepository.f103282e, tintToolbar, 0);
            }
            if (tintToolbar.hasTitleTint()) {
                tintToolbar.setTitleTintColorResource(2131103914);
                return;
            }
            return;
        }
        if (tintToolbar.hasIconTint()) {
            tintToolbar.setIconTintColorWithGarb(garb.getFontColor());
            tintToolbar.setBackgroundColorWithGarb(garb.getSecondaryPageColor());
            Context context = toolbarRepository.f103282e;
            if (!garb.isPure()) {
                fontColor = garb.getFontColor();
            }
            MultipleThemeUtils.refreshMenuIconTint(context, tintToolbar, fontColor);
        }
        if (tintToolbar.hasTitleTint()) {
            if (garb.isPrimaryOnly()) {
                tintToolbar.setTitleColorWithGarb(ThemeUtils.getColorById(toolbarRepository.f103282e, 2131103914));
            } else {
                tintToolbar.setTitleColorWithGarb(garb.getFontColor());
            }
        }
    }
}
