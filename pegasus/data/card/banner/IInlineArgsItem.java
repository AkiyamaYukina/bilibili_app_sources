package com.bilibili.pegasus.data.card.banner;

import com.bilibili.app.comm.list.common.inline.service.CoverStatDisplay;
import com.bilibili.app.comm.list.common.inline.service.InlineCoverBadge;
import com.bilibili.app.comm.list.common.inline.service.InlinePendantAvatar;
import com.bilibili.inline.biz.card.ChronosData;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/card/banner/IInlineArgsItem.class */
public interface IInlineArgsItem {
    @Nullable
    ChronosData getChronosData();

    @Nullable
    InlineCoverBadge getCoverBadge();

    @Nullable
    List<CoverStatDisplay> getInlineStatArgsList();

    @Nullable
    InlinePendantAvatar getPendantAvatar();
}
