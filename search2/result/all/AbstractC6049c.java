package com.bilibili.search2.result.all;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.tag.TagsView;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.Tag;
import dt0.AbstractC6843f;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.search2.result.all.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/c.class */
@StabilityInferred(parameters = 0)
public abstract class AbstractC6049c<T extends BaseSearchItem> extends AbstractC6843f<T> {
    public static void q0(@NotNull TagsView tagsView, @Nullable List list) {
        if (list == null || list.isEmpty()) {
            tagsView.setVisibility(8);
            return;
        }
        TagsView.clearTagList$default(tagsView, false, 1, (Object) null);
        TagsView.TagBuilder tagBuilder = tagsView.tagBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Tag tag = (Tag) it.next();
            TagsView.TagBuilder.appendTag$default(tagBuilder.setTagText(tag.getText()).setTagTextColor(tag.getTextColor()).setTagNightTextColor(tag.getTextColorNight()).setTagBackgroundColor(tag.getBgColor()).setTagNightBackgroundColor(tag.getBgColorNight()).setTagBorderColor(tag.getBorderColor()).setTagNightBorderColor(tag.getBorderColorNight()).setTagBackgroundStyle(tag.getBgStyle()), false, false, false, 7, (Object) null);
        }
        tagBuilder.applyToView();
        tagsView.setVisibility(0);
    }
}
