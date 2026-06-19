package com.bilibili.ship.theseus.united.page.danmaku;

import M3.C2611q0;
import com.bapis.bilibili.playershared.FragmentVideo;
import com.bapis.bilibili.playershared.FragmentVideoInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.GetWorkInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/i.class */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f99532a = LazyKt.lazy(new C2611q0(6));

    @NotNull
    public static final List<GetWorkInfo.Attachment> a(@NotNull FragmentVideo fragmentVideo) {
        List<FragmentVideoInfo> videosList = fragmentVideo.getVideosList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(videosList, 10));
        for (FragmentVideoInfo fragmentVideoInfo : videosList) {
            GetWorkInfo.Attachment attachment = new GetWorkInfo.Attachment();
            attachment.setWorkId(String.valueOf(fragmentVideoInfo.getFragmentInfo().getAid()));
            attachment.setVideoId(String.valueOf(fragmentVideoInfo.getFragmentInfo().getCid()));
            attachment.setDuration(fragmentVideoInfo.getTimelength());
            attachment.setIndex(fragmentVideoInfo.getFragmentInfo().getIndex());
            attachment.setType(fragmentVideoInfo.getFragmentInfo().getFragmentPositionValue());
            arrayList.add(attachment);
        }
        return arrayList;
    }
}
