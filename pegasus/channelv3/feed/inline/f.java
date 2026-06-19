package com.bilibili.pegasus.channelv3.feed.inline;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.Observer;
import com.bilibili.app.comm.list.common.inline.config.pegasus.PegasusInlineConfigKt;
import com.bilibili.droid.ToastHelper;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.utils.InlineExtensionKt;
import com.bilibili.lib.blkv.BLKV;
import com.bilibili.lib.blkv.SharedPrefX;
import com.bilibili.moduleservice.list.PegasusInlineSwitchState;
import com.bilibili.ogv.community.bean.BangumiFollowStatus;
import com.bilibili.ogv.misc.follow.BangumiSeriesBottomSheet;
import com.bilibili.ogv.misc.follow.api.entity.SeriesItem;
import com.bilibili.pegasus.channelv3.movie.video.ChannelMovieVideoFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/feed/inline/f.class */
public final /* synthetic */ class f implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f75331b;

    public /* synthetic */ f(Object obj, int i7) {
        this.f75330a = i7;
        this.f75331b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v46, types: [androidx.fragment.app.Fragment, com.bilibili.ogv.misc.follow.BangumiSeriesBottomSheet, java.lang.Object] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        SharedPrefX bLSharedPreferences$default;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutLong;
        String strA;
        BangumiSeriesBottomSheet.a aVar;
        switch (this.f75330a) {
            case 0:
                a aVar2 = (a) obj;
                PegasusInlineSwitchState pegasusInlineSwitchState = aVar2.f75320a;
                ChannelMovieInlineSwitchState channelMovieInlineSwitchState = (ChannelMovieInlineSwitchState) this.f75331b;
                if (pegasusInlineSwitchState != ((com.bilibili.pegasus.channelv3.movie.video.f) channelMovieInlineSwitchState.f75318b.getValue()).h) {
                    com.bilibili.pegasus.channelv3.movie.video.f fVar = (com.bilibili.pegasus.channelv3.movie.video.f) channelMovieInlineSwitchState.f75318b.getValue();
                    ChannelMovieVideoFragment channelMovieVideoFragment = channelMovieInlineSwitchState.f75317a;
                    Context context = channelMovieVideoFragment.getContext();
                    PegasusInlineSwitchState pegasusInlineSwitchState2 = aVar2.f75320a;
                    if (context != null && (bLSharedPreferences$default = BLKV.getBLSharedPreferences$default(context, "channel_movie_inline_switch_state_sp", false, 0, 6, (Object) null)) != null && (editorEdit = bLSharedPreferences$default.edit()) != null && (editorPutLong = editorEdit.putLong("channel_movie_inline_switch_state_key", PegasusInlineConfigKt.toPegasusInlineDeviceConfigValue(pegasusInlineSwitchState2))) != null) {
                        editorPutLong.apply();
                    }
                    if (PegasusInlineConfigKt.isAutoPlayEnable(pegasusInlineSwitchState2)) {
                        channelMovieVideoFragment.nf();
                    } else {
                        IInlineControl iInlineControlFindInlineControl = InlineExtensionKt.findInlineControl(channelMovieVideoFragment);
                        if (iInlineControlFindInlineControl != null) {
                            iInlineControlFindInlineControl.stopPlay();
                        }
                    }
                    fVar.h = pegasusInlineSwitchState2;
                }
                break;
            default:
                Pair pair = (Pair) obj;
                Integer num = pair != null ? (Integer) pair.getFirst() : null;
                ?? r02 = (BangumiSeriesBottomSheet) this.f75331b;
                if (num == null || num.intValue() != 8) {
                    if (num != null && num.intValue() == 11) {
                        ToastHelper.showToastShort(r02.getContext(), r02.getString(2131832098));
                    } else if (num != null && num.intValue() == 9) {
                        ToastHelper.showToastShort(r02.p3(), 2131832113);
                    }
                } else if (pair.getSecond() != null) {
                    BangumiFollowStatus bangumiFollowStatus = (BangumiFollowStatus) pair.getSecond();
                    r02.getClass();
                    List<Pair<Integer, SeriesItem>> listHf = r02.hf(bangumiFollowStatus.h);
                    Iterator<T> it = listHf.iterator();
                    while (it.hasNext()) {
                        Pair pair2 = (Pair) it.next();
                        SeriesItem seriesItem = (SeriesItem) pair2.getSecond();
                        if (seriesItem != null) {
                            seriesItem.F(bangumiFollowStatus.f67509g);
                            int iIntValue = ((Number) pair2.getFirst()).intValue();
                            if (iIntValue != -1 && (aVar = r02.f69054i) != null) {
                                aVar.notifyItemChanged(iIntValue);
                            }
                        }
                    }
                    String str = bangumiFollowStatus.f67504b;
                    if (str == null || str.length() == 0) {
                        Pair pair3 = (Pair) CollectionsKt.getOrNull(listHf, 0);
                        SeriesItem seriesItem2 = pair3 != null ? (SeriesItem) pair3.getSecond() : null;
                        strA = seriesItem2 != null ? com.bilibili.bangumi.ui.support.a.a(seriesItem2.h(), r02.requireContext(), seriesItem2.A(), seriesItem2.z()) : "";
                    } else {
                        strA = bangumiFollowStatus.f67504b;
                    }
                    if (!StringsKt.isBlank(strA)) {
                        ToastHelper.showToastLong(r02.getContext(), strA);
                    }
                }
                break;
        }
    }
}
