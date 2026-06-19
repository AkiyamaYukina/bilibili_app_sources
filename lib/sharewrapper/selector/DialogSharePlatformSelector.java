package com.bilibili.lib.sharewrapper.selector;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import com.bilibili.lib.sharewrapper.a;
import com.bilibili.lib.sharewrapper.selector.ISharePlatformSelector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/selector/DialogSharePlatformSelector.class */
public final class DialogSharePlatformSelector implements ISharePlatformSelector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Activity f64441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public a.C0355a f64442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public DialogInterface.OnDismissListener f64443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ShareDialog f64444d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/selector/DialogSharePlatformSelector$ShareDialog.class */
    public static class ShareDialog extends AlertDialog {

        @Nullable
        private SharePlatformPanel mPanel;

        @Nullable
        private ISharePlatformSelector.OnItemClickListener mShareItemClick;
        private ISharePlatformSelector.Style mStyle;
        private String mTitle;

        @Nullable
        private TextView mTitleTv;

        @Nullable
        private List<SharePlatform> platforms;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/selector/DialogSharePlatformSelector$ShareDialog$a.class */
        public final class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ShareDialog f64445a;

            public a(ShareDialog shareDialog) {
                this.f64445a = shareDialog;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
                if (this.f64445a.mShareItemClick != null) {
                    this.f64445a.mShareItemClick.onItemClick((SharePlatform) adapterView.getItemAtPosition(i7));
                }
            }
        }

        private ShareDialog(@NonNull Context context) {
            super(context);
            this.mTitle = "";
            this.mStyle = ISharePlatformSelector.Style.BOTTOM;
        }

        public /* synthetic */ ShareDialog(Context context, int i7) {
            this(context);
        }

        private void resolveUiForStyle(ISharePlatformSelector.Style style) {
            boolean zIsEmpty = TextUtils.isEmpty(this.mTitle);
            TextView textView = this.mTitleTv;
            if (textView != null) {
                textView.setVisibility(!zIsEmpty ? 0 : 8);
            }
            SharePlatformPanel sharePlatformPanel = this.mPanel;
            if (sharePlatformPanel != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sharePlatformPanel.getLayoutParams();
                if (zIsEmpty) {
                    marginLayoutParams.bottomMargin = 0;
                } else {
                    marginLayoutParams.bottomMargin = (int) (getContext().getResources().getDisplayMetrics().density * 10.0f);
                }
            }
        }

        @Override // androidx.appcompat.app.AlertDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            if (this.mShareItemClick == null) {
                dismiss();
                return;
            }
            setContentView(2131496566);
            TextView textView = (TextView) findViewById(2131308958);
            this.mTitleTv = textView;
            textView.setText(this.mTitle);
            this.mPanel = (SharePlatformPanel) findViewById(2131308503);
            if (this.platforms == null) {
                this.platforms = SharePlatform.defaultPlatforms();
            }
            SharePlatformPanel sharePlatformPanel = this.mPanel;
            List<SharePlatform> list = this.platforms;
            if (list == null) {
                sharePlatformPanel.getClass();
            } else {
                ((ArrayList) sharePlatformPanel.f64450a).clear();
                ((ArrayList) sharePlatformPanel.f64450a).addAll(list);
                sharePlatformPanel.f64451b.notifyDataSetChanged();
            }
            this.mPanel.setOnItemClickListener(new a(this));
        }

        @Override // androidx.activity.ComponentDialog, android.app.Dialog
        public void onStart() {
            Window window;
            super.onStart();
            if (this.mStyle == ISharePlatformSelector.Style.BOTTOM && (window = getWindow()) != null) {
                window.setWindowAnimations(2131888862);
                window.setGravity(80);
                window.setLayout(-1, -2);
            }
            resolveUiForStyle(this.mStyle);
        }

        public void setOnItemClickListener(@Nullable ISharePlatformSelector.OnItemClickListener onItemClickListener) {
            this.mShareItemClick = onItemClickListener;
        }

        public void setPlatforms(List<SharePlatform> list) {
            this.platforms = list;
        }

        public void show(String str, ISharePlatformSelector.Style style) {
            this.mTitle = str;
            this.mStyle = style;
            show();
        }
    }

    @Override // com.bilibili.lib.sharewrapper.selector.ISharePlatformSelector
    public final void dismiss() {
        ShareDialog shareDialog = this.f64444d;
        if (shareDialog != null) {
            shareDialog.dismiss();
        }
    }

    @Override // com.bilibili.lib.sharewrapper.selector.ISharePlatformSelector
    public final void release() {
        dismiss();
        this.f64444d = null;
        this.f64441a = null;
        this.f64442b = null;
    }

    @Override // com.bilibili.lib.sharewrapper.selector.ISharePlatformSelector
    public final void show(String str, ISharePlatformSelector.Style style, List<SharePlatform> list) {
        Activity activity = this.f64441a;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        ShareDialog shareDialog = new ShareDialog(this.f64441a, 0);
        this.f64444d = shareDialog;
        shareDialog.setPlatforms(list);
        this.f64444d.setOnItemClickListener(this.f64442b);
        this.f64444d.setOnDismissListener(this.f64443c);
        this.f64444d.show(str, style);
    }
}
