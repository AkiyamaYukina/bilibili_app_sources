package com.bilibili.studio.template.widget;

import By0.C1445c0;
import By0.C1481o0;
import android.R;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import com.bilibili.studio.editor.moudle.editormain.ui.BiliEditorMainActivity;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/template/widget/EditorDownloadProgressDialog.class */
public class EditorDownloadProgressDialog extends DialogFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EditorCircleProgressView f108654b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f108656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1445c0 f108657e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f108655c = 2131493987;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f108658f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f108659g = -1;
    public int h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f108660i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f108661j = new a(this, Looper.getMainLooper());

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/template/widget/EditorDownloadProgressDialog$a.class */
    public final class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EditorDownloadProgressDialog f108662a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EditorDownloadProgressDialog editorDownloadProgressDialog, Looper looper) {
            super(looper);
            this.f108662a = editorDownloadProgressDialog;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            EditorDownloadProgressDialog editorDownloadProgressDialog = this.f108662a;
            int progress = editorDownloadProgressDialog.f108654b.getProgress();
            editorDownloadProgressDialog.f108654b.setProgress(progress);
            if (progress + 1 < editorDownloadProgressDialog.f108654b.getMax()) {
                editorDownloadProgressDialog.f108661j.sendEmptyMessageDelayed(272, 100L);
            } else {
                editorDownloadProgressDialog.f108661j.removeMessages(272);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/template/widget/EditorDownloadProgressDialog$b.class */
    public interface b {
        void a(EditorDownloadProgressDialog editorDownloadProgressDialog);

        void onStart();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar;
        if (view.getId() != 2131301640 || (bVar = this.f108656d) == null) {
            return;
        }
        this.f108658f = true;
        bVar.a(this);
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.Theme.Translucent);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = LayoutInflater.from(layoutInflater.getContext()).inflate(this.f108655c, viewGroup, false);
        if (viewInflate.getParent() != null) {
            ((ViewGroup) viewInflate.getParent()).removeView(viewInflate);
        }
        return viewInflate;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1445c0 c1445c0 = this.f108657e;
        if (c1445c0 != null) {
            BiliEditorMainActivity biliEditorMainActivity = (BiliEditorMainActivity) c1445c0.f1219b;
            C1481o0 c1481o0 = (C1481o0) c1445c0.f1218a;
            if (c1481o0.f1291b != null) {
                c1481o0.b(biliEditorMainActivity);
            }
            c1481o0.f1291b = null;
        }
        a aVar = this.f108661j;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setOnClickListener(this);
        this.f108654b = (EditorCircleProgressView) view.findViewById(2131299720);
        TextView textView = (TextView) view.findViewById(2131314478);
        int i7 = this.f108659g;
        if (i7 != -1) {
            textView.setText(i7);
        }
        view.findViewById(2131301640).setOnClickListener(this);
        if (this.h != -1) {
            this.f108654b.setFlowProgressColor(ContextCompat.getColor(view.getContext(), this.h));
        }
        this.f108654b.post(new com.bilibili.studio.template.widget.a(this));
        if (this.f108660i) {
            Window window = getDialog().getWindow();
            window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#b4000000")));
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.3f;
            window.setAttributes(attributes);
        }
    }
}
