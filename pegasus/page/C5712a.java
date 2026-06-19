package com.bilibili.pegasus.page;

import M3.X1;
import androidx.lifecycle.Observer;
import com.bilibili.lib.homepage.splash.SplashViewModel;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.performance.BootOpt;
import com.bilibili.lib.performance.BootTracerV2;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.pegasus.PegasusVisibleState;
import com.bilibili.playset.api.MultitypeMedia;
import com.bilibili.playset.playlist.entity.PlaylistDetailBean;
import com.bilibili.playset.playlist.search.MusicSearchResultFragment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.pegasus.page.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/a.class */
public final /* synthetic */ class C5712a implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx_fragment_app_Fragment f78387b;

    public /* synthetic */ C5712a(int i7, androidx_fragment_app_Fragment androidx_fragment_app_fragment) {
        this.f78386a = i7;
        this.f78387b = androidx_fragment_app_fragment;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        androidx_fragment_app_Fragment androidx_fragment_app_fragment = this.f78387b;
        switch (this.f78386a) {
            case 0:
                SplashViewModel.SplashExitInfo splashExitInfo = (SplashViewModel.SplashExitInfo) obj;
                if ((splashExitInfo != null && splashExitInfo.getAnimState() == 2) || (splashExitInfo != null && splashExitInfo.getAnimState() == 0)) {
                    BasePegasusFragment basePegasusFragment = (BasePegasusFragment) androidx_fragment_app_fragment;
                    int i7 = basePegasusFragment.f78276k;
                    basePegasusFragment.m8159onVisibleStateChanged9haIX0A(i7, PegasusVisibleState.copy-aHuVRVM$default(i7, true, false, false, false, 14, (Object) null));
                    BootTracerV2 bootTracerV2 = BootTracerV2.a;
                    if (EntryPointKt.getReporterSplashState()) {
                        if (BootTracerV2.m) {
                            BLog.i("BootTracerV2_", "has reported, return");
                        } else {
                            BootTracerV2.m = true;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("pegasus_api_status", String.valueOf(BootTracerV2.i));
                            Neurons.trackT(false, "ops.misaka.splash.event", linkedHashMap, 1, new X1(5));
                        }
                    }
                    BootOpt.INSTANCE.record();
                    break;
                }
                break;
            default:
                PlaylistDetailBean playlistDetailBean = (PlaylistDetailBean) obj;
                MusicSearchResultFragment musicSearchResultFragment = (MusicSearchResultFragment) androidx_fragment_app_fragment;
                musicSearchResultFragment.getClass();
                if (playlistDetailBean.getMedias() != null) {
                    os0.r rVar = musicSearchResultFragment.f85352e;
                    ArrayList<MultitypeMedia> medias = playlistDetailBean.getMedias();
                    rVar.f124966a.clear();
                    rVar.f124966a.addAll(medias);
                    rVar.notifyDataSetChanged();
                    musicSearchResultFragment.f85352e.notifyDataSetChanged();
                }
                break;
        }
    }
}
