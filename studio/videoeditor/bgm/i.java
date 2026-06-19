package com.bilibili.studio.videoeditor.bgm;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bilibili.droid.ToastHelper;
import com.bilibili.netdiagnose.NetDiagnoseActivity;
import com.bilibili.studio.videoeditor.bgm.BgmLocalAdapter;
import com.bilibili.studio.videoeditor.bgm.bgmlist.BgmListActivity;
import com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BgmListLocalDetailSheetFragment;
import com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BgmListLocalFragment;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/i.class */
public final /* synthetic */ class i implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f109080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f109081b;

    public /* synthetic */ i(Object obj, int i7) {
        this.f109080a = i7;
        this.f109081b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CharSequence text;
        switch (this.f109080a) {
            case 0:
                Sg.e eVar = ((BgmLocalAdapter) this.f109081b).f108923i;
                if (eVar != null) {
                    BgmListLocalFragment bgmListLocalFragment = (BgmListLocalFragment) eVar.a;
                    bgmListLocalFragment.getClass();
                    aD0.f.d().a("BgmListLocalFragment showLocalDetailSheet");
                    BgmLocalAdapter bgmLocalAdapter = bgmListLocalFragment.f109008c;
                    if (bgmLocalAdapter != null) {
                        bgmLocalAdapter.N();
                        BgmLocalAdapter.b bVar = bgmListLocalFragment.f109008c.f108921f;
                        bVar.getClass();
                        bVar.f108924a = new WeakReference<>(null);
                        bVar.removeCallbacksAndMessages(null);
                    }
                    BgmListActivity bgmListActivity = bgmListLocalFragment.f109007b;
                    FragmentManager supportFragmentManager = bgmListActivity.getSupportFragmentManager();
                    int i7 = BgmListLocalDetailSheetFragment.f109002j;
                    BgmListLocalDetailSheetFragment bgmListLocalDetailSheetFragment = (BgmListLocalDetailSheetFragment) supportFragmentManager.findFragmentByTag("BgmListLocalDetailSheetFragment");
                    BgmListLocalDetailSheetFragment bgmListLocalDetailSheetFragment2 = bgmListLocalDetailSheetFragment;
                    if (bgmListLocalDetailSheetFragment == null) {
                        bgmListLocalDetailSheetFragment2 = new BgmListLocalDetailSheetFragment();
                    }
                    bgmListActivity.R6(bgmListLocalDetailSheetFragment2, "BgmListLocalDetailSheetFragment");
                }
                break;
            default:
                NetDiagnoseActivity netDiagnoseActivity = (NetDiagnoseActivity) this.f109081b;
                int i8 = NetDiagnoseActivity.f67342M;
                ClipboardManager clipboardManager = (ClipboardManager) netDiagnoseActivity.getSystemService("clipboard");
                TextView textView = (TextView) netDiagnoseActivity.f67344E.getValue();
                clipboardManager.setPrimaryClip(ClipData.newPlainText(null, (textView == null || (text = textView.getText()) == null) ? null : text.toString()));
                ToastHelper.showToastShort(view.getContext(), netDiagnoseActivity.getString(2131831882));
                break;
        }
    }
}
