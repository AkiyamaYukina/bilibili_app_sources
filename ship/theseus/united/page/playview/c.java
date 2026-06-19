package com.bilibili.ship.theseus.united.page.playview;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.FragmentPosition;
import com.bapis.bilibili.playershared.FragmentVideoInfo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playview/c.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.SinglePlayViewScope")
@DaggerGenerated
@QualifierMetadata
public final class c implements Factory<List<Hr0.b>> {
    public static List<Hr0.b> a(PlayViewUniteReply playViewUniteReply) {
        ArrayList arrayList = new ArrayList();
        List videosList = playViewUniteReply.getFragmentVideo().getVideosList();
        ArrayList<FragmentVideoInfo> arrayList2 = new ArrayList();
        for (Object obj : videosList) {
            FragmentVideoInfo fragmentVideoInfo = (FragmentVideoInfo) obj;
            if (fragmentVideoInfo.getFragmentInfo().getFragmentPosition() == FragmentPosition.PRE && fragmentVideoInfo.getPlayableStatus()) {
                arrayList2.add(obj);
            }
        }
        int size = arrayList2.size();
        long timelength = 0;
        int i7 = 0;
        for (FragmentVideoInfo fragmentVideoInfo2 : arrayList2) {
            Hr0.b bVar = new Hr0.b(i7, size, fragmentVideoInfo2.getFragmentInfo().getFragmentTypeValue(), fragmentVideoInfo2.getFragmentInfo().getAid(), fragmentVideoInfo2.getFragmentInfo().getCid(), timelength, fragmentVideoInfo2.getTimelength());
            timelength += fragmentVideoInfo2.getTimelength();
            arrayList.add(bVar);
            i7++;
        }
        arrayList.add(new Hr0.b(i7, size, 0, playViewUniteReply.getPlayArc().getAid(), playViewUniteReply.getPlayArc().getCid(), timelength, playViewUniteReply.getPlayArc().getDurationMs()));
        long durationMs = playViewUniteReply.getPlayArc().getDurationMs();
        List videosList2 = playViewUniteReply.getFragmentVideo().getVideosList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : videosList2) {
            FragmentVideoInfo fragmentVideoInfo3 = (FragmentVideoInfo) obj2;
            if (fragmentVideoInfo3.getFragmentInfo().getFragmentPosition() == FragmentPosition.POST && fragmentVideoInfo3.getPlayableStatus()) {
                arrayList3.add(obj2);
            }
        }
        Iterator it = arrayList3.iterator();
        long timelength2 = durationMs + timelength;
        while (true) {
            i7++;
            if (!it.hasNext()) {
                return (List) Preconditions.checkNotNullFromProvides(arrayList);
            }
            FragmentVideoInfo fragmentVideoInfo4 = (FragmentVideoInfo) it.next();
            Hr0.b bVar2 = new Hr0.b(i7, size, fragmentVideoInfo4.getFragmentInfo().getFragmentTypeValue(), fragmentVideoInfo4.getFragmentInfo().getAid(), fragmentVideoInfo4.getFragmentInfo().getCid(), timelength2, fragmentVideoInfo4.getTimelength());
            timelength2 += fragmentVideoInfo4.getTimelength();
            arrayList.add(bVar2);
        }
    }
}
