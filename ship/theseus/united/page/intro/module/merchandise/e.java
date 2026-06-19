package com.bilibili.ship.theseus.united.page.intro.module.merchandise;

import com.bapis.bilibili.app.viewunite.common.Merchandise;
import com.bapis.bilibili.app.viewunite.common.MerchandiseButton;
import com.bapis.bilibili.app.viewunite.common.MerchandiseCard;
import com.bapis.bilibili.app.viewunite.common.MerchandiseTitle;
import com.bilibili.adcommon.utils.AdMossHelper;
import com.google.protobuf.Any;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/merchandise/e.class */
public final class e {
    @NotNull
    public static final d a(@NotNull Merchandise merchandise) {
        String title = merchandise.getTitle();
        MerchandiseButton button = merchandise.getButton();
        b bVar = button != null ? new b(button.getButTitle(), button.getButDayColor(), button.getButNightColor()) : null;
        List<MerchandiseCard> cardList = merchandise.getCardList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(cardList, 10));
        b bVar2 = bVar;
        for (MerchandiseCard merchandiseCard : cardList) {
            String cover = merchandiseCard.getCover();
            String title2 = merchandiseCard.getTitle();
            List<MerchandiseTitle> subTitleList = merchandiseCard.getSubTitleList();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(subTitleList, 10));
            for (MerchandiseTitle merchandiseTitle : subTitleList) {
                arrayList2.add(new k(merchandiseTitle.getTitle(), merchandiseTitle.getDayColor(), merchandiseTitle.getNightColor(), (int) merchandiseTitle.getFontSize(), merchandiseTitle.getTextDecoration()));
            }
            MerchandiseButton button2 = merchandiseCard.getButton();
            b bVar3 = button2 != null ? new b(button2.getButTitle(), button2.getButDayColor(), button2.getButNightColor()) : null;
            Any sourceContent = merchandiseCard.getSourceContent();
            arrayList.add(new c(cover, title2, arrayList2, bVar3, sourceContent != null ? AdMossHelper.INSTANCE.createSourceContent(sourceContent) : null));
        }
        return new d(title, bVar2, arrayList);
    }
}
