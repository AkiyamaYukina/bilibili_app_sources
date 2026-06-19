package com.bilibili.ship.theseus.united.page.interactvideo;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.opd.app.bizcommon.radar.ui.data.RadarNotificationBean;
import com.bilibili.upper.module.cover.ui.UpperCoverEditorActivity;
import com.bilibili.upper.module.cover_v2.draft.MultiCoverDraft;
import com.bilibili.upper.module.cover_v2.ui.MultiCoverMenuFragment;
import java.util.ArrayList;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import on0.C8242j;
import on0.InterfaceC8245m;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/g.class */
public final /* synthetic */ class g implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f99970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f99971b;

    public /* synthetic */ g(int i7, LifecycleOwner lifecycleOwner) {
        this.f99970a = i7;
        this.f99971b = lifecycleOwner;
    }

    public /* synthetic */ g(RadarNotificationBean radarNotificationBean, TextView textView) {
        this.f99970a = 2;
        this.f99971b = radarNotificationBean;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewPager viewPager;
        KH0.i iVarJf;
        com.bilibili.upper.module.cover_v2.service.c cVar;
        MultiCoverDraft multiCoverDraft;
        KH0.f fVar;
        KH0.f fVar2;
        switch (this.f99970a) {
            case 0:
                ((h) this.f99971b).f99973b.c(true);
                break;
            case 1:
                UpperCoverEditorActivity upperCoverEditorActivity = (UpperCoverEditorActivity) this.f99971b;
                if (!upperCoverEditorActivity.f112706R) {
                    upperCoverEditorActivity.e7();
                    Neurons.reportClick(false, "creation.new-publish.cover-edit.ratio.click", MapsKt.mapOf(TuplesKt.to("ratio", String.valueOf(1))));
                    SH0.b.b(upperCoverEditorActivity);
                    upperCoverEditorActivity.c7(true);
                    MultiCoverMenuFragment multiCoverMenuFragmentV6 = upperCoverEditorActivity.V6();
                    KH0.i iVarJf2 = multiCoverMenuFragmentV6.jf();
                    if (iVarJf2 != null && (fVar2 = iVarJf2.f12753l) != null) {
                        ((ArrayList) fVar2.f12739a).clear();
                        ((ArrayList) fVar2.f12740b).clear();
                        ((ArrayList) fVar2.f12742d).clear();
                    }
                    KH0.i iVarJf3 = multiCoverMenuFragmentV6.jf();
                    if (iVarJf3 != null && (fVar = iVarJf3.f12753l) != null) {
                        ((ArrayList) fVar.f12739a).add(new com.bilibili.upper.module.cover_v2.ui.m(multiCoverMenuFragmentV6));
                    }
                    multiCoverMenuFragmentV6.f112904e.lf();
                    MultiCoverMenuFragment multiCoverMenuFragmentV62 = upperCoverEditorActivity.V6();
                    KH0.i iVarC3 = upperCoverEditorActivity.C3();
                    multiCoverMenuFragmentV62.lf((iVarC3 == null || (multiCoverDraft = iVarC3.f12747e) == null) ? -10086 : multiCoverDraft.getTemplateId());
                    MultiCoverMenuFragment multiCoverMenuFragmentV63 = upperCoverEditorActivity.V6();
                    MultiCoverMenuFragment.a aVar = multiCoverMenuFragmentV63.f112905f;
                    if (aVar != null && (viewPager = aVar.f112908c) != null && viewPager.getCurrentItem() == 1 && (iVarJf = multiCoverMenuFragmentV63.jf()) != null && (cVar = iVarJf.f12755n) != null) {
                        cVar.a();
                    }
                    KH0.i iVar = upperCoverEditorActivity.f112700L;
                    if (iVar != null) {
                        iVar.f12759r = iVar.f12747e.m10652clone();
                    }
                    break;
                }
                break;
            default:
                RadarNotificationBean radarNotificationBean = (RadarNotificationBean) this.f99971b;
                int i7 = C8242j.f124803o;
                InterfaceC8245m listener = radarNotificationBean.getListener();
                if (listener != null) {
                    listener.b();
                }
                break;
        }
    }
}
