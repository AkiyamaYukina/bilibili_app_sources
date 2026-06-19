package com.bilibili.upper.module.cover_v2.ui;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.bilibili.upper.module.aicollection.bean.AIPlayingMethodBean;
import com.bilibili.upper.module.aicollection.player.ui.AiPlayerPreviewDialog;
import com.bilibili.upper.module.cover_v2.ui.MultiAlertDialog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.dialog.BaseDialogFragment;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/MultiAlertDialog.class */
@StabilityInferred(parameters = 0)
public final class MultiAlertDialog extends BaseDialogFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public TextView f112861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public TextView f112862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public a f112863e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/MultiAlertDialog$a.class */
    public interface a {
        void onConfirm();
    }

    public final int getDialogViewRes() {
        return 2131501573;
    }

    public final void initView(@NotNull View view) {
        setCancelableOnTouchOutside(false);
        this.f112862d = (TextView) view.findViewById(2131311134);
        this.f112861c = (TextView) view.findViewById(2131309705);
        TextView textView = this.f112862d;
        if (textView != null) {
            textView.setOnClickListener(new com.bilibili.lib.imageviewer.f(this, 1));
        }
        TextView textView2 = this.f112861c;
        if (textView2 != null) {
            final int i7 = 0;
            textView2.setOnClickListener(new View.OnClickListener(this, i7) { // from class: com.bilibili.upper.module.cover_v2.ui.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f112938a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f112939b;

                {
                    this.f112938a = i7;
                    this.f112939b = this;
                }

                /* JADX WARN: Type inference failed for: r0v4, types: [androidx.fragment.app.DialogFragment, com.bilibili.upper.module.cover_v2.ui.MultiAlertDialog] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (this.f112938a) {
                        case 0:
                            ?? r02 = (MultiAlertDialog) this.f112939b;
                            MultiAlertDialog.a aVar = r02.f112863e;
                            r02.dismiss();
                            break;
                        case 1:
                            lg.b bVar = (lg.b) this.f112939b;
                            if (bVar != null) {
                                bVar.a((Object) null);
                            }
                            break;
                        default:
                            AiPlayerPreviewDialog aiPlayerPreviewDialog = (AiPlayerPreviewDialog) this.f112939b;
                            AIPlayingMethodBean aIPlayingMethodBean = aiPlayerPreviewDialog.b;
                            if (aIPlayingMethodBean != null) {
                                tF0.e eVar = aiPlayerPreviewDialog.d;
                                if (eVar != null) {
                                    tF0.c cVar = eVar.a;
                                    FragmentActivity fragmentActivity = eVar.b;
                                    tF0.c.J0(fragmentActivity, new tF0.d(cVar, fragmentActivity, aIPlayingMethodBean));
                                }
                                if (aiPlayerPreviewDialog.f < ((ArrayList) aiPlayerPreviewDialog.g).size()) {
                                    List list = aiPlayerPreviewDialog.g;
                                    String strValueOf = String.valueOf(((uF0.a) ((ArrayList) list).get(aiPlayerPreviewDialog.f)).v);
                                    String strValueOf2 = String.valueOf(aiPlayerPreviewDialog.b.pid);
                                    String str = aiPlayerPreviewDialog.i;
                                    Xz0.j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
                                    Xz0.j.c("router_topic_id", Xz0.g.f28463b);
                                    Map mapB = Xz0.j.b(Xz0.k.f28474a);
                                    String str2 = strValueOf;
                                    if (strValueOf == null) {
                                        str2 = "";
                                    }
                                    HashMap map = (HashMap) mapB;
                                    map.put("ugc_avid", str2);
                                    String str3 = strValueOf2;
                                    if (strValueOf2 == null) {
                                        str3 = "";
                                    }
                                    map.put("ai_play_id", str3);
                                    String str4 = str;
                                    if (str == null) {
                                        str4 = "";
                                    }
                                    map.put("source_from", str4);
                                    Neurons.reportClick(false, "creation.aigc.aigc-list.ugc-preview-join.click", mapB);
                                }
                                break;
                            }
                            break;
                    }
                }
            });
        }
    }
}
