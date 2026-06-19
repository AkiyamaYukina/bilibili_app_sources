package com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchHotItem;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.bilibili.studio.videoeditor.ms.transition.TransitionData;
import com.bilibili.studio.videoeditor.util.V;
import java.util.HashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import nt0.C8141a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/transition/b.class */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f107052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LifecycleOwner f107053b;

    public /* synthetic */ b(int i7, LifecycleOwner lifecycleOwner) {
        this.f107052a = i7;
        this.f107053b = lifecycleOwner;
    }

    /* JADX WARN: Type inference failed for: r0v45, types: [Z7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder, dt0.f, nt0.a] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f107052a) {
            case 0:
                BiliEditorTransitionFragmentV2 biliEditorTransitionFragmentV2 = (BiliEditorTransitionFragmentV2) this.f107053b;
                if (!V.f()) {
                    BiliEditorTransitionViewModel biliEditorTransitionViewModelLf = biliEditorTransitionFragmentV2.lf();
                    biliEditorTransitionViewModelLf.getClass();
                    biliEditorTransitionViewModelLf.N0(false);
                    biliEditorTransitionViewModelLf.f107015c.l();
                    biliEditorTransitionFragmentV2.mf();
                    String strP = CollectionsKt.p(biliEditorTransitionFragmentV2.lf().f107020i, ",", (CharSequence) null, (CharSequence) null, new aT.d(1), 30);
                    TransitionData.TransitionTabBean transitionTabBeanL0 = biliEditorTransitionFragmentV2.lf().L0();
                    String str = transitionTabBeanL0 != null ? transitionTabBeanL0.name : null;
                    Xz0.j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
                    Xz0.j.c("router_topic_id", Xz0.g.f28463b);
                    Map mapB = Xz0.j.b(Xz0.k.f28475b);
                    String str2 = str;
                    if (str == null) {
                        str2 = "";
                    }
                    HashMap map = (HashMap) mapB;
                    map.put("tab", str2);
                    String str3 = strP;
                    if (strP == null) {
                        str3 = "";
                    }
                    map.put("transition_id", str3);
                    Neurons.reportClick(false, "creation.new-video-editor.transition.confirm.click", mapB);
                }
                break;
            default:
                ?? r02 = (C8141a) this.f107053b;
                String moreUrl = ((SearchHotItem) r02.getData()).getMoreUrl();
                if (moreUrl != null) {
                    Os0.e.g(Os0.e.f18030a, r02.itemView.getContext(), moreUrl);
                    r02.clickWithRefreshStatus();
                }
                Xs0.b.i("search.search-result.search-card.all.click", null, ((SearchHotItem) r02.getData()).getLinkType(), (BaseSearchItem) r02.getData(), null, null, Xs0.b.d((BaseSearchItem) r02.getData(), null, null, 3), null, null, MapsKt.mapOf(TuplesKt.to("hotword", ((SearchHotItem) r02.getData()).getTitle())), false, null, 7088);
                break;
        }
    }
}
