package com.bilibili.studio.videoeditor.capturev3.music;

import HG0.ViewOnClickListenerC2102p0;
import TB0.M;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.viewbinding.ViewBinding;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.studio.base.BaseVMFragment;
import com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment;
import com.bilibili.studio.videoeditor.capturev3.music.dialog.OldMusicOperationDialog;
import com.bilibili.studio.videoeditor.capturev3.viewmodel.IndependentCaptureViewModel;
import com.bilibili.studio.videoeditor.capturev3.widget.ScrollTextView;
import com.bilibili.studio.videoeditor.lrc.LrcListView;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/music/f.class */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ScrollTextView f109264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public LrcListView f109265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public View f109266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public View f109267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ViewGroup f109268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ViewGroup f109269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public IndependentCaptureFragment f109270g;

    public final void a() {
        ViewGroup viewGroup = this.f109268e;
        if (viewGroup != null) {
            viewGroup.setEnabled(false);
            viewGroup.setAlpha(0.2f);
        }
    }

    public void b(@Nullable ViewBinding viewBinding) {
        if (viewBinding instanceof M) {
            M m7 = (M) viewBinding;
            c(m7.f23612U, m7.f23637p0, m7.f23621a0, m7.f23618Y0, m7.f23602K, m7.f23624c0);
        }
    }

    public final void c(@NotNull ScrollTextView scrollTextView, @NotNull LrcListView lrcListView, @NotNull View view, @NotNull View view2, @NotNull ViewGroup viewGroup, @NotNull ViewGroup viewGroup2) {
        this.f109264a = scrollTextView;
        this.f109265b = lrcListView;
        this.f109266c = view;
        this.f109267d = view2;
        this.f109268e = viewGroup;
        this.f109269f = viewGroup2;
        viewGroup.setOnClickListener(new ViewOnClickListenerC2102p0(this, 4));
        View view3 = this.f109266c;
        if (view3 != null) {
            view3.setOnClickListener(new Ae0.e(this, 4));
        }
        View view4 = this.f109267d;
        if (view4 != null) {
            view4.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.studio.videoeditor.capturev3.music.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final f f109258a;

                {
                    this.f109258a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    IndependentCaptureFragment independentCaptureFragment = this.f109258a.f109270g;
                    if (independentCaptureFragment != null) {
                        independentCaptureFragment.Xf().d();
                        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) independentCaptureFragment).b;
                        if (independentCaptureViewModel != null) {
                            InfoEyesManager.getInstance().report2(false, "000225", new String[]{"shoot_lrc_on_click", "click", independentCaptureViewModel.f109314c});
                        }
                    }
                }
            });
        }
    }

    public final void d() {
        EC0.a aVar;
        EC0.c cVar;
        ViewGroup viewGroup = this.f109269f;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        LrcListView lrcListView = this.f109265b;
        if (lrcListView != null) {
            lrcListView.setVisibility(0);
        }
        View view = this.f109266c;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.f109267d;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        LrcListView lrcListView2 = this.f109265b;
        if (lrcListView2 == null || (aVar = lrcListView2.f109812a) == null || (cVar = aVar.f3909a) == null) {
            return;
        }
        String str = lrcListView2.f109816e;
        boolean z6 = cVar.f3912b > 0;
        JSONObject jSONObjectA = com.bilibili.biligame.web2.j.a("operation_from", str);
        jSONObjectA.put("time", z6 ? "1" : "2");
        InfoEyesManager.getInstance().report2(false, "000377", new String[]{"shoot_lrc_show", "show", jSONObjectA.toJSONString()});
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.DialogFragment, com.bilibili.studio.videoeditor.capturev3.music.dialog.OldMusicOperationDialog] */
    public void e(@NotNull FragmentManager fragmentManager) {
        ?? oldMusicOperationDialog = new OldMusicOperationDialog();
        oldMusicOperationDialog.f109261b = new BB0.d(new c(this), oldMusicOperationDialog);
        oldMusicOperationDialog.show(fragmentManager, "MusicOperationDialog");
    }

    public final void f(long j7) {
        EC0.c cVar;
        int i7;
        List<EC0.d> list;
        LrcListView lrcListView = this.f109265b;
        if (lrcListView == null || j7 < 0 || (cVar = lrcListView.f109812a.f3909a) == null || cVar.f3912b <= 0) {
            return;
        }
        List<EC0.d> list2 = cVar.f3911a;
        if (list2 != null) {
            ArrayList arrayList = (ArrayList) list2;
            int size = arrayList.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    i7 = size - 1;
                    break;
                } else if (((EC0.d) arrayList.get(i8)).f3916b > j7) {
                    i7 = i8 == 0 ? 0 : i8 - 1;
                } else {
                    i8++;
                }
            }
        } else {
            i7 = -1;
        }
        EC0.a aVar = lrcListView.f109812a;
        if (i7 >= 0) {
            EC0.c cVar2 = aVar.f3909a;
            if (cVar2 != null && (list = cVar2.f3911a) != null && ((ArrayList) list).size() > i7 && !((EC0.d) ((ArrayList) aVar.f3909a.f3911a).get(i7)).f3917c) {
                if (aVar.f3910b < ((ArrayList) aVar.f3909a.f3911a).size()) {
                    ((EC0.d) ((ArrayList) aVar.f3909a.f3911a).get(aVar.f3910b)).f3917c = false;
                }
                ((EC0.d) ((ArrayList) aVar.f3909a.f3911a).get(i7)).f3917c = true;
                aVar.f3910b = i7;
                aVar.notifyDataSetChanged();
            }
        } else {
            aVar.getClass();
        }
        if (i7 == -1 || i7 == lrcListView.getFirstVisiblePosition() || lrcListView.f109813b || lrcListView.f109814c) {
            return;
        }
        lrcListView.setSelection(i7);
    }
}
