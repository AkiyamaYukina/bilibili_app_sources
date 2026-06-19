package com.bilibili.upper.module.tempalte.dialog;

import II0.j;
import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import com.bilibili.upper.module.tempalte.fragment.VideoTemplateFeedFragment;
import com.bilibili.upper.widget.UpperCircleProgressView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/tempalte/dialog/UpperDownloadProgressDialog.class */
public class UpperDownloadProgressDialog extends DialogFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UpperCircleProgressView f113943b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f113945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f113946e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f113944c = 2131495266;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f113947f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f113948g = new a(this, Looper.getMainLooper());

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/tempalte/dialog/UpperDownloadProgressDialog$a.class */
    public final class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UpperDownloadProgressDialog f113949a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UpperDownloadProgressDialog upperDownloadProgressDialog, Looper looper) {
            super(looper);
            this.f113949a = upperDownloadProgressDialog;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            UpperDownloadProgressDialog upperDownloadProgressDialog = this.f113949a;
            int progress = upperDownloadProgressDialog.f113943b.getProgress();
            upperDownloadProgressDialog.f113943b.setProgress(progress);
            if (progress + 1 < upperDownloadProgressDialog.f113943b.getMax()) {
                upperDownloadProgressDialog.f113948g.sendEmptyMessageDelayed(272, 100L);
            } else {
                upperDownloadProgressDialog.f113948g.removeMessages(272);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/tempalte/dialog/UpperDownloadProgressDialog$b.class */
    public interface b {
        void a(UpperDownloadProgressDialog upperDownloadProgressDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar;
        if (view.getId() != 2131301640 || (bVar = this.f113945d) == null) {
            return;
        }
        this.f113947f = true;
        bVar.a(this);
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.Theme.Translucent);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = LayoutInflater.from(layoutInflater.getContext()).inflate(this.f113944c, viewGroup, false);
        if (viewInflate.getParent() != null) {
            ((ViewGroup) viewInflate.getParent()).removeView(viewInflate);
        }
        return viewInflate;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        j jVar = this.f113946e;
        if (jVar != null) {
            ((VideoTemplateFeedFragment) jVar.f10236a).f113957c = null;
        }
        a aVar = this.f113948g;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f113943b = (UpperCircleProgressView) view.findViewById(2131299721);
        view.findViewById(2131301640).setOnClickListener(this);
        this.f113943b.post(new com.bilibili.upper.module.tempalte.dialog.a(this));
    }
}
