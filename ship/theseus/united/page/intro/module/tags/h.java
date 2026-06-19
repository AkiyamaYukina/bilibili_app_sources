package com.bilibili.ship.theseus.united.page.intro.module.tags;

import com.bapis.bilibili.app.view.v1.CellFluid;
import com.bapis.bilibili.app.view.v1.SpecialCell;
import com.bapis.bilibili.app.view.v1.ViewTagReply;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/h.class */
public final class h {
    @NotNull
    public static final j a(@NotNull ViewTagReply viewTagReply) {
        List<SpecialCell> specialCellNewList = viewTagReply.getSpecialCellNewList();
        ArrayList arrayList = new ArrayList();
        for (SpecialCell specialCell : specialCellNewList) {
            String icon = specialCell.getIcon();
            String iconNight = specialCell.getIconNight();
            String text = specialCell.getText();
            String textColor = specialCell.getTextColor();
            String textColorNight = specialCell.getTextColorNight();
            String jumpUrl = specialCell.getJumpUrl();
            String cellType = specialCell.getCellType();
            String cellBgcolor = specialCell.getCellBgcolor();
            String cellBgcolorNight = specialCell.getCellBgcolorNight();
            String param = specialCell.getParam();
            String pageTitle = specialCell.getPageTitle();
            String jumpType = specialCell.getJumpType();
            String endIcon = specialCell.getEndIcon();
            String endIconNight = specialCell.getEndIconNight();
            CellFluid cellFluid = specialCell.getCellFluid();
            arrayList.add(new a(icon, iconNight, text, textColor, textColorNight, jumpUrl, cellType, cellBgcolor, cellBgcolorNight, param, pageTitle, jumpType, endIcon, endIconNight, new b(cellFluid.getTopBaseColor(), cellFluid.getTopSplitColor(), cellFluid.getTopTextColor()), MapsKt.emptyMap()));
        }
        return new j(arrayList);
    }
}
